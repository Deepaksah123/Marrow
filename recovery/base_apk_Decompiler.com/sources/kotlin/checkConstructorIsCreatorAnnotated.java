package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes4.dex */
public final class checkConstructorIsCreatorAnnotated {
    public static final checkConstructorIsCreatorAnnotated AudioAttributesCompatParcelizer;
    public static final checkConstructorIsCreatorAnnotated AudioAttributesImplBaseParcelizer;
    public static final checkConstructorIsCreatorAnnotated IconCompatParcelizer;
    public static final checkConstructorIsCreatorAnnotated RemoteActionCompatParcelizer;
    public static final checkConstructorIsCreatorAnnotated read;
    public static final checkConstructorIsCreatorAnnotated write;
    final float[] AudioAttributesImplApi21Parcelizer;
    final float[] MediaBrowserCompatCustomActionResultReceiver;
    final float[] AudioAttributesImplApi26Parcelizer = new float[3];
    private boolean MediaBrowserCompatItemReceiver = true;

    static {
        checkConstructorIsCreatorAnnotated checkconstructoriscreatorannotated = new checkConstructorIsCreatorAnnotated();
        write = checkconstructoriscreatorannotated;
        AudioAttributesCompatParcelizer(checkconstructoriscreatorannotated);
        write(checkconstructoriscreatorannotated);
        checkConstructorIsCreatorAnnotated checkconstructoriscreatorannotated2 = new checkConstructorIsCreatorAnnotated();
        AudioAttributesImplBaseParcelizer = checkconstructoriscreatorannotated2;
        IconCompatParcelizer(checkconstructoriscreatorannotated2);
        write(checkconstructoriscreatorannotated2);
        checkConstructorIsCreatorAnnotated checkconstructoriscreatorannotated3 = new checkConstructorIsCreatorAnnotated();
        IconCompatParcelizer = checkconstructoriscreatorannotated3;
        read(checkconstructoriscreatorannotated3);
        write(checkconstructoriscreatorannotated3);
        checkConstructorIsCreatorAnnotated checkconstructoriscreatorannotated4 = new checkConstructorIsCreatorAnnotated();
        RemoteActionCompatParcelizer = checkconstructoriscreatorannotated4;
        AudioAttributesCompatParcelizer(checkconstructoriscreatorannotated4);
        RemoteActionCompatParcelizer(checkconstructoriscreatorannotated4);
        checkConstructorIsCreatorAnnotated checkconstructoriscreatorannotated5 = new checkConstructorIsCreatorAnnotated();
        AudioAttributesCompatParcelizer = checkconstructoriscreatorannotated5;
        IconCompatParcelizer(checkconstructoriscreatorannotated5);
        RemoteActionCompatParcelizer(checkconstructoriscreatorannotated5);
        checkConstructorIsCreatorAnnotated checkconstructoriscreatorannotated6 = new checkConstructorIsCreatorAnnotated();
        read = checkconstructoriscreatorannotated6;
        read(checkconstructoriscreatorannotated6);
        RemoteActionCompatParcelizer(checkconstructoriscreatorannotated6);
    }

    checkConstructorIsCreatorAnnotated() {
        float[] fArr = new float[3];
        this.MediaBrowserCompatCustomActionResultReceiver = fArr;
        float[] fArr2 = new float[3];
        this.AudioAttributesImplApi21Parcelizer = fArr2;
        AudioAttributesCompatParcelizer(fArr);
        AudioAttributesCompatParcelizer(fArr2);
        MediaBrowserCompatSearchResultReceiver();
    }

    public final float write() {
        return this.MediaBrowserCompatCustomActionResultReceiver[0];
    }

    public final float AudioAttributesImplApi26Parcelizer() {
        return this.MediaBrowserCompatCustomActionResultReceiver[1];
    }

    public final float AudioAttributesCompatParcelizer() {
        return this.MediaBrowserCompatCustomActionResultReceiver[2];
    }

    public final float RemoteActionCompatParcelizer() {
        return this.AudioAttributesImplApi21Parcelizer[0];
    }

    public final float AudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplApi21Parcelizer[1];
    }

    public final float IconCompatParcelizer() {
        return this.AudioAttributesImplApi21Parcelizer[2];
    }

    public final float MediaBrowserCompatCustomActionResultReceiver() {
        return this.AudioAttributesImplApi26Parcelizer[0];
    }

    public final float read() {
        return this.AudioAttributesImplApi26Parcelizer[1];
    }

    public final float MediaBrowserCompatItemReceiver() {
        return this.AudioAttributesImplApi26Parcelizer[2];
    }

    public final boolean AudioAttributesImplApi21Parcelizer() {
        return this.MediaBrowserCompatItemReceiver;
    }

    private static void AudioAttributesCompatParcelizer(float[] fArr) {
        fArr[0] = 0.0f;
        fArr[1] = 0.5f;
        fArr[2] = 1.0f;
    }

    private void MediaBrowserCompatSearchResultReceiver() {
        float[] fArr = this.AudioAttributesImplApi26Parcelizer;
        fArr[0] = 0.24f;
        fArr[1] = 0.52f;
        fArr[2] = 0.24f;
    }

    final void RatingCompat() {
        int length = this.AudioAttributesImplApi26Parcelizer.length;
        float f = 0.0f;
        for (int i = 0; i < length; i++) {
            float f2 = this.AudioAttributesImplApi26Parcelizer[i];
            if (f2 > BitmapDescriptorFactory.HUE_RED) {
                f += f2;
            }
        }
        if (f != BitmapDescriptorFactory.HUE_RED) {
            int length2 = this.AudioAttributesImplApi26Parcelizer.length;
            for (int i2 = 0; i2 < length2; i2++) {
                float[] fArr = this.AudioAttributesImplApi26Parcelizer;
                float f3 = fArr[i2];
                if (f3 > BitmapDescriptorFactory.HUE_RED) {
                    fArr[i2] = f3 / f;
                }
            }
        }
    }

    private static void read(checkConstructorIsCreatorAnnotated checkconstructoriscreatorannotated) {
        float[] fArr = checkconstructoriscreatorannotated.AudioAttributesImplApi21Parcelizer;
        fArr[1] = 0.26f;
        fArr[2] = 0.45f;
    }

    private static void IconCompatParcelizer(checkConstructorIsCreatorAnnotated checkconstructoriscreatorannotated) {
        float[] fArr = checkconstructoriscreatorannotated.AudioAttributesImplApi21Parcelizer;
        fArr[0] = 0.3f;
        fArr[1] = 0.5f;
        fArr[2] = 0.7f;
    }

    private static void AudioAttributesCompatParcelizer(checkConstructorIsCreatorAnnotated checkconstructoriscreatorannotated) {
        float[] fArr = checkconstructoriscreatorannotated.AudioAttributesImplApi21Parcelizer;
        fArr[0] = 0.55f;
        fArr[1] = 0.74f;
    }

    private static void write(checkConstructorIsCreatorAnnotated checkconstructoriscreatorannotated) {
        float[] fArr = checkconstructoriscreatorannotated.MediaBrowserCompatCustomActionResultReceiver;
        fArr[0] = 0.35f;
        fArr[1] = 1.0f;
    }

    private static void RemoteActionCompatParcelizer(checkConstructorIsCreatorAnnotated checkconstructoriscreatorannotated) {
        float[] fArr = checkconstructoriscreatorannotated.MediaBrowserCompatCustomActionResultReceiver;
        fArr[1] = 0.3f;
        fArr[2] = 0.4f;
    }
}
