import java.text.NumberFormat;
import java.util.Locale;

public class ShopList {
    private String name;
    private double price;
    private int quantity;
     ShopList(String n,double p,int q){
         super();
        this.name=n;
        this.price=p;
        this.quantity=q;

    }
   public String getName(){
        return name;
   }
   public Double price(){
        return price;
   }
   public Integer quantity(){
        return quantity;
   }

    @Override
    public String toString() {
        NumberFormat f1=NumberFormat.getCurrencyInstance(new Locale("en","IN"));

        return name+"\t\t"+f1.format(price) +"\t\t"+ quantity +"\t\t"+f1.format(price*quantity);

    }
}
