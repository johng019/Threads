import java.util.Random;

public class Class2 implements Runnable{
    private int[] arrLocal;
    public Class2(int[] arr){
        this.arrLocal = arr;
    }

    @Override
    public void run() {
        long sum = 0;

        //int[] arr = new Random().ints(200000000,0,9).toArray();
        for (int i : arrLocal) {
            sum+= i;
        }
        try {
            Thread.sleep(000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
         /*for(int i = 0; i < arr.length; i++){
             sum += arr[i];;
         }*/
        System.out.println("Thread Id " + Thread.currentThread().getId() + "  Sum: " + sum );
    }
}
