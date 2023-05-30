import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        int c=0,d=0;
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        for(int j=0;j<n;j++) b[j]=sc.nextInt();
        for(int i=0;i<n-1;i++){
            if(a[i]==a[i+1])
            c++;
            if(b[i]==b[i+1])
            d++;
        }
        if(c>=d)
        System.out.println("Bob");
        else
        System.out.println("Alexa");
    }
}