import java.util.ArrayList;
import java.util.Scanner;

public class Goods {
    String name;
    int number;
    double price;
    Scanner sc=new Scanner(System.in);

    public void ChangePrice(String a){
        int i=0;
        System.out.print("输入修改后的价格");
        double v=sc.nextDouble();
            if(a.indexOf("面包")!=-1){
                for(;i<Bread.list.size();i++){
                    if(a.indexOf(Bread.list.get(i).name)!=-1){
                        Bread.list.get(i).price=v;
                        System.out.print("当前"+Bread.list.get(i).name+"价格为:");
                        System.out.printf("%.1f\n",Bread.list.get(i).price);
                    }
                }   //找到要修改的值并修改
            }
            if(a.indexOf("水")!=-1){
                for(;i<Water.list2.size();i++){
                    if(a.indexOf(Water.list2.get(i).name)!=-1){
                        Water.list2.get(i).price=v;
                        System.out.print("当前"+Water.list2.get(i).name+"价格为:");
                        System.out.printf("%.1f\n",Water.list2.get(i).price);
                    }
                }
            }
            if(i==0)System.out.println("抱歉,修改失败!(原因：错误输入格式)");

    }

    public int  CutNumber(int num,int cut){                          
        return num-cut;
    }
}


class Water extends Goods{
    public static ArrayList<Water> list2=new ArrayList<Water>();
    
    public void AddWater(){
        int num=sc.nextInt();
        String a=sc.nextLine();
        int g=0;
        for(int i=0;i<list2.size();i++){
            if(a.indexOf(list2.get(i).name)!=-1){
                list2.get(i).number+=num;
                System.out.println("当前"+list2.get(i).name+"数量"+list2.get(i).number);
                g=1;
            }
        }
        if(g==0)System.out.println("没有该类商品或错误输入格式");
    }
    
}

class Bread extends Goods{
    public static ArrayList<Bread> list=new ArrayList<>();
    
    public void AddBread(){
        int num=sc.nextInt();
        String a=sc.nextLine();
        int g=0;
        for(int i=0;i<list.size();i++){
            if(a.indexOf(list.get(i).name)!=-1){
                list.get(i).number+=num;
                System.out.println("当前"+list.get(i).name+"数量"+list.get(i).number);
                g=1;
            }
        }
        if(g==0)System.out.println("没有该类商品");
    }

}


