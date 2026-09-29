package kotlin;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class updateQueuedPeriods<T> implements MediaSourceInfoHolder<T> {
    private final int RemoteActionCompatParcelizer;
    private enqueueNextMediaPeriodHolder read;
    private final int write;

    @Override // kotlin.toRendererTime
    public final void AudioAttributesImplApi21Parcelizer() {
    }

    @Override // kotlin.toRendererTime
    public final void AudioAttributesImplApi26Parcelizer() {
    }

    @Override // kotlin.MediaSourceInfoHolder
    public final void IconCompatParcelizer(updateRepeatMode updaterepeatmode) {
    }

    @Override // kotlin.toRendererTime
    public final void MediaBrowserCompatItemReceiver() {
    }

    @Override // kotlin.MediaSourceInfoHolder
    public final void RemoteActionCompatParcelizer(Drawable drawable) {
    }

    @Override // kotlin.MediaSourceInfoHolder
    public final void write(Drawable drawable) {
    }

    public updateQueuedPeriods() {
        this((byte) 0);
    }

    private updateQueuedPeriods(byte b) {
        if (!moveMediaSourceRange.IconCompatParcelizer(Integer.MIN_VALUE, Integer.MIN_VALUE)) {
            throw new IllegalArgumentException(new StringBuilder("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: -2147483648 and height: -2147483648").toString());
        }
        this.RemoteActionCompatParcelizer = Integer.MIN_VALUE;
        this.write = Integer.MIN_VALUE;
    }

    @Override // kotlin.MediaSourceInfoHolder
    public final void read(updateRepeatMode updaterepeatmode) {
        updaterepeatmode.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, this.write);
    }

    @Override // kotlin.MediaSourceInfoHolder
    public final void write(enqueueNextMediaPeriodHolder enqueuenextmediaperiodholder) {
        this.read = enqueuenextmediaperiodholder;
    }

    @Override // kotlin.MediaSourceInfoHolder
    public final enqueueNextMediaPeriodHolder AudioAttributesCompatParcelizer() {
        return this.read;
    }
}
