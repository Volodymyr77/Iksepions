public class LessonExcep {
//    public static void main(String[] args) throws Throwable {
//        try {
//        } catch (Throwable t) {}
//
////        public static void main(String[] args) {
////            // Error - потомок Throwable
////            throw new Error();
////        }
//
//    }
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
