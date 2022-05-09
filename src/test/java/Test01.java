import org.example.dao.StudentDao;
import org.example.domain.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Test01 {
    @Test
    public void test()
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentDao dao=(StudentDao) context.getBean("studentDao");
        Student student=new Student();
        student.setSsex("男");
        List<Student> list=dao.selectCondition(student);
        list.forEach(student1 -> System.out.println(student1));
    }
}
