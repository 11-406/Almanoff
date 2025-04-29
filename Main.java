
public class Main {
    public static void main(String[] args) {
        MyDatasFile mainFile = new MyDatasFile();
        mainFile.fillMainFile();

        for(int i = 0; i < mainFile.getMainList().size(); i ++){
            long start = System.nanoTime();
            MyBucketSort.bucketSort(mainFile.getMainList().get(i));
            long end = System.nanoTime();
            System.out.println((end - start) + " " + MyBucketSort.getIteration() + " " + mainFile.getMainList().get(i).size());
            MyBucketSort.setZeroIteration();
        }
    }
}
