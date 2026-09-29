package kotlin;

import java.util.List;
import kotlin.Metadata;
import org.apache.commons.compress.archivers.zip.UnixStat;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u00010Bm\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0006HÆ\u0003J\u000f\u0010$\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\t\u0010%\u001a\u00020\u000bHÆ\u0003J\t\u0010&\u001a\u00020\rHÆ\u0003J\t\u0010'\u001a\u00020\rHÆ\u0003J\u000f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00100\bHÆ\u0003J\t\u0010)\u001a\u00020\u000bHÆ\u0003Jo\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\b2\b\b\u0002\u0010\u0011\u001a\u00020\u000bHÆ\u0001J\u0013\u0010+\u001a\u00020\u000b2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020.HÖ\u0001J\t\u0010/\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u001bR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u000e\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001aR\u0011\u0010\u0011\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001b¨\u00061"}, d2 = {"Lcom/marrow2/ui/schema/detail/model/SchemaDetailUiData;", "", "schemaId", "", "schemaTitle", "schemaUserDetail", "Lcom/marrow2/ui/schema/detail/model/SchemaScoreUIState;", "filterItems", "", "Lcom/marrow2/ui/schema/detail/model/SchemaDetailUiData$SchemaFilterCount;", "isFilterInExpandState", "", "selectedFilter", "Lcom/marrow2/ui/schema/detail/model/SchemaDetailFilterModel;", "appliedFilter", "schemaLessons", "Lcom/marrow2/domain/schema/model/SchemaDetailUCModel;", "showProLockScreen", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/marrow2/ui/schema/detail/model/SchemaScoreUIState;Ljava/util/List;ZLcom/marrow2/ui/schema/detail/model/SchemaDetailFilterModel;Lcom/marrow2/ui/schema/detail/model/SchemaDetailFilterModel;Ljava/util/List;Z)V", "getSchemaId", "()Ljava/lang/String;", "getSchemaTitle", "getSchemaUserDetail", "()Lcom/marrow2/ui/schema/detail/model/SchemaScoreUIState;", "getFilterItems", "()Ljava/util/List;", "()Z", "getSelectedFilter", "()Lcom/marrow2/ui/schema/detail/model/SchemaDetailFilterModel;", "getAppliedFilter", "getSchemaLessons", "getShowProLockScreen", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "SchemaFilterCount", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class zzli {
    private final boolean AudioAttributesCompatParcelizer;
    private final String AudioAttributesImplApi21Parcelizer;
    private final zzlk AudioAttributesImplApi26Parcelizer;
    private final boolean AudioAttributesImplBaseParcelizer;
    private final String IconCompatParcelizer;
    private final zzlq MediaBrowserCompatItemReceiver;
    private final List<obtainSystemMessage> RemoteActionCompatParcelizer;
    private final List<RemoteActionCompatParcelizer> read;
    private final zzlk write;

    private zzli(String str, String str2, zzlq zzlqVar, List<RemoteActionCompatParcelizer> list, boolean z, zzlk zzlkVar, zzlk zzlkVar2, List<obtainSystemMessage> list2, boolean z2) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(zzlqVar, "");
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(zzlkVar, "");
        toMagicModuleMetaRepoModel.write(zzlkVar2, "");
        toMagicModuleMetaRepoModel.write(list2, "");
        this.IconCompatParcelizer = str;
        this.AudioAttributesImplApi21Parcelizer = str2;
        this.MediaBrowserCompatItemReceiver = zzlqVar;
        this.read = list;
        this.AudioAttributesCompatParcelizer = z;
        this.AudioAttributesImplApi26Parcelizer = zzlkVar;
        this.write = zzlkVar2;
        this.RemoteActionCompatParcelizer = list2;
        this.AudioAttributesImplBaseParcelizer = z2;
    }

    public /* synthetic */ zzli(String str, String str2, zzlq zzlqVar, List list, boolean z, zzlk zzlkVar, zzlk zzlkVar2, List list2, boolean z2, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? "" : str, (i & 2) == 0 ? str2 : "", (i & 4) != 0 ? new zzlq(0, 0.0d, 0.0d, 0L, 0, 0, 0, 0, false, UnixStat.DEFAULT_LINK_PERM, null) : zzlqVar, (i & 8) != 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list, (i & 16) != 0 ? false : z, (i & 32) != 0 ? zzlk.RemoteActionCompatParcelizer : zzlkVar, (i & 64) != 0 ? zzlk.RemoteActionCompatParcelizer : zzlkVar2, (i & 128) != 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list2, (i & 256) == 0 ? z2 : false);
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final String getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final String getAudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from getter */
    public final zzlq getMediaBrowserCompatItemReceiver() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public final List<RemoteActionCompatParcelizer> write() {
        return this.read;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from getter */
    public final boolean getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from getter */
    public final zzlk getAudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final zzlk getWrite() {
        return this.write;
    }

    public final List<obtainSystemMessage> RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from getter */
    public final boolean getAudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public static final class RemoteActionCompatParcelizer {
        private final int RemoteActionCompatParcelizer;
        private final zzlk read;

        public RemoteActionCompatParcelizer(zzlk zzlkVar, int i) {
            toMagicModuleMetaRepoModel.write(zzlkVar, "");
            this.read = zzlkVar;
            this.RemoteActionCompatParcelizer = i;
        }

        public final zzlk AudioAttributesCompatParcelizer() {
            return this.read;
        }

        public final int RemoteActionCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RemoteActionCompatParcelizer)) {
                return false;
            }
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = (RemoteActionCompatParcelizer) obj;
            return this.read == remoteActionCompatParcelizer.read && this.RemoteActionCompatParcelizer == remoteActionCompatParcelizer.RemoteActionCompatParcelizer;
        }

        public final int hashCode() {
            return (this.read.hashCode() * 31) + Integer.hashCode(this.RemoteActionCompatParcelizer);
        }

        public final String toString() {
            zzlk zzlkVar = this.read;
            int i = this.RemoteActionCompatParcelizer;
            StringBuilder sb = new StringBuilder("SchemaFilterCount(type=");
            sb.append(zzlkVar);
            sb.append(", count=");
            sb.append(i);
            sb.append(")");
            return sb.toString();
        }
    }

    public zzli() {
        this(null, null, null, null, false, null, null, null, false, UnixStat.DEFAULT_LINK_PERM, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzli RemoteActionCompatParcelizer(String str, String str2, zzlq zzlqVar, List<RemoteActionCompatParcelizer> list, boolean z, zzlk zzlkVar, zzlk zzlkVar2, List<obtainSystemMessage> list2, boolean z2) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(zzlqVar, "");
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(zzlkVar, "");
        toMagicModuleMetaRepoModel.write(zzlkVar2, "");
        toMagicModuleMetaRepoModel.write(list2, "");
        return new zzli(str, str2, zzlqVar, list, z, zzlkVar, zzlkVar2, list2, z2);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof zzli)) {
            return false;
        }
        zzli zzliVar = (zzli) other;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) zzliVar.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesImplApi21Parcelizer, (Object) zzliVar.AudioAttributesImplApi21Parcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.MediaBrowserCompatItemReceiver, zzliVar.MediaBrowserCompatItemReceiver) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.read, zzliVar.read) && this.AudioAttributesCompatParcelizer == zzliVar.AudioAttributesCompatParcelizer && this.AudioAttributesImplApi26Parcelizer == zzliVar.AudioAttributesImplApi26Parcelizer && this.write == zzliVar.write && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, zzliVar.RemoteActionCompatParcelizer) && this.AudioAttributesImplBaseParcelizer == zzliVar.AudioAttributesImplBaseParcelizer;
    }

    public final int hashCode() {
        return (((((((((((((((this.IconCompatParcelizer.hashCode() * 31) + this.AudioAttributesImplApi21Parcelizer.hashCode()) * 31) + this.MediaBrowserCompatItemReceiver.hashCode()) * 31) + this.read.hashCode()) * 31) + Boolean.hashCode(this.AudioAttributesCompatParcelizer)) * 31) + this.AudioAttributesImplApi26Parcelizer.hashCode()) * 31) + this.write.hashCode()) * 31) + this.RemoteActionCompatParcelizer.hashCode()) * 31) + Boolean.hashCode(this.AudioAttributesImplBaseParcelizer);
    }

    public final String toString() {
        String str = this.IconCompatParcelizer;
        String str2 = this.AudioAttributesImplApi21Parcelizer;
        zzlq zzlqVar = this.MediaBrowserCompatItemReceiver;
        List<RemoteActionCompatParcelizer> list = this.read;
        boolean z = this.AudioAttributesCompatParcelizer;
        zzlk zzlkVar = this.AudioAttributesImplApi26Parcelizer;
        zzlk zzlkVar2 = this.write;
        List<obtainSystemMessage> list2 = this.RemoteActionCompatParcelizer;
        boolean z2 = this.AudioAttributesImplBaseParcelizer;
        StringBuilder sb = new StringBuilder("SchemaDetailUiData(schemaId=");
        sb.append(str);
        sb.append(", schemaTitle=");
        sb.append(str2);
        sb.append(", schemaUserDetail=");
        sb.append(zzlqVar);
        sb.append(", filterItems=");
        sb.append(list);
        sb.append(", isFilterInExpandState=");
        sb.append(z);
        sb.append(", selectedFilter=");
        sb.append(zzlkVar);
        sb.append(", appliedFilter=");
        sb.append(zzlkVar2);
        sb.append(", schemaLessons=");
        sb.append(list2);
        sb.append(", showProLockScreen=");
        sb.append(z2);
        sb.append(")");
        return sb.toString();
    }
}
