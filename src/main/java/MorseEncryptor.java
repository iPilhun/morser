import java.util.Scanner;

public class MorseEncryptor {

    public static Integer check = 0;
    public static boolean broken = false;

    public static void main(String[] args){
        System.out.println("Enter your message: ");

        String str = input();
        String res = output(str);

        System.out.println(res);
    }

    public static String input(){
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        return str;
    }

    public static String output(String input){
        input = input.toLowerCase();
        char[] strByLetter = input.toCharArray();

        String res = "";
        boolean broken = false;

        for (int i = 0; i < input.length(); i++){
            res += encoder(strByLetter[i]);

            if(check == 1){
                break;
            }
        }
        return res;
    }

    public static String encoder(char letter){
        String res = "";

        switch(letter) {
                case 'a': {
                    res += ".- ";
                    break;
                }
                case 'b': {
                    res += "-... ";
                    break;
                }
                case 'c': {
                    res += "-.-. ";
                    break;
                }
                case 'd': {
                    res += "-.. ";
                    break;
                }
                case 'e': {
                    res += ". ";
                    break;
                }
                case 'f': {
                    res += "..-. ";
                    break;
                }
                case 'g': {
                    res += "--. ";
                    break;
                }
                case 'h': {
                    res += ".... ";
                    break;
                }
                case 'i': {
                    res += ".. ";
                    break;
                }
                case 'j': {
                    res += ".--- ";
                    break;
                }
                case 'k': {
                    res += "-.- ";
                    break;
                }
                case 'l': {
                    res += ".-.. ";
                    break;
                }
                case 'm': {
                    res += "-- ";
                    break;
                }
                case 'n': {
                    res += "-. ";
                    break;
                }
                case 'o': {
                    res += "--- ";
                    break;
                }
                case 'p': {
                    res += ".--. ";
                    break;
                }
                case 'q': {
                    res += "--.- ";
                    break;
                }
                case 'r': {
                    res += ".-. ";
                    break;
                }
                case 's': {
                    res += "... ";
                    break;
                }
                case 't': {
                    res += "- ";
                    break;
                }
                case 'u': {
                    res += "..- ";
                    break;
                }
                case 'v': {
                    res += "...- ";
                    break;
                }
                case 'w': {
                    res += ".-- ";
                    break;
                }
                case 'x': {
                    res += "-..- ";
                    break;
                }
                case 'y': {
                    res += "-.-- ";
                    break;
                }
                case 'z': {
                    res += "--.. ";
                    break;
                }
                case '1': {
                    res += ".---- ";
                    break;
                }
                case '2': {
                    res += "..--- ";
                    break;
                }
                case '3': {
                    res += "...-- ";
                    break;
                }
                case '4': {
                    res += "....- ";
                    break;
                }
                case '5': {
                    res += "..... ";
                    break;
                }
                case '6': {
                    res += "-.... ";
                    break;
                }
                case '7': {
                    res += "--... ";
                    break;
                }
                case '8': {
                    res += "---.. ";
                    break;
                }
                case '9': {
                    res += "----. ";
                    break;
                }
                case '0': {
                    res += "----- ";
                    break;
                }
                case ' ': {
                    res += "/ ";
                    break;
                }
                default: {
                    res = "You should've entered numbers or letters, dumb!";
                    check = 1;
                    break;
                }

            }
        return res;
    }
}



