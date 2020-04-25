package FRQ;

public class Practice2 {

	private int[] chargeTable;
	
	private int getChargingCost (int startHour, int chargeTime)
	{
		int sum=0;
		for (int i=startHour; i<startHour+chargeTime; i++){
			sum=sum+chargeTable[i%24];
		}
		return sum;
	}
	public int getChargeStartTime(int chargeTime){
		int lowestCost=getChargingCost(0,chargeTime);
		int startHour=0;
		for (int i=0; i<24;i++){
			if (getChargingCost(i,chargeTime)<lowestCost){
				lowestCost=getChargingCost(i,chargeTime);
				startHour=i;
			}
		}
		return startHour;
	}

}