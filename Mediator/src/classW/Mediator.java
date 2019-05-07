package classW;

import java.util.ArrayList;
import java.util.List;

public class Mediator {
	public List<Colleague> colg = new ArrayList<Colleague>();
	
	public void addColleague(Colleague c) {
		colg.add(c);
	}
	public void send(String msg) {
		for (Colleague colleague : colg) {
			colleague.recieve(msg);
			
		}
	}

}
