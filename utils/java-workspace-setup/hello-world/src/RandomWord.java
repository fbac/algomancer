import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
    public static void main(String[] args) {
        double probability = 1.0;
        double counter = 1.0;
        String championWord = "";
        String currentWord = "";

        while (!StdIn.isEmpty()) {
            currentWord = StdIn.readString();
            probability = probability / counter;

            if ("EOF".equalsIgnoreCase(currentWord)) {
                break;
            }

            if (StdRandom.bernoulli(probability)) {
                championWord = currentWord;
            }

            counter++;
        }    
        StdOut.println(championWord);   
    }
}
