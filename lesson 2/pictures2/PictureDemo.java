public class PictureDemo
{
    public static void main(String[] args)
    {
        Picture rocket = new Picture("mariner4.jpg");
        Picture planet = new Picture("mars.gif");

        rocket.draw();
        planet.draw();

        rocket.translate(200,200);
        planet.grow(-50,-50);

    }
}
