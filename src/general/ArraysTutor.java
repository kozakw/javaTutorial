package general;

public class ArraysTutor {
    public static void main(String[] args) {
        int [] x = new int[5];

        x[0] = 10;
        x[1] = 12;

        for(int i = 0; i < x.length; i++){
            x[i] = 10 + i;
        }
    }
}
