package com.marrow.data.api.models.request.common;

import android.os.Bundle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0001\u0010\b\u001a\u00020\u0004\u0012\b\b\u0001\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0010J\u0010\u0010\u0015\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0012J\u0010\u0010\u0016\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0012JL\u0010\u0017\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u00042\b\b\u0003\u0010\u0007\u001a\u00020\u00022\b\b\u0003\u0010\b\u001a\u00020\u00042\b\b\u0003\u0010\t\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0012J\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u0010R\u001a\u0010#\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u0012R\u001a\u0010&\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010$\u001a\u0004\b'\u0010\u0012R\u001a\u0010(\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010!\u001a\u0004\b)\u0010\u0010R\u001a\u0010*\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010$\u001a\u0004\b+\u0010\u0012R\u001a\u0010,\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010$\u001a\u0004\b-\u0010\u0012"}, d2 = {"Lcom/marrow/data/api/models/request/common/AppInfoRequestBody;", "", "", "p0", "", "p1", "p2", "p3", "p4", "p5", "<init>", "(JIIJII)V", "Landroid/os/Bundle;", "toBundle", "()Landroid/os/Bundle;", "component1", "()J", "component2", "()I", "component3", "component4", "component5", "component6", "copy", "(JIIJII)Lcom/marrow/data/api/models/request/common/AppInfoRequestBody;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "firstInstallTimeMs", "J", "getFirstInstallTimeMs", "firstInstallAppVersion", "I", "getFirstInstallAppVersion", "firstInstallDbVersion", "getFirstInstallDbVersion", "lastUpdatedTimeMs", "getLastUpdatedTimeMs", "lastUpdatedVersion", "getLastUpdatedVersion", "lastDbVersion", "getLastDbVersion"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AppInfoRequestBody {
    private final int firstInstallAppVersion;
    private final int firstInstallDbVersion;
    private final long firstInstallTimeMs;
    private final int lastDbVersion;
    private final long lastUpdatedTimeMs;
    private final int lastUpdatedVersion;

    public AppInfoRequestBody(@JsonProperty("first_install_time") long j, @JsonProperty("first_install_version") int i, @JsonProperty("first_db_version") int i2, @JsonProperty("last_updated_time") long j2, @JsonProperty("last_updated_version") int i3, @JsonProperty("last_db_version") int i4) {
        this.firstInstallTimeMs = j;
        this.firstInstallAppVersion = i;
        this.firstInstallDbVersion = i2;
        this.lastUpdatedTimeMs = j2;
        this.lastUpdatedVersion = i3;
        this.lastDbVersion = i4;
    }

    public final long getFirstInstallTimeMs() {
        return this.firstInstallTimeMs;
    }

    public final int getFirstInstallAppVersion() {
        return this.firstInstallAppVersion;
    }

    public final int getFirstInstallDbVersion() {
        return this.firstInstallDbVersion;
    }

    public final long getLastUpdatedTimeMs() {
        return this.lastUpdatedTimeMs;
    }

    public final int getLastUpdatedVersion() {
        return this.lastUpdatedVersion;
    }

    public final int getLastDbVersion() {
        return this.lastDbVersion;
    }

    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putLong("first_install_time", this.firstInstallTimeMs);
        bundle.putInt("first_install_version", this.firstInstallAppVersion);
        bundle.putInt("first_db_version", this.firstInstallDbVersion);
        bundle.putLong("last_updated_time", this.lastUpdatedTimeMs);
        bundle.putInt("last_updated_version", this.lastUpdatedVersion);
        bundle.putInt("last_db_version", this.lastDbVersion);
        return bundle;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getFirstInstallTimeMs() {
        return this.firstInstallTimeMs;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getFirstInstallAppVersion() {
        return this.firstInstallAppVersion;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getFirstInstallDbVersion() {
        return this.firstInstallDbVersion;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getLastUpdatedTimeMs() {
        return this.lastUpdatedTimeMs;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getLastUpdatedVersion() {
        return this.lastUpdatedVersion;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getLastDbVersion() {
        return this.lastDbVersion;
    }

    public final AppInfoRequestBody copy(@JsonProperty("first_install_time") long p0, @JsonProperty("first_install_version") int p1, @JsonProperty("first_db_version") int p2, @JsonProperty("last_updated_time") long p3, @JsonProperty("last_updated_version") int p4, @JsonProperty("last_db_version") int p5) {
        return new AppInfoRequestBody(p0, p1, p2, p3, p4, p5);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof AppInfoRequestBody)) {
            return false;
        }
        AppInfoRequestBody appInfoRequestBody = (AppInfoRequestBody) p0;
        return this.firstInstallTimeMs == appInfoRequestBody.firstInstallTimeMs && this.firstInstallAppVersion == appInfoRequestBody.firstInstallAppVersion && this.firstInstallDbVersion == appInfoRequestBody.firstInstallDbVersion && this.lastUpdatedTimeMs == appInfoRequestBody.lastUpdatedTimeMs && this.lastUpdatedVersion == appInfoRequestBody.lastUpdatedVersion && this.lastDbVersion == appInfoRequestBody.lastDbVersion;
    }

    public final int hashCode() {
        return (((((((((Long.hashCode(this.firstInstallTimeMs) * 31) + Integer.hashCode(this.firstInstallAppVersion)) * 31) + Integer.hashCode(this.firstInstallDbVersion)) * 31) + Long.hashCode(this.lastUpdatedTimeMs)) * 31) + Integer.hashCode(this.lastUpdatedVersion)) * 31) + Integer.hashCode(this.lastDbVersion);
    }

    public final String toString() {
        long j = this.firstInstallTimeMs;
        int i = this.firstInstallAppVersion;
        int i2 = this.firstInstallDbVersion;
        long j2 = this.lastUpdatedTimeMs;
        int i3 = this.lastUpdatedVersion;
        int i4 = this.lastDbVersion;
        StringBuilder sb = new StringBuilder("AppInfoRequestBody(firstInstallTimeMs=");
        sb.append(j);
        sb.append(", firstInstallAppVersion=");
        sb.append(i);
        sb.append(", firstInstallDbVersion=");
        sb.append(i2);
        sb.append(", lastUpdatedTimeMs=");
        sb.append(j2);
        sb.append(", lastUpdatedVersion=");
        sb.append(i3);
        sb.append(", lastDbVersion=");
        sb.append(i4);
        sb.append(")");
        return sb.toString();
    }
}
