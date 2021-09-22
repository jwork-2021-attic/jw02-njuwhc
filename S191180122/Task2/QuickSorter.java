package S191180122.Task2;

public class QuickSorter implements Sorter{
    private int[] a;
    private int low, high;
    
    

    public void load(int[] a) {
        this.a = a;
        this.low=0;
        this.high=a.length-1;
    }

    public void quickSortSort() {

    }

    private void swap(int i, int j) {
        int temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
        plan += "" + a[i] + "<->" + a[j] + "\n";
    }

    private String plan = "";

    private int partition(int low,int high){
        int x=a[low];
        int i=low;
        int j=high;
        while(i<j){
            while(i<j && a[j]>=x)
                j--;
            while(i<j && a[i]<=x)
                i++;

            if(i!=j)
                swap(i,j);
        }
        swap(i,low);
        return i;


    }
    private void quicksort(int low,int high){
        if(low<high){
            int i=partition(low,high);
            quicksort(low,i-1);
            quicksort(i+1,high);
        }
    }

    @Override
    public void sort() {
        quicksort(this.low,this.high);
    }

    @Override
    public String getPlan() {
        return this.plan;
    }
    
}