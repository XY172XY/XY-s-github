package com.ISEKAI.tool;
public class PersonMain{
    public static class Person{
        private String name;
        private int age;
        private int sex;
        private static int num=0;
        public Person(String name,int age,int sex) {
            this.name=name;
            this.age=age;
            this.sex=sex;
            num++;
        }
        private void destory(Person target){
            target=null;
            num--;
        }
        private void eat(){
            System.out.println(name+"学长让我吃东西(*^_^*)");
        }

        private void sleep(){
            System.out.println(name+"我不要睡觉，招新题还没做完/(ㄒoㄒ)/~~");
        }

        private void dadoudou(){
            System.out.println(name+"/"+age+"/"+sex+"管你是谁，不准打豆豆(╯▔皿▔)╯");
        }

        public void xuigai(String newname,Person origin) {
            //我想在输入的变量里使用&引用，但不知道java是不需要还是需要其它语法，/(ㄒoㄒ)/~~
            //学长解答了一下，是的不需要，java里这两个就是引用类
            origin.name = newname;
        }
        public static int count(){
            return num;
        }
    }
    public static void main(String[] args) {
        Person myclass1=new Person("XY",18,1);
        Person myclass2=new Person("XY",18,1);
        Person myclass3=new Person("XY",18,1);
        System.out.println(Person.count());
        //最后一直尝试，没搞懂为什么@Override了finalize()不给起，我查到的代码是这样用的...，先这样吧，历史遗留问题，en
        myclass1.destory(myclass1);
        System.out.println(Person.count());
    }
}

