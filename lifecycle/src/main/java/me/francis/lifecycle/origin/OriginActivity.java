package me.francis.lifecycle.origin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import me.francis.lifecycle.R;

public class OriginActivity extends AppCompatActivity {

    private OriginExecute originExecute;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_origin);
        originExecute = new OriginExecute(this);
        originExecute.setExecuteListener(new OriginExecute.OnExecuteListener() {
            @Override
            public void executeSuccess() {
                originExecute.showDialog();
            }

            @Override
            public void executeFailed() {
                Toast.makeText(OriginActivity.this, "failed", Toast.LENGTH_LONG).show();
            }
        });
        Button btn = findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                originExecute.doSomething();
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (originExecute != null){
            originExecute.destory();
        }
    }
}
