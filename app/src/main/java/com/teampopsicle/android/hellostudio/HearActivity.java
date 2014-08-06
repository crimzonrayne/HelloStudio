package com.teampopsicle.android.hellostudio;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

/**
 *
 * Created by Crimzon on 8/5/2014.
 */

public class HearActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hear);

        final ImageButton catButton = (ImageButton)this.findViewById(R.id.catButton);
        final MediaPlayer catPlayer = MediaPlayer.create(this, R.raw.meow);
        catButton.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                catPlayer.start();
            }
        });

        final ImageButton dogButton = (ImageButton)this.findViewById(R.id.dogButton);
        final MediaPlayer dogPlayer = MediaPlayer.create(this, R.raw.woof);
        dogButton.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                dogPlayer.start();
            }
        });

        final ImageButton cowButton = (ImageButton)this.findViewById(R.id.cowButton);
        final MediaPlayer cowPlayer = MediaPlayer.create(this, R.raw.moo);
        cowButton.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                cowPlayer.start();
            }
        });

        final ImageButton buttButton = (ImageButton)this.findViewById(R.id.buttButton);
        final MediaPlayer buttPlayer = MediaPlayer.create(this, R.raw.fart);
        buttButton.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                buttPlayer.start();
            }
        });
    }

}
