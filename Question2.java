public class Question2 {
    public static void main(String args[]){
        int num1=67;
        int num2=59;
        int num3=99;
        int min;
        if(num1<num2 && num1<num3)
            min=num1;
        else if(num2<num1 && num2<num3)
            min=num2;
        else
            min=num3;
        System.out.println(min);
    }
}
