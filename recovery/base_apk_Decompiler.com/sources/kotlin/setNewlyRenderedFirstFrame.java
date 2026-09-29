package kotlin;

import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class setNewlyRenderedFirstFrame {
    private final HashSet<String> AudioAttributesCompatParcelizer;

    private setNewlyRenderedFirstFrame(String[] strArr) {
        this.AudioAttributesCompatParcelizer = new HashSet<>();
        AudioAttributesCompatParcelizer(strArr);
    }

    private setNewlyRenderedFirstFrame(HashSet<String> hashSet) {
        HashSet<String> hashSet2 = new HashSet<>();
        this.AudioAttributesCompatParcelizer = hashSet2;
        hashSet2.addAll(hashSet);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.AudioAttributesCompatParcelizer.equals(((setNewlyRenderedFirstFrame) obj).AudioAttributesCompatParcelizer);
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = this.AudioAttributesCompatParcelizer.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (getTimelines.RemoteActionCompatParcelizer.contains(next)) {
                sb.append(next);
                sb.append(it.hasNext() ? "," : "");
            }
        }
        return sb.toString();
    }

    final boolean IconCompatParcelizer(String str) {
        return RendererCapabilitiesListener.read(this.AudioAttributesCompatParcelizer, str);
    }

    final boolean read() {
        return !this.AudioAttributesCompatParcelizer.isEmpty();
    }

    private void AudioAttributesCompatParcelizer(String[] strArr) {
        if (strArr == null || strArr.length <= 0) {
            return;
        }
        for (String str : strArr) {
            if (RendererCapabilitiesListener.read(getTimelines.RemoteActionCompatParcelizer, str)) {
                this.AudioAttributesCompatParcelizer.add(RendererCapabilitiesListener.IconCompatParcelizer(str));
            }
        }
    }

    static setNewlyRenderedFirstFrame AudioAttributesCompatParcelizer(String str) {
        return new setNewlyRenderedFirstFrame(str.split(","));
    }

    static setNewlyRenderedFirstFrame read(String[] strArr) {
        return new setNewlyRenderedFirstFrame(strArr);
    }

    static setNewlyRenderedFirstFrame IconCompatParcelizer() {
        return new setNewlyRenderedFirstFrame(getTimelines.AudioAttributesCompatParcelizer);
    }
}
