package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\n\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\f"}, d2 = {"Lo/zzeb;", "", "", "p0", "<init>", "(Ljava/lang/String;II)V", "IconCompatParcelizer", "I", "AudioAttributesCompatParcelizer", "()I", "RemoteActionCompatParcelizer", "read", "write"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class zzeb {
    private static final /* synthetic */ zzeb[] RemoteActionCompatParcelizer;
    private static zzeb read = new zzeb("FILTER_TYPE_QBANK", 0, 1);
    public static final zzeb write = new zzeb("FILTER_TYPE_VIDEO", 1, 2);

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final int RemoteActionCompatParcelizer;

    private zzeb(String str, int i, int i2) {
        this.RemoteActionCompatParcelizer = i2;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final int getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    static {
        zzeb[] zzebVarArr = read();
        RemoteActionCompatParcelizer = zzebVarArr;
        getMagicModuleTimeline.IconCompatParcelizer(zzebVarArr);
    }

    private static final /* synthetic */ zzeb[] read() {
        return new zzeb[]{read, write};
    }

    public static zzeb valueOf(String str) {
        return (zzeb) Enum.valueOf(zzeb.class, str);
    }

    public static zzeb[] values() {
        return (zzeb[]) RemoteActionCompatParcelizer.clone();
    }
}
