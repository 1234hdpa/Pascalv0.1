package com.example.phu.pascalv01;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class tracnghiem1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tracnghiem1);
        assert getSupportActionBar() != null;
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Trắc nghiệm 1");
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case android.R.id.home:
                this.finish();
                return true;
            case R.id.home:
                Intent quayve = new Intent(tracnghiem1.this, Manhinhchinh.class);
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

    public void dung (View v){
        TextView dung = (TextView) v;
        dung.setBackgroundColor(Color.parseColor("#9EFF3A"));
    }
    public void sai (View v){
        TextView sai = (TextView) v;
        sai.setBackgroundColor(Color.parseColor("#FF4143"));
    }
}
