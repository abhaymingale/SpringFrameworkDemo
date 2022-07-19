package demo;

import com.sun.javadoc.Doc;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public String db = null ;

    void display(){
        System.out.println(db.hashCode());
    }
    public static void main(String[] args) {
        Main main = new Main();
        main.display();
       System.out.println(main.db.hashCode());

    }
       // ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        //Doctor doctor = applicationContext.getBean(Doctor.class);
        //doctor.assist();

//        employee employee = new employee(1,"Abhay Ingale",30,"it", List.of("project1","project2","project3"));
//
//        employee employee1 = new employee(2,"Sage Ingale",31,"it", List.of("project4","project2","project5"));
//
//        List<employee> employees = new ArrayList<>();
//        employees.add(employee);
//        employees.add(employee1);
//
//        //foreach
//        employees.stream()
//                .forEach(employee2 -> System.out.println(employee2));
//        //Map
//        //collect method
//         List<employee> newemps = employees.stream().map(
//                 employee2 -> new employee(
//                         employee2.getId(),
//                         employee2.getName(),
//                         employee2.getAge() *20,
//                         employee2.getDept(),
//                         employee2.getProoject()
//
//                 )).collect(Collectors.toList());
//
//        System.out.println(newemps);
//
//        //filter and find first
//        System.out.println("====================================================================================");
//        System.out.println(employees.stream()
//                .filter(employee2 -> employee2.getAge()>30)
//                .collect(Collectors.toList()));
//        System.out.println("====================================================================================");
//        System.out.println(employees.stream()
//                .findFirst()
//                .orElse(null));
//
//        //flatmap
//        System.out.println("=====================================Flat Map===============================================");
//
//        Map<String, List<employee>>map = new HashMap<>();
//
//        List<Object> collect = employees.stream()
//                .map(employee2 -> employee2.getProoject())
//                .flatMap(List::stream)
//                .collect(Collectors.toList());
//
//        System.out.println(collect);
//
//        for (col:collect) {
//            System.out.println(col);
//        }
//
//
//
//
//
//    }

}
