package com.appdevelopment.venkatagovardhan.takeapic;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Created by Venkata Govardhan on 2/10/2016.
 */
public class popup extends Activity {
    int TAKE_PHOTO_CODE = 0;
    ImageView userImage ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.popupwindow);
        DisplayMetrics dm= new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);
        int width=dm.widthPixels;
        int height=dm.heightPixels;
        getWindow().setLayout((int)(width*.9),(int)(height*.6));
        Button capture = (Button) findViewById(R.id.btn_camera);
        userImage = (ImageView) findViewById(R.id.imageView2);
        //Button click eventlistener. Initializes the camera.
        capture.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent cameraIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(cameraIntent, TAKE_PHOTO_CODE);
            }
        });

    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == TAKE_PHOTO_CODE && resultCode == RESULT_OK) {
            Bitmap photo = (Bitmap) data.getExtras().get("data");
            userImage.setImageBitmap(photo);
            Log.d("CameraDemo", "Pic saved");
        }
    }

}
