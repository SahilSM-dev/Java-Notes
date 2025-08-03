package JavaBasics;

public class SwitchStatementMonth {
    public static void main(String[] args){
        Day dayEnumVal = Day.TUESDAY;
        int day = 0;
        int outputValue = 0;
        switch (dayEnumVal){
            case SUNDAY:
                day = 1;
                break;
            case MONDAY:
                day = 2;
                break;
            case TUESDAY:
                day = 3;
                outputValue = 1;
                switch (outputValue){
                    case 1:
                        System.out.println("output value: " + 1);
                        break;
                    case 2:
                        System.out.println("output value: " + 2);
                        break;
                    default:
                        System.out.println("output value:" + outputValue);
                }
                break;
            case WEDNESDAY:
                day = 4;
                break;
            case THURSDAY:
                day = 5;
                break;
            case FIRDAY:
                day = 6;
                break;
            case SATURDAY:
                day = 7;
                break;
        }
        switch (day) {
            case 1:
                System.out.println("Today is Sunday");
                break;
            case 2:
                System.out.println("Today is Monday");
                break;
            case 3:
                System.out.println("Today is Tuesday");
                break;
            case 4:
                System.out.println("Today is Wednesday");
                break;
            case 5:
                System.out.println("Today is Thursday");
                break;
            case 6:
                System.out.println("Today is Friday");
                break;
            case 7:
                System.out.println("Today is Saturday");
                break;
            default:
                System.out.println("Wrong selection");
        }

        switch (day){
            case 1,7 :
                System.out.println("Weekend");
                break;
            case 2 ,3 ,4 ,5 ,6:
                System.out.println("Weekday");
                break;
            default:
                System.out.println("Wrong selection");
        }

        String month = "August";
        switch (month){
            case "January", "February","March":
                System.out.println("month value is in Q1");
                break;
            case "April", "May","June":
                System.out.println("month value is in Q2");
                break;
            case "July" ,"August", "September":
                System.out.println("month value is in Q3");
                break;
            default:
                System.out.println("month value is in Q4");
        }
    // return is not possible in switch statement
    // it can be dne by
    // case N -> Lable
    // yield statement

    int val = 1;
        String outputVal = switch (val){
            case 1 -> "One";
            case 2 -> "Two";
            default ->  "None";
        };
        System.out.println(outputVal);
    val = 2;
        outputVal = switch (val){
            case 1 -> { yield "One";}
            case 2 -> { yield "Two"; }
            default ->  "None";
        };
        System.out.println(outputVal);


    }
}
enum Day{
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FIRDAY,
    SATURDAY,
    SUNDAY
}
