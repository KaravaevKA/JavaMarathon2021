package day13;

import java.util.List;

public class User {
    private String userName;
    private List<User> subscriptions;

    private List<User> friendList;

    public User(String userName) {
        this.userName = userName;
        this.subscriptions = subscriptions;
    }

    public String getUserName() {
        return userName;
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }

    public  void friendship( User user){
            this.friendList.add(user);
            user.friendList.add(this);
    }

    public void subscribe(User user){
        subscriptions.add(user);
        if (this.isSubscribed(user) && user.isSubscribed(this)){
            friendship(user);
            subscriptions.remove(user);
        }

    }

    public boolean isSubscribed(User user){
        return subscriptions.contains(user);
    }

    public boolean isFriend(User user){
        if (friendList.contains(user)){
            return true;
        }else
            return false;
    }

    public void sendMessage(User user, String text){
        MessageDatabase.addNewMessage(this,user,text);
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                '}';
    }
}
