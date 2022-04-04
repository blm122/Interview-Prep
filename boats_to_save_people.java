class boats_to_save_people {
    public int numRescueBoats(int[] people, int limit) {
        
        int boats = 0;
        Arrays.sort(people);
        int i = 0; int j = people.length - 1;
        
        while(i <= j)
        {
            boats++;
            if(people[i] + people[j] <= limit)
            {
                
                i++;
                //j--;
            }
            
            j--;
        }
        
        return boats;
    }
}
