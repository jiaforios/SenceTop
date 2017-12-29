package sence.com.sencetop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    private  static  final String TAG = "LoginActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_login);

        Button login = (Button)findViewById(R.id.login);
        Button register = (Button)findViewById(R.id.register);
        Button forget = (Button)findViewById(R.id.forget);

        login.setOnClickListener(this);
        register.setOnClickListener(this);
        forget.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){

            case R.id.login:{
                this.loginAction();
            }
            break;
            case R.id.register:{
                this.registerAction();
            }
            break;
            case R.id.forget:{
                this.forgetAction();
            }
            break;
        }

    }


    private void registerAction(){

        Log.d(TAG,"注册");
    }

    private  void forgetAction(){
        Log.d(TAG,"忘记密码");

    }
    private  void loginAction(){

        Log.d(TAG,"登录");
    }

}
