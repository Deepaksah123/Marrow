package com.marrow.data.models.video;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import kotlin.Metadata;
import kotlin.getChunkEndTimeUs;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J.\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0010R\u0011\u0010\u001b\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001d\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0011\u0010\u001f\u001a\u00020\u00068\u0006¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0011\u0010!\u001a\u00020\u00158G¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0011\u0010$\u001a\u00020\n8G¢\u0006\u0006\u001a\u0004\b#\u0010\u0019"}, d2 = {"Lcom/marrow/data/models/video/PixelInfo;", "", "Lcom/marrow/data/models/video/DownloadableResolution;", "p0", "", "p1", "Lo/getChunkEndTimeUs;", "p2", "<init>", "(Lcom/marrow/data/models/video/DownloadableResolution;Ljava/lang/String;Lo/getChunkEndTimeUs;)V", "", "getResolutionSize", "(I)I", "component1", "()Lcom/marrow/data/models/video/DownloadableResolution;", "component2", "()Ljava/lang/String;", "component3", "()Lo/getChunkEndTimeUs;", "copy", "(Lcom/marrow/data/models/video/DownloadableResolution;Ljava/lang/String;Lo/getChunkEndTimeUs;)Lcom/marrow/data/models/video/PixelInfo;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "downloadableResolution", "Lcom/marrow/data/models/video/DownloadableResolution;", "resolutionString", "Ljava/lang/String;", "pixelResolutionCategory", "Lo/getChunkEndTimeUs;", "isSupported", "()Z", "getHeight", "height"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PixelInfo {
    public final DownloadableResolution downloadableResolution;
    public final getChunkEndTimeUs pixelResolutionCategory;
    public final String resolutionString;

    public PixelInfo(DownloadableResolution downloadableResolution, String str, getChunkEndTimeUs getchunkendtimeus) {
        toMagicModuleMetaRepoModel.write(downloadableResolution, "");
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(getchunkendtimeus, "");
        this.downloadableResolution = downloadableResolution;
        this.resolutionString = str;
        this.pixelResolutionCategory = getchunkendtimeus;
    }

    public final boolean isSupported() {
        return this.downloadableResolution.isAvailable();
    }

    public final int getHeight() {
        return this.downloadableResolution.getResolutionHeight();
    }

    public final int getResolutionSize(int p0) {
        if (getHeight() >= 720) {
            return p0 == 5 ? 363 : 990;
        }
        if (getHeight() < 540) {
            return p0 == 5 ? 89 : 110;
        }
        if (p0 == 5) {
            return TsExtractor.TS_STREAM_TYPE_SPLICE_INFO;
        }
        return 340;
    }

    public static /* synthetic */ PixelInfo copy$default(PixelInfo pixelInfo, DownloadableResolution downloadableResolution, String str, getChunkEndTimeUs getchunkendtimeus, int i, Object obj) {
        if ((i & 1) != 0) {
            downloadableResolution = pixelInfo.downloadableResolution;
        }
        if ((i & 2) != 0) {
            str = pixelInfo.resolutionString;
        }
        if ((i & 4) != 0) {
            getchunkendtimeus = pixelInfo.pixelResolutionCategory;
        }
        return pixelInfo.copy(downloadableResolution, str, getchunkendtimeus);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final DownloadableResolution getDownloadableResolution() {
        return this.downloadableResolution;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getResolutionString() {
        return this.resolutionString;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final getChunkEndTimeUs getPixelResolutionCategory() {
        return this.pixelResolutionCategory;
    }

    public final PixelInfo copy(DownloadableResolution p0, String p1, getChunkEndTimeUs p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        return new PixelInfo(p0, p1, p2);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof PixelInfo)) {
            return false;
        }
        PixelInfo pixelInfo = (PixelInfo) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.downloadableResolution, pixelInfo.downloadableResolution) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.resolutionString, (Object) pixelInfo.resolutionString) && this.pixelResolutionCategory == pixelInfo.pixelResolutionCategory;
    }

    public final int hashCode() {
        return (((this.downloadableResolution.hashCode() * 31) + this.resolutionString.hashCode()) * 31) + this.pixelResolutionCategory.hashCode();
    }

    public final String toString() {
        DownloadableResolution downloadableResolution = this.downloadableResolution;
        String str = this.resolutionString;
        getChunkEndTimeUs getchunkendtimeus = this.pixelResolutionCategory;
        StringBuilder sb = new StringBuilder("PixelInfo(downloadableResolution=");
        sb.append(downloadableResolution);
        sb.append(", resolutionString=");
        sb.append(str);
        sb.append(", pixelResolutionCategory=");
        sb.append(getchunkendtimeus);
        sb.append(")");
        return sb.toString();
    }
}
