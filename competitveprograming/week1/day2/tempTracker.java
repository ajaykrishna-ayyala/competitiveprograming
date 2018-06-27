public class tempTracker
{
    static int[] occ = new int[111];
    static Integer mode;
    static Double mean;
    static Integer mini;
    static Integer maxi;
    static int count = 0;
    static double sum = 0.0;
    static int max_occ=0;
    public static void push(int t) 
    {
        occ[t]++;
        if (occ[t] > max_occ) 
        {
            mode = t;
            max_occ = occ[t];
        }
        count++;
        sum += t;
        mean = sum / count;
        if (maxi == null || t > maxi) 
        {
            maxi = t;
        }
        if (mini == null || t < mini) 
        {
            mini = t;
        }
    }

    public static Integer getMax() 
    {
        return maxi;
    }

    public static Integer getMin() 
    {
        return mini;
    }

    public static Double getMean() 
    {
        return mean;
    }

    public static Integer getMode() 
    {
        return mode;
    }

    public static void main(String[] args) 
    {
    	push(10);
        System.out.println("MAX   MIN  MEAN   MODE");
    	System.out.println(getMax()+"     "+getMin()+"  "+getMean()+"    "+getMode());
    	push(20);
    	System.out.println(getMax()+"     "+getMin()+"  "+getMean()+"    "+getMode());
    	push(30);
    	System.out.println(getMax()+"     "+getMin()+"  "+getMean()+"    "+getMode());
    	push(40);
    	System.out.println(getMax()+"     "+getMin()+"  "+getMean()+"    "+getMode());
    }
}