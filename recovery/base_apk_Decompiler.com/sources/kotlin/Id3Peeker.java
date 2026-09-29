package kotlin;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.progressindicator.LinearProgressIndicatorSpec;
import java.util.Arrays;
import kotlin.getActivityBanner;

/* JADX INFO: loaded from: classes5.dex */
public final class Id3Peeker extends setFromXingHeaderValue<ObjectAnimator> {
    private static final Property<Id3Peeker, Float> write = new Property<Id3Peeker, Float>(Float.class, "animationFraction") { // from class: o.Id3Peeker.1
        @Override // android.util.Property
        public final /* synthetic */ Float get(Id3Peeker id3Peeker) {
            return write(id3Peeker);
        }

        @Override // android.util.Property
        public final /* synthetic */ void set(Id3Peeker id3Peeker, Float f) {
            read(id3Peeker, f);
        }

        private static Float write(Id3Peeker id3Peeker) {
            return Float.valueOf(id3Peeker.AudioAttributesImplApi26Parcelizer());
        }

        private static void read(Id3Peeker id3Peeker, Float f) {
            id3Peeker.RemoteActionCompatParcelizer(f.floatValue());
        }
    };
    private float AudioAttributesCompatParcelizer;
    private final getMetadataCopyWithAppendedEntriesFrom AudioAttributesImplApi21Parcelizer;
    private boolean AudioAttributesImplApi26Parcelizer;
    private int AudioAttributesImplBaseParcelizer;
    private ObjectAnimator MediaBrowserCompatCustomActionResultReceiver;
    private _selectSetterFromMultiple MediaBrowserCompatItemReceiver;

    @Override // kotlin.setFromXingHeaderValue
    public final void IconCompatParcelizer() {
    }

    @Override // kotlin.setFromXingHeaderValue
    public final void IconCompatParcelizer(getActivityBanner.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
    }

    @Override // kotlin.setFromXingHeaderValue
    public final void write() {
    }

    static /* synthetic */ boolean AudioAttributesCompatParcelizer(Id3Peeker id3Peeker) {
        id3Peeker.AudioAttributesImplApi26Parcelizer = true;
        return true;
    }

    public Id3Peeker(LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        super(3);
        this.AudioAttributesImplBaseParcelizer = 1;
        this.AudioAttributesImplApi21Parcelizer = linearProgressIndicatorSpec;
        this.MediaBrowserCompatItemReceiver = new _selectSetterFromMultiple();
    }

    @Override // kotlin.setFromXingHeaderValue
    public final void AudioAttributesCompatParcelizer() {
        AudioAttributesImplApi21Parcelizer();
        AudioAttributesImplBaseParcelizer();
        this.MediaBrowserCompatCustomActionResultReceiver.start();
    }

    private void AudioAttributesImplApi21Parcelizer() {
        if (this.MediaBrowserCompatCustomActionResultReceiver == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, write, BitmapDescriptorFactory.HUE_RED, 1.0f);
            this.MediaBrowserCompatCustomActionResultReceiver = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(333L);
            this.MediaBrowserCompatCustomActionResultReceiver.setInterpolator(null);
            this.MediaBrowserCompatCustomActionResultReceiver.setRepeatCount(-1);
            this.MediaBrowserCompatCustomActionResultReceiver.addListener(new AnimatorListenerAdapter() { // from class: o.Id3Peeker.4
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationRepeat(Animator animator) {
                    super.onAnimationRepeat(animator);
                    Id3Peeker id3Peeker = Id3Peeker.this;
                    id3Peeker.AudioAttributesImplBaseParcelizer = (id3Peeker.AudioAttributesImplBaseParcelizer + 1) % Id3Peeker.this.AudioAttributesImplApi21Parcelizer.write.length;
                    Id3Peeker.AudioAttributesCompatParcelizer(Id3Peeker.this);
                }
            });
        }
    }

    @Override // kotlin.setFromXingHeaderValue
    public final void RemoteActionCompatParcelizer() {
        ObjectAnimator objectAnimator = this.MediaBrowserCompatCustomActionResultReceiver;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // kotlin.setFromXingHeaderValue
    public final void read() {
        AudioAttributesImplBaseParcelizer();
    }

    private void read(int i) {
        this.read[0] = 0.0f;
        float fRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(i, 0, 667);
        float[] fArr = this.read;
        float[] fArr2 = this.read;
        float interpolation = this.MediaBrowserCompatItemReceiver.getInterpolation(fRemoteActionCompatParcelizer);
        fArr2[2] = interpolation;
        fArr[1] = interpolation;
        float[] fArr3 = this.read;
        float[] fArr4 = this.read;
        float interpolation2 = this.MediaBrowserCompatItemReceiver.getInterpolation(fRemoteActionCompatParcelizer + 0.49925038f);
        fArr4[4] = interpolation2;
        fArr3[3] = interpolation2;
        this.read[5] = 1.0f;
    }

    private void MediaBrowserCompatCustomActionResultReceiver() {
        if (!this.AudioAttributesImplApi26Parcelizer || this.read[3] >= 1.0f) {
            return;
        }
        this.RemoteActionCompatParcelizer[2] = this.RemoteActionCompatParcelizer[1];
        this.RemoteActionCompatParcelizer[1] = this.RemoteActionCompatParcelizer[0];
        this.RemoteActionCompatParcelizer[0] = createExtractors.IconCompatParcelizer(this.AudioAttributesImplApi21Parcelizer.write[this.AudioAttributesImplBaseParcelizer], this.IconCompatParcelizer.getAlpha());
        this.AudioAttributesImplApi26Parcelizer = false;
    }

    private void AudioAttributesImplBaseParcelizer() {
        this.AudioAttributesImplApi26Parcelizer = true;
        this.AudioAttributesImplBaseParcelizer = 1;
        Arrays.fill(this.RemoteActionCompatParcelizer, createExtractors.IconCompatParcelizer(this.AudioAttributesImplApi21Parcelizer.write[0], this.IconCompatParcelizer.getAlpha()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float AudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    final void RemoteActionCompatParcelizer(float f) {
        this.AudioAttributesCompatParcelizer = f;
        read((int) (f * 333.0f));
        MediaBrowserCompatCustomActionResultReceiver();
        this.IconCompatParcelizer.invalidateSelf();
    }
}
