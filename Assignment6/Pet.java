public class Pet {
    private String name;
    private String ownerName;
    private String color;
    protected int sexid;


    public Pet(String name, String ownerName, String color){
        this.name = name;
        this.ownerName = ownerName;
        this.color = color;
    }

    public String getPetName(){
        return name;
    }

    public String getOwnerName(){
        return ownerName;
    }

    public String getColor(){
        return color;
    }

    public void setSex(int sexid){
        this.sexid = sexid;
    }

    public String getSex(){
        if(sexid==0) {
            return "Male";
        }
        else if(sexid==1) {
            return "Female";
        }
        else if(sexid==2) {
            return "Spayed";
        }
        else if(sexid==3) {
            return "Neutered";
        }
        else{
            return "Cannot Identify Sex.";
        }
    }

    public String toString(){
        return getPetName() + " owned by " + getOwnerName() + "\nColor: " + getColor() + "\nSex: " + getSex();
    }

    public static void main(String[] Args) {
        Pet a = new Pet("Spot","Mary","Black and White");
        System.out.println(a.toString());

        Cat c = new Cat("Tom","Bob","Black","short");
        c.setSex(2);
        Dog d = new Dog("Spot","Susan","white","medium");
        d.setSex(2);
        System.out.println(c.toString());
        System.out.println(d.toString());

        System.out.println("-------Unit test for boarding--------");
        c.setBoardStart(3,17,2018);
        c.setBoardEnd(5,12,2018);
        System.out.println("Should be true:" + c.boarding(3,19,2018));
        System.out.println("Should be false:" + c.boarding(1,19,2018));
    }
}
