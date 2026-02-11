import java.math.BigDecimal;
import java.math.MathContext;
public class BigDecimalUsage1{
    public static void main(String[] args){
        MathContext mathcontext= new MathContext(4);
        BigDecimal x= new BigDecimal("3.13452",mathcontext);
        BigDecimal y=new BigDecimal("3.14559",mathcontext);
        BigDecimal sum=x.add(y,mathcontext);
        BigDecimal diff=x.subtract(y,mathcontext);
        System.out.println(sum);
        System.out.println(diff);
    }
}