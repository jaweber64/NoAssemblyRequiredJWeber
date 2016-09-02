package webersolutions.noassemblyrequired;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton dbutton = (ImageButton)findViewById(R.id.deskButton);
        ImageButton pbutton = (ImageButton)findViewById(R.id.pergolaButton);
        ImageButton bbutton = (ImageButton)findViewById(R.id.bicycleButton);

        dbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,desktools.class));
            }
        });

        pbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,pergolatools.class));
            }
        });

        bbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,bicycletools.class));
            }
        });
    }
}
