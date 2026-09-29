package kotlin;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.os.Build;

/* JADX INFO: loaded from: classes3.dex */
public final class TrackOutputSampleDataPart {
    public static Typeface AudioAttributesCompatParcelizer(Context context, Typeface typeface) {
        return RemoteActionCompatParcelizer(context.getResources().getConfiguration(), typeface);
    }

    public static Typeface RemoteActionCompatParcelizer(Configuration configuration, Typeface typeface) {
        if (Build.VERSION.SDK_INT < 31 || configuration.fontWeightAdjustment == Integer.MAX_VALUE || configuration.fontWeightAdjustment == 0 || typeface == null) {
            return null;
        }
        return Typeface.create(typeface, StdKeyDeserializer.read(typeface.getWeight() + configuration.fontWeightAdjustment, 1, 1000), typeface.isItalic());
    }
}
