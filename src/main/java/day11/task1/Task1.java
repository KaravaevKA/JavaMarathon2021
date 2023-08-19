package day11.task1;

public class Task1 {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Picker picker = new Picker(warehouse);
        Courier courier = new Courier(warehouse);

        businessProcess(picker);
        System.out.println(picker.toString());
        System.out.println(warehouse.toString());
        businessProcess(courier);
        System.out.println(courier.toString());
        System.out.println(warehouse.toString());
    }

    public static void businessProcess(Worker worker) {
        for (int i = 1; i <= 10000; i++) {
            worker.doWork();
        }
        worker.bonus();
    }
}
