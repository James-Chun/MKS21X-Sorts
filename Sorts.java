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
      int bigger = data[0]; //variable needed to store bigger value during swap
      int places = 0; //the end will already be sorted so we can stop loop a little earlier each pass
      for (int i=0;i<data.length-places;i++){ //need overall loop of data.length times to swap all the values
        for (int i2=0;i2<data.length-places;i2++){
          if (bigger<data[i]){//check for the bigger value
            bigger = data[i];
          }
        }
        data[i]=data[data.length-places-1];//at the end of each loop for each value, change accordingly
        data[data.length-places-1]=bigger;
        places++;
      }

    }

    public static void insertionSort (int[] data){
      int placeToInsert = 0;
      int temp = data[1];

      if (data.length!=0){

        for (int i=1;i<data.length;i++){
          temp = data[i];
          for (int i2=0;i2<=i;i2++){

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
