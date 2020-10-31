//####################################### leftmost reapeting character################################3
import java.util.*;
public class String
{
    public static void main(String args[]) {
      char[]  str="geegksforgeeks".toCharArray();
     
int ans=find(str);
System.out.println(ans);
    }
public static int  find(char[] str) {
    int[] count= new int[256];
      for(int i=0;i<256;i++)
      {
          count[i]=-1;
      }

int res=Integer.MAX_VALUE;
    for(int i=0;i<str.length;i++)
{
 if(count[str[i]]==-1)
 {
     count[str[i]]=i;
 }
 else
 {
     res=Math.min(res,count[str[i]]);
 }

}

return res==Integer.MAX_VALUE?-1:res;

}
}






        
    
