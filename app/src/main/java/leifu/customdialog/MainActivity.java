package leifu.customdialog;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import leifu.dialoglibrary.CustomDialogSure;
import leifu.dialoglibrary.CustomDialogSureCancel;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         findViewById(R.id.tv_sure).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final CustomDialogSure customDialogSure = new CustomDialogSure(MainActivity.this);
                customDialogSure.show();
                customDialogSure.getSureView().setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        customDialogSure.cancel();
                    }
                });
            }
        });
        findViewById(R.id.tv_sureCancel).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final CustomDialogSureCancel customDialogSureCancel = new CustomDialogSureCancel(MainActivity.this);
                customDialogSureCancel.show();
                customDialogSureCancel.getCancelView().setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        customDialogSureCancel.cancel();
                    }
                });
            }
        });
    }
}
