/*This program adds two binary numbers*/
import java.util.Scanner ;
public class AddBinary {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a binary number : ");
        String numberString1 = in.next();

        System.out.println("Enter another binary number : ");

        String numberString2 = in.next();
        int[] number1 = new int[numberString1.length()];
        int[] number2 = new int[numberString2.length()] ;
        int[] sum = new int[numberString2.length()] ;
        String sumasjon = "" ;
        for (int i = 0; i < number1.length; i++)
        {
            number1[i] = Integer.parseInt(numberString1.substring(i,i+1)) ;
            number2[i] = Integer.parseInt(numberString2.substring(i,i+1)) ;
            sum [i] = number1[i]+ number2[i] ;
        }
        for (int i=numberString1.length()-1; i>=0;i--)
        {
            if(sum[i]>1 && i>0)
            {
                sum[i - 1]++;
                sum[i] = 0;
            }

        }
        if(sum[0]== 2) {
            sumasjon = "10";
            for (int i = 1; i < sum.length; i++)
                sumasjon = sumasjon + sum[i];
        }

        System.out.println(sumasjon);
    }
}
