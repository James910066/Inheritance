import java.util.ArrayList;

public class InheritanceDemo {
    public static void main(String[] args)
    {

        ArrayList<Worker> employees = new ArrayList<>();
        SalaryWorker james = new SalaryWorker("000001", "James", "Dinser",2002, 40.00);
        employees.add(james);
        SalaryWorker bob = new SalaryWorker("000002","Bob","Sajak",1997, 20.00);
        employees.add(bob);
        SalaryWorker joe = new SalaryWorker("000003","Joe","Smoe",1976,22.50);
        employees.add(joe);
        Worker melissa = new Worker("000004","Melissa","Dinser",1982,27.00);
        employees.add(melissa);
        Worker jake = new Worker("000005","Jake", "Snake",1970,15.00);
        employees.add(jake);
        Worker randy = new Worker("000006","Randy","RoadWarrior",1965,27.50);
        employees.add(randy);

        for(Worker w: employees)
            System.out.println(w);

       //w1.calculateWeeklyPay(40);

        //LOOP to simulate pay periods

    }
}