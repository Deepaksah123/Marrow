package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t"}, d2 = {"Lo/DrmSessionEventListenerEventDispatcherExternalSyntheticLambda0;", "", "<init>", "()V", "write", "RemoteActionCompatParcelizer", "IconCompatParcelizer", "Lo/DrmSessionEventListenerEventDispatcherExternalSyntheticLambda0$write;", "Lo/DrmSessionEventListenerEventDispatcherExternalSyntheticLambda0$RemoteActionCompatParcelizer;", "Lo/DrmSessionEventListenerEventDispatcherExternalSyntheticLambda0$IconCompatParcelizer;"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class DrmSessionEventListenerEventDispatcherExternalSyntheticLambda0 {
    private DrmSessionEventListenerEventDispatcherExternalSyntheticLambda0() {
    }

    public /* synthetic */ DrmSessionEventListenerEventDispatcherExternalSyntheticLambda0(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/DrmSessionEventListenerEventDispatcherExternalSyntheticLambda0$RemoteActionCompatParcelizer;", "Lo/DrmSessionEventListenerEventDispatcherExternalSyntheticLambda0;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class RemoteActionCompatParcelizer extends DrmSessionEventListenerEventDispatcherExternalSyntheticLambda0 {
        public static final RemoteActionCompatParcelizer INSTANCE = new RemoteActionCompatParcelizer();

        private RemoteActionCompatParcelizer() {
            super(null);
        }
    }

    public static final class IconCompatParcelizer extends DrmSessionEventListenerEventDispatcherExternalSyntheticLambda0 {
        private final float read;

        public IconCompatParcelizer(float f) {
            super(null);
            this.read = f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof IconCompatParcelizer) && Float.compare(this.read, ((IconCompatParcelizer) obj).read) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.read);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Loading(progress=");
            sb.append(this.read);
            sb.append(')');
            return sb.toString();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/DrmSessionEventListenerEventDispatcherExternalSyntheticLambda0$write;", "Lo/DrmSessionEventListenerEventDispatcherExternalSyntheticLambda0;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class write extends DrmSessionEventListenerEventDispatcherExternalSyntheticLambda0 {
        public static final write INSTANCE = new write();

        private write() {
            super(null);
        }
    }
}
