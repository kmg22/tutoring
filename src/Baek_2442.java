import java.util.Scanner;

public class Baek_2442 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        for(int i=1;i<=N;i++) {
            int O = (2*N-1) - (2*i-1); // 각 행에 해당하는 공백의 개수
            // O은 짝수 (별의 개수가 홀수이기 때문)
            for(int k=0;k<(2*N-1);k++) {
                if (k < O / 2 || k >= (2*i-1)+O/2) {
                    if(k<O/2) // 앞 공백을 출력하는 경우
                        System.out.print(' ');
                }
                else
                    System.out.print('*');
            }
            System.out.println();
        }
        scan.close();
    }
}
