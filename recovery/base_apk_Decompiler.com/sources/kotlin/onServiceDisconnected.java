package kotlin;

import kotlin.Metadata;
import kotlin.getChildIndexByChildUid;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00062\u00020\u0001:\u0002\u0007\u0006B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo/onServiceDisconnected;", "Lo/getChildIndexByChildUid;", "Lo/onServiceDisconnected$RemoteActionCompatParcelizer;", "p0", "<init>", "(Lo/onServiceDisconnected$RemoteActionCompatParcelizer;)V", "write", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class onServiceDisconnected extends getChildIndexByChildUid {

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public onServiceDisconnected(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        super(remoteActionCompatParcelizer.RemoteActionCompatParcelizer(), remoteActionCompatParcelizer.MediaBrowserCompatItemReceiver(), remoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer());
        toMagicModuleMetaRepoModel.write(remoteActionCompatParcelizer, "");
    }

    @getMagicModuleMeta
    public static final onServiceDisconnected write(Class<? extends j> cls) {
        return Companion.AudioAttributesCompatParcelizer(cls);
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class RemoteActionCompatParcelizer extends getChildIndexByChildUid.RemoteActionCompatParcelizer<RemoteActionCompatParcelizer, onServiceDisconnected> {
        /* JADX INFO: Access modifiers changed from: private */
        @Override // o.getChildIndexByChildUid.RemoteActionCompatParcelizer
        /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: merged with bridge method [inline-methods] */
        public RemoteActionCompatParcelizer read() {
            return this;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RemoteActionCompatParcelizer(Class<? extends j> cls) {
            super(cls);
            toMagicModuleMetaRepoModel.write(cls, "");
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // o.getChildIndexByChildUid.RemoteActionCompatParcelizer
        /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: merged with bridge method [inline-methods] */
        public onServiceDisconnected IconCompatParcelizer() {
            if (AudioAttributesCompatParcelizer() && MediaBrowserCompatItemReceiver().AudioAttributesCompatParcelizer.getRemoteActionCompatParcelizer()) {
                throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job".toString());
            }
            return new onServiceDisconnected(this);
        }
    }

    /* JADX INFO: renamed from: o.onServiceDisconnected$write, reason: from kotlin metadata */
    /* JADX INFO: loaded from: classes2.dex */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lo/onServiceDisconnected$write;", "", "<init>", "()V", "Ljava/lang/Class;", "Lo/j;", "p0", "Lo/onServiceDisconnected;", "AudioAttributesCompatParcelizer", "(Ljava/lang/Class;)Lo/onServiceDisconnected;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getMagicModuleMeta
        public static onServiceDisconnected AudioAttributesCompatParcelizer(Class<? extends j> p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return new RemoteActionCompatParcelizer(p0).write();
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
