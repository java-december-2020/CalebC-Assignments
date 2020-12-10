public class StringTest {
    public static void main(String[] args) {
        StringManipulation  manipulation = new StringManipulation();
        String str = manipulation.trimAndConcat("Hello","World");
		System.out.println(str); // HelloWorld 
		
		char letter = 'o';
		Integer A = manipulation.getIndexOrNull("Coding", letter);
		Integer B = manipulation.getIndexOrNull("Hello World", letter);
		Integer C = manipulation.getIndexOrNull("Hey", letter);
		System.out.println(A);
		System.out.println(B);
		System.out.println(C);
		
		String word = "Hello";
		String subString = "llo";
		String notSubString = "world";
		Integer X = manipulation.getIndexOrNull(word, subString);
		Integer Y = manipulation.getIndexOrNull(word, notSubString);
		System.out.println(X);
		System.out.println(Y);
		

		String word2 = manipulation.concatString2("Hello", 1, 2, "world");
		System.out.println(word2);

    }
}