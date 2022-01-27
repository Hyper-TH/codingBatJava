package diff21;

public class Main {
    public int diff21(int n) {

        // if (n < 21) {
        //     return (21 - n);
        // else {
        //     return 2 * (n - 21);
        // }

        // Assuming A ? B : C
        // If A is true, return B, otherwise return C
        return (n <= 21) ? (21 - n) : (n - 21) * 2;
    }
}
