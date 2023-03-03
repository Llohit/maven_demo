import java.util.Scanner;

public class helloworld {
    public static void main(String[] args)
    {
        helloworld obj=new helloworld();
        System.out.println("Please Enter ");
        Scanner scanner=new Scanner(System.in);
        int n =scanner.nextInt();
        System.out.println(obj.fact(n));

    }

    public int fact(int n){
        int ans=1;
        for(int i=1;i<=n;i++)
        {
            ans=ans*i;
        }
        return ans;
    }
}
