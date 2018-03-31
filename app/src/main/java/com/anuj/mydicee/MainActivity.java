package com.anuj.mydicee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button hitme = (Button)findViewById(R.id.hit);

        final ImageView left_1 = (ImageView) findViewById(R.id.left_top);

        final ImageView left_2 = (ImageView) findViewById(R.id.left_mid);

        final ImageView left_3 = (ImageView) findViewById(R.id.left_bottom);

        final ImageView right_1 = (ImageView) findViewById(R.id.right_top);

        final ImageView right_2 = (ImageView) findViewById(R.id.right_mid);

        final ImageView right_3 = (ImageView) findViewById(R.id.right_bottom);

        final int dice[] = { R.drawable.die_face_1 , R.drawable.die_face_2 , R.drawable.die_face_3 , R.drawable.die_face_4 , R.drawable.die_face_5 , R.drawable.die_face_6 };


        hitme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random_num = new Random();

              int  num = random_num.nextInt(6);
              left_1.setImageResource(dice[num]);

              num = random_num.nextInt(6);
              right_1.setImageResource(dice[num]);

              num = random_num.nextInt(6);
              left_2.setImageResource(dice[num]);

              num = random_num.nextInt(6);
              right_2.setImageResource(dice[num]);

              num = random_num.nextInt(6);
              left_3.setImageResource(dice[num]);

              num = random_num.nextInt(6);
              right_3.setImageResource(dice[num]);
            }
        });
    }
}
