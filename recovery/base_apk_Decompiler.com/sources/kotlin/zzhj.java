package kotlin;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhj {
    private final String AudioAttributesCompatParcelizer;
    private final String AudioAttributesImplApi21Parcelizer;
    private final zzhe AudioAttributesImplApi26Parcelizer;
    private List<nextIndex> AudioAttributesImplBaseParcelizer;
    private List<String> IconCompatParcelizer;
    private final long MediaBrowserCompatCustomActionResultReceiver;
    private final String MediaBrowserCompatItemReceiver;
    private final String RemoteActionCompatParcelizer;
    private List<Integer> read;
    private previousIndex write;

    public zzhj(String str, String str2, List<String> list, List<Integer> list2, long j, String str3, zzhe zzheVar, String str4, previousIndex previousindex, List<nextIndex> list3) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(list2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        toMagicModuleMetaRepoModel.write(zzheVar, "");
        toMagicModuleMetaRepoModel.write(str4, "");
        toMagicModuleMetaRepoModel.write(previousindex, "");
        toMagicModuleMetaRepoModel.write(list3, "");
        this.RemoteActionCompatParcelizer = str;
        this.AudioAttributesCompatParcelizer = str2;
        this.IconCompatParcelizer = list;
        this.read = list2;
        this.MediaBrowserCompatCustomActionResultReceiver = j;
        this.AudioAttributesImplApi21Parcelizer = str3;
        this.AudioAttributesImplApi26Parcelizer = zzheVar;
        this.MediaBrowserCompatItemReceiver = str4;
        this.write = previousindex;
        this.AudioAttributesImplBaseParcelizer = list3;
    }

    public final String RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final String write() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final long read() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final String AudioAttributesCompatParcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public final zzhe MediaBrowserCompatItemReceiver() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public final String MediaBrowserCompatCustomActionResultReceiver() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public final previousIndex IconCompatParcelizer() {
        return this.write;
    }

    public final List<nextIndex> AudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzhj)) {
            return false;
        }
        zzhj zzhjVar = (zzhj) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) zzhjVar.RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) zzhjVar.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.IconCompatParcelizer, zzhjVar.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.read, zzhjVar.read) && this.MediaBrowserCompatCustomActionResultReceiver == zzhjVar.MediaBrowserCompatCustomActionResultReceiver && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesImplApi21Parcelizer, (Object) zzhjVar.AudioAttributesImplApi21Parcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesImplApi26Parcelizer, zzhjVar.AudioAttributesImplApi26Parcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaBrowserCompatItemReceiver, (Object) zzhjVar.MediaBrowserCompatItemReceiver) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.write, zzhjVar.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesImplBaseParcelizer, zzhjVar.AudioAttributesImplBaseParcelizer);
    }

    public final int hashCode() {
        return (((((((((((((((((this.RemoteActionCompatParcelizer.hashCode() * 31) + this.AudioAttributesCompatParcelizer.hashCode()) * 31) + this.IconCompatParcelizer.hashCode()) * 31) + this.read.hashCode()) * 31) + Long.hashCode(this.MediaBrowserCompatCustomActionResultReceiver)) * 31) + this.AudioAttributesImplApi21Parcelizer.hashCode()) * 31) + this.AudioAttributesImplApi26Parcelizer.hashCode()) * 31) + this.MediaBrowserCompatItemReceiver.hashCode()) * 31) + this.write.hashCode()) * 31) + this.AudioAttributesImplBaseParcelizer.hashCode();
    }

    public final String toString() {
        String str = this.RemoteActionCompatParcelizer;
        String str2 = this.AudioAttributesCompatParcelizer;
        List<String> list = this.IconCompatParcelizer;
        List<Integer> list2 = this.read;
        long j = this.MediaBrowserCompatCustomActionResultReceiver;
        String str3 = this.AudioAttributesImplApi21Parcelizer;
        zzhe zzheVar = this.AudioAttributesImplApi26Parcelizer;
        String str4 = this.MediaBrowserCompatItemReceiver;
        previousIndex previousindex = this.write;
        List<nextIndex> list3 = this.AudioAttributesImplBaseParcelizer;
        StringBuilder sb = new StringBuilder("RecentUpdateUIModel(id=");
        sb.append(str);
        sb.append(", description=");
        sb.append(str2);
        sb.append(", mcqList=");
        sb.append(list);
        sb.append(", pearlList=");
        sb.append(list2);
        sb.append(", publishedOnMs=");
        sb.append(j);
        sb.append(", referenceLink=");
        sb.append(str3);
        sb.append(", subjectDetails=");
        sb.append(zzheVar);
        sb.append(", title=");
        sb.append(str4);
        sb.append(", image=");
        sb.append(previousindex);
        sb.append(", tagsList=");
        sb.append(list3);
        sb.append(")");
        return sb.toString();
    }
}
