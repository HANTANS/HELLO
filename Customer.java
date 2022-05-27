import java.util.ArrayList;

public class Customer{
    double consume;
    double price;
    int num;
    String goodname;

    public void Cust(ArrayList<Customer> cust){
        System.out.println("数量 商品");
        for(int i=0;i<cust.size()-1;i++){
            System.out.println(cust.get(i).num+"    "+cust.get(i).goodname);
        }
        System.out.println("总计:"+cust.get(cust.size()-1).price+"元");
    }
}