public class Dog extends Pet implements Boardable {

    private String size;
    private int startYear;
    private int endYear;
    private int startMonth;
    private int endMonth;
    private int startDay;
    private int endDay;

    public Dog(String name, String ownerName, String color, String size){
        super(name,ownerName,color);
        this.size = size;
    }

    public String getSize(){
        return size;
    }

    public String toString(){
        return "DOG:\n" + getPetName() + " owned by " + getOwnerName() + "\nColor: " + getColor() + "\nSex: " + getSex() + "\nSize: " + getSize();
    }

    public void setBoardStart(int month, int day, int year){
        startYear = year;
        startMonth = month;
        startDay = day;
    }

    public void setBoardEnd(int month, int day, int year){
        endYear = year;
        endMonth = month;
        endDay = day;
    }

    public boolean boarding(int month, int day, int year){
        if (year < startYear){
            return false;
        }
        if (year == startYear){
            if(month < startMonth){
                return false;
            }
            if(month == startMonth){
                if(day < startDay){
                    return false;
                }
            }
        }
        if (year >  endYear){
            return false;
        }
        if (year == endYear){
            if (month > endMonth){
                return false;
            }
            if (month == endMonth){
                if (day > endDay){
                    return false;
                }
            }
        }
        return true;
    }

}

