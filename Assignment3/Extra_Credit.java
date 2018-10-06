import java.util.Scanner;
public class Extra_Credit {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter Input String :");

            String inputString = sc.nextLine();

            String outputString = reverseWordByWord(inputString);

            System.out.println("Input String : "+inputString);
            System.out.println("Output String : "+outputString);

            sc.close();
        }

    public static String reverseWordByWord(String inputString) {

        String Trimmed = inputString.trim().replaceAll("\\s+", " ");

        String[] words = Trimmed.split("\\s");

        String outputString = "";

        for (int i = words.length-1; i >= 0; i--) {
            outputString = outputString + words[i] + " ";
        }

        return outputString;
    }


}