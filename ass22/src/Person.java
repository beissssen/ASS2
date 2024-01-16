import java.util.Iterator;
import java.util.function.Consumer;

public class Person  implements Payable,Iterable<Person>, Comparable<Person> {
    private Integer id;
    private String name;
    private String surname;

    public Integer getId() {
        return id;
    }

    public Person(final String name, final String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(){

    }
    public String getPosition(){
        if(this instanceof Employee){
            return "employee";
        }
        else{
            return "student";
        }
    }


    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(final String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    @Override
    public double getPaymentAmount() {

        if(this instanceof Student){
            if(((Student) this).getGpa()>2.67){
                return 36660.0;
            }
            else {
                return 0;
            }
        }
        else{

            return ((Employee) this).getSalary();
        }

    }

    @Override
    public Iterator<Person> iterator() {
        return null;
    }

    @Override
    public void forEach(final Consumer<? super Person> action) {
        Iterable.super.forEach(action);
    }



    @Override
    public int compareTo(final Person o) {
        return Double.compare(this.getPaymentAmount(), o.getPaymentAmount());
    }
}
