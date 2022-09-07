public class methodoverloading {
    public static void main(String args[]){
        Calculater calc= new Calculater();
         int a=calc.sum(1,2);
         System.out.println(a);
         int b= calc.sum(1,2,3);
         System.out.println(b);

         System.out.println(calc.sum(1.5,2.5));
    }
    
}
class Calculater{
    int sum(int a,int b){
        return a+b;

    }
    double sum(double a,double b){
        return a+b;
    }
    int sum(int a, int b, int c){
        return a+b+c;
    }
}