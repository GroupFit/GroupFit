package momocorp.groupfit;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import static momocorp.groupfit.Universal.getRoundedRectBitmap;

/**
 * Created by cameronlewis on 3/25/17.
 */

class GroupDetailAdapter extends RecyclerView.Adapter<GroupDetailAdapter.GroupDetViewHolder> {
    Context context;
    Bitmap resized;
    Bitmap conv_bm;
    public GroupDetailAdapter(Context context) {
        this.context = context; Bitmap bm = BitmapFactory.decodeResource(context.getResources(),
                R.drawable.kristina);
         resized = Bitmap.createScaledBitmap(bm, 100, 100, true);
         conv_bm = getRoundedRectBitmap(resized, 100);
    }

    @Override
    public GroupDetViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override

    public void onBindViewHolder(GroupDetViewHolder holder, int position) {

        holder.userProfile.setImageBitmap(conv_bm);

    }

    @Override
    public int getItemCount() {
        return 20;
    }

    public static class GroupDetViewHolder extends RecyclerView.ViewHolder {
        public ImageView userProfile;

        public GroupDetViewHolder(View itemView) {
            super(itemView);
            userProfile = (ImageView) itemView.findViewById(R.id.other_group_user_image);

        }
    }
}
