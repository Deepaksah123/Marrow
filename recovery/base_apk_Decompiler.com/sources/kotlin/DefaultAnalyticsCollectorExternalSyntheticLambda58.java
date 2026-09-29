package kotlin;

import android.R;
import com.google.android.exoplayer2.C;
import java.util.HashMap;
import java.util.Map;
import kotlin.DefaultAnalyticsCollectorExternalSyntheticLambda63;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u0011\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\t\fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\rJ\u000f\u0010\u0011\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0011\u0010\u0003J\u0017\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0011\u0010\rR&\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00150\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0016"}, d2 = {"Lo/DefaultAnalyticsCollectorExternalSyntheticLambda58;", "", "<init>", "()V", "Lo/DefaultAnalyticsCollectorExternalSyntheticLambda58$RemoteActionCompatParcelizer;", "p0", "Lo/DefaultAnalyticsCollectorExternalSyntheticLambda58$write;", "p1", "", "write", "(Lo/DefaultAnalyticsCollectorExternalSyntheticLambda58$RemoteActionCompatParcelizer;Lo/DefaultAnalyticsCollectorExternalSyntheticLambda58$write;)V", "", "RemoteActionCompatParcelizer", "(Lo/DefaultAnalyticsCollectorExternalSyntheticLambda58$RemoteActionCompatParcelizer;)Z", "read", "(Lo/DefaultAnalyticsCollectorExternalSyntheticLambda58$RemoteActionCompatParcelizer;)V", "", "IconCompatParcelizer", "(Ljava/lang/String;)Lo/DefaultAnalyticsCollectorExternalSyntheticLambda58$RemoteActionCompatParcelizer;", "AudioAttributesCompatParcelizer", "", "", "Ljava/util/Map;"}, k = 1, mv = {1, 4, 0})
public final class DefaultAnalyticsCollectorExternalSyntheticLambda58 {
    public static final DefaultAnalyticsCollectorExternalSyntheticLambda58 INSTANCE = new DefaultAnalyticsCollectorExternalSyntheticLambda58();

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private static final Map<RemoteActionCompatParcelizer, String[]> IconCompatParcelizer = new HashMap();

    public interface write {
        void RemoteActionCompatParcelizer(boolean z);
    }

    private DefaultAnalyticsCollectorExternalSyntheticLambda58() {
    }

    public static final class AudioAttributesCompatParcelizer implements DefaultAnalyticsCollectorExternalSyntheticLambda63.read {
        private /* synthetic */ RemoteActionCompatParcelizer AudioAttributesCompatParcelizer;
        private /* synthetic */ write read;

        AudioAttributesCompatParcelizer(write writeVar, RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
            this.read = writeVar;
            this.AudioAttributesCompatParcelizer = remoteActionCompatParcelizer;
        }

