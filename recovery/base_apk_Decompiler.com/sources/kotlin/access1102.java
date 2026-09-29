package kotlin;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes2.dex */
public final class access1102 extends addMediaSourceHolders {
    private final setPlaybackLooper write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public access1102(setPlaybackLooper setplaybacklooper) {
        super(null);
        toMagicModuleMetaRepoModel.write(setplaybacklooper, "");
        this.write = setplaybacklooper;
    }

    @Override // kotlin.addMediaSourceHolders
    public final Object read(lambdasetAudioSessionId9 lambdasetaudiosessionid9, SampleVideos<? super getShowPopup> sampleVideos) {
        setPlaybackLooper setplaybacklooper = this.write;
        Drawable drawableIconCompatParcelizer = lambdasetaudiosessionid9.IconCompatParcelizer();
        BitmapDrawable bitmapDrawable = drawableIconCompatParcelizer instanceof BitmapDrawable ? (BitmapDrawable) drawableIconCompatParcelizer : null;
        Bitmap bitmap = bitmapDrawable != null ? bitmapDrawable.getBitmap() : null;
        if (bitmap != null) {
            setplaybacklooper.read(bitmap, false);
        }
        return getShowPopup.INSTANCE;
    }
}
