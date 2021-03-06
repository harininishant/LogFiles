import java.util.List;

public class Student {
private int age;
private String name;
private String course;


    public Student(int age, String name, String course) {
        this.age = age;
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", course='" + course + '\'' +
                '}';
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getCourse() {
        return course;
    }
}
