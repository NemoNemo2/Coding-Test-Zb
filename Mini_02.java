/*
  제목 : 결제 금액 캐시백 계산 프로그램
  이름 : 박강민 
*/


import java.util.Scanner;

public class CashBack_Calculator {
    int price;

    public CashBack_Calculator(int price){
        this.price = price;
    }
    public double CashBack( ) {

        double cashRate[] = {0.1, 0.2, 0.3};
        double max_Cash_Rate = cashRate[2];
        int cash_Back_Max = 300;

        double cashback = price * cashRate[0];

      if (cashback > cash_Back_Max){
          cashback = cash_Back_Max;
      }

      if (cashRate[0] > max_Cash_Rate){
          cashback = price * cash_Back_Max;
      }

      return cashback;
    }

    public static void main(String[] args) {

        Scanner pay = new Scanner(System.in);

        System.out.println("[캐시백 계산]");
        System.out.printf("결재 금액을 입력해 주세요.(금액):  ");
        int price = pay.nextInt();

        CashBack_Calculator calculator = new CashBack_Calculator(price);
        double cashback = calculator.CashBack();
        System.out.printf("적립된 캐시백 : %.0f원입니다.", cashback );








    }


 }
