package com.marrow.data.dataprovider.magic_module.remote.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ&\u0010\n\u001a\u00020\u00002\u0014\b\u0003\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R&\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\t"}, d2 = {"Lcom/marrow/data/dataprovider/magic_module/remote/model/MagicModuleSubmissionRequestBody;", "", "", "", "", "p0", "<init>", "(Ljava/util/Map;)V", "component1", "()Ljava/util/Map;", "copy", "(Ljava/util/Map;)Lcom/marrow/data/dataprovider/magic_module/remote/model/MagicModuleSubmissionRequestBody;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "result", "Ljava/util/Map;", "getResult"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MagicModuleSubmissionRequestBody {
    private final Map<String, Integer> result;

    public MagicModuleSubmissionRequestBody(@JsonProperty("result") Map<String, Integer> map) {
        toMagicModuleMetaRepoModel.write(map, "");
        this.result = map;
    }

    public final Map<String, Integer> getResult() {
        return this.result;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MagicModuleSubmissionRequestBody copy$default(MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            map = magicModuleSubmissionRequestBody.result;
        }
        return magicModuleSubmissionRequestBody.copy(map);
    }

    public final Map<String, Integer> component1() {
        return this.result;
    }

    public final MagicModuleSubmissionRequestBody copy(@JsonProperty("result") Map<String, Integer> p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return new MagicModuleSubmissionRequestBody(p0);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        return (p0 instanceof MagicModuleSubmissionRequestBody) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.result, ((MagicModuleSubmissionRequestBody) p0).result);
    }

    public final int hashCode() {
        return this.result.hashCode();
    }

    public final String toString() {
        Map<String, Integer> map = this.result;
        StringBuilder sb = new StringBuilder("MagicModuleSubmissionRequestBody(result=");
        sb.append(map);
        sb.append(")");
        return sb.toString();
    }
}
