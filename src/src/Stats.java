package src;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class Stats {
    private int[][] rounds = new int[100][10];
    private int numRounds = 0;
    private int totalScores = 0;
    private int[] scores = new int[100];


    public Stats(){ }

    public void updateNumRounds(){
        this.numRounds++;
    }

    public void setTotalScores(int newScore) {
        this.totalScores += newScore;
    }

    public void writeStats(Difficulty gameDifficulty){
        try {
             File statistics = new File("Statistics.txt");
             FileWriter statisticsWriter = new FileWriter(statistics, false);
             String difficulty = "Difficulty: " + gameDifficulty + "\n";
             int averageScore = totalScores / numRounds;
             String aveScore = "Average score per round: " + averageScore + "\n";
             String lineBreak = "---------------------------------"+"\n";

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
                  String line = "";
                  for(int j = 0; j < 10; j++){
                       switch(j){
                           case 0:
                               line = "I:" + rounds[roundNo - 1][j] +"\n";
                               break;
                               case 1:
                                    line = "J:" + rounds[roundNo - 1][j]+"\n";
                                    break;
                                case 2:
                                    line = "L:" + rounds[roundNo - 1][j]+"\n";
                                    break;
                                case 3:
                                    line = "O:" + rounds[roundNo - 1][j]+"\n";
                                    break;
                                case 4:
                                    line = "S:" + rounds[roundNo - 1][j]+"\n";
                                    break;
                                case 5:
                                    line = "T:" + rounds[roundNo - 1][j]+"\n";
                                    break;
                                case 6:
                                    line = "Z:" + rounds[roundNo - 1][j]+"\n";
                                    break;
                                case 7:
                                    line = "+:" + rounds[roundNo - 1][j]+"\n";
                                    break;
                                case 8:
                                    line = "P:" + rounds[roundNo - 1][j]+"\n";
                                    break;
                                case 9:
                                    line = "Q:" + rounds[roundNo - 1][j]+"\n";
                                    break;
                            }
                            statisticsWriter.write(line);
                            line = "";
                        }
                    }

                    statisticsWriter.close();
                } catch (IOException e) {
                    System.out.println("An error occurred.");
                    e.printStackTrace();
                }
    }

    public void updateRounds( int letter){
        rounds[numRounds][letter]++;
    }

    public void setScores(int score){this.scores[numRounds] = score;}


}