package kotlin;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0012\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0014\u0010\u0011R \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\"\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0017\u001a\u0004\b\u0012\u0010\u0018"}, d2 = {"Lo/setLogStackTraces;", "", "", "p0", "p1", "", "p2", "p3", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "AudioAttributesCompatParcelizer", "Ljava/lang/String;", "RemoteActionCompatParcelizer", "read", "IconCompatParcelizer", "Ljava/util/List;", "()Ljava/util/List;", "write"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class setLogStackTraces {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final String RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final List<String> read;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final List<String> write;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final String AudioAttributesCompatParcelizer;

    public setLogStackTraces(String str, String str2, List<String> list, List<String> list2) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(list, "");
        this.RemoteActionCompatParcelizer = str;
        this.AudioAttributesCompatParcelizer = str2;
        this.read = list;
        this.write = list2;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final String getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final List<String> IconCompatParcelizer() {
        return this.read;
    }

    public final List<String> AudioAttributesCompatParcelizer() {
        return this.write;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof setLogStackTraces)) {
            return false;
        }
        setLogStackTraces setlogstacktraces = (setLogStackTraces) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) setlogstacktraces.RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) setlogstacktraces.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.read, setlogstacktraces.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.write, setlogstacktraces.write);
    }

    public final int hashCode() {
        int iHashCode = this.RemoteActionCompatParcelizer.hashCode();
        int iHashCode2 = this.AudioAttributesCompatParcelizer.hashCode();
        int iHashCode3 = this.read.hashCode();
        List<String> list = this.write;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        String str = this.RemoteActionCompatParcelizer;
        String str2 = this.AudioAttributesCompatParcelizer;
        List<String> list = this.read;
        List<String> list2 = this.write;
        StringBuilder sb = new StringBuilder("setLogStackTraces(RemoteActionCompatParcelizer=");
        sb.append(str);
        sb.append(", AudioAttributesCompatParcelizer=");
        sb.append(str2);
        sb.append(", read=");
        sb.append(list);
        sb.append(", write=");
        sb.append(list2);
        sb.append(")");
        return sb.toString();
    }
}
