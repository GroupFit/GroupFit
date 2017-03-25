package momocorp.groupfit;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Pablo on 3/24/2017.
 */

class GroupInfoAdaper extends RecyclerView.Adapter<GroupInfoAdaper.GroupInfoHolder> {


    @Override
    public GroupInfoHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.group_layout, parent, false);
        return new GroupInfoHolder(view);
    }

    @Override
    public void onBindViewHolder(GroupInfoHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 20;
    }


    public class GroupInfoHolder extends RecyclerView.ViewHolder {
        ImageView groupImageView;
        TextView groupTitle;
        TextView groupMainActivity;

        public GroupInfoHolder(View itemView) {
            super(itemView);
            groupImageView = (ImageView) itemView.findViewById(R.id.group_image);
            groupTitle = (TextView) itemView.findViewById(R.id.title);
            groupMainActivity = (TextView) itemView.findViewById(R.id.group_main_activity);

        }


    }
}
