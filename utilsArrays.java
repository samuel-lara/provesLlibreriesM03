public class utilsArrays {
    /* Moure elements a la dreta */
    public static void moureElementsDreta(int[] vector, int M, int p){
        for(int i = M-1; i > p; i--){
            vector[i] = vector[i-1];
        }
    }

    /* Moure elements a l'esquerra */
    public static void moureElementsEsquerra(int[] vector, int M, int p){
        for (int i = p; i < M - 1; i++){
            vector[i] = vector[i + 1];
        }
    }

    /* Buscar Element */
    /* Tornar posició en la que es troba */
    public static void buscarElement(int[] vector, int M, int e){

    }

    /* Calcular mitjana */
    public static void calcularMitjana(int[] vector, int M, int e){

    }

    /* donada la posició, canviar l'element de p per nou */
    public static void sustitiurElement(int[] vector, int M, int p, int nou){

    }

    /* buscarMinim */
    public static void buscarMinim(int[] vector, int M){

    }

    /* buscarMaxim */
    public static void buscarMaxim(int[] vector, int M){

    }

    /* inserir */
    /* aquesta funció ha de cridar a moure a la dreta */
    public static void inserir(int[] vector, int M){

    }

    /* eliminar */
    /* aquesta funció ha de cridar a moure a l'esquerra */
    public static void eliminar(int[] vector, int M){

    }
}
