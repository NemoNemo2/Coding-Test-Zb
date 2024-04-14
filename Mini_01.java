/* 
  제목 : 구구단
  이름 : 박강민 
*/

public class Gugudan {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.printf( "%02d" + " X " + "%02d" + " = " + String.format("%02d", i * j) + "  ", j, i);
            }
            System.out.println();
        }

    }
}
