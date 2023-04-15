#a java program to reverse the array
class Reversearray
{
    public static String reverseWord(String str)
    {
        String stri="";
        for(int i=str.length()-1;i>=0;i--)
            stri+=str.charAt(i);
        return stri;
    }
}
