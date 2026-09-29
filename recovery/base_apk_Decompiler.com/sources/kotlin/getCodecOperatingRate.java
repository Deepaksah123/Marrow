package kotlin;

import android.app.Activity;
import android.util.SparseIntArray;
import androidx.fragment.app.Fragment;
import java.util.HashMap;
import java.util.Map;
import kotlin.avcProfileNumberToConst;

/* JADX INFO: loaded from: classes3.dex */
public final class getCodecOperatingRate {
    private final _checkIntToStringCoercion AudioAttributesCompatParcelizer;
    private boolean IconCompatParcelizer;
    private final Activity read;
    private final Map<Fragment, avcProfileNumberToConst.AudioAttributesCompatParcelizer> write;

    static {
        MediaCodecRendererDecoderInitializationException.IconCompatParcelizer();
    }

    static boolean RemoteActionCompatParcelizer() {
        try {
            Class.forName("o._checkIntToStringCoercion");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public getCodecOperatingRate(Activity activity) {
        this(activity, new _checkIntToStringCoercion(), new HashMap());
    }

    private getCodecOperatingRate(Activity activity, _checkIntToStringCoercion _checkinttostringcoercion, Map<Fragment, avcProfileNumberToConst.AudioAttributesCompatParcelizer> map) {
        this.IconCompatParcelizer = false;
        this.read = activity;
        this.AudioAttributesCompatParcelizer = _checkinttostringcoercion;
        this.write = map;
    }

    public final void write() {
        if (this.IconCompatParcelizer) {
            new Object[]{this.read.getClass().getSimpleName()};
        } else {
            this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(this.read);
            this.IconCompatParcelizer = true;
        }
    }

    public final MediaCodecUtilDecoderQueryException<avcProfileNumberToConst.AudioAttributesCompatParcelizer> IconCompatParcelizer() {
        if (!this.IconCompatParcelizer) {
            return MediaCodecUtilDecoderQueryException.IconCompatParcelizer();
        }
        if (!this.write.isEmpty()) {
            this.write.clear();
        }
        MediaCodecUtilDecoderQueryException<avcProfileNumberToConst.AudioAttributesCompatParcelizer> mediaCodecUtilDecoderQueryExceptionAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
        try {
            this.AudioAttributesCompatParcelizer.read(this.read);
        } catch (IllegalArgumentException | NullPointerException e) {
            if (e instanceof NullPointerException) {
                throw e;
            }
            new Object[]{e.toString()};
            mediaCodecUtilDecoderQueryExceptionAudioAttributesCompatParcelizer = MediaCodecUtilDecoderQueryException.IconCompatParcelizer();
        }
        this.AudioAttributesCompatParcelizer.write();
        this.IconCompatParcelizer = false;
        return mediaCodecUtilDecoderQueryExceptionAudioAttributesCompatParcelizer;
    }

    public final void AudioAttributesCompatParcelizer(Fragment fragment) {
        if (this.IconCompatParcelizer) {
            if (this.write.containsKey(fragment)) {
                new Object[]{fragment.getClass().getSimpleName()};
                return;
            }
            MediaCodecUtilDecoderQueryException<avcProfileNumberToConst.AudioAttributesCompatParcelizer> mediaCodecUtilDecoderQueryExceptionAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
            if (!mediaCodecUtilDecoderQueryExceptionAudioAttributesCompatParcelizer.RemoteActionCompatParcelizer()) {
                new Object[]{fragment.getClass().getSimpleName()};
            } else {
                this.write.put(fragment, mediaCodecUtilDecoderQueryExceptionAudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer());
            }
        }
    }

    public final MediaCodecUtilDecoderQueryException<avcProfileNumberToConst.AudioAttributesCompatParcelizer> RemoteActionCompatParcelizer(Fragment fragment) {
        if (!this.IconCompatParcelizer) {
            return MediaCodecUtilDecoderQueryException.IconCompatParcelizer();
        }
        if (!this.write.containsKey(fragment)) {
            new Object[]{fragment.getClass().getSimpleName()};
            return MediaCodecUtilDecoderQueryException.IconCompatParcelizer();
        }
        avcProfileNumberToConst.AudioAttributesCompatParcelizer audioAttributesCompatParcelizerRemove = this.write.remove(fragment);
        MediaCodecUtilDecoderQueryException<avcProfileNumberToConst.AudioAttributesCompatParcelizer> mediaCodecUtilDecoderQueryExceptionAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
        if (!mediaCodecUtilDecoderQueryExceptionAudioAttributesCompatParcelizer.RemoteActionCompatParcelizer()) {
            new Object[]{fragment.getClass().getSimpleName()};
            return MediaCodecUtilDecoderQueryException.IconCompatParcelizer();
        }
        return MediaCodecUtilDecoderQueryException.write(mediaCodecUtilDecoderQueryExceptionAudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer().read(audioAttributesCompatParcelizerRemove));
    }

    private MediaCodecUtilDecoderQueryException<avcProfileNumberToConst.AudioAttributesCompatParcelizer> AudioAttributesCompatParcelizer() {
        if (!this.IconCompatParcelizer) {
            return MediaCodecUtilDecoderQueryException.IconCompatParcelizer();
        }
        SparseIntArray[] sparseIntArrayArr = this.AudioAttributesCompatParcelizer.read();
        if (sparseIntArrayArr == null) {
            return MediaCodecUtilDecoderQueryException.IconCompatParcelizer();
        }
        if (sparseIntArrayArr[0] == null) {
            return MediaCodecUtilDecoderQueryException.IconCompatParcelizer();
        }
        return MediaCodecUtilDecoderQueryException.write(avcProfileNumberToConst.RemoteActionCompatParcelizer(sparseIntArrayArr));
    }
}
