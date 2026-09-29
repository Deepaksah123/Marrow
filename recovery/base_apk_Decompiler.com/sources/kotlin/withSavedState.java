package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lo/withSavedState;", "", "<init>", "(Ljava/lang/String;I)V", "RemoteActionCompatParcelizer", "IconCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class withSavedState {
    private static final /* synthetic */ withSavedState[] write;
    public static final withSavedState RemoteActionCompatParcelizer = new withSavedState("STRONGEST", 0);
    public static final withSavedState IconCompatParcelizer = new withSavedState("WEAKEST", 1);

    static {
        withSavedState[] withsavedstateArrWrite = write();
        write = withsavedstateArrWrite;
        getMagicModuleTimeline.IconCompatParcelizer(withsavedstateArrWrite);
    }

    private withSavedState(String str, int i) {
    }

    private static final /* synthetic */ withSavedState[] write() {
        return new withSavedState[]{RemoteActionCompatParcelizer, IconCompatParcelizer};
    }

    public static withSavedState valueOf(String str) {
        return (withSavedState) Enum.valueOf(withSavedState.class, str);
    }

    public static withSavedState[] values() {
        return (withSavedState[]) write.clone();
    }
}
