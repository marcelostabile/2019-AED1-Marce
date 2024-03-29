/**
 *
 * @author Ernesto
 */
    public class CalculadorMatricesOptimo implements ICalculadorMatricesOptimo{

    int[][] W;
    int[][] P;
    int[][] R;

    @Override
    public void calcularMatrices(int cantElem, int[] FrecExito, int[] FrecNoExito) {
        int i, j, k, kraiz, h;
        int min, PesoSubArboles;

       
        //wii = bii y pii = wii, las diagonales de las matrices "W" y "P"
        for (i = 0; i < cantElem + 1; i++) {
            W[i][i] = FrecNoExito[i];
            P[i][i] = W[i][i]; // h = 0
        }

        // wij = wij-1 + aj + bj 
        // completar acá la matriz W
        
// h = 1 pij = wij + pii + pjj , la pimera diagonal superior las subárboles de un nodo

        for (i = 0; i < cantElem; i++) {
            //completar acá
        }

// h = 2 hasta h = n
        kraiz = 0;
        for (h = 2; h < cantElem + 1; h++) {

            for (i = 0; i < cantElem - h + 1; i++) {
                j = i + h;
                min = Integer.MAX_VALUE;

                //acá obtener el valor de "min"
                   
                }

                P[i][j] = min + W[i][j];
                R[i][j] = kraiz;
            }
        }
    }

    /**
     *
     * @param i
     * @param j
     * @param Claves
     * @param frecClaves
     * @param elArbolBB
     */
    @Override
    public void armarArbolBinario(int i, int j, String[] Claves, TArbolBB elArbolBB ) {

        TElementoAB<Comparable> unNodo;
        int unaraiz;
        if (i < j) {
            //completar acá el método
        }
    }

    public CalculadorMatricesOptimo(int cantElem) {
        crearMatrices(cantElem);
    }

    private void crearMatrices(int cantElem) {
        W = new int[cantElem+1][cantElem+1];
        P = new int[cantElem+1][cantElem+1];
        R = new int[cantElem+1][cantElem+1];
    }

   
}
