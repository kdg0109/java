package sumpack;

public class Sum {

	public static int getNum(boolean check){
		if(check)	return 3;
		else		return 2;
	}
	
	//Ȧ���� true, ¦���� false
	public static boolean getType(int num){
		if(num % 2 == 0)	return false;
		else				return true;
	}
}
