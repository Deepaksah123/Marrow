package kotlin;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzef;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.zzgz;
import com.google.android.gms.measurement.internal.zziq;
import com.google.firebase.FirebaseApp;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import kotlin.TrackSampleTable;

/* JADX INFO: loaded from: classes5.dex */
public class getSamplePresentationTimeUs implements TrackSampleTable {
    private static volatile TrackSampleTable read;
    private AppMeasurementSdk IconCompatParcelizer;
    private Map RemoteActionCompatParcelizer;

    private getSamplePresentationTimeUs(AppMeasurementSdk appMeasurementSdk) {
        Preconditions.checkNotNull(appMeasurementSdk);
        this.IconCompatParcelizer = appMeasurementSdk;
        this.RemoteActionCompatParcelizer = new ConcurrentHashMap();
    }

    static /* synthetic */ void IconCompatParcelizer(getMessageParams getmessageparams) {
        boolean z = ((isCompatibleBrand) getmessageparams.read()).AudioAttributesCompatParcelizer;
        synchronized (getSamplePresentationTimeUs.class) {
            ((getSamplePresentationTimeUs) Preconditions.checkNotNull(read)).IconCompatParcelizer.zza(false);
        }
    }

    private final boolean RemoteActionCompatParcelizer(String str) {
        return (str.isEmpty() || !this.RemoteActionCompatParcelizer.containsKey(str) || this.RemoteActionCompatParcelizer.get(str) == null) ? false : true;
    }

    @Override // kotlin.TrackSampleTable
    public final int AudioAttributesCompatParcelizer(String str) {
        return this.IconCompatParcelizer.getMaxUserProperties(str);
    }

