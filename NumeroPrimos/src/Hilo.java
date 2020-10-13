import java.math.BigInteger;

public class Hilo extends Thread{
    private int principio;
    private int fin;

    public Hilo (int principio, int fin){
        this.principio = principio;
        this.fin = fin;
    }

    @Override
    public void run() {
        calculodePrimos();
    }

    public void calculodePrimos (){
        for (int x = principio; x <= fin; x++){
            BigInteger bigInteger = new BigInteger(String.valueOf(x));
            if (bigInteger.isProbablePrime(1)){
                System.out.println(bigInteger);
            }
        }
    }
}
