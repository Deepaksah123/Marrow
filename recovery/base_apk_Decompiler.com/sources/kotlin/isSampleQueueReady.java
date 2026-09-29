package kotlin;

import android.app.Application;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/isSampleQueueReady;", "", "<init>", "()V", "AudioAttributesCompatParcelizer"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class isSampleQueueReady {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static volatile isSampleQueueReady IconCompatParcelizer;

    @getMagicModuleMeta
    public static final isSampleQueueReady RemoteActionCompatParcelizer(Application application) {
        return INSTANCE.AudioAttributesCompatParcelizer(application);
    }

    /* JADX INFO: renamed from: o.isSampleQueueReady$AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n"}, d2 = {"Lo/isSampleQueueReady$AudioAttributesCompatParcelizer;", "", "<init>", "()V", "Landroid/app/Application;", "p0", "Lo/isSampleQueueReady;", "AudioAttributesCompatParcelizer", "(Landroid/app/Application;)Lo/isSampleQueueReady;", "IconCompatParcelizer", "Lo/isSampleQueueReady;", "read"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getMagicModuleMeta
        public final isSampleQueueReady AudioAttributesCompatParcelizer(Application p0) {
            isSampleQueueReady issamplequeueready;
            toMagicModuleMetaRepoModel.write(p0, "");
            isSampleQueueReady issamplequeueready2 = isSampleQueueReady.IconCompatParcelizer;
            if (issamplequeueready2 != null) {
                return issamplequeueready2;
            }
            synchronized (this) {
                issamplequeueready = isSampleQueueReady.IconCompatParcelizer;
                if (issamplequeueready == null) {
                    Companion companion = isSampleQueueReady.INSTANCE;
                    issamplequeueready = new isSampleQueueReady();
                    isSampleQueueReady.IconCompatParcelizer = issamplequeueready;
                }
            }
            return issamplequeueready;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
