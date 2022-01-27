package makes10;

public class Main {

    public boolean makes10(int a, int b) {
        // Return true if one if them is 10 or if their sum is 10.
        return ((a == 10 || b == 10) || (a + b) == 10);
    }
}
