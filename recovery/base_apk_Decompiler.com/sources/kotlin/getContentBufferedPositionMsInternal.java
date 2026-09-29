package kotlin;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.SimpleExoPlayer;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0011\u0010\r\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00058\u0007¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\r\u0010\u0014"}, d2 = {"Lo/getContentBufferedPositionMsInternal;", "Lo/getCurrentPeriodIndexInternal;", "", "p0", "p1", "Lo/RendererWakeupListener;", "p2", "<init>", "(ZZLo/RendererWakeupListener;)V", "Ljava/io/InputStream;", "Ljava/net/HttpURLConnection;", "", "Lo/SimpleExoPlayer;", "read", "(Ljava/io/InputStream;Ljava/net/HttpURLConnection;J)Lo/SimpleExoPlayer;", "IconCompatParcelizer", "Z", "AudioAttributesCompatParcelizer", "RemoteActionCompatParcelizer", "Lo/RendererWakeupListener;", "()Lo/RendererWakeupListener;", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class getContentBufferedPositionMsInternal implements getCurrentPeriodIndexInternal {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final boolean RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final boolean read;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final RendererWakeupListener write;

    private getContentBufferedPositionMsInternal(boolean z, boolean z2, RendererWakeupListener rendererWakeupListener) {
        this.read = z;
        this.RemoteActionCompatParcelizer = z2;
        this.write = rendererWakeupListener;
    }

    public /* synthetic */ getContentBufferedPositionMsInternal(boolean z, boolean z2, RendererWakeupListener rendererWakeupListener, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? true : z2, (i & 4) != 0 ? null : rendererWakeupListener);
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final RendererWakeupListener getWrite() {
        return this.write;
    }

    @Override // kotlin.getCurrentPeriodIndexInternal
    public SimpleExoPlayer read(InputStream p0, HttpURLConnection p1, long p2) throws IOException {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        RendererWakeupListener rendererWakeupListener = this.write;
        if (rendererWakeupListener != null) {
            rendererWakeupListener.read();
        }
        byte[] bArr = new byte[16384];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 0;
        while (true) {
            int i2 = p0.read(bArr);
            if (i2 == -1) {
                break;
            }
            i += i2;
            byteArrayOutputStream.write(bArr, 0, i2);
            RendererWakeupListener rendererWakeupListener2 = this.write;
            if (rendererWakeupListener2 != null) {
                rendererWakeupListener2.read();
            }
        }
        RendererWakeupListener rendererWakeupListener3 = this.write;
        if (rendererWakeupListener3 != null) {
            rendererWakeupListener3.read();
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        int contentLength = p1.getContentLength();
        if (contentLength != -1 && contentLength != i) {
            if (this.write != null) {
                Objects.toString(p1.getURL());
                RendererWakeupListener.handleMediaPlayPauseIfPendingOnHandler();
            }
            r8lambda3UPcXNC6yMkWYB4Djn0NvTHj24 r8lambda3upcxnc6ymkwyb4djn0nvthj24 = r8lambda3UPcXNC6yMkWYB4Djn0NvTHj24.RemoteActionCompatParcelizer;
            return r8lambda3UPcXNC6yMkWYB4Djn0NvTHj24.read(SimpleExoPlayer.write.AudioAttributesCompatParcelizer);
        }
        if (this.RemoteActionCompatParcelizer) {
            Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
            if (bitmapDecodeByteArray != null) {
                r8lambda3UPcXNC6yMkWYB4Djn0NvTHj24 r8lambda3upcxnc6ymkwyb4djn0nvthj242 = r8lambda3UPcXNC6yMkWYB4Djn0NvTHj24.RemoteActionCompatParcelizer;
                long jAudioAttributesCompatParcelizer = RendererCapabilitiesListener.AudioAttributesCompatParcelizer();
                if (!this.read) {
                    byteArray = null;
                }
                return r8lambda3UPcXNC6yMkWYB4Djn0NvTHj24.RemoteActionCompatParcelizer(bitmapDecodeByteArray, jAudioAttributesCompatParcelizer - p2, byteArray);
            }
            r8lambda3UPcXNC6yMkWYB4Djn0NvTHj24 r8lambda3upcxnc6ymkwyb4djn0nvthj243 = r8lambda3UPcXNC6yMkWYB4Djn0NvTHj24.RemoteActionCompatParcelizer;
            return r8lambda3UPcXNC6yMkWYB4Djn0NvTHj24.read(SimpleExoPlayer.write.AudioAttributesCompatParcelizer);
        }
        r8lambda3UPcXNC6yMkWYB4Djn0NvTHj24 r8lambda3upcxnc6ymkwyb4djn0nvthj244 = r8lambda3UPcXNC6yMkWYB4Djn0NvTHj24.RemoteActionCompatParcelizer;
        long jAudioAttributesCompatParcelizer2 = RendererCapabilitiesListener.AudioAttributesCompatParcelizer();
        toMagicModuleMetaRepoModel.write(byteArray);
        return r8lambda3UPcXNC6yMkWYB4Djn0NvTHj24.write(jAudioAttributesCompatParcelizer2 - p2, byteArray);
    }

    public getContentBufferedPositionMsInternal() {
        this(false, false, null, 7, null);
    }
}
