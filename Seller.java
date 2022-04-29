import java.util.ArrayList;
import java.util.Scanner;

public class Seller {
    private static double income=0;
    Scanner sc=new Scanner(System.in);

    public void AddIncome(double consume){
        income+=consume;
    }

    public double GetIncome(){
        return income;
    }
    public ArrayList<Customer> Sell(){
        ArrayList<Customer> cu=new ArrayList<Customer>();
        Customer sum=new Customer();
        System.out.println("务必注意输入格式：数量 商品名称");

        while(true){
            Customer c=new Customer();
            int m=0;
            int b=sc.nextInt();
            String a=sc.nextLine();
            if(a.indexOf("结算")!=-1)break;
            for(int i=0;i<Bread.list.size();i++){
                if(a.indexOf(Bread.list.get(i).name)!=-1){
                    c.goodname=Bread.list.get(i).name;
                    c.num=b;
                    c.price=b*Bread.list.get(i).price;
                    if(Bread.list.get(i).number<=0){
                        System.out.println("当前商品缺货ing~~");
                        break;
                    }
                    Bread.list.get(i).number-=b;
                    cu.add(c);
                    m=1;
                    break;
                }
            }
            if(m==1)continue;
            for(int i=0;i<Water.list2.size();i++){
                if(a.indexOf(Water.list2.get(i).name)!=-1){
                    c.goodname=Water.list2.get(i).name;
                    c.num=b;
                    c.price=b*Water.list2.get(i).price;
                    if(Water.list2.get(i).number<=0){
                        System.out.println("当前商品缺货ing~~");
                        break;
                    }
                    Water.list2.get(i).number-=b;
                    cu.add(c);
                    break;
                }
            }
        }//商品检索结束
        cu.add(sum);
        for(int i=0;i<cu.size()-1;i++)sum.price+=cu.get(i).price;
        System.out.printf("总计消费：%.1f\n",cu.get(cu.size()-1).price);
        return cu;
    }
    public void SetIncome(double a){
        income+=a;
    }
}
