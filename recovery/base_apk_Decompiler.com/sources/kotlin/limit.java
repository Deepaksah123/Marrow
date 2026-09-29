package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000b"}, d2 = {"Lo/limit;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "RemoteActionCompatParcelizer", "Ljava/lang/String;", "write", "()Ljava/lang/String;", "AudioAttributesCompatParcelizer", "IconCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class limit {
    public static final limit AudioAttributesCompatParcelizer = new limit("SMS_OTP", 0, "sms");
    public static final limit IconCompatParcelizer = new limit("WHATSAPP_OTP", 1, "whatsapp");
    private static final /* synthetic */ limit[] read;
    private final String RemoteActionCompatParcelizer;

    private limit(String str, int i, String str2) {
        this.RemoteActionCompatParcelizer = str2;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final String getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    static {
        limit[] limitVarArr = read();
        read = limitVarArr;
        getMagicModuleTimeline.IconCompatParcelizer(limitVarArr);
    }

    private static final /* synthetic */ limit[] read() {
        return new limit[]{AudioAttributesCompatParcelizer, IconCompatParcelizer};
    }

    public static limit valueOf(String str) {
        return (limit) Enum.valueOf(limit.class, str);
    }

    public static limit[] values() {
        return (limit[]) read.clone();
    }
}
