import java.util.*;
public class Question3 {
    public static void main(String args[]){
        String months[]={"January","February","March","April","May","June","July","August","September","October","November","December"};
        int input;
        Scanner sc= new Scanner(System.in);
        input= sc.nextInt();
        switch(input){
            case 1:
                System.out.println(months[0]);
                System.out.println("31");
                break;
            case 2:
                System.out.println(months[1]);
                System.out.println("28/29");
                break;
            case 3:
                System.out.println(months[2]);
                System.out.println("31");
                break;
            case 4:
                System.out.println(months[3]);
                System.out.println("30");
                break;
            case 5:
                System.out.println(months[4]);
                System.out.println("31");
                break;
            case 6:
                System.out.println(months[5]);
                System.out.println("30");
                break;
            case 7:
                System.out.println(months[6]);
                System.out.println("31");
                break;
            case 8:
                System.out.println(months[7]);
                System.out.println("31");
                break;
            case 9:
                System.out.println(months[8]);
                System.out.println("30");
                break;
            case 10:
                System.out.println(months[9]);
                System.out.println("31");
                break;
            case 11:
                System.out.println(months[10]);
                System.out.println("30");
                break;
            case 12:
                System.out.println(months[11]);
                System.out.println("31");
                break;
        }
    }
}
