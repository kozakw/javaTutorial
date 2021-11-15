package primitives;

public class PrimitiveTutor {
    public static void main(String[] args){
        byte b1; //declaring
        b1 = 10; //assignment

        byte b2, b3, b4;
        b3 = 20;
        b3 = 25;
        b3 = 30;
        b3 = 45;
//        byte b3 = 100;

        short s1 = 25; //initialization
        short s2, s3 = 35, s4;
        s4 = 30;

        int i1 = 10;
        int i2 = 040; //octal base
        System.out.println(i2); //32
        int i3 = 0xAF; //base 16
        System.out.println(i3); // 175
        int i4 = 0b1110110001001; //base 2
        System.out.println(i4); //7561

        int i5 = 6_783_124; //it only helps with the separation of the value to make it more readable
        //does not affect the value that we have store in memory

        long t1 = 1_000_000_000_000_000L; //we are adding the L at the end in order to force the interpreter
        //to see this as a long, instead of an int (which is the default data type)

        double d1 = 10.5;
        float f1 = 12.53213F;
        float f2 = (float) 20.5;

        char c1 = 'a';
        char c2 = '\n'; // new line
        char c3 = '\t'; // tab
        char c4 = '\u2665'; //unicode symbol
        System.out.println(c4);
        char c5 = 169; //decimal code for unisymbol
        System.out.println(c5);

        boolean r1 = true;
        boolean r2 = false;
    }
}
