package _10_날짜와시간;

        import java.text.ParseException;
        import java.text.SimpleDateFormat;
        import java.util.Calendar;
        import java.util.Date;
        import java.util.Scanner; // Import the Scanner class

public class _15_simpleDataFormat_입력받기 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object

        System.out.println("날짜와 시간을 입력해주세요 (예: 2025-07-16 14:30:00):");
        String userInput = scanner.nextLine(); // Read user input as a string

        // Define the expected format for user input
        SimpleDateFormat inputSdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        try {
            // Parse the user's input string into a Date object
            Date parsedDate = inputSdf.parse(userInput);

            System.out.println("\n사용자가 입력한 날짜와 시간:");
            System.out.println("  " + parsedDate); // Prints the Date object's default toString()

            // You can now format this parsedDate using your existing SimpleDateFormat objects
            SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
            SimpleDateFormat sdf2 = new SimpleDateFormat("yy년 MMM dd일 E요일");
            SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss a");

            System.out.println("\n다양한 형식으로 출력:");
            System.out.println("  " + sdf1.format(parsedDate));
            System.out.println("  " + sdf2.format(parsedDate));
            System.out.println("  " + sdf3.format(parsedDate));
            System.out.println("  " + sdf4.format(parsedDate));

        } catch (ParseException e) {
            System.out.println("⚠️ 입력 형식이 올바르지 않습니다. 'yyyy-MM-dd HH:mm:ss' 형식으로 입력해주세요.");
        } finally {
            scanner.close(); // Close the scanner to prevent resource leaks
        }
        Calendar getCalendar = Calendar.getInstance();

    }
}