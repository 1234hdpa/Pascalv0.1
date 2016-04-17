package com.example.phu.pascalv01;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Manhinhchinh extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manhinhchinh);
        assert getSupportActionBar() != null;
        getSupportActionBar().setTitle("Pascal V0.1");
        getSupportActionBar().setLogo(R.mipmap.ic_launcher);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#2C2F2B")));
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
        Button nutnd1 = (Button) findViewById(R.id.nd1);
        assert nutnd1 != null;
        nutnd1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent monoidung = new Intent(Manhinhchinh.this, noidung1.class);
                startActivity(monoidung);
            }
        });

        Button nutbt1 = (Button) findViewById(R.id.bt1);
        assert nutbt1 != null;
        nutbt1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent mobaitap = new Intent(Manhinhchinh.this, menubaitap1.class);
                startActivity(mobaitap);
            }
        });

        Button nutnd2 = (Button) findViewById(R.id.nd2);
        assert nutnd2 != null;
        nutnd2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent monoidung = new Intent(Manhinhchinh.this, noidung2.class);
                startActivity(monoidung);
            }
        });
    }

    public void doExit() {

        AlertDialog.Builder alertDialog = new AlertDialog.Builder(Manhinhchinh.this);

        alertDialog.setPositiveButton("Có", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });

        alertDialog.setNegativeButton("Không", null);

        alertDialog.setMessage("Bạn muốn thoát ứng dụng?");
        alertDialog.setTitle("Pascal v0.1");
        alertDialog.show();
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {

        if(keyCode == KeyEvent.KEYCODE_BACK) {
            doExit();
        }

        return super.onKeyDown(keyCode, event);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                this.finish();
                return true;
            case R.id.home:
                return true;
            case R.id.exit:
                moveTaskToBack(true);
                thoatungdung();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public static void thoatungdung(){
        android.os.Process.killProcess(android.os.Process.myPid());
        System.exit(1);
    }

}
