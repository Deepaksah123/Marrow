package kotlin;

import com.github.mikephil.charting.data.Entry;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.DefaultDrmSessionExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes4.dex */
public abstract class createManager extends lambdaonReferenceCountDecremented0 {
    protected read MediaBrowserCompatCustomActionResultReceiver;

    public createManager(onKeyResponse onkeyresponse, lambdadrmSessionAcquired0comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher lambdadrmsessionacquired0comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher) {
        super(onkeyresponse, lambdadrmsessionacquired0comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher);
        this.MediaBrowserCompatCustomActionResultReceiver = new read();
    }

    protected static boolean IconCompatParcelizer(setPlayClearSamplesWithoutKeys setplayclearsampleswithoutkeys) {
        if (setplayclearsampleswithoutkeys.handleMediaPlayPauseIfPendingOnHandler()) {
            return setplayclearsampleswithoutkeys.onAddQueueItem() || setplayclearsampleswithoutkeys.onCommand();
        }
        return false;
    }

    protected final boolean RemoteActionCompatParcelizer(Entry entry, setKeyRequestParameters setkeyrequestparameters) {
        if (entry == null) {
            return false;
        }
        return entry != null && ((float) setkeyrequestparameters.AudioAttributesCompatParcelizer(entry)) < ((float) setkeyrequestparameters.onMediaButtonEvent()) * this.MediaBrowserCompatItemReceiver.IconCompatParcelizer();
    }

    protected class read {
        public int AudioAttributesCompatParcelizer;
        public int IconCompatParcelizer;
        public int RemoteActionCompatParcelizer;

        protected read() {
        }

        public final void IconCompatParcelizer(maybeAcquirePlaceholderSession maybeacquireplaceholdersession, setKeyRequestParameters setkeyrequestparameters) {
            float fMax = Math.max(BitmapDescriptorFactory.HUE_RED, Math.min(1.0f, createManager.this.MediaBrowserCompatItemReceiver.IconCompatParcelizer()));
            float fMediaBrowserCompatCustomActionResultReceiver = maybeacquireplaceholdersession.MediaBrowserCompatCustomActionResultReceiver();
            float fAudioAttributesImplApi26Parcelizer = maybeacquireplaceholdersession.AudioAttributesImplApi26Parcelizer();
            T t = setkeyrequestparameters.read(fMediaBrowserCompatCustomActionResultReceiver, Float.NaN, DefaultDrmSessionExternalSyntheticLambda0.IconCompatParcelizer.DOWN);
            T t2 = setkeyrequestparameters.read(fAudioAttributesImplApi26Parcelizer, Float.NaN, DefaultDrmSessionExternalSyntheticLambda0.IconCompatParcelizer.UP);
            this.AudioAttributesCompatParcelizer = t == 0 ? 0 : setkeyrequestparameters.AudioAttributesCompatParcelizer(t);
            this.RemoteActionCompatParcelizer = t2 != 0 ? setkeyrequestparameters.AudioAttributesCompatParcelizer(t2) : 0;
            this.IconCompatParcelizer = (int) ((r2 - this.AudioAttributesCompatParcelizer) * fMax);
        }
    }
}
