public class Main {

    public static void main(String[] args) {

        Student jamie = Student.getStudent(1);
        jamie.setName("Jamie Cohen");

        Student pipe = Student.getStudent(2);
        pipe.setName("Felipe Grosso");

        Student rehan = Student.getStudent(3);
        rehan.setName("Rehan Hafeez");

        Student daniel = Student.getStudent(3);
        daniel.setName("Daniel Cohen");

        System.out.println(jamie.toPrint());
        System.out.println(pipe.toPrint());
        System.out.println(rehan.toPrint());
        System.out.println(daniel.toPrint());
    }
}
