public class TestRun {
    public static void main(String[] args) {

        LogExample E = new LogExample();


        E.CreateStudent(new Student(30,null,"java"));
        E.CreateStudent(new Student(40,"ajk","QA"));
        System.out.println(E.getH());



    }



}
