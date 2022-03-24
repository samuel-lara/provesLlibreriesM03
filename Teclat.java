import java.util.Scanner;

public class Teclat {
    /* llegir array buscat per teclat */
    public static void llegirArrayTeclat(int[] vector, int M) {
        Scanner teclat = new Scanner(System.in);
        for (int i = 0; i < M; i++) {
            vector[i] = teclat.nextInt();
        }
        teclat.close();
    }

    /* imprimir missatge passat per teclat */
    public static void imprimirMissatge() {
        Scanner teclat = new Scanner(System.in);
        System.out.println(teclat.next());
        int numero = teclat.nextInt();
        teclat.close();
    }

    /*
     * una altra variant és la de mentres hi hagui numeros per llegir que llegeixi
     */

    public static void mentresHiHaguiNumeros(int M) {
        Scanner teclat = new Scanner(System.in);
        for (int i = 0; i < M && teclat.hasNext(); i++) {
            teclat.nextInt();
        }
        teclat.close();
    }

    /*
     * ----------------------------------------------Exercici 1 i
     * 2, 4,
     * 5-----------------------------------------------------------------------
     */

    /* llegir numero a Buscar sense tornar posició Exercici 1 */
    public static int llegirNumeroABuscar() {
        Scanner teclat = new Scanner(System.in);
        int numero = teclat.nextInt();
        teclat.close();
        return numero;
    }

    /*
     * llegirArray2:
     * Donat un array, llegeix com a màxim 7 números enters i els guarda dins d’ell.
     * Si troba un -1 para de llegir.
     * Torna com a resultat el comptatge dels números que ha guardat a l’array.
     * Per exemple, si l’usuari introdueix
     * 1 2 3 4 -1
     * Guarda a l’array {1, 2, 3, 4} i torna com a resultat 4
     * 
     * @param vector
     * 
     * @param n és llargària de l'array
     */
    public static int llegirArray2(int[] vector, int n) {
        Scanner teclat = new Scanner(System.in);
        int numero = 0;
        for (int i = 0; i < n; i++) {
            vector[i] = teclat.nextInt();
            numero++;
            if (vector[i] == -1) {
                return numero - 1;
            }
            teclat.close();
        }
        return numero;
    }

    /*------------------------------------------------------------EXERCICI 3--------------------------------------------------------------------- */
    /*
     * llegirArray:
     * Donat un array de mida M, llegeix M números reals i els guarda a l’array.
     * 
     * @param vector
     * 
     * @param M mida de l'array
     */
    public static void llegirArrayTeclat3(double[] vector, int M) {
        Scanner teclat = new Scanner(System.in);
        for (int i = 0; i < M; i++) {
            vector[i] = teclat.nextDouble();
        }
        teclat.close();
    }

}
