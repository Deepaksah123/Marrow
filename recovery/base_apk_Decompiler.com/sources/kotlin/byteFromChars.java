package kotlin;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes2.dex */
public final class byteFromChars {
    private float AudioAttributesCompatParcelizer;
    private final IconCompatParcelizer AudioAttributesImplApi21Parcelizer;
    private int AudioAttributesImplApi26Parcelizer;
    private final _badFormat AudioAttributesImplBaseParcelizer;
    private final Context IconCompatParcelizer;
    private VelocityTracker MediaBrowserCompatCustomActionResultReceiver;
    private final RemoteActionCompatParcelizer MediaBrowserCompatItemReceiver;
    private int RemoteActionCompatParcelizer;
    private final int[] read;
    private int write;

    interface IconCompatParcelizer {
        void IconCompatParcelizer(Context context, int[] iArr, MotionEvent motionEvent, int i);
    }

    interface RemoteActionCompatParcelizer {
        float AudioAttributesCompatParcelizer(VelocityTracker velocityTracker, MotionEvent motionEvent, int i);
    }

    public byteFromChars(Context context, _badFormat _badformat) {
        this(context, _badformat, new IconCompatParcelizer() { // from class: o._badChar
            @Override // o.byteFromChars.IconCompatParcelizer
            public final void IconCompatParcelizer(Context context2, int[] iArr, MotionEvent motionEvent, int i) {
                byteFromChars.AudioAttributesCompatParcelizer(context2, iArr, motionEvent, i);
            }
        }, new RemoteActionCompatParcelizer() { // from class: o.UUIDDeserializer
            @Override // o.byteFromChars.RemoteActionCompatParcelizer
            public final float AudioAttributesCompatParcelizer(VelocityTracker velocityTracker, MotionEvent motionEvent, int i) {
                return byteFromChars.AudioAttributesCompatParcelizer(velocityTracker, motionEvent, i);
            }
        });
    }

    private byteFromChars(Context context, _badFormat _badformat, IconCompatParcelizer iconCompatParcelizer, RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        this.write = -1;
        this.AudioAttributesImplApi26Parcelizer = -1;
        this.RemoteActionCompatParcelizer = -1;
        this.read = new int[]{Integer.MAX_VALUE, 0};
        this.IconCompatParcelizer = context;
        this.AudioAttributesImplBaseParcelizer = _badformat;
        this.AudioAttributesImplApi21Parcelizer = iconCompatParcelizer;
        this.MediaBrowserCompatItemReceiver = remoteActionCompatParcelizer;
    }

    public final void RemoteActionCompatParcelizer(MotionEvent motionEvent, int i) {
        boolean zWrite = write(motionEvent, i);
        if (this.read[0] == Integer.MAX_VALUE) {
            VelocityTracker velocityTracker = this.MediaBrowserCompatCustomActionResultReceiver;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.MediaBrowserCompatCustomActionResultReceiver = null;
                return;
            }
            return;
        }
        float fAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(motionEvent, i) * this.AudioAttributesImplBaseParcelizer.write();
        float fSignum = Math.signum(fAudioAttributesCompatParcelizer);
        float f = BitmapDescriptorFactory.HUE_RED;
        if (zWrite || (fSignum != Math.signum(this.AudioAttributesCompatParcelizer) && fSignum != BitmapDescriptorFactory.HUE_RED)) {
            this.AudioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer();
        }
        float fAbs = Math.abs(fAudioAttributesCompatParcelizer);
        int[] iArr = this.read;
        if (fAbs < iArr[0]) {
            return;
        }
        float fMax = Math.max(-r6, Math.min(fAudioAttributesCompatParcelizer, iArr[1]));
        if (this.AudioAttributesImplBaseParcelizer.read(fMax)) {
            f = fMax;
        }
        this.AudioAttributesCompatParcelizer = f;
    }

    private boolean write(MotionEvent motionEvent, int i) {
        int source = motionEvent.getSource();
        int deviceId = motionEvent.getDeviceId();
        if (this.AudioAttributesImplApi26Parcelizer == source && this.RemoteActionCompatParcelizer == deviceId && this.write == i) {
            return false;
        }
        this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer(this.IconCompatParcelizer, this.read, motionEvent, i);
        this.AudioAttributesImplApi26Parcelizer = source;
        this.RemoteActionCompatParcelizer = deviceId;
        this.write = i;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void AudioAttributesCompatParcelizer(Context context, int[] iArr, MotionEvent motionEvent, int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        iArr[0] = getDeserializerForJavaNioFilePath.IconCompatParcelizer(context, viewConfiguration, motionEvent.getDeviceId(), i, motionEvent.getSource());
        iArr[1] = getDeserializerForJavaNioFilePath.read(context, viewConfiguration, motionEvent.getDeviceId(), i, motionEvent.getSource());
    }

    private float AudioAttributesCompatParcelizer(MotionEvent motionEvent, int i) {
        if (this.MediaBrowserCompatCustomActionResultReceiver == null) {
            this.MediaBrowserCompatCustomActionResultReceiver = VelocityTracker.obtain();
        }
        return this.MediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver, motionEvent, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static float AudioAttributesCompatParcelizer(VelocityTracker velocityTracker, MotionEvent motionEvent, int i) {
        MismatchedInputException.read(velocityTracker, motionEvent);
        MismatchedInputException.AudioAttributesCompatParcelizer(velocityTracker, 1000);
        return MismatchedInputException.IconCompatParcelizer(velocityTracker, i);
    }
}
