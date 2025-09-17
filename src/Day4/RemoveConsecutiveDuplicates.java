package Day4;

public class RemoveConsecutiveDuplicates {
    public static void main(String[] args) {
        String str = "aaabbccdddee"; 

        StringBuilder result = new StringBuilder();

        
        result.append(str.charAt(0));

      
        for (int i = 1; i < str.length(); i++) {
            
            if (str.charAt(i) != str.charAt(i - 1)) {
                result.append(str.charAt(i));
            }
        }

        System.out.println("Input : " + str);
        System.out.println("Output: " + result.toString());
    }
}
