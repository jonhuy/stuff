package src;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class Stats {
    public Stats(Difficulty gameDifficulty, int numRounds, int[] scores, int totalScores){
        try {
            File statistics = new File("Statistics.txt");
            FileWriter statisticsWriter = new FileWriter(statistics, false);
            String difficulty = "Difficulty: " + gameDifficulty + "\n";
            int averageScore = totalScores / numRounds;
            String aveScore = "Average score per round: " + averageScore + "\n";
            String lineBreak = "---------------------------------";

            statisticsWriter.write(difficulty);
            statisticsWriter.write(aveScore);
            String score = "";
            String round = "";
            for (int i = 0; i<numRounds; i++){
                statisticsWriter.write(lineBreak);
                int roundNo = i+1;
                round = "Round #" + roundNo + "\n";
                score = "Score: " + scores[i] + "\n";
                statisticsWriter.write(round);
                statisticsWriter.write(score);
                if (gameDifficulty == Difficulty.Easy){

                } else {

                }
            }

            statisticsWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

}