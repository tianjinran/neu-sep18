import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.util.Arrays;

public class StudentInfoView extends JFrame{


    private  JLabel sl = new JLabel("Student List:");
    private JButton buttonAdd = new JButton("Add a student");
    private JButton buttonShow = new JButton("Show updated list");
    private  JLabel NewID = new JLabel("ID:");
    private JTextField enterID = new JTextField(15);
    private  JLabel NewName = new JLabel("Name:");
    private JTextField enterName = new JTextField(15);
    private  JLabel NewGender = new JLabel("Gender:");
    private JTextField enterGender = new JTextField(15);

    StudentInfoView(StudentInfoModel model){


        String[][] data = model.getStudents();




        JTextField x = new JTextField(Arrays.deepToString(data));
        JPanel p = new JPanel();
        p.setBackground(Color.white);

        this.setSize(1500,100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

        p.add(sl);
        p.add(x);
        p.add(buttonAdd);
        p.add(buttonShow);
        p.add(NewID);
        p.add(enterID);
        p.add(NewName);
        p.add(enterName);
        p.add(NewGender);
        p.add(enterGender);

        this.add(p);
    }


    public int getID(){
        return Integer.parseInt(enterID.getText());
    }

    public String getName(){
        return enterName.getText();
    }

    public String getGender(){
        return enterGender.getText();
    }

    void addAddListener(ActionListener A)
    {
        buttonAdd.addActionListener(A);
    }

    void addShowListener(ActionListener S)
    {
        buttonShow.addActionListener(S);
    }

    public static void main(String[] Args) {
        StudentInfoModel model = new StudentInfoModel();
        StudentInfoView s = new StudentInfoView(model);
    }




}




