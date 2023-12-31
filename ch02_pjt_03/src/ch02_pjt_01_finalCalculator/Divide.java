package ch02_pjt_01_finalCalculator;

public class Divide implements ICalculator {
	@Override
	public int doOperation(int firstNum, int secondNum) {
		if (secondNum == 0) {
			throw new ArithmeticException("0으로 나눌 수 없습니다");
		}
		return firstNum / secondNum;
	}
}