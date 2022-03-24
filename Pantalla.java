public class Pantalla {
  public static void imprimirArray(int[] vector, int n) {
    for (int i = 0; i < n; i++) {
      System.out.println(vector[i]);
    }
  }

  /* FUNCIONS AGREGADES */

  /*------------------------------------------Exercici 1 I 2--------------------------------*/
  /* imprimirMissatgeFinal */
  public static int imprimirMissatgeFinal(int numero) {

    if (numero == -1) {
      System.out.println("No hi ha coincidencia");
    } else {
      System.out.println("S'ha trobat a la posicio " + numero);
    }
    return numero;
  }

  /*---------------------------------EXERCICI 3------------------------------------ */
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

  /*---------------------------------EXERCICI 4------------------------------------ */

  /*
   * imprimirMissatge:
   * Donats dos números i un booleà. Que signifiquen:
   * ▪ El primer número significa el identificador del producte amb ingressos
   * mínims.
   * ▪ El segon número els ingressos totals obtinguts per la venda d’aquest
   * producte.
   * ▪ El booleà serà veritat si s’ha de canviar el producte. Segons el booleà
   * passat, imprimirà un missatge diferent:
   * ▪ Si és cert ha d’imprimir “Cal canviar el producte <tal> del qual només hem
   * ingressat <tants> euros(ho d’identificar entre els números donats a la
   * funció quin és <tal> i quin és <tants>)
   * ▪ Si és fals, ha d’imprimir No cal canviar cap producte
   * 
   * @param a identificador producte amb ingressos minims
   * 
   * @param b ingressos totals obtinguts per la venda d’aquest producte
   * 
   * @param serà veritat si s’ha de canviar el producte
   */

  public static void imprimirMissatgeFinal4(int a, int b, boolean c) {

    if (c = true) {
      System.out.println("Cal canviar el producte " + (a + 1) + " del qual nomEs hem ingressat " + b + " euros");
    } else {
      System.out.println("No cal canviar cap producte");

    }
  }

  /*---------------------------------EXERCICI 5------------------------------------ */
  /*
   * imprimirMissatgeFinal:
   * Donats dos números, que signifiquen:
   * El primer número significa la quantitat d’alumnes que han aprovat.
   * El segon número, el percentatge d’alumnes aprovats sobre el total d’alumnes.
   * Segons els percentatge d’aprovats passat, imprimirà un missatge diferent:
   * Si és igual al 100%, ha d’imprimir 'Fantàstic heu aprovat tots!'
   * Si no és el 100%, ha d’imprimir 'Enhorabona als <tants> que heu aprovat. Els
   * que no ho heu aconseguit, si us plau, exposeu a la professora quins han sigut
   * els motius i quina planificació us heu fet per a aconseguir-ho' (Heu
   * d’identificar en quina variable tenim: <tants>)
   */

  public static void imprimirMissatgeFinal5(int a, int b) {
    if (b == 100) {
      System.out.println("Fantàstic heu aprovat tots!");
    } else {
      System.out.println("Enhorabona als " + a
          + " que heu aprovat. Els que no ho heu aconseguit, si us plau, exposeu a la professora quins han sigut els motius i quina planificació us heu fet per a aconseguir-ho");
    }
  }

  /*---------------------------------EXERCICI 6------------------------------------ */
  /*
   * imprimirGrafic:
   * Donat un array amb elements true o false, i un
   * enter, imprimeix el gràfic del tipus que es mostra
   * a l’inici de l’enunciat.
   * 
   * @param vector de Strings
   */
  public static void imprimirGrafic6(boolean[] vector, int n, int primer) {

    String impressio = "";
    for (int i = 0; i < n; i++) {
      if (vector[i])
        impressio = impressio + "* ";
      else
        impressio = impressio + "_ ";
    }
    System.out.println(impressio + " ");

    // Mesos
    for (int i = primer; i < (primer + n); i++) {
      System.out.print(i + " ");
    }
  }
}