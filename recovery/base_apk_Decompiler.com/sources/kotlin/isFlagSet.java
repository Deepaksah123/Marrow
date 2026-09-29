package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\t\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bj\u0002\b\nj\u0002\b\u000b"}, d2 = {"Lo/isFlagSet;", "", "", "p0", "<init>", "(Ljava/lang/String;II)V", "IconCompatParcelizer", "I", "()I", "AudioAttributesCompatParcelizer", "write", "read"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class isFlagSet {
    private static final /* synthetic */ isFlagSet[] RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final int AudioAttributesCompatParcelizer;
    public static final isFlagSet write = new isFlagSet("FILTER_TYPE_QBANK", 0, 1);
    public static final isFlagSet read = new isFlagSet("FILTER_TYPE_VIDEO", 1, 2);

    private isFlagSet(String str, int i, int i2) {
        this.AudioAttributesCompatParcelizer = i2;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final int getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    static {
        isFlagSet[] isflagsetArrRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        RemoteActionCompatParcelizer = isflagsetArrRemoteActionCompatParcelizer;
        getMagicModuleTimeline.IconCompatParcelizer(isflagsetArrRemoteActionCompatParcelizer);
    }

    private static final /* synthetic */ isFlagSet[] RemoteActionCompatParcelizer() {
        return new isFlagSet[]{write, read};
    }

    public static isFlagSet valueOf(String str) {
        return (isFlagSet) Enum.valueOf(isFlagSet.class, str);
    }

    public static isFlagSet[] values() {
        return (isFlagSet[]) RemoteActionCompatParcelizer.clone();
    }
}
