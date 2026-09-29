package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\b\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000b"}, d2 = {"Lo/withAdditionalHeaders;", "", "", "p0", "<init>", "(Ljava/lang/String;II)V", "AudioAttributesCompatParcelizer", "I", "RemoteActionCompatParcelizer", "()I", "write", "IconCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class withAdditionalHeaders {
    private static final /* synthetic */ withAdditionalHeaders[] read;

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final int RemoteActionCompatParcelizer;
    public static final withAdditionalHeaders write = new withAdditionalHeaders("BOOLEAN_FLAG_IS_COMING_SOON", 0, 1);
    public static final withAdditionalHeaders IconCompatParcelizer = new withAdditionalHeaders("BOOLEAN_FLAG_HAS_VIDEO", 1, 2);

    private withAdditionalHeaders(String str, int i, int i2) {
        this.RemoteActionCompatParcelizer = i2;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final int getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    static {
        withAdditionalHeaders[] withadditionalheadersArrWrite = write();
        read = withadditionalheadersArrWrite;
        getMagicModuleTimeline.IconCompatParcelizer(withadditionalheadersArrWrite);
    }

    private static final /* synthetic */ withAdditionalHeaders[] write() {
        return new withAdditionalHeaders[]{write, IconCompatParcelizer};
    }

    public static withAdditionalHeaders valueOf(String str) {
        return (withAdditionalHeaders) Enum.valueOf(withAdditionalHeaders.class, str);
    }

    public static withAdditionalHeaders[] values() {
        return (withAdditionalHeaders[]) read.clone();
    }
}
