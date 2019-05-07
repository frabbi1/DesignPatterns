package classW;

public class Colleague {
	public Mediator mediator;
	public Colleague(Mediator med) {
		this.mediator = med;
		mediator.addColleague(this);
	}
	
	public void send(String msg) {
		mediator.send(msg);
		
	}
	public void recieve(String msg) {
		System.out.println("Recieved " + msg + " " + this.toString());
		
	}

}
