package kotlin;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class maybeContinueLoading {
    private final AssetManager IconCompatParcelizer;
    private ExoPlayerImplExternalSyntheticLambda10 write;
    private final moveMediaItemsInternal<String> MediaBrowserCompatItemReceiver = new moveMediaItemsInternal<>();
    private final Map<moveMediaItemsInternal<String>, Typeface> RemoteActionCompatParcelizer = new HashMap();
    private final Map<String, Typeface> AudioAttributesCompatParcelizer = new HashMap();
    private String read = ".ttf";

    public maybeContinueLoading(Drawable.Callback callback, ExoPlayerImplExternalSyntheticLambda10 exoPlayerImplExternalSyntheticLambda10) {
        this.write = exoPlayerImplExternalSyntheticLambda10;
        if (!(callback instanceof View)) {
            access3000.AudioAttributesCompatParcelizer("LottieDrawable must be inside of a view for images to work.");
            this.IconCompatParcelizer = null;
        } else {
            this.IconCompatParcelizer = ((View) callback).getContext().getAssets();
        }
    }

    public final void write(ExoPlayerImplExternalSyntheticLambda10 exoPlayerImplExternalSyntheticLambda10) {
        this.write = exoPlayerImplExternalSyntheticLambda10;
    }

    public final void IconCompatParcelizer(String str) {
        this.read = str;
    }

    public final Typeface read(isUsingPlaceholderPeriod isusingplaceholderperiod) {
        this.MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer(isusingplaceholderperiod.IconCompatParcelizer(), isusingplaceholderperiod.RemoteActionCompatParcelizer());
        Typeface typeface = this.RemoteActionCompatParcelizer.get(this.MediaBrowserCompatItemReceiver);
        if (typeface != null) {
            return typeface;
        }
        Typeface typefaceRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(IconCompatParcelizer(isusingplaceholderperiod), isusingplaceholderperiod.RemoteActionCompatParcelizer());
        this.RemoteActionCompatParcelizer.put(this.MediaBrowserCompatItemReceiver, typefaceRemoteActionCompatParcelizer);
        return typefaceRemoteActionCompatParcelizer;
    }

    private Typeface IconCompatParcelizer(isUsingPlaceholderPeriod isusingplaceholderperiod) {
        String strIconCompatParcelizer = isusingplaceholderperiod.IconCompatParcelizer();
        Typeface typeface = this.AudioAttributesCompatParcelizer.get(strIconCompatParcelizer);
        if (typeface != null) {
            return typeface;
        }
        isusingplaceholderperiod.RemoteActionCompatParcelizer();
        isusingplaceholderperiod.AudioAttributesCompatParcelizer();
        if (isusingplaceholderperiod.read() != null) {
            return isusingplaceholderperiod.read();
        }
        StringBuilder sb = new StringBuilder("fonts/");
        sb.append(strIconCompatParcelizer);
        sb.append(this.read);
        Typeface typefaceCreateFromAsset = Typeface.createFromAsset(this.IconCompatParcelizer, sb.toString());
        this.AudioAttributesCompatParcelizer.put(strIconCompatParcelizer, typefaceCreateFromAsset);
        return typefaceCreateFromAsset;
    }

    private static Typeface RemoteActionCompatParcelizer(Typeface typeface, String str) {
        boolean zContains = str.contains("Italic");
        boolean zContains2 = str.contains("Bold");
        int i = (zContains && zContains2) ? 3 : zContains ? 2 : zContains2 ? 1 : 0;
        return typeface.getStyle() == i ? typeface : Typeface.create(typeface, i);
    }
}
