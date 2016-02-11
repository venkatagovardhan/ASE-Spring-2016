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
        Button b= (Button) findViewById(R.id.btn_pic);
        Button capture = (Button) findViewById(R.id.btn_camera);
        userImage = (ImageView) findViewById(R.id.imageView2);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, popup.class));
            }
        });


    }










    public void signup(View v)
    {
        EditText firstnameCtrl = (EditText)findViewById(R.id.txt_fname);
        EditText lastnameCtrl = (EditText) findViewById(R.id.txt_lname);
        EditText usernameCtrl = (EditText)findViewById(R.id.txt_uname);
        EditText passwordCtrl = (EditText) findViewById(R.id.txt_pword);
        EditText addressCtrl = (EditText)findViewById(R.id.editText5);

        TextView errorText = (TextView)findViewById(R.id.error);
        String userName = usernameCtrl.getText().toString();
        String password = passwordCtrl.getText().toString();
        String firstName = firstnameCtrl.getText().toString();
        String lastName = lastnameCtrl.getText().toString();
        String address = addressCtrl.getText().toString();

        boolean validationFlag = false;
        //Verify if the username and password are not empty.
        if(!userName.isEmpty() && !password.isEmpty() && !firstName.isEmpty() && !lastName.isEmpty() && !address.isEmpty()) {

                validationFlag = true;


        }
        if(!validationFlag)
        {
            errorText.setVisibility(View.VISIBLE);
        }
        else
        {
            //This code redirects the from login page to the home page.
            Intent redirect = new Intent(MainActivity.this, MapsActivity.class);
            startActivity(redirect);

        }

    }



}

