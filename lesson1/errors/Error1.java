import javax.xml.crypto.dsig.spec.ExcC14NParameterSpec;

public class Error1
{
    public static void main(String[] args)
    {

        System.out.println("Hello, World!");        
        try {
            System.out.println(1/0);
        }
        catch(Exception e) {

        }
    }
}
