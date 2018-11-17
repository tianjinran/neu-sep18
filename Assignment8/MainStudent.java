public class MainStudent {

    public static void main(String[] Args) {
        StudentInfoModel model = new StudentInfoModel();
        StudentInfoView view = new StudentInfoView(model);
        StudentController controller = new StudentController(model,view);

        view.setVisible(true);
    }
}
