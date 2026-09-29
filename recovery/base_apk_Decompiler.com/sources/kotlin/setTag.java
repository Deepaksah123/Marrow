package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b"}, d2 = {"Lo/setTag;", "", "<init>", "()V", "IconCompatParcelizer", "write", "read", "AudioAttributesCompatParcelizer", "Lo/setTag$read;", "Lo/setTag$AudioAttributesCompatParcelizer;", "Lo/setTag$IconCompatParcelizer;", "Lo/setTag$write;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class setTag {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\t\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b"}, d2 = {"Lo/setTag$IconCompatParcelizer;", "Lo/setTag;", "Lo/getReferencedType;", "p0", "<init>", "(JLo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "AudioAttributesCompatParcelizer", "J", "()J", "read"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class IconCompatParcelizer extends setTag {

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
        private final long read;

        private IconCompatParcelizer(long j) {
            super(null);
            this.read = j;
        }

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
        public final long getRead() {
            return this.read;
        }

        public /* synthetic */ IconCompatParcelizer(long j, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this(j);
        }
    }

    private setTag() {
    }

    public /* synthetic */ setTag(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this();
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u000b\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u001a\u0010\f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\u000e"}, d2 = {"Lo/setTag$write;", "Lo/setTag;", "Lo/UnsupportedTypeDeserializer;", "p0", "", "p1", "<init>", "(JZLo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "IconCompatParcelizer", "J", "()J", "RemoteActionCompatParcelizer", "AudioAttributesCompatParcelizer", "Z", "()Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class write extends setTag {
        private final boolean AudioAttributesCompatParcelizer;

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
        private final long RemoteActionCompatParcelizer;

        private write(long j, boolean z) {
            super(null);
            this.RemoteActionCompatParcelizer = j;
            this.AudioAttributesCompatParcelizer = z;
        }

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
        public final long getRemoteActionCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
        public final boolean getAudioAttributesCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        public /* synthetic */ write(long j, boolean z, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this(j, z);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/setTag$read;", "Lo/setTag;", "<init>", "()V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class read extends setTag {
        public static final read INSTANCE = new read();

        private read() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\f\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\n\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\b\u0010\u000f"}, d2 = {"Lo/setTag$AudioAttributesCompatParcelizer;", "Lo/setTag;", "Lo/getReferencedType;", "p0", "", "p1", "<init>", "(JZLo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "AudioAttributesCompatParcelizer", "J", "IconCompatParcelizer", "()J", "write", "RemoteActionCompatParcelizer", "Z", "()Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AudioAttributesCompatParcelizer extends setTag {

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
        private final long write;

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
        private final boolean IconCompatParcelizer;

        private AudioAttributesCompatParcelizer(long j, boolean z) {
            super(null);
            this.write = j;
            this.IconCompatParcelizer = z;
        }

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
        public final boolean getIconCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
        public final long getWrite() {
            return this.write;
        }

        public /* synthetic */ AudioAttributesCompatParcelizer(long j, boolean z, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this(j, z);
        }
    }
}
