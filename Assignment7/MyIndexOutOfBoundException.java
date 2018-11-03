import java.util.Scanner;

public class MyIndexOutOfBoundException {
    static int lowerBound=0;
    static int upperBound=9;
    int index;

    static void check(int index) {
        if (index >= lowerBound && index <=upperBound ) {
            System.out.println("Valid index entered:"+ index +" Lower bound: "+ lowerBound + ", Upper bound: " + upperBound);
        }else{
            try {
                throw new IndexOutOfBoundsException();

            } catch(IndexOutOfBoundsException e) {

                System.out.println("Error Message: Index: " + index + ", but Lower bound: "+ lowerBound + ", Upper bound: " + upperBound);

            }
        }
    }

    public static void main(String[] Args) {

    Scanner input = new Scanner(System.in);

        try {
            System.out.println("Enter index value:");
            int x = input.nextInt();
            System.out.println("Index value: " + x);
            check(x);

        } catch (Exception e) {
            System.out.println("Please enter an integer.");
        }
    }
    }
