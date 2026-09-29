package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lo/setOverriddenInsets;", "Lo/isRound;", "read", "write", "IconCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface setOverriddenInsets extends isRound {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\n\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Lo/setOverriddenInsets$read;", "Lo/setOverriddenInsets;", "Lo/getReferencedType;", "p0", "<init>", "(JLo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "AudioAttributesCompatParcelizer", "J", "RemoteActionCompatParcelizer", "()J", "IconCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class read implements setOverriddenInsets {

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
        private final long IconCompatParcelizer;

        private read(long j) {
            this.IconCompatParcelizer = j;
        }

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
        public final long getIconCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        public /* synthetic */ read(long j, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this(j);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\b\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Lo/setOverriddenInsets$write;", "Lo/setOverriddenInsets;", "Lo/setOverriddenInsets$read;", "p0", "<init>", "(Lo/setOverriddenInsets$read;)V", "write", "Lo/setOverriddenInsets$read;", "read", "()Lo/setOverriddenInsets$read;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class write implements setOverriddenInsets {

        /* JADX INFO: renamed from: write, reason: from kotlin metadata */
        private final read read;

        public write(read readVar) {
            this.read = readVar;
        }

        /* JADX INFO: renamed from: read, reason: from getter */
        public final read getRead() {
            return this.read;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\t\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b"}, d2 = {"Lo/setOverriddenInsets$IconCompatParcelizer;", "Lo/setOverriddenInsets;", "Lo/setOverriddenInsets$read;", "p0", "<init>", "(Lo/setOverriddenInsets$read;)V", "read", "Lo/setOverriddenInsets$read;", "()Lo/setOverriddenInsets$read;", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class IconCompatParcelizer implements setOverriddenInsets {

        /* JADX INFO: renamed from: read, reason: from kotlin metadata */
        private final read RemoteActionCompatParcelizer;

        public IconCompatParcelizer(read readVar) {
            this.RemoteActionCompatParcelizer = readVar;
        }

        /* JADX INFO: renamed from: read, reason: from getter */
        public final read getRemoteActionCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }
    }
}
