package com.nate.n8sudactiyappportfolio;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

/**
 * Displays a Linear Layout of buttons.  Each button is clickable and will launch it's respective app.
 *
 * @author Nathan Merris
 */
public class MainActivity extends AppCompatActivity {

    public static final String N8LOG = "N8-LOG"; // the tag used for my log output, for development
    private CharSequence text; // use the same CharSequence ref for everything


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // set up the toolbar..
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // not using a fab, but kept it anyway in case I need it, set xml visibility: "gone" in activity_main..
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
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
            text = "This could launch Settings";
            displayToast(text);
            return true;
        }
        else if (id == R.id.onomatopoeia) {
            text = "Grrrrr, sizzle, boom!";
            displayToast(text);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * Displays a short Toast message
     *
     * @param cs The message to display
     */
    private void displayToast (CharSequence cs) {
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(this, cs, duration);
        toast.show();
    }


    /**
     * Displays a toast message when a button is tapped.
     * Called automatically by OS when a button is tapped, OS knows which
     * method to call from the onClick attribute in each Button tag in content_main.xml
     *
     * @param view Automatically passed by OS when a button is tapped
     */
    public void buttonClicked(View view){



        switch(view.getId()) {
            case R.id.button_spotify:
                text = "will launch Spotify Streamer app";
                displayToast(text);
                return;

            case R.id.button_scores:
                text = "will launch Scores app";
                displayToast(text);
                return;

            case R.id.button_library:
                text = "will launch Library app";
                displayToast(text);
                return;

            case R.id.button_buildit:
                text = "will launch Build it Bigger app";
                displayToast(text);
                return;

            case R.id.button_xyz:
                text = "will launch XYZ Reader app";
                displayToast(text);
                return;

            case R.id.button_myapp:
                text = "will launch my very own super app";
                displayToast(text);
                return;

            default:
                Log.w(N8LOG, "in MainActivity.buttonClicked(), reached default switch case");
                return;

        } // end switch
    } // end buttonClicked()
} // end class
