class Solution {
    public int tribonacci(int n) {    
        // egde case 
        if (n==0){
            return 0;
        } else if ( n==1 || n== 2){
            return 1;
        }else{
            // initilization

            int ft = 0;
            int st = 1;
            int tt = 1;
            // loop 

            for(int i =1 ; i<=n; i++){

                int Ft = ft + st + tt ;

                ft = st;
                st = tt;
                tt = Ft;
            }
            

            return ft;

        }
        
    }
}