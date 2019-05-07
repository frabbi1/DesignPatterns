package phoneCall;

import java.util.Calendar;

public class GrameenPhone extends Operator{
	
	private int peakHourStart=0;
	private int peakHourEnd=10;
	private double normalCallRate=1.7;
	private double peakHourRate=0.7;
	
	public GrameenPhone() {
		
	}
	
	
	public Boolean isPeakHour() {
		Calendar start = Calendar.getInstance();
        
		start.set(Calendar.HOUR_OF_DAY, peakHourStart);
		start.set(Calendar.MINUTE, 0);
		start.set(Calendar.SECOND, 0);
		start.set(Calendar.MILLISECOND, 0);
	      
	    boolean peakStart = Calendar.getInstance().after(start);
	     
	    Calendar end = Calendar.getInstance();
	        
		end.set(Calendar.HOUR_OF_DAY, peakHourEnd);
		end.set(Calendar.MINUTE, 0);
		end.set(Calendar.SECOND, 0);
		end.set(Calendar.MILLISECOND, 0);
	     
	    boolean peakEnd=Calendar.getInstance().before(end);
	     
	    if( peakStart && peakEnd)
	    {
	    	System.out.println("peak");
	    	return true;
	    }
	    else {
	    	System.out.println("off");
	    	return false;
	    }
	}
	
	public double getPeakHourBill(long spentTime) {
		return peakHourRate*spentTime;
	}
	public double getOffPeakBill(long spentTime) {
		return normalCallRate*spentTime;
	}

}
