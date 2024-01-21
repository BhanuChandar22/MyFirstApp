class BubbleSort
{
 public static void swap(int x,int y)
 {
   int temp = y;
   y = x;
   x = temp;
 } 
 public static void bubbleSort(int arr[])
{
   int i,j,flag = 0;
  for(i=0;i<arr.length-1;i++)
  {
   for(j=0;j<arr.length-i-1;j++)
   {
    if(arr[j] > arr[j+1])
     {
       swap(arr[j+1],arr[j]);
     } 
   }
  }
}
public static void main(String[] a)
 {
  System.out.println("Bubble Sort : ");
  int arr[] = {8,5,7,3,2}; 
  bubbleSort(arr);  
  for(int e : arr)
   System.out.print(e+" ");
  /*  if(arr[j]>arr[j+1])
     {
      int temp = arr[j];
      arr[j] = arr[j+1];
      arr[j+1] = temp;
     }  */
  
 }
}