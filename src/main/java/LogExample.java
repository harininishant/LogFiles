import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class LogExample {
    private final  Logger log = LogManager.getLogger(LogExample.class);

  public List<Student> stu = new ArrayList<>();



    public boolean CreateStudent(Student S) {

        //System.out.println("log4j2 example");
        log.info("creating student");
        log.debug("creating student with following details {}", S);
        log.trace("entering method: CreateStudent at {}", System.currentTimeMillis());
        if (S.getName() == null) {
            log.warn("Student name {} is not valid", S.getName());
                    }
        if (S.getAge() < 18) {
            log.error("Student age cant be less than `18 supplies {}", S.getAge());
            throw new RuntimeException("Not a valid age");
        }
        log.trace("Leaving method: CreateStudent at {}", System.currentTimeMillis());
return stu.add(S);
    }

    public List<Student> getH() {
        return stu;
    }
}

















