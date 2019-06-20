package cn.edu.gdpt.topline172038cjw;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ZcActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText mName;
    private EditText mPassword;
    private Button mZcButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zc);
        initView();
    }

    private void initView() {
        mName = (EditText) findViewById(R.id.name);
        mPassword = (EditText) findViewById(R.id.password);
        mZcButton = (Button) findViewById(R.id.zc_button);
        mZcButton.setOnClickListener(this);


    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.zc_button:
                String nameString = mName.getText().toString().trim();
                String passwordString = mPassword.getText().toString().trim();
                SharedPreferences .Editor editor=getSharedPreferences("data",MODE_PRIVATE).edit();
                editor.putString("name",nameString);
                editor.putString("passwd",passwordString);
                editor.commit();
                Toast.makeText(this,"注册成功",Toast.LENGTH_LONG).show();
                finish();
                break;
        }
    }

    private void submit() {
        // validate
        String nameString = mName.getText().toString().trim();
        if (TextUtils.isEmpty(nameString)) {
            Toast.makeText(this, "账号", Toast.LENGTH_SHORT).show();
            return;
        }

        String passwordString = mPassword.getText().toString().trim();
        if (TextUtils.isEmpty(passwordString)) {
            Toast.makeText(this, "密码", Toast.LENGTH_SHORT).show();
            return;
        }

        // TODO validate success, do something


    }
}
