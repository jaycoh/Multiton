import java.util.HashMap;

public class Student {

    private int id;
    private String name;

    private static HashMap<Integer, Student> studentMappings = new HashMap<>();

    public static Student getStudent(int idNum) {
        if (!studentMappings.containsKey(idNum)) studentMappings.put(idNum, new Student(idNum));
        return studentMappings.get(idNum);
    }

    private Student(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String toPrint() {
        return "name: " + this.name + "; id: " + this.id;
    }

}
