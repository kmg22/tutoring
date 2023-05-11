import java.util.Scanner;
class Option{
    int pcs; // 구매하려는 개수
    int price; // 가격
}
public class Baek_9325 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int testCase = scan.nextInt(); // 테스트케이스 개수
        int[] sumPrice = new int[testCase]; // 케이스 따른 합산 가격

        for(int k=0; k<testCase; k++) {
            int carPrice = scan.nextInt(); // 자동차 가격
            sumPrice[k] = carPrice;

            int optionType = scan.nextInt(); // 옵션 개수
            Option[] op = new Option[optionType]; // 옵션 저장하기
            for (int i = 0; i < optionType; i++) {
                op[i] = new Option();
                op[i].pcs = scan.nextInt();
                op[i].price = scan.nextInt();
                sumPrice[k] += op[i].pcs * op[i].price;
            }
        }
        for(int k=0;k<testCase;k++)
            System.out.println(sumPrice[k]);

        scan.close();
    }
}
