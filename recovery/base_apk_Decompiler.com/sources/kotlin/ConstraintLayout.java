package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b2\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b"}, d2 = {"Lo/ConstraintLayout;", "", "<init>", "()V", "AudioAttributesCompatParcelizer", "write", "read", "RemoteActionCompatParcelizer", "Lo/ConstraintLayout$AudioAttributesCompatParcelizer;", "Lo/ConstraintLayout$read;", "Lo/ConstraintLayout$write;", "Lo/ConstraintLayout$RemoteActionCompatParcelizer;"}, k = 1, mv = {2, 0, 0}, xi = 48)
abstract class ConstraintLayout {
    private ConstraintLayout() {
    }

    public /* synthetic */ ConstraintLayout(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this();
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\u0018\u00002\u00020\u0001:\u0001\rB\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\r\u001a\u00020\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\n\u0010\fR\"\u0010\n\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\b\u0010\u0010\"\u0004\b\u0011\u0010\u0012"}, d2 = {"Lo/ConstraintLayout$AudioAttributesCompatParcelizer;", "Lo/ConstraintLayout;", "Lo/ConstraintLayout$AudioAttributesCompatParcelizer$RemoteActionCompatParcelizer;", "p0", "", "p1", "<init>", "(Lo/ConstraintLayout$AudioAttributesCompatParcelizer$RemoteActionCompatParcelizer;Z)V", "write", "Lo/ConstraintLayout$AudioAttributesCompatParcelizer$RemoteActionCompatParcelizer;", "read", "()Lo/ConstraintLayout$AudioAttributesCompatParcelizer$RemoteActionCompatParcelizer;", "(Lo/ConstraintLayout$AudioAttributesCompatParcelizer$RemoteActionCompatParcelizer;)V", "RemoteActionCompatParcelizer", "IconCompatParcelizer", "Z", "()Z", "AudioAttributesCompatParcelizer", "(Z)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AudioAttributesCompatParcelizer extends ConstraintLayout {

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
        private boolean read;

        /* JADX INFO: renamed from: write, reason: from kotlin metadata */
        private RemoteActionCompatParcelizer RemoteActionCompatParcelizer;

        public AudioAttributesCompatParcelizer(RemoteActionCompatParcelizer remoteActionCompatParcelizer, boolean z) {
            super(null);
            this.RemoteActionCompatParcelizer = remoteActionCompatParcelizer;
            this.read = z;
        }

        public /* synthetic */ AudioAttributesCompatParcelizer(RemoteActionCompatParcelizer remoteActionCompatParcelizer, boolean z, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this((i & 1) != 0 ? RemoteActionCompatParcelizer.RemoteActionCompatParcelizer : remoteActionCompatParcelizer, (i & 2) != 0 ? false : z);
        }

        /* JADX INFO: renamed from: read, reason: from getter */
        public final RemoteActionCompatParcelizer getRemoteActionCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        public final void read(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
            this.RemoteActionCompatParcelizer = remoteActionCompatParcelizer;
        }

        public final void AudioAttributesCompatParcelizer(boolean z) {
            this.read = z;
        }

        /* JADX INFO: renamed from: write, reason: from getter */
        public final boolean getRead() {
            return this.read;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public AudioAttributesCompatParcelizer() {
            this(null, false, 3, 0 == true ? 1 : 0);
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lo/ConstraintLayout$AudioAttributesCompatParcelizer$RemoteActionCompatParcelizer;", "", "<init>", "(Ljava/lang/String;I)V", "IconCompatParcelizer", "AudioAttributesCompatParcelizer", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class RemoteActionCompatParcelizer {
            private static final /* synthetic */ RemoteActionCompatParcelizer[] read;
            private static final /* synthetic */ getMagicModuleSavedMcqCount write;
            public static final RemoteActionCompatParcelizer IconCompatParcelizer = new RemoteActionCompatParcelizer("Yes", 0);
            public static final RemoteActionCompatParcelizer AudioAttributesCompatParcelizer = new RemoteActionCompatParcelizer("No", 1);
            public static final RemoteActionCompatParcelizer RemoteActionCompatParcelizer = new RemoteActionCompatParcelizer("NotInitialized", 2);

            private RemoteActionCompatParcelizer(String str, int i) {
            }

            static {
                RemoteActionCompatParcelizer[] remoteActionCompatParcelizerArr = read();
                read = remoteActionCompatParcelizerArr;
                write = getMagicModuleTimeline.IconCompatParcelizer(remoteActionCompatParcelizerArr);
            }

            private static final /* synthetic */ RemoteActionCompatParcelizer[] read() {
                return new RemoteActionCompatParcelizer[]{IconCompatParcelizer, AudioAttributesCompatParcelizer, RemoteActionCompatParcelizer};
            }

            public static RemoteActionCompatParcelizer valueOf(String str) {
                return (RemoteActionCompatParcelizer) Enum.valueOf(RemoteActionCompatParcelizer.class, str);
            }

            public static RemoteActionCompatParcelizer[] values() {
                return (RemoteActionCompatParcelizer[]) read.clone();
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\u0018\u00002\u00020\u0001B'\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR$\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\n\u0010\u000eR\"\u0010\u0010\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012\"\u0004\b\n\u0010\u0013R\"\u0010\u0014\u001a\u00020\u00068\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u000f\u0010\u0016\"\u0004\b\n\u0010\u0017"}, d2 = {"Lo/ConstraintLayout$write;", "Lo/ConstraintLayout;", "Lo/getArrayBuilders;", "p0", "Lo/findClass;", "p1", "", "p2", "<init>", "(Lo/getArrayBuilders;JZLo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "AudioAttributesCompatParcelizer", "Lo/getArrayBuilders;", "RemoteActionCompatParcelizer", "()Lo/getArrayBuilders;", "(Lo/getArrayBuilders;)V", "write", "IconCompatParcelizer", "J", "()J", "(J)V", "read", "Z", "()Z", "(Z)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class write extends ConstraintLayout {

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
        private getArrayBuilders write;
        private long IconCompatParcelizer;
        private boolean read;

        private write(getArrayBuilders getarraybuilders, long j, boolean z) {
            super(null);
            this.write = getarraybuilders;
            this.IconCompatParcelizer = j;
            this.read = z;
        }

        public final void AudioAttributesCompatParcelizer(getArrayBuilders getarraybuilders) {
            this.write = getarraybuilders;
        }

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
        public final getArrayBuilders getWrite() {
            return this.write;
        }

        public /* synthetic */ write(getArrayBuilders getarraybuilders, long j, boolean z, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this((i & 1) != 0 ? null : getarraybuilders, (i & 2) != 0 ? findClass.RemoteActionCompatParcelizer(Long.MAX_VALUE) : j, (i & 4) != 0 ? false : z, null);
        }

        public final void AudioAttributesCompatParcelizer(long j) {
            this.IconCompatParcelizer = j;
        }

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
        public final long getIconCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        public final void AudioAttributesCompatParcelizer(boolean z) {
            this.read = z;
        }

        /* JADX INFO: renamed from: write, reason: from getter */
        public final boolean getRead() {
            return this.read;
        }

        public /* synthetic */ write(getArrayBuilders getarraybuilders, long j, boolean z, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this(getarraybuilders, j, z);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR$\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\f\u0010\u000eR\"\u0010\n\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011\"\u0004\b\u000f\u0010\u0012R\u001e\u0010\u0016\u001a\u0004\u0018\u00010\u00068\u0006@\u0007X\u0087\u000e¢\u0006\f\n\u0004\b\f\u0010\u0013\"\u0004\b\u0014\u0010\u0015"}, d2 = {"Lo/ConstraintLayout$read;", "Lo/ConstraintLayout;", "Lo/getArrayBuilders;", "p0", "Lo/findClass;", "p1", "Lo/getAccessibilityNodeProvider;", "p2", "<init>", "(Lo/getArrayBuilders;JLo/getAccessibilityNodeProvider;Lo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "IconCompatParcelizer", "Lo/getArrayBuilders;", "AudioAttributesCompatParcelizer", "()Lo/getArrayBuilders;", "(Lo/getArrayBuilders;)V", "read", "J", "()J", "(J)V", "Lo/getAccessibilityNodeProvider;", "RemoteActionCompatParcelizer", "(Lo/getAccessibilityNodeProvider;)V", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class read extends ConstraintLayout {

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
        private getAccessibilityNodeProvider write;

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
        private getArrayBuilders read;

        /* JADX INFO: renamed from: read, reason: from kotlin metadata */
        private long IconCompatParcelizer;

        private read(getArrayBuilders getarraybuilders, long j, getAccessibilityNodeProvider getaccessibilitynodeprovider) {
            super(null);
            this.read = getarraybuilders;
            this.IconCompatParcelizer = j;
            this.write = getaccessibilitynodeprovider;
        }

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
        public final getArrayBuilders getRead() {
            return this.read;
        }

        public final void AudioAttributesCompatParcelizer(getArrayBuilders getarraybuilders) {
            this.read = getarraybuilders;
        }

        public /* synthetic */ read(getArrayBuilders getarraybuilders, long j, getAccessibilityNodeProvider getaccessibilitynodeprovider, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this((i & 1) != 0 ? null : getarraybuilders, (i & 2) != 0 ? findClass.RemoteActionCompatParcelizer(Long.MAX_VALUE) : j, (i & 4) != 0 ? null : getaccessibilitynodeprovider, null);
        }

        /* JADX INFO: renamed from: read, reason: from getter */
        public final long getIconCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        public final void read(long j) {
            this.IconCompatParcelizer = j;
        }

        public final void RemoteActionCompatParcelizer(getAccessibilityNodeProvider getaccessibilitynodeprovider) {
            this.write = getaccessibilitynodeprovider;
        }

        public /* synthetic */ read(getArrayBuilders getarraybuilders, long j, getAccessibilityNodeProvider getaccessibilitynodeprovider, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this(getarraybuilders, j, getaccessibilitynodeprovider);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\"\u0010\n\u001a\u00020\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b"}, d2 = {"Lo/ConstraintLayout$RemoteActionCompatParcelizer;", "Lo/ConstraintLayout;", "Lo/findClass;", "p0", "<init>", "(JLo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "write", "J", "IconCompatParcelizer", "()J", "AudioAttributesCompatParcelizer", "(J)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RemoteActionCompatParcelizer extends ConstraintLayout {

        /* JADX INFO: renamed from: write, reason: from kotlin metadata */
        private long AudioAttributesCompatParcelizer;

        private RemoteActionCompatParcelizer(long j) {
            super(null);
            this.AudioAttributesCompatParcelizer = j;
        }

        public /* synthetic */ RemoteActionCompatParcelizer(long j, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this((i & 1) != 0 ? findClass.RemoteActionCompatParcelizer(Long.MAX_VALUE) : j, null);
        }

        public final void AudioAttributesCompatParcelizer(long j) {
            this.AudioAttributesCompatParcelizer = j;
        }

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
        public final long getAudioAttributesCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        public /* synthetic */ RemoteActionCompatParcelizer(long j, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this(j);
        }
    }
}
