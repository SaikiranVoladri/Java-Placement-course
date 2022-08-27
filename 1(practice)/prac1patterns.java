// public class prac1patterns {
//     public static void main(String args[]){
//         int n=5;
//       //WRITE A PROGRAM TO PRINT PATTERNS
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }


//********************************************************************************************************************************


    //  // WRITE A PROGRAM TO PRINT  REVERSE PATTERNS
    //     public class prac1patterns {
    //         public static void main(String args[]){

    //     int n=5;
    //     for(int i=1;i<=n;i++){
    //         for(int j=n;j>=i;j--){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }



//********************************************************************************************************************************* 
     //WRITE A PROGRAM TO PRINT  SEQUENCE CHARACTERS
    //  public class prac1patterns {
    // public static void main(String args[]){
    //     int n=5;
    //     for(int i=1;i<=n;i++){
    //         char ch='a';
    //         for(int j=1;j<=i;j++){
    //             {
    //                 System.out.print(ch);
    //                 ch++;
    //             }

    //         }System.out.println();
    //     }

//********************************************************************************************************************************* 

       //WRITE A PROGRAM TO PRINT HOLLOW RECTANGLE
       public class prac1patterns {
    public static void main(String args[]){

         int n=8;
         for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1||i==n ||j==1||j==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
         }



    }
    
}
