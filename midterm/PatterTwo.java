public class PatterTwo {
    public static void main(String[] args) {
        /** 
        
        print the pattern
        1 2 3 4 5 6
        1 2 3 4 5
        1 2 3 4
        1 2 3
        1 2
        1        
        **/

        for(int i=6;i>0;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        
        
    }
    
}
