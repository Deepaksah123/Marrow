package kotlin;

import com.google.android.exoplayer2.C;

/* JADX INFO: loaded from: classes.dex */
public class getMaxMcqCount extends getIsMockTest {
    public static final Integer AudioAttributesImplApi26Parcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return TestGroupLSModel.read(str, 10);
    }

    public static final Integer read(String str, int i) {
        int i2;
        boolean z;
        int i3;
        toMagicModuleMetaRepoModel.write(str, "");
        setStatusTimestamp.RemoteActionCompatParcelizer(i);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i4 = 0;
        char cCharAt = str.charAt(0);
        int i5 = toMagicModuleMetaRepoModel.read((int) cCharAt, 48);
        int i6 = C.RATE_UNSET_INT;
        if (i5 < 0) {
            z = true;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                i2 = 1;
                z = false;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                i6 = Integer.MIN_VALUE;
                i2 = 1;
            }
        } else {
            i2 = 0;
            z = false;
        }
        int i7 = -59652323;
        while (i2 < length) {
            int iAudioAttributesCompatParcelizer = setStatusTimestamp.AudioAttributesCompatParcelizer(str.charAt(i2), i);
            if (iAudioAttributesCompatParcelizer < 0) {
                return null;
            }
            if ((i4 < i7 && (i7 != -59652323 || i4 < (i7 = i6 / i))) || (i3 = i4 * i) < i6 + iAudioAttributesCompatParcelizer) {
                return null;
            }
            i4 = i3 - iAudioAttributesCompatParcelizer;
            i2++;
        }
        return z ? Integer.valueOf(i4) : Integer.valueOf(-i4);
    }

    public static final Long MediaBrowserCompatCustomActionResultReceiver(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return TestGroupLSModel.AudioAttributesImplBaseParcelizer(str);
    }

    public static final Long AudioAttributesImplBaseParcelizer(String str) {
        boolean z;
        toMagicModuleMetaRepoModel.write(str, "");
        int i = 10;
        setStatusTimestamp.RemoteActionCompatParcelizer(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i2 = 0;
        char cCharAt = str.charAt(0);
        int i3 = toMagicModuleMetaRepoModel.read((int) cCharAt, 48);
        long j = C.TIME_UNSET;
        if (i3 < 0) {
            z = true;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                z = false;
                i2 = 1;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                j = Long.MIN_VALUE;
                i2 = 1;
            }
        } else {
            z = false;
        }
        long j2 = 0;
        long j3 = -256204778801521550L;
        while (i2 < length) {
            int iAudioAttributesCompatParcelizer = setStatusTimestamp.AudioAttributesCompatParcelizer(str.charAt(i2), i);
            if (iAudioAttributesCompatParcelizer < 0) {
                return null;
            }
            if (j2 < j3) {
                if (j3 == -256204778801521550L) {
                    j3 = j / 10;
                    if (j2 < j3) {
                    }
                }
                return null;
            }
            long j4 = j2 * 10;
            int i4 = length;
            long j5 = iAudioAttributesCompatParcelizer;
            if (j4 < j + j5) {
                return null;
            }
            j2 = j4 - j5;
            i2++;
            length = i4;
            i = 10;
        }
        return z ? Long.valueOf(j2) : Long.valueOf(-j2);
    }
}
