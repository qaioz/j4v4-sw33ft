public class Task6 {
    public static boolean isValidSequence(int[] array, int[] sequence){
        int idx = 0; // ეხლა სიქვენსის რომელ რიცხვს ვეძებთ
        for (int j : array) {
            if (j == sequence[idx]) { // მივაგენით მაგ რიცხვს
                idx++;
                if (idx == sequence.length) return true;  // თუ ყველა ინდექსს მივაგენით, ტრუე
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] array = {5,1,22,25,6,-1,8,10};
        int[] sequence = {1,12,6};
        System.out.println(isValidSequence(array, sequence));
    }
}
