package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lo/setMaximumRequestedThroughputKbps;", "", "<init>", "()V", "", "p0", "read", "(Ljava/lang/String;)Ljava/lang/String;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class setMaximumRequestedThroughputKbps {
    public static final setMaximumRequestedThroughputKbps INSTANCE = new setMaximumRequestedThroughputKbps();

    private setMaximumRequestedThroughputKbps() {
    }

    public static String read(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        String str = TestGroupLSModel.write((CharSequence) p0, (CharSequence) "?", false) ? "&" : "?";
        StringBuilder sb = new StringBuilder();
        sb.append(p0);
        sb.append(str);
        sb.append("tokenize=true");
        return sb.toString();
    }
}
