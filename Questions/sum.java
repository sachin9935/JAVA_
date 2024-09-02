class sum{
    public static void fun_sum(int i,int n,int sum){
        if(i==n){
            sum+=i;
            System.out.println(sum);
            return;
        }
        sum+=i;
        fun_sum(i+1,n,sum);
        System.out.print(i);
    }
    public static void main(String args[]){
        fun_sum(1,5,0);
    }
}