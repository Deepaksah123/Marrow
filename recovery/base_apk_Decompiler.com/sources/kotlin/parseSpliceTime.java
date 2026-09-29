package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
public interface parseSpliceTime {

    /* JADX INFO: loaded from: classes5.dex */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lo/parseSpliceTime$read;", "", "<init>", "(Ljava/lang/String;I)V", "write", "AudioAttributesCompatParcelizer", "IconCompatParcelizer"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public enum read {
        CRASHLYTICS,
        PERFORMANCE,
        MATT_SAYS_HI
    }

    void AudioAttributesCompatParcelizer(write writeVar);

    read IconCompatParcelizer();

    boolean RemoteActionCompatParcelizer();

    /* JADX INFO: loaded from: classes5.dex */
    public static final class write {
        private final String IconCompatParcelizer;

        public write(String str) {
            toMagicModuleMetaRepoModel.write(str, "");
            this.IconCompatParcelizer = str;
        }

        public final String write() {
            return this.IconCompatParcelizer;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) ((write) obj).IconCompatParcelizer);
        }

        public final int hashCode() {
            return this.IconCompatParcelizer.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SessionDetails(sessionId=");
            sb.append(this.IconCompatParcelizer);
            sb.append(')');
            return sb.toString();
        }
    }
}
