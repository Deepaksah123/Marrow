package kotlin;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
final class waitUntilQueueingComplete extends maybeThrowMediaCodecException {
    private final String IconCompatParcelizer;
    private final List<String> RemoteActionCompatParcelizer;

    waitUntilQueueingComplete(String str, List<String> list) {
        if (str == null) {
            throw new NullPointerException("Null userAgent");
        }
        this.IconCompatParcelizer = str;
        if (list == null) {
            throw new NullPointerException("Null usedDates");
        }
        this.RemoteActionCompatParcelizer = list;
    }

    @Override // kotlin.maybeThrowMediaCodecException
    public final String RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    @Override // kotlin.maybeThrowMediaCodecException
    public final List<String> AudioAttributesCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HeartBeatResult{userAgent=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", usedDates=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof maybeThrowMediaCodecException)) {
            return false;
        }
        maybeThrowMediaCodecException maybethrowmediacodecexception = (maybeThrowMediaCodecException) obj;
        return this.IconCompatParcelizer.equals(maybethrowmediacodecexception.RemoteActionCompatParcelizer()) && this.RemoteActionCompatParcelizer.equals(maybethrowmediacodecexception.AudioAttributesCompatParcelizer());
    }

    public final int hashCode() {
        return this.RemoteActionCompatParcelizer.hashCode() ^ ((this.IconCompatParcelizer.hashCode() ^ 1000003) * 1000003);
    }
}
