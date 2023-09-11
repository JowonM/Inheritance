public class Worker extends Person {
    private double hourlyPayRate;
    public double calculateWeeklyPay(double hoursWorked){

        if(hoursWorked > 40){
            return this.hourlyPayRate * ((hoursWorked-40)*1.5);

        }
        if (hoursWorked == 40){
            return this.hourlyPayRate * 1.5 * hoursWorked;
        }
        else {
            return this.hourlyPayRate * hoursWorked;
        }
    }
    public String displayWeeklyPay(double hoursWorked){
        double timeInHalf = 1.5*(hoursWorked- 40);
        double timeInHalfPay = timeInHalf * this.hourlyPayRate;
        if (hoursWorked >=40){
            return "You worked " + hoursWorked + " hours. " +(hoursWorked-40) + " of them were Overtime. You made " + (40*this.hourlyPayRate) + "$ of regular pay, and " + timeInHalfPay + "$ of Overtime pay. in total, you made " + (timeInHalfPay+40*this.hourlyPayRate) + "$ this pay period.";
        }
        else {
            return " You worked 0 Overtime hours. You made " + hoursWorked*this.hourlyPayRate + "$ this pay period.";
        }





    }

    public Worker(String firstName, String lastName, String title, String idNum, int YOB, double hourlyPayRate) {
        super(firstName, lastName, title, idNum, YOB);
        this.hourlyPayRate = hourlyPayRate;
    }
}
