package momocorp.groupfit;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {
    public static class UserInformation implements Parcelable {
        public String name;
        public String email;
        public String password;
        public String location;
        public float height;
        public float weight;
        public int age;
        public String bodyType;

        public UserInformation() {
        }


        protected UserInformation(Parcel in) {
            name = in.readString();
            email = in.readString();
            password = in.readString();
            location = in.readString();
            height = in.readFloat();
            weight = in.readFloat();
            age = in.readInt();
        }

        public static final Creator<UserInformation> CREATOR = new Creator<UserInformation>() {
            @Override
            public UserInformation createFromParcel(Parcel in) {
                return new UserInformation(in);
            }

            @Override
            public UserInformation[] newArray(int size) {
                return new UserInformation[size];
            }
        };

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeString(name);
            dest.writeString(email);
            dest.writeString(password);
            dest.writeString(location);
        }
    }

    String name, email, password, location;
    UserInformation userInformation = new UserInformation();


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

        EditText passwordEditText = (EditText) findViewById(R.id.password);
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
    }

//        EditText locationEditText = (EditText) findViewById(R.id.location);
//        locationEditText.addTextChangedListener(new TextWatcher() {
//            @Override
//            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
//                //before changes edit text
//            }
//
//            @Override
//            public void onTextChanged(CharSequence s, int start, int before, int count) {
////get information while he's changing it
//            }
//
//            @Override
//            public void afterTextChanged(Editable s) {
//                location = s.toString();
//
//            }
//        });
//        userInformation.email = email;
//        userInformation.password = password;
//        userInformation.location = location;
//        userInformation.name = name;
//
//    }

    public void bodyInfo(View view) {
        Intent intent = new Intent(this, BodyBuildingActivity.class);
        intent.putExtra("UserInfo", userInformation);
        startActivity(intent);

    }
}
