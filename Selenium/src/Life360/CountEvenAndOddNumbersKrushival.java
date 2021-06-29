package Life360;

public class CountEvenAndOddNumbersKrushival {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int num=98765487;
        int evencount=0;int oddcount=0;
        while(num>0) {
            int rem=num%10;
            if( rem%2==0) { evencount++;}
            else {
                oddcount++;
            }
            num=num/10;
        }
        System.out.println("even count is :"+ evencount++);
        System.out.println("odd count is :"+ oddcount++);
    }
}

