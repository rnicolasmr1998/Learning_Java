public class InvertirArray {
    public static void main(String[] args) {
        int[] myArray = {50, 40, 30, 20, 68, 94, 5, 7, 1056};
        int[] myArrayInverso = new int[myArray.length];
        for(int i = myArray.length - 1; i >= 0; i--) {
            myArrayInverso[myArray.length - 1 - i] = myArray[i];;
        }
   
        for(int i = 0; i < myArrayInverso.length; i++) {
        System.out.println(myArrayInverso[i]);
        }
    }
}
