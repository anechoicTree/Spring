package ch02_pjt_01;

public class MyCalculator {

	public void calculate(int fNum, int sNum, ICalculator calculator) {
		int value = calculator.doOperation(fNum, sNum);
		System.out.println("result : " + value);
	}
	
//	public void addCalculate(int fNum, int sNum, CalAdd addCalculator) {
//		int value = addCalculator.doOperation(fNum, sNum);
//		System.out.println("result : " + value);
//	}
//	
//	public void subCalculate(int fNum, int sNum, CalSub subCalculator) {
//		int value = subCalculator.doOperation(fNum, sNum);
//		System.out.println("result : " + value);
//	}
//	
//	public void mulCalculate(int fNum, int sNum, CalAdd mulCalculator) {
//		int value = mulCalculator.doOperation(fNum, sNum);
//		System.out.println("result : " + value);
//	}
//	
//	public void divCalculate(int fNum, int sNum, CalAdd divCalculator) {
//		int value = divCalculator.doOperation(fNum, sNum);
//		System.out.println("result : " + value);
//	}

}
