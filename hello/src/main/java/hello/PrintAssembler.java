package hello;

public class PrintAssembler {

	MyPrinter printer;
	
	public PrintAssembler(MyPrinter printer) {
		this.printer = printer;
	}
	
	public void assemble() {
		printer.print("Hello maven project");
	}
}
