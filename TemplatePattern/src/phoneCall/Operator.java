package phoneCall;

public abstract class Operator {
	private long callStartTime;
	private long callEndTime;
	public double calculateCallCost() {
		long spentTime = calculateSpentTime();
		
		if(isPeakHour()) {
			return getPeakHourBill(spentTime);
		}
		else {
			return getOffPeakBill(spentTime);
		}
	}
	
	abstract Boolean isPeakHour();
	abstract double getPeakHourBill(long spentTime);
	abstract double getOffPeakBill(long spentTime);

	public void setTime(long callStartTime,long callEndTime) {
		this.callStartTime = callStartTime;
		this.callEndTime = callEndTime;
	}
	
	public long calculateSpentTime() {
		return (callEndTime - callStartTime)/1000000000;
	}
	
	

}
