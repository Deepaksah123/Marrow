package com.marrow2.data.user.remote.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ8\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\nR\u001a\u0010\u0017\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u001a\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001b\u0010\nR\u001a\u0010\u001c\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\nR\u001a\u0010\u001e\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001f\u0010\n"}, d2 = {"Lcom/marrow2/data/user/remote/model/GCMRegistrationRequest;", "", "", "p0", "p1", "p2", "p3", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/marrow2/data/user/remote/model/GCMRegistrationRequest;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "notificationId", "Ljava/lang/String;", "getNotificationId", "deviceId", "getDeviceId", "platform", "getPlatform", "country", "getCountry"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class GCMRegistrationRequest {
    public static final int $stable = 0;

    @JsonProperty("country")
    private final String country;

    @JsonProperty("device_id")
    private final String deviceId;

    @JsonProperty("notification_id")
    private final String notificationId;

    @JsonProperty("platform")
    private final String platform;

    public GCMRegistrationRequest(String str, String str2, String str3, String str4) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        toMagicModuleMetaRepoModel.write(str4, "");
        this.notificationId = str;
        this.deviceId = str2;
        this.platform = str3;
        this.country = str4;
    }

    public final String getNotificationId() {
        return this.notificationId;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final String getPlatform() {
        return this.platform;
    }

    public final String getCountry() {
        return this.country;
    }

    public static /* synthetic */ GCMRegistrationRequest copy$default(GCMRegistrationRequest gCMRegistrationRequest, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = gCMRegistrationRequest.notificationId;
        }
        if ((i & 2) != 0) {
            str2 = gCMRegistrationRequest.deviceId;
        }
        if ((i & 4) != 0) {
            str3 = gCMRegistrationRequest.platform;
        }
        if ((i & 8) != 0) {
            str4 = gCMRegistrationRequest.country;
        }
        return gCMRegistrationRequest.copy(str, str2, str3, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getNotificationId() {
        return this.notificationId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPlatform() {
        return this.platform;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    public final GCMRegistrationRequest copy(String p0, String p1, String p2, String p3) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        toMagicModuleMetaRepoModel.write(p3, "");
        return new GCMRegistrationRequest(p0, p1, p2, p3);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof GCMRegistrationRequest)) {
            return false;
        }
        GCMRegistrationRequest gCMRegistrationRequest = (GCMRegistrationRequest) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.notificationId, (Object) gCMRegistrationRequest.notificationId) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.deviceId, (Object) gCMRegistrationRequest.deviceId) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.platform, (Object) gCMRegistrationRequest.platform) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.country, (Object) gCMRegistrationRequest.country);
    }

    public final int hashCode() {
        return (((((this.notificationId.hashCode() * 31) + this.deviceId.hashCode()) * 31) + this.platform.hashCode()) * 31) + this.country.hashCode();
    }

    public final String toString() {
        String str = this.notificationId;
        String str2 = this.deviceId;
        String str3 = this.platform;
        String str4 = this.country;
        StringBuilder sb = new StringBuilder("GCMRegistrationRequest(notificationId=");
        sb.append(str);
        sb.append(", deviceId=");
        sb.append(str2);
        sb.append(", platform=");
        sb.append(str3);
        sb.append(", country=");
        sb.append(str4);
        sb.append(")");
        return sb.toString();
    }
}
