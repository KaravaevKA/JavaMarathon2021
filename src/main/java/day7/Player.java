package day7;

public class Player {
    private static final int MAX_STAMINA = 100;
    private static final int MIN_STAMINA = 0;
    private int stamina;

    private static int countPlayers;

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getCountPlayers() {
        return countPlayers;
    }

    public void setCountPlayers(int countPlayers) {
        Player.countPlayers = countPlayers;
    }

    public void run(){
        if (stamina == 0)
            return;
        stamina --;
        if (stamina == 0)
            countPlayers--;
    }

    public static void info(){
        int difference = 6 - countPlayers;
        if (difference > 0 ){
            System.out.println("Есть еще " + difference + " свободных мкест");
        }
        else
            System.out.println("На поле нет свободных мест");
    }

    public Player( int stamina) {
        this.stamina = stamina;
        if (countPlayers <6)
            countPlayers++;
    }
}


