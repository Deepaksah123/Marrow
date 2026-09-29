package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0013B\u0013\b\u0000\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eR+\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028G@GX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0011\u0010\u0005"}, d2 = {"Lo/setRound;", "", "Lo/setRound$AudioAttributesCompatParcelizer;", "p0", "<init>", "(Lo/setRound$AudioAttributesCompatParcelizer;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "equals", "(Ljava/lang/Object;)Z", "write", "Lo/InputAccessor;", "IconCompatParcelizer", "()Lo/setRound$AudioAttributesCompatParcelizer;", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class setRound {

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final InputAccessor AudioAttributesCompatParcelizer;

    public setRound(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        this.AudioAttributesCompatParcelizer = available.RemoteActionCompatParcelizer$default(audioAttributesCompatParcelizer, null, 2, null);
    }

    public /* synthetic */ setRound(AudioAttributesCompatParcelizer.IconCompatParcelizer iconCompatParcelizer, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? AudioAttributesCompatParcelizer.IconCompatParcelizer.INSTANCE : iconCompatParcelizer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final AudioAttributesCompatParcelizer IconCompatParcelizer() {
        return (AudioAttributesCompatParcelizer) this.AudioAttributesCompatParcelizer.read();
    }

    public final void IconCompatParcelizer(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        this.AudioAttributesCompatParcelizer.write(audioAttributesCompatParcelizer);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContextMenuState(status=");
        sb.append(IconCompatParcelizer());
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        return IconCompatParcelizer().hashCode();
    }

    public final boolean equals(Object p0) {
        if (p0 == this) {
            return true;
        }
        if (p0 instanceof setRound) {
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(((setRound) p0).IconCompatParcelizer(), IconCompatParcelizer());
        }
        return false;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lo/setRound$AudioAttributesCompatParcelizer;", "", "<init>", "()V", "RemoteActionCompatParcelizer", "IconCompatParcelizer", "Lo/setRound$AudioAttributesCompatParcelizer$IconCompatParcelizer;", "Lo/setRound$AudioAttributesCompatParcelizer$RemoteActionCompatParcelizer;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class AudioAttributesCompatParcelizer {
        private AudioAttributesCompatParcelizer() {
        }

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lo/setRound$AudioAttributesCompatParcelizer$RemoteActionCompatParcelizer;", "Lo/setRound$AudioAttributesCompatParcelizer;", "Lo/getReferencedType;", "p0", "<init>", "(JLo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "IconCompatParcelizer", "J", "read", "()J"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class RemoteActionCompatParcelizer extends AudioAttributesCompatParcelizer {
            private final long IconCompatParcelizer;

            private RemoteActionCompatParcelizer(long j) {
                super(null);
                this.IconCompatParcelizer = j;
                if ((j & 9223372034707292159L) != 9205357640488583168L) {
                    return;
                }
                getRootStableInsets.AudioAttributesCompatParcelizer("ContextMenuState.Status should never be open with an unspecified offset. Use ContextMenuState.Status.Closed instead.");
            }

            /* JADX INFO: renamed from: read, reason: from getter */
            public final long getIconCompatParcelizer() {
                return this.IconCompatParcelizer;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Open(offset=");
                sb.append((Object) getReferencedType.AudioAttributesImplBaseParcelizer(this.IconCompatParcelizer));
                sb.append(')');
                return sb.toString();
            }

            public final int hashCode() {
                return getReferencedType.MediaBrowserCompatItemReceiver(this.IconCompatParcelizer);
            }

            public final boolean equals(Object p0) {
                if (p0 == this) {
                    return true;
                }
                if (p0 instanceof RemoteActionCompatParcelizer) {
                    return getReferencedType.IconCompatParcelizer(this.IconCompatParcelizer, ((RemoteActionCompatParcelizer) p0).IconCompatParcelizer);
                }
                return false;
            }

            public /* synthetic */ RemoteActionCompatParcelizer(long j, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
                this(j);
            }
        }

        public /* synthetic */ AudioAttributesCompatParcelizer(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo/setRound$AudioAttributesCompatParcelizer$IconCompatParcelizer;", "Lo/setRound$AudioAttributesCompatParcelizer;", "<init>", "()V", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class IconCompatParcelizer extends AudioAttributesCompatParcelizer {
            public static final IconCompatParcelizer INSTANCE = new IconCompatParcelizer();

            private IconCompatParcelizer() {
                super(null);
            }

            public final String toString() {
                return "Closed";
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public setRound() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
