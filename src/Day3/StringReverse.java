package Day3;

public class StringReverse {
    public static void main(String[] args) {
        String str = "coding";
        char[] chars = str.toCharArray();
        int start = 0;
        int end = chars.length - 1;

        
        while (start < end) {
            if (!Character.isLetter(chars[start])) {
                start++;
            } else if (!Character.isLetter(chars[end])) {
                end--;
            } else {
                char temp = chars[start];
                chars[start] = chars[end];
                chars[end] = temp;
                start++;
                end--;
            }
        }

        String rev_str = new String(chars);
        System.out.println("Original String = " + str);
        System.out.println("Reversed String = " + rev_str);
    }
}
