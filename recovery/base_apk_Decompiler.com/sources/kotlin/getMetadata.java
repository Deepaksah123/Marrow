package kotlin;

import android.view.InputDevice;
import android.view.MotionEvent;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b\"\u0015\u0010\n\u001a\u00020\u0005*\u00020\t8G¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b"}, d2 = {"", "p0", "Lo/_format;", "read", "(I)I", "Landroid/view/MotionEvent;", "Lo/getWrapperName;", "RemoteActionCompatParcelizer", "(Landroid/view/MotionEvent;)I", "Lo/DatabindContext;", "AudioAttributesCompatParcelizer", "(Lo/DatabindContext;)Landroid/view/MotionEvent;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class getMetadata {
    public static final MotionEvent AudioAttributesCompatParcelizer(DatabindContext databindContext) {
        toMagicModuleMetaRepoModel.read(databindContext, "");
        return ((BeanPropertyBogus) databindContext).getAudioAttributesCompatParcelizer();
    }

    public static final int read(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    return _format.INSTANCE.IconCompatParcelizer();
                }
                if (i != 5) {
                    if (i != 6) {
                        return _format.INSTANCE.AudioAttributesCompatParcelizer();
                    }
                }
            }
            return _format.INSTANCE.read();
        }
        return _format.INSTANCE.RemoteActionCompatParcelizer();
    }

    public static final int RemoteActionCompatParcelizer(MotionEvent motionEvent) {
        if (!motionEvent.isFromSource(2097152)) {
            throw new IllegalArgumentException("MotionEvent must be a touch navigation source".toString());
        }
        InputDevice device = motionEvent.getDevice();
        if (device != null) {
            InputDevice.MotionRange motionRange = device.getMotionRange(0);
            InputDevice.MotionRange motionRange2 = device.getMotionRange(1);
            if (motionRange != null && motionRange2 == null) {
                return getWrapperName.INSTANCE.AudioAttributesCompatParcelizer();
            }
            if (motionRange2 != null && motionRange == null) {
                return getWrapperName.INSTANCE.RemoteActionCompatParcelizer();
            }
            if (motionRange != null && motionRange2 != null) {
                float range = motionRange.getRange();
                float range2 = motionRange2.getRange();
                if (range > range2 && (range2 == BitmapDescriptorFactory.HUE_RED || range / range2 >= 5.0f)) {
                    return getWrapperName.INSTANCE.AudioAttributesCompatParcelizer();
                }
                if (range2 > range && (range == BitmapDescriptorFactory.HUE_RED || range2 / range >= 5.0f)) {
                    return getWrapperName.INSTANCE.RemoteActionCompatParcelizer();
                }
            }
        }
        return getWrapperName.INSTANCE.write();
    }
}
