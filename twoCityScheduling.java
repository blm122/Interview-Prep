class twoCityScheduling {
    public int twoCitySchedCost(int[][] costs) {
        
        int sum = 0;
        
        Arrays.sort(costs, (a, b) -> { return (a[0] - a[1]) - (b[0] - b[1]); });
       
        int n = costs.length/2;
        
        for(int x = 0; x < costs.length/2; x++)
        {
            sum = sum + costs[x][0] + costs[x+n][1];
        }
        
        return sum;
    }
}
