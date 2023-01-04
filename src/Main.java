import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        PizzaDominos pizzaDominos = new PizzaDominos(1, "TLV", "address", 5, "555");
        PizzaHut pizzaHut = new PizzaHut(2, "TLV", "address", 4, "777");

        Employee e1 = new Employee(1, "A", "AA", "address", 100);
        Employee e2 = new Employee(2, "B", "BB", "address", 200);
        Employee e3 = new Employee(3, "C", "CC", "address", 300);
        Employee e4 = new Employee(4, "D", "DD", "address", 400);
        Employee e5 = new Employee(5, "E", "EE", "address", 500);
        Employee e6 = new Employee(6, "F", "FF", "address", 600);

        pizzaDominos.hireEmployee(e1);
        pizzaDominos.hireEmployee(e2);
        pizzaDominos.hireEmployee(e3);

        pizzaHut.hireEmployee(e4);
        pizzaHut.hireEmployee(e5);
        pizzaHut.hireEmployee(e6);

        


    }


}
