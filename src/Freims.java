public class Freims {

        public static void main(String[] args) {
            System.err.println("#1.in");
//            try {
                f(); // создаем фрейм, помещаем в стек, передаем в него управление
//            } catch (Error e) {
//                System.err.println("#1.CATCH");
//            }
            System.err.println("#1.out"); // вернулись
        } // выходим из текущего фрейма, кончились инструкции

        public static void f() {
            System.err.println(".   #2.in");
            try {
                g(); // создаем фрейм, помещаем в стек, передаем в него управление
            } catch (Error e) {

            }

            System.err.println(".   #2.out");  //вернулись
        } // выходим из текущего фрейма, кончились инструкции

        public static void g() {
            System.err.println(".   .   #3.in");
            h(); // создаем фрейм, помещаем в стек, передаем в него управление
            System.err.println(".   .   #3.out"); // вернулись
        } // выходим из текущего фрейма, кончились инструкции

        public static void h() {
            System.err.println(".   .   .   #4.in");
            if (true) {
                System.err.println(".   .   .   #4.RETURN");
                return; // выходим из текущего фрейма по 'return'
            }
            System.err.println(".   .   .   #4.out"); // ПРОПУСКАЕМ
        }
    }

