package kotlin;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes4.dex */
public final class setCircleRadius {
    private final getCreatedOnDateMs<getShowPopup> AudioAttributesCompatParcelizer;
    private float AudioAttributesImplApi26Parcelizer;
    private final View AudioAttributesImplBaseParcelizer;
    private boolean IconCompatParcelizer;
    private float MediaBrowserCompatItemReceiver;
    private final getCreatedOnDateMs<getShowPopup> RemoteActionCompatParcelizer;
    private boolean read;
    private final getCreatedOnDateMs<getShowPopup> write;

    public setCircleRadius(View view, getCreatedOnDateMs<getShowPopup> getcreatedondatems, getCreatedOnDateMs<getShowPopup> getcreatedondatems2, getCreatedOnDateMs<getShowPopup> getcreatedondatems3) {
        toMagicModuleMetaRepoModel.write(view, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems2, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems3, "");
        this.AudioAttributesImplBaseParcelizer = view;
        this.RemoteActionCompatParcelizer = getcreatedondatems;
        this.AudioAttributesCompatParcelizer = getcreatedondatems2;
        this.write = getcreatedondatems3;
        this.IconCompatParcelizer = true;
    }

    public final void IconCompatParcelizer() {
        this.AudioAttributesImplBaseParcelizer.setOnTouchListener(new View.OnTouchListener() { // from class: o.setOnActionUpListener
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return setCircleRadius.write(this.IconCompatParcelizer, view, motionEvent);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean write(setCircleRadius setcircleradius, View view, MotionEvent motionEvent) {
        if (view.getVisibility() == 8) {
            return false;
        }
        int scaledTouchSlop = ViewConfiguration.get(setcircleradius.AudioAttributesImplBaseParcelizer.getContext()).getScaledTouchSlop();
        int action = motionEvent.getAction();
        if (action == 0) {
            setcircleradius.AudioAttributesImplApi26Parcelizer = motionEvent.getRawX();
            setcircleradius.read = false;
            setcircleradius.IconCompatParcelizer = true;
            return true;
        }
        if (action != 1) {
            if (action == 2) {
                float rawX = motionEvent.getRawX() - setcircleradius.AudioAttributesImplApi26Parcelizer;
                if (Math.abs(rawX) < scaledTouchSlop) {
                    return true;
                }
                setcircleradius.IconCompatParcelizer = false;
                if (rawX > BitmapDescriptorFactory.HUE_RED) {
                    return true;
                }
                setcircleradius.MediaBrowserCompatItemReceiver = rawX;
                view.setTranslationX(rawX);
                if (rawX < BitmapDescriptorFactory.HUE_RED && !setcircleradius.read && Math.abs(rawX) > view.getWidth() / 3) {
                    setcircleradius.read = true;
                    setcircleradius.RemoteActionCompatParcelizer.invoke();
                }
                return true;
            }
            if (action != 3) {
                return false;
            }
        }
        if (setcircleradius.read) {
            return true;
        }
        if (setcircleradius.IconCompatParcelizer) {
            setcircleradius.AudioAttributesCompatParcelizer.invoke();
        } else if (Math.abs(setcircleradius.MediaBrowserCompatItemReceiver) < view.getWidth() / 3) {
            setcircleradius.write.invoke();
        }
        return true;
    }
}
