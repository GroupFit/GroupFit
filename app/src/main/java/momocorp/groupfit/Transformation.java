package momocorp.groupfit;

import android.graphics.Bitmap;

/**
 * Created by cameronlewis on 3/25/17.
 */

 interface Transformation {
    Bitmap transform(Bitmap source);
    String key();

}
