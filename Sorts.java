import java.util.Random;

public class Sorts{
  public static void selectionSort(int[] ary){
    int indexOfSmallest = 0; //index of the smallest value
    int smallest = ary[0]; //smallest index
    for (int i=0; i<ary.length;i++){
      smallest = ary[i];
      for (int i2=i;i2<ary.length;i2++){ //starting from last position, see if all the ones after it are smaller
        if (smallest>ary[i2])smallest=ary[i2]; //adjusting smallest
      }
      for(int i3=0;i3<ary.length;i3++){
        if (ary[i3]==smallest)indexOfSmallest=i3; //finding index of smallest value and storing it
      }
      ary[indexOfSmallest]=ary[i]; //switching smallest and value at i (which should increase sequentially)
      ary[i]=smallest;
    }
  }

    public static void bubbleSort(int[] data){
      for (int a =0;a<data.length;a++){
        for (int i=1;i<data.length;i++){
          int bigger = data[i]; //variable needed to store bigger value during swap
          if (data[i]<data[i-1]){ //check to see if previous value is bigger than current
            bigger = data[i-1]; // if bigger, then swap using temporary bigger variable
            data[i-1]=data[i];
            data[i]=bigger;
          }
        }
      }

    }

    public static void insertionSort (int[] data){
      for (int initialLoop=1;initialLoop<data.length;initialLoop++){ // loop to go through all the values
        int value = data[initialLoop];
        for (int secondLoop=0;secondLoop<initialLoop;secondLoop++){ // loop to go through sorted values
          if (data[secondLoop]>data[initialLoop]){ // if value at initialLoop is smaller than value at secondLoop
            int temp = data[secondLoop];  // place value at initialLoop into secondLoop and shift everything over
            data[secondLoop]=data[initialLoop];
            for (int shiftLoop=secondLoop+1;shiftLoop<initialLoop;shiftLoop++){

              temp = data[shiftLoop];

            }
          }
        }
      }

    }

    public static void main(String[] args){
      Random randgen = new Random();
      int[] list = new int[Integer.parseInt(args[0])];
      for (int i=0;i<Integer.parseInt(args[0]);i++){
        list[i]=randgen.nextInt()/5555567;
      }

      selectionSort(list);
      System.out.println(list);

      for (int i=0;i<Integer.parseInt(args[0]);i++){
        System.out.println(list[i]);
      }

    }



}
