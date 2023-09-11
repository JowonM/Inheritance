import java.util.ArrayList;

public class InheritanceDemo {
    public static void main(String[] args) {
        ArrayList<Worker> workers = new ArrayList<Worker>();

        Worker one = new Worker("Tim","A","Mr.","000001",1111,10.10);
        Worker two = new Worker("Dick","B","Mr.","000002",1112,20.20);
        Worker three = new Worker("Harry","C","Mr.","000003",1113,30.30);

        SalaryWorker sOne = new SalaryWorker("Jim","D","Mr.","000004",1114,40.40,58000.00);
        SalaryWorker sTwo = new SalaryWorker("Rick","E","Mr.","000005",1115,50.50,68000.00);
        SalaryWorker sThree = new SalaryWorker("Larry","F","Mr.","000006",1116,60.60,78000.00);

        workers.add(one);
        workers.add(two);
        workers.add(three);

        workers.add(sOne);
        workers.add(sTwo);
        workers.add(sThree);
        System.out.println("==================================================");
        System.out.println("WorkerID  FirstName   LastName   Title   WeeklyPay");
        System.out.println("==================================================");

        for (int i = 0; i < 6; i++) {
            System.out.print(workers.get(i)+ " , ");
            System.out.println((workers.get(i)).calculateWeeklyPay(40));
        }
        System.out.println("==================================================");
        System.out.println("                     Week 2                       ");
        System.out.println("==================================================");
        for (int i = 0; i < 6; i++) {
            System.out.print(workers.get(i) + " , ");
            System.out.println((workers.get(i)).calculateWeeklyPay(50));
        }
        System.out.println("==================================================");
        System.out.println("                     Week 3                      ");
        System.out.println("==================================================");
        for (int i = 0; i < 6; i++) {
            System.out.print(workers.get(i)+" , ");
            System.out.println((workers.get(i)).calculateWeeklyPay(40));

        }
        System.out.println("==================================================");






    }
}