package kotlin;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* JADX INFO: loaded from: classes2.dex */
public final class setGenre implements setMimeType<BitmapDrawable>, setLiveTargetOffsetMs {
    private final setMimeType<Bitmap> IconCompatParcelizer;
    private final Resources read;

    public static setMimeType<BitmapDrawable> IconCompatParcelizer(Resources resources, setMimeType<Bitmap> setmimetype) {
        if (setmimetype == null) {
            return null;
        }
        return new setGenre(resources, setmimetype);
    }

    private setGenre(Resources resources, setMimeType<Bitmap> setmimetype) {
        this.read = (Resources) moveMediaSource.AudioAttributesCompatParcelizer(resources);
        this.IconCompatParcelizer = (setMimeType) moveMediaSource.AudioAttributesCompatParcelizer(setmimetype);
    }

    @Override // kotlin.setMimeType
    public final Class<BitmapDrawable> read() {
        return BitmapDrawable.class;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.setMimeType
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public BitmapDrawable RemoteActionCompatParcelizer() {
        return new BitmapDrawable(this.read, this.IconCompatParcelizer.RemoteActionCompatParcelizer());
    }

    @Override // kotlin.setMimeType
    public final int write() {
        return this.IconCompatParcelizer.write();
    }

    @Override // kotlin.setMimeType
    public final void MediaBrowserCompatCustomActionResultReceiver() {
        this.IconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver();
    }

    @Override // kotlin.setLiveTargetOffsetMs
    public final void IconCompatParcelizer() {
        setMimeType<Bitmap> setmimetype = this.IconCompatParcelizer;
        if (setmimetype instanceof setLiveTargetOffsetMs) {
            ((setLiveTargetOffsetMs) setmimetype).IconCompatParcelizer();
        }
    }
}
