package core_java3;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "abcdef";
	      String reverse = new StringBuffer(string).reverse().toString();
	      System.out.println("\nString before reverse: "+string);
	      System.out.println("String after reverse: "+reverse);

	}

}
