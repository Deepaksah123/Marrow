package kotlin;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamException;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes3.dex */
public final class addTrackSelectionInternal extends Number {
    private final String write;

    public addTrackSelectionInternal(String str) {
        this.write = str;
    }

    @Override // java.lang.Number
    public final int intValue() {
        try {
            try {
                return Integer.parseInt(this.write);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(this.write);
            }
        } catch (NumberFormatException unused2) {
            return new BigDecimal(this.write).intValue();
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        try {
            return Long.parseLong(this.write);
        } catch (NumberFormatException unused) {
            return new BigDecimal(this.write).longValue();
        }
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return Float.parseFloat(this.write);
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return Double.parseDouble(this.write);
    }

    public final String toString() {
        return this.write;
    }

    private Object writeReplace() throws ObjectStreamException {
        return new BigDecimal(this.write);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("Deserialization is unsupported");
    }

    public final int hashCode() {
        return this.write.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof addTrackSelectionInternal)) {
            return false;
        }
        String str = this.write;
        String str2 = ((addTrackSelectionInternal) obj).write;
        return str == str2 || str.equals(str2);
    }
}
