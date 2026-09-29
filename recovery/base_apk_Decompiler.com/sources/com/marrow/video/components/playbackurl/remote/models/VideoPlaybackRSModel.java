package com.marrow.video.components.playbackurl.remote.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0007R\u001a\u0010\u0011\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0007"}, d2 = {"Lcom/marrow/video/components/playbackurl/remote/models/VideoPlaybackRSModel;", "", "", "p0", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/marrow/video/components/playbackurl/remote/models/VideoPlaybackRSModel;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "finalData", "Ljava/lang/String;", "getFinalData"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class VideoPlaybackRSModel {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    private final String finalData;

    public VideoPlaybackRSModel(@JsonProperty("final_data") String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.finalData = str;
    }

    public final String getFinalData() {
        int i = 2 % 2;
        int i2 = read;
        int i3 = ((i2 | 79) << 1) - (i2 ^ 79);
        RemoteActionCompatParcelizer = i3 % 128;
        if (i3 % 2 != 0) {
            return this.finalData;
        }
        throw null;
    }

    public static /* synthetic */ VideoPlaybackRSModel copy$default(VideoPlaybackRSModel videoPlaybackRSModel, String str, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = RemoteActionCompatParcelizer + 123;
        int i4 = i3 % 128;
        read = i4;
        int i5 = i3 % 2;
        if ((i & 1) != 0) {
            int i6 = ((i4 & 104) + (i4 | 104)) - 1;
            RemoteActionCompatParcelizer = i6 % 128;
            if (i6 % 2 == 0) {
                String str2 = videoPlaybackRSModel.finalData;
                throw null;
            }
            str = videoPlaybackRSModel.finalData;
            int i7 = (i4 ^ 3) + ((i4 & 3) << 1);
            RemoteActionCompatParcelizer = i7 % 128;
            int i8 = i7 % 2;
        }
        VideoPlaybackRSModel videoPlaybackRSModelCopy = videoPlaybackRSModel.copy(str);
        int i9 = RemoteActionCompatParcelizer + 9;
        read = i9 % 128;
        int i10 = i9 % 2;
        return videoPlaybackRSModelCopy;
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 21;
        RemoteActionCompatParcelizer = i3 % 128;
        int i4 = i3 % 2;
        String str = this.finalData;
        int i5 = (((i2 | 100) << 1) - (i2 ^ 100)) - 1;
        RemoteActionCompatParcelizer = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final VideoPlaybackRSModel copy(@JsonProperty("final_data") String p0) {
        int i = 2 % 2;
        toMagicModuleMetaRepoModel.write(p0, "");
        VideoPlaybackRSModel videoPlaybackRSModel = new VideoPlaybackRSModel(p0);
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 & 111;
        int i4 = (i2 | 111) & (~i3);
        int i5 = i3 << 1;
        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
        read = i6 % 128;
        if (i6 % 2 == 0) {
            return videoPlaybackRSModel;
        }
        throw null;
    }

    public final boolean equals(Object p0) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 & 31;
        int i4 = (~i3) & (i2 | 31);
        int i5 = -(-(i3 << 1));
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        int i7 = i6 % 128;
        read = i7;
        int i8 = i6 % 2;
        Object obj = null;
        if (this == p0) {
            int i9 = ((i7 ^ 57) | (i7 & 57)) << 1;
            int i10 = -((i7 & (-58)) | ((~i7) & 57));
            int i11 = (i9 ^ i10) + ((i9 & i10) << 1);
            int i12 = i11 % 128;
            RemoteActionCompatParcelizer = i12;
            int i13 = i11 % 2;
            int i14 = ((i12 ^ 90) + ((i12 & 90) << 1)) - 1;
            read = i14 % 128;
            if (i14 % 2 == 0) {
                return true;
            }
            throw null;
        }
        if (!(p0 instanceof VideoPlaybackRSModel)) {
            int i15 = (i2 ^ 99) + ((i2 & 99) << 1);
            read = i15 % 128;
            return i15 % 2 != 0;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.finalData, (Object) ((VideoPlaybackRSModel) p0).finalData)) {
            int i16 = RemoteActionCompatParcelizer + 106;
            int i17 = (i16 ^ (-1)) + (i16 << 1);
            read = i17 % 128;
            if (i17 % 2 == 0) {
                return true;
            }
            obj.hashCode();
            throw null;
        }
        int i18 = RemoteActionCompatParcelizer;
        int i19 = ((i18 & 34) + (i18 | 34)) - 1;
        read = i19 % 128;
        int i20 = i19 % 2;
        int i21 = i18 & 115;
        int i22 = (i18 ^ 115) | i21;
        int i23 = (i21 ^ i22) + ((i22 & i21) << 1);
        read = i23 % 128;
        if (i23 % 2 == 0) {
            return false;
        }
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read;
        int i3 = (i2 & 45) + (i2 | 45);
        RemoteActionCompatParcelizer = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode = this.finalData.hashCode();
        if (i4 == 0) {
            int i5 = 42 / 0;
        }
        int i6 = RemoteActionCompatParcelizer;
        int i7 = ((i6 | 63) << 1) - (i6 ^ 63);
        read = i7 % 128;
        int i8 = i7 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = this.finalData;
        StringBuilder sb = new StringBuilder("VideoPlaybackRSModel(finalData=");
        int i2 = RemoteActionCompatParcelizer;
        int i3 = (i2 ^ 113) + ((i2 & 113) << 1);
        read = i3 % 128;
        int i4 = i3 % 2;
        sb.append(str);
        sb.append(")");
        if (i4 == 0) {
            return sb.toString();
        }
        sb.toString();
        throw null;
    }
}
