package kotlin;

import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class parseStandardGenreAttribute implements Serializable {
    private static final parseStandardGenreAttribute write = new parseStandardGenreAttribute(new int[0]);
    private final int IconCompatParcelizer;
    private final transient int RemoteActionCompatParcelizer;
    private final int[] read;

    public static parseStandardGenreAttribute write() {
        return write;
    }

    public static parseStandardGenreAttribute write(int[] iArr) {
        return iArr.length == 0 ? write : new parseStandardGenreAttribute(Arrays.copyOf(iArr, iArr.length));
    }

    private parseStandardGenreAttribute(int[] iArr) {
        this(iArr, iArr.length);
    }

    private parseStandardGenreAttribute(int[] iArr, int i) {
        this.read = iArr;
        this.RemoteActionCompatParcelizer = 0;
        this.IconCompatParcelizer = i;
    }

    private int RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer - this.RemoteActionCompatParcelizer;
    }

    private boolean AudioAttributesCompatParcelizer() {
        return this.IconCompatParcelizer == this.RemoteActionCompatParcelizer;
    }

    private int read(int i) {
        parseStsd.write(i, RemoteActionCompatParcelizer());
        return this.read[this.RemoteActionCompatParcelizer + i];
    }

    private int[] IconCompatParcelizer() {
        return Arrays.copyOfRange(this.read, this.RemoteActionCompatParcelizer, this.IconCompatParcelizer);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof parseStandardGenreAttribute)) {
            return false;
        }
        parseStandardGenreAttribute parsestandardgenreattribute = (parseStandardGenreAttribute) obj;
        if (RemoteActionCompatParcelizer() != parsestandardgenreattribute.RemoteActionCompatParcelizer()) {
            return false;
        }
        for (int i = 0; i < RemoteActionCompatParcelizer(); i++) {
            if (read(i) != parsestandardgenreattribute.read(i)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int iWrite = 1;
        for (int i = this.RemoteActionCompatParcelizer; i < this.IconCompatParcelizer; i++) {
            iWrite = (iWrite * 31) + parseTextAttribute.write(this.read[i]);
        }
        return iWrite;
    }

    public final String toString() {
        if (AudioAttributesCompatParcelizer()) {
            return ThemeAlphaConstantsKt.PATH_SEGMENT_ENCODE_SET_URI;
        }
        StringBuilder sb = new StringBuilder(RemoteActionCompatParcelizer() * 5);
        sb.append('[');
        sb.append(this.read[this.RemoteActionCompatParcelizer]);
        int i = this.RemoteActionCompatParcelizer;
        while (true) {
            i++;
            if (i < this.IconCompatParcelizer) {
                sb.append(", ");
                sb.append(this.read[i]);
            } else {
                sb.append(']');
                return sb.toString();
            }
        }
    }

    private parseStandardGenreAttribute AudioAttributesImplApi26Parcelizer() {
        return read() ? new parseStandardGenreAttribute(IconCompatParcelizer()) : this;
    }

    private boolean read() {
        return this.IconCompatParcelizer < this.read.length;
    }

    final Object writeReplace() {
        return AudioAttributesImplApi26Parcelizer();
    }

    final Object readResolve() {
        return AudioAttributesCompatParcelizer() ? write : this;
    }
}
