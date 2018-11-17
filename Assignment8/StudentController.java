import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentController {
    private StudentInfoModel model;
    private StudentInfoView view;

    public StudentController(StudentInfoModel model,StudentInfoView view){
        this.model = model;
        this.view = view;

        view.addAddListener(new AddListener());
        view.addShowListener(new ShowListener());

    }

class AddListener implements ActionListener{

        public void actionPerformed(ActionEvent e){
            int id = view.getID();
            String name = view.getName();
            String gender = view.getGender();
            Student s = new Student(id,name,gender);
            model.addStudent(s);
            JOptionPane.showMessageDialog(null,"Student added!");
        }
}

class ShowListener implements ActionListener{

        public void actionPerformed(ActionEvent e){
        String[][] data = model.getStudents();
        StudentInfoView s = new StudentInfoView(model);

        }
}
}
