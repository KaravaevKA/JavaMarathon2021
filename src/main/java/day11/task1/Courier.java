package day11.task1;

public class Courier implements Worker{
    private int salary;

    private static final int SALARY = 100;

    private Warehouse warehouse;

    private boolean isPayed;


    public int getSalary() {
        return salary;
    }

    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    @Override
    public void doWork() {

        salary += SALARY;
        warehouse.incrementCountDeliveredOrders();

    }

    @Override
    public String toString() {
        return "Courier{" +
                "salary=" + salary +
                ", isPayed=" + isPayed +
                '}';
    }

    @Override
    public void bonus() {
        if (warehouse.getCountDeliveredOrders() < 10000){
            System.out.println("Бонус пока не доступен");
            return;
        }
        if(isPayed) {
            System.out.println("Бонус уже был выплачен");
            return;
        }

        salary += 50000;
        isPayed = true;

    }


}
