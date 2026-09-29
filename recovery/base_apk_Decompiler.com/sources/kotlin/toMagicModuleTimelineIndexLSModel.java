package kotlin;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fJ\u001a\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\n8\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\r\u0010\fR\u001a\u0010\u0014\u001a\u00020\u00138\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u000f\u0010\u0016R\u001e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00178\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0019R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u001a"}, d2 = {"Lo/toMagicModuleTimelineIndexLSModel;", "Lo/deleteCourseTables;", "", "p0", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "write", "Ljava/lang/Object;", "AudioAttributesCompatParcelizer", "IconCompatParcelizer", "Ljava/lang/String;", "read", "Lo/deleteSearchTables;", "RemoteActionCompatParcelizer", "Lo/deleteSearchTables;", "()Lo/deleteSearchTables;", "", "Lo/deleteOfflineDownloadedFiles;", "Ljava/util/List;", "()Ljava/util/List;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class toMagicModuleTimelineIndexLSModel implements deleteCourseTables {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final String read;
    private final deleteSearchTables RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private volatile List<? extends deleteOfflineDownloadedFiles> write;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final Object AudioAttributesCompatParcelizer;

    @Override // kotlin.deleteCourseTables
    /* JADX INFO: renamed from: write, reason: from getter */
    public final String getRead() {
        return this.read;
    }

    @Override // kotlin.deleteCourseTables
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final deleteSearchTables getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // kotlin.deleteCourseTables
    public final List<deleteOfflineDownloadedFiles> RemoteActionCompatParcelizer() {
        List list = this.write;
        if (list != null) {
            return list;
        }
        List<deleteOfflineDownloadedFiles> listRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer(toMagicModuleMetaDataUcModel.read(Object.class));
        this.write = listRemoteActionCompatParcelizer;
        return listRemoteActionCompatParcelizer;
    }

    public final boolean equals(Object p0) {
        if (!(p0 instanceof toMagicModuleTimelineIndexLSModel)) {
            return false;
        }
        toMagicModuleTimelineIndexLSModel tomagicmoduletimelineindexlsmodel = (toMagicModuleTimelineIndexLSModel) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) null, tomagicmoduletimelineindexlsmodel.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) getRead(), (Object) tomagicmoduletimelineindexlsmodel.getRead());
    }

    public final int hashCode() {
        return getRead().hashCode();
    }

    public final String toString() {
        return Companion.IconCompatParcelizer(this);
    }

    /* JADX INFO: renamed from: o.toMagicModuleTimelineIndexLSModel$AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/toMagicModuleTimelineIndexLSModel$AudioAttributesCompatParcelizer;", "", "<init>", "()V", "Lo/deleteCourseTables;", "p0", "", "IconCompatParcelizer", "(Lo/deleteCourseTables;)Ljava/lang/String;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: o.toMagicModuleTimelineIndexLSModel$AudioAttributesCompatParcelizer$IconCompatParcelizer */
        public static final /* synthetic */ class IconCompatParcelizer {
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

        private Companion() {
        }

        public static String IconCompatParcelizer(deleteCourseTables p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            StringBuilder sb = new StringBuilder();
            int i = IconCompatParcelizer.write[p0.getRemoteActionCompatParcelizer().ordinal()];
            if (i == 1) {
                getShowPopup getshowpopup = getShowPopup.INSTANCE;
            } else if (i == 2) {
                sb.append("in ");
            } else {
                if (i != 3) {
                    throw new RenewEligibleCreator();
                }
                sb.append("out ");
            }
            sb.append(p0.getRead());
            return sb.toString();
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
