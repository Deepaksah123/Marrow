package kotlin;

import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public final class _withResolved {
    public final long AudioAttributesCompatParcelizer;
    public final long RemoteActionCompatParcelizer;
    private int read;
    private final String write;

    public _withResolved(String str, long j, long j2) {
        this.write = str == null ? "" : str;
        this.RemoteActionCompatParcelizer = j;
        this.AudioAttributesCompatParcelizer = j2;
    }

    public final Uri AudioAttributesCompatParcelizer(String str) {
        return _idFrom.read(str, this.write);
    }

    private String read(String str) {
        return _idFrom.RemoteActionCompatParcelizer(str, this.write);
    }

    public final _withResolved IconCompatParcelizer(_withResolved _withresolved, String str) {
        String str2 = read(str);
        if (_withresolved == null || !str2.equals(_withresolved.read(str))) {
            return null;
        }
        long j = this.AudioAttributesCompatParcelizer;
        if (j != -1) {
            long j2 = this.RemoteActionCompatParcelizer;
            if (j2 + j == _withresolved.RemoteActionCompatParcelizer) {
                long j3 = _withresolved.AudioAttributesCompatParcelizer;
                return new _withResolved(str2, j2, j3 != -1 ? j + j3 : -1L);
            }
        }
        long j4 = _withresolved.AudioAttributesCompatParcelizer;
        if (j4 == -1) {
            return null;
        }
        long j5 = _withresolved.RemoteActionCompatParcelizer;
        if (j5 + j4 == this.RemoteActionCompatParcelizer) {
            return new _withResolved(str2, j5, j != -1 ? j4 + j : -1L);
        }
        return null;
    }

    public final int hashCode() {
        if (this.read == 0) {
            int i = (int) this.RemoteActionCompatParcelizer;
            this.read = ((((i + 527) * 31) + ((int) this.AudioAttributesCompatParcelizer)) * 31) + this.write.hashCode();
        }
        return this.read;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        _withResolved _withresolved = (_withResolved) obj;
        return this.RemoteActionCompatParcelizer == _withresolved.RemoteActionCompatParcelizer && this.AudioAttributesCompatParcelizer == _withresolved.AudioAttributesCompatParcelizer && this.write.equals(_withresolved.write);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RangedUri(referenceUri=");
        sb.append(this.write);
        sb.append(", start=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", length=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }
}
