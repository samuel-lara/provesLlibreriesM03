/*
Convé que abans de fer aquest exercici, realitzeu l’exercici anterior

Hem de realitzar un programa que s’utilitzarà per renovar els productes d’una màquina de refrescos. Els propietaris de la màquina, han decidit renovar els productes mensualment. Cada mes registraran els ingressos obtinguts de 10 productes. Del 0 al 9. Al final del mes, canviaran el producte menys venut, només en cas que doni uns ingressos menors de X €. La X la decidiran cada mes.
El programa ha d’estar modulat en funcions o mètodes.
En el main disposarem d’una constant ‘NUM_PRODUCTES’ que l’usarem per determinar la mida de l’array que usarem per guardar els ingressos rebuts de cada producte. A l’array el nomenarem ‘ingressos’
Des del main cridarem a les funcions en aquest ordre (la declaració i tipus de les variables no està especificada, els noms de les variables sí):
      
    • cridar a llegirIngressos passant-li ‘ingressos’.
      
    • cridar a llegirX i guardar el resultat en ‘llindar’ (‘llindar’ s’usa per a guardar el valor de la X de l’enunciat).
      
    • cridar a buscarMinim passant-li ‘ingressos’ i guardant el resultat en ‘posMinim’.
      
    • cridar a comprovarMinim passant-li el valor mínim que conté ‘ingressos’ i el valor de ‘llindar’, i guardant el resultat en ‘esMenorQueX’

    • cridar a  imprimirMissatgeFinal passant-li el identificador del producte amb menys ingressos, els ingressos obtinguts per la seva venda i el resultat de la comparació entre aquest ingressos i el ‘llindar’ (fixeu-vos que heu d’identificar els arguments, ja que no s’ha facilitat el nom exacte de les variables, sinó el significat dels valors que volem passar a la funció)
      
A continuació es descriu el que ha de fer cada funció/mètode: 
    • llegirIngressos: 
Donat un array de mida M, llegeix M números reals i els guarda a l’array.
Per a aquest programa, cada número guardat significarà la quantitat d’euros obtinguts per la venda d’un producte. (El primer producte, és el 0, el segon l’1…. No hi haurà coincidències entre ingressos per 2 productes diferents. No cal que feu la comprovació, assumim que serà així)
    • llegirX: 
Llegeix un número real des de l’entrada i el retorna com a resultat.
    • buscarMinim: 
Donat un array de números reals, busca la posició on es troba el valor mínim, i retorna aquesta posició. (Per exemple si li passem {700.34, 300.20, 600.75} tornarà 1)
    • comprovarMinim: 
Donats un número ‘a’ i un número ‘b’ torna true si ‘a’ és menor que ‘b’, torna false en cas contrari. 
La utilitzarem per comprovar si el mínim d’ingressos és menor que X
    • imprimirMissatge: 
        ◦ Donats dos números i un booleà. Que signifiquen:
            ▪ El primer número significa el identificador del producte amb ingressos mínims.
            ▪ El segon número els ingressos totals obtinguts per la venda d’aquest producte.
            ▪ El booleà serà veritat si s’ha de canviar el producte.
        ◦ Segons el booleà passat, imprimirà un missatge diferent:
            ▪ Si és cert ha d’imprimir Cal canviar el producte <tal> del qual només hem ingressat <tants> euros (ho d’identificar entre els números donats a la funció quin és <tal> i quin és <tants>)
            ▪ Si és fals, ha d’imprimir No cal canviar cap producte
* @ param authors Samuel Lara, Tudor Constantin
* @ param versió 2.0
*/
public class exercici4Modular {
    public static void main(String[] args) {

        final int NUM_PRODUCTES = 10;
        int[] ingressos = new int[NUM_PRODUCTES];

        // cridar a llegirIngressos passant-li ‘ingressos’.
        System.out.println("Introdueix 10 numeros: ");
        Teclat.llegirArrayTeclat(ingressos, NUM_PRODUCTES);

        // cridar a llegirX i guardar el resultat en ‘llindar’ (‘llindar’ s’usa per a
        // guardar el valor de la X de l’enunciat).
        System.out.println("Introdueix un valor per al llindar: ");
        int llindar;
        llindar = Teclat.llegirNumeroABuscar();
        System.out.println("El llindar es : " + llindar);

        // cridar a buscarMinim passant-li ‘ingressos’ i guardant el resultat en
        // ‘posMinim’
        int posMinim;
        posMinim = utilsArrays.buscarMinim(ingressos, NUM_PRODUCTES);

        // Donat un array de números reals, busca la posició on es troba el valor mínim,
        // i retorna el valor d'aquesta posició i la guardem a valorPosicio
        int valorPosicio;
        valorPosicio = utilsArrays.buscarMinimValor4(ingressos, NUM_PRODUCTES);

        // cridar a comprovarMinim passant-li el valor mínim que conté ‘ingressos’ i el
        // valor de ‘llindar’, i guardant el resultat en ‘esMenorQueX’
        boolean esMenorQueX;
        esMenorQueX = utilsArrays.comprovarMinim4(posMinim, llindar);
        System.out.println("Es menor que llindar? " + esMenorQueX);

        // cridar a imprimirMissatgeFinal passant-li el identificador del producte amb
        // menys ingressos, els ingressos obtinguts per la seva venda i el resultat de
        // la comparació entre aquest ingressos i el ‘llindar’ (fixeu-vos que heu
        // d’identificar els arguments, ja que no s’ha facilitat el nom exacte de les
        // variables, sinó el significat dels valors que volem passar a la funció)
        Pantalla.imprimirMissatgeFinal4(posMinim, valorPosicio, esMenorQueX);

    }
}
