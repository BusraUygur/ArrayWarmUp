import java.util.Arrays;

public class ArrayClass {

	 static void main(String[] args) {

		long[] num = { 3, 5, 1, 2, 4 };
		String[] str = { " can", "Dana", "aikafddhgfgddjhvg", "!busra", "Aylul" };

		Arrays.sort(num);
		// for (long i : num) {
		// System.out.println("long is " + i);
		// }

		Arrays.sort(str);
		System.out.println(Arrays.toString(num));
		System.out.println(Arrays.toString(str));

		String s = Arrays.toString(str);
		System.out.println(s.charAt(0));
		
		System.out.println("It is in GitHup now!!!!!");
	}

}
 

