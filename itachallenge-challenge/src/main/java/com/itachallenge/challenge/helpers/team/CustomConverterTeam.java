package com.itachallenge.challenge.helpers.team;

import com.itachallenge.challenge.documents.dummies.ChallengeDummy;
import com.itachallenge.challenge.dtos.dummies.ChallengeDtoDummy;
import com.itachallenge.challenge.helpers.dummies.StarterConverterDummy;
import reactor.core.publisher.Flux;

/*
Estado: doing

Responsabilidad:
Realizar cualquier conversion dto <-> document

El dummy implementa tanto los interfaces StarterConverter como las XConverter

Importante: los clientes SOLO deben inciar/solicitar la conversión pidiendoselo al StarterConverter
Ningún cliente debe tener como import un CustomConverter
 */

//visibilidad solo a nivel de paquete
interface CustomConverterTeam {
    //extends StarterConverterTeam, ChallengeDocConverterTeam{

    //no args constructor con visibilidad NO pública

    //solo tiene como métodos públicos los que tenga que implementar de las interfaces
}


//ejemplo de uso:
class DemoService {

    //@Autowired
    StarterConverterDummy converter;

    /*
    demo:
     dado un challenge document + su porcentaje y popularidad
     convertir la data a un challenge dto de salida, con solo los datos
     relativos a la información básica del challenge (+ el id)
     */
    public void someMethod(){
        ChallengeDummy challenge = null; //obtenido de donde sea (ej: DB)

        Float percentage = 0.3f; //obtenido de donde sea (ej: otro micro service)

        Integer popularity = 1; //obtenido de donde sea (ej: otro micro service)

        //conversión directa:
        ChallengeDtoDummy challengeDto = converter.from(challenge)
                .toChallengeDtoWithOnlyBasicInfo(percentage,popularity);

        //o en caso de reactivo:
        Flux<ChallengeDummy> challengeFlux = null; //obtenido de donde sea (ej: DB)

        Flux<ChallengeDtoDummy> challengeDtoFlux = challengeFlux
                .map(challengeDoc -> converter.from(challengeDoc)
                        .toChallengeDtoWithOnlyBasicInfo(percentage,popularity));
    }
}

