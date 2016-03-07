package com.example.submoduleslave;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.submodulelibrary.SubModuleConst;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("*** Sub Module Test ***", SubModuleConst.SAMPLE_TEXT);
    }
}
