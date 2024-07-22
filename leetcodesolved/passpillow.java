 class passpillow{
    public static void main( String args[]){
        int times=5;
        int n=4;
        int ans =pass(n,times);
        System.out.println(ans);
    }
    public static int pass( int n,int times){
        boolean pos=true;
        int i=0;
        int count=0;
        boolean dir=true;
        while(n!=0){
            if(i==n && dir){
                n--;
                pos=!pos;
                dir=!dir;
            }
            if(i==1 && !dir){
                dir=!dir;
                pos=!pos;
            }
            if(pos){
                ++i;
            }else{
                --i;
            }
        System.out.println(i);
            if(count==times){
                return i;
            }
            count++;
        }

        return 1;
    }
}