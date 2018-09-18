import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int a[][] = new int[3][3];
    int b[][] = new int[3][3];
    int i, j;
    System.out.print("Enter elements of 2D array: ");
    for(i=0; i<3; i++)
    {
      for(j=0; j<3; j++)
      {
          a[i][j] = sc.nextInt();
      }
    }
    for(i=0; i<3; i++)
    {
      for(j=0; j<3; j++)
      {
        System.out.print(a[i][j] + " ");
      }
    }
  }
}