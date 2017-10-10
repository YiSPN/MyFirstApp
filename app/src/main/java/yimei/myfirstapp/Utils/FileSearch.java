package yimei.myfirstapp.Utils;

import java.io.File;
import java.util.ArrayList;

/**
 * Created by yimei on 10/3/2017.
 */

public class FileSearch {

    /**
     * Search a directory and return a list of all *directories* contained inside
     * @param directory
     * @return
     */
    public static ArrayList<String> getDirectoryPaths(String directory){
        ArrayList<String> pathArray = new ArrayList<>();
        File file = new File(directory);
        File[] listFiles = file.listFiles();
        for(int i = 0; i < listFiles.length; i++){
            if(listFiles[i].isDirectory()){
                pathArray.add(listFiles[i].getAbsolutePath());
            }
        }
        return pathArray;
    }

    /**
     * Search a directory and return a list of all *files* contained inside
     * @param directory
     * @return
     */
    public static ArrayList<String> getFilePaths(String directory){
        ArrayList<String> pathArray = new ArrayList<>();
        File file = new File(directory);
        File[] listFiles = file.listFiles();
        try {
            for(int i = 0; i < listFiles.length; i++){
                if(listFiles[i].isFile()){
                    pathArray.add(listFiles[i].getAbsolutePath());
                }
            }
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        return pathArray;
    }
}
