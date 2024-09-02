class resursion1_5{
    public static void p_num(int n){
        if(n==6){
            return;
        }
        System.out.println(n);
        p_num(n+1);
    }

    public static void main(String[]args){
        int n=1;
         p_num(n);
    }

   
}