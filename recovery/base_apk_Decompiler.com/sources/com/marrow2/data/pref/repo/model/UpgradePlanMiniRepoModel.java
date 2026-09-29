package com.marrow2.data.pref.repo.model;

import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\tR\u0017\u0010\u0015\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0018\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u001a\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\t"}, d2 = {"Lcom/marrow2/data/pref/repo/model/UpgradePlanMiniRepoModel;", "", "", "p0", "p1", "p2", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/marrow2/data/pref/repo/model/UpgradePlanMiniRepoModel;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "id", "Ljava/lang/String;", "getId", "title", "getTitle", "description", "getDescription"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class UpgradePlanMiniRepoModel {
    public static final int $stable = 0;
    private final String description;
    private final String id;
    private final String title;

    public UpgradePlanMiniRepoModel(String str, String str2, String str3) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        this.id = str;
        this.title = str2;
        this.description = str3;
    }

    public /* synthetic */ UpgradePlanMiniRepoModel(String str, String str2, String str3, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }

    public final String getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getDescription() {
        return this.description;
    }

    public UpgradePlanMiniRepoModel() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ UpgradePlanMiniRepoModel copy$default(UpgradePlanMiniRepoModel upgradePlanMiniRepoModel, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = upgradePlanMiniRepoModel.id;
        }
        if ((i & 2) != 0) {
            str2 = upgradePlanMiniRepoModel.title;
        }
        if ((i & 4) != 0) {
            str3 = upgradePlanMiniRepoModel.description;
        }
        return upgradePlanMiniRepoModel.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    public final UpgradePlanMiniRepoModel copy(String p0, String p1, String p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        return new UpgradePlanMiniRepoModel(p0, p1, p2);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof UpgradePlanMiniRepoModel)) {
            return false;
        }
        UpgradePlanMiniRepoModel upgradePlanMiniRepoModel = (UpgradePlanMiniRepoModel) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.id, (Object) upgradePlanMiniRepoModel.id) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.title, (Object) upgradePlanMiniRepoModel.title) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.description, (Object) upgradePlanMiniRepoModel.description);
    }

    public final int hashCode() {
        return (((this.id.hashCode() * 31) + this.title.hashCode()) * 31) + this.description.hashCode();
    }

    public final String toString() {
        String str = this.id;
        String str2 = this.title;
        String str3 = this.description;
        StringBuilder sb = new StringBuilder("UpgradePlanMiniRepoModel(id=");
        sb.append(str);
        sb.append(", title=");
        sb.append(str2);
        sb.append(", description=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }
}
