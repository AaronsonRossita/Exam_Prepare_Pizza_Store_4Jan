import java.time.LocalDate;

public class PizzaHut extends PizzaStore{


    public PizzaHut(int id, String name, String address, int numberOfEmployees, String phoneNumber) {
        super(id, name, address, numberOfEmployees, phoneNumber);
        super.setRank(calculateRank());
    }

    @Override
    public int getRank() {
        return calculateRank();
    }

    @Override
    public int calculateRank() {
        if (this.getListOfEmployees().size() > 0){
            int sumRank = 0;
            for(Employee e : this.getListOfEmployees()){
                sumRank += e.getRank();
            }
            return sumRank / this.getListOfEmployees().size();
        }else{
            return 0;
        }
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
