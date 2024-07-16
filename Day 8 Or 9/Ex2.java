public class Ex2{

    public static int multiply(int a, int b){
        int product = a*b;
        return product;
    }

    public static void main(String args[]){

        int a=3;
        int b=3;
        int prod = multiply(a,b);
        System.out.println("a * b =" + prod);
        System.out.println(multiply(5,2));
        System.out.println(multiply(6,6));
    }
}