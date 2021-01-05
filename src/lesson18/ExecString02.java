package lesson18;

public class ExecString02 {
    public static void main(String[] args) {
        System.out.println(countCode("aaacodebbb"));//1
        System.out.println(countCode("codexxcode"));//2
        System.out.println(countCode("cozexxcope"));//2

    }

    private static int countCode(String input) {
        //charAt
        //если code равен буквам с индексом 0,1,2,3, то тогда 1
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'c'
                    && input.charAt(i + 1) == 'o'
                    && input.charAt(i + 3) == 'e') {
                count++;
            }
        }
        return count;
    }
}
