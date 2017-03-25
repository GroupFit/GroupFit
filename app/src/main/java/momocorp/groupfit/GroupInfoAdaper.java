package momocorp.groupfit;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.support.v7.graphics.Palette;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by Pablo on 3/24/2017.
 */

class GroupInfoAdaper extends RecyclerView.Adapter<GroupInfoAdaper.GroupInfoHolder> {
    Context context;
    Universal.FragmentInterface fragmentInterface;

    public GroupInfoAdaper(Context context) {
        this.context = context;
        fragmentInterface = (Universal.FragmentInterface) context;
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


    }

    @Override
    public int getItemCount() {
        return 20;
    }


    public class GroupInfoHolder extends RecyclerView.ViewHolder {
        RelativeLayout groupImageHolder;
        TextView groupTitle;
        TextView groupActivity2;
        TextView groupActivity1;
        CardView groupCardView;

        public GroupInfoHolder(View itemView) {
            super(itemView);
            groupImageHolder = (RelativeLayout) itemView.findViewById(R.id.group_image_holder);
            groupTitle = (TextView) itemView.findViewById(R.id.title);
            groupActivity1 = (TextView) itemView.findViewById(R.id.group_activity_1);
            groupActivity2 = (TextView) itemView.findViewById(R.id.group_activity_2);
            groupCardView = (CardView) itemView.findViewById(R.id.group_card_view);
            groupCardView.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public boolean onTouch(View v, MotionEvent event) {

                    switch (event.getAction()) {
                        case MotionEvent.ACTION_DOWN:
//                            fragmentInterface.detailGroupFragment();
                            return true;
                    }
                    return true;
                }
            });

        }


    }
}
