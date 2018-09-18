import java.util.Scanner;
class Main{
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
    largest(a, size);
  }
  static void largest(int[] a, int size)
  {
    int max = a[0];
    for(int i=0; i<size; i++)
    {
      if(a[i] > max)
      {
        max = a[i];
      }
    }
    System.out.print("\nMaximum value: "+max);
}// code written by gokul katoch