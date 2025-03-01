import java.util.Arrays;
public class ArcheryGame {
    public static void main(String[] args) {
        int players = 4;
        int chances = 3;
        int[][] scores = generateScores(players, chances);
        for (int i = 0; i < scores.length; i++) {
            System.out.println("Player " + scores[i][0] + " score: " + scores[i][4]);
        }
    }
    
    public static int[][] generateScores(int players, int chances) {
        int[][] result = new int[players][5]; // [player number, chance1, chance2, chance3, total]
        for (int count = 0; count < players; count++) {
            result[count][0] = count + 1;
            int total = 0;
            for (int counter = 1; counter <= chances; counter++) {
                int score = ((count + 1) * (counter + 2)) % 11;
                result[count][counter] = score;
                total += score;
            }
            result[count][4] = total;
        }
        return result;
    }
}

