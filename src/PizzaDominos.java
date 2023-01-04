import java.time.LocalDate;

public class PizzaDominos extends PizzaStore{

    public PizzaDominos(int id, String name, String address, int numberOfEmployees, String phoneNumber) {
        super(id, name, address, numberOfEmployees, phoneNumber);
        super.setRank(calculateRank());
    }

    @Override
    public int getRank() {
        return calculateRank();
    }

    @Override
    public int calculateRank() {
        int sum = 0;
        for(Employee e : this.getListOfEmployees()){
            sum += e.getRank();
        }
        return sum;
    }

    @Override
    public int calculateRangedRank(int range) {
        if (this.getListOfEmployees().size() > 0){
            LocalDate currentDate = LocalDate.now();
            LocalDate lastValidDate = currentDate.minusDays(range);
            for(Employee e : this.getListOfEmployees()){
                if(lastValidDate.isAfter(e.getRankDate())){
                    e.setRank();
                }
            }
            return calculateRank();
        }else{
            return 0;
        }
    }
}
