import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class main{
    public static void main(String []args){
        List<Employee> emp = new ArrayList<Employee>();
        emp.add(new Employee("Tharindu", "Akalanka", 26, "MALE","ASE",2000));
        emp.add(new Employee("Tharindu", "Thisun", 28, "FEMALE", "SE",3000));
        emp.add(new Employee("Indumini", "Himashi", 27, "MALE", "QA", 2500));
        emp.add(new Employee("Tharindu", "Kalpa", 35, "FEMALE","SSE",4500));
        emp.add(new Employee("Indumini", "Hettiarachchi", 27, "FEMALE","ASE",2200));
        emp.add(new Employee("Himanshi", "Dias", 30, "FEMALE","SSE",6000));
        emp.add(new Employee("Kasuni", "Harshi", 26, "FEMALE","JHR",2500));
        emp.add(new Employee("Iresha", "Sandi", 28, "FEMALE","JHR",2500));
        emp.add(new Employee("Alexa", "Vo", 30, "MALE","HR",5000));

        //emp.stream().map(Employee::getJob).distinct().forEach(System.out::println);

        //Map<String, Long> res = emp.stream().collect(Collectors.groupingBy(Employee::getJob, Collectors.counting()));
        //System.out.println(res);

        //Map<String, Double> res2 = emp.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
        //System.out.println(res2);

        //List<String> res4 = emp.stream().map(Employee::getFirstName).distinct().collect(Collectors.toList());

        //Set<String> uniqueNames1 = new HashSet<String>();
        //List<String> names = emp.stream().map(Employee::getFirstName).collect(Collectors.toList());
        //names.stream().map(e->{uniqueNames1.add(e);return e;}).collect(Collectors.toList());
        //System.out.println(uniqueNames1);

        //Set<String> uniqueNames2 = new HashSet<String>();
        //emp.stream().forEach(e->uniqueNames2.add(e.getFirstName()));
        //System.out.println(uniqueNames2);

        //Set<String> uniqueNames3 = new HashSet<String>();
        //Set<String> res6 = emp.stream().map(Employee::getFirstName).filter(name->!uniqueNames3.add(name)).collect(Collectors.toSet());
        //System.out.println(res6);

        List<Boolean> test = new ArrayList<Boolean>();
        test.add(true);
        test.add(false);
        test.add(false);
        test.add(true);

        //test.stream().filter(e->e).forEach(e->System.out.println(e));


        Set<String> res7 = emp.stream()
                .map(e->e.getFirstName())
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e->e.getValue()>1)
                .map(e->e.getKey())
                .collect(Collectors.toSet());

        System.out.println(res7);





    }
}