package hello;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx =
				new GenericXmlApplicationContext("classpath:applicationContext.xml");
		
		PrintAssembler printAssembler = 
				ctx.getBean("printAssembler", PrintAssembler.class);
		
		printAssembler.assemble();
		
		ctx.close();
		}

}