package Assignment5;

public class DessertShoppe {
    static double taxRate =  0.065;
    static String nameOfStore = "My Dessert Shoppe";
    static int maxItemNameSize = 25;
    static int maxWidth = 30;           //Width used to display the costs of the items on the receipt

    static public String cents2dollarsAndCents(int n){
        //takes an integer of cents and returns it as a String formatted in dollars and cents.
        //105 cents returns "1.05"
        String S = Integer.toString(n);
        if (S.length()>2){
            return S.substring(0,S.length()-2) + '.' + S.substring(S.length()-2);
        }else if(S.length()==1){
            return ".0" + S;
        }else{
            return "." + S;
        }
    }

}
