package day13;

public class Task1 {
    public static void main(String[] args) {
        MessageDatabase messageDatabase = new MessageDatabase();
        User user = new User("Кирилл");
        User user1 = new User("Иван");
        User user2 = new User("Dmitrii");
        user.sendMessage(user1,"Привет");
        user.sendMessage(user1,"Как дела?");
        user1.sendMessage(user,"Привет");
        user1.sendMessage(user,"Да нормально. Сам как?");
        user1.sendMessage(user,"Как жизнь?");
        user2.sendMessage(user,"Привет");
        user2.sendMessage(user,"Как сам?");
        user2.sendMessage(user,"Как жизнь?");
        user.sendMessage(user2,"Привет");
        user.sendMessage(user2,"Отлично");
        user.sendMessage(user2,"Все хорошо, а у тебя?");
        user2.sendMessage(user,"Все путем");
        MessageDatabase.showDialog(user,user2);
    }
}
