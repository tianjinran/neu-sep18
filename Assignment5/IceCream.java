package Assignment5;

class IceCream extends DessertItem{
    int costOfIceCream;

    public IceCream(String name, int costOfIceCream){
        super(name);
        this.costOfIceCream=costOfIceCream;

    }

    public int getCost(){
        return this.costOfIceCream;
    };


}