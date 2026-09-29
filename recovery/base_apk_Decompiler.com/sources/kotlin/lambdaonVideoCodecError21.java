package kotlin;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.facebook.AccessToken;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.HashSet;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.DefaultAnalyticsCollectorExternalSyntheticLambda58;
import kotlin.DefaultAnalyticsCollectorExternalSyntheticLambda62;
import kotlin.lambdaonVideoDisabled18;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
public class lambdaonVideoCodecError21 {
    private static ScheduledThreadPoolExecutor AudioAttributesCompatParcelizer;
    private static boolean IconCompatParcelizer;
    private static String RemoteActionCompatParcelizer;
    private final String AudioAttributesImplApi21Parcelizer;
    private final lambdaonSkipSilenceEnabledChanged53 AudioAttributesImplApi26Parcelizer;
    private static lambdaonVideoDisabled18.RemoteActionCompatParcelizer write = lambdaonVideoDisabled18.RemoteActionCompatParcelizer.AUTO;
    private static final Object read = new Object();

    static void RemoteActionCompatParcelizer(Application application, String str) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(lambdaonVideoCodecError21.class)) {
            return;
        }
        try {
            if (!lambdaonMediaMetadataChanged48.onAddQueueItem()) {
                throw new lambdaonMetadata50("The Facebook sdk must be initialized before calling activateApp");
            }
            lambdaonTracksChanged31.write();
            lambdareleaseInternal67.read();
            if (str == null) {
                str = lambdaonMediaMetadataChanged48.write();
            }
            lambdaonMediaMetadataChanged48.write(application, str);
            DefaultAnalyticsCollectorExternalSyntheticLambda28.AudioAttributesCompatParcelizer(application, str);
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, lambdaonVideoCodecError21.class);
        }
    }

    static void RemoteActionCompatParcelizer(final Context context, String str) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(lambdaonVideoCodecError21.class)) {
            return;
        }
        try {
            if (lambdaonMediaMetadataChanged48.AudioAttributesImplApi26Parcelizer()) {
                final lambdaonVideoCodecError21 lambdaonvideocodecerror21 = new lambdaonVideoCodecError21(context, str, (AccessToken) null);
                AudioAttributesCompatParcelizer.execute(new Runnable() { // from class: o.lambdaonVideoCodecError21.4
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
                            return;
                        }
                        try {
                            Bundle bundle = new Bundle();
                            String[] strArr = {"com.facebook.core.Core", "com.facebook.login.Login", "com.facebook.share.Share", "com.facebook.places.Places", "com.facebook.messenger.Messenger", "com.facebook.applinks.AppLinks", "com.facebook.marketing.Marketing", "com.facebook.gamingservices.GamingServices", "com.facebook.all.All", "com.android.billingclient.api.BillingClient", "com.android.vending.billing.IInAppBillingService"};
                            String[] strArr2 = {"core_lib_included", "login_lib_included", "share_lib_included", "places_lib_included", "messenger_lib_included", "applinks_lib_included", "marketing_lib_included", "gamingservices_lib_included", "all_lib_included", "billing_client_lib_included", "billing_service_lib_included"};
                            int i = 0;
                            for (int i2 = 0; i2 < 11; i2++) {
                                String str2 = strArr[i2];
                                String str3 = strArr2[i2];
                                try {
                                    Class.forName(str2);
                                    bundle.putInt(str3, 1);
                                    i |= 1 << i2;
                                } catch (ClassNotFoundException unused) {
                                }
                            }
                            SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
                            if (sharedPreferences.getInt("kitsBitmask", 0) != i) {
                                sharedPreferences.edit().putInt("kitsBitmask", i).apply();
                                lambdaonvideocodecerror21.RemoteActionCompatParcelizer("fb_sdk_initialize", bundle);
                            }
                        } catch (Throwable th) {
                            getMinWindowSequenceNumber.read(th, this);
                        }
                    }
                });
            }
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, lambdaonVideoCodecError21.class);
        }
    }

    static lambdaonVideoDisabled18.RemoteActionCompatParcelizer read() {
        lambdaonVideoDisabled18.RemoteActionCompatParcelizer remoteActionCompatParcelizer;
        if (getMinWindowSequenceNumber.IconCompatParcelizer(lambdaonVideoCodecError21.class)) {
            return null;
        }
        try {
            synchronized (read) {
                remoteActionCompatParcelizer = write;
            }
            return remoteActionCompatParcelizer;
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, lambdaonVideoCodecError21.class);
            return null;
        }
    }

    final void write(String str, Bundle bundle) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
            return;
        }
        try {
            IconCompatParcelizer(str, null, bundle, false, DefaultAnalyticsCollectorExternalSyntheticLambda28.MediaDescriptionCompat());
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, this);
        }
    }

    final void IconCompatParcelizer(String str, double d, Bundle bundle) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
            return;
        }
        try {
            IconCompatParcelizer(str, Double.valueOf(d), bundle, false, DefaultAnalyticsCollectorExternalSyntheticLambda28.MediaDescriptionCompat());
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, this);
        }
    }

    final void RemoteActionCompatParcelizer(String str, String str2) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
            return;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putString("_is_suggested_event", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
            bundle.putString("_button_text", str2);
            write(str, bundle);
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, this);
        }
    }

    final void AudioAttributesCompatParcelizer(BigDecimal bigDecimal, Currency currency, Bundle bundle) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
            return;
        }
        try {
            write(bigDecimal, currency, bundle);
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, this);
        }
    }

    private void write(BigDecimal bigDecimal, Currency currency, Bundle bundle) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
            return;
        }
        try {
            if (bigDecimal == null) {
                IconCompatParcelizer("purchaseAmount cannot be null");
                return;
            }
            if (currency == null) {
                IconCompatParcelizer("currency cannot be null");
                return;
            }
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = bundle;
            bundle2.putString("fb_currency", currency.getCurrencyCode());
            double dDoubleValue = bigDecimal.doubleValue();
            IconCompatParcelizer("fb_mobile_purchase", Double.valueOf(dDoubleValue), bundle2, true, DefaultAnalyticsCollectorExternalSyntheticLambda28.MediaDescriptionCompat());
            AudioAttributesImplApi26Parcelizer();
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, this);
        }
    }

    final void AudioAttributesImplApi21Parcelizer() {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
            return;
        }
        try {
            lambdaonTrackSelectionParametersChanged57.AudioAttributesCompatParcelizer(lambdaonVideoEnabled13.EXPLICIT);
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, this);
        }
    }

    static void write() {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(lambdaonVideoCodecError21.class)) {
            return;
        }
        try {
            lambdaonTrackSelectionParametersChanged57.MediaBrowserCompatCustomActionResultReceiver();
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, lambdaonVideoCodecError21.class);
        }
    }

    static String IconCompatParcelizer() {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(lambdaonVideoCodecError21.class)) {
            return null;
        }
        try {
            synchronized (read) {
            }
            return null;
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, lambdaonVideoCodecError21.class);
            return null;
        }
    }

    static void write(String str) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(lambdaonVideoCodecError21.class)) {
            return;
        }
        try {
            SharedPreferences sharedPreferences = lambdaonMediaMetadataChanged48.AudioAttributesCompatParcelizer().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
            if (str != null) {
                sharedPreferences.edit().putString("install_referrer", str).apply();
            }
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, lambdaonVideoCodecError21.class);
        }
    }

    static String AudioAttributesCompatParcelizer() {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(lambdaonVideoCodecError21.class)) {
            return null;
        }
        try {
            DefaultAnalyticsCollectorExternalSyntheticLambda62.RemoteActionCompatParcelizer(new DefaultAnalyticsCollectorExternalSyntheticLambda62.write() { // from class: o.lambdaonVideoCodecError21.3
                @Override // o.DefaultAnalyticsCollectorExternalSyntheticLambda62.write
                public final void RemoteActionCompatParcelizer(String str) {
                    lambdaonVideoCodecError21.write(str);
                }
            });
            return lambdaonMediaMetadataChanged48.AudioAttributesCompatParcelizer().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getString("install_referrer", null);
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, lambdaonVideoCodecError21.class);
            return null;
        }
    }

    lambdaonVideoCodecError21(Context context, String str, AccessToken accessToken) {
        this(DefaultAnalyticsCollectorMediaPeriodQueueTracker.read(context), str, (AccessToken) null);
    }

    lambdaonVideoCodecError21(String str, String str2, AccessToken accessToken) {
        DefaultAnalyticsCollectorExternalSyntheticLambda8.write();
        this.AudioAttributesImplApi21Parcelizer = str;
        accessToken = accessToken == null ? AccessToken.AudioAttributesCompatParcelizer() : accessToken;
        if (accessToken != null && !accessToken.RatingCompat() && (str2 == null || str2.equals(accessToken.getAudioAttributesCompatParcelizer()))) {
            this.AudioAttributesImplApi26Parcelizer = new lambdaonSkipSilenceEnabledChanged53(accessToken);
        } else {
            this.AudioAttributesImplApi26Parcelizer = new lambdaonSkipSilenceEnabledChanged53(null, str2 == null ? DefaultAnalyticsCollectorMediaPeriodQueueTracker.write(lambdaonMediaMetadataChanged48.AudioAttributesCompatParcelizer()) : str2);
        }
        MediaBrowserCompatItemReceiver();
    }

    private static void MediaBrowserCompatItemReceiver() {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(lambdaonVideoCodecError21.class)) {
            return;
        }
        try {
            synchronized (read) {
                if (AudioAttributesCompatParcelizer != null) {
                    return;
                }
                AudioAttributesCompatParcelizer = new ScheduledThreadPoolExecutor(1);
                AudioAttributesCompatParcelizer.scheduleAtFixedRate(new Runnable() { // from class: o.lambdaonVideoCodecError21.5
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
                            return;
                        }
                        try {
                            HashSet hashSet = new HashSet();
                            Iterator<lambdaonSkipSilenceEnabledChanged53> it = lambdaonTrackSelectionParametersChanged57.AudioAttributesImplApi21Parcelizer().iterator();
                            while (it.hasNext()) {
                                hashSet.add(it.next().getWrite());
                            }
                            Iterator it2 = hashSet.iterator();
                            while (it2.hasNext()) {
                                DefaultAnalyticsCollectorExternalSyntheticLambda61.AudioAttributesCompatParcelizer((String) it2.next(), true);
                            }
                        } catch (Throwable th) {
                            getMinWindowSequenceNumber.read(th, this);
                        }
                    }
                }, 0L, 86400L, TimeUnit.SECONDS);
            }
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, lambdaonVideoCodecError21.class);
        }
    }

    final void RemoteActionCompatParcelizer(String str, Bundle bundle) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
            return;
        }
        try {
            IconCompatParcelizer(str, null, bundle, true, DefaultAnalyticsCollectorExternalSyntheticLambda28.MediaDescriptionCompat());
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, this);
        }
    }

    final void AudioAttributesCompatParcelizer(String str, BigDecimal bigDecimal, Currency currency, Bundle bundle) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
            return;
        }
        try {
            if (bigDecimal == null || currency == null) {
                DefaultAnalyticsCollectorMediaPeriodQueueTracker.AudioAttributesImplApi26Parcelizer();
                return;
            }
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = bundle;
            bundle2.putString("fb_currency", currency.getCurrencyCode());
            double dDoubleValue = bigDecimal.doubleValue();
            IconCompatParcelizer(str, Double.valueOf(dDoubleValue), bundle2, true, DefaultAnalyticsCollectorExternalSyntheticLambda28.MediaDescriptionCompat());
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, this);
        }
    }

    private void IconCompatParcelizer(String str, Double d, Bundle bundle, boolean z, UUID uuid) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(this) || str == null) {
            return;
        }
        try {
            if (str.isEmpty()) {
                return;
            }
            if (DefaultAnalyticsCollectorExternalSyntheticLambda63.AudioAttributesCompatParcelizer("app_events_killswitch", lambdaonMediaMetadataChanged48.write(), false)) {
                DefaultAnalyticsCollectorExternalSyntheticLambda68.IconCompatParcelizer(lambdaonPositionDiscontinuity43.APP_EVENTS, "AppEvents", "KillSwitch is enabled and fail to log app event: %s", str);
                return;
            }
            try {
                RemoteActionCompatParcelizer(new lambdaonUpstreamDiscarded27(this.AudioAttributesImplApi21Parcelizer, str, d, bundle, z, DefaultAnalyticsCollectorExternalSyntheticLambda28.MediaMetadataCompat(), uuid), this.AudioAttributesImplApi26Parcelizer);
            } catch (lambdaonMetadata50 e) {
                DefaultAnalyticsCollectorExternalSyntheticLambda68.IconCompatParcelizer(lambdaonPositionDiscontinuity43.APP_EVENTS, "AppEvents", "Invalid app event: %s", e.toString());
            } catch (JSONException e2) {
                DefaultAnalyticsCollectorExternalSyntheticLambda68.IconCompatParcelizer(lambdaonPositionDiscontinuity43.APP_EVENTS, "AppEvents", "JSON encoding for app event failed: '%s'", e2.toString());
            }
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, this);
        }
    }

    private static void RemoteActionCompatParcelizer(lambdaonUpstreamDiscarded27 lambdaonupstreamdiscarded27, lambdaonSkipSilenceEnabledChanged53 lambdaonskipsilenceenabledchanged53) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(lambdaonVideoCodecError21.class)) {
            return;
        }
        try {
            lambdaonTrackSelectionParametersChanged57.AudioAttributesCompatParcelizer(lambdaonskipsilenceenabledchanged53, lambdaonupstreamdiscarded27);
            if (DefaultAnalyticsCollectorExternalSyntheticLambda58.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda58.RemoteActionCompatParcelizer.OnDevicePostInstallEventProcessing) && DefaultAnalyticsCollectorExternalSyntheticLambda43.IconCompatParcelizer()) {
                DefaultAnalyticsCollectorExternalSyntheticLambda43.read(lambdaonskipsilenceenabledchanged53.getWrite(), lambdaonupstreamdiscarded27);
            }
            if (lambdaonupstreamdiscarded27.read() || IconCompatParcelizer) {
                return;
            }
            if (lambdaonupstreamdiscarded27.getAudioAttributesImplApi26Parcelizer().equals("fb_mobile_activate_app")) {
                IconCompatParcelizer = true;
            } else {
                DefaultAnalyticsCollectorExternalSyntheticLambda68.IconCompatParcelizer(lambdaonPositionDiscontinuity43.APP_EVENTS, "AppEvents", "Warning: Please call AppEventsLogger.activateApp(...)from the long-lived activity's onResume() methodbefore logging other app events.");
            }
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, lambdaonVideoCodecError21.class);
        }
    }

    private static void AudioAttributesImplApi26Parcelizer() {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(lambdaonVideoCodecError21.class)) {
            return;
        }
        try {
            if (read() != lambdaonVideoDisabled18.RemoteActionCompatParcelizer.EXPLICIT_ONLY) {
                lambdaonTrackSelectionParametersChanged57.AudioAttributesCompatParcelizer(lambdaonVideoEnabled13.EAGER_FLUSHING_EVENT);
            }
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, lambdaonVideoCodecError21.class);
        }
    }

    private static void IconCompatParcelizer(String str) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(lambdaonVideoCodecError21.class)) {
            return;
        }
        try {
            DefaultAnalyticsCollectorExternalSyntheticLambda68.IconCompatParcelizer(lambdaonPositionDiscontinuity43.DEVELOPER_ERRORS, "AppEvents", str);
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, lambdaonVideoCodecError21.class);
        }
    }

    static Executor RemoteActionCompatParcelizer() {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(lambdaonVideoCodecError21.class)) {
            return null;
        }
        try {
            if (AudioAttributesCompatParcelizer == null) {
                MediaBrowserCompatItemReceiver();
            }
            return AudioAttributesCompatParcelizer;
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, lambdaonVideoCodecError21.class);
            return null;
        }
    }

    static String RemoteActionCompatParcelizer(Context context) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(lambdaonVideoCodecError21.class)) {
            return null;
        }
        try {
            if (RemoteActionCompatParcelizer == null) {
                synchronized (read) {
                    if (RemoteActionCompatParcelizer == null) {
                        String string = context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getString("anonymousAppDeviceGUID", null);
                        RemoteActionCompatParcelizer = string;
                        if (string == null) {
                            StringBuilder sb = new StringBuilder("XZ");
                            sb.append(UUID.randomUUID().toString());
                            RemoteActionCompatParcelizer = sb.toString();
                            context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putString("anonymousAppDeviceGUID", RemoteActionCompatParcelizer).apply();
                        }
                    }
                }
            }
            return RemoteActionCompatParcelizer;
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, lambdaonVideoCodecError21.class);
            return null;
        }
    }
}
