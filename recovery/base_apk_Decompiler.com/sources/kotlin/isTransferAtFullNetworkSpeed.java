package kotlin;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001:\u0004\u0019\u0016\u0014\u001aB!\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\t2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018"}, d2 = {"Lo/isTransferAtFullNetworkSpeed;", "", "", "Lo/isTransferAtFullNetworkSpeed$read;", "p0", "Lo/isTransferAtFullNetworkSpeed$write;", "p1", "<init>", "(Ljava/util/List;Lo/isTransferAtFullNetworkSpeed$write;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "IconCompatParcelizer", "Ljava/util/List;", "AudioAttributesCompatParcelizer", "()Ljava/util/List;", "RemoteActionCompatParcelizer", "Lo/isTransferAtFullNetworkSpeed$write;", "()Lo/isTransferAtFullNetworkSpeed$write;", "read", "write"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class isTransferAtFullNetworkSpeed {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final write read;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final List<read> RemoteActionCompatParcelizer;

    public isTransferAtFullNetworkSpeed(List<read> list, write writeVar) {
        toMagicModuleMetaRepoModel.write(list, "");
        this.RemoteActionCompatParcelizer = list;
        this.read = writeVar;
    }

    public final List<read> AudioAttributesCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final write getRead() {
        return this.read;
    }

    public static final class read {
        private final String IconCompatParcelizer;
        private final List<RemoteActionCompatParcelizer> read;

        public read(String str, List<RemoteActionCompatParcelizer> list) {
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(list, "");
            this.IconCompatParcelizer = str;
            this.read = list;
        }

        public final String RemoteActionCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        public final List<RemoteActionCompatParcelizer> AudioAttributesCompatParcelizer() {
            return this.read;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof read)) {
                return false;
            }
            read readVar = (read) obj;
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) readVar.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.read, readVar.read);
        }

        public final int hashCode() {
            return (this.IconCompatParcelizer.hashCode() * 31) + this.read.hashCode();
        }

        public final String toString() {
            String str = this.IconCompatParcelizer;
            List<RemoteActionCompatParcelizer> list = this.read;
            StringBuilder sb = new StringBuilder("SampleVideoSection(sectionTitle=");
            sb.append(str);
            sb.append(", lessonList=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof isTransferAtFullNetworkSpeed)) {
            return false;
        }
        isTransferAtFullNetworkSpeed istransferatfullnetworkspeed = (isTransferAtFullNetworkSpeed) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, istransferatfullnetworkspeed.RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.read, istransferatfullnetworkspeed.read);
    }

    public final int hashCode() {
        int iHashCode = this.RemoteActionCompatParcelizer.hashCode();
        write writeVar = this.read;
        return (iHashCode * 31) + (writeVar == null ? 0 : writeVar.hashCode());
    }

    public final String toString() {
        List<read> list = this.RemoteActionCompatParcelizer;
        write writeVar = this.read;
        StringBuilder sb = new StringBuilder("isTransferAtFullNetworkSpeed(RemoteActionCompatParcelizer=");
        sb.append(list);
        sb.append(", read=");
        sb.append(writeVar);
        sb.append(")");
        return sb.toString();
    }

    public static final class RemoteActionCompatParcelizer {
        private final String IconCompatParcelizer;
        private final AudioAttributesCompatParcelizer RemoteActionCompatParcelizer;
        private final String read;
        private final String write;

        public RemoteActionCompatParcelizer(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, String str, String str2, String str3) {
            toMagicModuleMetaRepoModel.write(audioAttributesCompatParcelizer, "");
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            toMagicModuleMetaRepoModel.write(str3, "");
            this.RemoteActionCompatParcelizer = audioAttributesCompatParcelizer;
            this.write = str;
            this.IconCompatParcelizer = str2;
            this.read = str3;
        }

        public final AudioAttributesCompatParcelizer RemoteActionCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        public final String IconCompatParcelizer() {
            return this.write;
        }

        public final String AudioAttributesCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        public final String read() {
            return this.read;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RemoteActionCompatParcelizer)) {
                return false;
            }
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = (RemoteActionCompatParcelizer) obj;
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, remoteActionCompatParcelizer.RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) remoteActionCompatParcelizer.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) remoteActionCompatParcelizer.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) remoteActionCompatParcelizer.read);
        }

        public final int hashCode() {
            return (((((this.RemoteActionCompatParcelizer.hashCode() * 31) + this.write.hashCode()) * 31) + this.IconCompatParcelizer.hashCode()) * 31) + this.read.hashCode();
        }

        public final String toString() {
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = this.RemoteActionCompatParcelizer;
            String str = this.write;
            String str2 = this.IconCompatParcelizer;
            String str3 = this.read;
            StringBuilder sb = new StringBuilder("SampleVideoLessons(lessonAuthor=");
            sb.append(audioAttributesCompatParcelizer);
            sb.append(", lessonId=");
            sb.append(str);
            sb.append(", subjectName=");
            sb.append(str2);
            sb.append(", lessonTitle=");
            sb.append(str3);
            sb.append(")");
            return sb.toString();
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0011\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0013\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0010\u001a\u0004\b\u0012\u0010\u000e"}, d2 = {"Lo/isTransferAtFullNetworkSpeed$AudioAttributesCompatParcelizer;", "", "", "p0", "p1", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "read", "Ljava/lang/String;", "IconCompatParcelizer", "AudioAttributesCompatParcelizer", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AudioAttributesCompatParcelizer {

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final AudioAttributesCompatParcelizer RemoteActionCompatParcelizer = new AudioAttributesCompatParcelizer("", "");

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
        private final String RemoteActionCompatParcelizer;

        /* JADX INFO: renamed from: read, reason: from kotlin metadata */
        private final String IconCompatParcelizer;

        public AudioAttributesCompatParcelizer(String str, String str2) {
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            this.IconCompatParcelizer = str;
            this.RemoteActionCompatParcelizer = str2;
        }

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
        public final String getIconCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
        public final String getRemoteActionCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        /* JADX INFO: renamed from: o.isTransferAtFullNetworkSpeed$AudioAttributesCompatParcelizer$IconCompatParcelizer, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lo/isTransferAtFullNetworkSpeed$AudioAttributesCompatParcelizer$IconCompatParcelizer;", "", "<init>", "()V", "Lo/isTransferAtFullNetworkSpeed$AudioAttributesCompatParcelizer;", "RemoteActionCompatParcelizer", "Lo/isTransferAtFullNetworkSpeed$AudioAttributesCompatParcelizer;", "IconCompatParcelizer", "()Lo/isTransferAtFullNetworkSpeed$AudioAttributesCompatParcelizer;", "read"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public static AudioAttributesCompatParcelizer IconCompatParcelizer() {
                return AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer;
            }

            public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
                this();
            }
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof AudioAttributesCompatParcelizer)) {
                return false;
            }
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = (AudioAttributesCompatParcelizer) p0;
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) audioAttributesCompatParcelizer.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) audioAttributesCompatParcelizer.RemoteActionCompatParcelizer);
        }

        public final int hashCode() {
            return (this.IconCompatParcelizer.hashCode() * 31) + this.RemoteActionCompatParcelizer.hashCode();
        }

        public final String toString() {
            String str = this.IconCompatParcelizer;
            String str2 = this.RemoteActionCompatParcelizer;
            StringBuilder sb = new StringBuilder("AudioAttributesCompatParcelizer(IconCompatParcelizer=");
            sb.append(str);
            sb.append(", RemoteActionCompatParcelizer=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }
    }

    public static final class write {
        private final String AudioAttributesCompatParcelizer;
        private final String IconCompatParcelizer;
        private final String write;

        public write(String str, String str2, String str3) {
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            toMagicModuleMetaRepoModel.write(str3, "");
            this.write = str;
            this.IconCompatParcelizer = str2;
            this.AudioAttributesCompatParcelizer = str3;
        }

        public final String AudioAttributesCompatParcelizer() {
            return this.write;
        }

        public final String RemoteActionCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        public final String write() {
            return this.AudioAttributesCompatParcelizer;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof write)) {
                return false;
            }
            write writeVar = (write) obj;
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) writeVar.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) writeVar.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) writeVar.AudioAttributesCompatParcelizer);
        }

        public final int hashCode() {
            return (((this.write.hashCode() * 31) + this.IconCompatParcelizer.hashCode()) * 31) + this.AudioAttributesCompatParcelizer.hashCode();
        }

        public final String toString() {
            String str = this.write;
            String str2 = this.IconCompatParcelizer;
            String str3 = this.AudioAttributesCompatParcelizer;
            StringBuilder sb = new StringBuilder("PromotionalScreeRepoModel(title=");
            sb.append(str);
            sb.append(", subTitle=");
            sb.append(str2);
            sb.append(", toolbarTitle=");
            sb.append(str3);
            sb.append(")");
            return sb.toString();
        }
    }
}
