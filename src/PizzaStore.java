import java.util.ArrayList;

abstract class PizzaStore implements Rankable{

    private int id;
    private String name;
    private String address;
    private int numberOfEmployees;
    private ArrayList<Employee> listOfEmployees;
    private String phoneNumber;
    private int rank;

    public PizzaStore(int id, String name, String address, int numberOfEmployees, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.numberOfEmployees = numberOfEmployees;
        this.phoneNumber = phoneNumber;
        listOfEmployees = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public ArrayList<Employee> getListOfEmployees() {
        return listOfEmployees;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public double calculateEmployeeExpenses(){
        double sum = 0;
//        for (int i = 0; i < listOfEmployees.size(); i++) {
//            sum += listOfEmployees.get(i).getSalary();
//        }
        for(Employee e : listOfEmployees){
            sum += e.getSalary();
        }
        return sum;
    }

    public void hireEmployee(Employee employee){
        if (!listOfEmployees.contains(employee)){
            this.listOfEmployees.add(employee);
        }
    }

    public void fireEmployee(Employee employee){
        if (listOfEmployees.contains(employee)){
            listOfEmployees.remove(employee);
            employee.setSurprise(null);
        }
    }

    public void giveEmployeeSurprise(Employee employee, Surprisable surprise){
        if (this.listOfEmployees.contains(employee)){
            employee.setSurprise(surprise);
        }
    }
}
