import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Task4 {

    /**
     * ალგორითმი იყენებს ჰეშმეპს. მუშაობს წრფივ დროსა და სივრცეში
     */
    public  static int[] findIntersection(int[] nums1, int[] nums2){
        // ერთი სეტში გადმოვიტანოთ nums1
        Set<Integer> nums1_set = new HashSet<>();
        for(int num : nums1){
            nums1_set.add(num);
        }
        // მეორე სეში ვდებთ რიცხვებს, რომლებიც საერთოა
        Set<Integer> answer_set = new HashSet<>();
        for(int num : nums2 ){
            if(nums1_set.contains(num)){
                answer_set.add(num);
            }
        }
        int[] ans = new int[answer_set.size()];
        int i = 0;
        for(int e : answer_set){
            ans[i++] = e;
        }
        return ans;
    }


    public static void main(String[] args) {
        int[] nums1 = {1,2,3,4,5};
        int[] nums2 = {3,4,4,5,6,7};
        System.out.println(Arrays.toString(findIntersection(nums1, nums2)));
    }
}
