package kotlin;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class isOpenEnded {
    private final List<C0162cache> AudioAttributesCompatParcelizer;
    private final List<isHoleSpan> IconCompatParcelizer;
    private final readBlockToCache RemoteActionCompatParcelizer;
    private final String read;
    private final List<addSpan> write;

    public isOpenEnded(String str, readBlockToCache readblocktocache, List<isHoleSpan> list, List<addSpan> list2, List<C0162cache> list3) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(readblocktocache, "");
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(list2, "");
        toMagicModuleMetaRepoModel.write(list3, "");
        this.read = str;
        this.RemoteActionCompatParcelizer = readblocktocache;
        this.IconCompatParcelizer = list;
        this.write = list2;
        this.AudioAttributesCompatParcelizer = list3;
    }

    public final List<isHoleSpan> read() {
        return this.IconCompatParcelizer;
    }

    public final List<addSpan> write() {
        return this.write;
    }

    public final List<C0162cache> RemoteActionCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof isOpenEnded)) {
            return false;
        }
        isOpenEnded isopenended = (isOpenEnded) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) isopenended.read) && this.RemoteActionCompatParcelizer == isopenended.RemoteActionCompatParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.IconCompatParcelizer, isopenended.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.write, isopenended.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, isopenended.AudioAttributesCompatParcelizer);
    }

    public final int hashCode() {
        return (((((((this.read.hashCode() * 31) + this.RemoteActionCompatParcelizer.hashCode()) * 31) + this.IconCompatParcelizer.hashCode()) * 31) + this.write.hashCode()) * 31) + this.AudioAttributesCompatParcelizer.hashCode();
    }

    public final String toString() {
        String str = this.read;
        readBlockToCache readblocktocache = this.RemoteActionCompatParcelizer;
        List<isHoleSpan> list = this.IconCompatParcelizer;
        List<addSpan> list2 = this.write;
        List<C0162cache> list3 = this.AudioAttributesCompatParcelizer;
        StringBuilder sb = new StringBuilder("McqDownloadedDataRepoModel(parentId=");
        sb.append(str);
        sb.append(", parentType=");
        sb.append(readblocktocache);
        sb.append(", listMcqQuestions=");
        sb.append(list);
        sb.append(", listMcqSchema=");
        sb.append(list2);
        sb.append(", listMcqParentInfo=");
        sb.append(list3);
        sb.append(")");
        return sb.toString();
    }
}
