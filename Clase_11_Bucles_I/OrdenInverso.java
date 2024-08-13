public class OrdenInverso {
    public static void main(String[] args) {
        int[] myArray = {40, 30, 20, 45, 50, 15, 5, 80};
        for(int i = myArray.length - 1; i >= 0; i--) {
            System.out.println(myArray[i]);
        }
    }
}
