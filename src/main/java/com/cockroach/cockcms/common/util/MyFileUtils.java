package com.cockroach.cockcms.common.util;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Tom
 */
public class MyFileUtils {

    public static List<File> getFiles(File folder) {
        List<File> files = new ArrayList<File>();
        iterateFolder(folder, files);
        return files;
    }

    private static void iterateFolder(File folder, List<File> files) {
        File fList[] = folder.listFiles();
        files.add(folder);
        if (fList == null || fList.length == 0) {
            files.add(folder);
        } else {
            for (File f : fList) {
                if (f.isDirectory()) {
                    iterateFolder(f, files);
                } else {
                    files.add(f);
                }
            }
        }
    }
}
