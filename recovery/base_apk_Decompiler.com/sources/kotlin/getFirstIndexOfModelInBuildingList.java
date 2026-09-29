package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0017B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ.\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0013\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u001a\u0010\t\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a"}, d2 = {"Lo/getFirstIndexOfModelInBuildingList;", "", "Lo/getFirstIndexOfModelInBuildingList$IconCompatParcelizer;", "p0", "p1", "", "p2", "<init>", "(Lo/getFirstIndexOfModelInBuildingList$IconCompatParcelizer;Lo/getFirstIndexOfModelInBuildingList$IconCompatParcelizer;Z)V", "RemoteActionCompatParcelizer", "(Lo/getFirstIndexOfModelInBuildingList$IconCompatParcelizer;Lo/getFirstIndexOfModelInBuildingList$IconCompatParcelizer;Z)Lo/getFirstIndexOfModelInBuildingList;", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "AudioAttributesCompatParcelizer", "Lo/getFirstIndexOfModelInBuildingList$IconCompatParcelizer;", "write", "()Lo/getFirstIndexOfModelInBuildingList$IconCompatParcelizer;", "IconCompatParcelizer", "read", "Z", "()Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class getFirstIndexOfModelInBuildingList {
    private final IconCompatParcelizer AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final boolean RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final IconCompatParcelizer IconCompatParcelizer;

    public getFirstIndexOfModelInBuildingList(IconCompatParcelizer iconCompatParcelizer, IconCompatParcelizer iconCompatParcelizer2, boolean z) {
        this.AudioAttributesCompatParcelizer = iconCompatParcelizer;
        this.IconCompatParcelizer = iconCompatParcelizer2;
        this.RemoteActionCompatParcelizer = z;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final IconCompatParcelizer getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final IconCompatParcelizer getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final boolean getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public static /* synthetic */ getFirstIndexOfModelInBuildingList RemoteActionCompatParcelizer$default(getFirstIndexOfModelInBuildingList getfirstindexofmodelinbuildinglist, IconCompatParcelizer iconCompatParcelizer, IconCompatParcelizer iconCompatParcelizer2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            iconCompatParcelizer = getfirstindexofmodelinbuildinglist.AudioAttributesCompatParcelizer;
        }
        if ((i & 2) != 0) {
            iconCompatParcelizer2 = getfirstindexofmodelinbuildinglist.IconCompatParcelizer;
        }
        if ((i & 4) != 0) {
            z = getfirstindexofmodelinbuildinglist.RemoteActionCompatParcelizer;
        }
        return getfirstindexofmodelinbuildinglist.RemoteActionCompatParcelizer(iconCompatParcelizer, iconCompatParcelizer2, z);
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ.\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0014\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0014\u0010\u0010R\u001a\u0010\n\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0016\u0010\u001b"}, d2 = {"Lo/getFirstIndexOfModelInBuildingList$IconCompatParcelizer;", "", "Lo/_properties;", "p0", "", "p1", "", "p2", "<init>", "(Lo/_properties;IJ)V", "IconCompatParcelizer", "(Lo/_properties;IJ)Lo/getFirstIndexOfModelInBuildingList$IconCompatParcelizer;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "read", "Lo/_properties;", "RemoteActionCompatParcelizer", "AudioAttributesCompatParcelizer", "I", "write", "J", "()J"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class IconCompatParcelizer {

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
        private final int read;

        /* JADX INFO: renamed from: read, reason: from kotlin metadata */
        private final _properties RemoteActionCompatParcelizer;

        /* JADX INFO: renamed from: write, reason: from kotlin metadata */
        private final long IconCompatParcelizer;

        public IconCompatParcelizer(_properties _propertiesVar, int i, long j) {
            this.RemoteActionCompatParcelizer = _propertiesVar;
            this.read = i;
            this.IconCompatParcelizer = j;
        }

        /* JADX INFO: renamed from: read, reason: from getter */
        public final int getRead() {
            return this.read;
        }

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
        public final long getIconCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        public static /* synthetic */ IconCompatParcelizer IconCompatParcelizer$default(IconCompatParcelizer iconCompatParcelizer, _properties _propertiesVar, int i, long j, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                _propertiesVar = iconCompatParcelizer.RemoteActionCompatParcelizer;
            }
            if ((i2 & 2) != 0) {
                i = iconCompatParcelizer.read;
            }
            if ((i2 & 4) != 0) {
                j = iconCompatParcelizer.IconCompatParcelizer;
            }
            return iconCompatParcelizer.IconCompatParcelizer(_propertiesVar, i, j);
        }

        public final IconCompatParcelizer IconCompatParcelizer(_properties p0, int p1, long p2) {
            return new IconCompatParcelizer(p0, p1, p2);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof IconCompatParcelizer)) {
                return false;
            }
            IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) p0;
            return this.RemoteActionCompatParcelizer == iconCompatParcelizer.RemoteActionCompatParcelizer && this.read == iconCompatParcelizer.read && this.IconCompatParcelizer == iconCompatParcelizer.IconCompatParcelizer;
        }

        public final int hashCode() {
            return (((this.RemoteActionCompatParcelizer.hashCode() * 31) + Integer.hashCode(this.read)) * 31) + Long.hashCode(this.IconCompatParcelizer);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("IconCompatParcelizer(RemoteActionCompatParcelizer=");
            sb.append(this.RemoteActionCompatParcelizer);
            sb.append(", read=");
            sb.append(this.read);
            sb.append(", IconCompatParcelizer=");
            sb.append(this.IconCompatParcelizer);
            sb.append(')');
            return sb.toString();
        }
    }

    public final getFirstIndexOfModelInBuildingList RemoteActionCompatParcelizer(IconCompatParcelizer p0, IconCompatParcelizer p1, boolean p2) {
        return new getFirstIndexOfModelInBuildingList(p0, p1, p2);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof getFirstIndexOfModelInBuildingList)) {
            return false;
        }
        getFirstIndexOfModelInBuildingList getfirstindexofmodelinbuildinglist = (getFirstIndexOfModelInBuildingList) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, getfirstindexofmodelinbuildinglist.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.IconCompatParcelizer, getfirstindexofmodelinbuildinglist.IconCompatParcelizer) && this.RemoteActionCompatParcelizer == getfirstindexofmodelinbuildinglist.RemoteActionCompatParcelizer;
    }

    public final int hashCode() {
        return (((this.AudioAttributesCompatParcelizer.hashCode() * 31) + this.IconCompatParcelizer.hashCode()) * 31) + Boolean.hashCode(this.RemoteActionCompatParcelizer);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("getFirstIndexOfModelInBuildingList(AudioAttributesCompatParcelizer=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(", IconCompatParcelizer=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", RemoteActionCompatParcelizer=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(')');
        return sb.toString();
    }
}
