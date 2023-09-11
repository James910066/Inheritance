public class SalaryWorker extends Worker
{
    double annualSalary = 0.0;

    public SalaryWorker(String ID, String firstName, String lastName, String title, int YOB, double hourlyPayRate) //Constructor
    {
        super(ID, firstName, lastName, title, YOB, hourlyPayRate);
        this.annualSalary = annualSalary;
    }
    public SalaryWorker(String ID, String firstName, String lastName, int YOB, double hourlyPayRate) //CAll Constructor from Person
    {
        super(ID, firstName, lastName, YOB, hourlyPayRate);
        this.calculateWeeklyPay(45);
    }
    public double getAnnualSalary()
    {
        return annualSalary;
    }
    @Override
    public double calculateWeeklyPay(double hoursWorked)
    {
        return super.calculateWeeklyPay(hoursWorked);
    }
    public String displayWeeklyPay()
    {   double weeklyPay;
        //return super.displayWeeklyPay(hoursWorked);
        weeklyPay = calculateAnnualSalary() / 52;
        return "Weekly pay is " + weeklyPay;
    }
    public void setAnnualSalary(double annualSalary)
    {
        this.annualSalary = annualSalary;
    }

    @Override
    public String toString()
    {
        return "SalaryWorker{" +
                "annualSalary=" + annualSalary +
                ", hourlyPayRate=" + hourlyPayRate +
                '}';
    }
    public double calculateAnnualSalary() //Salary is based on hourly rate * 40 hours since this is all criteria I am given in assignment
    {
        double rate;
        rate = super.getHourlyPayRate();
        double totalPay = 0.0;
        annualSalary = 40 * rate * 52; //divide by 2 is not needed.
        return annualSalary;
    }
}
