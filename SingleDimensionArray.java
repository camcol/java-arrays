package Arrays;


/**
 * 1. insert  into an Array
 * 2. Traverse an Array
 * 3. Delete Array for both (specific value as well as the whole array)
 * 4. Search for an element in an array
 */
import java.util.Arrays;
public class SingleDimensionArray{
    int arr[] = null;

    public SingleDimensionArray(int sizeOfArray){
        arr = new int[sizeOfArray];
        for (int i = 0; i < arr.length; i++){
            arr[i] = Integer.MIN_VALUE;
        }
    }

    public void insert(int location, int valueToInsert){
        try {
            if (arr[location] == Integer.MIN_VALUE) {
                arr[location] = valueToInsert;
                System.out.println("Successfully inserted");
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index to access array" +  e);
        }
    }

    public void traverseArrays(){
        try{
            for (int i=0; i < arr.length; i++){
                System.out.println(arr[i] + " ");
            }
        } catch (Exception e){
            System.out.println("Array doesn't exist.");
        }
    }

    public void arraySearch(int searchValue){
        for (int i=0; i < arr.length; i++){
            if (arr[i] == searchValue) {
                System.out.println("Value is at index " + i);
                return;
            }
        }
        System.out.println(searchValue + "cannot be found.");
    }

    public void arrayDelete(int deleteValue){
        try{
            arr[deleteValue] = Integer.MIN_VALUE;
            System.out.println("Value Deleted!");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("This value is not within the range of the array.");

        }
    }

    public static void main(String[] args) {
        //create the object of the class
        SingleDimensionArray singleDimensionArray = new SingleDimensionArray(8);
        singleDimensionArray.insert(0,1);
        singleDimensionArray.insert(1,2);
        singleDimensionArray.insert(2,3);
        singleDimensionArray.insert(3,4);
        singleDimensionArray.insert(4,5);
        singleDimensionArray.insert(5,3);
        singleDimensionArray.insert(6,4);
        singleDimensionArray.insert(7,5);
//        System.out.println(singleDimensionArray.toString());
        System.out.println(Arrays.toString(singleDimensionArray.arr));

    }
}
