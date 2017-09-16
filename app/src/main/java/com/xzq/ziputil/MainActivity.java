package com.xzq.ziputil;

import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.io.File;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        try {
//            ZipUtils.getInstance().zip(getFilesDir().getAbsoluteFile()+ File.separator+"12",getFilesDir().getAbsolutePath(),"12.zip");
//            ZipUtils.unZipFiles(getFilesDir().getAbsoluteFile()+ File.separator+"12.zip",getFilesDir().getAbsolutePath());
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

    }
}
