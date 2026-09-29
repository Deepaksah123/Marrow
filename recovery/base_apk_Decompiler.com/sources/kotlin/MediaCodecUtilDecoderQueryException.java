package kotlin;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class MediaCodecUtilDecoderQueryException<T> {
    private final T IconCompatParcelizer;

    private MediaCodecUtilDecoderQueryException() {
        this.IconCompatParcelizer = null;
    }

    private MediaCodecUtilDecoderQueryException(T t) {
        if (t == null) {
            throw new NullPointerException("value for optional is empty.");
        }
        this.IconCompatParcelizer = t;
    }

    public static <T> MediaCodecUtilDecoderQueryException<T> IconCompatParcelizer() {
        return new MediaCodecUtilDecoderQueryException<>();
    }

    public static <T> MediaCodecUtilDecoderQueryException<T> write(T t) {
        return new MediaCodecUtilDecoderQueryException<>(t);
    }

    public static <T> MediaCodecUtilDecoderQueryException<T> read(T t) {
        return t == null ? IconCompatParcelizer() : write(t);
    }

    public final T AudioAttributesCompatParcelizer() {
        T t = this.IconCompatParcelizer;
        if (t != null) {
            return t;
        }
        throw new NoSuchElementException("No value present");
    }

    public final boolean RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer != null;
    }
}
