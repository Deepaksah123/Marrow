package kotlin;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import kotlin._init_lambda5;

/* JADX INFO: loaded from: classes.dex */
public final class getFullyDrawnReporter {
    private Context RemoteActionCompatParcelizer;

    public static getFullyDrawnReporter RemoteActionCompatParcelizer(Context context) {
        return new getFullyDrawnReporter(context);
    }

    private getFullyDrawnReporter(Context context) {
        this.RemoteActionCompatParcelizer = context;
    }

    public final int read() {
        Configuration configuration = this.RemoteActionCompatParcelizer.getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i > 600) {
            return 5;
        }
        if (i > 960 && i2 > 720) {
            return 5;
        }
        if (i > 720 && i2 > 960) {
            return 5;
        }
        if (i >= 500) {
            return 4;
        }
        if (i > 640 && i2 > 480) {
            return 4;
        }
        if (i <= 480 || i2 <= 640) {
            return i >= 360 ? 3 : 2;
        }
        return 4;
    }

    public final int AudioAttributesCompatParcelizer() {
        return this.RemoteActionCompatParcelizer.getResources().getDisplayMetrics().widthPixels / 2;
    }

    public final boolean MediaBrowserCompatItemReceiver() {
        return this.RemoteActionCompatParcelizer.getResources().getBoolean(_init_lambda5.IconCompatParcelizer.abc_action_bar_embed_tabs);
    }

    public final int IconCompatParcelizer() {
        TypedArray typedArrayObtainStyledAttributes = this.RemoteActionCompatParcelizer.obtainStyledAttributes(null, _init_lambda5.AudioAttributesImplApi26Parcelizer.ActionBar, _init_lambda5.read.actionBarStyle, 0);
        int layoutDimension = typedArrayObtainStyledAttributes.getLayoutDimension(_init_lambda5.AudioAttributesImplApi26Parcelizer.ActionBar_height, 0);
        Resources resources = this.RemoteActionCompatParcelizer.getResources();
        if (!MediaBrowserCompatItemReceiver()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(_init_lambda5.AudioAttributesCompatParcelizer.abc_action_bar_stacked_max_height));
        }
        typedArrayObtainStyledAttributes.recycle();
        return layoutDimension;
    }

    public final boolean RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer.getApplicationInfo().targetSdkVersion < 14;
    }

    public final int write() {
        return this.RemoteActionCompatParcelizer.getResources().getDimensionPixelSize(_init_lambda5.AudioAttributesCompatParcelizer.abc_action_bar_stacked_tab_max_width);
    }
}
