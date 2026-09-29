package com.marrow.data.models.test;

import java.util.List;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J4\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0013\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\fR\u001a\u0010\u0019\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\fR \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u000eR\"\u0010\u001f\u001a\u00020\u00078\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010\u0010\"\u0004\b!\u0010\""}, d2 = {"Lcom/marrow/data/models/test/ShowHideItems;", "", "", "p0", "", "Lcom/marrow/data/models/test/Month;", "p1", "", "p2", "<init>", "(Ljava/lang/String;Ljava/util/List;Z)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "()Z", "copy", "(Ljava/lang/String;Ljava/util/List;Z)Lcom/marrow/data/models/test/ShowHideItems;", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "id", "Ljava/lang/String;", "getId", "hiddenList", "Ljava/util/List;", "getHiddenList", "isExpanded", "Z", "setExpanded", "(Z)V"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ShowHideItems {
    private final List<Month> hiddenList;
    private final String id;
    private boolean isExpanded;

    public ShowHideItems(String str, List<Month> list, boolean z) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(list, "");
        this.id = str;
        this.hiddenList = list;
        this.isExpanded = z;
    }

    public final String getId() {
        return this.id;
    }

    public final List<Month> getHiddenList() {
        return this.hiddenList;
    }

    public final boolean isExpanded() {
        return this.isExpanded;
    }

    public final void setExpanded(boolean z) {
        this.isExpanded = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ShowHideItems copy$default(ShowHideItems showHideItems, String str, List list, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = showHideItems.id;
        }
        if ((i & 2) != 0) {
            list = showHideItems.hiddenList;
        }
        if ((i & 4) != 0) {
            z = showHideItems.isExpanded;
        }
        return showHideItems.copy(str, list, z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final List<Month> component2() {
        return this.hiddenList;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsExpanded() {
        return this.isExpanded;
    }

    public final ShowHideItems copy(String p0, List<Month> p1, boolean p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        return new ShowHideItems(p0, p1, p2);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof ShowHideItems)) {
            return false;
        }
        ShowHideItems showHideItems = (ShowHideItems) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.id, (Object) showHideItems.id) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.hiddenList, showHideItems.hiddenList) && this.isExpanded == showHideItems.isExpanded;
    }

    public final int hashCode() {
        return (((this.id.hashCode() * 31) + this.hiddenList.hashCode()) * 31) + Boolean.hashCode(this.isExpanded);
    }

    public final String toString() {
        String str = this.id;
        List<Month> list = this.hiddenList;
        boolean z = this.isExpanded;
        StringBuilder sb = new StringBuilder("ShowHideItems(id=");
        sb.append(str);
        sb.append(", hiddenList=");
        sb.append(list);
        sb.append(", isExpanded=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }
}
