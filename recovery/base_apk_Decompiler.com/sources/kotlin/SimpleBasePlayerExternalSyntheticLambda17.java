package kotlin;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import android.widget.Button;
import com.clevertap.android.sdk.inapp.CTInAppNotificationButton;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.SimpleBasePlayerExternalSyntheticLambda14;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lo/SimpleBasePlayerExternalSyntheticLambda17;", "Lo/SimpleBasePlayerExternalSyntheticLambda2;", "<init>", "()V", "Landroid/widget/Button;", "p0", "Lcom/clevertap/android/sdk/inapp/CTInAppNotificationButton;", "p1", "", "p2", "", "AudioAttributesCompatParcelizer", "(Landroid/widget/Button;Lcom/clevertap/android/sdk/inapp/CTInAppNotificationButton;I)V", "MediaBrowserCompatCustomActionResultReceiver", "()I"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class SimpleBasePlayerExternalSyntheticLambda17 extends SimpleBasePlayerExternalSyntheticLambda2 {
    public final void AudioAttributesCompatParcelizer(Button p0, CTInAppNotificationButton p1, int p2) {
        ShapeDrawable shapeDrawable;
        toMagicModuleMetaRepoModel.write(p0, "");
        if (p1 != null) {
            p0.setVisibility(0);
            p0.setTag(Integer.valueOf(p2));
            p0.setText(p1.getIconCompatParcelizer());
            p0.setTextColor(Color.parseColor(p1.getAudioAttributesCompatParcelizer()));
            p0.setOnClickListener(new SimpleBasePlayerExternalSyntheticLambda14.AudioAttributesCompatParcelizer());
            ShapeDrawable shapeDrawable2 = null;
            if (p1.getWrite().length() > 0) {
                Float fAudioAttributesImplApi21Parcelizer = TestGroupLSModel.AudioAttributesImplApi21Parcelizer(p1.getWrite());
                float fFloatValue = (fAudioAttributesImplApi21Parcelizer != null ? fAudioAttributesImplApi21Parcelizer.floatValue() : BitmapDescriptorFactory.HUE_RED) * (480.0f / MediaBrowserCompatCustomActionResultReceiver()) * 2.0f;
                shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{fFloatValue, fFloatValue, fFloatValue, fFloatValue, fFloatValue, fFloatValue, fFloatValue, fFloatValue}, null, new float[]{BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED}));
                shapeDrawable.getPaint().setColor(Color.parseColor(p1.getRead()));
                shapeDrawable.getPaint().setStyle(Paint.Style.FILL);
                shapeDrawable.getPaint().setAntiAlias(true);
                shapeDrawable2 = new ShapeDrawable(new RoundRectShape(new float[]{fFloatValue, fFloatValue, fFloatValue, fFloatValue, fFloatValue, fFloatValue, fFloatValue, fFloatValue}, null, new float[]{fFloatValue, fFloatValue, fFloatValue, fFloatValue, fFloatValue, fFloatValue, fFloatValue, fFloatValue}));
            } else {
                shapeDrawable = null;
            }
            if (p1.getRemoteActionCompatParcelizer().length() != 0 && shapeDrawable2 != null) {
                shapeDrawable2.getPaint().setColor(Color.parseColor(p1.getRemoteActionCompatParcelizer()));
                shapeDrawable2.setPadding(1, 1, 1, 1);
                shapeDrawable2.getPaint().setStyle(Paint.Style.FILL);
            }
            if (shapeDrawable != null) {
                p0.setBackground(new LayerDrawable(new Drawable[]{shapeDrawable2, shapeDrawable}));
                return;
            }
            return;
        }
        p0.setVisibility(8);
    }

    private final int MediaBrowserCompatCustomActionResultReceiver() {
        int i;
        WindowManager windowManager = (WindowManager) requireContext().getSystemService("window");
        if (windowManager == null) {
            return 160;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            i = requireContext().getResources().getConfiguration().densityDpi;
        } else {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            i = displayMetrics.densityDpi;
        }
        if (i > 0) {
            return i;
        }
        return 160;
    }
}
