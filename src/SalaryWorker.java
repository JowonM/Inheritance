public class SalaryWorker extends Worker {
    private double annualSalary;

    public SalaryWorker(String firstName, String lastName, String title, String idNum, int YOB, double hourlyPayRate, double annualSalary) {
        super(firstName, lastName, title, idNum, YOB, hourlyPayRate);
        this.annualSalary = annualSalary;
    }
    public double calculateWeeklyPay(double hoursWorked){
        return this.annualSalary/52;
    }
    public String displayWeeklyPay(double hoursWorked){
        return "Your weekly pay is a 1/52 of your yearly salary. (" + (this.annualSalary/52)+ ")";

    }
}
