public class Employee {
    private String firstName;
    private String lastName;
    private int age;
    private String gender;
    private String job;

    private int salary;

    public Employee(String firstName, String lastName, int age, String gender, String job, int salary) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.job = job;
        this.salary = salary;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getJob() {
        return job;
    }


    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", job='" + job + '\'' +
                '}';
    }

}
