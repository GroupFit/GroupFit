package momocorp.groupfit;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;

import momocorp.groupfit.Classes.User;

public class BodyBuildingActivity extends AppCompatActivity {
    User userInformation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_body_building);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        userInformation = getIntent().getParcelableExtra("UserInfo");
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();


            }
        });

        EditText heightEditText = (EditText) findViewById(R.id.height_id);
        heightEditText.addTextChangedListener(new TextWatcher() {
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
                userInformation.height = Float.parseFloat(s.toString());
            }


        });

        EditText weightEditText = (EditText) findViewById(R.id.weight_id);
        weightEditText.addTextChangedListener(new TextWatcher() {
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
                userInformation.weight = Float.parseFloat(s.toString());
            }


        });

        EditText ageEditText = (EditText) findViewById(R.id.age_id);
        ageEditText.addTextChangedListener(new TextWatcher() {
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
                userInformation.age = Integer.parseInt(s.toString());
            }


        });


    }
}
