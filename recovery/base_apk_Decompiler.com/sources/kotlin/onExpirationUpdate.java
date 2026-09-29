package kotlin;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes5.dex */
public final class onExpirationUpdate implements FrameworkMediaDrmExternalSyntheticLambda3<Executor> {
    @Override // kotlin.setDescriptionList
    public final /* synthetic */ Object get() {
        return IconCompatParcelizer();
    }

    private static Executor IconCompatParcelizer() {
        return write();
    }

    public static onExpirationUpdate AudioAttributesCompatParcelizer() {
        return RemoteActionCompatParcelizer.RemoteActionCompatParcelizer;
    }

    private static Executor write() {
        return (Executor) executePost.IconCompatParcelizer(ExoMediaDrmOnExpirationUpdateListener.read(), "Cannot return null from a non-@Nullable @Provides method");
    }

    static final class RemoteActionCompatParcelizer {
        private static final onExpirationUpdate RemoteActionCompatParcelizer = new onExpirationUpdate();
    }
}
