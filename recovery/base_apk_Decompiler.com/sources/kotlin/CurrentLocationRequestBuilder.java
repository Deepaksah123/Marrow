package kotlin;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u001a\b\u0002\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u001b\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u00070\u0006HÆ\u0003J9\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u001a\b\u0002\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u00070\u0006HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\bHÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR#\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/marrow2/ui/schema/schemaReview/model/SchemaFilterUIState;", "", "filterType", "Lcom/marrow2/domain/filter/model/CommonFilterType;", "cacheFilterType", "filterTypeCount", "", "Lkotlin/Pair;", "", "<init>", "(Lcom/marrow2/domain/filter/model/CommonFilterType;Lcom/marrow2/domain/filter/model/CommonFilterType;Ljava/util/List;)V", "getFilterType", "()Lcom/marrow2/domain/filter/model/CommonFilterType;", "getCacheFilterType", "getFilterTypeCount", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CurrentLocationRequestBuilder {
    private final List<Pair<getMediaMimeType, Integer>> IconCompatParcelizer;
    private final getMediaMimeType read;
    private final getMediaMimeType write;

    /* JADX WARN: Multi-variable type inference failed */
    private CurrentLocationRequestBuilder(getMediaMimeType getmediamimetype, getMediaMimeType getmediamimetype2, List<? extends Pair<? extends getMediaMimeType, Integer>> list) {
        toMagicModuleMetaRepoModel.write(getmediamimetype, "");
        toMagicModuleMetaRepoModel.write(getmediamimetype2, "");
        toMagicModuleMetaRepoModel.write(list, "");
        this.write = getmediamimetype;
        this.read = getmediamimetype2;
        this.IconCompatParcelizer = list;
    }

    public /* synthetic */ CurrentLocationRequestBuilder(getMediaMimeType getmediamimetype, getMediaMimeType getmediamimetype2, List list, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? getMediaMimeType.AudioAttributesImplBaseParcelizer : getmediamimetype, (i & 2) != 0 ? getMediaMimeType.AudioAttributesImplBaseParcelizer : getmediamimetype2, (i & 4) != 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list);
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final getMediaMimeType getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final getMediaMimeType getRead() {
        return this.read;
    }

    public final List<Pair<getMediaMimeType, Integer>> RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public CurrentLocationRequestBuilder() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ CurrentLocationRequestBuilder AudioAttributesCompatParcelizer(CurrentLocationRequestBuilder currentLocationRequestBuilder, getMediaMimeType getmediamimetype, getMediaMimeType getmediamimetype2, List list, int i) {
        if ((i & 1) != 0) {
            getmediamimetype = currentLocationRequestBuilder.write;
        }
        if ((i & 2) != 0) {
            getmediamimetype2 = currentLocationRequestBuilder.read;
        }
        if ((i & 4) != 0) {
            list = currentLocationRequestBuilder.IconCompatParcelizer;
        }
        return IconCompatParcelizer(getmediamimetype, getmediamimetype2, list);
    }

    public static CurrentLocationRequestBuilder IconCompatParcelizer(getMediaMimeType getmediamimetype, getMediaMimeType getmediamimetype2, List<? extends Pair<? extends getMediaMimeType, Integer>> list) {
        toMagicModuleMetaRepoModel.write(getmediamimetype, "");
        toMagicModuleMetaRepoModel.write(getmediamimetype2, "");
        toMagicModuleMetaRepoModel.write(list, "");
        return new CurrentLocationRequestBuilder(getmediamimetype, getmediamimetype2, list);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CurrentLocationRequestBuilder)) {
            return false;
        }
        CurrentLocationRequestBuilder currentLocationRequestBuilder = (CurrentLocationRequestBuilder) other;
        return this.write == currentLocationRequestBuilder.write && this.read == currentLocationRequestBuilder.read && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.IconCompatParcelizer, currentLocationRequestBuilder.IconCompatParcelizer);
    }

    public final int hashCode() {
        return (((this.write.hashCode() * 31) + this.read.hashCode()) * 31) + this.IconCompatParcelizer.hashCode();
    }

    public final String toString() {
        getMediaMimeType getmediamimetype = this.write;
        getMediaMimeType getmediamimetype2 = this.read;
        List<Pair<getMediaMimeType, Integer>> list = this.IconCompatParcelizer;
        StringBuilder sb = new StringBuilder("SchemaFilterUIState(filterType=");
        sb.append(getmediamimetype);
        sb.append(", cacheFilterType=");
        sb.append(getmediamimetype2);
        sb.append(", filterTypeCount=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }
}
