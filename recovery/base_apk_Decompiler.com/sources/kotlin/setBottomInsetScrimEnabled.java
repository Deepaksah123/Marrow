package kotlin;

import com.marrow.designsystem.theme.AppTheme;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t"}, d2 = {"Lo/setBottomInsetScrimEnabled;", "", "<init>", "()V", "read", "IconCompatParcelizer", "RemoteActionCompatParcelizer", "Lo/setBottomInsetScrimEnabled$IconCompatParcelizer;", "Lo/setBottomInsetScrimEnabled$read;", "Lo/setBottomInsetScrimEnabled$RemoteActionCompatParcelizer;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class setBottomInsetScrimEnabled {

    public static final class read extends setBottomInsetScrimEnabled {
        private final AppTheme RemoteActionCompatParcelizer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public read(AppTheme appTheme) {
            super(null);
            toMagicModuleMetaRepoModel.write(appTheme, "");
            this.RemoteActionCompatParcelizer = appTheme;
        }

        public final AppTheme AudioAttributesCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }
    }

    private setBottomInsetScrimEnabled() {
    }

    public static final class IconCompatParcelizer extends setBottomInsetScrimEnabled {
        private final boolean read;

        public IconCompatParcelizer(boolean z) {
            super(null);
            this.read = z;
        }

        public final boolean write() {
            return this.read;
        }
    }

    public /* synthetic */ setBottomInsetScrimEnabled(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/setBottomInsetScrimEnabled$RemoteActionCompatParcelizer;", "Lo/setBottomInsetScrimEnabled;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RemoteActionCompatParcelizer extends setBottomInsetScrimEnabled {
        public static final RemoteActionCompatParcelizer INSTANCE = new RemoteActionCompatParcelizer();

        private RemoteActionCompatParcelizer() {
            super(null);
        }
    }
}
