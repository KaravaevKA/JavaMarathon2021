package day11.task1;

public class Picker implements Worker {
    private int salary;
    private static final int SALARY = 80;

    private Warehouse warehouse;
    private boolean isPayed;




    public int getSalary() {
        return salary;
    }


    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;
    }


    @Override
    public String toString() {
        return "Picker{" +
                "salary=" + salary +
                ", isPayed=" + isPayed
                + '}';
    }

    @Override
    public void doWork() {
        salary += SALARY;
        warehouse.incrementCountPickedOrders();


    }

    @Override
    public void bonus() {
        if (warehouse.getCountPickedOrders() < 10000){
            System.out.println("Бонус пока не доступен");
            return;
        }
        if(isPayed) {
            System.out.println("Бонус уже был выплачен");
            return;
        }

        salary += 70000;
        isPayed = true;

    }
}