/*
Por si alguien quiere que le justifique el diseño:
(he tardado más en escribir esto que en codificar las clases y los test. Espero que le sirva a
alguien y se anime a ver los videos de la lista).

Y por que este diseño?
No es más fácil/simple una clase con un(os) método(s) rollo:
    ChallengeDto convertToOnlyBasicInfo(challenge, percentage, popularity) ???
Si lo único que hay que hacer son gets y sets! O por constructor! O tirar del builder!

La verdad es que se me ocurre algo aún más simple:
Permitir que los dtos tengan una dependencia hacia los documents.
A nivel de arquitectura no es un problema:
No hay ciclos entre clases y paquetes.
Hay varias arquitecturas en que algunas vistas (en el caso de una APIRest: los dtos)
son dependientes del modelo que presentan (los documents).
Así que lo más fácil sería que los dtos tubieran constructores "on demand", en los cuales
se les pasara los documents. Así, en el constructor, solo habría que hacer gets y guardar
los valores como atributos.
Pero la tarea es hacer un converter:
Y entonces hay un problema: qué atributos tendría esta clase? Con lo que se le pasa por
parámetros el método ya funcionaría -> el método no necesita trabajar/usar ningún atributo.

Y que problema hay? Que la clase no tenga atributos y listos!

Entonces... todos los posibles objetos de esa clase serían iguales...
En la práctica no implicaría ninguna diferencia entre un método static y uno no static.
Mira los Helpers de BussinessAssistant, la mayoría no tienen atributos -> a veces los
métodos son static, a veces no... a veces se inyecta el objeto en el service, pero no se
usa porque el método es static (wtf)...
Conclusión: si una clase no tiene atributos, lo que pasa es que tienes un(os) método(s) que
quieres usar, pero no importa en qué clase ponerlos. Lo que te importaría de la clase son
 las acciones, y no el estado del objeto.
 Y, si quisiera, los métodos los podría poner en el controller, o en el proxy, o donde me diera la gana,
 y funcionarían igualmente.
 Incluso podría hacer una @FuntionalInterface por cada método y tirar millas...
Hacerlo así tiene un nombre: Antipatrón "Descomposición Funcional" (Functional Descomposition).
https://www.youtube.com/watch?v=T_qgY7XNF6k&list=PLj2IVmcP-_QNVN3PM5a7B6A5lVmQc_Sqg&index=14&t=2816s
Que tal si pensamos acerca de los objetos de esta clase?
Qué hace un converter? Convertir un objeto.
Con qué trabaja un converter? Que objeto manipulan sus métodos? Como mínimo con el objeto a convertir.
Cual es entonces un atributo? El objeto a convertir.

Vaaaaaleeeee...que tenga el objeto a convertir como atributo....
Pues que lo guarde por constructor...o se hace set antes de llamar al método que lo convierte...
Pero que necesidad hay de las interfaces? Si solo con la clase ya tiramos!

Correcto, pero hay un problema. A priori esta clase tiene que ser capaz de convertir cualquier
documento a cualquier dto, y viceversa. Así que tendrá que tener tantos atributos como "tipos de
objetos a convertir" que necesitemos (y si la clase termina siendo demasiado grande o con demasiados
atributos o pierde la cohesión -> ya se arreglará cuando se de el caso).
Así que necesitará N sets, o N constructores con visibilidad public.
Enconces, hipoteticamente, sería posible que, des de un service, se hiciera set(SolutionDto)
y a continuación llamar convertToLanguageDoc (podría setear X y luego pedir la conversión a un
método que no tubiera que usar ese atributo).

jajajaja, vamos... para eso se tendría que ser muy tonto...

Pues solo se necesita un momento de despiste, y luego ponte tu a buscar donde está el error...
Además, de alguna manera se estaría incumpliendo el Principio de Ocultación de Información: si
no lo necesita -> no debería tener acceso a ello.
En este caso el servicio si que debería tener acceso a convertXToY, pero SOLO si antes se ha
hecho setX. En caso contrario NO debería tener acceso.
Lo ideal sería que si un objeto X quiere invocar un método de un objeto Y, solo tubiera acceso
(poder invocar métodos) a los que necesita + puede invocarlos sin mideo ni problemas.

...

Una posible solución sería hacer un converter distinto por cada tipo de objeto a convertir (un
solo atributo + un solo set + todos los métodos convierten ese objeto a algo).
Pero entonces habría varios problemas:
1) N converters (tantos como objetos a convertir) -> más clases -> más complejo
2) N converters usados en el service -> excesivas dependencias -> habría que aplicar algún patrón
para arreglar eso (una facade, una factoría...) -> más complejo
3) Seguramente habría codigo duplicado en los converters-> habría que montar alguna estructura
de herencia para arreglarlo -> más clases -> más complejo

Otra opción (esta) es aplicar el Principio de Separación de Interfaces (la I de los principios
SOLID), pero considerando el service (el cliente) como si fueran 2 clientes distintos (al principio
es A, y luego es B).
'A' es un cliente al que solo le quiero dar acceso a poder indicar qué objeto convertir (los seters,
que en este caso son los .from), y luego, en función de cual haya elegido, es un cliente 'B' al que hay
que darle acceso SOLO a los métodos toX que funcionan bién con el objeto a convertir.
https://www.youtube.com/watch?v=_RlvozCuKp4&list=PLj2IVmcP-_QNVN3PM5a7B6A5lVmQc_Sqg&index=13
Una buena metáfora sería:
Tengo un cocinero que puede/sabe cocinar un montón de platos.
Pero yo, como dueño del restaurante, eligo qué primeros se pueden pedir hoy.
Y, si quisiera, puedo ofrecer un menú de primeros distinto a cada cliente.
Y, según qué primero pida el cliente, le ofrezco un ménu de segundos u otro
(e incluso podría variar según el cliente).

Y, tiene varias ventajas:
Muy flexible y adaptable. Se puede extender la funcionalidad "bajo demanda", sin que afecte lo ya codificado.
Aunque haya N interfaces, no hay que picar codigo extra ni hay que hacer tests para ellas.
    *Excepto cuando añadamos ("on demand") un nuevo tipo a convertir (nuevo .from),
     o un nuevo tipo destino (nuevo .toX)
su uso en el service es simple, intuitivo y a prueba de tontos o despistes.
Los tests de la clase converter son sencillos.
 */
