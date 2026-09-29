package com.marrow.data.api.models.request.video;

import android.os.Build;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\tR\u0017\u0010\u0015\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0018\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u001a\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\t"}, d2 = {"Lcom/marrow/data/api/models/request/video/UserDeviceInfoModel;", "", "", "p0", "p1", "p2", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/marrow/data/api/models/request/video/UserDeviceInfoModel;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "brandName", "Ljava/lang/String;", "getBrandName", "modelName", "getModelName", "osVariant", "getOsVariant"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class UserDeviceInfoModel {
    private final String brandName;
    private final String modelName;
    private final String osVariant;

    public UserDeviceInfoModel(String str, String str2, String str3) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        this.brandName = str;
        this.modelName = str2;
        this.osVariant = str3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ UserDeviceInfoModel(String str, String str2, String str3, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        if ((i & 1) != 0 && (str = Build.BRAND) == null) {
            str = "unknown_brand";
        }
        if ((i & 2) != 0 && (str2 = Build.MODEL) == null) {
            str2 = "unknown_model";
        }
        if ((i & 4) != 0 && (str3 = Build.BOOTLOADER) == null) {
            str3 = "unknown_os";
        }
        this(str, str2, str3);
    }

    @JsonProperty("brand_name")
    public final String getBrandName() {
        return this.brandName;
    }

    @JsonProperty("model_name")
    public final String getModelName() {
        return this.modelName;
    }

    @JsonProperty("os_variant")
    public final String getOsVariant() {
        return this.osVariant;
    }

    public UserDeviceInfoModel() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ UserDeviceInfoModel copy$default(UserDeviceInfoModel userDeviceInfoModel, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = userDeviceInfoModel.brandName;
        }
        if ((i & 2) != 0) {
            str2 = userDeviceInfoModel.modelName;
        }
        if ((i & 4) != 0) {
            str3 = userDeviceInfoModel.osVariant;
        }
        return userDeviceInfoModel.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBrandName() {
        return this.brandName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getModelName() {
        return this.modelName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getOsVariant() {
        return this.osVariant;
    }

    public final UserDeviceInfoModel copy(String p0, String p1, String p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        return new UserDeviceInfoModel(p0, p1, p2);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof UserDeviceInfoModel)) {
            return false;
        }
        UserDeviceInfoModel userDeviceInfoModel = (UserDeviceInfoModel) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.brandName, (Object) userDeviceInfoModel.brandName) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.modelName, (Object) userDeviceInfoModel.modelName) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.osVariant, (Object) userDeviceInfoModel.osVariant);
    }

    public final int hashCode() {
        return (((this.brandName.hashCode() * 31) + this.modelName.hashCode()) * 31) + this.osVariant.hashCode();
    }

    public final String toString() {
        String str = this.brandName;
        String str2 = this.modelName;
        String str3 = this.osVariant;
        StringBuilder sb = new StringBuilder("UserDeviceInfoModel(brandName=");
        sb.append(str);
        sb.append(", modelName=");
        sb.append(str2);
        sb.append(", osVariant=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }
}
