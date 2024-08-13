public class ValorMinimo {
    public static void main(String[] args) {
        int[] myArray = {15, 40 , 58, 62, 10, 5};
        int valorMinimo = 0;
        for(int i = 0; i < myArray.length; i++) {
            if(myArray[i] < myArray[valorMinimo]) {
                valorMinimo = i;
            }
        }
        System.out.println("El valor minimo es: " + myArray[valorMinimo]);
    }
}
