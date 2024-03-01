import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Task5 {

    /**
     * ვიყენებ რეკურსიას, ბრუტ ფორსით
     */
    public static int lenOfLongSubarr(int[] array, int k) {
        int[] ans = {0};
        helper(array, k, ans, 0, 0,0);
        return ans[0];
    }

    /**
     * ცოტა რთული იყო ამის ჰეშით ოპტიმიაზაცია, ასევე რეკურსიას ვერ შევწყვიტავდი თუ currSum == k რადგან
     * პირობაში უარყოფით რიცხვებზე შეზღუდვა არრა.
     */
    public static void helper(int[] array, int k, int[] ans, int currSum, int i, int len) {
        if(currSum == k){
            ans[0] = Math.max(ans[0], len);
        }
        if (i >= array.length) return;

        // გვაქვს ორი არჩევანი: შევიყვანოთ ეს ელემენტი თუ არა
        helper(array, k, ans, currSum + array[i], i + 1, len +1);
        if(array[i] != 0) {
            //მეორე შემთხვევაში წავიდეთ როცა ნულს არ უდრის
            helper(array, k, ans, currSum, i + 1, len);
        }
    }

    public static void main(String[] args) {
        int[] array = {6, 8,8,8,0,1,-10,10};
//        array = new int[]{1,2,6};
        int k = 8;
        System.out.println(lenOfLongSubarr(array, 8));
    }
}
