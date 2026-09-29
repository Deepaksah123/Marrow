package kotlin;

import androidx.media3.exoplayer.ExoPlayer;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
public interface onReceiveResult {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lo/onReceiveResult$write;", "Lo/onReceiveResult;", "<init>", "()V", "", "p0", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class write implements onReceiveResult {
        public static final write INSTANCE = new write();

        public final int hashCode() {
            return 2130719745;
        }

        private write() {
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof write)) {
                return false;
            }
            return true;
        }

        public final String toString() {
            return "write";
        }
    }

    public static final class read implements onReceiveResult {
        private final ExoPlayer RemoteActionCompatParcelizer;

        public read(ExoPlayer exoPlayer) {
            toMagicModuleMetaRepoModel.write(exoPlayer, "");
            this.RemoteActionCompatParcelizer = exoPlayer;
        }

        public final ExoPlayer read() {
            return this.RemoteActionCompatParcelizer;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, ((read) obj).RemoteActionCompatParcelizer);
        }

        public final int hashCode() {
            return this.RemoteActionCompatParcelizer.hashCode();
        }

        public final String toString() {
            ExoPlayer exoPlayer = this.RemoteActionCompatParcelizer;
            StringBuilder sb = new StringBuilder("Inline(player=");
            sb.append(exoPlayer);
            sb.append(")");
            return sb.toString();
        }
    }

    public static final class RemoteActionCompatParcelizer implements onReceiveResult {
        private final ExoPlayer IconCompatParcelizer;

        public RemoteActionCompatParcelizer(ExoPlayer exoPlayer) {
            toMagicModuleMetaRepoModel.write(exoPlayer, "");
            this.IconCompatParcelizer = exoPlayer;
        }

        public final ExoPlayer read() {
            return this.IconCompatParcelizer;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.IconCompatParcelizer, ((RemoteActionCompatParcelizer) obj).IconCompatParcelizer);
        }

        public final int hashCode() {
            return this.IconCompatParcelizer.hashCode();
        }

        public final String toString() {
            ExoPlayer exoPlayer = this.IconCompatParcelizer;
            StringBuilder sb = new StringBuilder("Fullscreen(player=");
            sb.append(exoPlayer);
            sb.append(")");
            return sb.toString();
        }
    }
}
