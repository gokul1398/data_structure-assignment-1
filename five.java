import java.util.Scanner;
class Five{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of array: ");
    int size = sc.nextInt();
    int a[] = new int[size];
    System.out.print("Enter elements in array: ");
    for(int i=0; i<size; i++)
    {
      a[i] = sc.nextInt();
    }
    System.out.print("Elements in array: ");
    for(int i=0; i<size; i++)
    {
      System.out.print(a[i]+" ");
    }
    reverse(a, size);
  }
  static void reverse(int[] a, int size)
  {
    System.out.print("\nReverse of array: ");
    for(int i=size-1; i>=0; i--)
    {
      System.out.print(a[i]+" ");
    }
  }
}//Code written by gokul katoch