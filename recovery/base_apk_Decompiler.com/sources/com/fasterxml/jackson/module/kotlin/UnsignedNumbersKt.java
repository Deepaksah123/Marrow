package com.fasterxml.jackson.module.kotlin;

import java.math.BigInteger;
import kotlin.Metadata;
import kotlin.setClientAuthToken;
import kotlin.setClientId;
import kotlin.setCustomerEmail;
import kotlin.setCustomerPhone;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0010\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000ø\u0001\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0016\u0010\n\u001a\u0004\u0018\u00010\t*\u00020\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u0016\u0010\u000e\u001a\u0004\u0018\u00010\r*\u00020\fø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\"\u0014\u0010\u0010\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019"}, d2 = {"", "Lo/setClientAuthToken;", "asUByte", "(S)Lo/setClientAuthToken;", "", "Lo/setCustomerEmail;", "asUInt", "(J)Lo/setCustomerEmail;", "Ljava/math/BigInteger;", "Lo/setClientId;", "asULong", "(Ljava/math/BigInteger;)Lo/setClientId;", "", "Lo/setCustomerPhone;", "asUShort", "(I)Lo/setCustomerPhone;", "uLongMaxValue", "Ljava/math/BigInteger;"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class UnsignedNumbersKt {
    private static final BigInteger uLongMaxValue = new BigInteger(Long.toUnsignedString(-1));

    public static final setClientAuthToken asUByte(short s) {
        if (s < 0 || s > 255) {
            return null;
        }
        return setClientAuthToken.AudioAttributesCompatParcelizer(setClientAuthToken.IconCompatParcelizer((byte) s));
    }

    public static final setCustomerPhone asUShort(int i) {
        if (i < 0 || i > 65535) {
            return null;
        }
        return setCustomerPhone.AudioAttributesCompatParcelizer(setCustomerPhone.IconCompatParcelizer((short) i));
    }

    public static final setCustomerEmail asUInt(long j) {
        if (j < 0) {
            return null;
        }
        long j2 = -1;
        if (j <= ((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32)))) {
            return setCustomerEmail.IconCompatParcelizer(setCustomerEmail.read((int) j));
        }
        return null;
    }

    public static final setClientId asULong(BigInteger bigInteger) {
        toMagicModuleMetaRepoModel.write(bigInteger, "");
        if (bigInteger.compareTo(BigInteger.ZERO) < 0 || bigInteger.compareTo(uLongMaxValue) > 0) {
            return null;
        }
        return setClientId.read(setClientId.RemoteActionCompatParcelizer(bigInteger.longValue()));
    }
}
