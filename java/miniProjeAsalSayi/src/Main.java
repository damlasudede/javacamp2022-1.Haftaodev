public class Main {
    public static void main(String[] args) {

       int number =25;
       int remainder = number%2;
       System.out.println(remainder);
       boolean isPrime = true;

       if(number ==1){
           System.out.println("Asal sayı değildir");
           return;
       }
        if(number<1){
            System.out.println("Geçersiz sayı");
        }
       for(int i=2;i<number;i++){
           if(number%2==0){
               isPrime=false;
           }

       }
       if(isPrime){
           System.out.println("sayı asaldır");

       }else{
           System.out.println("sayı asal değildir");
       }

    }
}