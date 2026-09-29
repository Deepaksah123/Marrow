package com.marrow.video.components.playbackurl.remote.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0007R\u0017\u0010\u0011\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0007"}, d2 = {"Lcom/marrow/video/components/playbackurl/remote/models/TemporarySessionResponseBody;", "", "", "p0", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/marrow/video/components/playbackurl/remote/models/TemporarySessionResponseBody;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "finalData", "Ljava/lang/String;", "getFinalData"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TemporarySessionResponseBody {
    private static int AudioAttributesCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private final String finalData;

    public TemporarySessionResponseBody(@JsonProperty("final_data") String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.finalData = str;
    }

    public final String getFinalData() {
        int i = 2 % 2;
        int i2 = AudioAttributesCompatParcelizer;
        int i3 = (i2 | 57) << 1;
        int i4 = -(i2 ^ 57);
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        RemoteActionCompatParcelizer = i5 % 128;
        if (i5 % 2 != 0) {
            return this.finalData;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ TemporarySessionResponseBody copy$default(TemporarySessionResponseBody temporarySessionResponseBody, String str, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = RemoteActionCompatParcelizer;
        int i4 = ((i3 | 75) << 1) - (i3 ^ 75);
        int i5 = i4 % 128;
        AudioAttributesCompatParcelizer = i5;
        if (i4 % 2 == 0 && (i & 1) != 0) {
            str = temporarySessionResponseBody.finalData;
            int i6 = i5 + 121;
            RemoteActionCompatParcelizer = i6 % 128;
            int i7 = i6 % 2;
        }
        TemporarySessionResponseBody temporarySessionResponseBodyCopy = temporarySessionResponseBody.copy(str);
        int i8 = RemoteActionCompatParcelizer;
        int i9 = (i8 & 35) + (i8 | 35);
        AudioAttributesCompatParcelizer = i9 % 128;
        if (i9 % 2 == 0) {
            return temporarySessionResponseBodyCopy;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 & 49;
        int i4 = ((i2 ^ 49) | i3) << 1;
        int i5 = -((~i3) & (i2 | 49));
        int i6 = (i4 & i5) + (i4 | i5);
        AudioAttributesCompatParcelizer = i6 % 128;
        int i7 = i6 % 2;
        String str = this.finalData;
        int i8 = i2 & 23;
        int i9 = -(-(i2 | 23));
        int i10 = (i8 & i9) + (i9 | i8);
        AudioAttributesCompatParcelizer = i10 % 128;
        int i11 = i10 % 2;
        return str;
    }

    public final TemporarySessionResponseBody copy(@JsonProperty("final_data") String p0) {
        int i = 2 % 2;
        toMagicModuleMetaRepoModel.write(p0, "");
        TemporarySessionResponseBody temporarySessionResponseBody = new TemporarySessionResponseBody(p0);
        int i2 = RemoteActionCompatParcelizer + 81;
        AudioAttributesCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        return temporarySessionResponseBody;
    }

    public final boolean equals(Object p0) {
        int i = 2 % 2;
        int i2 = AudioAttributesCompatParcelizer;
        int i3 = i2 & 111;
        int i4 = (i2 ^ 111) | i3;
        int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
        int i6 = i5 % 128;
        RemoteActionCompatParcelizer = i6;
        int i7 = i5 % 2;
        if (this == p0) {
            int i8 = ((i6 ^ 71) | (i6 & 71)) << 1;
            int i9 = -((i6 & (-72)) | ((~i6) & 71));
            int i10 = ((i8 | i9) << 1) - (i8 ^ i9);
            AudioAttributesCompatParcelizer = i10 % 128;
            int i11 = i10 % 2;
            int i12 = i6 + 61;
            AudioAttributesCompatParcelizer = i12 % 128;
            int i13 = i12 % 2;
            return true;
        }
        Object obj = null;
        if (!(p0 instanceof TemporarySessionResponseBody)) {
            int i14 = i2 + 71;
            RemoteActionCompatParcelizer = i14 % 128;
            int i15 = i14 % 2;
            int i16 = i2 & 43;
            int i17 = i16 + ((i2 ^ 43) | i16);
            RemoteActionCompatParcelizer = i17 % 128;
            if (i17 % 2 != 0) {
                return false;
            }
            obj.hashCode();
            throw null;
        }
        if (!(!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.finalData, (Object) ((TemporarySessionResponseBody) p0).finalData))) {
            int i18 = RemoteActionCompatParcelizer;
            int i19 = i18 & 103;
            int i20 = (i19 - (~(-(-((i18 ^ 103) | i19))))) - 1;
            AudioAttributesCompatParcelizer = i20 % 128;
            if (i20 % 2 == 0) {
                return true;
            }
            throw null;
        }
        int i21 = AudioAttributesCompatParcelizer;
        int i22 = ((i21 | 49) << 1) - (i21 ^ 49);
        int i23 = i22 % 128;
        RemoteActionCompatParcelizer = i23;
        int i24 = i22 % 2;
        int i25 = (i23 ^ 85) + ((i23 & 85) << 1);
        AudioAttributesCompatParcelizer = i25 % 128;
        if (i25 % 2 != 0) {
            int i26 = 0 / 0;
        }
        return false;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = AudioAttributesCompatParcelizer;
        int i3 = i2 & 91;
        int i4 = i3 + ((i2 ^ 91) | i3);
        RemoteActionCompatParcelizer = i4 % 128;
        int i5 = i4 % 2;
        int iHashCode = this.finalData.hashCode();
        int i6 = (-2) - ((RemoteActionCompatParcelizer + 68) ^ (-1));
        AudioAttributesCompatParcelizer = i6 % 128;
        int i7 = i6 % 2;
        return iHashCode;
    }

    public final String toString() {
        String string;
        int i = 2 % 2;
        String str = this.finalData;
        StringBuilder sb = new StringBuilder("TemporarySessionResponseBody(finalData=");
        int i2 = RemoteActionCompatParcelizer;
        int i3 = ((i2 | 45) << 1) - (i2 ^ 45);
        AudioAttributesCompatParcelizer = i3 % 128;
        int i4 = i3 % 2;
        sb.append(str);
        sb.append(")");
        if (i4 != 0) {
            string = sb.toString();
            int i5 = 72 / 0;
        } else {
            string = sb.toString();
        }
        int i6 = AudioAttributesCompatParcelizer;
        int i7 = i6 & 49;
        int i8 = (i6 ^ 49) | i7;
        int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
        RemoteActionCompatParcelizer = i9 % 128;
        int i10 = i9 % 2;
        return string;
    }
}
