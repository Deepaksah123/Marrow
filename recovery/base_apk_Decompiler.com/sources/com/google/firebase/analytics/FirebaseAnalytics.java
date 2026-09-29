package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzef;
import com.google.android.gms.measurement.internal.zzil;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.BatchBuffer;
import kotlin.DefaultOggSeeker1;
import kotlin.createSeekMap;
import kotlin.readGranuleOfLastPage;
import kotlin.startSeek;

/* JADX INFO: loaded from: classes.dex */
public final class FirebaseAnalytics {
    private static volatile FirebaseAnalytics zza;
    private final zzef zzb;
    private ExecutorService zzc;

    public enum AudioAttributesCompatParcelizer {
        /* JADX INFO: Fake field, exist only in values array */
        GRANTED,
        /* JADX INFO: Fake field, exist only in values array */
        DENIED
    }

    public enum RemoteActionCompatParcelizer {
        AD_STORAGE,
        ANALYTICS_STORAGE
    }

    public FirebaseAnalytics(zzef zzefVar) {
        Preconditions.checkNotNull(zzefVar);
        this.zzb = zzefVar;
    }

    public static FirebaseAnalytics getInstance(Context context) {
        if (zza == null) {
            synchronized (FirebaseAnalytics.class) {
                if (zza == null) {
                    zza = new FirebaseAnalytics(zzef.zzg(context, null, null, null, null));
                }
            }
        }
        return zza;
    }

    public static zzil getScionFrontendApiImplementation(Context context, Bundle bundle) {
        zzef zzefVarZzg = zzef.zzg(context, null, null, null, bundle);
        if (zzefVarZzg == null) {
            return null;
        }
        return new DefaultOggSeeker1(zzefVarZzg);
    }

    private final ExecutorService zzb() {
        ExecutorService executorService;
        synchronized (FirebaseAnalytics.class) {
            if (this.zzc == null) {
                this.zzc = new createSeekMap(TimeUnit.SECONDS, new ArrayBlockingQueue(100));
            }
            executorService = this.zzc;
        }
        return executorService;
    }

    public final Task<String> getAppInstanceId() {
        try {
            return Tasks.call(zzb(), new readGranuleOfLastPage(this));
        } catch (RuntimeException e) {
            this.zzb.zzB(5, "Failed to schedule task for getAppInstanceId", null, null, null);
            return Tasks.forException(e);
        }
    }

    public final String getFirebaseInstanceId() {
        try {
            return (String) Tasks.await(BatchBuffer.read().write(), 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        } catch (ExecutionException e2) {
            throw new IllegalStateException(e2.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    public final Task<Long> getSessionId() {
        try {
            return Tasks.call(zzb(), new startSeek(this));
        } catch (RuntimeException e) {
            this.zzb.zzB(5, "Failed to schedule task for getSessionId", null, null, null);
            return Tasks.forException(e);
        }
    }

    public final void logEvent(String str, Bundle bundle) {
        this.zzb.zzy(str, bundle);
    }

    public final void resetAnalyticsData() {
        this.zzb.zzD();
    }

    public final void setAnalyticsCollectionEnabled(boolean z) {
        this.zzb.zzL(Boolean.valueOf(z));
    }

    public final void setConsent(Map<RemoteActionCompatParcelizer, AudioAttributesCompatParcelizer> map) {
        Bundle bundle = new Bundle();
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = map.get(RemoteActionCompatParcelizer.AD_STORAGE);
        if (audioAttributesCompatParcelizer != null) {
            int iOrdinal = audioAttributesCompatParcelizer.ordinal();
            if (iOrdinal == 0) {
                bundle.putString("ad_storage", "granted");
            } else if (iOrdinal == 1) {
                bundle.putString("ad_storage", "denied");
            }
        }
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizer2 = map.get(RemoteActionCompatParcelizer.ANALYTICS_STORAGE);
        if (audioAttributesCompatParcelizer2 != null) {
            int iOrdinal2 = audioAttributesCompatParcelizer2.ordinal();
            if (iOrdinal2 == 0) {
                bundle.putString("analytics_storage", "granted");
            } else if (iOrdinal2 == 1) {
                bundle.putString("analytics_storage", "denied");
            }
        }
        this.zzb.zzG(bundle);
    }

    @Deprecated
    public final void setCurrentScreen(Activity activity, String str, String str2) {
        this.zzb.zzH(activity, str, str2);
    }

    public final void setDefaultEventParameters(Bundle bundle) {
        this.zzb.zzJ(bundle);
    }

    public final void setSessionTimeoutDuration(long j) {
        this.zzb.zzM(j);
    }

    public final void setUserId(String str) {
        this.zzb.zzN(str);
    }

    public final void setUserProperty(String str, String str2) {
        this.zzb.zzO(null, str, str2, false);
    }
}
