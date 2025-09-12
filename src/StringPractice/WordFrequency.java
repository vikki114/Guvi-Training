package StringPractice;
import java.util.Arrays;

public class WordFrequency {
    public static void main(String[] args) {
        String str = "java coding java";
       
        String[] words = str.toLowerCase().split("\\s+");
        int n = words.length;
        System.out.println("Total words: " + n);

        boolean visited[] = new boolean[n];
        Arrays.fill(visited, false);

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                int count = 1;
                visited[i] = true;
                for (int j = i + 1; j < n; j++) {
                    if (words[i].equals(words[j])) {
                        visited[j] = true;
                        count++;
                    }
                }
                System.out.println("Count of \"" + words[i] + "\" = " + count);
            }
        }
    }
}
