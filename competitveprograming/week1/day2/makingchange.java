public class makingchange
{
    public static void main(String[] args) 
    {
        int n=100;
        int[] coins=new int[]{1,5,10,25,50};
        int[] tab = new int[n+1];
        // int m=coins.length;
        // for(int i = 0; i < n+1 ; i++)
        // {
        //     tab[i] = 0;
        // }
        tab[0] = 1;
        for(int denomination: coins)
            for(int i= denomination;i < tab.length; i++ )
                tab[i] = tab[i]+tab[i-denomination];

        System.out.println(tab[n]);
    }
}

        
        