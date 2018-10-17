package Assignment5;

import java.util.ArrayList;
import java.util.List;

public class Checkout {

    List<DessertItem> checkout;

    public Checkout(){
        //Creates a Checkout instance with an empty list of DessertItem's
        checkout = new ArrayList<>();

    }

    public int numberOfItems(){
        //returns the number of DessertItems in the list

        return checkout.size();

    }

    public void enterItem(DessertItem item){
        //A DessertItem is added to the end of the list of items
        checkout.add(item);

    }

    public void clear(){
        //Clears the Checkout to begin checking out a new set of items
        checkout.clear();
    }

    public int totalCost(){
        //Returns total cost of items in cents(without tax)
        int total = 0;
        for(int i = 0; i < checkout.size(); i++){
            total += checkout.get(i).getCost();
        }
        return total;
    }

    public  int totalTax(){
        //Returns total tax on items in cents
        return (int)Math.round(totalCost()*DessertShoppe.taxRate);
    }

    @Override
    public String toString(){
        //Returns a String representing a receipt for the current list of items
        String receipt = "";
        int a = DessertShoppe.maxItemNameSize;
        int b = DessertShoppe.maxWidth;
        for(int i = 0; i < checkout.size();i++){
            DessertItem j = checkout.get(i);
            if(j instanceof Sundae){
                while(((Sundae) j).toppingName.length() > a){
                    receipt += ((Sundae) j).toppingName.substring(0,a) + "\n";
                    ((Sundae) j).toppingName = ((Sundae) j).toppingName.substring(a);
                }
                receipt += ((Sundae) j).toppingName + " Sundae with " + "\n";
            }else if(j instanceof Candy){
                receipt += ((Candy) j).weight + " lbs. @ " + DessertShoppe.cents2dollarsAndCents(((Candy) j).pricePerPound) +" /lb."+ " \n";
            }else if(j instanceof Cookie){
                receipt += ((Cookie) j).number + " @ " + DessertShoppe.cents2dollarsAndCents(((Cookie) j).pricePerDozen) + " /dz."+ "\n";
            }
            while(j.name.length()>a){
                receipt += j.name.substring(0,a) + "\n";
                j.name = j.name.substring(a);
            }
            int NumOfSpace = b - j.name.length() - DessertShoppe.cents2dollarsAndCents(j.getCost()).length();
            receipt += j.name +
                    String.format("%1$"+NumOfSpace+"s", "") +
                    DessertShoppe.cents2dollarsAndCents(j.getCost())+ "\n";
        }
        String Tax = DessertShoppe.cents2dollarsAndCents(totalTax());
        String Total = DessertShoppe.cents2dollarsAndCents(totalTax()+totalCost());
        int NumSpaceTax = b - Tax.length() - 3;
        int NumSpaceTotal = b - Total.length() - 10;

        receipt +="\nTax" +String.format("%1$"+NumSpaceTax+"s", "")+ Tax+
                  "\nTotal Cost" +String.format("%1$"+NumSpaceTotal+"s", "")+ Total;

        return String.format("%1$"+7+"s", "") + DessertShoppe.nameOfStore +
                "\n"  + "       -----------------" + "\n" +
                "\n" + receipt;


    }

}
