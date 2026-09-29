package kotlin;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.zip.GZIPInputStream;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lo/getCurrentMediaItemIndexInternal;", "Lo/getContentBufferedPositionMsInternal;", "", "p0", "Lo/RendererWakeupListener;", "p1", "<init>", "(ZLo/RendererWakeupListener;)V", "Ljava/io/InputStream;", "Ljava/net/HttpURLConnection;", "", "p2", "Lo/SimpleExoPlayer;", "read", "(Ljava/io/InputStream;Ljava/net/HttpURLConnection;J)Lo/SimpleExoPlayer;", "Ljava/io/ByteArrayOutputStream;", "AudioAttributesCompatParcelizer", "(Ljava/io/ByteArrayOutputStream;J)Lo/SimpleExoPlayer;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getCurrentMediaItemIndexInternal extends getContentBufferedPositionMsInternal {
    public /* synthetic */ getCurrentMediaItemIndexInternal(boolean z, RendererWakeupListener rendererWakeupListener, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : rendererWakeupListener);
    }

    private getCurrentMediaItemIndexInternal(boolean z, RendererWakeupListener rendererWakeupListener) {
        super(z, false, rendererWakeupListener, 2, null);
    }

    @Override // kotlin.getContentBufferedPositionMsInternal, kotlin.getCurrentPeriodIndexInternal
    public final SimpleExoPlayer read(InputStream p0, HttpURLConnection p1, long p2) throws IOException {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        RendererWakeupListener.MediaMetadataCompat();
        String contentEncoding = p1.getContentEncoding();
        if (contentEncoding != null && TestGroupLSModel.write((CharSequence) contentEncoding, (CharSequence) "gzip", false)) {
            GZIPInputStream gZIPInputStream = new GZIPInputStream(p0);
            byte[] bArr = new byte[16384];
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                int i = gZIPInputStream.read(bArr);
                if (i == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, i);
            }
            RendererWakeupListener write = getWrite();
            if (write != null) {
                byteArrayOutputStream.size();
                write.read();
            }
            return AudioAttributesCompatParcelizer(byteArrayOutputStream, p2);
        }
        return super.read(p0, p1, p2);
    }

    private static SimpleExoPlayer AudioAttributesCompatParcelizer(ByteArrayOutputStream p0, long p1) {
        byte[] byteArray = p0.toByteArray();
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
        r8lambda3UPcXNC6yMkWYB4Djn0NvTHj24 r8lambda3upcxnc6ymkwyb4djn0nvthj24 = r8lambda3UPcXNC6yMkWYB4Djn0NvTHj24.RemoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.write(bitmapDecodeByteArray);
        return r8lambda3UPcXNC6yMkWYB4Djn0NvTHj24.RemoteActionCompatParcelizer(bitmapDecodeByteArray, RendererCapabilitiesListener.AudioAttributesCompatParcelizer() - p1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public getCurrentMediaItemIndexInternal() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }
}
