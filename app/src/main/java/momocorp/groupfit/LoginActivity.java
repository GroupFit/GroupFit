package momocorp.groupfit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {
    String name, email, password, location;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        EditText nameEditText = (EditText) findViewById(R.id.name_id);
        nameEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                //before changes edit text
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
//get information while he's changing it
            }

            @Override
            public void afterTextChanged(Editable s) {
                name = s.toString();

            }
        });

        EditText emailEditText = (EditText) findViewById(R.id.email_id);
        emailEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                //before changes edit text
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
//get information while he's changing it
            }

            @Override
            public void afterTextChanged(Editable s) {
                email = s.toString();

            }
        });

         EditText passwordEditText = (EditText) findViewById(R.id.password_id);
        passwordEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                //before changes edit text
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
//get information while he's changing it
            }

            @Override
            public void afterTextChanged(Editable s) {
                password = s.toString();

            }
        });

        EditText locationEditText = (EditText) findViewById(R.id.location_id);
        locationEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                //before changes edit text
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
//get information while he's changing it
            }

            @Override
            public void afterTextChanged(Editable s) {
                location = s.toString();

            }
        });

    }
}
