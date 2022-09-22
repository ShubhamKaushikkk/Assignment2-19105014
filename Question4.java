public class Question4 {
    public static void main(String args[]){
        int population=80000;
        int year=0;
        while(population<=150000){
            population*=105;
            population/=100;
            year++;
        }
        System.out.println(year);
    }
}
