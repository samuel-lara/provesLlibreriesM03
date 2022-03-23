public class Pantalla {
  public static void imprimirArray(int[] vector, int n) {
    for (int i = 0; i < n; i++) {
      System.out.println(vector[i]);
    }
  }

  /* FUNCIONS AGREGADES */

  // Exercici 1
  /* imprimirMissatgeFinal */
  public static int imprimirMissatgeFinal(int numero) {

    if (numero == -1) {
      System.out.println("No hi ha coincidencia");
    } else {
      System.out.println("S'ha trobat a la posicio " + numero);
    }
    return numero;
  }

  /* EXERCICI 3 */
  /*
   * imprimirMissatgeFinal:
   * Donats un array ‘a’ i un enter ‘p’, imprimeix el missatge:
   * El mínim es troba a la posició ‘p’ i té un valor de ‘a[p]’
   * 
   * @param a és un vector
   * 
   * @param p és la posició a on es troba el número menor
   */
  public static void imprimirMissatgeFinal3(double[] a, int p) {
    System.out.println("El minim es troba a la posicio " + p + " i te un valor de " + a[p]);
  }
}