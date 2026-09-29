package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\t\u001a\u00020\u00038\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\t"}, d2 = {"Lo/SpliceInfoDecoder;", "", "Lo/AsynchronousMediaCodecAdapterFactory;", "", "p0", "<init>", "(Ljava/lang/String;II)V", "MediaBrowserCompatItemReceiver", "I", "AudioAttributesCompatParcelizer", "()I", "RemoteActionCompatParcelizer", "write", "IconCompatParcelizer"}, k = 1, mv = {1, 7, 1}, xi = 48)
public enum SpliceInfoDecoder implements AsynchronousMediaCodecAdapterFactory {
    LOG_ENVIRONMENT_UNKNOWN(0),
    LOG_ENVIRONMENT_AUTOPUSH(1),
    LOG_ENVIRONMENT_STAGING(2),
    LOG_ENVIRONMENT_PROD(3);


    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final int AudioAttributesCompatParcelizer;

    SpliceInfoDecoder(int i) {
        this.AudioAttributesCompatParcelizer = i;
    }

    @Override // kotlin.AsynchronousMediaCodecAdapterFactory
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final int getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }
}
