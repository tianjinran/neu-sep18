public class Course {
    private String name;
    private int numberOfStudent;
    private Student[] students = new Student[10];

    //Constructor
    public Course(String name, int numberOfStudent){
        this.name = name;
        this.numberOfStudent = numberOfStudent;

    }

    //Getter for name.
    public String getName(){
        return name;
    }

    //Getter for numberOfStudent;
    public int getNumberOfStudent(){
        return numberOfStudent;
    }

    public String[] getStudents(){
        String[] student_list = new String[10];
        for (int i=0; i < students.length;i++ ){
            if (students[i] != null){
                student_list[i] = students[i].getName();
            }
        }
        return student_list;
    }

    public boolean isFull(){
        if (students[9] != null){
            return true;
        }else{
            return false;
        }
    }

    //returns false if course is full, true if success.
    public boolean registerStudent(Student student){
        if (this.isFull()){
            return false;
        }else{
            for (int i = 0; i < students.length; i++){
                if(students[i] == null){
                    students[i] = student;
                    numberOfStudent += 1;
                    break;
                }
            }
        }
        return true;
    }
}
