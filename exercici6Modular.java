/*
Hem de realitzar un programa per a ajudar a un cinema a analitzar el número d’entrades venudes. Volen tenir una imatge del mesos en què han venut més de 2000 entrades. D’aquest tipus

* 	*	 _	_	 *	*	 _	*	 *	*  _	*
1 	2	 3	4	 5	6	 7	8	 9	10 11 12

El programa ha d’estar modulat en funcions o mètodes.
En el main disposarem d’una constant ‘NUM_MESOS’ que l’usarem per determinar la mida de l’array que usarem per guardar la venda d’entrades de cada mes. A l’array el nomenarem ‘vendes’.
Al main, també disposarem d’una constant ‘LLINDAR’ que usarem per guardar el número d’entrades mensuals que s’emprarà com a referència (segons l’enunciat 2000).
Des del main cridarem a les funcions en aquest ordre (la declaració i tipus de les variables no està especificada, els noms de les variables sí):
    • cridar a llegirVendes per obtenir els elements del array ‘vendes’.

    • cridar a crearArrayGrafic passant-li variables adients i guardant el resultat en ‘graficAnual’
    • cridar a  imprimirGrafic passant-li ‘graficAnual’ i el primer número que ha d’escriure en la segona línia del gràfic resultat.

A continuació es descriu el que ha de fer cada funció/mètode: 
    • llegirVendes: 
Donat un array de mida M, llegeix M números i els guarda a l’array.
      Per aquest programa cada número llegit significa el número d’entrades venudes en el mes de l’any corresponent (0 per gener).
    • crearArrayGrafic: 
Donat un array, i un número ‘x’, ha de recórrer l’array per comprovar si cada element és major que el número ‘x’. I ha de tornar un array ‘resultat’ els elements del qual només podran ser true o false. L’element de la posició ‘p’ de ‘resultat’ serà:
◦ true si l’element de la posició ‘p’ de l’array donat és major que ‘x’
◦ false en cas contrari
    • imprimirGrafic: 
Donat un array amb elements true o false, i un enter, imprimeix el gràfic del tipus que es mostra a l’inici de l’enunciat.
* @ param authors Samuel Lara, Tudor Constantin
* @ param versió 2.0
*/
public class exercici6Modular {
    public static void main(String[] args) {
        final int LLINDAR = 2000;
        final int NUM_MESOS = 12;
        int[] vendes = new int[NUM_MESOS];
        boolean[] graficAnual = new boolean[NUM_MESOS];

        // cridar a llegirVendes per obtenir els elements del array ‘vendes’.
        System.out.println("Introdueix el valor de les entrades venudes de cada mes: (12 mesos)");
        Teclat.llegirArrayTeclat(vendes, NUM_MESOS);

        // cridar a crearArrayGrafic passant-li variables adients i guardant el resultat
        // en ‘graficAnual’.
        // boolean[] graficAnual = new boolean[NUM_MESOS];
        graficAnual = utilsArrays.crearArrayGrafic6(vendes, NUM_MESOS, LLINDAR);

        // cridar a imprimirGrafic passant-li ‘graficAnual’ i el primer número que ha
        // d’escriure en la segona línia del gràfic resultat.

        Pantalla.imprimirGrafic6(graficAnual, NUM_MESOS, 1);
    }
}
