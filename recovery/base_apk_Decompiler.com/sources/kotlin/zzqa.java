package kotlin;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u001a\b\u0002\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\b\u0012\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\r0\b¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\u001b\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\bHÆ\u0003J\u0015\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\r0\bHÆ\u0003JY\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u001a\b\u0002\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\b2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\r0\bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u00032\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\rHÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R#\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\r0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016¨\u0006#"}, d2 = {"Lcom/marrow2/ui/schema/listing/model/SchemaListUIState;", "", "showInfoPopup", "", "showSortingDropdown", "currentSelectedSortOption", "Lcom/marrow2/ui/schema/listing/model/SchemaSortOptions;", "schemaListCharMap", "", "", "", "Lcom/marrow2/domain/schema/model/SchemaItemUCModel;", "listOfScrollHeaderPosition", "", "<init>", "(ZZLcom/marrow2/ui/schema/listing/model/SchemaSortOptions;Ljava/util/Map;Ljava/util/Map;)V", "getShowInfoPopup", "()Z", "getShowSortingDropdown", "getCurrentSelectedSortOption", "()Lcom/marrow2/ui/schema/listing/model/SchemaSortOptions;", "getSchemaListCharMap", "()Ljava/util/Map;", "getListOfScrollHeaderPosition", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class zzqa {
    private final Map<Character, Integer> AudioAttributesCompatParcelizer;
    private final zzpy IconCompatParcelizer;
    private final boolean RemoteActionCompatParcelizer;
    private final Map<Character, List<SystemHandlerWrapper1>> read;
    private final boolean write;

    /* JADX WARN: Multi-variable type inference failed */
    private zzqa(boolean z, boolean z2, zzpy zzpyVar, Map<Character, ? extends List<SystemHandlerWrapper1>> map, Map<Character, Integer> map2) {
        toMagicModuleMetaRepoModel.write(zzpyVar, "");
        toMagicModuleMetaRepoModel.write(map, "");
        toMagicModuleMetaRepoModel.write(map2, "");
        this.write = z;
        this.RemoteActionCompatParcelizer = z2;
        this.IconCompatParcelizer = zzpyVar;
        this.read = map;
        this.AudioAttributesCompatParcelizer = map2;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final boolean getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final boolean getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public /* synthetic */ zzqa(boolean z, boolean z2, zzpy zzpyVar, Map map, Map map2, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? zzpy.IconCompatParcelizer : zzpyVar, (i & 8) != 0 ? VideoTimelineResponseBody.read() : map, (i & 16) != 0 ? VideoTimelineResponseBody.read() : map2);
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final zzpy getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final Map<Character, List<SystemHandlerWrapper1>> IconCompatParcelizer() {
        return this.read;
    }

    public final Map<Character, Integer> AudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public zzqa() {
        this(false, false, null, null, null, 31, null);
    }

    public static /* synthetic */ zzqa IconCompatParcelizer(zzqa zzqaVar, boolean z, boolean z2, zzpy zzpyVar, Map map, Map map2, int i) {
        if ((i & 1) != 0) {
            z = zzqaVar.write;
        }
        if ((i & 2) != 0) {
            z2 = zzqaVar.RemoteActionCompatParcelizer;
        }
        if ((i & 4) != 0) {
            zzpyVar = zzqaVar.IconCompatParcelizer;
        }
        if ((i & 8) != 0) {
            map = zzqaVar.read;
        }
        if ((i & 16) != 0) {
            map2 = zzqaVar.AudioAttributesCompatParcelizer;
        }
        return read(z, z2, zzpyVar, map, map2);
    }

    private static zzqa read(boolean z, boolean z2, zzpy zzpyVar, Map<Character, ? extends List<SystemHandlerWrapper1>> map, Map<Character, Integer> map2) {
        toMagicModuleMetaRepoModel.write(zzpyVar, "");
        toMagicModuleMetaRepoModel.write(map, "");
        toMagicModuleMetaRepoModel.write(map2, "");
        return new zzqa(z, z2, zzpyVar, map, map2);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof zzqa)) {
            return false;
        }
        zzqa zzqaVar = (zzqa) other;
        return this.write == zzqaVar.write && this.RemoteActionCompatParcelizer == zzqaVar.RemoteActionCompatParcelizer && this.IconCompatParcelizer == zzqaVar.IconCompatParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.read, zzqaVar.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, zzqaVar.AudioAttributesCompatParcelizer);
    }

    public final int hashCode() {
        return (((((((Boolean.hashCode(this.write) * 31) + Boolean.hashCode(this.RemoteActionCompatParcelizer)) * 31) + this.IconCompatParcelizer.hashCode()) * 31) + this.read.hashCode()) * 31) + this.AudioAttributesCompatParcelizer.hashCode();
    }

    public final String toString() {
        boolean z = this.write;
        boolean z2 = this.RemoteActionCompatParcelizer;
        zzpy zzpyVar = this.IconCompatParcelizer;
        Map<Character, List<SystemHandlerWrapper1>> map = this.read;
        Map<Character, Integer> map2 = this.AudioAttributesCompatParcelizer;
        StringBuilder sb = new StringBuilder("SchemaListUIState(showInfoPopup=");
        sb.append(z);
        sb.append(", showSortingDropdown=");
        sb.append(z2);
        sb.append(", currentSelectedSortOption=");
        sb.append(zzpyVar);
        sb.append(", schemaListCharMap=");
        sb.append(map);
        sb.append(", listOfScrollHeaderPosition=");
        sb.append(map2);
        sb.append(")");
        return sb.toString();
    }
}
