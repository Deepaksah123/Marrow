package kotlin;

import android.graphics.DashPathEffect;
import android.graphics.Paint;

/* JADX INFO: loaded from: classes2.dex */
public final class getOfflineLicenseKeySetId extends openInternal {
    private float AudioAttributesCompatParcelizer;
    private float AudioAttributesImplApi26Parcelizer;
    private Paint.Style AudioAttributesImplBaseParcelizer;
    private String IconCompatParcelizer;
    private int RemoteActionCompatParcelizer;
    private AudioAttributesCompatParcelizer read;
    private DashPathEffect write;

    public enum AudioAttributesCompatParcelizer {
        LEFT_TOP,
        /* JADX INFO: Fake field, exist only in values array */
        LEFT_BOTTOM,
        RIGHT_TOP,
        RIGHT_BOTTOM
    }

    public final float read() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final float AudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public final int AudioAttributesCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final DashPathEffect IconCompatParcelizer() {
        return this.write;
    }

    public final Paint.Style AudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public final AudioAttributesCompatParcelizer write() {
        return this.read;
    }

    public final String RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer;
    }
}
