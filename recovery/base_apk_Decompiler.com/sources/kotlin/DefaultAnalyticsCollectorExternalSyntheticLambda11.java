package kotlin;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public class DefaultAnalyticsCollectorExternalSyntheticLambda11 {
    public static read IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda15 defaultAnalyticsCollectorExternalSyntheticLambda15, View view, View view2) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda11.class)) {
            return null;
        }
        try {
            return new read(defaultAnalyticsCollectorExternalSyntheticLambda15, view, view2);
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda11.class);
            return null;
        }
    }

    public static class read implements View.OnTouchListener {
        private View.OnTouchListener AudioAttributesCompatParcelizer;
        private boolean IconCompatParcelizer;
        private WeakReference<View> RemoteActionCompatParcelizer;
        private DefaultAnalyticsCollectorExternalSyntheticLambda15 read;
        private WeakReference<View> write;

        public read(DefaultAnalyticsCollectorExternalSyntheticLambda15 defaultAnalyticsCollectorExternalSyntheticLambda15, View view, View view2) {
            this.IconCompatParcelizer = false;
            if (defaultAnalyticsCollectorExternalSyntheticLambda15 == null || view == null || view2 == null) {
                return;
            }
            this.AudioAttributesCompatParcelizer = DefaultAnalyticsCollectorExternalSyntheticLambda17.AudioAttributesImplApi21Parcelizer(view2);
            this.read = defaultAnalyticsCollectorExternalSyntheticLambda15;
            this.write = new WeakReference<>(view2);
            this.RemoteActionCompatParcelizer = new WeakReference<>(view);
            this.IconCompatParcelizer = true;
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 1) {
                read();
            }
            View.OnTouchListener onTouchListener = this.AudioAttributesCompatParcelizer;
            return onTouchListener != null && onTouchListener.onTouch(view, motionEvent);
        }

        private void read() {
            DefaultAnalyticsCollectorExternalSyntheticLambda15 defaultAnalyticsCollectorExternalSyntheticLambda15 = this.read;
            if (defaultAnalyticsCollectorExternalSyntheticLambda15 == null) {
                return;
            }
            final String strIconCompatParcelizer = defaultAnalyticsCollectorExternalSyntheticLambda15.IconCompatParcelizer();
            final Bundle bundle = DefaultAnalyticsCollectorExternalSyntheticLambda12.read(this.read, this.RemoteActionCompatParcelizer.get(), this.write.get());
            if (bundle.containsKey("_valueToSum")) {
                bundle.putDouble("_valueToSum", DefaultAnalyticsCollectorExternalSyntheticLambda29.write(bundle.getString("_valueToSum")));
            }
            bundle.putString("_is_fb_codeless", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
            lambdaonMediaMetadataChanged48.MediaBrowserCompatCustomActionResultReceiver().execute(new Runnable() { // from class: o.DefaultAnalyticsCollectorExternalSyntheticLambda11.read.2
                @Override // java.lang.Runnable
                public final void run() {
                    if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
                        return;
                    }
                    try {
                        lambdaonVideoDisabled18.AudioAttributesCompatParcelizer(lambdaonMediaMetadataChanged48.AudioAttributesCompatParcelizer()).IconCompatParcelizer(strIconCompatParcelizer, bundle);
                    } catch (Throwable th) {
                        getMinWindowSequenceNumber.read(th, this);
                    }
                }
            });
        }

        public final boolean IconCompatParcelizer() {
            return this.IconCompatParcelizer;
        }
    }
}
