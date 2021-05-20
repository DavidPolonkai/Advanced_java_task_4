package hu.uni.miskolc.iit.advancedjava;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Product product = new Product("shake",1);
        product.setType(ProductTypes.BANAN);
        System.out.println(product);
    }
}
