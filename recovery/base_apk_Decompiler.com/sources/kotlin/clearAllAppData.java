package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\fR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0018\u001a\u0004\b\u0019\u0010\u000e"}, d2 = {"Lo/clearAllAppData;", "", "Lo/deleteSearchTables;", "p0", "Lo/deleteOfflineDownloadedFiles;", "p1", "<init>", "(Lo/deleteSearchTables;Lo/deleteOfflineDownloadedFiles;)V", "", "toString", "()Ljava/lang/String;", "AudioAttributesCompatParcelizer", "()Lo/deleteSearchTables;", "IconCompatParcelizer", "()Lo/deleteOfflineDownloadedFiles;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "write", "Lo/deleteSearchTables;", "RemoteActionCompatParcelizer", "Lo/deleteOfflineDownloadedFiles;", "read"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class clearAllAppData {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final clearAllAppData RemoteActionCompatParcelizer = new clearAllAppData(null, null);
    private final deleteOfflineDownloadedFiles IconCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final deleteSearchTables RemoteActionCompatParcelizer;

    public static final /* synthetic */ class write {
        public static final /* synthetic */ int[] write;

        static {
            int[] iArr = new int[deleteSearchTables.values().length];
            try {
                iArr[deleteSearchTables.AudioAttributesCompatParcelizer.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[deleteSearchTables.IconCompatParcelizer.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[deleteSearchTables.read.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            write = iArr;
        }
    }

    public clearAllAppData(deleteSearchTables deletesearchtables, deleteOfflineDownloadedFiles deleteofflinedownloadedfiles) {
        String string;
        this.RemoteActionCompatParcelizer = deletesearchtables;
        this.IconCompatParcelizer = deleteofflinedownloadedfiles;
        if ((deletesearchtables == null) == (deleteofflinedownloadedfiles == null)) {
            return;
        }
        if (deletesearchtables == null) {
            string = "Star projection must have no type specified.";
        } else {
            StringBuilder sb = new StringBuilder("The projection variance ");
            sb.append(deletesearchtables);
            sb.append(" requires type to be specified.");
            string = sb.toString();
        }
        throw new IllegalArgumentException(string.toString());
    }

    public final deleteSearchTables RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final deleteOfflineDownloadedFiles read() {
        return this.IconCompatParcelizer;
    }

    public final String toString() {
        deleteSearchTables deletesearchtables = this.RemoteActionCompatParcelizer;
        int i = deletesearchtables == null ? -1 : write.write[deletesearchtables.ordinal()];
        if (i == -1) {
            return "*";
        }
        if (i == 1) {
            return String.valueOf(this.IconCompatParcelizer);
        }
        if (i == 2) {
            StringBuilder sb = new StringBuilder("in ");
            sb.append(this.IconCompatParcelizer);
            return sb.toString();
        }
        if (i != 3) {
            throw new RenewEligibleCreator();
        }
        StringBuilder sb2 = new StringBuilder("out ");
        sb2.append(this.IconCompatParcelizer);
        return sb2.toString();
    }

    /* JADX INFO: renamed from: o.clearAllAppData$AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0011\u0010\u0007\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b\t\u0010\r"}, d2 = {"Lo/clearAllAppData$AudioAttributesCompatParcelizer;", "", "<init>", "()V", "Lo/deleteOfflineDownloadedFiles;", "p0", "Lo/clearAllAppData;", "AudioAttributesCompatParcelizer", "(Lo/deleteOfflineDownloadedFiles;)Lo/clearAllAppData;", "write", "IconCompatParcelizer", "RemoteActionCompatParcelizer", "Lo/clearAllAppData;", "()Lo/clearAllAppData;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static clearAllAppData write() {
            return clearAllAppData.RemoteActionCompatParcelizer;
        }

        @getMagicModuleMeta
        public static clearAllAppData AudioAttributesCompatParcelizer(deleteOfflineDownloadedFiles p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return new clearAllAppData(deleteSearchTables.AudioAttributesCompatParcelizer, p0);
        }

        @getMagicModuleMeta
        public static clearAllAppData write(deleteOfflineDownloadedFiles p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return new clearAllAppData(deleteSearchTables.IconCompatParcelizer, p0);
        }

        @getMagicModuleMeta
        public static clearAllAppData IconCompatParcelizer(deleteOfflineDownloadedFiles p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return new clearAllAppData(deleteSearchTables.read, p0);
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final deleteSearchTables getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final deleteOfflineDownloadedFiles getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof clearAllAppData)) {
            return false;
        }
        clearAllAppData clearallappdata = (clearAllAppData) p0;
        return this.RemoteActionCompatParcelizer == clearallappdata.RemoteActionCompatParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.IconCompatParcelizer, clearallappdata.IconCompatParcelizer);
    }

    public final int hashCode() {
        deleteSearchTables deletesearchtables = this.RemoteActionCompatParcelizer;
        int iHashCode = deletesearchtables == null ? 0 : deletesearchtables.hashCode();
        deleteOfflineDownloadedFiles deleteofflinedownloadedfiles = this.IconCompatParcelizer;
        return (iHashCode * 31) + (deleteofflinedownloadedfiles != null ? deleteofflinedownloadedfiles.hashCode() : 0);
    }
}
