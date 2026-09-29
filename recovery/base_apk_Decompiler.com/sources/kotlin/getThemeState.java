package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class getThemeState {
    public static final accessgetVideoConfigurationC2cp read = new accessgetVideoConfigurationC2cp("NO_VALUE");

    public static /* synthetic */ ThemeState AudioAttributesCompatParcelizer(int i, int i2, setAddressLine2 setaddressline2, int i3) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            setaddressline2 = setAddressLine2.read;
        }
        return AudioAttributesCompatParcelizer(i, i2, setaddressline2);
    }

    public static final <T> ThemeState<T> AudioAttributesCompatParcelizer(int i, int i2, setAddressLine2 setaddressline2) {
        if (i < 0) {
            throw new IllegalArgumentException("replay cannot be negative, but was ".concat(String.valueOf(i)).toString());
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("extraBufferCapacity cannot be negative, but was ".concat(String.valueOf(i2)).toString());
        }
        if (i <= 0 && i2 <= 0 && setaddressline2 != setAddressLine2.read) {
            throw new IllegalArgumentException("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy ".concat(String.valueOf(setaddressline2)).toString());
        }
        int i3 = i2 + i;
        if (i3 < 0) {
            i3 = Integer.MAX_VALUE;
        }
        return new ThemeStateCompanion(i, i3, setaddressline2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object write(Object[] objArr, long j) {
        return objArr[((int) j) & (objArr.length - 1)];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IconCompatParcelizer(Object[] objArr, long j, Object obj) {
        objArr[((int) j) & (objArr.length - 1)] = obj;
    }

    public static final <T> NewNumberOtpResendRequest<T> write(isDark<? extends T> isdark, CurrentQuery currentQuery, int i, setAddressLine2 setaddressline2) {
        if ((i == 0 || i == -3) && setaddressline2 == setAddressLine2.read) {
            return isdark;
        }
        return new getMinBitRateReq(isdark, currentQuery, i, setaddressline2);
    }
}
