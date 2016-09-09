package com.example.hp.androidnetworkingdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView imageView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
    private void init(){
        imageView= (ImageView) findViewById(R.id.img_dơnload);
        button= (Button) findViewById(R.id.btn_downloadImage);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DownloadImageTask downloadImageTask= new DownloadImageTask(imageView);
                downloadImageTask.execute("http://media.phunutoday.vn/files/upload_images/2016/06/02/Ngoc-trinh-la-ai_phunutoday_vn%201.jpg");
            }
        });
    }
}
