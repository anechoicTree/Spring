package hello;

public class MyPrinter {

	public void print(String text) {
		System.out.println(text);
	}
	
	public void trans(ITranslator translator) {
		String text = translator.doTrans();
		System.out.println(text);
	}
}
