package kotlin;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public class onBandwidthSample {
    static /* synthetic */ void AudioAttributesCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda15 defaultAnalyticsCollectorExternalSyntheticLambda15, View view, View view2) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(onBandwidthSample.class)) {
            return;
        }
        try {
            RemoteActionCompatParcelizer(defaultAnalyticsCollectorExternalSyntheticLambda15, view, view2);
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, onBandwidthSample.class);
        }
    }

    public static AudioAttributesCompatParcelizer IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda15 defaultAnalyticsCollectorExternalSyntheticLambda15, View view, View view2) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(onBandwidthSample.class)) {
            return null;
        }
        try {
            return new AudioAttributesCompatParcelizer(defaultAnalyticsCollectorExternalSyntheticLambda15, view, view2, (byte) 0);
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, onBandwidthSample.class);
            return null;
        }
    }

    public static IconCompatParcelizer RemoteActionCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda15 defaultAnalyticsCollectorExternalSyntheticLambda15, View view, AdapterView adapterView) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(onBandwidthSample.class)) {
            return null;
        }
        try {
            return new IconCompatParcelizer(defaultAnalyticsCollectorExternalSyntheticLambda15, view, adapterView, (byte) 0);
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, onBandwidthSample.class);
            return null;
        }
    }

    private static void RemoteActionCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda15 defaultAnalyticsCollectorExternalSyntheticLambda15, View view, View view2) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(onBandwidthSample.class)) {
            return;
        }
        try {
            final String strIconCompatParcelizer = defaultAnalyticsCollectorExternalSyntheticLambda15.IconCompatParcelizer();
            final Bundle bundle = DefaultAnalyticsCollectorExternalSyntheticLambda12.read(defaultAnalyticsCollectorExternalSyntheticLambda15, view, view2);
            read(bundle);
            lambdaonMediaMetadataChanged48.MediaBrowserCompatCustomActionResultReceiver().execute(new Runnable() { // from class: o.onBandwidthSample.4
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
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, onBandwidthSample.class);
        }
    }

    private static void read(Bundle bundle) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(onBandwidthSample.class)) {
            return;
        }
        try {
            String string = bundle.getString("_valueToSum");
            if (string != null) {
                bundle.putDouble("_valueToSum", DefaultAnalyticsCollectorExternalSyntheticLambda29.write(string));
            }
            bundle.putString("_is_fb_codeless", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, onBandwidthSample.class);
        }
    }

    public static class AudioAttributesCompatParcelizer implements View.OnClickListener {
        private WeakReference<View> AudioAttributesCompatParcelizer;
        private WeakReference<View> IconCompatParcelizer;
        private DefaultAnalyticsCollectorExternalSyntheticLambda15 RemoteActionCompatParcelizer;
        private View.OnClickListener read;
        private boolean write;

        /* synthetic */ AudioAttributesCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda15 defaultAnalyticsCollectorExternalSyntheticLambda15, View view, View view2, byte b) {
            this(defaultAnalyticsCollectorExternalSyntheticLambda15, view, view2);
        }

        private AudioAttributesCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda15 defaultAnalyticsCollectorExternalSyntheticLambda15, View view, View view2) {
            this.write = false;
            if (defaultAnalyticsCollectorExternalSyntheticLambda15 == null || view == null || view2 == null) {
                return;
            }
            this.read = DefaultAnalyticsCollectorExternalSyntheticLambda17.read(view2);
            this.RemoteActionCompatParcelizer = defaultAnalyticsCollectorExternalSyntheticLambda15;
            this.AudioAttributesCompatParcelizer = new WeakReference<>(view2);
            this.IconCompatParcelizer = new WeakReference<>(view);
            this.write = true;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
                return;
            }
            try {
                View.OnClickListener onClickListener = this.read;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
                if (this.IconCompatParcelizer.get() == null || this.AudioAttributesCompatParcelizer.get() == null) {
                    return;
                }
                onBandwidthSample.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer, this.IconCompatParcelizer.get(), this.AudioAttributesCompatParcelizer.get());
            } catch (Throwable th) {
                getMinWindowSequenceNumber.read(th, this);
            }
        }

        public final boolean IconCompatParcelizer() {
            return this.write;
        }
    }

    public static class IconCompatParcelizer implements AdapterView.OnItemClickListener {
        private WeakReference<View> AudioAttributesCompatParcelizer;
        private WeakReference<AdapterView> IconCompatParcelizer;
        private DefaultAnalyticsCollectorExternalSyntheticLambda15 RemoteActionCompatParcelizer;
        private boolean read;
        private AdapterView.OnItemClickListener write;

        /* synthetic */ IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda15 defaultAnalyticsCollectorExternalSyntheticLambda15, View view, AdapterView adapterView, byte b) {
            this(defaultAnalyticsCollectorExternalSyntheticLambda15, view, adapterView);
        }

        private IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda15 defaultAnalyticsCollectorExternalSyntheticLambda15, View view, AdapterView adapterView) {
            this.read = false;
            if (defaultAnalyticsCollectorExternalSyntheticLambda15 == null || view == null || adapterView == null) {
                return;
            }
            this.write = adapterView.getOnItemClickListener();
            this.RemoteActionCompatParcelizer = defaultAnalyticsCollectorExternalSyntheticLambda15;
            this.IconCompatParcelizer = new WeakReference<>(adapterView);
            this.AudioAttributesCompatParcelizer = new WeakReference<>(view);
            this.read = true;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            AdapterView.OnItemClickListener onItemClickListener = this.write;
            if (onItemClickListener != null) {
                onItemClickListener.onItemClick(adapterView, view, i, j);
            }
            if (this.AudioAttributesCompatParcelizer.get() == null || this.IconCompatParcelizer.get() == null) {
                return;
            }
            onBandwidthSample.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer, this.AudioAttributesCompatParcelizer.get(), this.IconCompatParcelizer.get());
        }

        public final boolean AudioAttributesCompatParcelizer() {
            return this.read;
        }
    }
}
