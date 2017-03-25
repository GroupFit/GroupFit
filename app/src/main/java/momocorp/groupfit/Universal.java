package momocorp.groupfit;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.support.v7.graphics.Palette;

/**
 * Created by cameronlewis on 3/25/17.
 */

public class Universal {
    public enum FragmentTags {
        user("User"),
        bodybuild("bodyBuilding");

        FragmentTags(String s) {
            this.s = s;
        }

        String s;
    }

    public enum FragmentName {
        bodybuild("bb"), signup("sign_up_log_in");

        FragmentName(String bb) {
            this.bb = bb;
        }
        String bb;
    }
    public interface UniversalInterface {
        public void detailGroupFragment();

    }

    public static Palette getPaletteSwatches(Bitmap bitmap) {
        return Palette.from(bitmap).generate();

    }

    public static Bitmap getRoundedRectBitmap(Bitmap bitmap, int pixels, Context context, int size) {
        Bitmap result = null;
        try {
            result = Bitmap.createBitmap(size, size, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(result);

            int color = 0xff424242;
            Paint paint = new Paint();
            Rect rect = new Rect(0, 0, 200, 200);

            paint.setAntiAlias(true);
            canvas.drawARGB(0, 0, 0, 0);
            paint.setColor(color);
            canvas.drawCircle(50, 50, 50, paint);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
            canvas.drawBitmap(bitmap, rect, rect, paint);

        } catch (NullPointerException e) {
        } catch (OutOfMemoryError o) {
        }
        return result;
    }

    public static Bitmap resize(int width, int height, int photolocation, Context context) {
        Bitmap bm = BitmapFactory.decodeResource(context.getResources(), photolocation);
        Bitmap bitmap = Bitmap.createScaledBitmap(bm, width, height, false);
        return bitmap;
    }
}
