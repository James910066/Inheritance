public class Worker extends Person
{
    double hourlyPayRate = 0.0;

    public Worker(String ID, String firstName, String lastName, String title, int YOB, double hourlyPayRate) //Constructor
    {
        super(ID, firstName, lastName, title, YOB);
        this.hourlyPayRate = hourlyPayRate;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "hourlyPayRate=" + hourlyPayRate +
                '}';
    }
    public double getHourlyPayRate() {
        return hourlyPayRate;
    }

    public void setHourlyPayRate(double hourlyPayRate) {
        this.hourlyPayRate = hourlyPayRate;
    }

    public Worker(String ID, String firstName, String lastName, int YOB, double hourlyPayRate)
    {
        super(ID, firstName, lastName, YOB);
        this.hourlyPayRate = hourlyPayRate;
    }
    public double calculateWeeklyPay(double hoursWorked)
    {
        double OTPay = 0;
        double totalPay = 0;
        double OTRate = 0;
        double OTHours = 0;
        double hourlyRate = 20.00;
        final double standardHours = 40;
        double standardWeeklyPay = standardHours * hourlyRate;

        if (hoursWorked > standardHours)
        {
            OTHours = hoursWorked - standardHours;
            OTRate = hourlyRate * .5 + hourlyRate;
            OTPay = OTHours * OTRate;
            totalPay = OTPay + standardWeeklyPay;
        } else
        {
            totalPay = hoursWorked * hourlyRate;
        }
        return totalPay;
    }

    public String displayWeeklyPay(double hoursWorked)
    {
        String checkStub = "";
        double OTPay = 0;
        double totalPay = 0;
        double OTRate = 0;
        double OTHours = 0;
        double hourlyRate = 20.00;
        final double standardHours = 40;
        double standardWeeklyPay = standardHours * hourlyRate;

        if (hoursWorked > standardHours)
        {
            OTHours = hoursWorked - standardHours;
            OTRate = hourlyRate * .5 + hourlyRate;
            OTPay = OTHours * OTRate;
            totalPay = OTPay + standardWeeklyPay;
            checkStub = "OverTime hours = " + OTHours + "\n" + "OverTime Rate = " + OTRate + "\n" + "OverTime Pay = " + OTPay + "\n" + "Total weekly pay with OT is " + totalPay;
        } else
        {
            totalPay = hoursWorked * hourlyRate;
            checkStub = "Hours worked = " + hoursWorked + "\n" + "Hourly rate = " + hourlyRate + "\n" + "Total weekly pay with no OT is " + totalPay;
        }
                return checkStub;
    }

}
