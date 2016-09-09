package com.example.hp.androidnetworkingdemo;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

/**
 * Created by HP on 9/9/2016.
 */
public class IOUtils {
    public static void closeQuitely(InputStream in ) throws IOException {
        try {
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void closeQuitely(Reader reader) throws IOException {
        try {
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
