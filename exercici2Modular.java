/*
Igual que l’exercici 1, però amb la següent variació:
Realitzar un programa modulat que ens indiqui si donada una seqüència de com a màxim 7 números, i donat un número, el número es troba en la seqüència.

Si es troba ha d’imprimir la primera posició en la que apareix. 
En cas contrari imprimir "No hi és". 


/*
Aquesta variació afecta a la funció llegirArray, que queda així: 
    • llegirArray
Donat un array, llegeix com a màxim 7 números enters i els guarda dins d’ell.
Si troba un -1 para de llegir.
Torna com a resultat el comptatge dels números que ha guardat a l’array.
Per exemple, si l’usuari introdueix
1 2 3 4 -1
Guarda a l’array {1, 2, 3, 4} i torna com a resultat 4
Vigileu en la crida a aquesta funció i en totes les implicacions que pot tenir: variables del main a utilitzar, número de paràmetres a passar a les funcions.
* @ param authors Samuel Lara, Tudor Constantin
* @ param versió 2.0
*/

public class exercici2Modular {
    public static void main(String[] args) {
        final int N_NUMEROS = 7;
        int[] myArray = new int[N_NUMEROS];

        // Cridar funció llegirArray2
        System.out.println("Introdueix " + N_NUMEROS + " valors: ");
        int llegir;
        llegir = Teclat.llegirArray2(myArray, N_NUMEROS);
        System.out.println("Impressio: " + llegir);

        // Cridar funcio llegirBuscat
        System.out.println("Introdueix numero buscat: ");
        int numeroBuscat;
        numeroBuscat = Teclat.llegirNumeroABuscar();

        // BuscarCoincidencia
        int coincidencia;
        coincidencia = utilsArrays.buscarCoincidencia(myArray, N_NUMEROS, numeroBuscat);

        // ImprimirMissatgeFinal
        Pantalla.imprimirMissatgeFinal(coincidencia);
    }

}
