import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.*;

public class ShoppingCart
{
    static double total_price = 0.0;
    public static void main(String[] args)
    {
        List<ShopList> list=new ArrayList<>();
        while (true)
        {
            Scanner scan = new Scanner(System.in);

            System.out.print("Enter item name :");
            String i_name = scan.nextLine();

            System.out.print("Enter the price of the item: ");
            double i_price = scan.nextDouble();

            System.out.print("Enter the quantity :");
            int i_quant = scan.nextInt();

            tot_price(i_price,i_quant);
            list.add(new ShopList(i_name,i_price,i_quant));
            System.out.print("Continue Shopping? press 1 for yes and 0 for no: ");
            int i = scan.nextInt();
            if (i == 0)
            {
                System.out.println("Final Shopping List:- ");
                for(int j=0;j<list.size();j++) {
                    System.out.println(list.get(j));
                }
                NumberFormat formatter=NumberFormat.getCurrencyInstance(new Locale("en","IN"));
                System.out.println("Total price: " + formatter.format(total_price));
                if(total_price>1000){
                    double discount=total_price-total_price*0.3;
                    System.out.println("Congratulations! your order is above 1000Rs.,you get 30% off on your order :)");
                    System.out.println("Discounted Price: "+formatter.format(discount));
                    System.out.println("You saved: "+formatter.format(total_price-discount));
                    System.out.println("Thanks for Shopping!");
                }
                break;
            }
        }
    }
    public static double tot_price(double i_price, int i_quant) {
        total_price = total_price + i_price * i_quant;
        return total_price;

    }
}



