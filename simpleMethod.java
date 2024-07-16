public class simpleMethod {
    static int max(int x,int y){
        if (x>y) {
            return x;
        } else {
            return y;
        }
        
    }
    public static void main(String[] args) {
        int a=100;
        int b=150;
        int c=max(a, b);
        System.out.println(c);
    }
}
