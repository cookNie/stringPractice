import java.util.Scanner;

public class changeCompare {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个字符串：");
        String str1 = sc.next();
        System.out.println("请输入第二个字符串：");
        String str2 = sc.next();

        if (changeCom(str1,str2)){
            System.out.println(str1+"可以变成"+str2);
        }else{
            System.out.println(str1+"不能变成"+str2);
        }

    }

    public static boolean changeCom(String str1,String str2){
        boolean flag = false;
        int count = 0;
        String str = str1;
        for (int i = 0; i < str.length(); i++) {
            count++;
            char temp = str.charAt(0);
            str = str.substring(1) + temp;
            //System.out.println(str);

            if(str.equals(str2)){
                flag = true;
                break;
            }

        }

        System.out.println("经过"+count+"次后");
        return flag;
    }
}
