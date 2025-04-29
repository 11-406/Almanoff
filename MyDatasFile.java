import java.io.*;
import java.util.Random;
import java.util.ArrayList;

public class MyDatasFile {
    private ArrayList<ArrayList<Integer>> mainList = new ArrayList<>(75);
    public File datasFile = new File("datasFile");

    public MyDatasFile(){
        try{
            datasFile.createNewFile();
        }catch(Exception e){e.printStackTrace();}
    }

    Random random = new Random();

    public ArrayList<ArrayList<Integer>> getMainList(){
        return this.mainList;
    }
    public void fillMainFile(){
        for (int i = 0; i < 75; i++) {
            mainList.add(new ArrayList<>());
        }
        for (int i = 0; i < mainList.size(); i++) {
            int n = random.nextInt(100, 10001);
            ArrayList<Integer> newList = new ArrayList<>(n);
            for (int j = 0; j < n; j++) {
                newList.add(random.nextInt(1));
            }
            mainList.set(i, newList);
        }

        try (DataOutputStream outputInMain = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(datasFile)))) {
            for (ArrayList<Integer> list : mainList) {
                for (int num : list) {
                    outputInMain.writeInt((num));
                }
            }
        } catch (Exception e) { e.printStackTrace(); }
    }
}
