class Ratmaze {
    public static void main(String args[]){
        // this problem is about the rat maze the number of ways to reach the destination
        System.out.println(count(3,3));
        way("",3,3);

    }public static int count ( int row,int col){
        if(row==1 || col==1){
            return 1;
        }
        int left =count(row-1,col);
        int right=count(row,col-1);
        return left+right;
    } public static void way(String p,int row,int col){
        if(row==1 && col==1){
        System.out.println(p);
        return ;
        }
        if(row>1){
            way(p+"D",row-1,col);
        }
        if( col>1){
            way(p+"R",row,col-1);
        }
    }
}