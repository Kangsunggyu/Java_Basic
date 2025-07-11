package _08_예외처리;

public class _11_메서드_예외_떠넘기기 {

    static class InvalidInputException extends Exception { // 사용자 예외 처리
        public InvalidInputException(String message) {
            super(message);
        }
    }

    public static int convertStringToNumber(String str) {
        System.out.println("문자열 \"" + str + "\"을(를) 숫자로 변환 시도.");
        return Integer.parseInt(str); // NumberFormatException 발생 가능
    }

    public static void processPositiveNumber(int number) throws InvalidInputException {
        System.out.println("숫자 " + number + " 처리 시작.");
        if (number < 0) { // 이런 예외는 컴파일러가 잡을 수 없고, 그렇기에 언체크드이다. 따라서 예외를 강제 생성하고, throws로 예외를 넘긴다. 여기서 try - catch를 해도 되지만 그냥 넘긴다

            throw new InvalidInputException("음수 값은 허용되지 않습니다: " + number); // 예외 강제 생성
        }
        System.out.println("숫자 " + number + " 처리 완료.");
    }


    public static void handleNumberInput(int value) throws InvalidInputException {
        System.out.println("handleNumberInput() 시작: " + value);
        processPositiveNumber(value);
        System.out.println("handleNumberInput() 종료.");
    }


    public static void main(String[] args) {
        System.out.println("메인 메서드 시작.");
        //(언체크드 예외) 예시 ---
        try {
            System.out.println("\n--- 숫자 변환 예시 (성공) ---");
            int num1 = convertStringToNumber("123");
            System.out.println("변환된 숫자: " + num1);

            System.out.println("\n--- 숫자 변환 예시 (실패) ---");
            int num2 = convertStringToNumber("abc");
            System.out.println("이 메시지는 출력되지 않습니다.");

        } catch (NumberFormatException e) {
            System.out.println("\n메인 메서드에서 NumberFormatException 발생: " + e.getMessage());
            System.out.println("유효한 숫자로 변환할 수 없습니다.");
        }

        // --- InvalidInputException (체크드 예외) 예시 ---
        try {
            System.out.println("\n--- 양수 처리 예시 (성공) ---");
            handleNumberInput(50);

            System.out.println("\n--- 양수 처리 예시 (실패) ---");
            handleNumberInput(-10); // InvalidInputException 발생
            System.out.println("이 메시지는 출력되지 않습니다.");

        } catch (InvalidInputException e) {
            System.out.println("\n메인 메서드에서 InvalidInputException 발생: " + e.getMessage());
            System.out.println("입력 값 조건을 다시 확인해주세요.");
        }

        System.out.println("\n메인 메서드 종료.");
    }
}