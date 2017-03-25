package momocorp.groupfit;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import momocorp.groupfit.Adapters.GroupInfoAdaper;


public class MainActivity extends AppCompatActivity implements Universal.FragmentInterface
{
    RecyclerView group_info_recycler;
    public enum Fragments {
        details("details");

        Fragments(String s) {
            this.s = s;
        }
        String s;

    }

    @Override
    public void detailGroupFragment() {
        //create detailfragment here
        DetailGroupFragment detailGroupFragment = DetailGroupFragment.newInstance();
        getFragmentManager().beginTransaction().replace(R.id.include, detailGroupFragment).
                addToBackStack(Fragments.details.name()).commit();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        group_info_recycler = (RecyclerView) findViewById(R.id.group_recycler_view);
        group_info_recycler.setLayoutManager(new LinearLayoutManager(this));
        group_info_recycler.setAdapter(new momocorp.groupfit.GroupInfoAdaper(this));


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void intentToDetail(View view) {
        Intent i = new Intent(this, GroupDetailActivity.class);
        startActivity(i);
    }

    public void toLogin(View view) {
        Intent i = new Intent(this, LoginActivity.class);
        startActivity(i);
    }
}
