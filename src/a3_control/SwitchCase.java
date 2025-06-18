package a3_control;
import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        // switch-case 구문
        // 기본형태
        // switch(비교할값) {
        //     case 값1: 실행코드 break;
        //     case 값2: 실행코드 break;
        //     default: 실행코드
        // }
        int a = 2;
        switch (a) {
            case 1:
                System.out.println("A");
                break;
            case 2:
                System.out.println("B");
                break;
            case 3:
                System.out.println("C");
                break;
            default:
                System.out.println("D");
        }

        Scanner scanner = new Scanner(System.in); // Scanner 기능을 활성화
        System.out.println("요일을 입력해주세요: ");
        String day = scanner.nextLine(); // 문자열 유저입력
        switch (day) {
            case "월":
            case "월요일":
                System.out.println("월요일입니다."); break;
            case "화":
            case "화요일":
                System.out.println("화요일입니다."); break;
            case "수":
            case "수요일":
                System.out.println("수요일입니다."); break;
            case "목":
            case "목요일":
                System.out.println("목요일입니다."); break;
            case "금":
            case "금요일":
                System.out.println("금요일입니다."); break;
            case "토":
            case "토요일":
            case "일":
            case "일요일":
                System.out.println("휴일입니다."); break;
            default: System.out.println("올바른 요일을 입력해주세요.");
        }
    }
}








