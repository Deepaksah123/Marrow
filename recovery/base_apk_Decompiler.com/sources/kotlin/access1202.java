package kotlin;

import coil.size.Size;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\b0\u0018\u0000 \t2\u00020\u0001:\u0001\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b\t\u0010\n\u0082\u0001\u0001\u000b"}, d2 = {"Lo/access1202;", "", "<init>", "()V", "Lcoil/size/Size;", "p0", "Lo/setSurfaceTextureInternal;", "p1", "", "RemoteActionCompatParcelizer", "(Lcoil/size/Size;)Z", "Lo/access1502;"}, k = 1, mv = {1, 5, 1}, xi = 48)
public abstract class access1202 {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public abstract boolean RemoteActionCompatParcelizer(Size size);

    private access1202() {
    }

    /* JADX INFO: renamed from: o.access1202$RemoteActionCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo/access1202$RemoteActionCompatParcelizer;", "", "<init>", "()V", "Lo/access1202;", "write", "()Lo/access1202;"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static access1202 write() {
            boolean z = access1002.RemoteActionCompatParcelizer;
            return new access1502(true);
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public /* synthetic */ access1202(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this();
    }
}
