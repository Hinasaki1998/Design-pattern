package Third;
public class GreekAlphabet {

    public static void main(String[] args) {
        char cStart = '��', cEnd = '��';

        // ϣ����ĸ ��-��
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
        System.out.println("\'" + cStart + "\'��Unicode���е�˳��λ���ǣ�" + startPosition);
        System.out.println("\'" + cEnd + "\'��Unicode���е�˳��λ���ǣ�" + endPosition);
        System.out.println("���");
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
