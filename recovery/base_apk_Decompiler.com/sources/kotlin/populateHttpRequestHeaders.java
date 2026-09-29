package kotlin;

import android.os.Build;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lo/populateHttpRequestHeaders;", "", "<init>", "()V", "", "p0", "p1", "", "p2", "AudioAttributesCompatParcelizer", "(Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;", "IconCompatParcelizer", "Ljava/lang/String;", "write"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class populateHttpRequestHeaders {
    public static final populateHttpRequestHeaders INSTANCE = new populateHttpRequestHeaders();

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private static final String write;

    private populateHttpRequestHeaders() {
    }

    static {
        String str = Build.VERSION.RELEASE;
        String strWrite = str != null ? TestGroupLSModel.write(str, ".", str) : null;
        if (strWrite == null) {
            strWrite = "";
        }
        String str2 = Build.MANUFACTURER;
        String str3 = Build.MODEL;
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(" ");
        sb.append(str3);
        sb.append(" ");
        sb.append(strWrite);
        write = sb.toString();
    }

    @getMagicModuleMeta
    public static final String AudioAttributesCompatParcelizer(String p0, String p1, boolean p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        StringBuilder sb = new StringBuilder("\n\n\n\n------------------------------------------------\n");
        sb.append("Device ID: ".concat(String.valueOf(p0)));
        sb.append('\n');
        sb.append("Device Info: ".concat(String.valueOf(write)));
        sb.append("\nApp Info: 12.0.0 (496)\n");
        sb.append("User Info: ".concat(String.valueOf(p1)));
        sb.append('\n');
        sb.append("Plan: ".concat(p2 ? "Pro User" : "Free User"));
        sb.append('\n');
        return sb.toString();
    }
}
