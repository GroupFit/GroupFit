package momocorp.groupfit.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import momocorp.groupfit.Classes.User;
import momocorp.groupfit.R;

/**
 * Created by Satchin on 3/25/2017.
 */

public class UserAdapter extends ArrayAdapter<User> {
    public UserAdapter(Context context, ArrayList<User> users) {
        super(context, 0, users);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        User user = getItem(position);
        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.user_list_element,parent, false);
        }
        TextView tvUserName = (TextView)convertView.findViewById(R.id.tvUserName);
        ImageView ivUserImage = (ImageView) convertView.findViewById(R.id.ivUserImage);
        Picasso.with(getContext()).load(user.pic_uri).fit().centerCrop().placeholder(R.drawable.ic_user_icon).error(R.drawable.ic_user_icon).into(ivUserImage);
        tvUserName.setText(user.name);
        return convertView;
    }
}
