import java.util.Scanner;
public class NewString {
    public static void main(String args[]) {
Scanner sc = new Scanner(System.in);

        String str;
        int i,l;
        System.out.println("enter string");
        str = sc.nextLine();
        char strArr[] = str.toCharArray();
        l=strArr.length;
        if(l<=3)
        {
        for ( i = 0; i < l; i++) {
           
            if (strArr[i] >= 'a' && strArr[i] <= 'z') {
                strArr[i] = (char) ((int) strArr[i] - 32);
            }
        }
}
else
{
for(i=l-3; i<l ; i++)
{
 if (strArr[i] >= 'a' && strArr[i] <= 'z') {
                strArr[i] = (char) ((int) strArr[i] - 32);
            }
}
}
        
        for (i = 0; i < l; i++)
         {
            System.out.print(strArr[i]);
        }
    }
}