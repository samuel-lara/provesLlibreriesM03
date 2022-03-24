/* Exercici 5. Comptatge d’elements d’un array segons una condició 
---
Hem de realitzar un programa per a calcular el número d’aprovats i el percentatge que suposa aquest número
sobre el total d’alumnes d’una classe, que són 20. Com que les notes poden ser sobre 4, 10 o 100, el programa
preguntarà quina nota es considera aprovat.
El programa ha d’estar modulat en funcions o mètodes.
En el main disposarem d’una constant ‘NUM_ALUMNES’ que l’usarem per determinar la mida de l’array que
usarem per guardar les notes de l’alumnat. A l’array el nomenarem ‘notes’
Des del main cridarem a les funcions en aquest ordre (la declaració i tipus de les variables no està especificada,
els noms de les variables sí):

• cridar a llegirAprovat i guardar el resultat en ‘notaAprovat’.

• cridar a llegirNotes per obtenir els elements del array ‘notes’.

• cridar a comptarAprovats passant-li ‘notes’ i guardant el resultat en ‘numAprovats’

• cridar a percentatgeAprovats passant-li ‘NUM_ALUMNES’ i ‘ numAprovats’ i guardant el resultat en ‘
percentatgeAprovats’

• cridar a imprimirMissatgeFinal passant-li el número d’aprovats i el percentatge d’aprovats.
A continuació es descriu el que ha de fer cada funció/mètode:

• llegirAprovat:
Llegeix des del teclat un número, i el torna com a resultat.
El número serà la nota considerada aprovat, segons l’enunciat només pot ser 2, 5 o 50. Cal fer la
comprovació: Mentre el número no sigui cap dels 3 possibles, haurà d’informar i tornar a demanar un
número).

• llegirNotes:
Donat un array de mida M, llegeix M números reals i els guarda a l’array.
Per aquest programa cada número significa la nota, en dos decimals, obtinguda per un alumne. El
primer alumne, és el 0, el segon l’1.. El programa no farà la comprovació de número de decimals
introduïts.

• comptarAprovats:
Donat un array de números, i un número, ha de comptar quants números de l’array son majors o iguals al
número donat i tornar aquest comptatge.
Per aquest programa l’array contindrà notes d’alumnes, el número la nota que es considera aprovat.

• calcularPercentatge:
Donats dos números ‘a’ i ‘b’, torna el percentatge que suposa ‘a’ sobre un total de ‘b’ (a*100/b).

• imprimirMissatgeFinal:
◦ Donats dos números, que signifiquen:
▪ El primer número significa la quantitat d’alumnes que han aprovat.
▪ El segon número, el percentatge d’alumnes aprovats sobre el total d’alumnes.
◦ Segons els percentatge d’aprovats passat, imprimirà un missatge diferent:
▪ Si és igual al 100%, ha d’imprimir 'Fantàstic heu aprovat tots!'
Si no és el 100%, ha d’imprimir 'Enhorabona als <tants> que heu aprovat. Els que no ho heu
aconseguit, si us plau, exposeu a la professora quins han sigut els motius i quina planificació us
heu fet per a aconseguir-ho' (Heu d’identificar en quina variable tenim: <tants>)
* @ param authors Samuel Lara, Tudor Constantin
* @ param versió 2.0
*/
public class exercici5Modular {
    public static void main(String[] args) {
        final int NUM_ALUMNES = 20;
        int[] notes = new int[NUM_ALUMNES];

        // cridar a llegirAprovat i guardar el resultat en ‘notaAprovat’.
        System.out.println("Escriviu la nota per a aprovar:");
        int notaAprovat = 0;
        notaAprovat = Teclat.llegirNumeroABuscar();

        // cridar a llegirNotes per obtenir els elements del array ‘notes’
        System.out.println("Introdueix 20 notes de 20 alumnes:");
        Teclat.llegirArrayTeclat(notes, NUM_ALUMNES);

        // cridar a comptarAprovats passant-li ‘notes’ i guardant el resultat en
        // ‘numAprovats’
        int numAprovats = 0;
        numAprovats = utilsArrays.comptarAprovats5(notes, notaAprovat);

        // cridar a percentatgeAprovats passant-li ‘NUM_ALUMNES’ i ‘ numAprovats’ i
        // guardant el resultat en ‘ percentatgeAprovats’
        int percentatgeAprovats;
        percentatgeAprovats = utilsArrays.calcularPercentatge5(NUM_ALUMNES, numAprovats);

        // cridar a imprimirMissatgeFinal passant-li el número d’aprovats i el
        // percentatge d’aprovats.
        Pantalla.imprimirMissatgeFinal5(numAprovats, percentatgeAprovats);
    }
}