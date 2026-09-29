package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lo/verifyPendingInstall;", "", "<init>", "(Ljava/lang/String;I)V", "AudioAttributesCompatParcelizer", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class verifyPendingInstall {
    public static final verifyPendingInstall AudioAttributesCompatParcelizer = new verifyPendingInstall("EXPONENTIAL", 0);
    public static final verifyPendingInstall RemoteActionCompatParcelizer = new verifyPendingInstall("LINEAR", 1);
    private static final /* synthetic */ verifyPendingInstall[] read;

    private verifyPendingInstall(String str, int i) {
    }

    static {
        verifyPendingInstall[] verifypendinginstallArrRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        read = verifypendinginstallArrRemoteActionCompatParcelizer;
        getMagicModuleTimeline.IconCompatParcelizer(verifypendinginstallArrRemoteActionCompatParcelizer);
    }

    private static final /* synthetic */ verifyPendingInstall[] RemoteActionCompatParcelizer() {
        return new verifyPendingInstall[]{AudioAttributesCompatParcelizer, RemoteActionCompatParcelizer};
    }

    public static verifyPendingInstall valueOf(String str) {
        return (verifyPendingInstall) Enum.valueOf(verifyPendingInstall.class, str);
    }

    public static verifyPendingInstall[] values() {
        return (verifyPendingInstall[]) read.clone();
    }
}
