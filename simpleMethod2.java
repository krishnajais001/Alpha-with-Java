public class simpleMethod2 {
    static void  update(int A[]){
     A[0]=8;
     A[1]=6;
     A[2]=4;
     A[3]=2;
     A[4]=0;
        
    }

    static int test(int x){
        x=15;
        return x;
    }
    public static void main(String[] args) {
        // int A[]={0,2,4,6,8};
        // update(A);
        // System.out.println(A[0]);

        int x=5;
       
        System.out.println( test(x));
    }
}
