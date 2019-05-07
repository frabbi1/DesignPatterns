import java.util.ArrayList;
import java.util.List;

public class Subject {
	private List<Observer> users = new ArrayList<Observer>();
	public void register(Observer user) {
		users.add(user);
	}
	public void unregister(Observer user) {
		//users
		users.remove(user);
	}
	public void sendNotification(int price) {
		for (Observer user : users) {
			user.getNotification(price);
		}
	}
	public void updatePrice(int price) {
		sendNotification(price);
	}
	

}
