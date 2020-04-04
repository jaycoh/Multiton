public class Main {

    public static void main(String[] args) {

        Student jamie = Student.getStudent(1);
        jamie.setName("Jamie Cohen");

        Student pipe = Student.getStudent(2);
        pipe.setName("Felipe Grosso");

        Student rehan = Student.getStudent(3);
        rehan.setName("Rehan Hafeez");
        System.out.println("Student rehan's current name: " + rehan.getName());

        Student imposterRehan = Student.getStudent(3);
        imposterRehan.setName("Not Rehan :-0");
        System.out.println("Student rehan's name: " + rehan.getName());
        System.out.println("Student imposterRehan's name: " + imposterRehan.getName());
    }
}
