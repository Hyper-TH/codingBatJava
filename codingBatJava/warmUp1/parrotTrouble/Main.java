package parrotTrouble;

public class Main {
    public boolean parrotTrouble(boolean talking, int hour) {

        /* return true if talking AND hour < 7 OR hour > 20 */
        return (talking && (hour < 7 || hour > 20));
    }
}
