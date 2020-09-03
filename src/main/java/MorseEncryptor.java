import java.util.Scanner;

public class MorseEncryptor {

    public static void main(String[] args){
        System.out.println("Enter your message: ");
        String str = input();
        str = str.toLowerCase();

        char[] arr = str.toCharArray();
        for (int i = 0; i < str.length(); i++){
            switch(arr[i]){
                case 'a': {
                    System.out.print(".- ");
                    break;
                }
                case 'b': {
                    System.out.print("-... ");
                    break;
                }
                case 'c': {
                    System.out.print("-.-. ");
                    break;
                }
                case 'd': {
                    System.out.print("-.. ");
                    break;
                }
                case 'e': {
                    System.out.print(". ");
                    break;
                }
                case 'f': {
                    System.out.print("..-. ");
                    break;
                }
                case 'g': {
                    System.out.print("--. ");
                    break;
                }
                case 'h': {
                    System.out.print(".... ");
                    break;
                }
                case 'i': {
                    System.out.print(".. ");
                    break;
                }
                case 'j': {
                    System.out.print(".--- ");
                    break;
                }
                case 'k': {
                    System.out.print("-.- ");
                    break;
                }
                case 'l': {
                    System.out.print(".-.. ");
                    break;
                }
                case 'm': {
                    System.out.print("-- ");
                    break;
                }
                case 'n': {
                    System.out.print("-. ");
                    break;
                }
                case 'o': {
                    System.out.print("--- ");
                    break;
                }
                case 'p': {
                    System.out.print(".--. ");
                    break;
                }
                case 'q': {
                    System.out.print("--.- ");
                    break;
                }
                case 'r': {
                    System.out.print(".-. ");
                    break;
                }
                case 's': {
                    System.out.print("... ");
                    break;
                }
                case 't': {
                    System.out.print("- ");
                    break;
                }
                case 'u': {
                    System.out.print("..- ");
                    break;
                }
                case 'v': {
                    System.out.print("...- ");
                    break;
                }
                case 'w': {
                    System.out.print(".-- ");
                    break;
                }
                case 'x': {
                    System.out.print("-..- ");
                    break;
                }
                case 'y': {
                    System.out.print("-.-- ");
                    break;
                }
                case 'z': {
                    System.out.print("--.. ");
                    break;
                }
                case '1': {
                    System.out.print(".---- ");
                    break;
                }
                case '2': {
                    System.out.print("..--- ");
                    break;
                }
                case '3': {
                    System.out.print("...-- ");
                    break;
                }
                case '4': {
                    System.out.print("....- ");
                    break;
                }
                case '5': {
                    System.out.print("..... ");
                    break;
                }
                case '6': {
                    System.out.print("-.... ");
                    break;
                }
                case '7': {
                    System.out.print("--... ");
                    break;
                }
                case '8': {
                    System.out.print("---.. ");
                    break;
                }
                case '9': {
                    System.out.print("----. ");
                    break;
                }
                case '0': {
                    System.out.print("----- ");
                    break;
                }
                case ' ': {
                    System.out.print("/");
                    break;
                }
                default:{
                    System.out.println("You should've entered numbers or letters, dumb!");
                    System.exit(0);
                }
            }
        }

    }

    public static String input(){
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        return str;
    }
}



