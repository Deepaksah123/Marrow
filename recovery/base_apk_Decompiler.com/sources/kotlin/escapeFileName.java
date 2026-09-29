package kotlin;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\t2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\"\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015"}, d2 = {"Lo/escapeFileName;", "", "", "Lo/getBytesFromHexString;", "p0", "Lo/getCurrentDisplayModeSize;", "p1", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "read", "Ljava/util/List;", "IconCompatParcelizer", "()Ljava/util/List;", "AudioAttributesCompatParcelizer", "RemoteActionCompatParcelizer", "write"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class escapeFileName {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final List<getCurrentDisplayModeSize> write;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final List<getBytesFromHexString> AudioAttributesCompatParcelizer;

    public escapeFileName(List<getBytesFromHexString> list, List<getCurrentDisplayModeSize> list2) {
        toMagicModuleMetaRepoModel.write(list, "");
        this.AudioAttributesCompatParcelizer = list;
        this.write = list2;
    }

    public /* synthetic */ escapeFileName(List list, List list2, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list, (i & 2) != 0 ? null : list2);
    }

    public final List<getBytesFromHexString> IconCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final List<getCurrentDisplayModeSize> RemoteActionCompatParcelizer() {
        return this.write;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public escapeFileName() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof escapeFileName)) {
            return false;
        }
        escapeFileName escapefilename = (escapeFileName) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, escapefilename.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.write, escapefilename.write);
    }

    public final int hashCode() {
        int iHashCode = this.AudioAttributesCompatParcelizer.hashCode();
        List<getCurrentDisplayModeSize> list = this.write;
        return (iHashCode * 31) + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        List<getBytesFromHexString> list = this.AudioAttributesCompatParcelizer;
        List<getCurrentDisplayModeSize> list2 = this.write;
        StringBuilder sb = new StringBuilder("escapeFileName(AudioAttributesCompatParcelizer=");
        sb.append(list);
        sb.append(", write=");
        sb.append(list2);
        sb.append(")");
        return sb.toString();
    }
}
