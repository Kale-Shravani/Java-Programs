//searching in 2D array

public class linearsearch {
    public static void main(String[] args) {
        int[][] arr={
          {1,2,3},
          {4,5,6,7},
          {8,9,10,11,12},
          {13,14,15,16,17}
        };
        
        int target=10;
        search(arr, target);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    
    static void search(int arr[][],int target) {
        boolean found=false;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==target){
                    System.out.println("Target found at index" + i + " " + j );
                    found=true;
                    break;
                }
            }
        }
        //Code to check if target not found
        if(!found){
            System.out.println("not found..!");
        }
    }
}