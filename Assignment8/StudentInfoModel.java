import java.util.Arrays;

public class StudentInfoModel {
    private Student[] studentSystem = new Student[10];
    private int numOfStudents;

    public void addStudent(Student s){
        if (!this.isFull()){
            for(int i = 0; i< this.studentSystem.length; i++) {
                if(this.studentSystem[i] == null){
                    this.studentSystem[i] = s;
                    this.numOfStudents += 1;
                    break;
                }
            }
        }
    }

    public boolean isFull(){
        if (studentSystem[9] != null){
            return true;
        }else{
            return false;
        }
    }

    public String[][] getStudents(){
        String[][] student_list = new String[10][];
        for (int i=0; i < studentSystem.length;i++ ){
            if (studentSystem[i] != null){
                student_list[i] = studentSystem[i].toShow();

            }
        }
        return student_list;
    }

    public static void main(String[] Args) {

        StudentInfoModel s = new StudentInfoModel();
        Student a = new Student(001,"Alice","female");
        Student b = new Student(002,"Bob","male");
        s.addStudent(a);
        s.addStudent(b);
        Object[][] data = {{"1","Alice","female"},{"2","Bod","male"}};
        System.out.println(Arrays.toString(a.toShow()));
        System.out.println(Arrays.deepToString(data));

        System.out.println(Arrays.deepToString(s.getStudents()));


    }

}

 class Student{
     private int id;
     private String name;
     private String gender;
     //constructor.
     public Student(int id,String name,String gender ){
         this.name = name;
         this.id = id;
         this.gender = gender;
     }

     //Getter for name.
     public String getName(){
         return name;
     }

     //Getter for ID.
     public int getID(){
         return id;
     }

     //Getter for gender.
     public String getGender(){
         return gender;
     }

     //Setter for id.
     public void setId(int id){
         this.id = id;
     }

     //Setter for name.
     public void setName(String name){
         this.name = name;
     }

     //Setter for gender.
     public  void  setGender(String gender){
         this.gender = gender;
     }

     public String[] toShow(){
         String[] l = new String[3];
         l[0]= Integer.toString(this.getID());
         l[1]= this.getName();
         l[2]= this.getGender();
         return l;

     }

 }
