package com.example.phu.pascalv01;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class menubaitap1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menubaitap1);
        assert getSupportActionBar() != null;
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle(R.string.cautrucrenhanh);
    }

    @Override
    protected void onStart() {
        super.onStart();
        TextView cauhoi1 = (TextView) findViewById(R.id.tracnghiem1);
        assert cauhoi1 != null;
        cauhoi1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mocauhoi = new Intent(menubaitap1.this, tracnghiem1.class);
                startActivity(mocauhoi);
            }
        });
        final LinearLayout bai1 = (LinearLayout) findViewById(R.id.bai1_1);
        assert bai1 != null;
        bai1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mobaitap = new Intent(menubaitap1.this, bai1_1.class);
                startActivity(mobaitap);
            }
        });
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                this.finish();
                return true;
            case R.id.home:
                Intent quayve = new Intent(menubaitap1.this, Manhinhchinh.class);
                startActivity(quayve);
                this.finish();
                return true;
            case R.id.exit:
                moveTaskToBack(true);
                Manhinhchinh.thoatungdung();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuchinh = getMenuInflater();
        menuchinh.inflate(R.menu.menuchinh, menu);
        return true;
    }
}
