package kotlin;

import java.io.IOException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u0000 \t2\u00020\u0001:\u0001\tJ#\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/getLevel;", "", "Lo/ActivityPresenterModule;", "p0", "Lo/TypeKt;", "p1", "Lo/ThemeKtExternalSyntheticLambda0;", "RemoteActionCompatParcelizer", "(Lo/ActivityPresenterModule;Lo/TypeKt;)Lo/ThemeKtExternalSyntheticLambda0;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface getLevel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final getLevel NONE = new getLevel() { // from class: o.getLevel$IconCompatParcelizer$write
        @Override // kotlin.getLevel
        public final ThemeKtExternalSyntheticLambda0 RemoteActionCompatParcelizer(ActivityPresenterModule activityPresenterModule, C0156TypeKt c0156TypeKt) {
            toMagicModuleMetaRepoModel.write(c0156TypeKt, "");
            return null;
        }
    };
    public static final getLevel JAVA_NET_AUTHENTICATOR = new DataModule(null, 1, null);

    ThemeKtExternalSyntheticLambda0 RemoteActionCompatParcelizer(ActivityPresenterModule p0, C0156TypeKt p1) throws IOException;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0001R\u0014\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\u0001"}, d2 = {"Lo/getLevel$Companion;", "", "<init>", "()V", "Lo/getLevel;", "JAVA_NET_AUTHENTICATOR", "Lo/getLevel;", "NONE", "write"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }
}
