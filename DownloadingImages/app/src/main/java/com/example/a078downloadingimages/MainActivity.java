package com.example.a078downloadingimages;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.ExecutionException;

import static android.provider.ContactsContract.CommonDataKinds.Website.URL;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;

    public void clickButton(View view)
    {
        ImageDownloader task = new ImageDownloader();
        Bitmap myImage;
        try {
            myImage = task.execute("https://upload.wikimedia.org/wikipedia/en/a/aa/Bart_Simpson_200px.png").get();
            imageView.setImageBitmap(myImage);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        Log.i("Info","Button Tapped");
    }
    class ImageDownloader extends AsyncTask<String,Void, Bitmap>
    {
        URL url;
        @Override
        protected Bitmap doInBackground(String... strings) {
            try {
                url=new URL(strings[0]);
                HttpURLConnection connection= (HttpURLConnection) url.openConnection();
                connection.connect();
                InputStream inputStream=connection.getInputStream();
                Bitmap bitmap= BitmapFactory.decodeStream(inputStream);
                return bitmap;
            }
            catch (MalformedURLException e)
            {
                e.printStackTrace();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }

          return null;
        }

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         imageView=findViewById(R.id.imageView);
    }
}