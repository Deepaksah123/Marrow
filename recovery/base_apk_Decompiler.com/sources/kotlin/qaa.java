package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lo/qaa;", "", "<init>", "(Ljava/lang/String;I)V", "write", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class qaa {
    private static final /* synthetic */ qaa[] RemoteActionCompatParcelizer;
    public static final qaa write = new qaa("RUN_AS_NON_EXPEDITED_WORK_REQUEST", 0);
    public static final qaa AudioAttributesCompatParcelizer = new qaa("DROP_WORK_REQUEST", 1);

    private qaa(String str, int i) {
    }

    static {
        qaa[] qaaVarArrWrite = write();
        RemoteActionCompatParcelizer = qaaVarArrWrite;
        getMagicModuleTimeline.IconCompatParcelizer(qaaVarArrWrite);
    }

    private static final /* synthetic */ qaa[] write() {
        return new qaa[]{write, AudioAttributesCompatParcelizer};
    }

    public static qaa valueOf(String str) {
        return (qaa) Enum.valueOf(qaa.class, str);
    }

    public static qaa[] values() {
        return (qaa[]) RemoteActionCompatParcelizer.clone();
    }
}
