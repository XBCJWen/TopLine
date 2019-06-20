package cn.edu.gdpt.topline172038cjw;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText mName;
    private EditText mPassword;
    private Button mLoginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initView();
    }

    private void initView() {
        mName = (EditText) findViewById(R.id.name);
        mPassword = (EditText) findViewById(R.id.password);
        mLoginButton = (Button) findViewById(R.id.login_button);

        mLoginButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.login_button:
                String nameString = mName.getText().toString().trim();
                String passwordString = mPassword.getText().toString().trim();


                SharedPreferences pre=getSharedPreferences("data",MODE_PRIVATE);
                String name=pre.getString("name","");
                String passwd=pre.getString("passwd","");


                if (nameString.equals(name) && passwordString.equals(passwd)) {
                    Toast.makeText(this, "登录成功", Toast.LENGTH_SHORT).show();
                    finish();
                }else{
                    Toast.makeText(this, "密码错误，登录失败", Toast.LENGTH_SHORT).show();

                }


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
