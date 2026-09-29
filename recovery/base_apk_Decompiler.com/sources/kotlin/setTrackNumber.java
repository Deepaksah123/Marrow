package kotlin;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes2.dex */
final class setTrackNumber extends setRecordingYear<Drawable> {
    @Override // kotlin.setMimeType
    public final void MediaBrowserCompatCustomActionResultReceiver() {
    }

    static setMimeType<Drawable> read(Drawable drawable) {
        if (drawable != null) {
            return new setTrackNumber(drawable);
        }
        return null;
    }

    private setTrackNumber(Drawable drawable) {
        super(drawable);
    }

    @Override // kotlin.setMimeType
    public final Class<Drawable> read() {
        return this.RemoteActionCompatParcelizer.getClass();
    }

    @Override // kotlin.setMimeType
    public final int write() {
        return Math.max(1, (this.RemoteActionCompatParcelizer.getIntrinsicWidth() * this.RemoteActionCompatParcelizer.getIntrinsicHeight()) << 2);
    }
}
