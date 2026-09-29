package com.marrow.data.api.models.response.plan;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
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
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\tR$\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\t\"\u0004\b\u0018\u0010\u0019R$\u0010\u001a\u001a\u0004\u0018\u00010\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b\"\u0004\b\u001d\u0010\u001e"}, d2 = {"Lcom/marrow/data/api/models/response/plan/OrderDetails;", "", "", "p0", "Lcom/marrow/data/api/models/response/plan/SdkPayload;", "p1", "<init>", "(Ljava/lang/String;Lcom/marrow/data/api/models/response/plan/SdkPayload;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/marrow/data/api/models/response/plan/SdkPayload;", "copy", "(Ljava/lang/String;Lcom/marrow/data/api/models/response/plan/SdkPayload;)Lcom/marrow/data/api/models/response/plan/OrderDetails;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "gateway", "Ljava/lang/String;", "getGateway", "setGateway", "(Ljava/lang/String;)V", "sdkPayload", "Lcom/marrow/data/api/models/response/plan/SdkPayload;", "getSdkPayload", "setSdkPayload", "(Lcom/marrow/data/api/models/response/plan/SdkPayload;)V"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class OrderDetails {
    private String gateway;
    private SdkPayload sdkPayload;

    public OrderDetails(@JsonProperty("gateway") String str, @JsonProperty("sdk_payload") SdkPayload sdkPayload) {
        this.gateway = str;
        this.sdkPayload = sdkPayload;
    }

    public /* synthetic */ OrderDetails(String str, SdkPayload sdkPayload, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : sdkPayload);
    }

    public final String getGateway() {
        return this.gateway;
    }

    public final void setGateway(String str) {
        this.gateway = str;
    }

    public final SdkPayload getSdkPayload() {
        return this.sdkPayload;
    }

    public final void setSdkPayload(SdkPayload sdkPayload) {
        this.sdkPayload = sdkPayload;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OrderDetails() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ OrderDetails copy$default(OrderDetails orderDetails, String str, SdkPayload sdkPayload, int i, Object obj) {
        if ((i & 1) != 0) {
            str = orderDetails.gateway;
        }
        if ((i & 2) != 0) {
            sdkPayload = orderDetails.sdkPayload;
        }
        return orderDetails.copy(str, sdkPayload);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getGateway() {
        return this.gateway;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final SdkPayload getSdkPayload() {
        return this.sdkPayload;
    }

    public final OrderDetails copy(@JsonProperty("gateway") String p0, @JsonProperty("sdk_payload") SdkPayload p1) {
        return new OrderDetails(p0, p1);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof OrderDetails)) {
            return false;
        }
        OrderDetails orderDetails = (OrderDetails) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.gateway, (Object) orderDetails.gateway) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.sdkPayload, orderDetails.sdkPayload);
    }

    public final int hashCode() {
        String str = this.gateway;
        int iHashCode = str == null ? 0 : str.hashCode();
        SdkPayload sdkPayload = this.sdkPayload;
        return (iHashCode * 31) + (sdkPayload != null ? sdkPayload.hashCode() : 0);
    }

    public final String toString() {
        String str = this.gateway;
        SdkPayload sdkPayload = this.sdkPayload;
        StringBuilder sb = new StringBuilder("OrderDetails(gateway=");
        sb.append(str);
        sb.append(", sdkPayload=");
        sb.append(sdkPayload);
        sb.append(")");
        return sb.toString();
    }

    public final /* synthetic */ void read(setDownloadingStatesToQueued setdownloadingstatestoqueued, DownloadHelper2 downloadHelper2, sendSetStopReason sendsetstopreason) throws IOException {
        downloadHelper2.RemoteActionCompatParcelizer();
        AudioAttributesCompatParcelizer(setdownloadingstatestoqueued, downloadHelper2, sendsetstopreason);
        downloadHelper2.IconCompatParcelizer();
    }

    private /* synthetic */ void AudioAttributesCompatParcelizer(setDownloadingStatesToQueued setdownloadingstatestoqueued, DownloadHelper2 downloadHelper2, sendSetStopReason sendsetstopreason) throws IOException {
        sendsetstopreason.IconCompatParcelizer(downloadHelper2, 44);
        downloadHelper2.AudioAttributesCompatParcelizer(this.gateway);
        sendsetstopreason.IconCompatParcelizer(downloadHelper2, 12);
        SdkPayload sdkPayload = this.sdkPayload;
        sendSetRequirements.write(setdownloadingstatestoqueued, SdkPayload.class, sdkPayload).read(downloadHelper2, sdkPayload);
    }

    public final /* synthetic */ void AudioAttributesCompatParcelizer(setDownloadingStatesToQueued setdownloadingstatestoqueued, DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4, sendRemoveDownload sendremovedownload) throws IOException {
        downloadHelperExternalSyntheticLambda4.AudioAttributesCompatParcelizer();
        while (downloadHelperExternalSyntheticLambda4.AudioAttributesImplApi21Parcelizer()) {
            read(setdownloadingstatestoqueued, downloadHelperExternalSyntheticLambda4, sendremovedownload.AudioAttributesCompatParcelizer(downloadHelperExternalSyntheticLambda4));
        }
        downloadHelperExternalSyntheticLambda4.RemoteActionCompatParcelizer();
    }

    private /* synthetic */ void read(setDownloadingStatesToQueued setdownloadingstatestoqueued, DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4, int i) throws IOException {
        boolean z = downloadHelperExternalSyntheticLambda4.onCustomAction() != DownloadHelperExternalSyntheticLambda2.NULL;
        if (i == 98) {
            if (z) {
                this.sdkPayload = (SdkPayload) setdownloadingstatestoqueued.read(SdkPayload.class).AudioAttributesCompatParcelizer(downloadHelperExternalSyntheticLambda4);
                return;
            } else {
                this.sdkPayload = null;
                downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                return;
            }
        }
        if (i != 125) {
            downloadHelperExternalSyntheticLambda4.handleMediaPlayPauseIfPendingOnHandler();
            return;
        }
        if (!z) {
            this.gateway = null;
            downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
        } else if (downloadHelperExternalSyntheticLambda4.onCustomAction() != DownloadHelperExternalSyntheticLambda2.BOOLEAN) {
            this.gateway = downloadHelperExternalSyntheticLambda4.MediaBrowserCompatSearchResultReceiver();
        } else {
            this.gateway = Boolean.toString(downloadHelperExternalSyntheticLambda4.AudioAttributesImplApi26Parcelizer());
        }
    }
}
