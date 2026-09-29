package kotlin;

import java.security.MessageDigest;

/* JADX INFO: loaded from: classes2.dex */
public final class isRated<T> {
    private static final RemoteActionCompatParcelizer<Object> RemoteActionCompatParcelizer = new RemoteActionCompatParcelizer<Object>() { // from class: o.isRated.3
        @Override // o.isRated.RemoteActionCompatParcelizer
        public final void RemoteActionCompatParcelizer(byte[] bArr, Object obj, MessageDigest messageDigest) {
        }
    };
    private final T AudioAttributesCompatParcelizer;
    private final RemoteActionCompatParcelizer<T> IconCompatParcelizer;
    private final String read;
    private volatile byte[] write;

    public interface RemoteActionCompatParcelizer<T> {
        void RemoteActionCompatParcelizer(byte[] bArr, T t, MessageDigest messageDigest);
    }

    public static <T> isRated<T> write(String str) {
        return new isRated<>(str, null, AudioAttributesCompatParcelizer());
    }

    public static <T> isRated<T> AudioAttributesCompatParcelizer(String str, T t) {
        return new isRated<>(str, t, AudioAttributesCompatParcelizer());
    }

    public static <T> isRated<T> RemoteActionCompatParcelizer(String str, T t, RemoteActionCompatParcelizer<T> remoteActionCompatParcelizer) {
        return new isRated<>(str, t, remoteActionCompatParcelizer);
    }

    private isRated(String str, T t, RemoteActionCompatParcelizer<T> remoteActionCompatParcelizer) {
        this.read = moveMediaSource.IconCompatParcelizer(str);
        this.AudioAttributesCompatParcelizer = t;
        this.IconCompatParcelizer = (RemoteActionCompatParcelizer) moveMediaSource.AudioAttributesCompatParcelizer(remoteActionCompatParcelizer);
    }

    public final T read() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final void AudioAttributesCompatParcelizer(T t, MessageDigest messageDigest) {
        this.IconCompatParcelizer.RemoteActionCompatParcelizer(RemoteActionCompatParcelizer(), t, messageDigest);
    }

    private byte[] RemoteActionCompatParcelizer() {
        if (this.write == null) {
            this.write = this.read.getBytes(onVolumeChanged.read);
        }
        return this.write;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof isRated) {
            return this.read.equals(((isRated) obj).read);
        }
        return false;
    }

    public final int hashCode() {
        return this.read.hashCode();
    }

    private static <T> RemoteActionCompatParcelizer<T> AudioAttributesCompatParcelizer() {
        return (RemoteActionCompatParcelizer<T>) RemoteActionCompatParcelizer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Option{key='");
        sb.append(this.read);
        sb.append("'}");
        return sb.toString();
    }
}
