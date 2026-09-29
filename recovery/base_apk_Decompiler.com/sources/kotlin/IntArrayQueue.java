package kotlin;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes5.dex */
public final class IntArrayQueue {
    private static IntArrayQueue read;
    private final MediaCodecDecoderException IconCompatParcelizer;
    private static long AudioAttributesCompatParcelizer = TimeUnit.HOURS.toSeconds(1);
    private static final Pattern write = Pattern.compile("\\AA[\\w-]{38}\\z");

    private IntArrayQueue(MediaCodecDecoderException mediaCodecDecoderException) {
        this.IconCompatParcelizer = mediaCodecDecoderException;
    }

    public static IntArrayQueue RemoteActionCompatParcelizer() {
        return read(alignVideoSizeV21.read());
    }

    private static IntArrayQueue read(MediaCodecDecoderException mediaCodecDecoderException) {
        if (read == null) {
            read = new IntArrayQueue(mediaCodecDecoderException);
        }
        return read;
    }

    public final boolean IconCompatParcelizer(createForVideoDecoding createforvideodecoding) {
        return TextUtils.isEmpty(createforvideodecoding.read()) || createforvideodecoding.AudioAttributesImplApi21Parcelizer() + createforvideodecoding.AudioAttributesCompatParcelizer() < IconCompatParcelizer() + AudioAttributesCompatParcelizer;
    }

    public final long IconCompatParcelizer() {
        return TimeUnit.MILLISECONDS.toSeconds(AudioAttributesCompatParcelizer());
    }

    public final long AudioAttributesCompatParcelizer() {
        return this.IconCompatParcelizer.IconCompatParcelizer();
    }

    static boolean read(String str) {
        return str.contains(":");
    }

    static boolean IconCompatParcelizer(String str) {
        return write.matcher(str).matches();
    }

    public static long write() {
        return (long) (Math.random() * 1000.0d);
    }
}
