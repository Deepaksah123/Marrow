package kotlin;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.DefaultAnalyticsCollectorExternalSyntheticLambda35;
import kotlin.DefaultAnalyticsCollectorExternalSyntheticLambda58;
import kotlin.DefaultAnalyticsCollectorExternalSyntheticLambda68;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u0010\u0010\u0003J\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0014\u0010\u0012J!\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0007¢\u0006\u0004\b\u0013\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0019R\u0016\u0010\u0014\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0019R\u001e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001fR\u0016\u0010\u0013\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u001c\u0010!\u001a\b\u0012\u0002\b\u0003\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010$\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010&\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010)R\u0014\u0010\u0007\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010+\u001a\u00020\u001b8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0018\u0010\n\u001a\u0006*\u00020/0/8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u00100R\u0014\u0010-\u001a\u0002018\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b-\u00102"}, d2 = {"Lo/DefaultAnalyticsCollectorExternalSyntheticLambda28;", "", "<init>", "()V", "", "MediaBrowserCompatMediaItem", "Landroid/app/Activity;", "AudioAttributesImplApi26Parcelizer", "()Landroid/app/Activity;", "Ljava/util/UUID;", "MediaDescriptionCompat", "()Ljava/util/UUID;", "", "MediaMetadataCompat", "()Z", "p0", "MediaBrowserCompatSearchResultReceiver", "IconCompatParcelizer", "(Landroid/app/Activity;)V", "AudioAttributesCompatParcelizer", "write", "Landroid/app/Application;", "", "p1", "(Landroid/app/Application;Ljava/lang/String;)V", "Ljava/lang/String;", "read", "", "RemoteActionCompatParcelizer", "I", "Ljava/lang/ref/WeakReference;", "Ljava/lang/ref/WeakReference;", "", "MediaBrowserCompatCustomActionResultReceiver", "J", "Ljava/util/concurrent/ScheduledFuture;", "AudioAttributesImplBaseParcelizer", "Ljava/util/concurrent/ScheduledFuture;", "AudioAttributesImplApi21Parcelizer", "Ljava/lang/Object;", "Lo/DefaultAnalyticsCollectorExternalSyntheticLambda35;", "Lo/DefaultAnalyticsCollectorExternalSyntheticLambda35;", "Ljava/util/concurrent/atomic/AtomicInteger;", "MediaBrowserCompatItemReceiver", "Ljava/util/concurrent/atomic/AtomicInteger;", "RatingCompat", "()I", "Ljava/util/concurrent/ScheduledExecutorService;", "Ljava/util/concurrent/ScheduledExecutorService;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;"}, k = 1, mv = {1, 4, 0})
public final class DefaultAnalyticsCollectorExternalSyntheticLambda28 {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private static final String read;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private static final Object AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private static volatile DefaultAnalyticsCollectorExternalSyntheticLambda35 AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private static volatile ScheduledFuture<?> MediaBrowserCompatCustomActionResultReceiver;
    public static final DefaultAnalyticsCollectorExternalSyntheticLambda28 INSTANCE = new DefaultAnalyticsCollectorExternalSyntheticLambda28();

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private static long AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private static final AtomicInteger AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
    private static final ScheduledExecutorService MediaDescriptionCompat;
    private static final AtomicBoolean RatingCompat;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private static int write;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private static WeakReference<Activity> IconCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private static String RemoteActionCompatParcelizer;

