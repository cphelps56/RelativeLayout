package edu.louisville.relativelayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void onClick(View v) {
        Button b = (Button)v;
        Toast toast = Toast.makeText(this, b.getText() + " was clicked", Toast.LENGTH_SHORT);
        toast.show();
    }
}
