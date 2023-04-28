public class Main {
    public static void main(String[] args) {
        BinOps binOps = new BinOps();
        printString(binOps.sum("01010101", "00111111")); // 85 + 63
        printString(binOps.mult("01010101", "00111111")); // 85 * 63
    }

    private static void printString(String str) {
        char[] array = str.toCharArray();

        StringBuilder stringBuilder = new StringBuilder();
        int feet = str.length();
        if (feet % 4 == 0) {
            System.out.println(print(feet, array, stringBuilder));
        } else {
            int newFeet = (feet / 4 + 1) * 4;
            for (int i = 0; i < newFeet; i++) {
                if (newFeet - i != feet) {
                    stringBuilder.append('0');
                } else {
                    System.out.println(print(feet, array, stringBuilder));
                }
            }
        }
    }

    private static StringBuilder print(int feet, char[] array, StringBuilder stringBuilder) {
        int space = 0;

        for (int i = 0; i < feet; i++) {
            if ((stringBuilder.length() - space) % 4 == 0 && stringBuilder.length() != 0) {
                stringBuilder.append(' ');
                space++;
            }
            stringBuilder.append(array[i]);
        }
        return stringBuilder;
    }
}
