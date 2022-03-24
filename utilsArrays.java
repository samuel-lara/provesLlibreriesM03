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

    /*------------------------------------- EXERCICI 1 i 2-------------------------------- */
    /*
     * buscarCoincidencia:
     * 
     * ha de
     * buscar un
     * número donat dins d'un array donat*Exercici 1 i 2
     */

    public static int buscarCoincidencia(int[] vector, int n, int numero) {
        for (int i = 0; i < n; i++) {
            if (vector[i] == numero) {
                return i;
            }
        }
        return -1;
    }

    /*--------------------------------------- EXERCICI 3---------------------------------- */
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

    /*------------------------------ EXERCICI 4--------------------------------------- */
    /*
     * buscarMinimValor: (funcio que guarda el valor de la posició)
     * Donat un array de números reals, busca la posició on es troba el valor mínim,
     * i retorna el valor d'aquesta posició.
     * 
     * @param vector
     * 
     * @param M és la llargària del vector
     */
    public static int buscarMinimValor4(int[] vector, int M) {
        int valorMinim = 0;
        for (int i = 0; i < M; i++) {
            if (vector[i] < vector[0]) {
                valorMinim = vector[i];
            }
        }
        return valorMinim;
    }

    /*
     * comprovarMinim:
     * Donats un número ‘a’ i un número ‘b’ torna true si ‘a’ és menor que ‘b’,
     * torna false en cas contrari.
     * La utilitzarem per comprovar si el mínim d’ingressos és menor que X
     * 
     * @param int a per a comparar
     * 
     * @param int b per a comparar
     */
    public static boolean comprovarMinim4(int a, int b) {
        boolean resultat = true;
        if (a < b) {
            return resultat;
        } else {
            resultat = false;
            return resultat;
        }
    }

    /*------------------------------ EXERCICI 5--------------------------------------- */
    /*
     * comptarAprovats:
     * Donat un array de números, i un número, ha de comptar quants números de
     * l’array son majors o iguals al número donat i tornar aquest comptatge.
     * Per aquest programa l’array contindrà notes d’alumnes, el número la nota que
     * es considera aprovat.
     * 
     * @param vector
     * 
     * @param n es igual a numero donat
     */

    public static int comptarAprovats5(int[] vector, int n) {
        int comptador = 0;

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] >= n)
                comptador++;
        }
        return comptador;
    }

    /*
     * calcularPercentatge:
     * Donats dos números ‘a’ i ‘b’, torna el percentatge que suposa ‘a’ sobre un
     * total de ‘b’ (b*100/a).
     * 
     * @param b és el nombre d'alumnes.
     * 
     * @param a és el nombre d'aprovats.
     */
    public static int calcularPercentatge5(int a, int b) {
        int percentatge = (b * 100) / a;
        return percentatge;
    }

    /*------------------------------ EXERCICI 6 --------------------------------------- */
    /*
     * crearArrayGrafic:
     * Donat un array (vector), i un número ‘x’, ha de recórrer l’array per
     * comprovar si cada element.
     * és major que el número ‘x’. I ha de tornar un array ‘resultat’ els elements
     * del qual
     * només podran ser true o false.
     * L’element de la posició ‘p’ de ‘resultat’ serà:
     * true si l’element de la posició ‘p’ de l’array donat és major que ‘x’.
     * false en cas contrari.
     * 
     * @param x és el LLINDAR
     * 
     * @param M index de l'array
     * 
     * @param vector
     */

    public static boolean[] crearArrayGrafic6(int[] vector, int M, int x) {

        boolean p[] = new boolean[M];

        for (int i = 0; i < M; i++) {
            p[i] = vector[i] > x;
        }
        return p;
    }
}
