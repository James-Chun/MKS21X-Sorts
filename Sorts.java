public class Sorts{
  public static void selectionsort(int[] ary){
    int[] newArray = ary;
    int compareValue = ary[0];  //This is the temp value that will be compared to all the other values in the list and if it is the smallest will be added to the "front".
    int tempPlace = 0;  //border between ints already sorted and ints to be sorted (also the place where smallest int will be placed)
    for (int i=tempPlace;tempPlace<ary.length;i++){
      if (compareValue>ary[i]) compareValue=ary[i];
      if (i==ary.length-1) {
        ary[tempPlace]=compareValue;
        tempPlace++; //once i has reached end of list and tempPlace has not, reset i back to tempPlace;
        i=tempPlace;
      }
    }
  }
  public static void main(String[] args){
    int[] n = {1,2,4,62,2,4};
    selectionsort(n);
    for (int i=0;i<n.length;i++){
      System.out.println(n[i]);
    }
  }
}
