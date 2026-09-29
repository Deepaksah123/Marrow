package kotlin;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public abstract class removeAfter<Z> implements MediaSourceInfoHolder<Z> {
    private enqueueNextMediaPeriodHolder write;

    @Override // kotlin.MediaSourceInfoHolder
    public void AudioAttributesCompatParcelizer(Drawable drawable) {
    }

    @Override // kotlin.toRendererTime
    public void AudioAttributesImplApi21Parcelizer() {
    }

    @Override // kotlin.toRendererTime
    public final void AudioAttributesImplApi26Parcelizer() {
    }

    @Override // kotlin.toRendererTime
    public void MediaBrowserCompatItemReceiver() {
    }

    @Override // kotlin.MediaSourceInfoHolder
    public void RemoteActionCompatParcelizer(Drawable drawable) {
    }

    @Override // kotlin.MediaSourceInfoHolder
    public void write(Drawable drawable) {
    }

    @Override // kotlin.MediaSourceInfoHolder
    public void write(enqueueNextMediaPeriodHolder enqueuenextmediaperiodholder) {
        this.write = enqueuenextmediaperiodholder;
    }

    @Override // kotlin.MediaSourceInfoHolder
    public enqueueNextMediaPeriodHolder AudioAttributesCompatParcelizer() {
        return this.write;
    }
}
