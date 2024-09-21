package com.ISEKAI;
import java.util.Iterator;
import java.util.Random;
import java.util.List;
import java.util.ArrayList;

public class jicheng  {
    //接口,Order
    interface Order {
        void cook();
        boolean check();
        String nameout();

    }
    //Dish基类
    public static class Dish implements Order {
        private String name;
        private double price;

        @Override
        public void cook() {

        }

        @Override
        public boolean check() {
            return new Random().nextBoolean();
        }

        @Override
        public String nameout() {
            return name;
        }

        Dish(String name, double price) {
            this.name = name;
            this.price = price;
        }

    }
//Dish1
    public static class Dish1 extends Dish {
        public void profile() {
            System.out.println("康师傅大食物桶让你拜托方便面一碗吃不饱，两碗吃不了的烦恼，是做微光招新题时足不出户就能让你填饱肚子的家具必备单单品");
        }

        Dish1() {
            super("康师傅老坛酸菜大食桶", 200);
        }

        @Override
        public void cook() {
            System.out.println("将泡面饼与调料一并放入口腔中，然后倒入开水至淹没面饼，等待3分钟后直接食用");
        }

    }
//Dish2
    public static class Dish2 extends Dish{
        public void profile() {
            System.out.println("德芙纵享丝滑");
        }

        Dish2() {
            super("德芙小清新柠檬曲奇巧克力", 300);
        }


        @Override
        public void cook() {
            System.out.println("必须在长椅上制作，制作时请扶好扶手，太丝滑可能导致不必要的碰撞");
        }

    }

    //顾客类
        public static class TableCustomer {
            public int tableId;
            private TableCustomer(int tableId){
                this.tableId=tableId;
            }
        }
        public static class WechatCustomer {
            public String address;//顾客地址
            public boolean takeout;//true代表该顾客是外卖，false代表该顾客是堂食
            private WechatCustomer(String address,boolean takeout){
                this.address=address;
                this.takeout=takeout;
            }
        }

    //厨师类
    public static class system<Type> {
        private static int Ordernum=1;
        //请补全处理订单的函数
       public void manageOrder(List<Order> dishes,Type custom) {
            boolean canIcook=true;
            for (Order dish:dishes) {
                if(!dish.check()){
                    canIcook=false;
                    break;
                }
            }
            if(canIcook){
                System.out.println(Ordernum+"号顾客所需菜品如下");
                for(Order dish:dishes){
                    //输出做好的菜名和对应做法
                    System.out.println(dish.nameout());
                    System.out.print("制作方法：");
                    dish.cook();
                }
                System.out.println("订单"+Ordernum+"已完成");
                Ordernum++;
                if(custom instanceof TableCustomer){
                    TableCustomer tableCustomer=(TableCustomer) custom;
                    System.out.println("送餐至"+tableCustomer.tableId+"桌");
                }
                else{
                    WechatCustomer wechatcustomer=(WechatCustomer) custom;
                    if(wechatcustomer.takeout){
                        System.out.println("送餐至"+wechatcustomer.address);
                    }
                    else{
                        System.out.println("顾客到店领取");
                    }
                }
            }
            else{
                System.out.println(Ordernum+"号顾客取消订单");
                Ordernum++;
            }
            //要求1：一旦订单里有一个菜品的原料不足以烹饪，就输出“取消订单”，否则输出所有菜品的烹饪方法，最后再输出该订单的编号，编号从1开始递增。
        }
    }
    //测试代码
    public static void main(String[] args) {
        //菜单初始化
        Dish1 dish1=new Dish1();
        Dish2 dish2=new Dish2();
        //两个系统平台初始化
        system<TableCustomer> sys1=new system<>();
        system<WechatCustomer> sys2=new system<>();
        //三个顾客初始化(懒得手动输入，就直接初始化了，嗯)
        TableCustomer one=new TableCustomer(610);
        WechatCustomer two=new WechatCustomer("电子科技大学欣苑学生宿舍",true);
        WechatCustomer three=new WechatCustomer("电子科技大学欣苑学生宿舍",false);
        //点餐与准备
        System.out.println("菜品列表");
        System.out.print(dish1.nameout()+":");
        dish1.profile();
        System.out.print(dish2.nameout()+":");
        dish2.profile();
        List<Order> list1=new ArrayList<>();
        list1.add(dish1);
        list1.add(dish2);
        //配送
        sys1.manageOrder(list1,one);
        sys2.manageOrder(list1,two);
        sys2.manageOrder(list1,three);

    }
}
