package kotlin;

import kotlin.Metadata;
import kotlin._handleOddName;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\b\b\u0000\u0018\u0000 \u00112\u00020\u00012\u00020\u0002:\u0001\u0011B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\u0006R\u001a\u0010\n\u001a\u00020\t8\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR$\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00038\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\n\u0010\u0010"}, d2 = {"Lo/getDataDir;", "Lo/_handleOddName$IconCompatParcelizer;", "Lo/createForPropertyOverride;", "", "p0", "<init>", "(Z)V", "", "write", "", "read", "Ljava/lang/Object;", "MediaBrowserCompatItemReceiver", "()Ljava/lang/Object;", "RemoteActionCompatParcelizer", "Z", "()Z", "IconCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getDataDir extends _handleOddName.IconCompatParcelizer implements createForPropertyOverride {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private boolean IconCompatParcelizer;
    private final Object read = INSTANCE;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int AudioAttributesCompatParcelizer = 8;

    public getDataDir(boolean z) {
        this.IconCompatParcelizer = z;
    }

    @Override // kotlin.createForPropertyOverride
    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from getter */
    public final Object getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final boolean getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: o.getDataDir$IconCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/getDataDir$IconCompatParcelizer;", "", "<init>", "()V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public final void write(boolean p0) {
        this.IconCompatParcelizer = p0;
    }
}
