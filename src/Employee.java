import java.time.LocalDate;
import java.util.Date;

public class Employee {

    private int id;
    private String firstName;
    private String lastName;
    private String address;
    private double salary;
    private LocalDate startDate;
    private int rank;
    private LocalDate rankDate;
    private Surprisable surprise;

    public Employee(int id, String firstName, String lastName, String address, double salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.salary = salary;
        this.startDate = LocalDate.now();
        this.setRank();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getRank() {
        return rank;
    }

    public void setRank() {
        this.rank = (int)(Math.random() * 100);
        this.rankDate = LocalDate.now();
    }

    public LocalDate getRankDate() {
        return rankDate;
    }

    public Surprisable getSurprise() {
        return surprise;
    }

    public void setSurprise(Surprisable surprise) {
        this.surprise = surprise;
    }

    @Override
    public String toString() {
        return this.id + ":" + this.firstName + " " + this.lastName;
    }
}
