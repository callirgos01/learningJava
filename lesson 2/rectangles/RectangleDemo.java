public class RectangleDemo
{
    public static void main(String[] args)
    {
        /*
        Rectangle box = new Rectangle(5, 10, 60, 90);
        box.draw();
        box.translate(200, 100);
        */

        Rectangle rec1 = new Rectangle(60,90,20,30);
        Rectangle rec2 = new Rectangle(80,120,20,30);

        rec1.draw();
        rec2.draw();

        rec1.setColor(new Color(255,0,0));
        rec1.draw();
        rec2.setColor(new Color(0,255,0));
        rec2.fill();

        String river = "Mississippi";
        System.out.println(river.replace("issipp","our").length());
        
    
/*
        Rectangle box = new Rectangle(5,10,60, 90);
        System.out.println(box.getX());
        System.out.println(box.getWidth());
        box.translate(25,40);
        System.out.println(box.getX());
        System.out.println(box.getWidth());
*/
/*
        Rectangle box1 = new Rectangle(5,10,60, 90);
        Rectangle box2 = box1;

        box1.translate(100,100);

        System.out.println(box1.getX());
        System.out.println(box2.getX());
        */
        /*
        Rectangle box1 = new Rectangle(5,10,60, 90);
        Rectangle box2 = box1;

        box1.setColor(Color.RED);
        box2.setColor(Color.BLUE);
        System.out.println(box1.getX());
        System.out.println(box2.getX());
        box1.fill();
        */
/*
        String greeting = "Hello, World!";
        String greeting2 = greeting;
        greeting2.toUpperCase();
        System.out.println(greeting);
        System.out.println(greeting2);
        */
        /*
        int luckyNumber = 13;
        int luckyNumber2 = luckyNumber;
        luckyNumber2 = 12;
        System.out.println(luckyNumber);
        System.out.println(luckyNumber2);
        */
    }
}
