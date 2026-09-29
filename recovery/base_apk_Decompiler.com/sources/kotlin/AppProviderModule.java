package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f"}, d2 = {"Lo/AppProviderModule;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "javaName", "Ljava/lang/String;", "IconCompatParcelizer", "()Ljava/lang/String;", "Companion", "TLS_1_3", "TLS_1_2", "TLS_1_1", "TLS_1_0", "SSL_3_0"}, k = 1, mv = {1, 8, 0}, xi = 48)
public enum AppProviderModule {
    TLS_1_3("TLSv1.3"),
    TLS_1_2("TLSv1.2"),
    TLS_1_1("TLSv1.1"),
    TLS_1_0("TLSv1"),
    SSL_3_0("SSLv3");


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String javaName;

    AppProviderModule(String str) {
        this.javaName = str;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final String getJavaName() {
        return this.javaName;
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/AppProviderModule$Companion;", "", "<init>", "()V", "", "p0", "Lo/AppProviderModule;", "AudioAttributesCompatParcelizer", "(Ljava/lang/String;)Lo/AppProviderModule;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getMagicModuleMeta
        public static AppProviderModule AudioAttributesCompatParcelizer(String p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            int iHashCode = p0.hashCode();
            if (iHashCode != 79201641) {
                if (iHashCode != 79923350) {
                    switch (iHashCode) {
                        case -503070503:
                            if (p0.equals("TLSv1.1")) {
                                return AppProviderModule.TLS_1_1;
                            }
                            break;
                        case -503070502:
                            if (p0.equals("TLSv1.2")) {
                                return AppProviderModule.TLS_1_2;
                            }
                            break;
                        case -503070501:
                            if (p0.equals("TLSv1.3")) {
                                return AppProviderModule.TLS_1_3;
                            }
                            break;
                    }
                } else if (p0.equals("TLSv1")) {
                    return AppProviderModule.TLS_1_0;
                }
            } else if (p0.equals("SSLv3")) {
                return AppProviderModule.SSL_3_0;
            }
            throw new IllegalArgumentException("Unexpected TLS version: ".concat(String.valueOf(p0)));
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
