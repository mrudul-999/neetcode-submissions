class pair{
    int position;
    int speed;

    pair(int position, int speed)
    {
        this.position = position;
        this.speed = speed;
    }
}

class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        
        //int[] a = new a[10];
        pair[] pairs = new pair[position.length];

        for(int i=0;i<position.length;i++)
        {
            pairs[i] = new pair(position[i],speed[i]); 
        }

        Arrays.sort(pairs,(a,b)->b.position-a.position);

        //4,1
        //2,3

        //logic
        //push nearest car in stack
        //for the next car check time it will take to reach the target
        //if that car takes time equal or less than the car in stack, we have
        // a fleet, safe to ignore it and increment count
        //check for next car
        //if car takes more time to reach and wont form a fleet
        Stack<pair> stack = new Stack<>();
        int count = 0;
        for(int i=0;i<position.length;i++){
            if(stack.isEmpty())
            {
                stack.push(pairs[i]);
            
            }
            else{
                 double timeToTarget = (double)(target - pairs[i].position) / pairs[i].speed;
               double timeToFleet = (double)(target - stack.peek().position)/stack.peek().speed;

               if(timeToFleet<timeToTarget)
               {
                stack.push(pairs[i]);
               }
            }
        }
       //4 1
       //2 3

        return stack.size();
    }
}
