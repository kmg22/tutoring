import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Baek_2635 {
    void numsOfRule(int current, int next){
        while(current>=next) {
            System.out.print(current + " ");
            int tmp = next;
            next = current - next;
            current = tmp;
        }
        System.out.print(current + " ");
        if(current < next){
            System.out.print(next + " ");
        }
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        scan.close();

        //List<Integer> arr = new ArrayList<Integer>(); // 비교 배열
        //List<Integer> answer = new ArrayList<Integer>(); // 최대 단계 수 가진 배열

        /** 기본적으로 배열이 이어지려면
         * 1. 다음 수가 현재 수보다 크거나 같으면 안 됨 // 즉시 종료
         * // 현재 수 - 다음 수 > 0
         * 2. 다음 수가 현재 수의 절반 이하면 안 됨 // 한 단계 더하고 종료
         * (3. 모든 배열은 기본 2 단계 이상)
        */

        /**
        // 10 10 0
        // 10 9 1 8
        // 10 8 2 6
        // 10 7 3 4
        // 10 6 4 2 2 0
        // 10 5 5
        // 10 4 6
        // 10 3 7
        // 10 2 8
        // 10 1 9

        // 5 5 0
        // 5 4 1
        // 5 3 2 1 1 0 1
        // 5 2 3
        // 5 1 4

        // 20 15 5 10
        // 20 14 6 8
        // 20 13 7 6 1 5
        // 20 12 8 4 4
        // 20 11 9 2 7
        // 20 10 10 0
        // 20 9 11
        // 20 8 12

         // 3 3 0
         // 3 2 1 1 0 1
         // 3 1 2

         // 2 2 0
         // 2 1 1 0 1 (-1)

        // 1 1 0 1 (-1)
        */

        int Max_cnt = 0; // 최대 단계
        int secondNum = num; // 최대 단계 수 높은 것의 두 번째 수
        /*
        if(num==1){
            Max_cnt = 3;
            secondNum = num;

            System.out.println(Max_cnt);
            System.out.println(secondNum);
        }
        */
        //else {
            for (int i = 1; i <= num; i++) {
                int current = num;// 현재 단계에 있는 수
                int next = i;
                int cnt = 2; // 현재 단계

                while (current >= next) {
                    int tmp = next;
                    next = current - next;
                    current = tmp;
                    cnt++;
                }
                if (cnt >= Max_cnt) {
                    Max_cnt = cnt;
                    secondNum = i;
                }
            }
        //}
        System.out.println(Max_cnt);

        Baek_2635 x = new Baek_2635();
        x.numsOfRule(num, secondNum);
        }
}
