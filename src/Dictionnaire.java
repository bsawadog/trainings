public class Dictionnaire {

    int[][] tableau2D = {{5,3},{2,5},{4,3},{8,10},{105,32},{55,34},{12,21},
            {15,51},{44,1},{6,3},{19,3},{65,13},{1235,1353},{51515,32143},
            {15155,3555}};

    public Dictionnaire() {}

    public int trouver(int cle){
        for (int i = 0; i < tableau2D.length; i++) {
            for (int j = 0; j < tableau2D[i].length; j++) {
                if (tableau2D[i][0] == cle) {
                    return tableau2D[i][1];
                }
            }
        }
        return -1;
    }
}
