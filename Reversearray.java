#a java program to reverse the array
class Reverse1
{
    public static String reversestring(String s)
    {
        String s1="";
        for(int i=s.length()-1;i>=0;i--)
            s1+=s.charAt(i);
        return s1;
    }
    public static void main(Sring args[])
    {
        String str = "sihT esreveR"
        String reversedString = reversestring(str);
        System.out.println("The reversed String is " + reversedString);
    }
    
}
