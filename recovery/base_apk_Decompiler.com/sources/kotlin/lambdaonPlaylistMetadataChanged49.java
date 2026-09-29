package kotlin;

import android.os.Handler;
import com.facebook.GraphRequest;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.Map;
import kotlin.lambdaonPlaybackSuppressionReasonChanged37;

/* JADX INFO: loaded from: classes2.dex */
public final class lambdaonPlaylistMetadataChanged49 extends FilterOutputStream implements lambdaonShuffleModeEnabledChanged40 {
    private final Map<GraphRequest, lambdaonSeekForwardIncrementChanged46> AudioAttributesCompatParcelizer;
    private final long AudioAttributesImplApi21Parcelizer;
    private final lambdaonPlaybackSuppressionReasonChanged37 AudioAttributesImplApi26Parcelizer;
    private final long IconCompatParcelizer;
    private long RemoteActionCompatParcelizer;
    private long read;
    private lambdaonSeekForwardIncrementChanged46 write;

    public final long RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lambdaonPlaylistMetadataChanged49(OutputStream outputStream, lambdaonPlaybackSuppressionReasonChanged37 lambdaonplaybacksuppressionreasonchanged37, Map<GraphRequest, lambdaonSeekForwardIncrementChanged46> map, long j) {
        super(outputStream);
        toMagicModuleMetaRepoModel.write(outputStream, "");
        toMagicModuleMetaRepoModel.write(lambdaonplaybacksuppressionreasonchanged37, "");
        toMagicModuleMetaRepoModel.write(map, "");
        this.AudioAttributesImplApi26Parcelizer = lambdaonplaybacksuppressionreasonchanged37;
        this.AudioAttributesCompatParcelizer = map;
        this.IconCompatParcelizer = j;
        this.AudioAttributesImplApi21Parcelizer = lambdaonMediaMetadataChanged48.MediaDescriptionCompat();
    }

    public final long write() {
        return this.RemoteActionCompatParcelizer;
    }

    private final void AudioAttributesCompatParcelizer(long j) {
        lambdaonSeekForwardIncrementChanged46 lambdaonseekforwardincrementchanged46 = this.write;
        if (lambdaonseekforwardincrementchanged46 != null) {
            lambdaonseekforwardincrementchanged46.read(j);
        }
        long j2 = this.RemoteActionCompatParcelizer + j;
        this.RemoteActionCompatParcelizer = j2;
        if (j2 >= this.read + this.AudioAttributesImplApi21Parcelizer || j2 >= this.IconCompatParcelizer) {
            AudioAttributesCompatParcelizer();
        }
    }

    private final void AudioAttributesCompatParcelizer() {
        if (this.RemoteActionCompatParcelizer > this.read) {
            for (final lambdaonPlaybackSuppressionReasonChanged37.IconCompatParcelizer iconCompatParcelizer : this.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer()) {
                if (iconCompatParcelizer instanceof lambdaonPlaybackSuppressionReasonChanged37.read) {
                    Handler remoteActionCompatParcelizer = this.AudioAttributesImplApi26Parcelizer.getRemoteActionCompatParcelizer();
                    if (remoteActionCompatParcelizer != null) {
                        remoteActionCompatParcelizer.post(new Runnable() { // from class: o.lambdaonPlaylistMetadataChanged49.3
                            @Override // java.lang.Runnable
                            public final void run() {
                                if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
                                    return;
                                }
                                try {
                                    if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
                                        return;
                                    }
                                    try {
                                        lambdaonPlaybackSuppressionReasonChanged37 unused = lambdaonPlaylistMetadataChanged49.this.AudioAttributesImplApi26Parcelizer;
                                        lambdaonPlaylistMetadataChanged49.this.write();
                                        lambdaonPlaylistMetadataChanged49.this.RemoteActionCompatParcelizer();
                                    } catch (Throwable th) {
                                        getMinWindowSequenceNumber.read(th, this);
                                    }
                                } catch (Throwable th2) {
                                    getMinWindowSequenceNumber.read(th2, this);
                                }
                            }
                        });
                    }
                }
            }
            this.read = this.RemoteActionCompatParcelizer;
        }
    }

    @Override // kotlin.lambdaonShuffleModeEnabledChanged40
    public final void AudioAttributesCompatParcelizer(GraphRequest graphRequest) {
        this.write = graphRequest != null ? this.AudioAttributesCompatParcelizer.get(graphRequest) : null;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        toMagicModuleMetaRepoModel.write(bArr, "");
        ((FilterOutputStream) this).out.write(bArr);
        AudioAttributesCompatParcelizer(bArr.length);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        toMagicModuleMetaRepoModel.write(bArr, "");
        ((FilterOutputStream) this).out.write(bArr, i, i2);
        AudioAttributesCompatParcelizer(i2);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) throws IOException {
        ((FilterOutputStream) this).out.write(i);
        AudioAttributesCompatParcelizer(1L);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
        Iterator<lambdaonSeekForwardIncrementChanged46> it = this.AudioAttributesCompatParcelizer.values().iterator();
        while (it.hasNext()) {
            it.next().AudioAttributesCompatParcelizer();
        }
        AudioAttributesCompatParcelizer();
    }
}
