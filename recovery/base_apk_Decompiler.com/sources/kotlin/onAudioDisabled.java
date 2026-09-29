package kotlin;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes2.dex */
public final class onAudioDisabled {
    private final String AudioAttributesCompatParcelizer;
    private final String IconCompatParcelizer;
    private final int MediaBrowserCompatCustomActionResultReceiver;
    private Bitmap RemoteActionCompatParcelizer;
    private final int read;
    private final String write;

    public onAudioDisabled(int i, int i2, String str, String str2, String str3) {
        this.MediaBrowserCompatCustomActionResultReceiver = i;
        this.read = i2;
        this.IconCompatParcelizer = str;
        this.write = str2;
        this.AudioAttributesCompatParcelizer = str3;
    }

    public final int RemoteActionCompatParcelizer() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final int read() {
        return this.read;
    }

    public final String IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final String write() {
        return this.write;
    }

    public final Bitmap AudioAttributesCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final void IconCompatParcelizer(Bitmap bitmap) {
        this.RemoteActionCompatParcelizer = bitmap;
    }

    public final onAudioDisabled IconCompatParcelizer(float f) {
        onAudioDisabled onaudiodisabled = new onAudioDisabled((int) (this.MediaBrowserCompatCustomActionResultReceiver * f), (int) (this.read * f), this.IconCompatParcelizer, this.write, this.AudioAttributesCompatParcelizer);
        Bitmap bitmap = this.RemoteActionCompatParcelizer;
        if (bitmap != null) {
            onaudiodisabled.IconCompatParcelizer(Bitmap.createScaledBitmap(bitmap, onaudiodisabled.MediaBrowserCompatCustomActionResultReceiver, onaudiodisabled.read, true));
        }
        return onaudiodisabled;
    }
}
