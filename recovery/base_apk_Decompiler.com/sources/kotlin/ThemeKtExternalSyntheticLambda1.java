package kotlin;

import java.io.IOException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010"}, d2 = {"Lo/ThemeKtExternalSyntheticLambda1;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "protocol", "Ljava/lang/String;", "Companion", "HTTP_1_0", "HTTP_1_1", "SPDY_3", "HTTP_2", "H2_PRIOR_KNOWLEDGE", "QUIC"}, k = 1, mv = {1, 8, 0}, xi = 48)
public enum ThemeKtExternalSyntheticLambda1 {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String protocol;

    ThemeKtExternalSyntheticLambda1(String str) {
        this.protocol = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.protocol;
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/ThemeKtExternalSyntheticLambda1$Companion;", "", "<init>", "()V", "", "p0", "Lo/ThemeKtExternalSyntheticLambda1;", "read", "(Ljava/lang/String;)Lo/ThemeKtExternalSyntheticLambda1;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getMagicModuleMeta
        public static ThemeKtExternalSyntheticLambda1 read(String p0) throws IOException {
            toMagicModuleMetaRepoModel.write(p0, "");
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) p0, (Object) ThemeKtExternalSyntheticLambda1.HTTP_1_0.protocol)) {
                return ThemeKtExternalSyntheticLambda1.HTTP_1_0;
            }
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) p0, (Object) ThemeKtExternalSyntheticLambda1.HTTP_1_1.protocol)) {
                return ThemeKtExternalSyntheticLambda1.HTTP_1_1;
            }
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) p0, (Object) ThemeKtExternalSyntheticLambda1.H2_PRIOR_KNOWLEDGE.protocol)) {
                return ThemeKtExternalSyntheticLambda1.H2_PRIOR_KNOWLEDGE;
            }
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) p0, (Object) ThemeKtExternalSyntheticLambda1.HTTP_2.protocol)) {
                return ThemeKtExternalSyntheticLambda1.HTTP_2;
            }
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) p0, (Object) ThemeKtExternalSyntheticLambda1.SPDY_3.protocol)) {
                return ThemeKtExternalSyntheticLambda1.SPDY_3;
            }
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) p0, (Object) ThemeKtExternalSyntheticLambda1.QUIC.protocol)) {
                return ThemeKtExternalSyntheticLambda1.QUIC;
            }
            throw new IOException("Unexpected protocol: ".concat(String.valueOf(p0)));
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
