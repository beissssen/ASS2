import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ArrayList<Person> people = new ArrayList<>();

        // Students
        Student stud1 = new Student();
        stud1.setName("A11");
        stud1.setSurname("A12");
        stud1.setGpa(2.4);
        people.add(stud1);

        Student stud2 = new Student();
        stud2.setName("A21");
        stud2.setSurname("A22");
        stud2.setGpa(3.6);
        people.add(stud2);

        Student stud3 = new Student();
        stud3.setName("A31");
        stud3.setSurname("A32");
        stud3.setGpa(4.5);
        people.add(stud3);

        // Employees
        Employee emp1 = new Employee();
        emp1.setName("B11");
        emp1.setSurname("B12");
        emp1.setPosition("Manager");
        emp1.setSalary(32.000);
        people.add(emp1);

        Employee emp2 = new Employee();
        emp2.setName("B21");
        emp2.setSurname("B22");
        emp2.setPosition("Director");
        emp2.setSalary(55.0999);
        people.add(emp2);


        Collections.sort(people);
        printData(people);

    }

    public static void printData(Iterable<Person> p){
        for(  Person peop: p  ){
            System.out.println(peop.getPosition() + peop.getName() + " earns " + peop.getPaymentAmount() + " tenge.");
        }
    }
}