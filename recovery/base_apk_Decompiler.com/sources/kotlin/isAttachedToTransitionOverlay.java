package kotlin;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f"}, d2 = {"Lo/isAttachedToTransitionOverlay;", "", "", "Lo/getPosition;", "p0", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "AudioAttributesCompatParcelizer", "Ljava/util/List;", "()Ljava/util/List;", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class isAttachedToTransitionOverlay {
    private final List<getPosition> AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int RemoteActionCompatParcelizer = 8;
    private static final isAttachedToTransitionOverlay read = new isAttachedToTransitionOverlay(IntermediateLoginResponseBody.RemoteActionCompatParcelizer());

    /* JADX WARN: Multi-variable type inference failed */
    public isAttachedToTransitionOverlay(List<? extends getPosition> list) {
        this.AudioAttributesCompatParcelizer = list;
    }

    public final List<getPosition> AudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final String toString() {
        String strRemoteActionCompatParcelizer = ArrayBlockingQueueDeserializer.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, "\n\t", "[\n\t", "\n]", 0, null, null, 56, null);
        StringBuilder sb = new StringBuilder("TextContextMenuData(components=");
        sb.append(strRemoteActionCompatParcelizer);
        sb.append(')');
        return sb.toString();
    }

    /* JADX INFO: renamed from: o.isAttachedToTransitionOverlay$write, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\b\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007"}, d2 = {"Lo/isAttachedToTransitionOverlay$write;", "", "<init>", "()V", "Lo/isAttachedToTransitionOverlay;", "read", "Lo/isAttachedToTransitionOverlay;", "()Lo/isAttachedToTransitionOverlay;", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final isAttachedToTransitionOverlay read() {
            return isAttachedToTransitionOverlay.read;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
