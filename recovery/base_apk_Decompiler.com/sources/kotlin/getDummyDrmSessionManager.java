package kotlin;

import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lo/getDummyDrmSessionManager;", "", "<init>", "()V", "IconCompatParcelizer", "AudioAttributesCompatParcelizer", "Lo/getDummyDrmSessionManager$IconCompatParcelizer;", "Lo/getDummyDrmSessionManager$AudioAttributesCompatParcelizer;"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class getDummyDrmSessionManager {
    private getDummyDrmSessionManager() {
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fR#\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\r8\u0007¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u001a\u0010\u0012\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\f"}, d2 = {"Lo/getDummyDrmSessionManager$AudioAttributesCompatParcelizer;", "Lo/getDummyDrmSessionManager;", "", "p0", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "", "RemoteActionCompatParcelizer", "Ljava/util/Map;", "()Ljava/util/Map;", "AudioAttributesCompatParcelizer", "read", "Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class AudioAttributesCompatParcelizer extends getDummyDrmSessionManager {

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
        private final Map<String, String> AudioAttributesCompatParcelizer;
        private final String read;

        /* JADX INFO: renamed from: read, reason: from getter */
        public final String getRead() {
            return this.read;
        }

        public final Map<String, String> RemoteActionCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof AudioAttributesCompatParcelizer)) {
                return false;
            }
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = (AudioAttributesCompatParcelizer) p0;
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) audioAttributesCompatParcelizer.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AudioAttributesCompatParcelizer(read=");
            sb.append(this.read);
            sb.append(", AudioAttributesCompatParcelizer=");
            sb.append(this.AudioAttributesCompatParcelizer);
            sb.append(')');
            return sb.toString();
        }
    }

    public /* synthetic */ getDummyDrmSessionManager(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this();
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0012R\u001a\u0010\u0016\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\u0012R\u001a\u0010\u0018\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0013\u0010\u0012R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0012R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0016\u0010\u0012"}, d2 = {"Lo/getDummyDrmSessionManager$IconCompatParcelizer;", "Lo/getDummyDrmSessionManager;", "", "p0", "p1", "p2", "p3", "p4", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "write", "Ljava/lang/String;", "IconCompatParcelizer", "RemoteActionCompatParcelizer", "read", "AudioAttributesCompatParcelizer"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class IconCompatParcelizer extends getDummyDrmSessionManager {

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
        private final String read;

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
        private final String AudioAttributesCompatParcelizer;
        private final String RemoteActionCompatParcelizer;

        /* JADX INFO: renamed from: read, reason: from kotlin metadata */
        private final String IconCompatParcelizer;
        private final String write;

        /* JADX INFO: renamed from: read, reason: from getter */
        public final String getRemoteActionCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
        public final String getWrite() {
            return this.write;
        }

        /* JADX INFO: renamed from: write, reason: from getter */
        public final String getAudioAttributesCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
        public final String getRead() {
            return this.read;
        }

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
        public final String getIconCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IconCompatParcelizer(String str, String str2, String str3, String str4) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(str3, "");
            this.RemoteActionCompatParcelizer = str;
            this.write = str2;
            this.AudioAttributesCompatParcelizer = str3;
            this.read = str4;
            this.IconCompatParcelizer = null;
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof IconCompatParcelizer)) {
                return false;
            }
            IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) p0;
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) iconCompatParcelizer.RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) iconCompatParcelizer.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) iconCompatParcelizer.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) iconCompatParcelizer.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) iconCompatParcelizer.IconCompatParcelizer);
        }

        public final int hashCode() {
            int iHashCode = this.RemoteActionCompatParcelizer.hashCode();
            String str = this.write;
            int iHashCode2 = str == null ? 0 : str.hashCode();
            int iHashCode3 = this.AudioAttributesCompatParcelizer.hashCode();
            String str2 = this.read;
            return ((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("IconCompatParcelizer(RemoteActionCompatParcelizer=");
            sb.append(this.RemoteActionCompatParcelizer);
            sb.append(", write=");
            sb.append(this.write);
            sb.append(", AudioAttributesCompatParcelizer=");
            sb.append(this.AudioAttributesCompatParcelizer);
            sb.append(", read=");
            sb.append(this.read);
            sb.append(", IconCompatParcelizer=");
            sb.append(this.IconCompatParcelizer);
            sb.append(')');
            return sb.toString();
        }
    }
}
