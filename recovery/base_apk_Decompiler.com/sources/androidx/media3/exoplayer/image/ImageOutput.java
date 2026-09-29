package androidx.media3.exoplayer.image;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes2.dex */
public interface ImageOutput {
    public static final ImageOutput write = new ImageOutput() { // from class: androidx.media3.exoplayer.image.ImageOutput.3
        @Override // androidx.media3.exoplayer.image.ImageOutput
        public final void onImageAvailable(long j, Bitmap bitmap) {
        }
    };

    void onImageAvailable(long j, Bitmap bitmap);
}
