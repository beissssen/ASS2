public class Student extends Person {
    private Integer id;
    private String name;
    private String surname;
    private Double gpa;

    public Student(){

    }

    public Student(final String name, final String surname, final Double gpa) {
        this.name = name;
        this.surname = surname;
        this.gpa = gpa;
    }

    public Integer getId() {
        return id;
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

    public Double getGpa() {
        return gpa;
    }

    public void setGpa(final Double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}
