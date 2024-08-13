public class SumaAcumulada {
    public static void main(String[] args) {
        int[] myArray = {40, 30, 20, 60, 50, 15, 5, 80};
        int[] myArrayAcumulado = new int[myArray.length];

        for (int i = 0; i < myArray.length; i++) {
            if (i == 0) {
                myArrayAcumulado[i] = myArray[i];
            } else {
                myArrayAcumulado[i] = myArrayAcumulado[i - 1] + myArray[i];
            }
        }

        for (int i = 0; i < myArrayAcumulado.length; i++) {
            System.out.println(myArrayAcumulado[i]);
        }
    }
}
