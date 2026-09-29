package kotlin;

import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0015\u001a\u00020\u00028\u0007@\u0006X\u0086\f¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0010R\u001c\u0010\u0017\u001a\u00020\u00028\u0007@\u0006X\u0087\f¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0016\u0010\u0010R\u001c\u0010\u0013\u001a\u00020\u00058\u0007@\u0006X\u0087\f¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0016\u001a\u00020\u00058\u0007@\u0006X\u0087\f¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u0017\u0010\u001aR(\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b8\u0007@\u0006X\u0087\f¢\u0006\f\n\u0004\b\u0016\u0010\u001b\u001a\u0004\b\u0015\u0010\u001c"}, d2 = {"Lo/clearVideoOutput;", "", "", "p0", "p1", "", "p2", "p3", "", "", "p4", "<init>", "(IIZZLjava/util/Map;)V", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "AudioAttributesCompatParcelizer", "I", "RemoteActionCompatParcelizer", "write", "read", "Z", "IconCompatParcelizer", "()Z", "Ljava/util/Map;", "()Ljava/util/Map;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class clearVideoOutput {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private int RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private boolean write;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private int read;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private boolean AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private Map<String, String> IconCompatParcelizer;

    public clearVideoOutput(int i, int i2, boolean z, boolean z2, Map<String, String> map) {
        toMagicModuleMetaRepoModel.write(map, "");
        this.RemoteActionCompatParcelizer = i;
        this.read = i2;
        this.AudioAttributesCompatParcelizer = z;
        this.write = z2;
        this.IconCompatParcelizer = map;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final int getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final int getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final boolean getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final boolean getWrite() {
        return this.write;
    }

    public /* synthetic */ clearVideoOutput(int i, int i2, boolean z, boolean z2, Map map, int i3, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? false : z, (i3 & 8) != 0 ? false : z2, (i3 & 16) != 0 ? VideoTimelineResponseBody.read() : map);
    }

    public final Map<String, String> RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public clearVideoOutput() {
        this(0, 0, false, false, null, 31, null);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof clearVideoOutput)) {
            return false;
        }
        clearVideoOutput clearvideooutput = (clearVideoOutput) p0;
        return this.RemoteActionCompatParcelizer == clearvideooutput.RemoteActionCompatParcelizer && this.read == clearvideooutput.read && this.AudioAttributesCompatParcelizer == clearvideooutput.AudioAttributesCompatParcelizer && this.write == clearvideooutput.write && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.IconCompatParcelizer, clearvideooutput.IconCompatParcelizer);
    }

    public final int hashCode() {
        return (((((((Integer.hashCode(this.RemoteActionCompatParcelizer) * 31) + Integer.hashCode(this.read)) * 31) + Boolean.hashCode(this.AudioAttributesCompatParcelizer)) * 31) + Boolean.hashCode(this.write)) * 31) + this.IconCompatParcelizer.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("clearVideoOutput(RemoteActionCompatParcelizer=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", read=");
        sb.append(this.read);
        sb.append(", AudioAttributesCompatParcelizer=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(", write=");
        sb.append(this.write);
        sb.append(", IconCompatParcelizer=");
        sb.append(this.IconCompatParcelizer);
        sb.append(')');
        return sb.toString();
    }
}
