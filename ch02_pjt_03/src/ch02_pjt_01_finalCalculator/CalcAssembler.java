package ch02_pjt_01_finalCalculator;

public class CalcAssembler {
	
	public static ICalculator assemble(char operator) {
		switch (operator) {
			case '+': 
				return new Add();
			case '-': 
				return new Subtract();
			case '*': 
				return new Multiply();
			case '/': 
				return new Divide();
			case '%': 
				return new Modulo();
			default:
				throw new IllegalArgumentException("Invalid operator: " + operator);
		}
	}
}


//package ch02_pjt_01_finalCalculator;
//
//public class CalcAssembler {
//	ICalculator calculator;
//	
//	public static ICalculator assemble(char operator) {
//		return (
//			switch (operator) {
//				case '+': 
//					new Add();
//					break;
//				case '-': 
//					new Subtract();
//					break;
//				case '*': 
//					new Multiply();
//					break;
//				case '/': 
//					new Divide();
//					break;
//				case '%': 
//					new Modulo();
//					break;
//				default: throw new IllegalArgumentException();
//					break;
//			};
//		);
//	}
//}