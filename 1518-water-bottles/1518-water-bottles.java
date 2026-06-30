class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
         int ans = numBottles ; // drinking water

         while (numBottles >= numExchange ){
            // loop checking for empty bottles , and finding remaining bottles

            int newBottles = numBottles / numExchange ;

            int remBottles = numBottles % numExchange ;

             ans = ans + newBottles ;

            numBottles = newBottles + remBottles ;

         }

         return ans ;
        
    }
}