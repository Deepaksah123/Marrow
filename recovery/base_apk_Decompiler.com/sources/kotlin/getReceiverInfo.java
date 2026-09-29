package kotlin;

import kotlin.Metadata;
import kotlin.getProviderInfo;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0000\u0018\u0000 \u00162\u00020\u0001:\u0002\u0016\u0017B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001c\u001a\u00020\u00068\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u001b"}, d2 = {"Lo/getReceiverInfo;", "Lo/getProviderInfo;", "Lo/getPackageGids;", "p0", "Lo/getReceiverInfo$read;", "p1", "Lo/getProviderInfo$read;", "p2", "<init>", "(Lo/getPackageGids;Lo/getReceiverInfo$read;Lo/getProviderInfo$read;)V", "", "toString", "()Ljava/lang/String;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "AudioAttributesCompatParcelizer", "Lo/getPackageGids;", "write", "read", "Lo/getReceiverInfo$read;", "RemoteActionCompatParcelizer", "Lo/getProviderInfo$read;", "()Lo/getProviderInfo$read;", "IconCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getReceiverInfo implements getProviderInfo {

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final getPackageGids write;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final getProviderInfo.read IconCompatParcelizer;
    private final read read;

    public getReceiverInfo(getPackageGids getpackagegids, read readVar, getProviderInfo.read readVar2) {
        toMagicModuleMetaRepoModel.write(getpackagegids, "");
        toMagicModuleMetaRepoModel.write(readVar, "");
        toMagicModuleMetaRepoModel.write(readVar2, "");
        this.write = getpackagegids;
        this.read = readVar;
        this.IconCompatParcelizer = readVar2;
        Companion.AudioAttributesCompatParcelizer(getpackagegids);
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final getProviderInfo.read getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HardwareFoldingFeature { ");
        sb.append(this.write);
        sb.append(", type=");
        sb.append(this.read);
        sb.append(", state=");
        sb.append(getIconCompatParcelizer());
        sb.append(" }");
        return sb.toString();
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getClass(), p0 != null ? p0.getClass() : null)) {
            return false;
        }
        toMagicModuleMetaRepoModel.read(p0, "");
        getReceiverInfo getreceiverinfo = (getReceiverInfo) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.write, getreceiverinfo.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.read, getreceiverinfo.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getIconCompatParcelizer(), getreceiverinfo.getIconCompatParcelizer());
    }

    public final int hashCode() {
        return (((this.write.hashCode() * 31) + this.read.hashCode()) * 31) + getIconCompatParcelizer().hashCode();
    }

    /* JADX INFO: renamed from: o.getReceiverInfo$write, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/getReceiverInfo$write;", "", "<init>", "()V", "Lo/getPackageGids;", "p0", "", "AudioAttributesCompatParcelizer", "(Lo/getPackageGids;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void AudioAttributesCompatParcelizer(getPackageGids p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            if (p0.IconCompatParcelizer() == 0 && p0.RemoteActionCompatParcelizer() == 0) {
                throw new IllegalArgumentException("Bounds must be non zero".toString());
            }
            if (p0.getRemoteActionCompatParcelizer() != 0 && p0.getAudioAttributesCompatParcelizer() != 0) {
                throw new IllegalArgumentException("Bounding rectangle must start at the top or left window edge for folding features".toString());
            }
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0000\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t"}, d2 = {"Lo/getReceiverInfo$read;", "", "", "p0", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "read", "Ljava/lang/String;", "write", "IconCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class read {

        /* JADX INFO: renamed from: read, reason: from kotlin metadata */
        private final String write;

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final read AudioAttributesCompatParcelizer = new read("FOLD");
        private static final read write = new read("HINGE");

        private read(String str) {
            this.write = str;
        }

        /* JADX INFO: renamed from: toString, reason: from getter */
        public final String getWrite() {
            return this.write;
        }

        /* JADX INFO: renamed from: o.getReceiverInfo$read$IconCompatParcelizer, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\b\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007R\u001a\u0010\n\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\t\u0010\u0007"}, d2 = {"Lo/getReceiverInfo$read$IconCompatParcelizer;", "", "<init>", "()V", "Lo/getReceiverInfo$read;", "AudioAttributesCompatParcelizer", "Lo/getReceiverInfo$read;", "()Lo/getReceiverInfo$read;", "write", "read", "IconCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public static read AudioAttributesCompatParcelizer() {
                return read.AudioAttributesCompatParcelizer;
            }

            public static read read() {
                return read.write;
            }

            public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
                this();
            }
        }
    }
}