        @Override // o.DefaultAnalyticsCollectorExternalSyntheticLambda63.read
        public final void RemoteActionCompatParcelizer() {
            this.read.RemoteActionCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda58.IconCompatParcelizer(this.AudioAttributesCompatParcelizer));
        }
    }

    @getMagicModuleMeta
    public static final void write(RemoteActionCompatParcelizer p0, write p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        DefaultAnalyticsCollectorExternalSyntheticLambda63.AudioAttributesCompatParcelizer(new AudioAttributesCompatParcelizer(p1, p0));
    }

    @getMagicModuleMeta
    public static final boolean IconCompatParcelizer(RemoteActionCompatParcelizer p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (RemoteActionCompatParcelizer.Unknown == p0) {
            return false;
        }
        if (RemoteActionCompatParcelizer.Core == p0) {
            return true;
        }
        String string = lambdaonMediaMetadataChanged48.AudioAttributesCompatParcelizer().getSharedPreferences("com.facebook.internal.FEATURE_MANAGER", 0).getString(p0.AudioAttributesCompatParcelizer(), null);
        if (string != null && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) string, (Object) lambdaonMediaMetadataChanged48.RatingCompat())) {
            return false;
        }
        RemoteActionCompatParcelizer remoteActionCompatParcelizerIconCompatParcelizer = p0.IconCompatParcelizer();
        if (remoteActionCompatParcelizerIconCompatParcelizer == p0) {
            return AudioAttributesCompatParcelizer(p0);
        }
        return IconCompatParcelizer(remoteActionCompatParcelizerIconCompatParcelizer) && AudioAttributesCompatParcelizer(p0);
    }

    @getMagicModuleMeta
    public static final void read(RemoteActionCompatParcelizer p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        lambdaonMediaMetadataChanged48.AudioAttributesCompatParcelizer().getSharedPreferences("com.facebook.internal.FEATURE_MANAGER", 0).edit().putString(p0.AudioAttributesCompatParcelizer(), lambdaonMediaMetadataChanged48.RatingCompat()).apply();
    }

    @getMagicModuleMeta
    public static final RemoteActionCompatParcelizer IconCompatParcelizer(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        INSTANCE.IconCompatParcelizer();
        for (Map.Entry<RemoteActionCompatParcelizer, String[]> entry : IconCompatParcelizer.entrySet()) {
            RemoteActionCompatParcelizer key = entry.getKey();
            for (String str : entry.getValue()) {
                if (TestGroupLSModel.MediaBrowserCompatCustomActionResultReceiver(p0, str)) {
                    return key;
                }
            }
        }
        return RemoteActionCompatParcelizer.Unknown;
    }

    private final void IconCompatParcelizer() {
        synchronized (this) {
            Map<RemoteActionCompatParcelizer, String[]> map = IconCompatParcelizer;
            if (map.isEmpty()) {
                map.put(RemoteActionCompatParcelizer.AAM, new String[]{"com.facebook.appevents.aam."});
                map.put(RemoteActionCompatParcelizer.CodelessEvents, new String[]{"com.facebook.appevents.codeless."});
                map.put(RemoteActionCompatParcelizer.ErrorReport, new String[]{"com.facebook.internal.instrument.errorreport."});
                map.put(RemoteActionCompatParcelizer.AnrReport, new String[]{"com.facebook.internal.instrument.anrreport."});
                map.put(RemoteActionCompatParcelizer.PrivacyProtection, new String[]{"com.facebook.appevents.ml."});
                map.put(RemoteActionCompatParcelizer.SuggestedEvents, new String[]{"com.facebook.appevents.suggestedevents."});
                map.put(RemoteActionCompatParcelizer.RestrictiveDataFiltering, new String[]{"com.facebook.appevents.restrictivedatafilter.RestrictiveDataManager"});
                map.put(RemoteActionCompatParcelizer.IntelligentIntegrity, new String[]{"com.facebook.appevents.integrity.IntegrityManager"});
                map.put(RemoteActionCompatParcelizer.EventDeactivation, new String[]{"com.facebook.appevents.eventdeactivation."});
                map.put(RemoteActionCompatParcelizer.OnDeviceEventProcessing, new String[]{"com.facebook.appevents.ondeviceprocessing."});
                map.put(RemoteActionCompatParcelizer.IapLogging, new String[]{"com.facebook.appevents.iap."});
                map.put(RemoteActionCompatParcelizer.Monitoring, new String[]{"com.facebook.internal.logging.monitor"});
            }
        }
    }

    private static boolean AudioAttributesCompatParcelizer(RemoteActionCompatParcelizer p0) {
        return DefaultAnalyticsCollectorExternalSyntheticLambda63.AudioAttributesCompatParcelizer(p0.AudioAttributesCompatParcelizer(), lambdaonMediaMetadataChanged48.write(), RemoteActionCompatParcelizer(p0));
    }

    private static boolean RemoteActionCompatParcelizer(RemoteActionCompatParcelizer p0) {
        switch (DefaultAnalyticsCollectorExternalSyntheticLambda60.RemoteActionCompatParcelizer[p0.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
                return false;
            default:
                return true;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b!\b\u0086\u0001\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bR\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0011\u0010\u000e\u001a\u00020\u00008G¢\u0006\u0006\u001a\u0004\b\f\u0010\rj\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0007j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\u000ej\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'"}, d2 = {"Lo/DefaultAnalyticsCollectorExternalSyntheticLambda58$RemoteActionCompatParcelizer;", "", "", "p0", "<init>", "(Ljava/lang/String;II)V", "", "AudioAttributesCompatParcelizer", "()Ljava/lang/String;", "toString", "onPlayFromSearch", "I", "IconCompatParcelizer", "()Lo/DefaultAnalyticsCollectorExternalSyntheticLambda58$RemoteActionCompatParcelizer;", "read", "onPrepare", "MediaBrowserCompatItemReceiver", "write", "MediaBrowserCompatCustomActionResultReceiver", "onMediaButtonEvent", "onPlay", "onPlayFromUri", "onCommand", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "RatingCompat", "handleMediaPlayPauseIfPendingOnHandler", "onPause", "MediaBrowserCompatSearchResultReceiver", "MediaBrowserCompatMediaItem", "MediaDescriptionCompat", "AudioAttributesImplBaseParcelizer", "AudioAttributesImplApi21Parcelizer", "onPrepareFromSearch", "AudioAttributesImplApi26Parcelizer", "onCustomAction", "onAddQueueItem", "RemoteActionCompatParcelizer", "MediaMetadataCompat", "onPlayFromMediaId", "onFastForward"}, k = 1, mv = {1, 4, 0})
    public enum RemoteActionCompatParcelizer {
        Unknown(-1),
        Core(0),
        AppEvents(C.DEFAULT_BUFFER_SEGMENT_SIZE),
        CodelessEvents(65792),
        RestrictiveDataFiltering(66048),
        AAM(66304),
        PrivacyProtection(66560),
        SuggestedEvents(66561),
        IntelligentIntegrity(66562),
        ModelRequest(66563),
        EventDeactivation(66816),
        OnDeviceEventProcessing(67072),
        OnDevicePostInstallEventProcessing(67073),
        IapLogging(67328),
        IapLoggingLib2(67329),
        Instrument(131072),
        CrashReport(131328),
        CrashShield(131329),
        ThreadCheck(131330),
        ErrorReport(131584),
        AnrReport(131840),
        Monitoring(196608),
        Login(BlockingViewModel_HiltModulesKeyModule.OKHTTP_CLIENT_WINDOW_SIZE),
        ChromeCustomTabsPrefetching(R.attr.theme),
        IgnoreAppSwitchToLoggedOut(R.id.background),
        Share(33554432),
        Places(50331648);


        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: onPlayFromSearch, reason: from kotlin metadata */
        private final int IconCompatParcelizer;

        RemoteActionCompatParcelizer(int i) {
            this.IconCompatParcelizer = i;
        }

        @Override // java.lang.Enum
        public final String toString() {
            switch (DefaultAnalyticsCollectorExternalSyntheticLambda59.IconCompatParcelizer[ordinal()]) {
                case 1:
                    return "CoreKit";
                case 2:
                    return "AppEvents";
                case 3:
                    return "CodelessEvents";
                case 4:
                    return "RestrictiveDataFiltering";
                case 5:
                    return "Instrument";
                case 6:
                    return "CrashReport";
                case 7:
                    return "CrashShield";
                case 8:
                    return "ThreadCheck";
                case 9:
                    return "ErrorReport";
                case 10:
                    return "AnrReport";
                case 11:
                    return "AAM";
                case 12:
                    return "PrivacyProtection";
                case 13:
                    return "SuggestedEvents";
                case 14:
                    return "IntelligentIntegrity";
                case 15:
                    return "ModelRequest";
                case 16:
                    return "EventDeactivation";
                case 17:
                    return "OnDeviceEventProcessing";
                case 18:
                    return "OnDevicePostInstallEventProcessing";
                case 19:
                    return "IAPLogging";
                case 20:
                    return "IAPLoggingLib2";
                case 21:
                    return "Monitoring";
                case 22:
                    return "LoginKit";
                case 23:
                    return "ChromeCustomTabsPrefetching";
                case 24:
                    return "IgnoreAppSwitchToLoggedOut";
                case 25:
                    return "ShareKit";
                case 26:
                    return "PlacesKit";
                default:
                    return "unknown";
            }
        }

        public final String AudioAttributesCompatParcelizer() {
            return "FBSDKFeature".concat(String.valueOf(this));
        }

        public final RemoteActionCompatParcelizer IconCompatParcelizer() {
            int i = this.IconCompatParcelizer;
            if ((i & 255) > 0) {
                return Companion.read(i & (-256));
            }
            if ((65280 & i) > 0) {
                return Companion.read(i & (-65536));
            }
            if ((16711680 & i) > 0) {
                return Companion.read(i & (-16777216));
            }
            return Companion.read(0);
        }

        /* JADX INFO: renamed from: o.DefaultAnalyticsCollectorExternalSyntheticLambda58$RemoteActionCompatParcelizer$IconCompatParcelizer, reason: from kotlin metadata */
        /* JADX INFO: loaded from: classes2.dex */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/DefaultAnalyticsCollectorExternalSyntheticLambda58$RemoteActionCompatParcelizer$IconCompatParcelizer;", "", "<init>", "()V", "", "p0", "Lo/DefaultAnalyticsCollectorExternalSyntheticLambda58$RemoteActionCompatParcelizer;", "read", "(I)Lo/DefaultAnalyticsCollectorExternalSyntheticLambda58$RemoteActionCompatParcelizer;"}, k = 1, mv = {1, 4, 0})
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
                this();
            }

            public static RemoteActionCompatParcelizer read(int p0) {
                for (RemoteActionCompatParcelizer remoteActionCompatParcelizer : RemoteActionCompatParcelizer.values()) {
                    if (remoteActionCompatParcelizer.IconCompatParcelizer == p0) {
                        return remoteActionCompatParcelizer;
                    }
                }
                return RemoteActionCompatParcelizer.Unknown;
            }
        }
    }
}
