// public class functions {
//     //write a program to print the sum of two numbers using function 

//     public static int PrintSum(int a,int b){
//         int sum=a+b;
//         return sum;
//     }
//     public static void main(String args[]){
//         int a=1;
//         int b=2;
//         System.out.println(  "sum is "+ PrintSum(a,b));


//******************************************************************************************** */
// public class functions {
//     //write a program to print the Factorial of a number using function 

//     public static int factorial(int n){
//         int fact=1;
//         for(int i=n;i>=1;i--){
//             fact=fact*i;
//         }
//         return fact;
//     }
//     public static void main(String args[]){
//         int n=5;
//        System.out.println("factoraial of "+ n+ " is:"+ factorial(n));

//     }
    
// }
// public class functions {
//     //     //write a program to print the Binomial coefficient  of a number using function 
//     // binomial coeff=ncr=nfact/n-r fact *rfact
//     public static int factorial(int n){
//                 int fact=1;
//                 for(int i=n;i>=1;i--){
//                     fact=fact*i;
//                 }
//                 return fact;
//             }
//     public static int Binomialcoefficient(int n,int r){
//          int bincoff= factorial(n)/(factorial(n-r)*factorial(r));

//   return bincoff;
//     }
//     public static void main(String args[]){
//                 int n=5,r=5;
//                System.out.println("Binomial coefficient of is:"+  Binomialcoefficient( n, r));
// }
// }   

//------------------------------------------------------------------------------------------------------------
//write a program to check weather the number is prime or not
// public class functions {
//     public static boolean isprime(int n){
//         boolean prime=true;
//        //for(int i=2;i<n;i++)
//        for(int i=2;i<Math.sqrt(n);i++){

//         if(n%i==0){
//             prime=false;
//         }
//         else if(n==2){
//             prime=true;
//         }
//        }
//        return prime;

//     }
//     public static void main(String args[]){
//     int n=27;
//     System.out.println(isprime(n));

// }}

//write a program to print  prime  numbers between 100
// public class functions {
//         public static boolean isprime(int n){
//             boolean prime=true;
//            for(int i=2;i<n;i++){
//             if(n%i==0){
//                 prime=false;
//             }
//             else if(n==2){
//                 prime=true;
//     //         }
    //        }
    //        return prime;
    //     }
    //     public static void primeinrange( int n){
    //         for(int i=2;i<n;i++){
    //        if(isprime(i)==true){
    //         System.out.print(i+" ");
    //        }
    //       }
    //     }
        
    //      public static void main(String args[]){
    // int n=2;
    // int r=100;
    // primeinrange(100);
    //     }

    // }

    // write a program to convert  DECIMAL NUMBER t TO BINARY NUMBER
    public class functions {
        public static int DtoB(int des_num){
            int pow=0;
            int bin_number=0;
            while(des_num>0){
                int lastdigit=des_num%2;
                bin_number+=lastdigit*(int)Math.pow(10,pow);
                pow++;
                des_num=des_num/2;


            }
            return bin_number;

        }
        public static void main(String args[]){
            int des_num=7;
            System.out.println("Binary no ="+DtoB(des_num));

        }




    }
