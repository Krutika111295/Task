class variable1
{
    static int age;
}
class main{
    public static void main(String[] args){
        variable1 v1=new variable1();
        variable1 v2=new variable1();
        v1.age=20;
        v2.age=30;
        variable1.age=32;
        System.out.println("v1 age is" +v1.age);
        System.out.println("v2 age is" +v2.age);


    }
}