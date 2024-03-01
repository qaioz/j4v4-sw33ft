public class Task1 {


    /**
     * ვინაიდან ამოცანაში აშკარად სიტყვიერად დაზუსტებული არ იყო უნდა გავითვალისწინოთ თუ არა "-" როგორც
     * ნიშნის ოპერატორი(unary operator), ჩავთვალე რომ 12 + 3 -- 4 ინპუთიც ვალიდურია და უნდა დააბრუნოს 19
     */

    public static int evaluateExpression(String expression) {
        expression = expression.replaceAll("\\s+", ""); // მოვაცილოთ ზედმეტი სპეისები
        int result = 0;
        int sign = 1;
        int i = 0;
        while (i < expression.length()) {
            char c = expression.charAt(i);
            if (c == '+') {
                sign = 1;
                i++;
            } else if (c == '-') {
                while (c == '-') {
                    sign *= -1; // ერთმანეთის მომდევნო მინუსები ნიშანს ცვლიან
                    c = expression.charAt(++i);  // ვვარაუდობ ვალიდურია და რომ i საზღვარს არ სცდება
                }
            } else {
                int j = i + 1;
                while (j != expression.length() && expression.charAt(j) != '-' && expression.charAt(j) != '+') {
                    j++;
                }
                result += sign * Integer.parseInt(expression.substring(i, j));
                i = j;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(evaluateExpression("5+20-8+5")); // 22
        System.out.println(evaluateExpression("100--10-10")); // 100
        System.out.println(evaluateExpression("12-1+2")); // 13
        System.out.println(evaluateExpression("42 - 42 + 0 - 123")); //-123
        System.out.println(evaluateExpression("1")); // 1
        System.out.println(evaluateExpression("-1")); //-1
        System.out.println(evaluateExpression("----112")); // 112
    }

}
