import java.util.Random;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        int[] arr = new Random().ints(200000000,1,10).toArray();
        int[] a = new int[(arr.length +1) / 2];
        int[] b = new int[(arr.length - a.length)];

        for(int i = 0; i < arr.length; i++){
            if(i < a.length){
                a[i] = arr[i];
            }else{
                b[i - a.length] = arr[i];
            }
        }

         long nano_startTime1 = System.nanoTime();

         Class1 c1 = new Class1(a,b);
         c1.start();

         long nano_endTime1 = System.nanoTime();
         long time1 = nano_endTime1 - nano_startTime1 ;

         System.out.println( "Dual Thread Time (nano): " + time1 / 1000 );
         Thread.sleep(2000);

         long nano_startTime2 = System.nanoTime() ;

         Thread t1 = new Thread(new Class2(arr));
         t1.start();

         long nano_endTime2 = System.nanoTime();
         long time2 = nano_endTime2- nano_startTime2;

         System.out.println( "Single Thread Time (nano): " + time2 / 1000 );

    }
}

