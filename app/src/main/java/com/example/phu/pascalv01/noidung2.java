package com.example.phu.pascalv01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

import org.w3c.dom.Text;

public class noidung2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_noidung1);
        assert getSupportActionBar() != null;
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Cấu trúc lặp");
    }

    @Override
    protected void onStart() {
        TextView tieude = (TextView) findViewById(R.id.tieude1);
        assert tieude != null;
        tieude.setText(R.string.cautruclap);

        TextView gioithieu = (TextView) findViewById(R.id.gioithieu1);
        assert gioithieu != null;
        gioithieu.setText(R.string.gioithieu2);

        TextView cuphap1 = (TextView) findViewById(R.id.cuphap1);
        assert cuphap1 != null;
        cuphap1.setText(R.string.caulenhfor);

        TextView noidungcp1 = (TextView) findViewById(R.id.noidungcp1);
        assert noidungcp1 != null;
        noidungcp1.setText(R.string.cuphap2_1);

        TextView cuphap2 = (TextView) findViewById(R.id.cuphap2);
        assert cuphap2 != null;
        cuphap2.setText(R.string.caulenhfordown);

        TextView noidungcp2 = (TextView) findViewById(R.id.noidungcp2);
        assert noidungcp2 != null;
        noidungcp2.setText(R.string.cuphap2_2);
        super.onStart();
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                this.finish();
                return true;
            case R.id.home:
                Intent quayve = new Intent(noidung2.this, Manhinhchinh.class);
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
