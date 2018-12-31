package me.francis.lifecycle.lifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import me.francis.lifecycle.R;

public class LifecycleActivity extends AppCompatActivity {

    private LifecycleExecute lifecycleExecute;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lifecycle);
        lifecycleExecute = new LifecycleExecute(this, this);
        lifecycleExecute.setExecuteListener(new LifecycleExecute.OnExecuteListener() {
            @Override
            public void executeSuccess() {
                lifecycleExecute.showDialog();
            }

            @Override
            public void executeFailed() {
                Toast.makeText(LifecycleActivity.this, "failed", Toast.LENGTH_LONG).show();
            }
        });
        Button btn = findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lifecycleExecute.doSomething();
            }
        });

    }
}
