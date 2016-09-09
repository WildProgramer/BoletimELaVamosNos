package boletimescolar.info.boletimelavamosnos.view.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import boletimescolar.info.boletimelavamosnos.R;
import boletimescolar.info.boletimelavamosnos.model.activitymodel.LoginModel;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends AppCompatActivity {


    //Instanciar com dependeny

    @BindView(R.id.ra_edit_login)
    EditText ra_edit;


    private LoginModel loginModel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);



        //Instanciar classes
        instanceCrap();
        //Checkar se alguem esta logado
        loginModel.checkAlunoLogged(LoginActivity.this);

    }

    //Onclick para entrar
    @OnClick(R.id.submit_btn_login)
    public void submitUser(View v){


        if(loginModel.checkFields(ra_edit) == true) {

            loginModel.loginAut(ra_edit.getText().toString(), LoginActivity.this);
        }else{

            Toast.makeText(LoginActivity.this, R.string.fields, Toast.LENGTH_SHORT).show();


        }


//        Intent intent = new Intent(LoginActivity.this, MainActivity.class);
//        startActivity(intent);
//        finish();



    }

    //Instanciar as classes
    public void instanceCrap(){

        //Instanciar Dependency Injection
        ButterKnife.bind(this);
        loginModel = new LoginModel(this);


    }
}
