package com.marrow.data.models.video;

import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\fJ:\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0014\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000eJ\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\fR\u0017\u0010\u0018\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\fR\u001a\u0010\u001b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u000eR\u001a\u0010\u001e\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010\u0010R\u001c\u0010 \u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u0019\u001a\u0004\b!\u0010\f"}, d2 = {"Lcom/marrow/data/models/video/DownloadableResolution;", "", "", "p0", "", "p1", "", "p2", "p3", "<init>", "(Ljava/lang/String;IZLjava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "()Z", "component4", "copy", "(Ljava/lang/String;IZLjava/lang/String;)Lcom/marrow/data/models/video/DownloadableResolution;", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "downloadSessionId", "Ljava/lang/String;", "getDownloadSessionId", "resolutionHeight", "I", "getResolutionHeight", "isAvailable", "Z", "unavailableErrorMessage", "getUnavailableErrorMessage"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DownloadableResolution {
    private final String downloadSessionId;
    private final boolean isAvailable;
    private final int resolutionHeight;
    private final String unavailableErrorMessage;

    public DownloadableResolution(String str, int i, boolean z, String str2) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.downloadSessionId = str;
        this.resolutionHeight = i;
        this.isAvailable = z;
        this.unavailableErrorMessage = str2;
    }

    public /* synthetic */ DownloadableResolution(String str, int i, boolean z, String str2, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(str, i, z, (i2 & 8) != 0 ? null : str2);
    }

    public final String getDownloadSessionId() {
        return this.downloadSessionId;
    }

    public final int getResolutionHeight() {
        return this.resolutionHeight;
    }

    public final boolean isAvailable() {
        return this.isAvailable;
    }

    public final String getUnavailableErrorMessage() {
        return this.unavailableErrorMessage;
    }

    public static /* synthetic */ DownloadableResolution copy$default(DownloadableResolution downloadableResolution, String str, int i, boolean z, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = downloadableResolution.downloadSessionId;
        }
        if ((i2 & 2) != 0) {
            i = downloadableResolution.resolutionHeight;
        }
        if ((i2 & 4) != 0) {
            z = downloadableResolution.isAvailable;
        }
        if ((i2 & 8) != 0) {
            str2 = downloadableResolution.unavailableErrorMessage;
        }
        return downloadableResolution.copy(str, i, z, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDownloadSessionId() {
        return this.downloadSessionId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getResolutionHeight() {
        return this.resolutionHeight;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsAvailable() {
        return this.isAvailable;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getUnavailableErrorMessage() {
        return this.unavailableErrorMessage;
    }

    public final DownloadableResolution copy(String p0, int p1, boolean p2, String p3) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return new DownloadableResolution(p0, p1, p2, p3);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof DownloadableResolution)) {
            return false;
        }
        DownloadableResolution downloadableResolution = (DownloadableResolution) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.downloadSessionId, (Object) downloadableResolution.downloadSessionId) && this.resolutionHeight == downloadableResolution.resolutionHeight && this.isAvailable == downloadableResolution.isAvailable && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.unavailableErrorMessage, (Object) downloadableResolution.unavailableErrorMessage);
    }

    public final int hashCode() {
        int iHashCode = this.downloadSessionId.hashCode();
        int iHashCode2 = Integer.hashCode(this.resolutionHeight);
        int iHashCode3 = Boolean.hashCode(this.isAvailable);
        String str = this.unavailableErrorMessage;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        String str = this.downloadSessionId;
        int i = this.resolutionHeight;
        boolean z = this.isAvailable;
        String str2 = this.unavailableErrorMessage;
        StringBuilder sb = new StringBuilder("DownloadableResolution(downloadSessionId=");
        sb.append(str);
        sb.append(", resolutionHeight=");
        sb.append(i);
        sb.append(", isAvailable=");
        sb.append(z);
        sb.append(", unavailableErrorMessage=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }
}
