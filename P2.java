package Patterns;

import org.w3c.dom.stylesheets.StyleSheet;

public class P2 {
    public static void main(String args[]){
         pattern1(4);
         System.out.println();
         pattern2(5);
         System.out.println();
         pattern3(5);
         System.out.println();
         pattern4(5);
         System.out.println();
         pattern5(5);
         System.out.println();
         pattern6(5);
         System.out.println();
         pattern7(5);
         System.out.println();
         pattern8(5);
         System.out.println();
         pattern9(5);
         System.out.println();
         pattern10(5);
         System.out.println();
         pattern11(5);
         System.out.println();
         pattern12(5);
         System.out.println();
        pattern13(4);
        System.out.println();
         pattern14(5);
         System.out.println();
         pattern15(5);
         System.out.println();
        pattern16(5);
        System.out.println();
        pattern17(5);
        System.out.println();
        pattern18(5);
         



    }

    static void pattern1(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern2(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n){
        for(int i=1;i<=n;i++){
            for(int space=1;space<=n-i;space++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern5(int n){
        for(int i=1;i<=n;i++){
            for(int space=2;space<=i;space++){
                System.out.print(" ");
            }
            for(int j=(2*(n-i+1)-1);j>=1;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    static void pattern6(int n){
        for(int i=1;i<=n;i++){
            for(int space=1;space<=n-i;space++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            for(int space=2;space<=i;space++){
                System.out.print(" ");
            }
            for(int j=(2*(n-i+1)-1);j>=1;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    static void pattern7(int n){
        int start=1;
        for(int i=1;i<=n;i++){
            if(i%2==0){
                start=0;
            }
            else{
                start=1;
            }
            for(int j=1;j<=i;j++){
                
                System.out.print(start);
                start=1-start;

            }
            System.out.println();
        }
    }

    // static void pattern8(int n){
    //      for(int i=0;i<n;i++){
    //         char ch ='A'+ i;
    //         for(int j=0;j<=i;j++){
    //             System.out.print(ch);
    //         }
    //         System.out.println();
    //      }
    // }

    static void pattern8(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            for(int space=1;space<=2*(n-i+1)-2;space++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }

    }
    static void pattern9(int n){
        int count=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(count++ + " ");
            }
            System.out.println();
        }
    }

    static void pattern10(int n){
        for(int i=0;i<n;i++){
            char ch=(char)('A'+ i);
            for(int j=0;j<=i;j++){

                System.out.print(ch + " ");

            }
            System.out.println();
        }
    }

    static void pattern11(int n){
        for(int i=0;i<n;i++){
            
            for(int j=0;j<=i;j++){
                char ch=(char)('A'+j);
                System.out.print(ch + " ");

            }
            System.out.println();
        }
    }

    static void pattern12(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=n-i-1;j++){
                char ch=(char)('A'+j);
                System.out.print(ch+" ");
            }
            System.out.println();
        }

    }

    static void pattern13(int n){
        for(int i=0;i<n;i++){
            for(int space=1;space<=n-i-1;space++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                char ch=(char)('A'+ j);
                System.out.print(ch);
            }
            for(int j=i-1;j>=0;j--){
                char ch =(char)('A'+ j);
                System.out.print(ch);

            }

            System.out.println();
        }
    }

    static void pattern14(int n){
        
        for(int i=0;i<n;i++){
            for(int j=i;j>=0;j--){
                char ch=(char)('A'+ n-j-1);
                System.out.print(ch+" ");
                
            }
            System.out.println();
        }
    }

    static void pattern15(int n){
        int inis=2*n-2;
        for(int i=1;i<=2*n;i++){
            if(i>n){
                for(int j=1;j<=i-n;j++){
                    System.out.print("*");
                }
                for(int space=1;space<=inis;space++){
                    System.out.print(" ");
                }
                for(int j=1;j<=i-n;j++){
                    System.out.print("*");
                }
                inis-=2;
                
                
                
            }
            else{
                for(int j=1;j<=n-i+1;j++){
                    System.out.print("*");
                }
                for(int space=1;space<=2*(i-1);space++){
                    System.out.print(" ");
                }
                for(int j=1;j<=n-i+1;j++){
                    System.out.print("*");
                }

            }
            System.out.println();
        }
    }

    static void pattern16(int n){
        int  inis=2*n-2;
        for(int i=1;i<2*n;i++){
            if(i<=n){
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                for(int space=1;space<=inis;space++){
                    System.out.print(" ");
                }
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                inis-=2;

            }
            else{
                inis+=2;
                for(int j=1;j<=2*n-i;j++){
                    System.out.print("*");
                }
                for(int space=1;space<=inis;space++){
                   System.out.print(" ");
                }
                for(int j=1;j<=2*n-i;j++){
                    System.out.print("*");
                }
                


            }
            System.out.println();

        }
    }

    static void pattern17(int n){
        for(int i=1;i<=n;i++){
            if(i==1 || i==n){
                for(int j=1;j<=n;j++){
                    System.out.print("*");
                }
            }
            else{
                for(int j=1;j<=1;j++){
                    System.out.print("*");

                }
                for(int space=1;space<=n-2;space++){
                    System.out.print(" ");
                }
                for(int j=1;j<=1;j++){
                    System.out.print("*");

                }

            }
            System.out.println();
        }
    }

    static void pattern18(int n){
        for(int i=1;i<2*n;i++){
            for(int j=1;j<2*n;j++){
                int everyIndex=Math.min(Math.min(i,j), Math.min(2*n-i,2*n-j));
                System.out.print((n-everyIndex)+" ");
            }
            System.out.println();
        }
    }
}
