package kotlin;

import java.net.Proxy;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lo/setMPresenter;", "", "<init>", "()V", "Lo/ThemeKtExternalSyntheticLambda0;", "p0", "Ljava/net/Proxy$Type;", "p1", "", "write", "(Lo/ThemeKtExternalSyntheticLambda0;Ljava/net/Proxy$Type;)Ljava/lang/String;", "", "IconCompatParcelizer", "(Lo/ThemeKtExternalSyntheticLambda0;Ljava/net/Proxy$Type;)Z", "Lo/ThemeAlphaConstantsKt;", "RemoteActionCompatParcelizer", "(Lo/ThemeAlphaConstantsKt;)Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class setMPresenter {
    public static final setMPresenter INSTANCE = new setMPresenter();

    private setMPresenter() {
    }

    public static String write(ThemeKtExternalSyntheticLambda0 p0, Proxy.Type p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        StringBuilder sb = new StringBuilder();
        sb.append(p0.getMethod());
        sb.append(' ');
        if (IconCompatParcelizer(p0, p1)) {
            sb.append(p0.getUrl());
        } else {
            sb.append(RemoteActionCompatParcelizer(p0.getUrl()));
        }
        sb.append(" HTTP/1.1");
        String string = sb.toString();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        return string;
    }

    private static boolean IconCompatParcelizer(ThemeKtExternalSyntheticLambda0 p0, Proxy.Type p1) {
        return !p0.IconCompatParcelizer() && p1 == Proxy.Type.HTTP;
    }

    public static String RemoteActionCompatParcelizer(ThemeAlphaConstantsKt p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        String strRemoteActionCompatParcelizer = p0.RemoteActionCompatParcelizer();
        String strWrite = p0.write();
        if (strWrite == null) {
            return strRemoteActionCompatParcelizer;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(strRemoteActionCompatParcelizer);
        sb.append('?');
        sb.append(strWrite);
        return sb.toString();
    }
}
