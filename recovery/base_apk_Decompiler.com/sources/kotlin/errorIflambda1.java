package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lo/errorIflambda1;", "", "<init>", "(Ljava/lang/String;I)V", "write", "IconCompatParcelizer", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class errorIflambda1 {
    private static final /* synthetic */ errorIflambda1[] AudioAttributesCompatParcelizer;
    public static final errorIflambda1 write = new errorIflambda1("VIDEOS_ONLY", 0);
    public static final errorIflambda1 IconCompatParcelizer = new errorIflambda1("ACTIVE_RECALL_ONLY", 1);
    public static final errorIflambda1 RemoteActionCompatParcelizer = new errorIflambda1("BOTH", 2);

    static {
        errorIflambda1[] erroriflambda1ArrRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        AudioAttributesCompatParcelizer = erroriflambda1ArrRemoteActionCompatParcelizer;
        getMagicModuleTimeline.IconCompatParcelizer(erroriflambda1ArrRemoteActionCompatParcelizer);
    }

    private errorIflambda1(String str, int i) {
    }

    private static final /* synthetic */ errorIflambda1[] RemoteActionCompatParcelizer() {
        return new errorIflambda1[]{write, IconCompatParcelizer, RemoteActionCompatParcelizer};
    }

    public static errorIflambda1 valueOf(String str) {
        return (errorIflambda1) Enum.valueOf(errorIflambda1.class, str);
    }

    public static errorIflambda1[] values() {
        return (errorIflambda1[]) AudioAttributesCompatParcelizer.clone();
    }
}
