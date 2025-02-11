public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static int sum(int num, int num2) {
		int additionResult;
		additionResult = num + num2;
		return additionResult;
	}

	public static int difference(int num3, int num4){
		int substrationResult;
		substrationResult = num3 - num4;
		return substrationResult;
	}

	public static double product(double num5, double num6){
		double result3;
		result3 = num5 * num6;
		return result3; 
	}

	public static String removeFirst(String word){
		String remove;
		remove = word.substring(1);
		return remove;
	}

	public static int combinedLength(String word2, String word3){
		int combinedLength;
		combinedLength = word2.length() + word3.length();
		return combinedLength;
	}

	public static int isEven(int num7){
		int isEven;
		isEven = (num7 % 2 == 0);
		return num7;
	}

	public static int isOdd(int num8){
		int isOdd;
		isOdd = (num8 % 2 != 0 );
		return num8;
	}


	
}
