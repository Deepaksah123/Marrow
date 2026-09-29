package kotlin;

import android.app.Activity;

/* JADX INFO: loaded from: classes2.dex */
public final class sendEvent {
    private static final String AudioAttributesCompatParcelizer = "com.facebook.appevents.aam.MetadataIndexer";
    private static Boolean RemoteActionCompatParcelizer = Boolean.FALSE;

    static /* synthetic */ Boolean AudioAttributesCompatParcelizer(Boolean bool) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(sendEvent.class)) {
            return null;
        }
        try {
            RemoteActionCompatParcelizer = bool;
            return bool;
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, sendEvent.class);
            return null;
        }
    }

    static /* synthetic */ void write() {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(sendEvent.class)) {
            return;
        }
        try {
            read();
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, sendEvent.class);
        }
    }

    public static void write(Activity activity) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(sendEvent.class)) {
            return;
        }
        try {
            if (!RemoteActionCompatParcelizer.booleanValue() || lambdasetPlayer1comgoogleandroidexoplayer2analyticsDefaultAnalyticsCollector.write().isEmpty()) {
                return;
            }
            generateCurrentPlayerMediaPeriodEventTime.read(activity);
        } catch (Exception unused) {
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, sendEvent.class);
        }
    }

    private static void read() {
        String audioAttributesImplApi26Parcelizer;
        if (getMinWindowSequenceNumber.IconCompatParcelizer(sendEvent.class)) {
            return;
        }
        try {
            DefaultAnalyticsCollectorExternalSyntheticLambda6 defaultAnalyticsCollectorExternalSyntheticLambda6AudioAttributesCompatParcelizer = DefaultAnalyticsCollectorExternalSyntheticLambda61.AudioAttributesCompatParcelizer(lambdaonMediaMetadataChanged48.write(), false);
            if (defaultAnalyticsCollectorExternalSyntheticLambda6AudioAttributesCompatParcelizer != null && (audioAttributesImplApi26Parcelizer = defaultAnalyticsCollectorExternalSyntheticLambda6AudioAttributesCompatParcelizer.getAudioAttributesImplApi26Parcelizer()) != null) {
                lambdasetPlayer1comgoogleandroidexoplayer2analyticsDefaultAnalyticsCollector.read(audioAttributesImplApi26Parcelizer);
            }
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, sendEvent.class);
        }
    }

    public static void AudioAttributesCompatParcelizer() {
        try {
            if (getMinWindowSequenceNumber.IconCompatParcelizer(sendEvent.class)) {
                return;
            }
            try {
                lambdaonMediaMetadataChanged48.MediaBrowserCompatCustomActionResultReceiver().execute(new Runnable() { // from class: o.sendEvent.4
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
                            return;
                        }
                        try {
                            if (DefaultAnalyticsCollectorExternalSyntheticLambda51.IconCompatParcelizer(lambdaonMediaMetadataChanged48.AudioAttributesCompatParcelizer())) {
                                return;
                            }
                            sendEvent.write();
                            sendEvent.AudioAttributesCompatParcelizer(Boolean.TRUE);
                        } catch (Throwable th) {
                            getMinWindowSequenceNumber.read(th, this);
                        }
                    }
                });
            } catch (Exception e) {
                DefaultAnalyticsCollectorMediaPeriodQueueTracker.IconCompatParcelizer(AudioAttributesCompatParcelizer, e);
            }
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, sendEvent.class);
        }
    }
}
