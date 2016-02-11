package com.appdevelopment.venkatagovardhan.takeapic;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Venkata Govardhan on 2/8/2016.
 */
public class MainActivity extends AppCompatActivity{

    int TAKE_PHOTO_CODE = 0;
    ImageView userImage ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.contents_main);



        Button capture = (Button) findViewById(R.id.btn_pic);
        userImage = (ImageView) findViewById(R.id.imageView2);

        capture.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent cameraIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(cameraIntent, TAKE_PHOTO_CODE);
            }
        });
    }
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == TAKE_PHOTO_CODE && resultCode == RESULT_OK) {
            Bitmap photo = (Bitmap) data.getExtras().get("data");
            userImage.setImageBitmap(photo);
            Log.d("CameraDemo", "Pic saved");
        }
    }







    public void signup(View v)
    {

            //This code redirects the from login page to the home page.
            Intent redirect = new Intent(MainActivity.this, MapsActivity.class);
            startActivity(redirect);



    }



}

