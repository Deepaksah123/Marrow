package com.marrow.data.dataprovider.magic_module.remote.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0001\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ4\u0010\u0010\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\u000e\b\u0003\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000bJ\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\rR\u0017\u0010\u0017\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u000bR\u001a\u0010\u001a\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\rR \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/marrow/data/dataprovider/magic_module/remote/model/MagicModuleFeedbackRequestBody;", "", "", "p0", "", "p1", "", "p2", "<init>", "(ILjava/lang/String;Ljava/util/List;)V", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "()Ljava/util/List;", "copy", "(ILjava/lang/String;Ljava/util/List;)Lcom/marrow/data/dataprovider/magic_module/remote/model/MagicModuleFeedbackRequestBody;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "rating", "I", "getRating", "comment", "Ljava/lang/String;", "getComment", "feedbacks", "Ljava/util/List;", "getFeedbacks"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MagicModuleFeedbackRequestBody {
    private final String comment;
    private final List<String> feedbacks;
    private final int rating;

    public MagicModuleFeedbackRequestBody(@JsonProperty("rating") int i, @JsonProperty("comment") String str, @JsonProperty("feedbacks") List<String> list) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(list, "");
        this.rating = i;
        this.comment = str;
        this.feedbacks = list;
    }

    public final int getRating() {
        return this.rating;
    }

    public /* synthetic */ MagicModuleFeedbackRequestBody(int i, String str, List list, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, list);
    }

    public final String getComment() {
        return this.comment;
    }

    public final List<String> getFeedbacks() {
        return this.feedbacks;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MagicModuleFeedbackRequestBody copy$default(MagicModuleFeedbackRequestBody magicModuleFeedbackRequestBody, int i, String str, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = magicModuleFeedbackRequestBody.rating;
        }
        if ((i2 & 2) != 0) {
            str = magicModuleFeedbackRequestBody.comment;
        }
        if ((i2 & 4) != 0) {
            list = magicModuleFeedbackRequestBody.feedbacks;
        }
        return magicModuleFeedbackRequestBody.copy(i, str, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getRating() {
        return this.rating;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getComment() {
        return this.comment;
    }

    public final List<String> component3() {
        return this.feedbacks;
    }

    public final MagicModuleFeedbackRequestBody copy(@JsonProperty("rating") int p0, @JsonProperty("comment") String p1, @JsonProperty("feedbacks") List<String> p2) {
        toMagicModuleMetaRepoModel.write(p1, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        return new MagicModuleFeedbackRequestBody(p0, p1, p2);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof MagicModuleFeedbackRequestBody)) {
            return false;
        }
        MagicModuleFeedbackRequestBody magicModuleFeedbackRequestBody = (MagicModuleFeedbackRequestBody) p0;
        return this.rating == magicModuleFeedbackRequestBody.rating && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.comment, (Object) magicModuleFeedbackRequestBody.comment) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.feedbacks, magicModuleFeedbackRequestBody.feedbacks);
    }

    public final int hashCode() {
        return (((Integer.hashCode(this.rating) * 31) + this.comment.hashCode()) * 31) + this.feedbacks.hashCode();
    }

    public final String toString() {
        int i = this.rating;
        String str = this.comment;
        List<String> list = this.feedbacks;
        StringBuilder sb = new StringBuilder("MagicModuleFeedbackRequestBody(rating=");
        sb.append(i);
        sb.append(", comment=");
        sb.append(str);
        sb.append(", feedbacks=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }
}
