package Assignment5;

class Sundae extends IceCream{
    String toppingName;
    int costOfTopping;

    public Sundae(String name, int costOfIceCream, String toppingName, int costOfTopping){
        super(name,costOfIceCream);
        this.toppingName=toppingName;
        this.costOfTopping=costOfTopping;

    }

    public int getCost(){
        return this.costOfIceCream + this.costOfTopping;
    };


}