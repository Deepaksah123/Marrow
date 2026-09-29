package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lo/zzhx;", "", "<init>", "(Ljava/lang/String;I)V", "RemoteActionCompatParcelizer", "write"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class zzhx {
    private static final /* synthetic */ zzhx[] read;
    public static final zzhx RemoteActionCompatParcelizer = new zzhx("NORMAL", 0);
    public static final zzhx write = new zzhx("GRID", 1);

    private zzhx(String str, int i) {
    }

    static {
        zzhx[] zzhxVarArrAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
        read = zzhxVarArrAudioAttributesCompatParcelizer;
        getMagicModuleTimeline.IconCompatParcelizer(zzhxVarArrAudioAttributesCompatParcelizer);
    }

    private static final /* synthetic */ zzhx[] AudioAttributesCompatParcelizer() {
        return new zzhx[]{RemoteActionCompatParcelizer, write};
    }

    public static zzhx valueOf(String str) {
        return (zzhx) Enum.valueOf(zzhx.class, str);
    }

    public static zzhx[] values() {
        return (zzhx[]) read.clone();
    }
}
