/*
Hem de realitzar un programa que busqui la posició en què es troba l’element amb el valor mínim d’un array.
El programa ha d’estar modulat en funcions o mètodes.
En el main disposarem d’una constant ‘NUM_ELEMENTS que l’usarem per determinar la mida d’un array.
Des del main cridarem a les funcions en aquest ordre (la declaració i tipus de les variables no està especificada, els noms de les variables sí):
      
    • cridar a llegirArray passant-li ‘elMeuArray’.
      
    • cridar a buscarMinim passant-li ‘elMeuArray’ i guardant el resultat en             ‘posMinim’.

    • cridar a imprimirMissatgeFinal passant-li ‘elMeuArray’ i  ‘posMinim’

A continuació es descriu el que ha de fer cada funció/mètode: 
    • llegirArray: 
Donat un array de mida M, llegeix M números reals i els guarda a l’array.
    • buscarMinim: 
Donat un array de números reals, busca la posició on es troba el valor mínim, i retorna aquesta posició. (Per exemple si li passem {700.34, 300.20, 600.75} tornarà 1)
    • imprimirMissatgeFinal: 
Donats un array ‘a’ i un enter ‘p’, imprimeix el missatge:
El mínim es troba a la posició ‘p’ i té un valor de ‘a[p]’ 
* @ param authors Samuel Lara, Tudor Constantin
* @ param versió 2.0
*/

public class exercici3Modular {
    public static void main(String[] args) {
        final int NUM_ELEMENTS = 12;
        double[] myArray = new double[NUM_ELEMENTS];

        /* cridar a llegirArray */
        Teclat.llegirArrayTeclat3(myArray, NUM_ELEMENTS);

        /* cridar a buscarMinim */
        int posMinim;
        posMinim = utilsArrays.buscarMinim3(myArray, NUM_ELEMENTS);

        /* cridar a imprimirMissatgeFinal */
        Pantalla.imprimirMissatgeFinal3(myArray, posMinim);
    }
}