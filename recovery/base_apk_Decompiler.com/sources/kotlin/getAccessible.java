package kotlin;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import androidx.mediarouter.app.MediaRouteVolumeSlider;
import kotlin.PrivateMaxEntriesMapNode;
import kotlin._init_lambda5;

/* JADX INFO: loaded from: classes4.dex */
public final class getAccessible {
    private static Drawable IconCompatParcelizer;
    private static Drawable RemoteActionCompatParcelizer;
    private static Drawable read;
    private static Drawable write;

    static Drawable RemoteActionCompatParcelizer(Context context) {
        if (write == null) {
            write = AudioAttributesCompatParcelizer(context, 0);
        }
        return write;
    }

    static Drawable AudioAttributesImplBaseParcelizer(Context context) {
        if (RemoteActionCompatParcelizer == null) {
            RemoteActionCompatParcelizer = AudioAttributesCompatParcelizer(context, 1);
        }
        return RemoteActionCompatParcelizer;
    }

    static Drawable MediaBrowserCompatItemReceiver(Context context) {
        if (read == null) {
            read = AudioAttributesCompatParcelizer(context, 2);
        }
        return read;
    }

    static Drawable AudioAttributesImplApi26Parcelizer(Context context) {
        if (IconCompatParcelizer == null) {
            IconCompatParcelizer = AudioAttributesCompatParcelizer(context, 3);
        }
        return IconCompatParcelizer;
    }

    private static Drawable AudioAttributesCompatParcelizer(Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{PrivateMaxEntriesMapNode.RemoteActionCompatParcelizer.mediaRouteDefaultIconDrawable, PrivateMaxEntriesMapNode.RemoteActionCompatParcelizer.mediaRouteTvIconDrawable, PrivateMaxEntriesMapNode.RemoteActionCompatParcelizer.mediaRouteSpeakerIconDrawable, PrivateMaxEntriesMapNode.RemoteActionCompatParcelizer.mediaRouteSpeakerGroupIconDrawable});
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(i);
        typedArrayObtainStyledAttributes.recycle();
        return drawable;
    }

    public static Context read(Context context) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, MediaBrowserCompatCustomActionResultReceiver(context));
        int iIconCompatParcelizer = IconCompatParcelizer(contextThemeWrapper, PrivateMaxEntriesMapNode.RemoteActionCompatParcelizer.mediaRouteTheme);
        return iIconCompatParcelizer != 0 ? new ContextThemeWrapper(contextThemeWrapper, iIconCompatParcelizer) : contextThemeWrapper;
    }

    static Context write(Context context, int i, boolean z) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, IconCompatParcelizer(context, !z ? _init_lambda5.read.dialogTheme : _init_lambda5.read.alertDialogTheme));
        return IconCompatParcelizer(contextThemeWrapper, PrivateMaxEntriesMapNode.RemoteActionCompatParcelizer.mediaRouteTheme) != 0 ? new ContextThemeWrapper(contextThemeWrapper, MediaBrowserCompatCustomActionResultReceiver(contextThemeWrapper)) : contextThemeWrapper;
    }

    static int IconCompatParcelizer(Context context) {
        int iIconCompatParcelizer = IconCompatParcelizer(context, PrivateMaxEntriesMapNode.RemoteActionCompatParcelizer.mediaRouteTheme);
        return iIconCompatParcelizer == 0 ? MediaBrowserCompatCustomActionResultReceiver(context) : iIconCompatParcelizer;
    }

    static int IconCompatParcelizer(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue.resourceId;
        }
        return 0;
    }

    public static float AudioAttributesCompatParcelizer(Context context) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true)) {
            return typedValue.getFloat();
        }
        return 0.5f;
    }

    public static int RemoteActionCompatParcelizer(Context context, int i) {
        return _verifyNumberForScalarCoercion.RemoteActionCompatParcelizer(-1, RemoteActionCompatParcelizer(context, i, _init_lambda5.read.colorPrimary)) >= 3.0d ? -1 : -570425344;
    }

    static int write(Context context) {
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(context, 0, _init_lambda5.read.colorPrimary);
        return _verifyNumberForScalarCoercion.RemoteActionCompatParcelizer(iRemoteActionCompatParcelizer, RemoteActionCompatParcelizer(context, 0, R.attr.colorBackground)) < 3.0d ? RemoteActionCompatParcelizer(context, 0, _init_lambda5.read.colorAccent) : iRemoteActionCompatParcelizer;
    }

    static void IconCompatParcelizer(Context context, View view, View view2, boolean z) {
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(context, 0, _init_lambda5.read.colorPrimary);
        int iRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(context, 0, _init_lambda5.read.colorPrimaryDark);
        if (z && RemoteActionCompatParcelizer(context, 0) == -570425344) {
            iRemoteActionCompatParcelizer2 = iRemoteActionCompatParcelizer;
            iRemoteActionCompatParcelizer = -1;
        }
        view.setBackgroundColor(iRemoteActionCompatParcelizer);
        view2.setBackgroundColor(iRemoteActionCompatParcelizer2);
        view.setTag(Integer.valueOf(iRemoteActionCompatParcelizer));
        view2.setTag(Integer.valueOf(iRemoteActionCompatParcelizer2));
    }

    static void read(Context context, MediaRouteVolumeSlider mediaRouteVolumeSlider, View view) {
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(context, 0);
        if (Color.alpha(iRemoteActionCompatParcelizer) != 255) {
            iRemoteActionCompatParcelizer = _verifyNumberForScalarCoercion.read(iRemoteActionCompatParcelizer, ((Integer) view.getTag()).intValue());
        }
        mediaRouteVolumeSlider.setColor(iRemoteActionCompatParcelizer);
    }

    private static boolean AudioAttributesImplApi21Parcelizer(Context context) {
        TypedValue typedValue = new TypedValue();
        return context.getTheme().resolveAttribute(_init_lambda5.read.isLightTheme, typedValue, true) && typedValue.data != 0;
    }

    private static int RemoteActionCompatParcelizer(Context context, int i, int i2) {
        if (i != 0) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, new int[]{i2});
            int color = typedArrayObtainStyledAttributes.getColor(0, 0);
            typedArrayObtainStyledAttributes.recycle();
            if (color != 0) {
                return color;
            }
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i2, typedValue, true);
        if (typedValue.resourceId != 0) {
            return context.getResources().getColor(typedValue.resourceId);
        }
        return typedValue.data;
    }

    private static int MediaBrowserCompatCustomActionResultReceiver(Context context) {
        if (AudioAttributesImplApi21Parcelizer(context)) {
            if (RemoteActionCompatParcelizer(context, 0) == -570425344) {
                return PrivateMaxEntriesMapNode.AudioAttributesImplApi26Parcelizer.Theme_MediaRouter_Light;
            }
            return PrivateMaxEntriesMapNode.AudioAttributesImplApi26Parcelizer.Theme_MediaRouter_Light_DarkControlPanel;
        }
        if (RemoteActionCompatParcelizer(context, 0) == -570425344) {
            return PrivateMaxEntriesMapNode.AudioAttributesImplApi26Parcelizer.Theme_MediaRouter_LightControlPanel;
        }
        return PrivateMaxEntriesMapNode.AudioAttributesImplApi26Parcelizer.Theme_MediaRouter;
    }
}
