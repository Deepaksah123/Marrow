package kotlin;

import android.content.LocusId;

/* JADX INFO: loaded from: classes2.dex */
public final class _nonNullNumber {
    private final LocusId AudioAttributesCompatParcelizer;
    private final String RemoteActionCompatParcelizer;

    public _nonNullNumber(String str) {
        this.RemoteActionCompatParcelizer = (String) StringCollectionDeserializer.RemoteActionCompatParcelizer(str, "id cannot be empty");
        this.AudioAttributesCompatParcelizer = IconCompatParcelizer.IconCompatParcelizer(str);
    }

    public final int hashCode() {
        String str = this.RemoteActionCompatParcelizer;
        return (str == null ? 0 : str.hashCode()) + 31;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        _nonNullNumber _nonnullnumber = (_nonNullNumber) obj;
        String str = this.RemoteActionCompatParcelizer;
        if (str == null) {
            return _nonnullnumber.RemoteActionCompatParcelizer == null;
        }
        return str.equals(_nonnullnumber.RemoteActionCompatParcelizer);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LocusIdCompat[");
        sb.append(IconCompatParcelizer());
        sb.append("]");
        return sb.toString();
    }

    public final LocusId read() {
        return this.AudioAttributesCompatParcelizer;
    }

    public static _nonNullNumber write(LocusId locusId) {
        StringCollectionDeserializer.write(locusId, "locusId cannot be null");
        return new _nonNullNumber((String) StringCollectionDeserializer.RemoteActionCompatParcelizer(IconCompatParcelizer.RemoteActionCompatParcelizer(locusId), "id cannot be empty"));
    }

    private String IconCompatParcelizer() {
        int length = this.RemoteActionCompatParcelizer.length();
        StringBuilder sb = new StringBuilder();
        sb.append(length);
        sb.append("_chars");
        return sb.toString();
    }

    static class IconCompatParcelizer {
        static LocusId IconCompatParcelizer(String str) {
            return new LocusId(str);
        }

        static String RemoteActionCompatParcelizer(LocusId locusId) {
            return locusId.getId();
        }
    }
}
