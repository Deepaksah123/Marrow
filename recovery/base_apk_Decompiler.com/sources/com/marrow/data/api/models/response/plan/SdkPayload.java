package com.marrow.data.api.models.response.plan;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.marrow.data.api.models.response.payment.SdkPayloadKt;
import java.io.IOException;
import kotlin.DownloadHelper2;
import kotlin.DownloadHelperExternalSyntheticLambda2;
import kotlin.DownloadHelperExternalSyntheticLambda4;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.sendRemoveDownload;
import kotlin.sendSetRequirements;
import kotlin.sendSetStopReason;
import kotlin.setDownloadingStatesToQueued;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ4\u0010\u000e\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\nR$\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\n\"\u0004\b\u001a\u0010\u001bR$\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\n\"\u0004\b\u001e\u0010\u001bR$\u0010\u001f\u001a\u0004\u0018\u00010\u00058\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\r\"\u0004\b\"\u0010#"}, d2 = {"Lcom/marrow/data/api/models/response/plan/SdkPayload;", "", "", "p0", "p1", "Lcom/marrow/data/api/models/response/plan/SdkPayloadData;", "p2", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/marrow/data/api/models/response/plan/SdkPayloadData;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/marrow/data/api/models/response/plan/SdkPayloadData;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/marrow/data/api/models/response/plan/SdkPayloadData;)Lcom/marrow/data/api/models/response/plan/SdkPayload;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", SdkPayloadKt.KEY_JP_REQUEST_ID, "Ljava/lang/String;", "getRequestId", "setRequestId", "(Ljava/lang/String;)V", "service", "getService", "setService", "payload", "Lcom/marrow/data/api/models/response/plan/SdkPayloadData;", "getPayload", "setPayload", "(Lcom/marrow/data/api/models/response/plan/SdkPayloadData;)V"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SdkPayload {
    private SdkPayloadData payload;
    private String requestId;
    private String service;

    public SdkPayload(@JsonProperty(SdkPayloadKt.KEY_JP_REQUEST_ID) String str, @JsonProperty("service") String str2, @JsonProperty("payload") SdkPayloadData sdkPayloadData) {
        this.requestId = str;
        this.service = str2;
        this.payload = sdkPayloadData;
    }

    public /* synthetic */ SdkPayload(String str, String str2, SdkPayloadData sdkPayloadData, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : sdkPayloadData);
    }

    public final String getRequestId() {
        return this.requestId;
    }

    public final void setRequestId(String str) {
        this.requestId = str;
    }

    public final String getService() {
        return this.service;
    }

    public final void setService(String str) {
        this.service = str;
    }

    public final SdkPayloadData getPayload() {
        return this.payload;
    }

    public final void setPayload(SdkPayloadData sdkPayloadData) {
        this.payload = sdkPayloadData;
    }

    public SdkPayload() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ SdkPayload copy$default(SdkPayload sdkPayload, String str, String str2, SdkPayloadData sdkPayloadData, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sdkPayload.requestId;
        }
        if ((i & 2) != 0) {
            str2 = sdkPayload.service;
        }
        if ((i & 4) != 0) {
            sdkPayloadData = sdkPayload.payload;
        }
        return sdkPayload.copy(str, str2, sdkPayloadData);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRequestId() {
        return this.requestId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getService() {
        return this.service;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final SdkPayloadData getPayload() {
        return this.payload;
    }

    public final SdkPayload copy(@JsonProperty(SdkPayloadKt.KEY_JP_REQUEST_ID) String p0, @JsonProperty("service") String p1, @JsonProperty("payload") SdkPayloadData p2) {
        return new SdkPayload(p0, p1, p2);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof SdkPayload)) {
            return false;
        }
        SdkPayload sdkPayload = (SdkPayload) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.requestId, (Object) sdkPayload.requestId) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.service, (Object) sdkPayload.service) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.payload, sdkPayload.payload);
    }

    public final int hashCode() {
        String str = this.requestId;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.service;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        SdkPayloadData sdkPayloadData = this.payload;
        return (((iHashCode * 31) + iHashCode2) * 31) + (sdkPayloadData != null ? sdkPayloadData.hashCode() : 0);
    }

    public final String toString() {
        String str = this.requestId;
        String str2 = this.service;
        SdkPayloadData sdkPayloadData = this.payload;
        StringBuilder sb = new StringBuilder("SdkPayload(requestId=");
        sb.append(str);
        sb.append(", service=");
        sb.append(str2);
        sb.append(", payload=");
        sb.append(sdkPayloadData);
        sb.append(")");
        return sb.toString();
    }

    public final /* synthetic */ void write(setDownloadingStatesToQueued setdownloadingstatestoqueued, DownloadHelper2 downloadHelper2, sendSetStopReason sendsetstopreason) throws IOException {
        downloadHelper2.RemoteActionCompatParcelizer();
        read(setdownloadingstatestoqueued, downloadHelper2, sendsetstopreason);
        downloadHelper2.IconCompatParcelizer();
    }

    private /* synthetic */ void read(setDownloadingStatesToQueued setdownloadingstatestoqueued, DownloadHelper2 downloadHelper2, sendSetStopReason sendsetstopreason) throws IOException {
        sendsetstopreason.IconCompatParcelizer(downloadHelper2, 98);
        SdkPayloadData sdkPayloadData = this.payload;
        sendSetRequirements.write(setdownloadingstatestoqueued, SdkPayloadData.class, sdkPayloadData).read(downloadHelper2, sdkPayloadData);
        sendsetstopreason.IconCompatParcelizer(downloadHelper2, 53);
        downloadHelper2.AudioAttributesCompatParcelizer(this.requestId);
        sendsetstopreason.IconCompatParcelizer(downloadHelper2, 59);
        downloadHelper2.AudioAttributesCompatParcelizer(this.service);
    }

    public final /* synthetic */ void IconCompatParcelizer(setDownloadingStatesToQueued setdownloadingstatestoqueued, DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4, sendRemoveDownload sendremovedownload) throws IOException {
        downloadHelperExternalSyntheticLambda4.AudioAttributesCompatParcelizer();
        while (downloadHelperExternalSyntheticLambda4.AudioAttributesImplApi21Parcelizer()) {
            read(setdownloadingstatestoqueued, downloadHelperExternalSyntheticLambda4, sendremovedownload.AudioAttributesCompatParcelizer(downloadHelperExternalSyntheticLambda4));
        }
        downloadHelperExternalSyntheticLambda4.RemoteActionCompatParcelizer();
    }

    private /* synthetic */ void read(setDownloadingStatesToQueued setdownloadingstatestoqueued, DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4, int i) throws IOException {
        boolean z = downloadHelperExternalSyntheticLambda4.onCustomAction() != DownloadHelperExternalSyntheticLambda2.NULL;
        if (i == 24) {
            if (!z) {
                this.requestId = null;
                downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                return;
            } else if (downloadHelperExternalSyntheticLambda4.onCustomAction() != DownloadHelperExternalSyntheticLambda2.BOOLEAN) {
                this.requestId = downloadHelperExternalSyntheticLambda4.MediaBrowserCompatSearchResultReceiver();
                return;
            } else {
                this.requestId = Boolean.toString(downloadHelperExternalSyntheticLambda4.AudioAttributesImplApi26Parcelizer());
                return;
            }
        }
        if (i != 58) {
            if (i != 149) {
                downloadHelperExternalSyntheticLambda4.handleMediaPlayPauseIfPendingOnHandler();
                return;
            } else if (z) {
                this.payload = (SdkPayloadData) setdownloadingstatestoqueued.read(SdkPayloadData.class).AudioAttributesCompatParcelizer(downloadHelperExternalSyntheticLambda4);
                return;
            } else {
                this.payload = null;
                downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                return;
            }
        }
        if (!z) {
            this.service = null;
            downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
        } else if (downloadHelperExternalSyntheticLambda4.onCustomAction() != DownloadHelperExternalSyntheticLambda2.BOOLEAN) {
            this.service = downloadHelperExternalSyntheticLambda4.MediaBrowserCompatSearchResultReceiver();
        } else {
            this.service = Boolean.toString(downloadHelperExternalSyntheticLambda4.AudioAttributesImplApi26Parcelizer());
        }
    }
}
