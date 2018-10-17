package Assignment5;

class Cookie extends DessertItem{
    int number;
    int pricePerDozen;

    public Cookie(String name, int number, int pricePerDozen){
        super(name);
        this.number = number;
        this.pricePerDozen = pricePerDozen;

    }

    public int getCost(){
        double s = this.number * (this.pricePerDozen/12.0);
        int t = (int)Math.round(s);
        return t;
    };


}