    @Override // kotlin.TrackSampleTable
    public final List<TrackSampleTable.RemoteActionCompatParcelizer> IconCompatParcelizer(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : this.IconCompatParcelizer.getConditionalUserProperties(str, str2)) {
            int i = sampleHasSubsampleEncryptionTable.write;
            Preconditions.checkNotNull(bundle);
            TrackSampleTable.RemoteActionCompatParcelizer remoteActionCompatParcelizer = new TrackSampleTable.RemoteActionCompatParcelizer();
            remoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer = (String) Preconditions.checkNotNull((String) zzgz.zza(bundle, "origin", String.class, null));
            remoteActionCompatParcelizer.RemoteActionCompatParcelizer = (String) Preconditions.checkNotNull((String) zzgz.zza(bundle, "name", String.class, null));
            remoteActionCompatParcelizer.MediaBrowserCompatMediaItem = zzgz.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.VALUE, Object.class, null);
            remoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver = (String) zzgz.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, String.class, null);
            remoteActionCompatParcelizer.MediaMetadataCompat = ((Long) zzgz.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, Long.class, 0L)).longValue();
            remoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer = (String) zzgz.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, String.class, null);
            remoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer = (Bundle) zzgz.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, Bundle.class, null);
            remoteActionCompatParcelizer.MediaDescriptionCompat = (String) zzgz.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, String.class, null);
            remoteActionCompatParcelizer.MediaBrowserCompatSearchResultReceiver = (Bundle) zzgz.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, Bundle.class, null);
            remoteActionCompatParcelizer.MediaBrowserCompatItemReceiver = ((Long) zzgz.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, Long.class, 0L)).longValue();
            remoteActionCompatParcelizer.read = (String) zzgz.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, String.class, null);
            remoteActionCompatParcelizer.IconCompatParcelizer = (Bundle) zzgz.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, Bundle.class, null);
            remoteActionCompatParcelizer.AudioAttributesCompatParcelizer = ((Boolean) zzgz.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.ACTIVE, Boolean.class, Boolean.FALSE)).booleanValue();
            remoteActionCompatParcelizer.write = ((Long) zzgz.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, Long.class, 0L)).longValue();
            remoteActionCompatParcelizer.RatingCompat = ((Long) zzgz.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, Long.class, 0L)).longValue();
            arrayList.add(remoteActionCompatParcelizer);
        }
        return arrayList;
    }

    @Override // kotlin.TrackSampleTable
    public final void IconCompatParcelizer(String str) {
        this.IconCompatParcelizer.clearConditionalUserProperty(str, null, null);
    }

    @Override // kotlin.TrackSampleTable
    public final void IconCompatParcelizer(TrackSampleTable.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        String str;
        int i = sampleHasSubsampleEncryptionTable.write;
        if (remoteActionCompatParcelizer == null || (str = remoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer) == null || str.isEmpty()) {
            return;
        }
        if ((remoteActionCompatParcelizer.MediaBrowserCompatMediaItem == null || zziq.zza(remoteActionCompatParcelizer.MediaBrowserCompatMediaItem) != null) && sampleHasSubsampleEncryptionTable.read(str) && sampleHasSubsampleEncryptionTable.write(str, remoteActionCompatParcelizer.RemoteActionCompatParcelizer)) {
            if (remoteActionCompatParcelizer.read == null || (sampleHasSubsampleEncryptionTable.RemoteActionCompatParcelizer(remoteActionCompatParcelizer.read, remoteActionCompatParcelizer.IconCompatParcelizer) && sampleHasSubsampleEncryptionTable.write(str, remoteActionCompatParcelizer.read, remoteActionCompatParcelizer.IconCompatParcelizer))) {
                if (remoteActionCompatParcelizer.MediaDescriptionCompat == null || (sampleHasSubsampleEncryptionTable.RemoteActionCompatParcelizer(remoteActionCompatParcelizer.MediaDescriptionCompat, remoteActionCompatParcelizer.MediaBrowserCompatSearchResultReceiver) && sampleHasSubsampleEncryptionTable.write(str, remoteActionCompatParcelizer.MediaDescriptionCompat, remoteActionCompatParcelizer.MediaBrowserCompatSearchResultReceiver))) {
                    if (remoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer == null || (sampleHasSubsampleEncryptionTable.RemoteActionCompatParcelizer(remoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer, remoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer) && sampleHasSubsampleEncryptionTable.write(str, remoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer, remoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer))) {
                        AppMeasurementSdk appMeasurementSdk = this.IconCompatParcelizer;
                        Bundle bundle = new Bundle();
                        if (remoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer != null) {
                            bundle.putString("origin", remoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer);
                        }
                        if (remoteActionCompatParcelizer.RemoteActionCompatParcelizer != null) {
                            bundle.putString("name", remoteActionCompatParcelizer.RemoteActionCompatParcelizer);
                        }
                        if (remoteActionCompatParcelizer.MediaBrowserCompatMediaItem != null) {
                            zzgz.zzb(bundle, remoteActionCompatParcelizer.MediaBrowserCompatMediaItem);
                        }
                        if (remoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver != null) {
                            bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, remoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver);
                        }
                        bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, remoteActionCompatParcelizer.MediaMetadataCompat);
                        if (remoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer != null) {
                            bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, remoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer);
                        }
                        if (remoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer != null) {
                            bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, remoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer);
                        }
                        if (remoteActionCompatParcelizer.MediaDescriptionCompat != null) {
                            bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, remoteActionCompatParcelizer.MediaDescriptionCompat);
                        }
                        if (remoteActionCompatParcelizer.MediaBrowserCompatSearchResultReceiver != null) {
                            bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, remoteActionCompatParcelizer.MediaBrowserCompatSearchResultReceiver);
                        }
                        bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, remoteActionCompatParcelizer.MediaBrowserCompatItemReceiver);
                        if (remoteActionCompatParcelizer.read != null) {
                            bundle.putString(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, remoteActionCompatParcelizer.read);
                        }
                        if (remoteActionCompatParcelizer.IconCompatParcelizer != null) {
                            bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, remoteActionCompatParcelizer.IconCompatParcelizer);
                        }
                        bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, remoteActionCompatParcelizer.write);
                        bundle.putBoolean(AppMeasurementSdk.ConditionalUserProperty.ACTIVE, remoteActionCompatParcelizer.AudioAttributesCompatParcelizer);
                        bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, remoteActionCompatParcelizer.RatingCompat);
                        appMeasurementSdk.setConditionalUserProperty(bundle);
                    }
                }
            }
        }
    }

    @Override // kotlin.TrackSampleTable
    public final Map<String, Object> RemoteActionCompatParcelizer(boolean z) {
        return this.IconCompatParcelizer.getUserProperties(null, null, z);
    }

    @Override // kotlin.TrackSampleTable
    public final void RemoteActionCompatParcelizer(String str, String str2, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (sampleHasSubsampleEncryptionTable.read(str) && sampleHasSubsampleEncryptionTable.RemoteActionCompatParcelizer(str2, bundle) && sampleHasSubsampleEncryptionTable.write(str, str2, bundle)) {
            if ("clx".equals(str) && "_ae".equals(str2)) {
                bundle.putLong("_r", 1L);
            }
            this.IconCompatParcelizer.logEvent(str, str2, bundle);
        }
    }

    @Override // kotlin.TrackSampleTable
    public final TrackSampleTable.AudioAttributesCompatParcelizer write(final String str, TrackSampleTable.IconCompatParcelizer iconCompatParcelizer) {
        Preconditions.checkNotNull(iconCompatParcelizer);
        if (!sampleHasSubsampleEncryptionTable.read(str) || RemoteActionCompatParcelizer(str)) {
            return null;
        }
        AppMeasurementSdk appMeasurementSdk = this.IconCompatParcelizer;
        Object skiptopageoftargetgranule = AppMeasurement.FIAM_ORIGIN.equals(str) ? new skipToPageOfTargetGranule(appMeasurementSdk, iconCompatParcelizer) : "clx".equals(str) ? new getNextSeekPosition(appMeasurementSdk, iconCompatParcelizer) : null;
        if (skiptopageoftargetgranule == null) {
            return null;
        }
        this.RemoteActionCompatParcelizer.put(str, skiptopageoftargetgranule);
        return new TrackSampleTable.AudioAttributesCompatParcelizer() { // from class: o.getSamplePresentationTimeUs.3
        };
    }

    @Override // kotlin.TrackSampleTable
    public final void write(String str, String str2, Object obj) {
        if (sampleHasSubsampleEncryptionTable.read(str) && sampleHasSubsampleEncryptionTable.write(str, str2)) {
            this.IconCompatParcelizer.setUserProperty(str, str2, obj);
        }
    }

    public static TrackSampleTable read(FirebaseApp firebaseApp, Context context, AsynchronousMediaCodecBufferEnqueuerMessageParams asynchronousMediaCodecBufferEnqueuerMessageParams) {
        Preconditions.checkNotNull(firebaseApp);
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(asynchronousMediaCodecBufferEnqueuerMessageParams);
        Preconditions.checkNotNull(context.getApplicationContext());
        if (read == null) {
            synchronized (getSamplePresentationTimeUs.class) {
                if (read == null) {
                    Bundle bundle = new Bundle(1);
                    if (firebaseApp.AudioAttributesImplApi21Parcelizer()) {
                        asynchronousMediaCodecBufferEnqueuerMessageParams.RemoteActionCompatParcelizer(isCompatibleBrand.class, new Executor() { // from class: o.getIndexOfEarlierOrEqualSynchronizationSample
                            @Override // java.util.concurrent.Executor
                            public final void execute(Runnable runnable) {
                                runnable.run();
                            }
                        }, new doQueueSecureInputBuffer() { // from class: o.DefaultOggSeekerOggSeekMap
                            @Override // kotlin.doQueueSecureInputBuffer
                            public final void IconCompatParcelizer(getMessageParams getmessageparams) {
                                getSamplePresentationTimeUs.IconCompatParcelizer(getmessageparams);
                            }
                        });
                        bundle.putBoolean("dataCollectionDefaultEnabled", firebaseApp.AudioAttributesImplApi26Parcelizer());
                    }
                    read = new getSamplePresentationTimeUs(zzef.zzg(context, null, null, null, bundle).zzd());
                }
            }
        }
        return read;
    }
}
