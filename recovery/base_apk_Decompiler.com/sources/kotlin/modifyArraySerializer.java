package kotlin;

import android.media.metrics.LogSessionId;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class modifyArraySerializer {
    public static final modifyArraySerializer AudioAttributesCompatParcelizer;
    private final Object IconCompatParcelizer;
    public final String RemoteActionCompatParcelizer;
    private final RemoteActionCompatParcelizer read;

    static {
        modifyArraySerializer modifyarrayserializer;
        if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver < 31) {
            modifyarrayserializer = new modifyArraySerializer("");
        } else {
            modifyarrayserializer = new modifyArraySerializer(RemoteActionCompatParcelizer.write, "");
        }
        AudioAttributesCompatParcelizer = modifyarrayserializer;
    }

    public modifyArraySerializer(String str) {
        buildTypeSerializer.write(LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver < 31);
        this.RemoteActionCompatParcelizer = str;
        this.read = null;
        this.IconCompatParcelizer = new Object();
    }

    public modifyArraySerializer(LogSessionId logSessionId, String str) {
        this(new RemoteActionCompatParcelizer(logSessionId), str);
    }

    private modifyArraySerializer(RemoteActionCompatParcelizer remoteActionCompatParcelizer, String str) {
        this.read = remoteActionCompatParcelizer;
        this.RemoteActionCompatParcelizer = str;
        this.IconCompatParcelizer = new Object();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof modifyArraySerializer)) {
            return false;
        }
        modifyArraySerializer modifyarrayserializer = (modifyArraySerializer) obj;
        return Objects.equals(this.RemoteActionCompatParcelizer, modifyarrayserializer.RemoteActionCompatParcelizer) && Objects.equals(this.read, modifyarrayserializer.read) && Objects.equals(this.IconCompatParcelizer, modifyarrayserializer.IconCompatParcelizer);
    }

    public final int hashCode() {
        return Objects.hash(this.RemoteActionCompatParcelizer, this.read, this.IconCompatParcelizer);
    }

    public final LogSessionId cJ_() {
        return ((RemoteActionCompatParcelizer) buildTypeSerializer.IconCompatParcelizer(this.read)).RemoteActionCompatParcelizer;
    }

    static final class RemoteActionCompatParcelizer {
        public static final RemoteActionCompatParcelizer write = new RemoteActionCompatParcelizer(LogSessionId.LOG_SESSION_ID_NONE);
        public final LogSessionId RemoteActionCompatParcelizer;

        public RemoteActionCompatParcelizer(LogSessionId logSessionId) {
            this.RemoteActionCompatParcelizer = logSessionId;
        }
    }
}
