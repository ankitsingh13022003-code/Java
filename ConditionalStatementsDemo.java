public class ConditionalStatementsDemo {

    public static void main(String[] args) {

        int number = 25;

        //  1. if statement
        if (number > 20) {  // condition must be true
            System.out.println("IF: Number is greater than 20");
        }

        // 2. if-else statement
        if (number % 2 == 0) {
            System.out.println("IF-ELSE: Number is even");
        } else {
            System.out.println("IF-ELSE: Number is odd");
        }

        // 3. if-else-if ladder
        int marks = 72;

        if (marks >= 90) {
            System.out.println("IF-ELSE-IF: Grade A");
        } 
        else if (marks >= 75) {
            System.out.println("IF-ELSE-IF: Grade B");
        }
        else if (marks >= 60) {
            System.out.println("IF-ELSE-IF: Grade C");
        }
        else if (marks >= 40) {
            System.out.println("IF-ELSE-IF: Grade D");
        }
        else {
            System.out.println("IF-ELSE-IF: Fail");
        }

        // 4. switch statement

        int day = 3; // 1=Mon, 2=Tue, 3=Wed ...

        switch (day) {
            case 1:
                System.out.println("SWITCH: Monday");
                break;
            case 2:
                System.out.println("SWITCH: Tuesday");
                break;
            case 3:
                System.out.println("SWITCH: Wednesday");
                break;
            case 4:
                System.out.println("SWITCH: Thursday");
                break;
            case 5:
                System.out.println("SWITCH: Friday");
                break;
            case 6:
                System.out.println("SWITCH: Saturday");
                break;
            case 7:
                System.out.println("SWITCH: Sunday");
                break;
            default:
                System.out.println("SWITCH: Invalid day number");
        }
        // Modern switch (Java 14+) 
        int month = 2;

        String season = switch (month) {
            case 12, 1, 2 -> "Winter";
            case 3, 4, 5  -> "Spring";
            case 6, 7, 8  -> "Summer";
            case 9, 10, 11 -> "Autumn";
            default -> "Invalid month";
        };

        System.out.println("MODERN SWITCH: " + season);
    }
}
