
public class PrinterTest {

	public static void main(String[] args) {
		
		StringPrinter s = new StringPrinter();
		String[] str={"apple","banana","orange"};
		s.printAllArray(str);
		
		s.printAllString("apple", "pear", "something", "more");
		s.printAllString("something", "more");

	}

}
