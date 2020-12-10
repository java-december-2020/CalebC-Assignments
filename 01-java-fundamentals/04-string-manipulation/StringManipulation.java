public class StringManipulation {
    public String trimAndConcat(String string1, String string2){
        return string1.trim().concat(string2.trim());
    }
    public Integer getIndexOrNull(String input, char C){
        if(input.indexOf(C) == -1){
            return null;
        }
        return input.indexOf(C);
    }
    public Integer getIndexOrNull(String input, String sub) {
        if(input.indexOf(sub) == -1) {
            return null;
        }
        return input.indexOf(sub);
    }
    public String concatString2(String input, int A, int B, String replacement) {
        String substr;
        try{
            substr = input.substring(A, B);
        }
        catch(IndexOutOfBoundsException x) {
            System.out.println(String.format("Exception: %s", x));
            substr = "Big Nope";
        }

        return substr.concat(replacement);
    }


}