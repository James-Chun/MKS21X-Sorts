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
//driver from timothy so
  public static String printArray(int[] ary) {
    String output = "[";
    for(int i=0; i<ary.length-1; i++) {
      output += ary[i] + ", ";
    }
    return output += ary[ary.length-1] + "]";
}

public static void main(String[] args) {

    // Google random int generator

    String sorted = "";

    // 8 nums, [0:10]
    int[] test_a = { 3, 4, 7, 1, 6, 2, 8, 6 };
    System.out.println(printArray(test_a));               // [3, 4, 7, 1, 6, 2, 8, 6]

    selectionsort(test_a);

    sorted = printArray(test_a);
    System.out.println(sorted);               // [1, 2, 3, 4, 6, 6, 7, 8]

    if(sorted.equals("[1, 2, 3, 4, 6, 6, 7, 8]")) {
      System.out.println("TEST CASE - PASS");
    } else {
      System.out.println("TEST CASE - FAIL");
    }

    // 12 nums, [0:20]
    int[] test_b = { 17, 1, 19, 2, 18, 20, 1, 18, 11, 13, 5, 17 };
    System.out.println(printArray(test_b));   // [17, 1, 19, 2, 18, 20, 1, 18, 11, 13, 5, 17]

    selectionsort(test_b);

    sorted = printArray(test_b);
    System.out.println(sorted);               // [1, 1, 2, 5, 11, 13, 17, 17, 18, 18, 19, 20]

    if(sorted.equals("[1, 1, 2, 5, 11, 13, 17, 17, 18, 18, 19, 20]")) {
      System.out.println("TEST CASE - PASS");
    } else {
      System.out.println("TEST CASE - FAIL");
    }

    // 20 nums, [0:100]
    int[] test_c = { 14, 32, 19, 66, 61, 96, 33, 48, 30, 100, 65, 37, 15, 85, 1, 35, 9, 57, 50, 52 };
    System.out.println(printArray(test_c));   // [14, 32, 19, 66, 61, 96, 33, 48, 30, 100, 65, 37, 15, 85, 1, 35, 9, 57, 50, 52]

    selectionsort(test_c);

    sorted = printArray(test_c);
    System.out.println(sorted);               // [1, 9, 14, 15, 19, 30, 32, 33, 35, 37, 48, 50, 52, 57, 61, 65, 66, 85, 96, 100]

    if(sorted.equals("[1, 9, 14, 15, 19, 30, 32, 33, 35, 37, 48, 50, 52, 57, 61, 65, 66, 85, 96, 100]")) {
      System.out.println("TEST CASE - PASS");
    } else {
      System.out.println("TEST CASE - FAIL");
    }

    //TEST D
    int[] test_d = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
    System.out.println(printArray(test_d));

    selectionsort(test_d);

    sorted = printArray(test_d);
    System.out.println(sorted);

    if(sorted.equals("[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16]")) {
      System.out.println("TEST CASE - PASS");
    } else {
      System.out.println("TEST CASE - FAIL");
    }

    //TEST E
    int[] test_e = {0,0,0,0,0};
    System.out.println(printArray(test_e));

    selectionsort(test_e);

    sorted = printArray(test_e);
    System.out.println(sorted);

    if(sorted.equals("[0, 0, 0, 0, 0]")) {
      System.out.println("TEST CASE - PASS");
    } else {
      System.out.println("TEST CASE - FAIL");
    }

    //TEST F
    int[] test_f = {5,4,3,2,1};
    System.out.println(printArray(test_f));

    selectionsort(test_f);

    sorted = printArray(test_f);
    System.out.println(sorted);

    if(sorted.equals("[1, 2, 3, 4, 5]")) {
      System.out.println("TEST CASE - PASS");
    } else {
      System.out.println("TEST CASE - FAIL");
    }

  }
}
