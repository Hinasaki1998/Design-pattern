package Third;
public class GreekAlphabet {

    public static void main(String[] args) {
        char cStart = 'α', cEnd = 'ω';

        // 希腊字母 α-ω
        cvnvert(cStart, cEnd);

        System.out.println("\n");

        // a-z
        cStart = 'a';
        cEnd = 'z';
        cvnvert(cStart, cEnd);

        System.out.println("\n");

        // A-Z
        cStart = 'A';
        cEnd = 'Z';
        cvnvert(cStart, cEnd);

    }

    private static void cvnvert(char cStart, char cEnd) {
        int startPosition = 0, endPosition = 0;
        startPosition = (int) cStart;
        endPosition = (int) cEnd;
        System.out.println("\'" + cStart + "\'在Unicode表中的顺序位置是：" + startPosition);
        System.out.println("\'" + cEnd + "\'在Unicode表中的顺序位置是：" + endPosition);
        System.out.println("表格：");
        for (int i = startPosition; i <= endPosition; i++) {
            char c = '\0';
            c = (char) i;
            System.out.print(" " + c);
            if ((i - startPosition + 1) % 10 == 0) {
                System.out.println("");
            }
        }
    }

}
