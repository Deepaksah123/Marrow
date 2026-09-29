package kotlin;

import android.graphics.Bitmap;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class buildSubtitle implements LoadControl<Bitmap> {
    private static isRated<Integer> IconCompatParcelizer = isRated.AudioAttributesCompatParcelizer("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality", 90);
    private static isRated<Bitmap.CompressFormat> read = isRated.write("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat");
    private final setSubtitleConfigurations RemoteActionCompatParcelizer;

    public buildSubtitle(setSubtitleConfigurations setsubtitleconfigurations) {
        this.RemoteActionCompatParcelizer = setsubtitleconfigurations;
    }

    @Deprecated
    public buildSubtitle() {
        this.RemoteActionCompatParcelizer = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.onShuffleModeEnabledChanged
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public boolean write(setMimeType<Bitmap> setmimetype, File file, r8lambda_r106e6zya8q8i_eKUnQWRolPk r8lambda_r106e6zya8q8i_ekunqwrolpk) throws Throwable {
        OutputStream fileOutputStream;
        boolean z;
        Bitmap bitmapRemoteActionCompatParcelizer = setmimetype.RemoteActionCompatParcelizer();
        Bitmap.CompressFormat compressFormatRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(bitmapRemoteActionCompatParcelizer, r8lambda_r106e6zya8q8i_ekunqwrolpk);
        bitmapRemoteActionCompatParcelizer.getWidth();
        bitmapRemoteActionCompatParcelizer.getHeight();
        long jRemoteActionCompatParcelizer = createTimeline.RemoteActionCompatParcelizer();
        int iIntValue = ((Integer) r8lambda_r106e6zya8q8i_ekunqwrolpk.IconCompatParcelizer(IconCompatParcelizer)).intValue();
        OutputStream mediaItemExternalSyntheticLambda0 = null;
        try {
            fileOutputStream = new FileOutputStream(file);
        } catch (IOException unused) {
            fileOutputStream = mediaItemExternalSyntheticLambda0;
        } catch (Throwable th) {
            th = th;
            fileOutputStream = mediaItemExternalSyntheticLambda0;
        }
        try {
            mediaItemExternalSyntheticLambda0 = this.RemoteActionCompatParcelizer != null ? new MediaItemExternalSyntheticLambda0(fileOutputStream, this.RemoteActionCompatParcelizer) : fileOutputStream;
            bitmapRemoteActionCompatParcelizer.compress(compressFormatRemoteActionCompatParcelizer, iIntValue, mediaItemExternalSyntheticLambda0);
            mediaItemExternalSyntheticLambda0.close();
            try {
                mediaItemExternalSyntheticLambda0.close();
            } catch (IOException unused2) {
            }
            z = true;
        } catch (IOException unused3) {
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException unused4) {
                }
            }
            z = false;
        } catch (Throwable th2) {
            th = th2;
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException unused5) {
                }
            }
            throw th;
        }
        if (Log.isLoggable("BitmapEncoder", 2)) {
            Objects.toString(compressFormatRemoteActionCompatParcelizer);
            moveMediaSourceRange.RemoteActionCompatParcelizer(bitmapRemoteActionCompatParcelizer);
            createTimeline.AudioAttributesCompatParcelizer(jRemoteActionCompatParcelizer);
            Objects.toString(r8lambda_r106e6zya8q8i_ekunqwrolpk.IconCompatParcelizer(read));
            bitmapRemoteActionCompatParcelizer.hasAlpha();
        }
        return z;
    }

    private static Bitmap.CompressFormat RemoteActionCompatParcelizer(Bitmap bitmap, r8lambda_r106e6zya8q8i_eKUnQWRolPk r8lambda_r106e6zya8q8i_ekunqwrolpk) {
        Bitmap.CompressFormat compressFormat = (Bitmap.CompressFormat) r8lambda_r106e6zya8q8i_ekunqwrolpk.IconCompatParcelizer(read);
        if (compressFormat != null) {
            return compressFormat;
        }
        if (bitmap.hasAlpha()) {
            return Bitmap.CompressFormat.PNG;
        }
        return Bitmap.CompressFormat.JPEG;
    }

    @Override // kotlin.LoadControl
    public final onTimelineChanged RemoteActionCompatParcelizer(r8lambda_r106e6zya8q8i_eKUnQWRolPk r8lambda_r106e6zya8q8i_ekunqwrolpk) {
        return onTimelineChanged.TRANSFORMED;
    }
}
