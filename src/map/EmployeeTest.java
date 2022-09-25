package map;
import java.util.HashMap;
public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new Employee("David","Chicago",21,1);
        Employee e2 = new Employee("Sam","New York",25,2);
        Employee e3 = new Employee("Sammy","Des Plaines",26,3);
        Employee e4 = new Employee("Alex","Boston",12,4);
        HashMap<Integer, Employee > map = new HashMap<>();
        map.put(e1.id, e1);
        map.put(e2.id, e2);
        map.put(e3.id, e3);
        map.put(e4.id, e4);
        System.out.println( map );
        System.out.println(map.get(e1.id)); // e1 --> Employee object
        printNames(map);
        printCity(map);
    }
    public static void printNames(HashMap<Integer, Employee> employeeHashMap){
        for ( Employee employee :  employeeHashMap.values() ){
            System.out.println(employee.name);
        }
    }
    public static void printCity(HashMap<Integer,Employee> employeeHashMap){
        for (Employee employee :  employeeHashMap.values() ){
            if (employee.age<=21){
                System.out.println("Employees who is 21 and younger are living in "+ employee.city+" city");
            }
        }
    }
}
