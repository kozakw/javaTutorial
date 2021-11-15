package general;
import object_oriented_programming.Number;

public class PrimitiveVsObject {
    public static void main(String[] args) {
// Cat c1 = new Cat(); - I can not create and instance of this class since constructor is not public
        Number n1 = new Number(5, 10);
        System.out.println(" Value of n1.x before call to changeNumber(): " + n1.x);
        changeNumber(n1.x);
        System.out.println(" Value of n1.x after call to changeNumber(): " + n1.x);

        System.out.println(" Value of n1.x before call to changeObject(): " + n1.x);
        changeObject(n1);
        System.out.println(" Value of n1.x after call to changeObject(): " + n1.x);
    }

    public static void changeNumber(int x){
        ++x;
    } //nothing will happen because we pass primitve

    public static void  changeObject(Number n){  // will impact to object
        n.x +=1;
    }
}
