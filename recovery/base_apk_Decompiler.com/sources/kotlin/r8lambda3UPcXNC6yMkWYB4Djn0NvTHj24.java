package kotlin;

import android.graphics.Bitmap;
import kotlin.Metadata;
import kotlin.SimpleExoPlayer;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\"\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eJ\u0016\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e¨\u0006\u0010"}, d2 = {"Lcom/clevertap/android/sdk/network/DownloadedBitmapFactory;", "", "<init>", "()V", "nullBitmapWithStatus", "Lcom/clevertap/android/sdk/network/DownloadedBitmap;", "status", "Lcom/clevertap/android/sdk/network/DownloadedBitmap$Status;", "successBitmap", "bitmap", "Landroid/graphics/Bitmap;", "downloadTime", "", "data", "", "successBytes", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class r8lambda3UPcXNC6yMkWYB4Djn0NvTHj24 {
    public static final r8lambda3UPcXNC6yMkWYB4Djn0NvTHj24 RemoteActionCompatParcelizer = new r8lambda3UPcXNC6yMkWYB4Djn0NvTHj24();

    private r8lambda3UPcXNC6yMkWYB4Djn0NvTHj24() {
    }

    public static SimpleExoPlayer read(SimpleExoPlayer.write writeVar) {
        toMagicModuleMetaRepoModel.write(writeVar, "");
        return new SimpleExoPlayer(null, writeVar, -1L, null, 8, null);
    }

    public static SimpleExoPlayer RemoteActionCompatParcelizer(Bitmap bitmap, long j, byte[] bArr) {
        toMagicModuleMetaRepoModel.write(bitmap, "");
        return new SimpleExoPlayer(bitmap, SimpleExoPlayer.write.MediaBrowserCompatItemReceiver, j, bArr);
    }

    public static SimpleExoPlayer write(long j, byte[] bArr) {
        toMagicModuleMetaRepoModel.write(bArr, "");
        return new SimpleExoPlayer(null, SimpleExoPlayer.write.MediaBrowserCompatItemReceiver, j, bArr);
    }
}
