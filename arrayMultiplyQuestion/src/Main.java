public class Main {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5};
        int[] resultArray= new int[myArray.length];
        for(int i =0; i <myArray.length; i++){
            int temp =  1;
            for(int j =0; j <myArray.length; j++) {
                if (i == j){
                    continue;
                }
                else {
                     temp = temp * myArray[j];
                    resultArray[i] = temp;
                }
            }
        }
        System.out.println(java.util.Arrays.toString(resultArray));
    }
}