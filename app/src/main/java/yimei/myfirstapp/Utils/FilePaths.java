package yimei.myfirstapp.Utils;

import android.os.Environment;

/**
 * Created by yimei on 10/3/2017.
 */

public class FilePaths {

    // "storage/emulated/0"
    public String ROOT_DIR = Environment.getExternalStorageDirectory().getPath();

    public String PICTURES = ROOT_DIR + "/Pictures";
    public String CAMERA = ROOT_DIR + "/DCIM/CAMERA";

    public String FIREBASE_IMAGE_STORAGE = "photos/users/";
}
