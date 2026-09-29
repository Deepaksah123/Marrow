package kotlin;

import java.io.IOException;
import java.net.ProtocolException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0011\u0010\u000e\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0011\u0010\u0011\u001a\u00020\u00068\u0006¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0011\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lo/getMPresenter;", "", "Lo/ThemeKtExternalSyntheticLambda1;", "p0", "", "p1", "", "p2", "<init>", "(Lo/ThemeKtExternalSyntheticLambda1;ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "AudioAttributesCompatParcelizer", "I", "IconCompatParcelizer", "read", "Ljava/lang/String;", "RemoteActionCompatParcelizer", "Lo/ThemeKtExternalSyntheticLambda1;"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class getMPresenter {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    public final int IconCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public final ThemeKtExternalSyntheticLambda1 read;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public final String RemoteActionCompatParcelizer;

    public getMPresenter(ThemeKtExternalSyntheticLambda1 themeKtExternalSyntheticLambda1, int i, String str) {
        toMagicModuleMetaRepoModel.write(themeKtExternalSyntheticLambda1, "");
        toMagicModuleMetaRepoModel.write(str, "");
        this.read = themeKtExternalSyntheticLambda1;
        this.IconCompatParcelizer = i;
        this.RemoteActionCompatParcelizer = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.read == ThemeKtExternalSyntheticLambda1.HTTP_1_0) {
            sb.append("HTTP/1.0");
        } else {
            sb.append("HTTP/1.1");
        }
        sb.append(' ');
        sb.append(this.IconCompatParcelizer);
        sb.append(' ');
        sb.append(this.RemoteActionCompatParcelizer);
        String string = sb.toString();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        return string;
    }

    /* JADX INFO: renamed from: o.getMPresenter$IconCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/getMPresenter$IconCompatParcelizer;", "", "<init>", "()V", "", "p0", "Lo/getMPresenter;", "AudioAttributesCompatParcelizer", "(Ljava/lang/String;)Lo/getMPresenter;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static getMPresenter AudioAttributesCompatParcelizer(String p0) throws IOException {
            ThemeKtExternalSyntheticLambda1 themeKtExternalSyntheticLambda1;
            int i;
            String str = "";
            toMagicModuleMetaRepoModel.write(p0, "");
            if (TestGroupLSModel.MediaBrowserCompatCustomActionResultReceiver(p0, "HTTP/1.")) {
                i = 9;
                if (p0.length() < 9 || p0.charAt(8) != ' ') {
                    throw new ProtocolException("Unexpected status line: ".concat(String.valueOf(p0)));
                }
                int iCharAt = p0.charAt(7) - '0';
                if (iCharAt == 0) {
                    themeKtExternalSyntheticLambda1 = ThemeKtExternalSyntheticLambda1.HTTP_1_0;
                } else if (iCharAt == 1) {
                    themeKtExternalSyntheticLambda1 = ThemeKtExternalSyntheticLambda1.HTTP_1_1;
                } else {
                    throw new ProtocolException("Unexpected status line: ".concat(String.valueOf(p0)));
                }
            } else if (TestGroupLSModel.MediaBrowserCompatCustomActionResultReceiver(p0, "ICY ")) {
                themeKtExternalSyntheticLambda1 = ThemeKtExternalSyntheticLambda1.HTTP_1_0;
                i = 4;
            } else {
                throw new ProtocolException("Unexpected status line: ".concat(String.valueOf(p0)));
            }
            int i2 = i + 3;
            if (p0.length() < i2) {
                throw new ProtocolException("Unexpected status line: ".concat(String.valueOf(p0)));
            }
            try {
                String strSubstring = p0.substring(i, i2);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strSubstring, "");
                int i3 = Integer.parseInt(strSubstring);
                if (p0.length() > i2) {
                    if (p0.charAt(i2) != ' ') {
                        throw new ProtocolException("Unexpected status line: ".concat(String.valueOf(p0)));
                    }
                    String strSubstring2 = p0.substring(i + 4);
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strSubstring2, "");
                    str = strSubstring2;
                }
                return new getMPresenter(themeKtExternalSyntheticLambda1, i3, str);
            } catch (NumberFormatException unused) {
                throw new ProtocolException("Unexpected status line: ".concat(String.valueOf(p0)));
            }
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
