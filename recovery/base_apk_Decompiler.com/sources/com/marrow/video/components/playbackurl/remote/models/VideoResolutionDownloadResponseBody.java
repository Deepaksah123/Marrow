package com.marrow.video.components.playbackurl.remote.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0007R\u0017\u0010\u0011\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0007"}, d2 = {"Lcom/marrow/video/components/playbackurl/remote/models/VideoResolutionDownloadResponseBody;", "", "", "p0", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/marrow/video/components/playbackurl/remote/models/VideoResolutionDownloadResponseBody;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "finalData", "Ljava/lang/String;", "getFinalData"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class VideoResolutionDownloadResponseBody {
    private static int AudioAttributesCompatParcelizer = 1;
    private static int read;
    private final String finalData;

    public VideoResolutionDownloadResponseBody(@JsonProperty("final_data") String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.finalData = str;
    }

    public final String getFinalData() {
        int i = 2 % 2;
        int i2 = AudioAttributesCompatParcelizer;
        int i3 = i2 & 99;
        int i4 = -(-((i2 ^ 99) | i3));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        int i6 = i5 % 128;
        read = i6;
        if (i5 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.finalData;
        int i7 = i6 ^ 115;
        int i8 = ((i6 & 115) | i7) << 1;
        int i9 = -i7;
        int i10 = (i8 & i9) + (i8 | i9);
        AudioAttributesCompatParcelizer = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 92 / 0;
        }
        return str;
    }

    public static /* synthetic */ VideoResolutionDownloadResponseBody copy$default(VideoResolutionDownloadResponseBody videoResolutionDownloadResponseBody, String str, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = AudioAttributesCompatParcelizer;
        int i4 = (i3 ^ 25) + ((i3 & 25) << 1);
        read = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 1) != 0) {
            int i6 = i3 & 105;
            int i7 = (((i3 ^ 105) | i6) << 1) - ((~i6) & (i3 | 105));
            read = i7 % 128;
            if (i7 % 2 != 0) {
                String str2 = videoResolutionDownloadResponseBody.finalData;
                throw null;
            }
            str = videoResolutionDownloadResponseBody.finalData;
        }
        VideoResolutionDownloadResponseBody videoResolutionDownloadResponseBodyCopy = videoResolutionDownloadResponseBody.copy(str);
        int i8 = AudioAttributesCompatParcelizer;
        int i9 = (((i8 | 76) << 1) - (i8 ^ 76)) - 1;
        read = i9 % 128;
        int i10 = i9 % 2;
        return videoResolutionDownloadResponseBodyCopy;
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = AudioAttributesCompatParcelizer;
        int i3 = i2 & 83;
        int i4 = ((i2 ^ 83) | i3) << 1;
        int i5 = -((i2 | 83) & (~i3));
        int i6 = (i4 & i5) + (i5 | i4);
        int i7 = i6 % 128;
        read = i7;
        int i8 = i6 % 2;
        String str = this.finalData;
        int i9 = (-2) - (((i7 ^ 28) + ((i7 & 28) << 1)) ^ (-1));
        AudioAttributesCompatParcelizer = i9 % 128;
        if (i9 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final VideoResolutionDownloadResponseBody copy(@JsonProperty("final_data") String p0) {
        int i = 2 % 2;
        toMagicModuleMetaRepoModel.write(p0, "");
        VideoResolutionDownloadResponseBody videoResolutionDownloadResponseBody = new VideoResolutionDownloadResponseBody(p0);
        int i2 = AudioAttributesCompatParcelizer + 41;
        read = i2 % 128;
        if (i2 % 2 == 0) {
            return videoResolutionDownloadResponseBody;
        }
        throw null;
    }

    public final boolean equals(Object p0) {
        int i = 2 % 2;
        int i2 = AudioAttributesCompatParcelizer;
        int i3 = (-2) - ((i2 + 78) ^ (-1));
        int i4 = i3 % 128;
        read = i4;
        Object obj = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (this == p0) {
            int i5 = (i2 & (-54)) | ((~i2) & 53);
            int i6 = -(-((i2 & 53) << 1));
            int i7 = ((i5 | i6) << 1) - (i5 ^ i6);
            read = i7 % 128;
            if (i7 % 2 == 0) {
                return true;
            }
            throw null;
        }
        if (!(p0 instanceof VideoResolutionDownloadResponseBody)) {
            int i8 = i2 + 121;
            int i9 = i8 % 128;
            read = i9;
            int i10 = i8 % 2;
            int i11 = ((i9 ^ 36) + ((i9 & 36) << 1)) - 1;
            AudioAttributesCompatParcelizer = i11 % 128;
            if (i11 % 2 != 0) {
                return false;
            }
            obj.hashCode();
            throw null;
        }
        String str = this.finalData;
        String str2 = ((VideoResolutionDownloadResponseBody) p0).finalData;
        int i12 = (-2) - (((i4 ^ 120) + ((i4 & 120) << 1)) ^ (-1));
        AudioAttributesCompatParcelizer = i12 % 128;
        if (i12 % 2 == 0) {
            toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) str, (Object) str2);
            throw null;
        }
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) str, (Object) str2)) {
            int i13 = read;
            int i14 = i13 & 113;
            int i15 = ((((i13 ^ 113) | i14) << 1) - (~(-((i13 | 113) & (~i14))))) - 1;
            AudioAttributesCompatParcelizer = i15 % 128;
            return i15 % 2 == 0;
        }
        int i16 = read;
        int i17 = ((i16 ^ 47) | (i16 & 47)) << 1;
        int i18 = -(((~i16) & 47) | (i16 & (-48)));
        int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
        AudioAttributesCompatParcelizer = i19 % 128;
        int i20 = i19 % 2;
        return true;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read;
        int i3 = (((i2 | 69) << 1) - (~(-(i2 ^ 69)))) - 1;
        AudioAttributesCompatParcelizer = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode = this.finalData.hashCode();
        int i5 = AudioAttributesCompatParcelizer;
        int i6 = i5 ^ 61;
        int i7 = ((i5 & 61) | i6) << 1;
        int i8 = -i6;
        int i9 = (i7 ^ i8) + ((i7 & i8) << 1);
        read = i9 % 128;
        int i10 = i9 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = this.finalData;
        StringBuilder sb = new StringBuilder("VideoResolutionDownloadResponseBody(finalData=");
        int i2 = read;
        int i3 = ((i2 & 98) + (i2 | 98)) - 1;
        AudioAttributesCompatParcelizer = i3 % 128;
        int i4 = i3 % 2;
        sb.append(str);
        sb.append(")");
        String string = sb.toString();
        int i5 = AudioAttributesCompatParcelizer;
        int i6 = ((i5 ^ 115) - (~((i5 & 115) << 1))) - 1;
        read = i6 % 128;
        if (i6 % 2 == 0) {
            return string;
        }
        throw null;
    }
}
