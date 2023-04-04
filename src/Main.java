public class Main {
    public static void main(String[] args) {

        int[][] sportsTable = {
                {8, 7, 4, 9, 5},
                {9, 7, 4, 6, 3},
                {6, 9, 5, 7, 4},
                {10, 7, 8, 6, 7},
                {7, 9, 10, 6, 8}
        };

        int sashaResult = sportsTable[0][0] + sportsTable[0][1] + sportsTable[0][2] + sportsTable[0][3] + sportsTable[0][4];
        int igorResult = sportsTable[1][0] + sportsTable[1][1] + sportsTable[1][2] + sportsTable[1][3] + sportsTable[1][4];
        int mashaResult = sportsTable[2][0] + sportsTable[2][1] + sportsTable[2][2] + sportsTable[2][3] + sportsTable[2][4];
        int kolyaResult = sportsTable[3][0] + sportsTable[3][1] + sportsTable[3][2] + sportsTable[3][3] + sportsTable[3][4];
        int vovaResult = sportsTable[4][0] + sportsTable[4][1] + sportsTable[4][2] + sportsTable[4][3] + sportsTable[4][4];

        String sasha = "Саша: " + sashaResult;
        String igor = "Игорь: " + igorResult;
        String masha = "Маша: " + mashaResult;
        String kolya = "Коля: " + kolyaResult;
        String vova = "Вова: " + vovaResult;

        String[] table = new String[5];
        {
            table[0] = sasha;
            table[1] = igor;
            table[2] = masha;
            table[3] = kolya;
            table[4] = vova;
        }

        for (int i = 0; i < table.length; i++) {
            System.out.println(table[i]);
        }


    }

}
