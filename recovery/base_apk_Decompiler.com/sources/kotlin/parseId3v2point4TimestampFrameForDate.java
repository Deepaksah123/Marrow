package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u000b\u001a\u00020\u00038\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u000b"}, d2 = {"Lo/parseId3v2point4TimestampFrameForDate;", "", "Lo/AsynchronousMediaCodecAdapterFactory;", "", "p0", "<init>", "(Ljava/lang/String;II)V", "MediaBrowserCompatItemReceiver", "I", "AudioAttributesCompatParcelizer", "()I", "IconCompatParcelizer", "MediaBrowserCompatCustomActionResultReceiver", "AudioAttributesImplApi21Parcelizer", "RemoteActionCompatParcelizer", "read", "write"}, k = 1, mv = {1, 7, 1}, xi = 48)
public enum parseId3v2point4TimestampFrameForDate implements AsynchronousMediaCodecAdapterFactory {
    COLLECTION_UNKNOWN(0),
    COLLECTION_SDK_NOT_INSTALLED(1),
    COLLECTION_ENABLED(2),
    COLLECTION_DISABLED(3),
    COLLECTION_DISABLED_REMOTE(4),
    COLLECTION_SAMPLED(5);


    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final int IconCompatParcelizer;

    parseId3v2point4TimestampFrameForDate(int i) {
        this.IconCompatParcelizer = i;
    }

    @Override // kotlin.AsynchronousMediaCodecAdapterFactory
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final int getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }
}
