# the optimal solution to the reversal of an array using the collections Class and its reverse method
class Reverse3
{
   public static void main(String[] args) 
   { 
        int [] a = {2,5,4,1,3}; 
        System.out.println("Original Array:" + Arrays.asList(a));
        Collections.reverse(Arrays.asList(a)); 
        System.out.println("Reversed Array:" + Arrays.asList(a));  
   }
}
