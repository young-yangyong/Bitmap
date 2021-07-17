public class test {
    public static void main(String[] args) {
        Bitmap bitmap = new Bitmap(16, 10);
        System.out.println(bitmap.add(2));
        System.out.println(bitmap.add(3));
        System.out.println(bitmap.add(4));
        System.out.println(bitmap.add(5));
        System.out.println(bitmap);
        System.out.println(bitmap.update(3, 7));
        System.out.println(bitmap);
        System.out.println(bitmap.find(3));
    }
}
