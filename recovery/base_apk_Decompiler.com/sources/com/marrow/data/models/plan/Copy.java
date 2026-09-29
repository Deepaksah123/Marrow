package com.marrow.data.models.plan;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\tR\u0017\u0010\u0015\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0018\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/marrow/data/models/plan/Copy;", "", "", "p0", "Lcom/marrow/data/models/plan/Link;", "p1", "<init>", "(Ljava/lang/String;Lcom/marrow/data/models/plan/Link;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/marrow/data/models/plan/Link;", "copy", "(Ljava/lang/String;Lcom/marrow/data/models/plan/Link;)Lcom/marrow/data/models/plan/Copy;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "mainCopy", "Ljava/lang/String;", "getMainCopy", "link", "Lcom/marrow/data/models/plan/Link;", "getLink"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Copy {
    private final Link link;
    private final String mainCopy;

    public Copy(@JsonProperty("main_copy") String str, @JsonProperty("link") Link link) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(link, "");
        this.mainCopy = str;
        this.link = link;
    }

    public final String getMainCopy() {
        return this.mainCopy;
    }

    public final Link getLink() {
        return this.link;
    }

    public static /* synthetic */ Copy copy$default(Copy copy, String str, Link link, int i, Object obj) {
        if ((i & 1) != 0) {
            str = copy.mainCopy;
        }
        if ((i & 2) != 0) {
            link = copy.link;
        }
        return copy.copy(str, link);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMainCopy() {
        return this.mainCopy;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Link getLink() {
        return this.link;
    }

    public final Copy copy(@JsonProperty("main_copy") String p0, @JsonProperty("link") Link p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        return new Copy(p0, p1);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof Copy)) {
            return false;
        }
        Copy copy = (Copy) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.mainCopy, (Object) copy.mainCopy) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.link, copy.link);
    }

    public final int hashCode() {
        return (this.mainCopy.hashCode() * 31) + this.link.hashCode();
    }

    public final String toString() {
        String str = this.mainCopy;
        Link link = this.link;
        StringBuilder sb = new StringBuilder("Copy(mainCopy=");
        sb.append(str);
        sb.append(", link=");
        sb.append(link);
        sb.append(")");
        return sb.toString();
    }
}
