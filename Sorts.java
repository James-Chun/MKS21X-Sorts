import java.util.Random;

public class Sorts{
  public static void selectionsort(int[] ary){
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
      int bigger = data[0]; //variable needed to store bigger value during swap
      int places = 0; //the end will already be sorted so we can stop loop a little earlier each pass
      for (int i=0;i<data.length-places;i++){ //need overall loop of data.length times to swap all the values
        for (int i2=0;i2<data.length-places;i2++){
          if (bigger<data[i]){
            bigger = data[i];
          }
        }
        data[i]=data[data.length-places];
        data[data.length-places]=bigger;
        places++;
      }

    }

    public static void main(String[] args){
      Random randgen = new Random();
      int[] list = new int[Integer.parseInt(args[0])];
      for (int i=0;i<Integer.parseInt(args[0]);i++){
        list[i]=randgen.nextInt()/5555567;
      }
      /*//testing to see if list has rand values
      for (int i=0;i<Integer.parseInt(args[0]);i++){
        System.out.println(list[i]);
      }*/
    }



  }
