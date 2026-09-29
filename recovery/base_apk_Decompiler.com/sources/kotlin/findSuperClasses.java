package kotlin;

import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class findSuperClasses {
    public static void IconCompatParcelizer(boolean z, String str) throws SchemaAware {
        if (!z) {
            throw SchemaAware.RemoteActionCompatParcelizer(str, null);
        }
    }

    public static int write(closeOnFailAndThrowAsIOE closeonfailandthrowasioe, byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        while (i3 < i2) {
            int i4 = closeonfailandthrowasioe.read(bArr, i + i3, i2 - i3);
            if (i4 == -1) {
                break;
            }
            i3 += i4;
        }
        return i3;
    }

    public static boolean AudioAttributesCompatParcelizer(closeOnFailAndThrowAsIOE closeonfailandthrowasioe, byte[] bArr, int i, int i2) throws IOException {
        try {
            closeonfailandthrowasioe.IconCompatParcelizer(bArr, i, i2);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean AudioAttributesCompatParcelizer(closeOnFailAndThrowAsIOE closeonfailandthrowasioe, int i) throws IOException {
        try {
            closeonfailandthrowasioe.IconCompatParcelizer(i);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean IconCompatParcelizer(closeOnFailAndThrowAsIOE closeonfailandthrowasioe, byte[] bArr, int i, boolean z) throws IOException {
        try {
            return closeonfailandthrowasioe.RemoteActionCompatParcelizer(bArr, 0, i, z);
        } catch (EOFException e) {
            if (z) {
                return false;
            }
            throw e;
        }
    }
}
