public class MultTwoNumber {
    public static void main(String[] args) {
        int width;
        int height;
        area(2, 4);
        System.out.println(area(3, 5));
    }
    public static int area(int width, int height) {
//        if (width < 0 || height < 0) {
//            System.out.println("Sorry, bad argum");
//        } else {
//            return width * height; // тут просто перемножаем
//        }
//        if (width < 0 || height < 0) {
//            System.exit(0);
//        }
//        return width * height;
        if (width < 0 || height < 0) {
            throw new IllegalArgumentException("Negative sizes: w = " + width + ", h = " + height);
        }
        return width * height;
    }
}
