package CodeWars;

public class Ex2 {
    public static void main(String[] args) {
        System.out.println(setAlarm(true, true));
    }
    public static boolean setAlarm(boolean employed, boolean vacation) {
        if(employed == true && vacation == false){
            return true;
        } else if (employed == false && vacation == false){
            return false;
        } else if (employed == false && vacation == true){
            return false;
        } else {
            return false;
        }
    }
}
