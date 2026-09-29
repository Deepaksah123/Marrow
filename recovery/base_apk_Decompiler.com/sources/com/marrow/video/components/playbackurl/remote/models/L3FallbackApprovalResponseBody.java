package com.marrow.video.components.playbackurl.remote.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda19;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u0007J\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0007R\u0011\u0010\u0014\u001a\u00020\n8G¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/marrow/video/components/playbackurl/remote/models/L3FallbackApprovalResponseBody;", "", "", "p0", "<init>", "(I)V", "component1", "()I", "copy", "(I)Lcom/marrow/video/components/playbackurl/remote/models/L3FallbackApprovalResponseBody;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "finalData", "I", "getFinalData", "isApproved", "()Z"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class L3FallbackApprovalResponseBody {
    private static int AudioAttributesCompatParcelizer = 1;
    private static int write;
    private final int finalData;

    public L3FallbackApprovalResponseBody(@JsonProperty("final_data") int i) {
        this.finalData = i;
    }

    public final int getFinalData() {
        int i = 2 % 2;
        int i2 = write;
        int i3 = (i2 & (-22)) | ((~i2) & 21);
        int i4 = -(-((i2 & 21) << 1));
        int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
        AudioAttributesCompatParcelizer = i5 % 128;
        int i6 = i5 % 2;
        int i7 = this.finalData;
        int i8 = ((i2 & 83) - (~(i2 | 83))) - 1;
        AudioAttributesCompatParcelizer = i8 % 128;
        if (i8 % 2 != 0) {
            return i7;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean isApproved() {
        int i = 2 % 2;
        int i2 = AudioAttributesCompatParcelizer;
        int i3 = i2 & 41;
        int i4 = i3 + ((i2 ^ 41) | i3);
        int i5 = i4 % 128;
        write = i5;
        int i6 = i4 % 2;
        int i7 = this.finalData;
        if (i6 == 0 ? i7 != 1 : i7 != 0) {
            int i8 = i2 & 47;
            int i9 = i8 + ((i2 ^ 47) | i8);
            write = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        int i11 = i5 & 31;
        int i12 = ((~i11) & (i5 | 31)) + (i11 << 1);
        int i13 = i12 % 128;
        AudioAttributesCompatParcelizer = i13;
        boolean z = i12 % 2 != 0;
        int i14 = ((i13 & 106) + (i13 | 106)) - 1;
        write = i14 % 128;
        if (i14 % 2 != 0) {
            int i15 = 41 / 0;
        }
        return z;
    }

    public static /* synthetic */ L3FallbackApprovalResponseBody copy$default(L3FallbackApprovalResponseBody l3FallbackApprovalResponseBody, int i, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = AudioAttributesCompatParcelizer;
        int i5 = i4 & 7;
        int i6 = -(-((i4 ^ 7) | i5));
        int i7 = (i5 & i6) + (i5 | i6);
        write = i7 % 128;
        int i8 = i7 % 2;
        if ((i2 & 1) != 0) {
            int i9 = i4 + 63;
            write = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = l3FallbackApprovalResponseBody.finalData;
                throw null;
            }
            i = l3FallbackApprovalResponseBody.finalData;
        }
        L3FallbackApprovalResponseBody l3FallbackApprovalResponseBodyCopy = l3FallbackApprovalResponseBody.copy(i);
        int i11 = AudioAttributesCompatParcelizer;
        int i12 = i11 | 41;
        int i13 = (i12 << 1) - ((~(i11 & 41)) & i12);
        write = i13 % 128;
        if (i13 % 2 != 0) {
            int i14 = 3 / 0;
        }
        return l3FallbackApprovalResponseBodyCopy;
    }

    public final int component1() {
        int i = 2 % 2;
        int i2 = write;
        int i3 = (i2 ^ 117) + ((i2 & 117) << 1);
        AudioAttributesCompatParcelizer = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.finalData;
        int i6 = i2 & 33;
        int i7 = ((i2 ^ 33) | i6) << 1;
        int i8 = -((i2 | 33) & (~i6));
        int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
        AudioAttributesCompatParcelizer = i9 % 128;
        int i10 = i9 % 2;
        return i5;
    }

    public final L3FallbackApprovalResponseBody copy(@JsonProperty("final_data") int p0) {
        int i = 2 % 2;
        L3FallbackApprovalResponseBody l3FallbackApprovalResponseBody = new L3FallbackApprovalResponseBody(p0);
        int i2 = write;
        int i3 = ((i2 | 9) << 1) - (((~i2) & 9) | (i2 & (-10)));
        AudioAttributesCompatParcelizer = i3 % 128;
        int i4 = i3 % 2;
        return l3FallbackApprovalResponseBody;
    }

    public final boolean equals(Object p0) {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 & 25;
        int i4 = (((~i3) & (i2 | 25)) - (~(i3 << 1))) - 1;
        int i5 = i4 % 128;
        AudioAttributesCompatParcelizer = i5;
        int i6 = i4 % 2;
        if (this == p0) {
            int i7 = ((i5 ^ 67) | (i5 & 67)) << 1;
            int i8 = -((i5 & (-68)) | ((~i5) & 67));
            int i9 = (i7 & i8) + (i7 | i8);
            int i10 = i9 % 128;
            write = i10;
            int i11 = i9 % 2;
            int i12 = i10 + 11;
            AudioAttributesCompatParcelizer = i12 % 128;
            if (i12 % 2 != 0) {
                return true;
            }
            throw null;
        }
        if (!(p0 instanceof L3FallbackApprovalResponseBody)) {
            int i13 = i2 + 37;
            int i14 = i13 % 128;
            AudioAttributesCompatParcelizer = i14;
            boolean z = i13 % 2 == 0;
            int i15 = (i14 & 61) + (i14 | 61);
            write = i15 % 128;
            int i16 = i15 % 2;
            return z;
        }
        if (this.finalData == ((L3FallbackApprovalResponseBody) p0).finalData) {
            int i17 = (-2) - ((((i2 | 68) << 1) - (i2 ^ 68)) ^ (-1));
            AudioAttributesCompatParcelizer = i17 % 128;
            if (i17 % 2 != 0) {
                return true;
            }
            throw null;
        }
        int i18 = i5 & 67;
        int i19 = (~i18) & (i5 | 67);
        int i20 = -(-(i18 << 1));
        int i21 = (i19 & i20) + (i20 | i19);
        write = i21 % 128;
        boolean z2 = i21 % 2 != 0;
        int i22 = i5 & 93;
        int i23 = i5 | 93;
        int i24 = (i22 ^ i23) + ((i22 & i23) << 1);
        write = i24 % 128;
        int i25 = i24 % 2;
        return z2;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int iIdentityHashCode = System.identityHashCode(this);
        int i2 = (-852511414) ^ iIdentityHashCode;
        int i3 = (-852511414) & iIdentityHashCode;
        int i4 = ~((i3 & i2) | (i2 ^ i3));
        int i5 = ((~i4) & (-2011171762)) | (i4 & 2011171761);
        int i6 = i4 & (-2011171762);
        int i7 = -(-(((i6 & i5) | (i5 ^ i6)) * 672));
        int i8 = 1254683224 & i7;
        int i9 = i8 + ((i7 ^ 1254683224) | i8);
        int i10 = ~iIdentityHashCode;
        int i11 = 852511413 & i10;
        int i12 = (852511413 | i10) & (~i11);
        int i13 = ~((i12 & i11) | (i12 ^ i11));
        int i14 = iIdentityHashCode | (-2011171762);
        int i15 = (i14 | (~i14)) & (~i14);
        int i16 = -(-(((i15 & i13) | (i13 ^ i15)) * (-672)));
        int i17 = ((~i16) & i9) | ((~i9) & i16);
        int i18 = -(-((i16 & i9) << 1));
        int i19 = (i17 ^ i18) + ((i18 & i17) << 1);
        int i20 = ((~i10) & 2011171761) | (i10 & (-2011171762));
        int i21 = i10 & 2011171761;
        int i22 = ~((i20 & i21) | (i20 ^ i21));
        int i23 = ((-1064965) & i22) | ((~i22) & 1064964);
        int i24 = i22 & 1064964;
        int i25 = -(~(-(-(((i24 & i23) | (i23 ^ i24)) * 672))));
        int i26 = (-2) - (((i19 & i25) + (i25 | i19)) ^ (-1));
        int iAudioAttributesCompatParcelizer = DefaultAnalyticsCollector$$ExternalSyntheticLambda19.AudioAttributesCompatParcelizer();
        int i27 = ~iAudioAttributesCompatParcelizer;
        int i28 = (-961855587) & i27;
        int i29 = (i27 | (-961855587)) & (~i28);
        int i30 = (i29 & i28) | (i29 ^ i28);
        int i31 = (i30 | (~i30)) & (~i30);
        int i32 = ~iAudioAttributesCompatParcelizer;
        int i33 = (475206089 & i32) | ((-475206090) & iAudioAttributesCompatParcelizer);
        int i34 = 475206089 & iAudioAttributesCompatParcelizer;
        int i35 = ~((i33 & i34) | (i33 ^ i34));
        int i36 = i31 ^ i35;
        int i37 = i31 & i35;
        int i38 = -(-(((i37 & i36) | (i36 ^ i37)) * 210));
        int i39 = ((1736839628 ^ i38) | (1736839628 & i38)) << 1;
        int i40 = -((i38 & (-1736839629)) | (1736839628 & (~i38)));
        int i41 = (i39 ^ i40) + ((i40 & i39) << 1);
        int i42 = (~iAudioAttributesCompatParcelizer) & (i32 | iAudioAttributesCompatParcelizer);
        int i43 = (i42 & 475206089) | (475206089 ^ i42);
        int i44 = (i43 & 961855586) | ((-961855587) & i43) | ((~i43) & 961855586);
        int i45 = (i44 | (~i44)) & (~i44);
        int i46 = (i32 & (-407896129)) | (407896128 & iAudioAttributesCompatParcelizer);
        int i47 = iAudioAttributesCompatParcelizer & (-407896129);
        int i48 = (i47 & i46) | (i46 ^ i47);
        int i49 = (i48 | (~i48)) & (~i48);
        int i50 = i45 ^ i49;
        int i51 = i49 & i45;
        int i52 = ((i51 & i50) | (i50 ^ i51)) * 210;
        int i53 = i41 & i52;
        int i54 = i53 + ((i52 ^ i41) | i53);
        Object obj = null;
        int i55 = this.finalData;
        if (i26 <= i54) {
            Integer.hashCode(i55);
            obj.hashCode();
            throw null;
        }
        int iHashCode = Integer.hashCode(i55);
        int i56 = write;
        int i57 = i56 & 15;
        int i58 = i56 | 15;
        int i59 = (i57 ^ i58) + ((i58 & i57) << 1);
        AudioAttributesCompatParcelizer = i59 % 128;
        if (i59 % 2 != 0) {
            return iHashCode;
        }
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = this.finalData;
        StringBuilder sb = new StringBuilder("L3FallbackApprovalResponseBody(finalData=");
        int i3 = write;
        int i4 = i3 ^ 105;
        int i5 = -(-((i3 & 105) << 1));
        int i6 = (i4 & i5) + (i5 | i4);
        AudioAttributesCompatParcelizer = i6 % 128;
        int i7 = i6 % 2;
        Object obj = null;
        sb.append(i2);
        sb.append(")");
        if (i7 == 0) {
            sb.toString();
            obj.hashCode();
            throw null;
        }
        String string = sb.toString();
        int i8 = AudioAttributesCompatParcelizer + 95;
        write = i8 % 128;
        if (i8 % 2 == 0) {
            return string;
        }
        obj.hashCode();
        throw null;
    }
}
