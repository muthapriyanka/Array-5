class Solution {
    public boolean isRobotBounded(String instructions) {
        if(instructions==null || instructions.length()==0)
        {
            return true;
        }
        int[][] dir={{0,1},{1,0},{0,-1},{-1,0}}; //N E S W
        int x=0;
        int y=0;
        int i=0;
        for(int j=0;j<instructions.length();j++)
        {
            char c= instructions.charAt(j);
            if(c=='G')
            {
                x=x+dir[i][0];
                y=y+dir[i][1];
            }
            else if(c=='L')
            {
                i=(i+3)%4;
            }
            else if(c=='R')
            {
                i=(i+1)%4;
            }
        }
        return(x==0 && y==0)|| (i!=0);
    }
}
