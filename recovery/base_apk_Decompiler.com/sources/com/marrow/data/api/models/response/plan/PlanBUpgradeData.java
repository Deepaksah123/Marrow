package com.marrow.data.api.models.response.plan;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.marrow.data.models.plan.PlanGroupDescriptionModelKt;
import java.io.IOException;
import java.util.List;
import kotlin.DownloadHelper2;
import kotlin.DownloadHelperExternalSyntheticLambda2;
import kotlin.DownloadHelperExternalSyntheticLambda4;
import kotlin.Metadata;
import kotlin.SilenceMediaSourceSilenceMediaPeriod;
import kotlin.sendRemoveDownload;
import kotlin.sendSetRequirements;
import kotlin.sendSetStopReason;
import kotlin.setDownloadingStatesToQueued;
import kotlin.toMagicModuleMetaRepoModel;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0001\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ*\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\u000e\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\tR\"\u0010\u0015\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\t\"\u0004\b\u0018\u0010\u0019R(\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b\"\u0004\b\u001d\u0010\u001e"}, d2 = {"Lcom/marrow/data/api/models/response/plan/PlanBUpgradeData;", "", "", "p0", "", "p1", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/util/List;)Lcom/marrow/data/api/models/response/plan/PlanBUpgradeData;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "key", "Ljava/lang/String;", "getKey", "setKey", "(Ljava/lang/String;)V", "descriptionList", "Ljava/util/List;", "getDescriptionList", "setDescriptionList", "(Ljava/util/List;)V"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PlanBUpgradeData {
    private List<String> descriptionList;
    private String key;

    public PlanBUpgradeData(@JsonProperty("key") String str, @JsonProperty(PlanGroupDescriptionModelKt.KEY_DESCRIPTION_LIST) List<String> list) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(list, "");
        this.key = str;
        this.descriptionList = list;
    }

    public final String getKey() {
        return this.key;
    }

    public final void setKey(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.key = str;
    }

    public final List<String> getDescriptionList() {
        return this.descriptionList;
    }

    public final void setDescriptionList(List<String> list) {
        toMagicModuleMetaRepoModel.write(list, "");
        this.descriptionList = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PlanBUpgradeData copy$default(PlanBUpgradeData planBUpgradeData, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = planBUpgradeData.key;
        }
        if ((i & 2) != 0) {
            list = planBUpgradeData.descriptionList;
        }
        return planBUpgradeData.copy(str, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    public final List<String> component2() {
        return this.descriptionList;
    }

    public final PlanBUpgradeData copy(@JsonProperty("key") String p0, @JsonProperty(PlanGroupDescriptionModelKt.KEY_DESCRIPTION_LIST) List<String> p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        return new PlanBUpgradeData(p0, p1);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof PlanBUpgradeData)) {
            return false;
        }
        PlanBUpgradeData planBUpgradeData = (PlanBUpgradeData) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.key, (Object) planBUpgradeData.key) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.descriptionList, planBUpgradeData.descriptionList);
    }

    public final int hashCode() {
        return (this.key.hashCode() * 31) + this.descriptionList.hashCode();
    }

    public final String toString() {
        String str = this.key;
        List<String> list = this.descriptionList;
        StringBuilder sb = new StringBuilder("PlanBUpgradeData(key=");
        sb.append(str);
        sb.append(", descriptionList=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final /* synthetic */ void IconCompatParcelizer(setDownloadingStatesToQueued setdownloadingstatestoqueued, DownloadHelper2 downloadHelper2, sendSetStopReason sendsetstopreason) throws IOException {
        downloadHelper2.RemoteActionCompatParcelizer();
        RemoteActionCompatParcelizer(setdownloadingstatestoqueued, downloadHelper2, sendsetstopreason);
        downloadHelper2.IconCompatParcelizer();
    }

    private /* synthetic */ void RemoteActionCompatParcelizer(setDownloadingStatesToQueued setdownloadingstatestoqueued, DownloadHelper2 downloadHelper2, sendSetStopReason sendsetstopreason) throws IOException {
        if (this != this.descriptionList) {
            sendsetstopreason.IconCompatParcelizer(downloadHelper2, 8);
            SilenceMediaSourceSilenceMediaPeriod silenceMediaSourceSilenceMediaPeriod = new SilenceMediaSourceSilenceMediaPeriod();
            List<String> list = this.descriptionList;
            sendSetRequirements.write(setdownloadingstatestoqueued, silenceMediaSourceSilenceMediaPeriod, list).read(downloadHelper2, list);
        }
        sendsetstopreason.IconCompatParcelizer(downloadHelper2, TarConstants.PREFIXLEN_XSTAR);
        downloadHelper2.AudioAttributesCompatParcelizer(this.key);
    }

    public /* synthetic */ PlanBUpgradeData() {
    }

    public final /* synthetic */ void write(setDownloadingStatesToQueued setdownloadingstatestoqueued, DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4, sendRemoveDownload sendremovedownload) throws IOException {
        downloadHelperExternalSyntheticLambda4.AudioAttributesCompatParcelizer();
        while (downloadHelperExternalSyntheticLambda4.AudioAttributesImplApi21Parcelizer()) {
            AudioAttributesCompatParcelizer(setdownloadingstatestoqueued, downloadHelperExternalSyntheticLambda4, sendremovedownload.AudioAttributesCompatParcelizer(downloadHelperExternalSyntheticLambda4));
        }
        downloadHelperExternalSyntheticLambda4.RemoteActionCompatParcelizer();
    }

    private /* synthetic */ void AudioAttributesCompatParcelizer(setDownloadingStatesToQueued setdownloadingstatestoqueued, DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4, int i) throws IOException {
        boolean z = downloadHelperExternalSyntheticLambda4.onCustomAction() != DownloadHelperExternalSyntheticLambda2.NULL;
        if (i != 20) {
            if (i != 108) {
                downloadHelperExternalSyntheticLambda4.handleMediaPlayPauseIfPendingOnHandler();
                return;
            } else if (z) {
                this.descriptionList = (List) setdownloadingstatestoqueued.IconCompatParcelizer(new SilenceMediaSourceSilenceMediaPeriod()).AudioAttributesCompatParcelizer(downloadHelperExternalSyntheticLambda4);
                return;
            } else {
                this.descriptionList = null;
                downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                return;
            }
        }
        if (!z) {
            this.key = null;
            downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
        } else if (downloadHelperExternalSyntheticLambda4.onCustomAction() != DownloadHelperExternalSyntheticLambda2.BOOLEAN) {
            this.key = downloadHelperExternalSyntheticLambda4.MediaBrowserCompatSearchResultReceiver();
        } else {
            this.key = Boolean.toString(downloadHelperExternalSyntheticLambda4.AudioAttributesImplApi26Parcelizer());
        }
    }
}
