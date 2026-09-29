package kotlin;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final class MediaCodecUtilExternalSyntheticLambda3 {
    private final Bundle IconCompatParcelizer;

    static {
        MediaCodecRendererDecoderInitializationException.IconCompatParcelizer();
    }

    public MediaCodecUtilExternalSyntheticLambda3() {
        this(new Bundle());
    }

    public MediaCodecUtilExternalSyntheticLambda3(Bundle bundle) {
        this.IconCompatParcelizer = (Bundle) bundle.clone();
    }

    private boolean read(String str) {
        return str != null && this.IconCompatParcelizer.containsKey(str);
    }

    public final MediaCodecUtilDecoderQueryException<Boolean> IconCompatParcelizer(String str) {
        if (!read(str)) {
            return MediaCodecUtilDecoderQueryException.IconCompatParcelizer();
        }
        try {
            return MediaCodecUtilDecoderQueryException.read((Boolean) this.IconCompatParcelizer.get(str));
        } catch (ClassCastException e) {
            new Object[]{str, e.getMessage()};
            return MediaCodecUtilDecoderQueryException.IconCompatParcelizer();
        }
    }

    public final MediaCodecUtilDecoderQueryException<Double> write(String str) {
        if (!read(str)) {
            return MediaCodecUtilDecoderQueryException.IconCompatParcelizer();
        }
        Object obj = this.IconCompatParcelizer.get(str);
        if (obj == null) {
            return MediaCodecUtilDecoderQueryException.IconCompatParcelizer();
        }
        if (obj instanceof Float) {
            return MediaCodecUtilDecoderQueryException.write(Double.valueOf(((Float) obj).doubleValue()));
        }
        if (obj instanceof Double) {
            return MediaCodecUtilDecoderQueryException.write((Double) obj);
        }
        new Object[]{str};
        return MediaCodecUtilDecoderQueryException.IconCompatParcelizer();
    }

    public final MediaCodecUtilDecoderQueryException<Long> RemoteActionCompatParcelizer(String str) {
        if (AudioAttributesCompatParcelizer(str).RemoteActionCompatParcelizer()) {
            return MediaCodecUtilDecoderQueryException.write(Long.valueOf(r0.AudioAttributesCompatParcelizer().intValue()));
        }
        return MediaCodecUtilDecoderQueryException.IconCompatParcelizer();
    }

    private MediaCodecUtilDecoderQueryException<Integer> AudioAttributesCompatParcelizer(String str) {
        if (!read(str)) {
            return MediaCodecUtilDecoderQueryException.IconCompatParcelizer();
        }
        try {
            return MediaCodecUtilDecoderQueryException.read((Integer) this.IconCompatParcelizer.get(str));
        } catch (ClassCastException e) {
            new Object[]{str, e.getMessage()};
            return MediaCodecUtilDecoderQueryException.IconCompatParcelizer();
        }
    }
}
