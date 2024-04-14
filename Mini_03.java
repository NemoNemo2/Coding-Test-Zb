/*
    놀이동산 입장권 계산
    박강민
*/

import java.util.Scanner;

public class Attraction {


    public static void main(String[] args) {
        int price, age, time;
        char merit,card; // 국가유공자, 복지카드 
        
        Scanner sc = new Scanner(System.in);

        System.out.println("[입장권 계산]");
        System.out.print("나이를 입력해 주세요.(숫자)");
        age = sc.nextInt();
        System.out.print("입장시간을 입력해주세요. (숫자입력):");
        time = sc.nextInt();
        System.out.print("국가유공자 여부를 입력해 주세요. (y/n):");
        merit = sc.next().charAt(0);
        System.out.print("복지카드 여부를 입력해 주세요. (y/n):");
        card = sc.next().charAt(0);


        if (age < 3){
            price = 0;
        } else if (age < 13 && time >= 17) {
            price = 4000; // 13세 미만 특별할인, 시간 할인 중복 안됨.
        } else if (merit == 'y' || card == 'y') {
            price = 8000;
        } else {
            price = 10000; // 기본료
        }
        System.out.printf("입장권 : %d", price);
        }

    }

