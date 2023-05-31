package com.itachallenge.challenge.helpers.team;

import java.io.IOException;

/*
Estado: en PR

Responsabilidad:
Un objeto de esta clase "apunta" a un resource (asociado a el en atributo)
Los métodos sirven para poder "manipular/transformar" el resource.

Porqué:
A) Para facilitar y no duplicar código cuando haya que proporcionar objetos
 (almacenados en un .json dentor de resources de /test/...) que sean la respuesta
 de un método mockeado.
B) Necesario para la funcionalidad GET data dummy
 */
public interface ResourceHelperTeam {

    /*
    Constructor:
    Estado: en PR
    Se le tiene que pasar el path relativo del resource
        ej: String path = "/json/myResource.json"
     */

    /*
    Estado: en PR
    QUÉ:  lee el resource y lo devuelve en formato String
     */
    String readResourceAsString ()  throws IOException;

    /*
    Estado: en PR
    QUÉ: lee el resource y lo mapea a un objeto de la clase indicada
    IMPORTANTE:
        tambien accepta que se quiere un array (ej: MyClass[].class)
        NO FUNCIONA si el target class es genérico (ej: List<MyClass>.class)
     */
    <T> T mapResourceToObject(Class<T> targetClass) throws IOException;

    //En breves: método que devuelve el resource como una List del target class
}
