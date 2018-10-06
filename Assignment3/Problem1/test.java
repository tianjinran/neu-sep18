import java.util.Arrays;
public class test {
    public static void main(String[] Args) {
        Student Terry = new Student("Terry", 1);
        Student Alice = new Student("Alice", 2);
        Student Bob = new Student("Bob", 3);
        Student Cathy = new Student("Cathy", 4);
        Student David = new Student("David", 5);
        Student Eve = new Student("Eve", 6);
        Student Frank = new Student("Frank", 7);
        Student George = new Student("George", 8);
        Student Harry = new Student("Harry", 9);
        Student Zed = new Student("Zed", 10);
        Student Victor = new Student("Victor", 11);

        Course Math = new Course("Math", 0);

        System.out.println(Arrays.toString(Math.getStudents()));


        System.out.println(Math.getNumberOfStudent());
        System.out.println(Math.isFull());

        Math.registerStudent(Terry);
        Math.registerStudent(Alice);

        System.out.println(Arrays.toString(Math.getStudents()));
        System.out.println(Math.getNumberOfStudent());
        System.out.println(Math.isFull());

        Math.registerStudent(Bob);
        Math.registerStudent(Cathy);
        Math.registerStudent(David);
        Math.registerStudent(Eve);
        Math.registerStudent(Frank);
        Math.registerStudent(George);
        Math.registerStudent(Harry);
        Math.registerStudent(Zed);

        System.out.println(Arrays.toString(Math.getStudents()));
        System.out.println(Math.getNumberOfStudent());
        System.out.println(Math.isFull());

        System.out.println(Math.registerStudent(Victor));

        System.out.println(Arrays.toString(Math.getStudents()));
        System.out.println(Math.getNumberOfStudent());
        System.out.println(Math.isFull());
    }
}
