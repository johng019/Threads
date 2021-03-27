
public class Class1 extends Thread {
    private int[] arrLocal1;
    private int[] arrLocal2;

    public Class1(int[] a, int[] b){
        this.arrLocal1 = a;
        this.arrLocal2 = b;
    }

    public void runningTaskA() {
        long sum = 0;

        for (int i : arrLocal1) {
            sum+= i;
        }
         /*for(int i = 0; i < arr.length; i++){
             sum += arr[i];;
         }*/
        System.out.println("Thread Id " + Thread.currentThread().getId() + "  Sum: " + sum );
    }

    public void runningTaskB() {
        long sum = 0;

        for (int i : arrLocal2) {
            sum+= i;
        }
         /*for(int i = 0; i < arr.length; i++){
             sum += arr[i];;
         }*/
        System.out.println("Thread Id " + Thread.currentThread().getId() + "  Sum: " + sum );
    }

    public void run() {
       runningTaskA();
       runningTaskB();
    }

}
