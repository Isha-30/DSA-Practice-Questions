class Solution
{
    public static int shouldPunish (int roll[], int marks[], int n, double avg)
    {
        int swap = 0;
        for(int i = 0; i<n-1; i++){
            for(int j = 0; j<n-i-1; j++){
                if(roll[j]>roll[j+1]){
                    int temp = roll[j]; 
                    roll[j] = roll[j+1];
                    roll[j+1] = temp;
                    
                    swap+=2;
                }
            }
        }
        
        int sum = 0;
        for(int m : marks)
            sum+=m;
            
        double newAvg = (sum - swap)/n;
        
        if(newAvg < avg)
            return 0;
        return 1;
    }
}
