package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
public interface getRealClientPackageName {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lo/getRealClientPackageName$read;", "Lo/getRealClientPackageName;", "<init>", "()V", "", "p0", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class read implements getRealClientPackageName {
        public static final read INSTANCE = new read();

        public final int hashCode() {
            return -384197808;
        }

        private read() {
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof read)) {
                return false;
            }
            return true;
        }

        public final String toString() {
            return "read";
        }
    }

    public static final class write implements getRealClientPackageName {
        private final String RemoteActionCompatParcelizer;

        public write(String str) {
            toMagicModuleMetaRepoModel.write(str, "");
            this.RemoteActionCompatParcelizer = str;
        }

        public final String write() {
            return this.RemoteActionCompatParcelizer;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) ((write) obj).RemoteActionCompatParcelizer);
        }

        public final int hashCode() {
            return this.RemoteActionCompatParcelizer.hashCode();
        }

        public final String toString() {
            String str = this.RemoteActionCompatParcelizer;
            StringBuilder sb = new StringBuilder("Image(url=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0013\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0010R\u001a\u0010\u0014\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0014\u0010\u0010R\u001a\u0010\u0016\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0013\u0010\u0010"}, d2 = {"Lo/getRealClientPackageName$IconCompatParcelizer;", "Lo/getRealClientPackageName;", "", "p0", "p1", "p2", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "read", "Ljava/lang/String;", "RemoteActionCompatParcelizer", "write", "IconCompatParcelizer", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class IconCompatParcelizer implements getRealClientPackageName {

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
        private final String AudioAttributesCompatParcelizer;

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
        private final String write;

        /* JADX INFO: renamed from: read, reason: from kotlin metadata */
        private final String RemoteActionCompatParcelizer;

        public IconCompatParcelizer(String str, String str2, String str3) {
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            toMagicModuleMetaRepoModel.write(str3, "");
            this.RemoteActionCompatParcelizer = str;
            this.write = str2;
            this.AudioAttributesCompatParcelizer = str3;
        }

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
        public final String getAudioAttributesCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        /* JADX INFO: renamed from: read, reason: from getter */
        public final String getRemoteActionCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        /* JADX INFO: renamed from: write, reason: from getter */
        public final String getWrite() {
            return this.write;
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof IconCompatParcelizer)) {
                return false;
            }
            IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) p0;
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) iconCompatParcelizer.RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) iconCompatParcelizer.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) iconCompatParcelizer.AudioAttributesCompatParcelizer);
        }

        public final int hashCode() {
            return (((this.RemoteActionCompatParcelizer.hashCode() * 31) + this.write.hashCode()) * 31) + this.AudioAttributesCompatParcelizer.hashCode();
        }

        public final String toString() {
            String str = this.RemoteActionCompatParcelizer;
            String str2 = this.write;
            String str3 = this.AudioAttributesCompatParcelizer;
            StringBuilder sb = new StringBuilder("IconCompatParcelizer(RemoteActionCompatParcelizer=");
            sb.append(str);
            sb.append(", write=");
            sb.append(str2);
            sb.append(", AudioAttributesCompatParcelizer=");
            sb.append(str3);
            sb.append(")");
            return sb.toString();
        }
    }
}
