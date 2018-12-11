import java.util.Random;

public class Sorts{

  private static boolean sorted(int[] data){
    for (int i =1;i<data.length;i++){
      if (data[i]<data[i-1]){
        return false;
      }
    }
    return true;
  }

  public static void selectionSort(int[] ary){
    if (!sorted(ary)){
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
  }

    public static void bubbleSort(int[] data){
      if (!(sorted(data))){
        int bigger = data[0]; //variable needed to store bigger value during swap
        for (int a =0;a<data.length;a++){
          for (int i=1;i<data.length;i++){
            bigger = data[i];
            if (data[i]<data[i-1]){ //check to see if previous value is bigger than current
              bigger = data[i-1]; // if bigger, then swap using temporary bigger variable
              data[i-1]=data[i];
              data[i]=bigger;
            }
          }
        }
      }

    }

    public static void insertionSort (int[] data){
      if (!(sorted(data))){
        int value = data[0];
        int toMovevalue = data[0];
        int currentValue = data[0];
        for (int initialLoop=1;initialLoop<data.length;initialLoop++){ // loop to go through all the values
          value = data[initialLoop];

          for (int secondLoop=0;secondLoop<initialLoop;secondLoop++){ // loop to go through sorted values

            if (data[secondLoop]>data[initialLoop]){ // if value at initialLoop is smaller than value at secondLoop
              toMovevalue = data[secondLoop]; // place value at initialLoop into secondLoop and shift everything over
              data[secondLoop]=data[initialLoop];

              for (int shiftLoop=secondLoop+1;shiftLoop<=initialLoop;shiftLoop++){ //loop to shift everything over
                currentValue=data[shiftLoop];
                //System.out.println(" "+currentValue);
                data[shiftLoop]=toMovevalue;
                toMovevalue=currentValue;
                //System.out.print(" "+toMovevalue);
              }

            }

          }

        }
      }

    }

    public static void main(String[] args){
      if (args.length>0){
        Random randgen = new Random();
        int[] list = new int[Integer.parseInt(args[0])];

        for (int i=0;i<Integer.parseInt(args[0]);i++){ //making random list
          list[i]=randgen.nextInt()/5555567;
        }
        /* checking list
        for (int i=0;i<Integer.parseInt(args[0]);i++){
          System.out.println(list[i]);
        }
        System.out.println("\n");
        */

        //selectionSort(list);
        //bubbleSort(list);
        insertionSort(list);

        /* checking to see if list is sorted
        for (int i=0;i<Integer.parseInt(args[0]);i++){
          System.out.println(list[i]);
        }*/


        //System.out.println(sorted(list));

      }else{
        int[] list = new int[1000000];
        for (int i=0;i<1000000;i++){
          list[i]=0;
        }
        bubbleSort(list);
        selectionSort(list);

        for (int i =0;i<10;i++){
          System.out.println(list[i]);
        }



      }


    }




}
