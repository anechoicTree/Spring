package hello;

import java.util.Scanner;

public class PrintAssembler {

	Scanner sc = new Scanner(System.in);
	int selectedLNum;
	MyPrinter printer;
	TransEng transEng;
	TransKor transKor;
	
	public PrintAssembler(MyPrinter printer, TransEng transEng, TransKor transKor) {
		this.printer = printer;
		this.transEng = transEng;
		this.transKor = transKor;
	}
	
	public void assemble() {
		
		printer.print("Select language! 1.korea, 2.english");
		selectedLNum = sc.nextInt();
		if (selectedLNum == 1) {
			printer.trans(transKor);
		} else if (selectedLNum == 2) {
			printer.trans(transEng);
		}
		
	}
}
