package Assignment5;


class Candy extends DessertItem{
    double weight;
    int pricePerPound;

    public Candy(String name, double weight, int pricePerPound){
        super(name);
        this.weight = weight;
        this.pricePerPound = pricePerPound;

    }

    public int getCost(){
        double s = this.weight * this.pricePerPound;
        int t = (int)Math.round(s);
        return t;
    };


}
