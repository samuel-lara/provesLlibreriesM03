/*
Enunciat Chapter 1
Hem de realitzar un programa modulat que ens indiqui si donat un array, i donat un número, el número es troba a l’array. Si es troba ha d’imprimir la primera posició en la que apareix. En cas contrari imprimir "No hi és". El programa ha de realitzar diferents tasques. Cada tasca s'implementarà en una funció. Les tasques s'han de realitzar en el següent ordre:

-llegirArray: Llegir 7 números i guardar-los en un array. 
-llegirBuscat: Ha de llegir el número a buscar.
-buscarCoincidencia: ha de buscar un número donat dins d'un array donat. Si el troba ha de retornar la posició en què l'ha trobat. Si no el 
 troba ha de retornar -1.
-imprimirMissatgeFinal: si la cridem amb l'argument -1  ha d'imprimir el missatge «No hi és» si a la funció li passem qualsevol altre 
 número enter, ha d'imprimir el missatge «S’ha trobat a la posició x» (Essent x el número passat a la funció)
* @ param authors Samuel Lara, Tudor Constantin
* @ param versió 2.0
*/

public class exercici1Modular {
    public static void main(String[] args) {
        final int LLARGADA = 7;
        int[] myArray = new int[LLARGADA];

        // Cridar funcio llegirArrayTeclat
        Teclat.llegirArrayTeclat(myArray, LLARGADA);

        // Cridar funcio llegirNumeroABuscar
        // busca el número manualment, no per teclat (Scanner)
        int numeroBuscat;
        numeroBuscat = Teclat.llegirNumeroABuscar();

        // buscarCoincidencia
        int coincidencia;
        coincidencia = utilsArrays.buscarCoincidencia(myArray, LLARGADA, numeroBuscat);

        // ImprimirMissatgeFinal
        Pantalla.imprimirMissatgeFinal(coincidencia);

    }
}
