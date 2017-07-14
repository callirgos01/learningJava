public class PictureSolution{
    public static void main(String[] args)
    {
        Picture pic1 = new Picture();
        System.out.println(pic1.toString());
        pic1.pick();
        System.out.println(pic1.toString());
        System.out.println(pic1.pixels());
        pic1.translate(100,200);
        System.out.println(pic1.toString());

        pic1.grow(50,50);
    }
}
