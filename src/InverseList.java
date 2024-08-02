import java.util.ArrayList;
import java.util.Collections;


public class InverseList {

    public static ArrayList inverser(ArrayList liste) {

        ArrayList inverse = new ArrayList();

//        for(Object o : liste) {
//            inverse.add(0, o);
//        }
//        for (int i = liste.size()-1; i >=0 ; i--) {
//            inverse.add(liste.get(i));
//        }
        Collections.reverse(liste);

        return inverse;
    }

    public static void main(String[] args) {

        ArrayList<String> test = new ArrayList<String>();
        test.add("1");
        test.add("2");
        test.add("3");
        test.add("4");
        test.add("5");

        ArrayList<String> testInverse = InverseList.inverser(test);

        for(String s : testInverse) {

            System.out.print(s + " ");
        }
    }

}