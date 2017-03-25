package momocorp.groupfit;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BaseTransientBottomBar;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import momocorp.groupfit.Classes.User;
import momocorp.groupfit.Fragments.BodyBuildingFragment;
import momocorp.groupfit.Fragments.InterestFragment;
import momocorp.groupfit.Fragments.Login_Basic;

public class SignUpActivity extends AppCompatActivity implements SignUpInterface {
    User user = new User();
    DatabaseReference ref = FirebaseDatabase.getInstance().getReference();
    FirebaseUser firebaseUser;
    FirebaseAuth auth = FirebaseAuth.getInstance();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FirebaseApp.initializeApp(this);
        firebaseUser = auth.getCurrentUser();
        setContentView(R.layout.activity_sign_up);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getFragmentManager().beginTransaction().add(R.id.sign_up_content_holder,
                Login_Basic.newInstance(user)).
                addToBackStack(Universal.FragmentName.signup.name()).commit();
        FloatingActionButton floatingActionButton = (FloatingActionButton) findViewById(R.id.fab);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View view) {

                ref.child("Users").push().setValue(user).addOnSuccessListener(new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(Void aVoid) {
                        Snackbar.make(view, "Completed, You're registered!", Snackbar.LENGTH_SHORT);
                    }

                });
                Intent intent = new Intent(SignUpActivity.this, MainActivity.class);

                startActivity(intent);
            }

        });

        floatingActionButton.setVisibility(View.INVISIBLE);


        floatingActionButton.animate().translationY(floatingActionButton.getHeight() + 16).setInterpolator(new AccelerateInterpolator(2)).start();
    }


    @Override
    public void bodyBuilding(User user) {

        if(firebaseUser!=null)
            user.setUID(firebaseUser.getUid());

        getFragmentManager().beginTransaction().replace(R.id.sign_up_content_holder,
                InterestFragment.newInstance(user)).
                addToBackStack(Universal.FragmentName.bodybuild.name()).commit();




    }

    @Override
    public void login(User user) {
        getFragmentManager().beginTransaction().replace(R.id.sign_up_content_holder,
                BodyBuildingFragment.newInstance(user)).
                addToBackStack(Universal.FragmentName.bodybuild.name()).commit();


    }

    @Override
    public void Interests(User user) {
        getFragmentManager().beginTransaction().replace(R.id.sign_up_content_holder,
                InterestFragment.newInstance(user)).
                addToBackStack(Universal.FragmentName.bodybuild.name()).commit();
    }

    @Override
    public void finished(User user) {

        FloatingActionButton floatingActionButton = (FloatingActionButton) findViewById(R.id.fab);
        floatingActionButton.setVisibility(View.VISIBLE);
        floatingActionButton.animate().translationY(0).setInterpolator(new DecelerateInterpolator(2)).start();
    }

}
