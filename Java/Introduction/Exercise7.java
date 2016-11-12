import java.util.Scanner;

class Exercise7{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        
        int q = in.nextInt();
        
        if( q > 0 && q < 500 ){
            
            for(int i=0;i<q;q++){
                int a = in.nextInt();
                int b = in.nextInt();
                int n = in.nextInt();
                int previousResult = 0;
                    
                previousResult = a +  b;
                System.out.print( previousResult+ " ");
                
                for (int j = 1; j < n; j++){
                    previousResult += Math.pow(2, j) * b; 
                    System.out.print( previousResult+ " ");
                }
                System.out.println("");
            }    
        }
        
        in.close();
    }
}
