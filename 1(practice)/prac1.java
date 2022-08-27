
// import java.util.*;


// public class prac1 {
//     // starting 
//     //write a program to print sum of two numbers
//     public static void main(String args[]){
    // int a=10;int b=11;
    // int sum=a+b;
    // System.out.println(sum);
    // // write a program to print simple interest si=ptr/100
    // int p=10;
    // int t=2;
    // int r=15;
    // int si=(p*t*r)/100;
    // System.out.println(si);
    // // write a program to print maximum of three numbers
    // int n1=2;
    // int n2=3;
    // int n3=4;
    // if(n1>n2){  // 2>3
    //     if(n1>n3){// 2>4
    //         System.out.println(n1);// print 2
    //     }
    // }
    // else if(n2>n3){//3>2 and 3>4
    //     System.out.println(n2);//print 3
    // }
    // else{
    //     System.out.println(n3);// 3<4 //print 4
    // }

    // // write a program to print prime number
    // int n11=6;
    // if(n11%2==0){
    //     if(n11==2){
    //         System.out.println("prime");}
    //     else{
    //     System.out.println("not prime");}
    // }
    // else{
    //     System.out.println("prime");
    // }

    // write a program to print sum of first natural numbers
    // int val=3;//0+1+2+3
    // int sums=0;
    // int i=0;
    // while(i<=val){
    //     sums=sums+i; 
    //     System.out.println(sums);
    //     i++;
    // } 

    //write a program to find area of circle
    // int r=1;
    // float area = 3.14f * r *r;
    // System.out.println(area);

    //write a program to print even numbers between 1 to 100
    // int i=1,n=100;
    // while(i<=n){
    //     if(i%2==0){
    //         System.out.print(i+ " ");
    //     }
        
    //    i++;
    // }

    //write a program to find average of three numbers
    // int a=3,b=4,c=5,sum,average;
    // sum=a+b+c;
    // average=sum/3;
    // System.out.println(average); 

    //OPERATERS
    //arithemetic operaters-(binary operater)
    // int n1=1,n2=2 ;
    // int a= n1+n2;
    // int b= n1-n2;
    // int c= n1*n2;
    // int d= n1/n2;
    // int e=n1%n2;
    // System.out.println(a +" "+b+" "+c+" "+d+" "+e);

    //  //arithemetic operaters-(unary operater)
    // int a=10;
    // int b=a++;
    // System.out.println(a + " "+b);
    // int a1=10;
    // int b1=++a1;
    // System.out.println(a1 + " "+b1);

    //relational operaters
    // int a=10,b=20;
    // System.out.println(a==b);
    // System.out.println(a!=b);
    // System.out.println(a>=b);
    // System.out.println(a<=b);
    // System.out.println(a<b);
    // System.out.println(a>b);

    // logical operaters
    // int a=10,b=20;
    // int n=100;
    // System.out.println(a>n&&b>n);
    // System.out.println(a>n||b<n);
    // System.out.println(a<n&&b<n);
    // System.out.println(a<n||b<n);
    // System.out.println( !(a<n));
    // System.out.println( !(a>n));

    // Assignment operaters
    // int a=1,b=3 ,sum=0 ,sum1=0,sum2=0;
    // sum+=a;
    // sum1-=a;
    // sum2*=a;
    // System.out.println(sum);
    // System.out.println(sum1);
    // System.out.println(sum2);

    //Ternary operater
    // int marks=50;
    // boolean grade=(marks<53)?true:false;
    // int greater=(5>3)?5:3;
    // String type=(4%2==0)?"even":"odd" ;
    // System.out.println(grade);
    // System.out.println(greater);
    // System.out.println(type);
   
    // SWITCH statement
    // Scanner sc= new Scanner(System.in);
    // int a=sc.nextInt();
    // int b=sc.nextInt();
    // char oper = sc.next().charAt(0);
    // switch(oper){
    //     case '+':{System.out.println(a +b);}
    //                 break;
    //     case '-':{System.out.println(a -b);}
    //                 break;
    //     case '*':{System.out.println(a *b);}
    //                 break;
    //     case '/':{System.out.println(a /b);}
    //                 break;
    //     default:{
    //         System.out.println("invalid");
    //     }
    // }

    // print pattern
    // int n=5;
    // for(int i=0;i<=n;i++){
    //     System.out.println("@@@@@@@@@");
    // }
    
    // write a program to print reverse of a number
    //  Scanner sc= new Scanner(System.in);
    //  System.out.println("enter a number");
    //  int num=sc.nextInt();
    //   int rem=0;
    // while(num>0){
    //      rem=num%10;
    //      System.out.print(rem+"");
    //      num=num/10;
    // }

    // do while 
    // int i=2;
    // int n=4;
    // do{
    //     System.out.println("printed");
    //     i++;
    // }
    // while(i>n);

    // break and continue statement
   
    // int n=4;
    // for(int i=0;i<n;i++){
    //     if(i==3){
    //         break;
    //         continue;
    //     }
    //     System.out.println(i);

    // }

    // program to print the numbers entered by user except 10 multiple
    //   Scanner sc= new Scanner(System.in);
   
    //  do{
       
    //     int n=sc.nextInt();
    //     if(n%10==0){
          
    //         continue;
           
    //     }
    //     System.out.println(n);
    //  }
    //  while(true);
   
// }
// }

