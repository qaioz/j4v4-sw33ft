import java.util.List;

public class Task2 {

    /**
        ვვარაუდობ არ უნდა შევამოწმო სწტრინში სხვა სიმბოლოების არსებობა.
        ცოტა დამაბნეველი იყო პირობაში მითითება რომ სტრინში მხოლოდ 'a', ,'b', 'c'
        ჩემი სულუშენი სხვა ასოების არსებობის შემთვევაშიც იმუშაობს წრფივ დროსა და მუდმივ სივცეში.
     */
    public static int numberOfHappyStrings(List<String> strings){
        int ans = 0;
        for(String s : strings) {
            if(isHappy(s)){
                ans++;
            }
        }
        return ans;
    }

    private static boolean isHappy(String str){
        for (int i = 1; i < str.length(); i++) {
            if(str.charAt(i) == str.charAt(i-1)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(numberOfHappyStrings(List.of("abbcc", "abc", "abcabc", "cabcbb"))); // 2
        System.out.println(numberOfHappyStrings(List.of("abc", "abcabc","a"))); // 3
        System.out.println(numberOfHappyStrings(List.of("abcc", "aa", "abba","bbacac"))); // 0
    }


}
