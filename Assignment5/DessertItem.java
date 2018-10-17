package Assignment5;

public abstract class DessertItem {
    protected String name;

    public DessertItem(){
        name = "Null";
    }

    public DessertItem(String name){
        this.name = name;
    }

    //Getter for name. return the name of DessertItem.
    public final String getName(){
        return name;
    }

    public abstract int getCost();

}


