import java.util.Arrays;

public class MyArray {
    public static <T> boolean compareArrays(T[] first, T[] second){
        if(first.length!= second.length){
            return false;
        }
        for (int i = 0; i < first.length; i++) {
            if (!Arrays.equals(first, second)){
                return false;
            }
        }
        return true;
    }
}
