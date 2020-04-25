package FRQ;

public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	public static int[] getCubeTosses(NumberCube cube, int numTosses){
		int[] returnArray = new int[numTosses];
		for (int i=0; i<numTosses;i++){
			returnArray[i]=cube.toss();
		}
		return returnArray;
	}
	public static int getLongestRun(int[] values){
		int returnInt=0;
		int tempMax=0;
		for (int i=1;i<values.length;i++){
			if (values[i]==values[i-1]){
				tempMax++;
			}
			else{
				if(tempMax>returnInt){
					returnInt=tempMax;
				}
				tempMax=0;
			}
		}
		if(tempMax>returnInt){
			returnInt=tempMax;
		}
		tempMax=0;
		
		if (returnInt==0){
			returnInt=-1;
		}
		return returnInt;
	}

}