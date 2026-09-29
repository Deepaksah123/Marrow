package kotlin;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class isCancelled {
    private final String AudioAttributesCompatParcelizer;
    private final String AudioAttributesImplApi21Parcelizer;
    private List<isDone> AudioAttributesImplApi26Parcelizer;
    private final String AudioAttributesImplBaseParcelizer;
    private List<String> IconCompatParcelizer;
    private final checkValidServerReply MediaBrowserCompatCustomActionResultReceiver;
    private final long MediaBrowserCompatItemReceiver;
    private List<Integer> RemoteActionCompatParcelizer;
    private SntpClient read;
    private final String write;

    public isCancelled(String str, String str2, List<String> list, List<Integer> list2, long j, String str3, checkValidServerReply checkvalidserverreply, String str4, SntpClient sntpClient, List<isDone> list3) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(list2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        toMagicModuleMetaRepoModel.write(checkvalidserverreply, "");
        toMagicModuleMetaRepoModel.write(str4, "");
        toMagicModuleMetaRepoModel.write(sntpClient, "");
        toMagicModuleMetaRepoModel.write(list3, "");
        this.AudioAttributesCompatParcelizer = str;
        this.write = str2;
        this.IconCompatParcelizer = list;
        this.RemoteActionCompatParcelizer = list2;
        this.MediaBrowserCompatItemReceiver = j;
        this.AudioAttributesImplBaseParcelizer = str3;
        this.MediaBrowserCompatCustomActionResultReceiver = checkvalidserverreply;
        this.AudioAttributesImplApi21Parcelizer = str4;
        this.read = sntpClient;
        this.AudioAttributesImplApi26Parcelizer = list3;
    }

    public final String RemoteActionCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final String write() {
        return this.write;
    }

    public final List<String> AudioAttributesCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final List<Integer> IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final long AudioAttributesImplApi21Parcelizer() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public final String MediaBrowserCompatCustomActionResultReceiver() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public final checkValidServerReply AudioAttributesImplBaseParcelizer() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final String AudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public final SntpClient read() {
        return this.read;
    }

    public final List<isDone> MediaBrowserCompatItemReceiver() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof isCancelled)) {
            return false;
        }
        isCancelled iscancelled = (isCancelled) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) iscancelled.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) iscancelled.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.IconCompatParcelizer, iscancelled.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, iscancelled.RemoteActionCompatParcelizer) && this.MediaBrowserCompatItemReceiver == iscancelled.MediaBrowserCompatItemReceiver && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesImplBaseParcelizer, (Object) iscancelled.AudioAttributesImplBaseParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver, iscancelled.MediaBrowserCompatCustomActionResultReceiver) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesImplApi21Parcelizer, (Object) iscancelled.AudioAttributesImplApi21Parcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.read, iscancelled.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesImplApi26Parcelizer, iscancelled.AudioAttributesImplApi26Parcelizer);
    }

    public final int hashCode() {
        return (((((((((((((((((this.AudioAttributesCompatParcelizer.hashCode() * 31) + this.write.hashCode()) * 31) + this.IconCompatParcelizer.hashCode()) * 31) + this.RemoteActionCompatParcelizer.hashCode()) * 31) + Long.hashCode(this.MediaBrowserCompatItemReceiver)) * 31) + this.AudioAttributesImplBaseParcelizer.hashCode()) * 31) + this.MediaBrowserCompatCustomActionResultReceiver.hashCode()) * 31) + this.AudioAttributesImplApi21Parcelizer.hashCode()) * 31) + this.read.hashCode()) * 31) + this.AudioAttributesImplApi26Parcelizer.hashCode();
    }

    public final String toString() {
        String str = this.AudioAttributesCompatParcelizer;
        String str2 = this.write;
        List<String> list = this.IconCompatParcelizer;
        List<Integer> list2 = this.RemoteActionCompatParcelizer;
        long j = this.MediaBrowserCompatItemReceiver;
        String str3 = this.AudioAttributesImplBaseParcelizer;
        checkValidServerReply checkvalidserverreply = this.MediaBrowserCompatCustomActionResultReceiver;
        String str4 = this.AudioAttributesImplApi21Parcelizer;
        SntpClient sntpClient = this.read;
        List<isDone> list3 = this.AudioAttributesImplApi26Parcelizer;
        StringBuilder sb = new StringBuilder("RecentUpdateUCModel(id=");
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
        sb.append(checkvalidserverreply);
        sb.append(", title=");
        sb.append(str4);
        sb.append(", image=");
        sb.append(sntpClient);
        sb.append(", tagsList=");
        sb.append(list3);
        sb.append(")");
        return sb.toString();
    }
}
