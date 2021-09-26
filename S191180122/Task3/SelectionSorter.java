package S191180122.Task3;

public class SelectionSorter implements Sorter {
    private int[] a;

    public void load(int[] a) {
        this.a = a;
    }

    public void selectionSort() {

    }

    private void swap(int i, int j) {
        int temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
        plan += "" + a[i] + "<->" + a[j] + "\n";
    }

    private String plan = "";

    @Override
    public void sort() {
        int minIndex;
        for(int i =0;i<a.length-1;i++) {
            minIndex = i;
            for(int j=i+1;j<a.length;j++) {
                if(a[j]<a[minIndex]){
                    minIndex = j;
                }

            }
            swap(i,minIndex);
        }
        
    }

    @Override
    public String getPlan() {
        return this.plan;
    }
}