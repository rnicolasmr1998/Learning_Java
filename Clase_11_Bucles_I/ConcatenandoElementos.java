public class ConcatenandoElementos {
    public static void main(String[] args) {
        String[] myArray = {"Renzo", "Nicolas", "Ricardo", "Piero", "Alonso"};
        String myFriends  = "";
        for(String nombres: myArray) {
            myFriends += nombres + ", ";
        }
        System.out.println("Mis amigos son: " + myFriends);
    }
}
