import java.util.Scanner;
class WeekD{
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        int dno;
        System.out.println("Enter the Day no:");
        dno=sc.nextInt();
        String day;
        switch (dno) {
            case 1:
                day = "Sunday";
                break;
            case 2:
                day = "Monday";
                break;
            case 3:
                day = "Tuesday";
                break;
            case 4:
                day = "Wednesday";
                break;
            case 5:
                day = "Thursday";
                break;
            case 6:
                day = "Friday";
                break;
            case 7:
                day = "Saturday";
                break;
            default:
                day = "Invalid";
                break;
        }
        System.out.println("Day Name of the week is:"+day);
    }
}