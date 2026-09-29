package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/marrow2/ui/mcq/component/PlaybackUiState;", "", "phase", "Lcom/marrow2/ui/mcq/component/PlaybackPhase;", "position", "", "duration", "<init>", "(Lcom/marrow2/ui/mcq/component/PlaybackPhase;JJ)V", "getPhase", "()Lcom/marrow2/ui/mcq/component/PlaybackPhase;", "getPosition", "()J", "getDuration", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class executorService {
    private final long AudioAttributesCompatParcelizer;
    private final long RemoteActionCompatParcelizer;
    private final ClientSettings write;

    private executorService(ClientSettings clientSettings, long j, long j2) {
        toMagicModuleMetaRepoModel.write(clientSettings, "");
        this.write = clientSettings;
        this.AudioAttributesCompatParcelizer = j;
        this.RemoteActionCompatParcelizer = j2;
    }

    public /* synthetic */ executorService(ClientSettings clientSettings, long j, long j2, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? ClientSettings.RemoteActionCompatParcelizer : clientSettings, (i & 2) != 0 ? 0L : j, (i & 4) != 0 ? 0L : j2);
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final ClientSettings getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final long getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final long getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public executorService() {
        this(null, 0L, 0L, 7, null);
    }

    public static /* synthetic */ executorService IconCompatParcelizer(executorService executorservice, ClientSettings clientSettings, long j, long j2, int i) {
        if ((i & 1) != 0) {
            clientSettings = executorservice.write;
        }
        if ((i & 2) != 0) {
            j = executorservice.AudioAttributesCompatParcelizer;
        }
        if ((i & 4) != 0) {
            j2 = executorservice.RemoteActionCompatParcelizer;
        }
        return RemoteActionCompatParcelizer(clientSettings, j, j2);
    }

    private static executorService RemoteActionCompatParcelizer(ClientSettings clientSettings, long j, long j2) {
        toMagicModuleMetaRepoModel.write(clientSettings, "");
        return new executorService(clientSettings, j, j2);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof executorService)) {
            return false;
        }
        executorService executorservice = (executorService) other;
        return this.write == executorservice.write && this.AudioAttributesCompatParcelizer == executorservice.AudioAttributesCompatParcelizer && this.RemoteActionCompatParcelizer == executorservice.RemoteActionCompatParcelizer;
    }

    public final int hashCode() {
        return (((this.write.hashCode() * 31) + Long.hashCode(this.AudioAttributesCompatParcelizer)) * 31) + Long.hashCode(this.RemoteActionCompatParcelizer);
    }

    public final String toString() {
        ClientSettings clientSettings = this.write;
        long j = this.AudioAttributesCompatParcelizer;
        long j2 = this.RemoteActionCompatParcelizer;
        StringBuilder sb = new StringBuilder("PlaybackUiState(phase=");
        sb.append(clientSettings);
        sb.append(", position=");
        sb.append(j);
        sb.append(", duration=");
        sb.append(j2);
        sb.append(")");
        return sb.toString();
    }
}
