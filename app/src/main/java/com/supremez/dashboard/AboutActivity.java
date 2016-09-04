package com.supremez.dashboard;

import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;


public class AboutActivity extends ActionBarActivity {

    public Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        if (toolbar != null) {
            setSupportActionBar(toolbar);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

            YoYo.with(Techniques.FadeIn)
                    .interpolate(new AccelerateDecelerateInterpolator())
                    .duration(1700)
                    .playOn(findViewById(R.id.card_view1));
            YoYo.with(Techniques.FadeIn)
                    .interpolate(new AccelerateDecelerateInterpolator())
                    .duration(1700)
                    .playOn(findViewById(R.id.card_view2));

        }

        ImageView plustechnologx = (ImageView) findViewById(R.id.gplus_technologx);
        plustechnologx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://google.com/+KevinTechnologx"));
                startActivity(viewIntent);
            }
        });


        ImageView websitetechnologx = (ImageView) findViewById(R.id.website_technologx);
        websitetechnologx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://technologx.com"));
                startActivity(viewIntent);
            }
        });


        ImageView mailtechnologx = (ImageView) findViewById(R.id.mail_technologx);
        mailtechnologx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                        "mailto", "support@technologx.com", null));
                emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Demo App Feedback");
                startActivity(Intent.createChooser(emailIntent, "Choose email app"));
            }
        });


        ImageView twittertechnologx = (ImageView) findViewById(R.id.twitter_technologx);
        twittertechnologx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://twitter.com/Technologx4Real"));
                startActivity(viewIntent);
            }
        });

        ImageView plusyournamehere = (ImageView) findViewById(R.id.gplus_yournamehere);
        plusyournamehere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://plus.google.com/102959424434453504463"));
                startActivity(viewIntent);
            }
        });


        ImageView websiteyournamehere = (ImageView) findViewById(R.id.website_yournamehere);
        websiteyournamehere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://technologx.com"));
                startActivity(viewIntent);
            }
        });


        ImageView mailyournamehere = (ImageView) findViewById(R.id.mail_yournamehere);
        mailyournamehere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                        "mailto", "bellemorte@technologx.com", null));
                emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Support Needed");
                startActivity(Intent.createChooser(emailIntent, "Choose email app"));
            }
        });


        ImageView twitteryournamehere = (ImageView) findViewById(R.id.twitter_yournamehere);
        twitteryournamehere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://twitter.com/BelleM0rte"));
                startActivity(viewIntent);
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        switch (item.getItemId()) {
            case R.id.changelog:

                final Dialog popup = new Dialog(this);

                popup.requestWindowFeature(Window.FEATURE_NO_TITLE);

                popup.setContentView(R.layout.dialog);

                TextView text1 = (TextView) popup.findViewById(R.id.text1);
                text1.setText(getString(R.string.changelog_title));

                TextView text2 = (TextView) popup.findViewById(R.id.text2);
                text2.setText(getString(R.string.changelog));

                popup.show();

                Button closebutton = (Button) popup.findViewById(R.id.button2);
                closebutton.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        // Close dialog
                        popup.dismiss();
                    }
                });
                return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
