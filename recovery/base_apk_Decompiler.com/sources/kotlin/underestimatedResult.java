package kotlin;

import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class underestimatedResult {
    private final View AudioAttributesImplApi21Parcelizer;
    private int IconCompatParcelizer;
    private int RemoteActionCompatParcelizer;
    private int read;
    private int write;
    private boolean MediaBrowserCompatItemReceiver = true;
    private boolean AudioAttributesCompatParcelizer = true;

    public underestimatedResult(View view) {
        this.AudioAttributesImplApi21Parcelizer = view;
    }

    public final void write() {
        this.IconCompatParcelizer = this.AudioAttributesImplApi21Parcelizer.getTop();
        this.write = this.AudioAttributesImplApi21Parcelizer.getLeft();
    }

    public final void AudioAttributesCompatParcelizer() {
        View view = this.AudioAttributesImplApi21Parcelizer;
        InvalidTypeIdException.IconCompatParcelizer(view, this.RemoteActionCompatParcelizer - (view.getTop() - this.IconCompatParcelizer));
        View view2 = this.AudioAttributesImplApi21Parcelizer;
        InvalidTypeIdException.AudioAttributesCompatParcelizer(view2, this.read - (view2.getLeft() - this.write));
    }

    public final boolean IconCompatParcelizer(int i) {
        if (!this.MediaBrowserCompatItemReceiver || this.RemoteActionCompatParcelizer == i) {
            return false;
        }
        this.RemoteActionCompatParcelizer = i;
        AudioAttributesCompatParcelizer();
        return true;
    }

    public final int IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final int read() {
        return this.IconCompatParcelizer;
    }
}
