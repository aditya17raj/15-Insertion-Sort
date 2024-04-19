import java.util.Scanner;

class insertion
{

    int arr[] = new int[10];

    void createArray()
    {
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<10; i++)
        {
            System.out.println("enter elements in array");
            arr[i]=sc.nextInt();
        }

    }

    void sort()
    {
        int val;
        for(int i=1; i<10; i++)
        {
            val = arr[i];
            int j=i-1;
            while(arr[j] > val)
            {
                arr[j+1] = arr[j];
                j--;

                if(j == -1)
                    break;
            }
            arr[j+1] = val;
        }
    }

    void showArray()
    {
        for(int i=0; i<10; i++)
            System.out.print(" "+arr[i]);
    }
}

public class Main {
  public static void main(String[] args) {
    insertion ss = new insertion();
    ss.createArray();
    System.out.println("Before Sorting");
    ss.showArray();
    System.out.println( "\n After sorting");
    ss.sort();
    ss.showArray();
  }

}