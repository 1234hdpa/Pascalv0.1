package com.example.phu.pascalv01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class bai1_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai1_1);
        assert getSupportActionBar() != null;
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle(R.string.tenbai1_1);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                this.finish();
                return true;
            case R.id.home:
                Intent quayve = new Intent(bai1_1.this, Manhinhchinh.class);
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

    @Override
    protected void onStart() {

        super.onStart();
    }
}
