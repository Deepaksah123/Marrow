package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/marrow2/ui/mcq/util/McqVideoAnalyticsState;", "", "mcqId", "", "attemptNo", "", "lastTapAtMs", "", "<init>", "(Ljava/lang/String;IJ)V", "getMcqId", "()Ljava/lang/String;", "getAttemptNo", "()I", "getLastTapAtMs", "()J", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ConnectionTelemetryConfiguration {
    private final int RemoteActionCompatParcelizer;
    private final String read;
    private final long write;

    private ConnectionTelemetryConfiguration(String str, int i, long j) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.read = str;
        this.RemoteActionCompatParcelizer = i;
        this.write = j;
    }

    public /* synthetic */ ConnectionTelemetryConfiguration(String str, int i, long j, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? 0L : j);
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final String getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final int getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final long getWrite() {
        return this.write;
    }

    public ConnectionTelemetryConfiguration() {
        this(null, 0, 0L, 7, null);
    }

    public static /* synthetic */ ConnectionTelemetryConfiguration IconCompatParcelizer(ConnectionTelemetryConfiguration connectionTelemetryConfiguration, String str, int i, long j, int i2) {
        if ((i2 & 1) != 0) {
            str = connectionTelemetryConfiguration.read;
        }
        if ((i2 & 2) != 0) {
            i = connectionTelemetryConfiguration.RemoteActionCompatParcelizer;
        }
        if ((i2 & 4) != 0) {
            j = connectionTelemetryConfiguration.write;
        }
        return write(str, i, j);
    }

    private static ConnectionTelemetryConfiguration write(String str, int i, long j) {
        toMagicModuleMetaRepoModel.write(str, "");
        return new ConnectionTelemetryConfiguration(str, i, j);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConnectionTelemetryConfiguration)) {
            return false;
        }
        ConnectionTelemetryConfiguration connectionTelemetryConfiguration = (ConnectionTelemetryConfiguration) other;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) connectionTelemetryConfiguration.read) && this.RemoteActionCompatParcelizer == connectionTelemetryConfiguration.RemoteActionCompatParcelizer && this.write == connectionTelemetryConfiguration.write;
    }

    public final int hashCode() {
        return (((this.read.hashCode() * 31) + Integer.hashCode(this.RemoteActionCompatParcelizer)) * 31) + Long.hashCode(this.write);
    }

    public final String toString() {
        String str = this.read;
        int i = this.RemoteActionCompatParcelizer;
        long j = this.write;
        StringBuilder sb = new StringBuilder("McqVideoAnalyticsState(mcqId=");
        sb.append(str);
        sb.append(", attemptNo=");
        sb.append(i);
        sb.append(", lastTapAtMs=");
        sb.append(j);
        sb.append(")");
        return sb.toString();
    }
}
