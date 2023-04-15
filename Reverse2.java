# a java program to reverse an array using two pointers
class Reverse2
{
  public static String reversestring(String s)
  {
    int i=0;
    int j=s.length-1;
    while(i<j)
    {
      char temp=s[i];
      s[i]= s[j];
      s[j]=temp;
      i++;
      j++;
    }
    return s;
  }
  public static void main(String args[])
  {
    String str="sihT esereveR";
    String revstr=reversestring(str);
    System.out.println("Reversed String is " + revstr);
  }
}
