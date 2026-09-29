package kotlin;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import kotlin._init_lambda5;
import kotlin.peekAvailableContext;

/* JADX INFO: loaded from: classes.dex */
public class onTrimMemory {
    private int AudioAttributesCompatParcelizer;
    private onSaveInstanceState AudioAttributesImplApi21Parcelizer;
    private final int AudioAttributesImplApi26Parcelizer;
    private PopupWindow.OnDismissListener AudioAttributesImplBaseParcelizer;
    private View IconCompatParcelizer;
    private final boolean MediaBrowserCompatCustomActionResultReceiver;
    private final onRequestPermissionsResult MediaBrowserCompatItemReceiver;
    private peekAvailableContext.AudioAttributesCompatParcelizer MediaBrowserCompatSearchResultReceiver;
    private final int MediaDescriptionCompat;
    private final Context RemoteActionCompatParcelizer;
    private final PopupWindow.OnDismissListener read;
    private boolean write;

    public onTrimMemory(Context context, onRequestPermissionsResult onrequestpermissionsresult, View view, boolean z, int i) {
        this(context, onrequestpermissionsresult, view, z, i, 0);
    }

    public onTrimMemory(Context context, onRequestPermissionsResult onrequestpermissionsresult, View view, boolean z, int i, int i2) {
        this.AudioAttributesCompatParcelizer = 8388611;
        this.read = new PopupWindow.OnDismissListener() { // from class: o.onTrimMemory.2
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                onTrimMemory.this.AudioAttributesCompatParcelizer();
            }
        };
        this.RemoteActionCompatParcelizer = context;
        this.MediaBrowserCompatItemReceiver = onrequestpermissionsresult;
        this.IconCompatParcelizer = view;
        this.MediaBrowserCompatCustomActionResultReceiver = z;
        this.AudioAttributesImplApi26Parcelizer = i;
        this.MediaDescriptionCompat = i2;
    }

    public final void AudioAttributesCompatParcelizer(PopupWindow.OnDismissListener onDismissListener) {
        this.AudioAttributesImplBaseParcelizer = onDismissListener;
    }

    public final void write(View view) {
        this.IconCompatParcelizer = view;
    }

    public final void RemoteActionCompatParcelizer(boolean z) {
        this.write = z;
        onSaveInstanceState onsaveinstancestate = this.AudioAttributesImplApi21Parcelizer;
        if (onsaveinstancestate != null) {
            onsaveinstancestate.RemoteActionCompatParcelizer(z);
        }
    }

    public final void read() {
        this.AudioAttributesCompatParcelizer = 8388613;
    }

    public final void MediaBrowserCompatItemReceiver() {
        if (!MediaBrowserCompatCustomActionResultReceiver()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public final onSaveInstanceState IconCompatParcelizer() {
        if (this.AudioAttributesImplApi21Parcelizer == null) {
            this.AudioAttributesImplApi21Parcelizer = AudioAttributesImplApi21Parcelizer();
        }
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public final boolean MediaBrowserCompatCustomActionResultReceiver() {
        if (write()) {
            return true;
        }
        if (this.IconCompatParcelizer == null) {
            return false;
        }
        AudioAttributesCompatParcelizer(0, 0, false, false);
        return true;
    }

    public final boolean AudioAttributesCompatParcelizer(int i, int i2) {
        if (write()) {
            return true;
        }
        if (this.IconCompatParcelizer == null) {
            return false;
        }
        AudioAttributesCompatParcelizer(i, i2, true, true);
        return true;
    }

    private onSaveInstanceState AudioAttributesImplApi21Parcelizer() {
        onSaveInstanceState removeonconfigurationchangedlistener;
        Display defaultDisplay = ((WindowManager) this.RemoteActionCompatParcelizer.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        read.IconCompatParcelizer(defaultDisplay, point);
        if (Math.min(point.x, point.y) >= this.RemoteActionCompatParcelizer.getResources().getDimensionPixelSize(_init_lambda5.AudioAttributesCompatParcelizer.abc_cascading_menus_min_smallest_width)) {
            removeonconfigurationchangedlistener = new onNewIntent(this.RemoteActionCompatParcelizer, this.IconCompatParcelizer, this.AudioAttributesImplApi26Parcelizer, this.MediaDescriptionCompat, this.MediaBrowserCompatCustomActionResultReceiver);
        } else {
            removeonconfigurationchangedlistener = new removeOnConfigurationChangedListener(this.RemoteActionCompatParcelizer, this.MediaBrowserCompatItemReceiver, this.IconCompatParcelizer, this.AudioAttributesImplApi26Parcelizer, this.MediaDescriptionCompat, this.MediaBrowserCompatCustomActionResultReceiver);
        }
        removeonconfigurationchangedlistener.RemoteActionCompatParcelizer(this.MediaBrowserCompatItemReceiver);
        removeonconfigurationchangedlistener.AudioAttributesCompatParcelizer(this.read);
        removeonconfigurationchangedlistener.write(this.IconCompatParcelizer);
        removeonconfigurationchangedlistener.read(this.MediaBrowserCompatSearchResultReceiver);
        removeonconfigurationchangedlistener.RemoteActionCompatParcelizer(this.write);
        removeonconfigurationchangedlistener.IconCompatParcelizer(this.AudioAttributesCompatParcelizer);
        return removeonconfigurationchangedlistener;
    }

    private void AudioAttributesCompatParcelizer(int i, int i2, boolean z, boolean z2) {
        onSaveInstanceState onsaveinstancestateIconCompatParcelizer = IconCompatParcelizer();
        onsaveinstancestateIconCompatParcelizer.write(z2);
        if (z) {
            if ((_clearIfStdImpl.write(this.AudioAttributesCompatParcelizer, InvalidTypeIdException.MediaBrowserCompatMediaItem(this.IconCompatParcelizer)) & 7) == 5) {
                i -= this.IconCompatParcelizer.getWidth();
            }
            onsaveinstancestateIconCompatParcelizer.RemoteActionCompatParcelizer(i);
            onsaveinstancestateIconCompatParcelizer.write(i2);
            int i3 = (int) ((this.RemoteActionCompatParcelizer.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            onsaveinstancestateIconCompatParcelizer.write(new Rect(i - i3, i2 - i3, i + i3, i2 + i3));
        }
        onsaveinstancestateIconCompatParcelizer.AudioAttributesImplBaseParcelizer();
    }

    public final void RemoteActionCompatParcelizer() {
        if (write()) {
            this.AudioAttributesImplApi21Parcelizer.write();
        }
    }

    public void AudioAttributesCompatParcelizer() {
        this.AudioAttributesImplApi21Parcelizer = null;
        PopupWindow.OnDismissListener onDismissListener = this.AudioAttributesImplBaseParcelizer;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final boolean write() {
        onSaveInstanceState onsaveinstancestate = this.AudioAttributesImplApi21Parcelizer;
        return onsaveinstancestate != null && onsaveinstancestate.MediaBrowserCompatCustomActionResultReceiver();
    }

    public final void AudioAttributesCompatParcelizer(peekAvailableContext.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        this.MediaBrowserCompatSearchResultReceiver = audioAttributesCompatParcelizer;
        onSaveInstanceState onsaveinstancestate = this.AudioAttributesImplApi21Parcelizer;
        if (onsaveinstancestate != null) {
            onsaveinstancestate.read(audioAttributesCompatParcelizer);
        }
    }

    static class read {
        static void IconCompatParcelizer(Display display, Point point) {
            display.getRealSize(point);
        }
    }
}
