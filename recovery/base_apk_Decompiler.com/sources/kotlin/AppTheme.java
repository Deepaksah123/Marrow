package kotlin;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u0000 \f2\u00020\u0001:\u0001\fJ\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lo/AppTheme;", "", "Lo/ThemeAlphaConstantsKt;", "p0", "", "Lo/MarrowVideoDownloadExceptionCompanion;", "read", "(Lo/ThemeAlphaConstantsKt;)Ljava/util/List;", "p1", "", "IconCompatParcelizer", "(Lo/ThemeAlphaConstantsKt;Ljava/util/List;)V", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface AppTheme {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final AppTheme NO_COOKIES = new AppTheme() { // from class: o.AppTheme$write$read
        @Override // kotlin.AppTheme
        public final List<MarrowVideoDownloadExceptionCompanion> read(ThemeAlphaConstantsKt themeAlphaConstantsKt) {
            toMagicModuleMetaRepoModel.write(themeAlphaConstantsKt, "");
            return IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }

        @Override // kotlin.AppTheme
        public final void IconCompatParcelizer(ThemeAlphaConstantsKt themeAlphaConstantsKt, List<MarrowVideoDownloadExceptionCompanion> list) {
            toMagicModuleMetaRepoModel.write(themeAlphaConstantsKt, "");
            toMagicModuleMetaRepoModel.write(list, "");
        }
    };

    void IconCompatParcelizer(ThemeAlphaConstantsKt p0, List<MarrowVideoDownloadExceptionCompanion> p1);

    List<MarrowVideoDownloadExceptionCompanion> read(ThemeAlphaConstantsKt p0);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0001"}, d2 = {"Lo/AppTheme$Companion;", "", "<init>", "()V", "Lo/AppTheme;", "NO_COOKIES", "Lo/AppTheme;", "read"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }
}
