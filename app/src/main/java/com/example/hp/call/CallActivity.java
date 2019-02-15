package com.example.hp.call;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class CallActivity extends AppCompatActivity {
    private Button mCallButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.call_main);

        mCallButton = (Button) findViewById(R.id.police);
        mCallButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent("Intent.ACTION_DIAL");
                intent.setAction(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:110"));

                startActivity(intent);
            }
        });
    }
}
