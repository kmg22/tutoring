import java.util.Scanner;

public class Baek_2635 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int cnt = 1;
        int nextNum = (int)(Math.random()*(num-1)+1);
        // 랜덤한 값 1~(firstNum-1)까지의 수 지정

        int x = num, y = nextNum;
        while(y>0){
            int temp = y;
            y = x-y;
            x = temp;
            cnt++;
        }
        System.out.println(cnt);

        x = num;
        y = nextNum;
        while(x>0) {
            System.out.print(x + " ");
            int temp = y;
            y = x-y;
            x = temp;
        }
        scan.close();
    }
}
