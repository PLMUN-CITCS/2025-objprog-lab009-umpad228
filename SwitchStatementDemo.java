public class SwitchStatementDemo {
    public static void main(String[] args) {
        // Declare and initialize dayOfWeek
        int dayOfWeek = 4; // Example: Wednesday

        // Switch statement for day of the week
        switch (dayOfWeek) {
            case 1:
                System.out.println("Monday: Start of the work week.");
                break;
            case 2:
                System.out.println("Tuesday: Keep going!");
                break;
            case 3:
                System.out.println("Wednesday: Midweek.");
                break;
            case 4:
                System.out.println("Thursday: Almost there.");
                break;
            case 5:
                System.out.println("Friday: Weekend is near.");
                break;
            case 6:
                System.out.println("Saturday: Enjoy your day off!");
                break;
            case 7:
                System.out.println("Sunday: Rest and recharge.");
                break;
            default:
                System.out.println("Invalid day.");
        }

        // Declare and initialize studentGrade
        char studentGrade = 'B';

        // Switch statement for student grade
        switch (studentGrade) {
            case 'A':
                System.out.println("Excellent!");
                break;
            case 'B':
                System.out.println("Good job!");
                break;
            case 'C':
                System.out.println("Well done!");
                break;
            case 'D':
                System.out.println("You passed.");
                break;
            case 'F':
                System.out.println("Better luck next time.");
                break;
            default:
                System.out.println("Invalid grade.");
        }
    }
}
