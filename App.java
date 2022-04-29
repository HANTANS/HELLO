import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Seller se=new Seller();     
            Goods go=new Goods();
            Customer cu=new Customer();
            Bread br=new Bread();
            ArrayList<Customer> cust=new ArrayList<Customer>();

            Water wa=new Water();
            Water c=new Water();
            c.name="农夫山泉";
            c.number=200;
            c.price=2.0;
            Water.list2.add(c);
            Water b=new Water();
            b.name="普利斯";
            b.number=300;
            b.price=1.0;
            Water.list2.add(b);

            Bread d=new Bread();
            Bread e=new Bread();
            d.name="桃李";
            d.number=20;
            d.price=5.5;
            e.name="宾宝";
            e.number=20;
            e.price=4.5;
            Bread.list.add(d);
            Bread.list.add(e);




            System.out.println("使用规则：\n输入“销售额”查看当前收入\n输入【进货种类目前只有水·面包】:进货种类(回车)数量 具体名称");
            System.out.println("输入“交易”-->依次输入商品数量 名称(后以回车进行下一项商品的输入)-->输入“0 结算完成”");
            System.out.println("输入“修改”-->输入种类与具体名称-->修改后的价格\n输入“发票”打印发票\n输入“退出”退出系统");
            while(true){
                int g=0;  //判断输入字符串是否有满足条件的部分
                String a=sc.nextLine();
                if(a.indexOf("销售额")!=-1)System.out.println("当前销售额"+se.GetIncome()+"\n");
                
                if(a.indexOf("进货")!=-1){
                    if(a.indexOf("面包")!=-1){
                    br.AddBread();     //面包的进货
                    g=1;}
                    if(a.indexOf("水")!=-1){
                    wa.AddWater();     //水类的进货
                    g=1;}
                }
                if(a.indexOf("修改")!=-1){
                        go.ChangePrice(a);      
                        g=1;
                }
                if(a.indexOf("交易")!=-1){
                    cust=se.Sell();
                    se.SetIncome(cust.get(cust.size()-1).price);
                    g=1;
                }
                if(a.indexOf("发票")!=-1){
                    cu.Cust(cust);
                    g=1;
                }
                if(a.indexOf("退出")!=-1)break;
                if(g==0)System.out.println("请重新输入！");
                
                
            }
        }
    }
}
