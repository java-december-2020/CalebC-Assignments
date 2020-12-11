import java.util.HashMap;
import java.util.Set;

public class HashMapFun {
    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("Black Dog", "Hey, hey, mama, said the way you move...");
        trackList.put("Stairway to Heaven", "There's a lady who's sure all that glitters is gold...");
        trackList.put("Going to California", "Spent my days with a woman unkind Smoked my stuff and drank, all my wine...");
        trackList.put("When the Levee Breaks", "If it keeps on raining, levee's going to break If it keeps on raining, the levee's going to break...");

        String track = trackList.get("Going to California");
        System.out.println(track);

        Set<String> keys = trackList.keySet();
        for(String key : keys) {
            System.out.println(key);
            System.out.println(trackList.get(key)); 
        }
    }
}