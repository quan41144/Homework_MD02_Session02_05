import java.util.Scanner;

public class hwss0205 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 100 || n > 999) {
            System.out.println("Số nhập vào không hợp lệ");
        }
        else {
            int a, b, c;
            a = n / 100;
            b = (n / 10) % 10;
            c = n % 10;
            String res = "";
            String hangdvi;
            String hangchuc = "";
            String hangtram = "";
            switch (c) {
                case 1:
                    hangdvi = " một";
                    break;
                case 2:
                    hangdvi = " hai";
                    break;
                case 3:
                    hangdvi = " ba";
                    break;
                case 4:
                    hangdvi = " tư";
                    break;
                case 5:
                    if (b == 0) hangdvi = " năm";
                    else hangdvi = " lăm";
                    break;
                case 6:
                    hangdvi = " sáu";
                    break;
                case 7:
                    hangdvi = " bảy";
                    break;
                case 8:
                    hangdvi = " tám";
                    break;
                case 9:
                    hangdvi = " chín";
                    break;
                default:
                    hangdvi = "";
                    break;
            }
            switch (b) {
                case 0:
                    if (c > 0) hangchuc = " lẻ";
                    break;
                case 1:
                    hangchuc = " mười";
                    break;
                case 2:
                    hangchuc = " hai mươi";
                    break;
                case 3:
                    hangchuc = " ba mươi";
                    break;
                case 4:
                    hangchuc = " bốn mươi";
                    break;
                case 5:
                    hangchuc = " năm mươi";
                    break;
                case 6:
                    hangchuc = " sáu mươi";
                    break;
                case 7:
                    hangchuc = " bảy mươi";
                    break;
                case 8:
                    hangchuc = " tám mươi";
                    break;
                case 9:
                    hangchuc = " chín mươi";
                    break;
                default:
                    break;
            }
            switch (a) {
                case 1:
                    hangtram = "Một trăm";
                    break;
                case 2:
                    hangtram = "Hai trăm";
                    break;
                case 3:
                    hangtram = "Ba trăm";
                    break;
                case 4:
                    hangtram = "Bốn trăm";
                    break;
                case 5:
                    hangtram = "Năm trăm";
                    break;
                case 6:
                    hangtram = "Sáu trăm";
                    break;
                case 7:
                    hangtram = "Bảy trăm";
                    break;
                case 8:
                    hangtram = "Tám trăm";
                    break;
                case 9:
                    hangtram = "Chín trăm";
                    break;
                default:
                    break;
            }
            res += (hangtram + hangchuc + hangdvi);
            System.out.println(res);
        }
    }
}
