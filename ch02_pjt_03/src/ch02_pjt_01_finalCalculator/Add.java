package ch02_pjt_01_finalCalculator;

public class Add implements ICalculator {
	@Override
	public int doOperation(int firstNum, int secondNum) {
		return firstNum + secondNum;
	}
}