    static {
        String canonicalName = DefaultAnalyticsCollectorExternalSyntheticLambda28.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "com.facebook.appevents.internal.ActivityLifecycleTracker";
        }
        read = canonicalName;
        MediaDescriptionCompat = Executors.newSingleThreadScheduledExecutor();
        AudioAttributesImplBaseParcelizer = new Object();
        AudioAttributesImplApi26Parcelizer = new AtomicInteger(0);
        RatingCompat = new AtomicBoolean(false);
    }

    private DefaultAnalyticsCollectorExternalSyntheticLambda28() {
    }

    @getMagicModuleMeta
    public static final void AudioAttributesCompatParcelizer(Application p0, String p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (RatingCompat.compareAndSet(false, true)) {
            DefaultAnalyticsCollectorExternalSyntheticLambda58.write(DefaultAnalyticsCollectorExternalSyntheticLambda58.RemoteActionCompatParcelizer.CodelessEvents, new DefaultAnalyticsCollectorExternalSyntheticLambda58.write() { // from class: o.DefaultAnalyticsCollectorExternalSyntheticLambda28.4
                @Override // o.DefaultAnalyticsCollectorExternalSyntheticLambda58.write
                public final void RemoteActionCompatParcelizer(boolean z) {
                    if (z) {
                        DefaultAnalyticsCollectorExternalSyntheticLambda13.MediaBrowserCompatItemReceiver();
                    } else {
                        DefaultAnalyticsCollectorExternalSyntheticLambda13.write();
                    }
                }
            });
            RemoteActionCompatParcelizer = p1;
            p0.registerActivityLifecycleCallbacks(new write());
        }
    }

    public static final class write implements Application.ActivityLifecycleCallbacks {
        write() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
            toMagicModuleMetaRepoModel.write(activity, "");
            DefaultAnalyticsCollectorExternalSyntheticLambda68.read readVar = DefaultAnalyticsCollectorExternalSyntheticLambda68.read;
            lambdaonPositionDiscontinuity43 lambdaonpositiondiscontinuity43 = lambdaonPositionDiscontinuity43.APP_EVENTS;
            DefaultAnalyticsCollectorExternalSyntheticLambda28 defaultAnalyticsCollectorExternalSyntheticLambda28 = DefaultAnalyticsCollectorExternalSyntheticLambda28.INSTANCE;
            readVar.IconCompatParcelizer(lambdaonpositiondiscontinuity43, DefaultAnalyticsCollectorExternalSyntheticLambda28.read, "onActivityCreated");
            DefaultAnalyticsCollectorExternalSyntheticLambda29.IconCompatParcelizer();
            DefaultAnalyticsCollectorExternalSyntheticLambda28.MediaBrowserCompatSearchResultReceiver();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
            toMagicModuleMetaRepoModel.write(activity, "");
            DefaultAnalyticsCollectorExternalSyntheticLambda28 defaultAnalyticsCollectorExternalSyntheticLambda28 = DefaultAnalyticsCollectorExternalSyntheticLambda28.INSTANCE;
            DefaultAnalyticsCollectorExternalSyntheticLambda28.write++;
            DefaultAnalyticsCollectorExternalSyntheticLambda68.read readVar = DefaultAnalyticsCollectorExternalSyntheticLambda68.read;
            lambdaonPositionDiscontinuity43 lambdaonpositiondiscontinuity43 = lambdaonPositionDiscontinuity43.APP_EVENTS;
            DefaultAnalyticsCollectorExternalSyntheticLambda28 defaultAnalyticsCollectorExternalSyntheticLambda282 = DefaultAnalyticsCollectorExternalSyntheticLambda28.INSTANCE;
            readVar.IconCompatParcelizer(lambdaonpositiondiscontinuity43, DefaultAnalyticsCollectorExternalSyntheticLambda28.read, "onActivityStarted");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
            toMagicModuleMetaRepoModel.write(activity, "");
            DefaultAnalyticsCollectorExternalSyntheticLambda68.read readVar = DefaultAnalyticsCollectorExternalSyntheticLambda68.read;
            lambdaonPositionDiscontinuity43 lambdaonpositiondiscontinuity43 = lambdaonPositionDiscontinuity43.APP_EVENTS;
            DefaultAnalyticsCollectorExternalSyntheticLambda28 defaultAnalyticsCollectorExternalSyntheticLambda28 = DefaultAnalyticsCollectorExternalSyntheticLambda28.INSTANCE;
            readVar.IconCompatParcelizer(lambdaonpositiondiscontinuity43, DefaultAnalyticsCollectorExternalSyntheticLambda28.read, "onActivityResumed");
            DefaultAnalyticsCollectorExternalSyntheticLambda29.IconCompatParcelizer();
            DefaultAnalyticsCollectorExternalSyntheticLambda28.write(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            toMagicModuleMetaRepoModel.write(activity, "");
            DefaultAnalyticsCollectorExternalSyntheticLambda68.read readVar = DefaultAnalyticsCollectorExternalSyntheticLambda68.read;
            lambdaonPositionDiscontinuity43 lambdaonpositiondiscontinuity43 = lambdaonPositionDiscontinuity43.APP_EVENTS;
            DefaultAnalyticsCollectorExternalSyntheticLambda28 defaultAnalyticsCollectorExternalSyntheticLambda28 = DefaultAnalyticsCollectorExternalSyntheticLambda28.INSTANCE;
            readVar.IconCompatParcelizer(lambdaonpositiondiscontinuity43, DefaultAnalyticsCollectorExternalSyntheticLambda28.read, "onActivityPaused");
            DefaultAnalyticsCollectorExternalSyntheticLambda29.IconCompatParcelizer();
            DefaultAnalyticsCollectorExternalSyntheticLambda28 defaultAnalyticsCollectorExternalSyntheticLambda282 = DefaultAnalyticsCollectorExternalSyntheticLambda28.INSTANCE;
            DefaultAnalyticsCollectorExternalSyntheticLambda28.AudioAttributesCompatParcelizer(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
            toMagicModuleMetaRepoModel.write(activity, "");
            DefaultAnalyticsCollectorExternalSyntheticLambda68.read readVar = DefaultAnalyticsCollectorExternalSyntheticLambda68.read;
            lambdaonPositionDiscontinuity43 lambdaonpositiondiscontinuity43 = lambdaonPositionDiscontinuity43.APP_EVENTS;
            DefaultAnalyticsCollectorExternalSyntheticLambda28 defaultAnalyticsCollectorExternalSyntheticLambda28 = DefaultAnalyticsCollectorExternalSyntheticLambda28.INSTANCE;
            readVar.IconCompatParcelizer(lambdaonpositiondiscontinuity43, DefaultAnalyticsCollectorExternalSyntheticLambda28.read, "onActivityStopped");
            lambdaonVideoDisabled18.write();
            DefaultAnalyticsCollectorExternalSyntheticLambda28 defaultAnalyticsCollectorExternalSyntheticLambda282 = DefaultAnalyticsCollectorExternalSyntheticLambda28.INSTANCE;
            DefaultAnalyticsCollectorExternalSyntheticLambda28.write--;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            toMagicModuleMetaRepoModel.write(activity, "");
            toMagicModuleMetaRepoModel.write(bundle, "");
            DefaultAnalyticsCollectorExternalSyntheticLambda68.read readVar = DefaultAnalyticsCollectorExternalSyntheticLambda68.read;
            lambdaonPositionDiscontinuity43 lambdaonpositiondiscontinuity43 = lambdaonPositionDiscontinuity43.APP_EVENTS;
            DefaultAnalyticsCollectorExternalSyntheticLambda28 defaultAnalyticsCollectorExternalSyntheticLambda28 = DefaultAnalyticsCollectorExternalSyntheticLambda28.INSTANCE;
            readVar.IconCompatParcelizer(lambdaonpositiondiscontinuity43, DefaultAnalyticsCollectorExternalSyntheticLambda28.read, "onActivitySaveInstanceState");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            toMagicModuleMetaRepoModel.write(activity, "");
            DefaultAnalyticsCollectorExternalSyntheticLambda68.read readVar = DefaultAnalyticsCollectorExternalSyntheticLambda68.read;
            lambdaonPositionDiscontinuity43 lambdaonpositiondiscontinuity43 = lambdaonPositionDiscontinuity43.APP_EVENTS;
            DefaultAnalyticsCollectorExternalSyntheticLambda28 defaultAnalyticsCollectorExternalSyntheticLambda28 = DefaultAnalyticsCollectorExternalSyntheticLambda28.INSTANCE;
            readVar.IconCompatParcelizer(lambdaonpositiondiscontinuity43, DefaultAnalyticsCollectorExternalSyntheticLambda28.read, "onActivityDestroyed");
            DefaultAnalyticsCollectorExternalSyntheticLambda28 defaultAnalyticsCollectorExternalSyntheticLambda282 = DefaultAnalyticsCollectorExternalSyntheticLambda28.INSTANCE;
            DefaultAnalyticsCollectorExternalSyntheticLambda28.IconCompatParcelizer(activity);
        }
    }

    @getMagicModuleMeta
    public static final boolean MediaMetadataCompat() {
        return write == 0;
    }

    @getMagicModuleMeta
    public static final UUID MediaDescriptionCompat() {
        DefaultAnalyticsCollectorExternalSyntheticLambda35 defaultAnalyticsCollectorExternalSyntheticLambda35;
        if (AudioAttributesImplApi21Parcelizer == null || (defaultAnalyticsCollectorExternalSyntheticLambda35 = AudioAttributesImplApi21Parcelizer) == null) {
            return null;
        }
        return defaultAnalyticsCollectorExternalSyntheticLambda35.getWrite();
    }

    @getMagicModuleMeta
    public static final void MediaBrowserCompatSearchResultReceiver() {
        MediaDescriptionCompat.execute(new Runnable() { // from class: o.DefaultAnalyticsCollectorExternalSyntheticLambda28.2
            @Override // java.lang.Runnable
            public final void run() {
                if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
                    return;
                }
                try {
                } catch (Throwable th) {
                    getMinWindowSequenceNumber.read(th, this);
                }
                if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
                    return;
                }
                try {
                    DefaultAnalyticsCollectorExternalSyntheticLambda28 defaultAnalyticsCollectorExternalSyntheticLambda28 = DefaultAnalyticsCollectorExternalSyntheticLambda28.INSTANCE;
                    if (DefaultAnalyticsCollectorExternalSyntheticLambda28.AudioAttributesImplApi21Parcelizer == null) {
                        DefaultAnalyticsCollectorExternalSyntheticLambda28 defaultAnalyticsCollectorExternalSyntheticLambda282 = DefaultAnalyticsCollectorExternalSyntheticLambda28.INSTANCE;
                        DefaultAnalyticsCollectorExternalSyntheticLambda35.Companion readVar = DefaultAnalyticsCollectorExternalSyntheticLambda35.INSTANCE;
                        DefaultAnalyticsCollectorExternalSyntheticLambda28.AudioAttributesImplApi21Parcelizer = DefaultAnalyticsCollectorExternalSyntheticLambda35.Companion.read();
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    getMinWindowSequenceNumber.read(th2, this);
                    return;
                }
                getMinWindowSequenceNumber.read(th, this);
            }
        });
    }

    @getMagicModuleMeta
    public static final void write(Activity p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        IconCompatParcelizer = new WeakReference<>(p0);
        AudioAttributesImplApi26Parcelizer.incrementAndGet();
        MediaBrowserCompatMediaItem();
        final long jCurrentTimeMillis = System.currentTimeMillis();
        AudioAttributesCompatParcelizer = jCurrentTimeMillis;
        final String str = DefaultAnalyticsCollectorMediaPeriodQueueTracker.read(p0);
        DefaultAnalyticsCollectorExternalSyntheticLambda13.AudioAttributesCompatParcelizer(p0);
        sendEvent.write(p0);
        DefaultAnalyticsCollectorExternalSyntheticLambda48.write(p0);
        DefaultAnalyticsCollectorExternalSyntheticLambda23.AudioAttributesCompatParcelizer();
        final Context applicationContext = p0.getApplicationContext();
        MediaDescriptionCompat.execute(new Runnable() { // from class: o.DefaultAnalyticsCollectorExternalSyntheticLambda28.5
            @Override // java.lang.Runnable
            public final void run() {
                if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
                    return;
                }
                try {
                } catch (Throwable th) {
                    getMinWindowSequenceNumber.read(th, this);
                }
                if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
                    return;
                }
                try {
                    DefaultAnalyticsCollectorExternalSyntheticLambda28 defaultAnalyticsCollectorExternalSyntheticLambda28 = DefaultAnalyticsCollectorExternalSyntheticLambda28.INSTANCE;
                    DefaultAnalyticsCollectorExternalSyntheticLambda35 defaultAnalyticsCollectorExternalSyntheticLambda35 = DefaultAnalyticsCollectorExternalSyntheticLambda28.AudioAttributesImplApi21Parcelizer;
                    Long lWrite = defaultAnalyticsCollectorExternalSyntheticLambda35 != null ? defaultAnalyticsCollectorExternalSyntheticLambda35.getIconCompatParcelizer() : null;
                    DefaultAnalyticsCollectorExternalSyntheticLambda28 defaultAnalyticsCollectorExternalSyntheticLambda282 = DefaultAnalyticsCollectorExternalSyntheticLambda28.INSTANCE;
                    if (DefaultAnalyticsCollectorExternalSyntheticLambda28.AudioAttributesImplApi21Parcelizer == null) {
                        DefaultAnalyticsCollectorExternalSyntheticLambda28 defaultAnalyticsCollectorExternalSyntheticLambda283 = DefaultAnalyticsCollectorExternalSyntheticLambda28.INSTANCE;
                        DefaultAnalyticsCollectorExternalSyntheticLambda28.AudioAttributesImplApi21Parcelizer = new DefaultAnalyticsCollectorExternalSyntheticLambda35(Long.valueOf(jCurrentTimeMillis), null, null, 4, null);
                        String str2 = str;
                        DefaultAnalyticsCollectorExternalSyntheticLambda28 defaultAnalyticsCollectorExternalSyntheticLambda284 = DefaultAnalyticsCollectorExternalSyntheticLambda28.INSTANCE;
                        String str3 = DefaultAnalyticsCollectorExternalSyntheticLambda28.RemoteActionCompatParcelizer;
                        Context context = applicationContext;
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(context, "");
                        DefaultAnalyticsCollectorExternalSyntheticLambda36.write(str2, str3, context);
                    } else if (lWrite != null) {
                        long jLongValue = jCurrentTimeMillis - lWrite.longValue();
                        DefaultAnalyticsCollectorExternalSyntheticLambda28 defaultAnalyticsCollectorExternalSyntheticLambda285 = DefaultAnalyticsCollectorExternalSyntheticLambda28.INSTANCE;
                        if (jLongValue > DefaultAnalyticsCollectorExternalSyntheticLambda28.RatingCompat() * 1000) {
                            String str4 = str;
                            DefaultAnalyticsCollectorExternalSyntheticLambda28 defaultAnalyticsCollectorExternalSyntheticLambda286 = DefaultAnalyticsCollectorExternalSyntheticLambda28.INSTANCE;
                            DefaultAnalyticsCollectorExternalSyntheticLambda35 defaultAnalyticsCollectorExternalSyntheticLambda352 = DefaultAnalyticsCollectorExternalSyntheticLambda28.AudioAttributesImplApi21Parcelizer;
                            DefaultAnalyticsCollectorExternalSyntheticLambda28 defaultAnalyticsCollectorExternalSyntheticLambda287 = DefaultAnalyticsCollectorExternalSyntheticLambda28.INSTANCE;
                            DefaultAnalyticsCollectorExternalSyntheticLambda36.RemoteActionCompatParcelizer(str4, defaultAnalyticsCollectorExternalSyntheticLambda352, DefaultAnalyticsCollectorExternalSyntheticLambda28.RemoteActionCompatParcelizer);
                            String str5 = str;
                            DefaultAnalyticsCollectorExternalSyntheticLambda28 defaultAnalyticsCollectorExternalSyntheticLambda288 = DefaultAnalyticsCollectorExternalSyntheticLambda28.INSTANCE;
                            String str6 = DefaultAnalyticsCollectorExternalSyntheticLambda28.RemoteActionCompatParcelizer;
                            Context context2 = applicationContext;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(context2, "");
                            DefaultAnalyticsCollectorExternalSyntheticLambda36.write(str5, str6, context2);
                            DefaultAnalyticsCollectorExternalSyntheticLambda28 defaultAnalyticsCollectorExternalSyntheticLambda289 = DefaultAnalyticsCollectorExternalSyntheticLambda28.INSTANCE;
                            DefaultAnalyticsCollectorExternalSyntheticLambda28.AudioAttributesImplApi21Parcelizer = new DefaultAnalyticsCollectorExternalSyntheticLambda35(Long.valueOf(jCurrentTimeMillis), null, null, 4, null);
                        } else if (jLongValue > 1000) {
                            DefaultAnalyticsCollectorExternalSyntheticLambda28 defaultAnalyticsCollectorExternalSyntheticLambda2810 = DefaultAnalyticsCollectorExternalSyntheticLambda28.INSTANCE;
                            DefaultAnalyticsCollectorExternalSyntheticLambda35 defaultAnalyticsCollectorExternalSyntheticLambda353 = DefaultAnalyticsCollectorExternalSyntheticLambda28.AudioAttributesImplApi21Parcelizer;
                            if (defaultAnalyticsCollectorExternalSyntheticLambda353 != null) {
                                defaultAnalyticsCollectorExternalSyntheticLambda353.AudioAttributesImplApi21Parcelizer();
                            }
                        }
                    }
                    DefaultAnalyticsCollectorExternalSyntheticLambda28 defaultAnalyticsCollectorExternalSyntheticLambda2811 = DefaultAnalyticsCollectorExternalSyntheticLambda28.INSTANCE;
                    DefaultAnalyticsCollectorExternalSyntheticLambda35 defaultAnalyticsCollectorExternalSyntheticLambda354 = DefaultAnalyticsCollectorExternalSyntheticLambda28.AudioAttributesImplApi21Parcelizer;
                    if (defaultAnalyticsCollectorExternalSyntheticLambda354 != null) {
                        defaultAnalyticsCollectorExternalSyntheticLambda354.read(Long.valueOf(jCurrentTimeMillis));
                    }
                    DefaultAnalyticsCollectorExternalSyntheticLambda28 defaultAnalyticsCollectorExternalSyntheticLambda2812 = DefaultAnalyticsCollectorExternalSyntheticLambda28.INSTANCE;
                    DefaultAnalyticsCollectorExternalSyntheticLambda35 defaultAnalyticsCollectorExternalSyntheticLambda355 = DefaultAnalyticsCollectorExternalSyntheticLambda28.AudioAttributesImplApi21Parcelizer;
                    if (defaultAnalyticsCollectorExternalSyntheticLambda355 != null) {
                        defaultAnalyticsCollectorExternalSyntheticLambda355.AudioAttributesImplBaseParcelizer();
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    getMinWindowSequenceNumber.read(th2, this);
                    return;
                }
                getMinWindowSequenceNumber.read(th, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void AudioAttributesCompatParcelizer(Activity p0) {
        AtomicInteger atomicInteger = AudioAttributesImplApi26Parcelizer;
        if (atomicInteger.decrementAndGet() < 0) {
            atomicInteger.set(0);
        }
        MediaBrowserCompatMediaItem();
        final long jCurrentTimeMillis = System.currentTimeMillis();
        final String str = DefaultAnalyticsCollectorMediaPeriodQueueTracker.read(p0);
        DefaultAnalyticsCollectorExternalSyntheticLambda13.RemoteActionCompatParcelizer(p0);
        MediaDescriptionCompat.execute(new Runnable() { // from class: o.DefaultAnalyticsCollectorExternalSyntheticLambda28.1
            @Override // java.lang.Runnable
            public final void run() {
                if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
                    return;
                }
                try {
                    if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
                        return;
                    }
                    try {
                        DefaultAnalyticsCollectorExternalSyntheticLambda28 defaultAnalyticsCollectorExternalSyntheticLambda28 = DefaultAnalyticsCollectorExternalSyntheticLambda28.INSTANCE;
                        if (DefaultAnalyticsCollectorExternalSyntheticLambda28.AudioAttributesImplApi21Parcelizer == null) {
                            DefaultAnalyticsCollectorExternalSyntheticLambda28 defaultAnalyticsCollectorExternalSyntheticLambda282 = DefaultAnalyticsCollectorExternalSyntheticLambda28.INSTANCE;
                            DefaultAnalyticsCollectorExternalSyntheticLambda28.AudioAttributesImplApi21Parcelizer = new DefaultAnalyticsCollectorExternalSyntheticLambda35(Long.valueOf(jCurrentTimeMillis), null, null, 4, null);
                        }
                        DefaultAnalyticsCollectorExternalSyntheticLambda28 defaultAnalyticsCollectorExternalSyntheticLambda283 = DefaultAnalyticsCollectorExternalSyntheticLambda28.INSTANCE;
                        DefaultAnalyticsCollectorExternalSyntheticLambda35 defaultAnalyticsCollectorExternalSyntheticLambda35 = DefaultAnalyticsCollectorExternalSyntheticLambda28.AudioAttributesImplApi21Parcelizer;
                        if (defaultAnalyticsCollectorExternalSyntheticLambda35 != null) {
                            defaultAnalyticsCollectorExternalSyntheticLambda35.read(Long.valueOf(jCurrentTimeMillis));
                        }
                        DefaultAnalyticsCollectorExternalSyntheticLambda28 defaultAnalyticsCollectorExternalSyntheticLambda284 = DefaultAnalyticsCollectorExternalSyntheticLambda28.INSTANCE;
                        if (DefaultAnalyticsCollectorExternalSyntheticLambda28.AudioAttributesImplApi26Parcelizer.get() <= 0) {
                            Runnable runnable = new Runnable() { // from class: o.DefaultAnalyticsCollectorExternalSyntheticLambda28.1.4
                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object] */
                                /* JADX WARN: Type inference failed for: r7v4, types: [o.getShowPopup] */
                                @Override // java.lang.Runnable
                                public final void run() {
                                    if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
                                        return;
                                    }
                                    try {
                                        if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
                                            return;
                                        }
                                        try {
                                            DefaultAnalyticsCollectorExternalSyntheticLambda28 defaultAnalyticsCollectorExternalSyntheticLambda285 = DefaultAnalyticsCollectorExternalSyntheticLambda28.INSTANCE;
                                            if (DefaultAnalyticsCollectorExternalSyntheticLambda28.AudioAttributesImplApi21Parcelizer == null) {
                                                DefaultAnalyticsCollectorExternalSyntheticLambda28 defaultAnalyticsCollectorExternalSyntheticLambda286 = DefaultAnalyticsCollectorExternalSyntheticLambda28.INSTANCE;
                                                DefaultAnalyticsCollectorExternalSyntheticLambda28.AudioAttributesImplApi21Parcelizer = new DefaultAnalyticsCollectorExternalSyntheticLambda35(Long.valueOf(jCurrentTimeMillis), null, null, 4, null);
                                            }
                                            DefaultAnalyticsCollectorExternalSyntheticLambda28 defaultAnalyticsCollectorExternalSyntheticLambda287 = DefaultAnalyticsCollectorExternalSyntheticLambda28.INSTANCE;
                                            if (DefaultAnalyticsCollectorExternalSyntheticLambda28.AudioAttributesImplApi26Parcelizer.get() <= 0) {
                                                String str2 = str;
                                                DefaultAnalyticsCollectorExternalSyntheticLambda28 defaultAnalyticsCollectorExternalSyntheticLambda288 = DefaultAnalyticsCollectorExternalSyntheticLambda28.INSTANCE;
                                                DefaultAnalyticsCollectorExternalSyntheticLambda35 defaultAnalyticsCollectorExternalSyntheticLambda352 = DefaultAnalyticsCollectorExternalSyntheticLambda28.AudioAttributesImplApi21Parcelizer;
                                                DefaultAnalyticsCollectorExternalSyntheticLambda28 defaultAnalyticsCollectorExternalSyntheticLambda289 = DefaultAnalyticsCollectorExternalSyntheticLambda28.INSTANCE;
                                                DefaultAnalyticsCollectorExternalSyntheticLambda36.RemoteActionCompatParcelizer(str2, defaultAnalyticsCollectorExternalSyntheticLambda352, DefaultAnalyticsCollectorExternalSyntheticLambda28.RemoteActionCompatParcelizer);
                                                DefaultAnalyticsCollectorExternalSyntheticLambda35.Companion readVar = DefaultAnalyticsCollectorExternalSyntheticLambda35.INSTANCE;
                                                DefaultAnalyticsCollectorExternalSyntheticLambda35.Companion.write();
                                                DefaultAnalyticsCollectorExternalSyntheticLambda28 defaultAnalyticsCollectorExternalSyntheticLambda2810 = DefaultAnalyticsCollectorExternalSyntheticLambda28.INSTANCE;
                                                DefaultAnalyticsCollectorExternalSyntheticLambda28.AudioAttributesImplApi21Parcelizer = null;
                                            }
                                            DefaultAnalyticsCollectorExternalSyntheticLambda28 defaultAnalyticsCollectorExternalSyntheticLambda2811 = DefaultAnalyticsCollectorExternalSyntheticLambda28.INSTANCE;
                                            synchronized (DefaultAnalyticsCollectorExternalSyntheticLambda28.AudioAttributesImplBaseParcelizer) {
                                                DefaultAnalyticsCollectorExternalSyntheticLambda28 defaultAnalyticsCollectorExternalSyntheticLambda2812 = DefaultAnalyticsCollectorExternalSyntheticLambda28.INSTANCE;
                                                DefaultAnalyticsCollectorExternalSyntheticLambda28.MediaBrowserCompatCustomActionResultReceiver = null;
                                                this = getShowPopup.INSTANCE;
                                            }
                                        } catch (Throwable th) {
                                            getMinWindowSequenceNumber.read(th, this);
                                        }
                                    } catch (Throwable th2) {
                                        getMinWindowSequenceNumber.read(th2, this);
                                    }
                                }
                            };
                            DefaultAnalyticsCollectorExternalSyntheticLambda28 defaultAnalyticsCollectorExternalSyntheticLambda285 = DefaultAnalyticsCollectorExternalSyntheticLambda28.INSTANCE;
                            synchronized (DefaultAnalyticsCollectorExternalSyntheticLambda28.AudioAttributesImplBaseParcelizer) {
                                DefaultAnalyticsCollectorExternalSyntheticLambda28 defaultAnalyticsCollectorExternalSyntheticLambda286 = DefaultAnalyticsCollectorExternalSyntheticLambda28.INSTANCE;
                                DefaultAnalyticsCollectorExternalSyntheticLambda28 defaultAnalyticsCollectorExternalSyntheticLambda287 = DefaultAnalyticsCollectorExternalSyntheticLambda28.INSTANCE;
                                ScheduledExecutorService scheduledExecutorService = DefaultAnalyticsCollectorExternalSyntheticLambda28.MediaDescriptionCompat;
                                DefaultAnalyticsCollectorExternalSyntheticLambda28 defaultAnalyticsCollectorExternalSyntheticLambda288 = DefaultAnalyticsCollectorExternalSyntheticLambda28.INSTANCE;
                                DefaultAnalyticsCollectorExternalSyntheticLambda28.MediaBrowserCompatCustomActionResultReceiver = scheduledExecutorService.schedule(runnable, DefaultAnalyticsCollectorExternalSyntheticLambda28.RatingCompat(), TimeUnit.SECONDS);
                                getShowPopup getshowpopup = getShowPopup.INSTANCE;
                            }
                        }
                        DefaultAnalyticsCollectorExternalSyntheticLambda28 defaultAnalyticsCollectorExternalSyntheticLambda289 = DefaultAnalyticsCollectorExternalSyntheticLambda28.INSTANCE;
                        long j = DefaultAnalyticsCollectorExternalSyntheticLambda28.AudioAttributesCompatParcelizer;
                        DefaultAnalyticsCollectorExternalSyntheticLambda31.read(str, j > 0 ? (jCurrentTimeMillis - j) / 1000 : 0L);
                        DefaultAnalyticsCollectorExternalSyntheticLambda28 defaultAnalyticsCollectorExternalSyntheticLambda2810 = DefaultAnalyticsCollectorExternalSyntheticLambda28.INSTANCE;
                        DefaultAnalyticsCollectorExternalSyntheticLambda35 defaultAnalyticsCollectorExternalSyntheticLambda352 = DefaultAnalyticsCollectorExternalSyntheticLambda28.AudioAttributesImplApi21Parcelizer;
                        if (defaultAnalyticsCollectorExternalSyntheticLambda352 != null) {
                            defaultAnalyticsCollectorExternalSyntheticLambda352.AudioAttributesImplBaseParcelizer();
                        }
                    } catch (Throwable th) {
                        getMinWindowSequenceNumber.read(th, this);
                    }
                } catch (Throwable th2) {
                    getMinWindowSequenceNumber.read(th2, this);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void IconCompatParcelizer(Activity p0) {
        DefaultAnalyticsCollectorExternalSyntheticLambda13.read(p0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int RatingCompat() {
        DefaultAnalyticsCollectorExternalSyntheticLambda6 defaultAnalyticsCollectorExternalSyntheticLambda6AudioAttributesCompatParcelizer = DefaultAnalyticsCollectorExternalSyntheticLambda61.AudioAttributesCompatParcelizer(lambdaonMediaMetadataChanged48.write());
        if (defaultAnalyticsCollectorExternalSyntheticLambda6AudioAttributesCompatParcelizer == null) {
            return DefaultAnalyticsCollectorExternalSyntheticLambda30.AudioAttributesCompatParcelizer();
        }
        return defaultAnalyticsCollectorExternalSyntheticLambda6AudioAttributesCompatParcelizer.getRatingCompat();
    }

    private static void MediaBrowserCompatMediaItem() {
        ScheduledFuture<?> scheduledFuture;
        synchronized (AudioAttributesImplBaseParcelizer) {
            if (MediaBrowserCompatCustomActionResultReceiver != null && (scheduledFuture = MediaBrowserCompatCustomActionResultReceiver) != null) {
                scheduledFuture.cancel(false);
            }
            MediaBrowserCompatCustomActionResultReceiver = null;
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
        }
    }

    @getMagicModuleMeta
    public static final Activity AudioAttributesImplApi26Parcelizer() {
        WeakReference<Activity> weakReference = IconCompatParcelizer;
        if (weakReference == null || weakReference == null) {
            return null;
        }
        return weakReference.get();
    }
}
