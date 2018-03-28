package com.acadgild.soniyasinghal.menu;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    private Context mContext;
    private Activity mActivity;

    private RelativeLayout mRelativeLayout;
    private TextView mTextView;
    private android.support.v7.widget.Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Get the application context
        mContext = getApplicationContext();
        // Get the activity
        mActivity = MainActivity.this;

        // Get the widgets reference from XML layout
        mRelativeLayout = (RelativeLayout) findViewById(R.id.r1);
        mTextView = (TextView) findViewById(R.id.tv);
        mToolbar =  findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);


        // Set a title for toolbar
        //mToolbar.setTitle("Android Options Menu Example");
        //mToolbar.setTitleTextColor(Color.WHITE);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.toolbar_options_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.red:
                // Set the text color to red
                mTextView.setTextColor(Color.RED);
                return true;
            case R.id.green:
                // Set the text color to green
                mTextView.setTextColor(Color.GREEN);
                return true;
            case R.id.blue:
                // Set the text color to blue
                mTextView.setTextColor(Color.BLUE);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}