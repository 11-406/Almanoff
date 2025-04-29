import java.util.ArrayList;
import java.util.Collections;
public class MyBucketSort {
    public static int iteration = 0;

    public static int getIteration() {
        return iteration;
    }

    public static void setZeroIteration(){
        iteration = 0;
    }

    public static void bucketSort(ArrayList<Integer> arr) {
        if (arr.size() == 0) return;

        int min = arr.get(0);
        int max = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) < min) min = arr.get(i);
            if (arr.get(i) > max) max = arr.get(i);
            iteration++;
        }


        int bucketCount = max - min + 1;
        ArrayList<Integer>[] buckets = new ArrayList[bucketCount];
        for (int i = 0; i < bucketCount; i++) {
            buckets[i] = new ArrayList<>();
        }

        for (int num : arr) {
            buckets[num - min].add(num);
            iteration++;
        }

        for (ArrayList<Integer> bucket : buckets) {
            Collections.sort(bucket);
            iteration += bucket.size()* Math.log(bucket.size());
        }

        int index = 0;
        for (ArrayList<Integer> bucket : buckets) {
            for (int num : bucket) {
                arr.set(index++, num);
                iteration++;
            }
        }
    }
}
