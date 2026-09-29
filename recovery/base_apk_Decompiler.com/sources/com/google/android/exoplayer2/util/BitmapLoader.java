package com.google.android.exoplayer2.util;

import android.graphics.Bitmap;
import android.net.Uri;
import com.google.android.exoplayer2.MediaMetadata;
import kotlin.Mp4ExtractorExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public interface BitmapLoader {
    Mp4ExtractorExternalSyntheticLambda0<Bitmap> decodeBitmap(byte[] bArr);

    Mp4ExtractorExternalSyntheticLambda0<Bitmap> loadBitmap(Uri uri);

    default Mp4ExtractorExternalSyntheticLambda0<Bitmap> loadBitmapFromMetadata(MediaMetadata mediaMetadata) {
        if (mediaMetadata.artworkData != null) {
            return decodeBitmap(mediaMetadata.artworkData);
        }
        if (mediaMetadata.artworkUri != null) {
            return loadBitmap(mediaMetadata.artworkUri);
        }
        return null;
    }
}
