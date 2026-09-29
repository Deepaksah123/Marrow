package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000bÀ\u0006\u0003"}, d2 = {"Lo/BaseGmsClient;", "", "write", "RemoteActionCompatParcelizer", "IconCompatParcelizer", "AudioAttributesCompatParcelizer", "read", "Lo/BaseGmsClient$write;", "Lo/BaseGmsClient$read;", "Lo/BaseGmsClient$AudioAttributesCompatParcelizer;", "Lo/BaseGmsClient$IconCompatParcelizer;", "Lo/BaseGmsClient$RemoteActionCompatParcelizer;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface BaseGmsClient {

    public static final class write implements BaseGmsClient {
        private final String AudioAttributesCompatParcelizer;
        private final String IconCompatParcelizer;
        private final String write;

        public write(String str, String str2, String str3) {
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            toMagicModuleMetaRepoModel.write(str3, "");
            this.IconCompatParcelizer = str;
            this.AudioAttributesCompatParcelizer = str2;
            this.write = str3;
        }

        public final String AudioAttributesCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        public final String IconCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        public final String RemoteActionCompatParcelizer() {
            return this.write;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof write)) {
                return false;
            }
            write writeVar = (write) obj;
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) writeVar.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) writeVar.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) writeVar.write);
        }

        public final int hashCode() {
            return (((this.IconCompatParcelizer.hashCode() * 31) + this.AudioAttributesCompatParcelizer.hashCode()) * 31) + this.write.hashCode();
        }

        public final String toString() {
            String str = this.IconCompatParcelizer;
            String str2 = this.AudioAttributesCompatParcelizer;
            String str3 = this.write;
            StringBuilder sb = new StringBuilder("Bind(videoUrl=");
            sb.append(str);
            sb.append(", fallbackUrl=");
            sb.append(str2);
            sb.append(", mcqId=");
            sb.append(str3);
            sb.append(")");
            return sb.toString();
        }
    }

    public static final class RemoteActionCompatParcelizer implements BaseGmsClient {
        private final boolean RemoteActionCompatParcelizer;

        public RemoteActionCompatParcelizer(boolean z) {
            this.RemoteActionCompatParcelizer = z;
        }

        public final boolean IconCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RemoteActionCompatParcelizer) && this.RemoteActionCompatParcelizer == ((RemoteActionCompatParcelizer) obj).RemoteActionCompatParcelizer;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.RemoteActionCompatParcelizer);
        }

        public final String toString() {
            boolean z = this.RemoteActionCompatParcelizer;
            StringBuilder sb = new StringBuilder("SetHolding(holding=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }
    }

    public static final class IconCompatParcelizer implements BaseGmsClient {
        private final BinderWrapper AudioAttributesCompatParcelizer;

        public IconCompatParcelizer(BinderWrapper binderWrapper) {
            toMagicModuleMetaRepoModel.write(binderWrapper, "");
            this.AudioAttributesCompatParcelizer = binderWrapper;
        }

        public final BinderWrapper AudioAttributesCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, ((IconCompatParcelizer) obj).AudioAttributesCompatParcelizer);
        }

        public final int hashCode() {
            return this.AudioAttributesCompatParcelizer.hashCode();
        }

        public final String toString() {
            BinderWrapper binderWrapper = this.AudioAttributesCompatParcelizer;
            StringBuilder sb = new StringBuilder("Play(tapContext=");
            sb.append(binderWrapper);
            sb.append(")");
            return sb.toString();
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lo/BaseGmsClient$AudioAttributesCompatParcelizer;", "Lo/BaseGmsClient;", "<init>", "()V", "", "p0", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AudioAttributesCompatParcelizer implements BaseGmsClient {
        public static final AudioAttributesCompatParcelizer INSTANCE = new AudioAttributesCompatParcelizer();

        public final int hashCode() {
            return 38292361;
        }

        private AudioAttributesCompatParcelizer() {
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof AudioAttributesCompatParcelizer)) {
                return false;
            }
            return true;
        }

        public final String toString() {
            return "AudioAttributesCompatParcelizer";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lo/BaseGmsClient$read;", "Lo/BaseGmsClient;", "<init>", "()V", "", "p0", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class read implements BaseGmsClient {
        public static final read INSTANCE = new read();

        public final int hashCode() {
            return 606221042;
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
}
