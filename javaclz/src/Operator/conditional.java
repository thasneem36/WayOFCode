package Operator;

public class conditional {
    
    public static void main(String[] args){

        System.out.println();
        //-----------------------------------------

        //AND
        int a = 10;
        int b = 10;
        int c = 10;
        int d = 1;
        

        boolean o1 = (a==b);
        boolean o2 = (c==d);

        //AND
        System.out.println("AND "+ (o1&&o2) );
        //OR
        System.out.println("OR "+ (o1||o2) );

        //----------------------------------------
        System.out.println();

    }

}
