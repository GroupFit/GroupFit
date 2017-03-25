package momocorp.groupfit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ListViewCompat;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import momocorp.groupfit.Adapters.UserAdapter;
import momocorp.groupfit.Classes.User;

public class GroupDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_group_detail);

        ArrayList<User> arrUsers = new ArrayList<User>();
        UserAdapter adapter  = new UserAdapter(this, arrUsers);
        ListView lvUsers = (ListView) findViewById(R.id.lvMembers);
        lvUsers.setAdapter(adapter);
        User newUser = new User("Nathan", "https://media.licdn.com/mpr/mpr/shrinknp_200_200/AAEAAQAAAAAAAAhGAAAAJDI4MmIyYTRmLWQ0MDctNDY4OS1hYjllLTM5MjEwMjA4M2E5NQ.jpg");
        adapter.add(newUser);
        newUser = new User("Bill", "https://scontent-iad3-1.xx.fbcdn.net/v/t1.0-1/c0.0.160.160/p160x160/1456552_10201727861056058_2143995354_n.jpg?oh=31f99afe83a43ac478270e35f398f2a3&oe=596C6217");
        adapter.add(newUser);
        newUser = new User("Jake", "https://scontent-iad3-1.xx.fbcdn.net/v/t1.0-1/c0.0.160.160/p160x160/1456552_10201727861056058_2143995354_n.jpg?oh=31f99afe83a43ac478270e35f398f2a3&oe=596C6217");
        adapter.add(newUser);
        newUser = new User("Nathan", "https://scontent-iad3-1.xx.fbcdn.net/v/t1.0-1/c0.0.160.160/p160x160/1456552_10201727861056058_2143995354_n.jpg?oh=31f99afe83a43ac478270e35f398f2a3&oe=596C6217");
        adapter.add(newUser);
        newUser = new User("Nathan", "https://scontent-iad3-1.xx.fbcdn.net/v/t1.0-1/c0.0.160.160/p160x160/1456552_10201727861056058_2143995354_n.jpg?oh=31f99afe83a43ac478270e35f398f2a3&oe=596C6217");
        adapter.add(newUser);
        newUser = new User("Nathan", "https://scontent-iad3-1.xx.fbcdn.net/v/t1.0-1/c0.0.160.160/p160x160/1456552_10201727861056058_2143995354_n.jpg?oh=31f99afe83a43ac478270e35f398f2a3&oe=596C6217");
        adapter.add(newUser);
        newUser = new User("SDian", "https://scontent-iad3-1.xx.fbcdn.net/v/t1.0-1/c0.0.160.160/p160x160/1456552_10201727861056058_2143995354_n.jpg?oh=31f99afe83a43ac478270e35f398f2a3&oe=596C6217");
        adapter.add(newUser);
        newUser = new User("Bill", "https://scontent-iad3-1.xx.fbcdn.net/v/t1.0-1/c0.0.160.160/p160x160/1456552_10201727861056058_2143995354_n.jpg?oh=31f99afe83a43ac478270e35f398f2a3&oe=596C6217");
        adapter.add(newUser);
        newUser = new User("Jake", "https://scontent-iad3-1.xx.fbcdn.net/v/t1.0-1/c0.0.160.160/p160x160/1456552_10201727861056058_2143995354_n.jpg?oh=31f99afe83a43ac478270e35f398f2a3&oe=596C6217");
        adapter.add(newUser);
        newUser = new User("Nathan", "https://scontent-iad3-1.xx.fbcdn.net/v/t1.0-1/c0.0.160.160/p160x160/1456552_10201727861056058_2143995354_n.jpg?oh=31f99afe83a43ac478270e35f398f2a3&oe=596C6217");
        adapter.add(newUser);
        newUser = new User("Nathan", "https://scontent-iad3-1.xx.fbcdn.net/v/t1.0-1/c0.0.160.160/p160x160/1456552_10201727861056058_2143995354_n.jpg?oh=31f99afe83a43ac478270e35f398f2a3&oe=596C6217");
        adapter.add(newUser);
        newUser = new User("Nathan", "https://scontent-iad3-1.xx.fbcdn.net/v/t1.0-1/c0.0.160.160/p160x160/1456552_10201727861056058_2143995354_n.jpg?oh=31f99afe83a43ac478270e35f398f2a3&oe=596C6217");
        adapter.add(newUser);
        newUser = new User("SDian", "https://scontent-iad3-1.xx.fbcdn.net/v/t1.0-1/c0.0.160.160/p160x160/1456552_10201727861056058_2143995354_n.jpg?oh=31f99afe83a43ac478270e35f398f2a3&oe=596C6217");
        adapter.add(newUser);
        newUser = new User("Bill", "https://scontent-iad3-1.xx.fbcdn.net/v/t1.0-1/c0.0.160.160/p160x160/1456552_10201727861056058_2143995354_n.jpg?oh=31f99afe83a43ac478270e35f398f2a3&oe=596C6217");
        adapter.add(newUser);
        newUser = new User("Jake", "https://scontent-iad3-1.xx.fbcdn.net/v/t1.0-1/c0.0.160.160/p160x160/1456552_10201727861056058_2143995354_n.jpg?oh=31f99afe83a43ac478270e35f398f2a3&oe=596C6217");
        adapter.add(newUser);
        newUser = new User("Nathan", "https://scontent-iad3-1.xx.fbcdn.net/v/t1.0-1/c0.0.160.160/p160x160/1456552_10201727861056058_2143995354_n.jpg?oh=31f99afe83a43ac478270e35f398f2a3&oe=596C6217");
        adapter.add(newUser);
        newUser = new User("Nathan", "https://scontent-iad3-1.xx.fbcdn.net/v/t1.0-1/c0.0.160.160/p160x160/1456552_10201727861056058_2143995354_n.jpg?oh=31f99afe83a43ac478270e35f398f2a3&oe=596C6217");
        adapter.add(newUser);
        newUser = new User("Nathan", "https://scontent-iad3-1.xx.fbcdn.net/v/t1.0-1/c0.0.160.160/p160x160/1456552_10201727861056058_2143995354_n.jpg?oh=31f99afe83a43ac478270e35f398f2a3&oe=596C6217");
        adapter.add(newUser);
        newUser = new User("SDian", "https://scontent-iad3-1.xx.fbcdn.net/v/t1.0-1/c0.0.160.160/p160x160/1456552_10201727861056058_2143995354_n.jpg?oh=31f99afe83a43ac478270e35f398f2a3&oe=596C6217");
        adapter.add(newUser);
        newUser = new User("Bill", "https://scontent-iad3-1.xx.fbcdn.net/v/t1.0-1/c0.0.160.160/p160x160/1456552_10201727861056058_2143995354_n.jpg?oh=31f99afe83a43ac478270e35f398f2a3&oe=596C6217");
        adapter.add(newUser);
        newUser = new User("Jake", "https://scontent-iad3-1.xx.fbcdn.net/v/t1.0-1/c0.0.160.160/p160x160/1456552_10201727861056058_2143995354_n.jpg?oh=31f99afe83a43ac478270e35f398f2a3&oe=596C6217");
        adapter.add(newUser);
        newUser = new User("Nathan", "https://scontent-iad3-1.xx.fbcdn.net/v/t1.0-1/c0.0.160.160/p160x160/1456552_10201727861056058_2143995354_n.jpg?oh=31f99afe83a43ac478270e35f398f2a3&oe=596C6217");
        adapter.add(newUser);
        newUser = new User("Nathan", "https://scontent-iad3-1.xx.fbcdn.net/v/t1.0-1/c0.0.160.160/p160x160/1456552_10201727861056058_2143995354_n.jpg?oh=31f99afe83a43ac478270e35f398f2a3&oe=596C6217");
        adapter.add(newUser);
        newUser = new User("Nathan", "https://scontent-iad3-1.xx.fbcdn.net/v/t1.0-1/c0.0.160.160/p160x160/1456552_10201727861056058_2143995354_n.jpg?oh=31f99afe83a43ac478270e35f398f2a3&oe=596C6217");
        adapter.add(newUser);
        newUser = new User("SDian", "https://scontent-iad3-1.xx.fbcdn.net/v/t1.0-1/c0.0.160.160/p160x160/1456552_10201727861056058_2143995354_n.jpg?oh=31f99afe83a43ac478270e35f398f2a3&oe=596C6217");
        adapter.add(newUser);


    }
}
