class Student {

    private String name;
    private int id;

    //constructor.
    public Student(String name, int id){
        this.name = name;
        this.id = id;
    }

    //Getter for name. return the current "name" data.
    public String getName(){
        return name;
    }

    //Getter for id. return the current "id " data.
    public int getId(){
        return id;
    }
/*
    public static void main(String[] args){
        Student a = new Student("Terry",537);
        Student b = new Student("Perry",538);
        System.out.println(a.getName()+", "+a.getId());

    }
*/

}
