package kotlin;

import com.github.mikephil.charting.data.RadarEntry;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0017\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0011R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0014\u0010\u0019R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u001a\u0010\u0019R \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001b\u0010\u0019"}, d2 = {"Lo/installIfNeededAsync;", "", "", "p0", "", "", "p1", "", "Lcom/github/mikephil/charting/data/RadarEntry;", "p2", "p3", "<init>", "(ILjava/util/List;Ljava/util/List;Ljava/util/List;)V", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "write", "I", "AudioAttributesCompatParcelizer", "RemoteActionCompatParcelizer", "Ljava/util/List;", "()Ljava/util/List;", "read", "IconCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class installIfNeededAsync {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final List<RadarEntry> read;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final List<String> write;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final List<RadarEntry> IconCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final int RemoteActionCompatParcelizer;

    /* JADX WARN: Multi-variable type inference failed */
    public installIfNeededAsync(int i, List<String> list, List<? extends RadarEntry> list2, List<? extends RadarEntry> list3) {
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(list2, "");
        toMagicModuleMetaRepoModel.write(list3, "");
        this.RemoteActionCompatParcelizer = i;
        this.write = list;
        this.read = list2;
        this.IconCompatParcelizer = list3;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final int getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public /* synthetic */ installIfNeededAsync(int i, ArrayList arrayList, List list, List list2, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? new ArrayList() : arrayList, (i2 & 4) != 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list, (i2 & 8) != 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list2);
    }

    public final List<String> write() {
        return this.write;
    }

    public final List<RadarEntry> read() {
        return this.read;
    }

    public final List<RadarEntry> IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public installIfNeededAsync() {
        this(0, null, null, null, 15, null);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof installIfNeededAsync)) {
            return false;
        }
        installIfNeededAsync installifneededasync = (installIfNeededAsync) p0;
        return this.RemoteActionCompatParcelizer == installifneededasync.RemoteActionCompatParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.write, installifneededasync.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.read, installifneededasync.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.IconCompatParcelizer, installifneededasync.IconCompatParcelizer);
    }

    public final int hashCode() {
        return (((((Integer.hashCode(this.RemoteActionCompatParcelizer) * 31) + this.write.hashCode()) * 31) + this.read.hashCode()) * 31) + this.IconCompatParcelizer.hashCode();
    }

    public final String toString() {
        int i = this.RemoteActionCompatParcelizer;
        List<String> list = this.write;
        List<RadarEntry> list2 = this.read;
        List<RadarEntry> list3 = this.IconCompatParcelizer;
        StringBuilder sb = new StringBuilder("installIfNeededAsync(RemoteActionCompatParcelizer=");
        sb.append(i);
        sb.append(", write=");
        sb.append(list);
        sb.append(", read=");
        sb.append(list2);
        sb.append(", IconCompatParcelizer=");
        sb.append(list3);
        sb.append(")");
        return sb.toString();
    }
}
