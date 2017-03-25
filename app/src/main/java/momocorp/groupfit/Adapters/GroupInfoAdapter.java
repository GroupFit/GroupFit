package momocorp.groupfit.Adapters;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.support.v7.graphics.Palette;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import momocorp.groupfit.R;
import momocorp.groupfit.Universal;

/**
 * Created by Pablo on 3/24/2017.
 */

public class GroupInfoAdapter extends RecyclerView.Adapter<GroupInfoAdapter.GroupInfoHolder> {
    Context context;
    Universal.UniversalInterface universalInterface;

    public GroupInfoAdapter(Context context) {
        this.context = context;
        universalInterface = (Universal.UniversalInterface) context;

    }


    @Override
    public GroupInfoHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.group_layout, parent, false);
        return new GroupInfoHolder(view);
    }

    @Override
    public void onBindViewHolder(GroupInfoHolder holder, int position) {

        Palette p = Universal.getPaletteSwatches(Bitmap.createBitmap(BitmapFactory.decodeResource(context.getResources(), R.drawable.new_york)));
        int val = p.getLightMutedColor(context.getResources().getColor(R.color.colorAccent));
        holder.groupCardView.setCardBackgroundColor(Color.parseColor(String.format("#%06X", (0xFFFFFF & val))));
        holder.preview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                universalInterface.detailGroupFragment();
            }
        });


    }

    @Override
    public int getItemCount() {

        return 20;
    }


    public class GroupInfoHolder extends RecyclerView.ViewHolder {
        RelativeLayout groupImageHolder;
        TextView groupTitle;
        TextView groupActivity2;
        TextView location;
        CardView groupCardView;
        Button join;
        Button preview;

        public GroupInfoHolder(View itemView) {
            super(itemView);
            groupImageHolder = (RelativeLayout) itemView.findViewById(R.id.group_image_holder);
            groupTitle = (TextView) itemView.findViewById(R.id.title);
            location = (TextView) itemView.findViewById(R.id.event_location);
            groupActivity2 = (TextView) itemView.findViewById(R.id.group_activity_2);
            groupCardView = (CardView) itemView.findViewById(R.id.group_card_view);
            join = (Button) itemView.findViewById(R.id.join_group);
            preview = (Button) itemView.findViewById(R.id.see_preview);


        }


    }
}
