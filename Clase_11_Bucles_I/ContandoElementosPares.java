public class ContandoElementosPares {
    public static void main(String[] args) {
        int[] myArray = new int[10];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (int) (Math.random() * 100);
            System.out.println("El elemento en la posicion " + i + " es: " + myArray[i]);
        }

        int count = 0;
        for(int num: myArray) {
            if(num % 2 == 0) {
                count++;
            }
        }
        System.out.println("La cantidad de elementos pares es: " + count);
    }
}
