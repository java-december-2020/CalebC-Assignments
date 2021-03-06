
import java.util.*; 
// import java.util.List;
// import java.util.Collections; 
// import java.util.Arrays; 
// import java.util.Random;

public class PuzzleJava {
    public static ArrayList<Integer> sumAndGreaterThan10(int[] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
        System.out.println(sum); 
            }
            ArrayList<Integer> newArr = new ArrayList<Integer>(); 
        for(int x = 0; x < arr.length; x++){
            if(arr[x] > 10){
                newArr.add(arr[x]);
            }
        }
        return newArr;
    }
    public static void shuffleLessThanFive(String[] y) {
    Collections.shuffle(Arrays.asList(y));
    System.out.println(Arrays.asList(y));
    
    ArrayList<String> newArr = new ArrayList<String>();

    for(int i = 0; i < y.length; i++) {
        String currString = y[i];
        if(currString.length() > 5){
            newArr.add(currString);
        }
    }
    System.out.println(Arrays.asList(newArr));
    }
    public static boolean isVowel(char c) {
        return "AEIOUaeiou".indexOf(c) != -1;
        }
    public static void alphabetPuzzle(){
        ArrayList<Character> alphabet = new ArrayList<Character>();
        for(Character ch = 'A'; ch <= 'Z'; ch++){
            alphabet.add(ch);
            }
            Collections.shuffle(alphabet);
            System.out.println(alphabet.get(25));
            System.out.println(alphabet.get(0));
        if (isVowel(alphabet.get(0))){
            System.out.println("It is a vowel");
        }
    }
    
    public static int[] randomIntArr(int a, int b){
        int[] newArr = new int[10];
        int boundary = b - a; 
        Random r = new Random();

        for(int i = 0;i < newArr.length; i++){
            int randomNum = r.nextInt(boundary);
            newArr[i] = randomNum + a;
        }
        Arrays.toString(newArr); 
        return newArr; 
    }        

    public static void sortArray(int[] x){
        Arrays.sort(x);
        System.out.println(Arrays.toString(x)); 
        System.out.println(x[0]);
        System.out.println(x[x.length-1]);
    }

    public static String generateRandomChars(String candidateChars, int length) {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            sb.append(candidateChars.charAt(random.nextInt(candidateChars.length())));
        }
    
        return sb.toString();
    }

    public static void randStringArray(int length){
        ArrayList<String> ranStrArr = new ArrayList<String>();
        for(int t = 0; t < length; t++){
            ranStrArr.add(generateRandomChars("ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890",5));
        }
        System.out.println(ranStrArr);
    }



    public static void main(String[] args){
//     int[] y = {3,5,1,2,7,9,8,13,25,32};
//     String[] names = {"Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"};
// System.out.println(sumAndGreaterThan10(y));
// shuffleLessThanFive(names); 
alphabetPuzzle();
// randomIntArr(55, 100);
// sortArray(randomIntArr(55,100));
// System.out.println(generateRandomChars("abcdefghijklmnopqrstuvwxyz0123456789", 5));
// randStringArray(10);
    }
}