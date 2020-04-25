package ByCompany.TTFjcjBzMGZ0.Easy;

public class ExcelSheetColumn {
    private String convertToTitle(int n) {
        StringBuilder str = new StringBuilder();

        while (n > 26) {
            if (n % 26 != 0) {
                str.append((char) ((n / 26) + 64));
                n %= 26;
            } else {
                str.append((char) ((n / 26) + 63));
                n -=1;
                n %= 26;
            }
        }
        return n==26 ? str.append((char) (n + 66)).toString() : str.append((char) (n + 64)).toString();
    }

    public static void main(String[] args) {
//        System.out.println(new ExcelSheetColumn().convertToTitle(1));
//        System.out.println(new ExcelSheetColumn().convertToTitle(28));
//        System.out.println(new ExcelSheetColumn().convertToTitle(701));
        System.out.println(new ExcelSheetColumn().convertToTitle(52));
    }
}
