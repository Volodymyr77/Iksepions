package demo1;


import demo.Cnstr;

//public class Main {
//    public static void main(String[] args) {
//        Cnstr cnstr1 = new Cnstr(101,"Ya","jdj4jkj",(byte) 1,"man",32,176,true);
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        System.out.println("sout");
//        throw new Error();
//    }
//}
public class Main {

    public static void main(String[] args) {
        // sqr - "сломается" (из него "выскочит" исключение),
        double d = sqr(10.0);  // выполнение метода main() прервется в этой строчке и
        // d - НИКОГДА НИЧЕГО НЕ БУДЕТ ПРИСВОЕНО!
        System.out.println(d); // и печатать нам ничего не придется!
    }

    public static double sqr(double arg) {
        throw new RuntimeException(); // "бросаем" исключение
    }
}