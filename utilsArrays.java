public class utilsArrays {
    /* Moure elements a la dreta */
    public static void moureElementsDreta(int[] vector, int M, int p) {
        for (int i = M - 1; i > p; i--) {
            vector[i] = vector[i - 1];
        }
    }

    /* Moure elements a l'esquerra */
    public static void moureElementsEsquerra(int[] vector, int M, int p) {
        for (int i = p; i < M - 1; i++) {
            vector[i] = vector[i + 1];
        }
    }

    /* Buscar Element */
    /* Tornar posició en la que es troba */
    public static void buscarElement(int[] vector, int M, int e) {
        for (int i = 0; i < M; i++) {
            if (e == vector[i]) {
                System.out.println("Posició: " + i);
                break;
            }
        }
    }

    /* Calcular mitjana */
    public static void calcularMitjana(int[] vector, int M, int e) {
        int sumaMitjana = 0;
        for (int i = 0; i < M; i++) {
            vector[i] = e;
            sumaMitjana += vector[i];
        }

        int resultatMitjana = sumaMitjana / M;
    }

    /* donada la posició, canviar l'element de p per nou */
    public static void sustitiurElement(int[] vector, int M, int p, int nou) {
        for (int i = 0; i < M - 1; i++) {
            if (i == p) {
                vector[i] = nou;
            }
        }
    }

    /* buscarMinim */
    public static int buscarMinim(int[] vector, int M) {
        int minim = 0;
        for (int i = 1; i < M; i++) {
            if (vector[i] < vector[minim]) {
                minim = i;
            }
        }
        return minim;
    }

    /* buscarMaxim */
    public static int buscarMaxim(int[] vector, int M) {
        int maxim = 0;
        for (int i = 1; i > M; i++) {
            if (vector[i] > vector[maxim]) {
                maxim = i;
            }
        }
        return maxim;
    }

    /* inserir */
    /* aquesta funció ha de cridar a moure a la dreta */
    public static void inserir(int[] vector, int M, int p) {
        for (int i = M - 1; i > p; i--) {
            vector[i] = vector[i - 1];
        }
        M++;
    }

    /* eliminar */
    /* aquesta funció ha de cridar a moure a l'esquerra */
    public static void eliminar(int[] vector, int M, int p) {
        for (int i = p; i < M - 1; i++) {
            vector[i] = vector[i + 1];
        }
        M--;
    }

    /* FUNCIONS AGREGADES */

    /*
     * buscarCoincidencia: ha de buscar un número donat dins d'un array donat
     * Exercici 1 i 2
     */
    public static int buscarCoincidencia(int[] vector, int n, int numero) {
        for (int i = 0; i < n; i++) {
            if (vector[i] == numero) {
                return i;
            }
        }
        return -1;
    }

    /* EXERCICI 3 */
    /*
     * buscarMinim:
     * Donat un array de números reals, busca la posició on es troba el valor mínim,
     * i retorna aquesta posició.
     * 
     * @param vector
     * 
     * @param M mida de l'array
     * 
     * @return la posició del número buscat
     */
    public static int buscarMinim3(double[] vector, int M) {
        int minim = 0;
        for (int i = 1; i < M; i++) {
            if (vector[i] < vector[minim]) {
                minim = i;
            }
        }
        return minim;
    }

}
