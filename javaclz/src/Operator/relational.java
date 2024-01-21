package Operator;

public class relational {
    
    public static void main(String args[]){
        System.out.println();
        //------------------------------------
        //write your code
        //-----------------------------------


        int a = 10;
        int b = 40;
        int c = 0;
        int d = 10;

        // ==	equal to
        System.out.println("equal to : "+( a==d ));
        System.out.println("equal to : "+( d==a ));
        System.out.println();

        // !=	not equal
        System.out.println("not equal : "+( a!=b ));
        System.out.println("not equal : "+( d!=a ));
        System.out.println();
        
        // >	grater than                 10 > 40
        System.out.println("grater than (a=10 > b=40) : "+( a>b ));
        System.out.println("grater than (b=40 > a=10) : "+( b>a ));
        System.out.println("grater than (c=0 > d=10): "+( c>d ));
        System.out.println("grater than (d=10 > c=0): "+( d>c ));
        System.out.println();

        // <	less than
        System.out.println("less than (a=10 > b=40) : "+( a<b ));
        System.out.println("less than (b=40 > a=10) : "+( b<a ));
        System.out.println("less than (c=0 > d=10): "+( c<d ));
        System.out.println("less than (d=10 > c=0): "+( d<c ));
        System.out.println();

        // >=	grater than (or and) equal to
        System.out.println("less than (a=10 >= b=40) : "+( a>=b ));
        System.out.println("less than (b=40 >= a=10) : "+( b>=a ));
        System.out.println("less than (c=0 >= d=10): "+( c>=d ));
        System.out.println("less than (d=10 >= c=0): "+( d>=c ));
        System.out.println();

        // <=	less than (or and) equal to
        System.out.println("less than (a=10 >= b=40) : "+( a<=b ));
        System.out.println("less than (b=40 >= a=10) : "+( b<=a ));
        System.out.println("less than (c=0 >= d=10): "+( c<=d ));
        System.out.println("less than (d=10 >= c=0): "+( d<=c ));
        System.out.println();


        //-----------------------------------
        System.out.println();
    }

}
