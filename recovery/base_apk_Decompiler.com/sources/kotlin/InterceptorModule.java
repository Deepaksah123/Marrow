package kotlin;

import java.net.IDN;
import java.net.InetAddress;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public final class InterceptorModule {
    public static final String write(String str) {
        InetAddress inetAddressIconCompatParcelizer;
        toMagicModuleMetaRepoModel.write(str, "");
        if (TestGroupLSModel.write((CharSequence) str, (CharSequence) ":", false)) {
            if (TestGroupLSModel.MediaBrowserCompatCustomActionResultReceiver(str, "[") && TestGroupLSModel.AudioAttributesImplApi21Parcelizer(str, "]")) {
                inetAddressIconCompatParcelizer = IconCompatParcelizer(str, 1, str.length() - 1);
            } else {
                inetAddressIconCompatParcelizer = IconCompatParcelizer(str, 0, str.length());
            }
            if (inetAddressIconCompatParcelizer == null) {
                return null;
            }
            byte[] address = inetAddressIconCompatParcelizer.getAddress();
            if (address.length == 16) {
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(address, "");
                return IconCompatParcelizer(address);
            }
            if (address.length == 4) {
                return inetAddressIconCompatParcelizer.getHostAddress();
            }
            StringBuilder sb = new StringBuilder("Invalid IPv6 address: '");
            sb.append(str);
            sb.append('\'');
            throw new AssertionError(sb.toString());
        }
        try {
            String ascii = IDN.toASCII(str);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(ascii, "");
            Locale locale = Locale.US;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(locale, "");
            String lowerCase = ascii.toLowerCase(locale);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lowerCase, "");
            if (lowerCase.length() == 0) {
                return null;
            }
            if (AudioAttributesCompatParcelizer(lowerCase)) {
                return null;
            }
            return lowerCase;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    private static final boolean AudioAttributesCompatParcelizer(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (toMagicModuleMetaRepoModel.read((int) cCharAt, 31) <= 0 || toMagicModuleMetaRepoModel.read((int) cCharAt, 127) >= 0 || TestGroupLSModel.IconCompatParcelizer((CharSequence) " #%/:?@[\\]", cCharAt, 0, false, 6) != -1) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0073, code lost:
    
        if (r4 == 16) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0075, code lost:
    
        if (r5 != (-1)) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0077, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0078, code lost:
    
        r11 = r4 - r5;
        java.lang.System.arraycopy(r1, r5, r1, 16 - r11, r11);
        java.util.Arrays.fill(r1, r5, (16 - r4) + r5, (byte) 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0088, code lost:
    
        return java.net.InetAddress.getByAddress(r1);
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final java.net.InetAddress IconCompatParcelizer(java.lang.String r11, int r12, int r13) {
        /*
            r0 = 16
            byte[] r1 = new byte[r0]
            r2 = 0
            r3 = -1
            r4 = r2
            r5 = r3
            r6 = r5
        L9:
            r7 = 0
            if (r12 >= r13) goto L73
            if (r4 != r0) goto Lf
            return r7
        Lf:
            int r8 = r12 + 2
            if (r8 > r13) goto L26
            java.lang.String r9 = "::"
            boolean r9 = kotlin.TestGroupLSModel.RemoteActionCompatParcelizer(r11, r9, r12)
            if (r9 == 0) goto L26
            if (r5 == r3) goto L1e
            return r7
        L1e:
            int r4 = r4 + 2
            r5 = r4
            if (r8 != r13) goto L24
            goto L73
        L24:
            r6 = r8
            goto L49
        L26:
            if (r4 == 0) goto L48
            java.lang.String r8 = ":"
            boolean r8 = kotlin.TestGroupLSModel.RemoteActionCompatParcelizer(r11, r8, r12)
            if (r8 == 0) goto L33
            int r12 = r12 + 1
            goto L48
        L33:
            java.lang.String r8 = "."
            boolean r12 = kotlin.TestGroupLSModel.RemoteActionCompatParcelizer(r11, r8, r12)
            if (r12 == 0) goto L47
            int r12 = r4 + (-2)
            boolean r11 = RemoteActionCompatParcelizer(r11, r6, r13, r1, r12)
            if (r11 != 0) goto L44
            return r7
        L44:
            int r4 = r4 + 2
            goto L73
        L47:
            return r7
        L48:
            r6 = r12
        L49:
            r8 = r2
            r12 = r6
        L4b:
            if (r12 >= r13) goto L5d
            char r9 = r11.charAt(r12)
            int r9 = kotlin.FirebaseDataModule.RemoteActionCompatParcelizer(r9)
            if (r9 == r3) goto L5d
            int r8 = r8 << 4
            int r8 = r8 + r9
            int r12 = r12 + 1
            goto L4b
        L5d:
            int r9 = r12 - r6
            if (r9 == 0) goto L72
            r10 = 4
            if (r9 > r10) goto L72
            int r7 = r8 >>> 8
            byte r7 = (byte) r7
            r1[r4] = r7
            int r7 = r4 + 2
            byte r8 = (byte) r8
            int r4 = r4 + 1
            r1[r4] = r8
            r4 = r7
            goto L9
        L72:
            return r7
        L73:
            if (r4 == r0) goto L84
            if (r5 != r3) goto L78
            return r7
        L78:
            int r11 = r4 - r5
            int r12 = 16 - r11
            java.lang.System.arraycopy(r1, r5, r1, r12, r11)
            int r0 = r0 - r4
            int r0 = r0 + r5
            java.util.Arrays.fill(r1, r5, r0, r2)
        L84:
            java.net.InetAddress r11 = java.net.InetAddress.getByAddress(r1)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.InterceptorModule.IconCompatParcelizer(java.lang.String, int, int):java.net.InetAddress");
    }

    private static final boolean RemoteActionCompatParcelizer(String str, int i, int i2, byte[] bArr, int i3) {
        int i4 = i3;
        while (i < i2) {
            if (i4 == bArr.length) {
                return false;
            }
            if (i4 != i3) {
                if (str.charAt(i) != '.') {
                    return false;
                }
                i++;
            }
            int i5 = i;
            int i6 = 0;
            while (i5 < i2) {
                char cCharAt = str.charAt(i5);
                if (toMagicModuleMetaRepoModel.read((int) cCharAt, 48) < 0 || toMagicModuleMetaRepoModel.read((int) cCharAt, 57) > 0) {
                    break;
                }
                if ((i6 == 0 && i != i5) || (i6 = ((i6 * 10) + cCharAt) - 48) > 255) {
                    return false;
                }
                i5++;
            }
            if (i5 - i == 0) {
                return false;
            }
            bArr[i4] = (byte) i6;
            i4++;
            i = i5;
        }
        return i4 == i3 + 4;
    }

    private static final String IconCompatParcelizer(byte[] bArr) {
        int i = -1;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < bArr.length) {
            int i5 = i3;
            while (i5 < 16 && bArr[i5] == 0 && bArr[i5 + 1] == 0) {
                i5 += 2;
            }
            int i6 = i5 - i3;
            if (i6 > i4 && i6 >= 4) {
                i = i3;
                i4 = i6;
            }
            i3 = i5 + 2;
        }
        resetCurrentSelectedPosition resetcurrentselectedposition = new resetCurrentSelectedPosition();
        while (i2 < bArr.length) {
            if (i2 == i) {
                resetcurrentselectedposition.read(58);
                i2 += i4;
                if (i2 == 16) {
                    resetcurrentselectedposition.read(58);
                }
            } else {
                if (i2 > 0) {
                    resetcurrentselectedposition.read(58);
                }
                resetcurrentselectedposition.MediaDescriptionCompat((FirebaseDataModule.write(bArr[i2]) << 8) | FirebaseDataModule.write(bArr[i2 + 1]));
                i2 += 2;
            }
        }
        return resetcurrentselectedposition.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
    }
}
