package org.acme.utils;

import java.io.File;
import java.io.IOException;

public class FileUtils {
    public static String saveFile(byte[] content,  String fileName) {
        try {
            String path = "C:\\tmp\\images\\" + fileName;
            org.apache.commons.io.FileUtils.writeByteArrayToFile(new File(""), content);

            return path;
        } catch (IOException e0) {
            e0.printStackTrace();
            return null;
        }

    }


    public static byte[] loadFile(String path){
        try {
            org.apache.commons.io.FileUtils.readFileToByteArray(new File(path));

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
