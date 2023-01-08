import java.util.Scanner;

public class moneyToCh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String [] bit = {"元","拾","佰","仟","万","拾","佰"};
        String money = sc.next();

        char[] c = new char[money.length()];
        String a = "";
        for (int i = 0; i < money.length(); i++) {
            char num = money.charAt(i);
           switch (num){
                case '0':
                    num = '零';
                    break;
                case '1':
                    num = '壹';
                    break;
                case '2':
                    num = '贰';
                    break;
                case '3':
                    num = '叁';
                    break;
                case '4':
                    num = '肆';
                    break;
                case '5':
                    num = '伍';
                    break;
                case '6':
                    num = '陆';
                    break;
                case '7':
                    num = '柒';
                    break;
                case '8':
                    num = '捌';
                    break;
                case '9':
                    num = '玖';
                    break;
            }

            a = a + num + bit[money.length()-1-i];
        }

        System.out.println(a);


    }
}
