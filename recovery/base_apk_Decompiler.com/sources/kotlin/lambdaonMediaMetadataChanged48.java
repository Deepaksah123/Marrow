package kotlin;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.facebook.AccessToken;
import com.facebook.GraphRequest;
import com.facebook.Profile;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import java.io.File;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.DefaultAnalyticsCollectorExternalSyntheticLambda3;
import kotlin.DefaultAnalyticsCollectorExternalSyntheticLambda58;
import org.apache.commons.compress.archivers.tar.TarConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class lambdaonMediaMetadataChanged48 {
    private static volatile String AudioAttributesCompatParcelizer;
    private static volatile String AudioAttributesImplApi21Parcelizer;
    private static Executor AudioAttributesImplApi26Parcelizer;
    private static int AudioAttributesImplBaseParcelizer;
    private static Context IconCompatParcelizer;
    private static volatile Boolean MediaBrowserCompatCustomActionResultReceiver;
    private static volatile String MediaBrowserCompatItemReceiver;
    private static String MediaBrowserCompatMediaItem;
    private static volatile boolean MediaBrowserCompatSearchResultReceiver;
    private static final AtomicBoolean MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private static volatile String MediaDescriptionCompat;
    private static final HashSet<lambdaonPositionDiscontinuity43> MediaMetadataCompat;
    private static write RatingCompat;
    public static boolean RemoteActionCompatParcelizer;
    private static Boolean handleMediaPlayPauseIfPendingOnHandler;
    private static AtomicLong onAddQueueItem;
    private static int onCommand;
    private static long onCustomAction;
    public static boolean read;
    private static final Object write;
    private static final byte[] $$a = {TarConstants.LF_SYMLINK, 124, -128, 125};
    private static final int $$b = 229;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onFastForward = 0;
    private static int onMediaButtonEvent = 1;
    private static int onPlayFromMediaId = 1;

    public interface IconCompatParcelizer {
    }

    public interface write {
        GraphRequest read(String str, JSONObject jSONObject);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(int r5, int r6, int r7) {
        /*
            int r7 = r7 * 4
            int r0 = r7 + 1
            byte[] r1 = kotlin.lambdaonMediaMetadataChanged48.$$a
            int r5 = r5 * 4
            int r5 = 4 - r5
            int r6 = r6 * 4
            int r6 = r6 + 104
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L17
            r4 = r6
            r6 = r7
            r3 = r2
            goto L27
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L23
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L23:
            int r3 = r3 + 1
            r4 = r1[r5]
        L27:
            int r5 = r5 + 1
            int r6 = r6 + r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.lambdaonMediaMetadataChanged48.$$c(int, int, int):java.lang.String");
    }

    public static /* synthetic */ Object AudioAttributesCompatParcelizer(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i3;
        int i8 = ~(i7 | i6);
        int i9 = ~(i7 | i2);
        int i10 = i8 | i9;
        int i11 = ~i6;
        int i12 = (~((~i2) | i7 | i6)) | (~(i7 | i11 | i2));
        int i13 = i9 | (~(i11 | i3));
        int i14 = i3 + i6 + i4 + ((-1696018712) * i) + (2108813197 * i5);
        int i15 = i14 * i14;
        int i16 = ((212195308 * i3) - 2121662464) + (1221732374 * i6) + (1009537066 * i10) + (i12 * (-504768533)) + ((-504768533) * i13) + (716963840 * i4) + (39845888 * i) + (227278848 * i5) + ((-1705377792) * i15);
        int i17 = ((i3 * 362004572) - 1408384217) + (i6 * 362004174) + (i10 * (-398)) + (i12 * 199) + (i13 * 199) + (i4 * 362004373) + (i * (-1290304248)) + (i5 * 155295761) + (i15 * (-60686336));
        int i18 = i16 + (i17 * i17 * (-1680474112));
        return i18 != 1 ? i18 != 2 ? i18 != 3 ? i18 != 4 ? RemoteActionCompatParcelizer(objArr) : write(objArr) : IconCompatParcelizer(objArr) : read(objArr) : AudioAttributesCompatParcelizer(objArr);
    }

    private static void a(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        buildSetRequirementsIntent buildsetrequirementsintent = new buildSetRequirementsIntent();
        char[] cArrAudioAttributesCompatParcelizer = buildSetRequirementsIntent.AudioAttributesCompatParcelizer(onCustomAction ^ 4027965449757546139L, cArr, i);
        buildsetrequirementsintent.write = 4;
        int i3 = $10 + 13;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (buildsetrequirementsintent.write < cArrAudioAttributesCompatParcelizer.length) {
            int i5 = $10 + 85;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            buildsetrequirementsintent.read = buildsetrequirementsintent.write - 4;
            int i7 = buildsetrequirementsintent.write;
            try {
                Object[] objArr2 = {Long.valueOf(cArrAudioAttributesCompatParcelizer[buildsetrequirementsintent.write] ^ cArrAudioAttributesCompatParcelizer[buildsetrequirementsintent.write % 4]), Long.valueOf(buildsetrequirementsintent.read), Long.valueOf(onCustomAction)};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-2134927292);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 12424 - ExpandableListView.getPackedPositionGroup(0L), 19 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), -17408815, false, CmcdHeadersFactory.OBJECT_TYPE_INIT_SEGMENT, new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrAudioAttributesCompatParcelizer[i7] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {buildsetrequirementsintent, buildsetrequirementsintent};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(141570176);
                if (objRemoteActionCompatParcelizer2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) Color.blue(0), 1868 - (ViewConfiguration.getKeyRepeatDelay() >> 16), KeyEvent.getDeadChar(0, 0) + 10, 1983509525, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArrAudioAttributesCompatParcelizer, 4, cArrAudioAttributesCompatParcelizer.length - 4);
    }

    static /* synthetic */ Context IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = onFastForward;
        int i3 = i2 + 33;
        onMediaButtonEvent = i3 % 128;
        int i4 = i3 % 2;
        Context context = IconCompatParcelizer;
        int i5 = i2 + 63;
        onMediaButtonEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return context;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object read(Object[] objArr) {
        int i = 2 % 2;
        int i2 = onFastForward + 85;
        onMediaButtonEvent = i2 % 128;
        int i3 = i2 % 2;
        String str = MediaBrowserCompatItemReceiver;
        int i4 = onMediaButtonEvent + 63;
        onFastForward = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        onCommand = 0;
        onCustomAction();
        MediaMetadataCompat = new HashSet<>(Arrays.asList(lambdaonPositionDiscontinuity43.DEVELOPER_ERRORS));
        MediaDescriptionCompat = "facebook.com";
        onAddQueueItem = new AtomicLong(65536L);
        MediaBrowserCompatSearchResultReceiver = false;
        AudioAttributesImplBaseParcelizer = 64206;
        write = new Object();
        MediaBrowserCompatMediaItem = DefaultAnalyticsCollectorExternalSyntheticLambda7.RemoteActionCompatParcelizer();
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = new AtomicBoolean(false);
        handleMediaPlayPauseIfPendingOnHandler = Boolean.FALSE;
        RatingCompat = new write() { // from class: o.lambdaonMediaMetadataChanged48.4
            @Override // o.lambdaonMediaMetadataChanged48.write
            public final GraphRequest read(String str, JSONObject jSONObject) {
                return GraphRequest.IconCompatParcelizer(null, str, jSONObject, null);
            }
        };
        int i = onPlayFromMediaId + 25;
        onCommand = i % 128;
        int i2 = i % 2;
    }

    @Deprecated
    public static void RemoteActionCompatParcelizer(Context context) {
        synchronized (lambdaonMediaMetadataChanged48.class) {
            AudioAttributesCompatParcelizer(context);
        }
    }

    @Deprecated
    private static void AudioAttributesCompatParcelizer(Context context) {
        synchronized (lambdaonMediaMetadataChanged48.class) {
            AtomicBoolean atomicBoolean = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
            if (atomicBoolean.get()) {
                return;
            }
            DefaultAnalyticsCollectorExternalSyntheticLambda8.IconCompatParcelizer(context, "applicationContext");
            DefaultAnalyticsCollectorExternalSyntheticLambda8.IconCompatParcelizer(context);
            DefaultAnalyticsCollectorExternalSyntheticLambda8.read(context);
            IconCompatParcelizer = context.getApplicationContext();
            lambdaonVideoDisabled18.IconCompatParcelizer(context);
            read(IconCompatParcelizer);
            if (DefaultAnalyticsCollectorMediaPeriodQueueTracker.IconCompatParcelizer(MediaBrowserCompatItemReceiver)) {
                throw new lambdaonMetadata50("A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk.");
            }
            atomicBoolean.set(true);
            int iAudioAttributesCompatParcelizer = lambdaonAudioUnderrun7.AudioAttributesCompatParcelizer();
            int iAudioAttributesCompatParcelizer2 = lambdaonAudioUnderrun7.AudioAttributesCompatParcelizer();
            if (((Boolean) AudioAttributesCompatParcelizer(lambdaonAudioUnderrun7.AudioAttributesCompatParcelizer(), iAudioAttributesCompatParcelizer, -845179940, iAudioAttributesCompatParcelizer2, new Object[0], lambdaonAudioUnderrun7.AudioAttributesCompatParcelizer(), 845179943)).booleanValue()) {
                handleMediaPlayPauseIfPendingOnHandler();
            }
            if ((IconCompatParcelizer instanceof Application) && lambdaonRepeatModeChanged39.AudioAttributesImplApi21Parcelizer()) {
                DefaultAnalyticsCollectorExternalSyntheticLambda28.AudioAttributesCompatParcelizer((Application) IconCompatParcelizer, MediaBrowserCompatItemReceiver);
            }
            DefaultAnalyticsCollectorExternalSyntheticLambda61.MediaBrowserCompatCustomActionResultReceiver();
            DefaultAnalyticsCollectorExternalSyntheticLambda64.IconCompatParcelizer();
            DefaultAnalyticsCollectorExternalSyntheticLambda54.write(IconCompatParcelizer);
            new DefaultAnalyticsCollectorExternalSyntheticLambda65(new Callable<File>() { // from class: o.lambdaonMediaMetadataChanged48.2
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ File call() throws Exception {
                    return IconCompatParcelizer();
                }

                private static File IconCompatParcelizer() throws Exception {
                    return lambdaonMediaMetadataChanged48.IconCompatParcelizer().getCacheDir();
                }
            });
            DefaultAnalyticsCollectorExternalSyntheticLambda58.write(DefaultAnalyticsCollectorExternalSyntheticLambda58.RemoteActionCompatParcelizer.Instrument, new DefaultAnalyticsCollectorExternalSyntheticLambda58.write() { // from class: o.lambdaonMediaMetadataChanged48.1
                @Override // o.DefaultAnalyticsCollectorExternalSyntheticLambda58.write
                public final void RemoteActionCompatParcelizer(boolean z) {
                    if (z) {
                        getMediaPeriodIdTimeline.AudioAttributesCompatParcelizer();
                    }
                }
            });
            DefaultAnalyticsCollectorExternalSyntheticLambda58.write(DefaultAnalyticsCollectorExternalSyntheticLambda58.RemoteActionCompatParcelizer.AppEvents, new DefaultAnalyticsCollectorExternalSyntheticLambda58.write() { // from class: o.lambdaonMediaMetadataChanged48.5
                @Override // o.DefaultAnalyticsCollectorExternalSyntheticLambda58.write
                public final void RemoteActionCompatParcelizer(boolean z) {
                    if (z) {
                        lambdaonVideoDecoderReleased17.read();
                    }
                }
            });
            DefaultAnalyticsCollectorExternalSyntheticLambda58.write(DefaultAnalyticsCollectorExternalSyntheticLambda58.RemoteActionCompatParcelizer.ChromeCustomTabsPrefetching, new DefaultAnalyticsCollectorExternalSyntheticLambda58.write() { // from class: o.lambdaonMediaMetadataChanged48.3
                @Override // o.DefaultAnalyticsCollectorExternalSyntheticLambda58.write
                public final void RemoteActionCompatParcelizer(boolean z) {
                    if (z) {
                        lambdaonMediaMetadataChanged48.read = true;
                    }
                }
            });
            DefaultAnalyticsCollectorExternalSyntheticLambda58.write(DefaultAnalyticsCollectorExternalSyntheticLambda58.RemoteActionCompatParcelizer.IgnoreAppSwitchToLoggedOut, new DefaultAnalyticsCollectorExternalSyntheticLambda58.write() { // from class: o.lambdaonMediaMetadataChanged48.10
                @Override // o.DefaultAnalyticsCollectorExternalSyntheticLambda58.write
                public final void RemoteActionCompatParcelizer(boolean z) {
                    if (z) {
                        lambdaonMediaMetadataChanged48.RemoteActionCompatParcelizer = true;
                    }
                }
            });
            MediaBrowserCompatCustomActionResultReceiver().execute(new FutureTask(new Callable<Void>(null, context) { // from class: o.lambdaonMediaMetadataChanged48.8
                private /* synthetic */ Context IconCompatParcelizer;
                private /* synthetic */ IconCompatParcelizer read = null;

                {
                    this.IconCompatParcelizer = context;
                }

                /* JADX INFO: Access modifiers changed from: private */
                @Override // java.util.concurrent.Callable
                /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
                public Void call() throws Exception {
                    lambdaonLoadError26.read().AudioAttributesImplApi21Parcelizer();
                    lambdaonPlayerErrorChanged42.read().AudioAttributesCompatParcelizer();
                    if (AccessToken.write() && Profile.write() == null) {
                        Profile.IconCompatParcelizer();
                    }
                    Context contextIconCompatParcelizer = lambdaonMediaMetadataChanged48.IconCompatParcelizer();
                    int iAudioAttributesCompatParcelizer3 = lambdaonAudioUnderrun7.AudioAttributesCompatParcelizer();
                    int iAudioAttributesCompatParcelizer4 = lambdaonAudioUnderrun7.AudioAttributesCompatParcelizer();
                    lambdaonVideoDisabled18.AudioAttributesCompatParcelizer(contextIconCompatParcelizer, (String) lambdaonMediaMetadataChanged48.AudioAttributesCompatParcelizer(lambdaonAudioUnderrun7.AudioAttributesCompatParcelizer(), iAudioAttributesCompatParcelizer3, 1748010995, iAudioAttributesCompatParcelizer4, new Object[0], lambdaonAudioUnderrun7.AudioAttributesCompatParcelizer(), -1748010993));
                    lambdaonRepeatModeChanged39.AudioAttributesImplBaseParcelizer();
                    lambdaonVideoDisabled18.AudioAttributesCompatParcelizer(this.IconCompatParcelizer.getApplicationContext()).RemoteActionCompatParcelizer();
                    return null;
                }
            }));
        }
    }

    public static boolean onAddQueueItem() {
        boolean z;
        int i = 2 % 2;
        int i2 = onFastForward + 89;
        onMediaButtonEvent = i2 % 128;
        if (i2 % 2 == 0) {
            z = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.get();
            int i3 = 80 / 0;
        } else {
            z = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.get();
        }
        int i4 = onFastForward + 11;
        onMediaButtonEvent = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    public static boolean onCommand() {
        boolean zBooleanValue;
        synchronized (lambdaonMediaMetadataChanged48.class) {
            zBooleanValue = handleMediaPlayPauseIfPendingOnHandler.booleanValue();
        }
        return zBooleanValue;
    }

    private static void handleMediaPlayPauseIfPendingOnHandler() {
        int i = 2 % 2;
        int i2 = onFastForward + 81;
        onMediaButtonEvent = i2 % 128;
        if (i2 % 2 == 0) {
            handleMediaPlayPauseIfPendingOnHandler = Boolean.TRUE;
            throw null;
        }
        handleMediaPlayPauseIfPendingOnHandler = Boolean.TRUE;
        int i3 = onFastForward + 121;
        onMediaButtonEvent = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean write(kotlin.lambdaonPositionDiscontinuity43 r2) {
        /*
            java.util.HashSet<o.lambdaonPositionDiscontinuity43> r0 = kotlin.lambdaonMediaMetadataChanged48.MediaMetadataCompat
            monitor-enter(r0)
            boolean r1 = MediaMetadataCompat()     // Catch: java.lang.Throwable -> L14
            if (r1 == 0) goto L11
            boolean r2 = r0.contains(r2)     // Catch: java.lang.Throwable -> L14
            if (r2 == 0) goto L11
            r2 = 1
            goto L12
        L11:
            r2 = 0
        L12:
            monitor-exit(r0)
            return r2
        L14:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.lambdaonMediaMetadataChanged48.write(o.lambdaonPositionDiscontinuity43):boolean");
    }

    public static boolean MediaMetadataCompat() {
        boolean z;
        int i = 2 % 2;
        int i2 = onMediaButtonEvent + 73;
        onFastForward = i2 % 128;
        if (i2 % 2 != 0) {
            z = MediaBrowserCompatSearchResultReceiver;
            int i3 = 75 / 0;
        } else {
            z = MediaBrowserCompatSearchResultReceiver;
        }
        int i4 = onMediaButtonEvent + 11;
        onFastForward = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    public static boolean MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        int i = 2 % 2;
        int i2 = onMediaButtonEvent + 117;
        onFastForward = i2 % 128;
        int i3 = i2 % 2;
        return false;
    }

    public static Executor MediaBrowserCompatCustomActionResultReceiver() {
        synchronized (write) {
            if (AudioAttributesImplApi26Parcelizer == null) {
                AudioAttributesImplApi26Parcelizer = AsyncTask.THREAD_POOL_EXECUTOR;
            }
        }
        return AudioAttributesImplApi26Parcelizer;
    }

    public static String MediaBrowserCompatMediaItem() {
        int i = 2 % 2;
        int i2 = onFastForward + 75;
        onMediaButtonEvent = i2 % 128;
        if (i2 % 2 != 0) {
            AccessToken accessTokenAudioAttributesCompatParcelizer = AccessToken.AudioAttributesCompatParcelizer();
            String strAudioAttributesImplApi26Parcelizer = accessTokenAudioAttributesCompatParcelizer != null ? accessTokenAudioAttributesCompatParcelizer.getMediaBrowserCompatItemReceiver() : null;
            if (strAudioAttributesImplApi26Parcelizer == null) {
                return MediaDescriptionCompat;
            }
            if (strAudioAttributesImplApi26Parcelizer.equals("gaming")) {
                int i3 = onMediaButtonEvent + 103;
                onFastForward = i3 % 128;
                if (i3 % 2 == 0) {
                    return MediaDescriptionCompat.replace("facebook.com", "fb.gg");
                }
                int i4 = 2 / 0;
                return MediaDescriptionCompat.replace("facebook.com", "fb.gg");
            }
            return MediaDescriptionCompat;
        }
        AccessToken.AudioAttributesCompatParcelizer();
        throw null;
    }

    public static Context AudioAttributesCompatParcelizer() {
        int i = 2 % 2;
        int i2 = onFastForward + 17;
        onMediaButtonEvent = i2 % 128;
        if (i2 % 2 != 0) {
            DefaultAnalyticsCollectorExternalSyntheticLambda8.write();
            return IconCompatParcelizer;
        }
        DefaultAnalyticsCollectorExternalSyntheticLambda8.write();
        throw null;
    }

    private static /* synthetic */ Object AudioAttributesCompatParcelizer(Object[] objArr) {
        int i = 2 % 2;
        int i2 = onMediaButtonEvent + 31;
        onFastForward = i2 % 128;
        if (i2 % 2 != 0) {
            new Object[0][0] = MediaBrowserCompatMediaItem;
        } else {
            new Object[]{MediaBrowserCompatMediaItem};
        }
        DefaultAnalyticsCollectorMediaPeriodQueueTracker.AudioAttributesImplApi26Parcelizer();
        String str = MediaBrowserCompatMediaItem;
        int i3 = onFastForward + 47;
        onMediaButtonEvent = i3 % 128;
        if (i3 % 2 != 0) {
            return str;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004e A[Catch: all -> 0x005a, TRY_ENTER, TryCatch #0 {all -> 0x005a, blocks: (B:4:0x000b, B:8:0x002e, B:17:0x004e, B:18:0x0056, B:11:0x0039), top: B:24:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0056 A[Catch: all -> 0x005a, TRY_LEAVE, TryCatch #0 {all -> 0x005a, blocks: (B:4:0x000b, B:8:0x002e, B:17:0x004e, B:18:0x0056, B:11:0x0039), top: B:24:0x000b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void write(android.content.Context r4, final java.lang.String r5) {
        /*
            r0 = 2
            int r1 = r0 % r0
            java.lang.Class<o.lambdaonMediaMetadataChanged48> r1 = kotlin.lambdaonMediaMetadataChanged48.class
            boolean r2 = kotlin.getMinWindowSequenceNumber.IconCompatParcelizer(r1)
            if (r2 != 0) goto L5e
            android.content.Context r4 = r4.getApplicationContext()     // Catch: java.lang.Throwable -> L5a
            java.util.concurrent.Executor r2 = MediaBrowserCompatCustomActionResultReceiver()     // Catch: java.lang.Throwable -> L5a
            o.lambdaonMediaMetadataChanged48$7 r3 = new o.lambdaonMediaMetadataChanged48$7     // Catch: java.lang.Throwable -> L5a
            r3.<init>()     // Catch: java.lang.Throwable -> L5a
            r2.execute(r3)     // Catch: java.lang.Throwable -> L5a
            o.DefaultAnalyticsCollectorExternalSyntheticLambda58$RemoteActionCompatParcelizer r4 = o.DefaultAnalyticsCollectorExternalSyntheticLambda58.RemoteActionCompatParcelizer.OnDeviceEventProcessing     // Catch: java.lang.Throwable -> L5a
            boolean r4 = kotlin.DefaultAnalyticsCollectorExternalSyntheticLambda58.IconCompatParcelizer(r4)     // Catch: java.lang.Throwable -> L5a
            if (r4 == 0) goto L5e
            int r4 = kotlin.lambdaonMediaMetadataChanged48.onMediaButtonEvent
            int r4 = r4 + 7
            int r2 = r4 % 128
            kotlin.lambdaonMediaMetadataChanged48.onFastForward = r2
            int r4 = r4 % r0
            if (r4 == 0) goto L39
            boolean r4 = kotlin.DefaultAnalyticsCollectorExternalSyntheticLambda43.IconCompatParcelizer()     // Catch: java.lang.Throwable -> L5a
            r2 = 22
            int r2 = r2 / 0
            if (r4 == 0) goto L5e
            goto L41
        L39:
            boolean r4 = kotlin.DefaultAnalyticsCollectorExternalSyntheticLambda43.IconCompatParcelizer()     // Catch: java.lang.Throwable -> L5a
            r2 = 1
            if (r4 == r2) goto L41
            goto L5e
        L41:
            int r4 = kotlin.lambdaonMediaMetadataChanged48.onFastForward
            int r4 = r4 + 119
            int r2 = r4 % 128
            kotlin.lambdaonMediaMetadataChanged48.onMediaButtonEvent = r2
            int r4 = r4 % r0
            java.lang.String r0 = "com.facebook.sdk.attributionTracking"
            if (r4 != 0) goto L56
            kotlin.DefaultAnalyticsCollectorExternalSyntheticLambda43.read(r5, r0)     // Catch: java.lang.Throwable -> L5a
            r4 = 89
            int r4 = r4 / 0
            goto L5e
        L56:
            kotlin.DefaultAnalyticsCollectorExternalSyntheticLambda43.read(r5, r0)     // Catch: java.lang.Throwable -> L5a
            goto L5e
        L5a:
            r4 = move-exception
            kotlin.getMinWindowSequenceNumber.read(r4, r1)
        L5e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.lambdaonMediaMetadataChanged48.write(android.content.Context, java.lang.String):void");
    }

    static void RemoteActionCompatParcelizer(Context context, String str) {
        int i = 2 % 2;
        int i2 = onMediaButtonEvent + 53;
        onFastForward = i2 % 128;
        int i3 = i2 % 2;
        if (!getMinWindowSequenceNumber.IconCompatParcelizer(lambdaonMediaMetadataChanged48.class)) {
            try {
                try {
                    if (context == null || str == null) {
                        throw new IllegalArgumentException("Both context and applicationId must be non-null");
                    }
                    DefaultAnalyticsCollectorExternalSyntheticLambda51 defaultAnalyticsCollectorExternalSyntheticLambda51Write = DefaultAnalyticsCollectorExternalSyntheticLambda51.write(context);
                    SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.sdk.attributionTracking", 0);
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append("ping");
                    String string = sb.toString();
                    long j = sharedPreferences.getLong(string, 0L);
                    try {
                        JSONObject jSONObject = DefaultAnalyticsCollectorExternalSyntheticLambda3.read(DefaultAnalyticsCollectorExternalSyntheticLambda3.RemoteActionCompatParcelizer.MOBILE_INSTALL_EVENT, defaultAnalyticsCollectorExternalSyntheticLambda51Write, lambdaonVideoDisabled18.IconCompatParcelizer(context), IconCompatParcelizer(context), context);
                        GraphRequest graphRequest = RatingCompat.read(String.format("%s/activities", str), jSONObject);
                        if (j == 0 && graphRequest.MediaBrowserCompatCustomActionResultReceiver().getWrite() == null) {
                            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                            editorEdit.putLong(string, System.currentTimeMillis());
                            editorEdit.apply();
                            return;
                        }
                    } catch (JSONException e) {
                        throw new lambdaonMetadata50("An error occurred while publishing install.", e);
                    }
                } catch (Exception e2) {
                    DefaultAnalyticsCollectorMediaPeriodQueueTracker.IconCompatParcelizer("Facebook-publish", e2);
                }
            } catch (Throwable th) {
                getMinWindowSequenceNumber.read(th, lambdaonMediaMetadataChanged48.class);
                return;
            }
        }
        int i4 = onFastForward + 5;
        onMediaButtonEvent = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static String RatingCompat() {
        int i = 2 % 2;
        int i2 = onFastForward;
        int i3 = i2 + 111;
        onMediaButtonEvent = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 43;
        onMediaButtonEvent = i5 % 128;
        int i6 = i5 % 2;
        return "11.1.0";
    }

    public static boolean IconCompatParcelizer(Context context) {
        int i = 2 % 2;
        int i2 = onMediaButtonEvent + 105;
        onFastForward = i2 % 128;
        if (i2 % 2 != 0) {
            DefaultAnalyticsCollectorExternalSyntheticLambda8.write();
        } else {
            DefaultAnalyticsCollectorExternalSyntheticLambda8.write();
        }
        return context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("limitEventUsage", false);
    }

    public static long MediaDescriptionCompat() {
        int i = 2 % 2;
        int i2 = onFastForward + 11;
        onMediaButtonEvent = i2 % 128;
        int i3 = i2 % 2;
        DefaultAnalyticsCollectorExternalSyntheticLambda8.write();
        long j = onAddQueueItem.get();
        int i4 = onMediaButtonEvent + 97;
        onFastForward = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 83 / 0;
        }
        return j;
    }

    private static void read(Context context) throws Throwable {
        int i = 2 % 2;
        if (context != null) {
            int i2 = onMediaButtonEvent + 53;
            onFastForward = i2 % 128;
            int i3 = i2 % 2;
            try {
                ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
                if (applicationInfo == null || ((PackageItemInfo) applicationInfo).metaData == null) {
                    return;
                }
                if (MediaBrowserCompatItemReceiver == null) {
                    Object obj = ((PackageItemInfo) applicationInfo).metaData.get("com.facebook.sdk.ApplicationId");
                    if (obj instanceof String) {
                        String str = (String) obj;
                        if (!str.toLowerCase(Locale.ROOT).startsWith("fb")) {
                            MediaBrowserCompatItemReceiver = str;
                        } else {
                            MediaBrowserCompatItemReceiver = str.substring(2);
                        }
                    } else if (obj instanceof Number) {
                        throw new lambdaonMetadata50("App Ids cannot be directly placed in the manifest.They must be prefixed by 'fb' or be placed in the string resource file.");
                    }
                }
                if (AudioAttributesImplApi21Parcelizer == null) {
                    int i4 = onMediaButtonEvent + 9;
                    onFastForward = i4 % 128;
                    if (i4 % 2 != 0) {
                        AudioAttributesImplApi21Parcelizer = ((PackageItemInfo) applicationInfo).metaData.getString("com.facebook.sdk.ApplicationName");
                        throw null;
                    }
                    AudioAttributesImplApi21Parcelizer = ((PackageItemInfo) applicationInfo).metaData.getString("com.facebook.sdk.ApplicationName");
                }
                if (AudioAttributesCompatParcelizer == null) {
                    int i5 = onFastForward + 105;
                    onMediaButtonEvent = i5 % 128;
                    int i6 = i5 % 2;
                    Bundle bundle = ((PackageItemInfo) applicationInfo).metaData;
                    Object[] objArr = new Object[1];
                    a(1 - (Process.myPid() >> 22), new char[]{15790, 59957, 15819, 12734, 62938, 3788, 9689, 31514, 17328, 30642, 35999, 42978, 49552, 61921, 2741, 8583, 18200, 28680, 34885, 41561, 50477, 62015, 1563, 11306, 19223, 31845, 33918, 44639, 51351, 65216, 1478, 10374, 20136, 30911, 33735, 43771}, objArr);
                    AudioAttributesCompatParcelizer = ((String) objArr[0]).intern();
                }
                if (AudioAttributesImplBaseParcelizer == 64206) {
                    int i7 = onMediaButtonEvent + 73;
                    onFastForward = i7 % 128;
                    if (i7 % 2 != 0) {
                        AudioAttributesImplBaseParcelizer = ((PackageItemInfo) applicationInfo).metaData.getInt("com.facebook.sdk.CallbackOffset", 64206);
                        int i8 = 15 / 0;
                    } else {
                        AudioAttributesImplBaseParcelizer = ((PackageItemInfo) applicationInfo).metaData.getInt("com.facebook.sdk.CallbackOffset", 64206);
                    }
                }
                if (MediaBrowserCompatCustomActionResultReceiver == null) {
                    MediaBrowserCompatCustomActionResultReceiver = Boolean.valueOf(((PackageItemInfo) applicationInfo).metaData.getBoolean("com.facebook.sdk.CodelessDebugLogEnabled", false));
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
    }

    public static String write() {
        int i = 2 % 2;
        int i2 = onFastForward + 37;
        onMediaButtonEvent = i2 % 128;
        if (i2 % 2 != 0) {
            DefaultAnalyticsCollectorExternalSyntheticLambda8.write();
            String str = MediaBrowserCompatItemReceiver;
            int i3 = onMediaButtonEvent + 11;
            onFastForward = i3 % 128;
            int i4 = i3 % 2;
            return str;
        }
        DefaultAnalyticsCollectorExternalSyntheticLambda8.write();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object RemoteActionCompatParcelizer(Object[] objArr) {
        int i = 2 % 2;
        int i2 = onFastForward + 61;
        onMediaButtonEvent = i2 % 128;
        int i3 = i2 % 2;
        DefaultAnalyticsCollectorExternalSyntheticLambda8.write();
        String str = AudioAttributesImplApi21Parcelizer;
        int i4 = onMediaButtonEvent + 81;
        onFastForward = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 72 / 0;
        }
        return str;
    }

    public static String AudioAttributesImplApi21Parcelizer() {
        int i = 2 % 2;
        int i2 = onMediaButtonEvent + 105;
        onFastForward = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            DefaultAnalyticsCollectorExternalSyntheticLambda8.write();
            String str = AudioAttributesCompatParcelizer;
            int i3 = onFastForward + 103;
            onMediaButtonEvent = i3 % 128;
            if (i3 % 2 != 0) {
                return str;
            }
            obj.hashCode();
            throw null;
        }
        DefaultAnalyticsCollectorExternalSyntheticLambda8.write();
        throw null;
    }

    private static /* synthetic */ Object IconCompatParcelizer(Object[] objArr) {
        int i = 2 % 2;
        int i2 = onFastForward + 69;
        onMediaButtonEvent = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            lambdaonRepeatModeChanged39.IconCompatParcelizer();
            obj.hashCode();
            throw null;
        }
        boolean zIconCompatParcelizer = lambdaonRepeatModeChanged39.IconCompatParcelizer();
        int i3 = onFastForward + 61;
        onMediaButtonEvent = i3 % 128;
        if (i3 % 2 != 0) {
            return Boolean.valueOf(zIconCompatParcelizer);
        }
        throw null;
    }

    public static boolean AudioAttributesImplApi26Parcelizer() {
        int i = 2 % 2;
        int i2 = onMediaButtonEvent + 7;
        onFastForward = i2 % 128;
        int i3 = i2 % 2;
        boolean zAudioAttributesImplApi21Parcelizer = lambdaonRepeatModeChanged39.AudioAttributesImplApi21Parcelizer();
        if (i3 != 0) {
            int i4 = 43 / 0;
        }
        return zAudioAttributesImplApi21Parcelizer;
    }

    private static /* synthetic */ Object write(Object[] objArr) {
        int i = 2 % 2;
        int i2 = onFastForward + 51;
        onMediaButtonEvent = i2 % 128;
        int i3 = i2 % 2;
        boolean zAudioAttributesImplApi26Parcelizer = lambdaonRepeatModeChanged39.AudioAttributesImplApi26Parcelizer();
        int i4 = onFastForward + 115;
        onMediaButtonEvent = i4 % 128;
        int i5 = i4 % 2;
        return Boolean.valueOf(zAudioAttributesImplApi26Parcelizer);
    }

    public static boolean RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = onMediaButtonEvent + 115;
        onFastForward = i2 % 128;
        if (i2 % 2 != 0) {
            lambdaonRepeatModeChanged39.read();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean z = lambdaonRepeatModeChanged39.read();
        int i3 = onFastForward + 21;
        onMediaButtonEvent = i3 % 128;
        int i4 = i3 % 2;
        return z;
    }

    static /* synthetic */ String read() {
        int iAudioAttributesCompatParcelizer = lambdaonAudioUnderrun7.AudioAttributesCompatParcelizer();
        int iAudioAttributesCompatParcelizer2 = lambdaonAudioUnderrun7.AudioAttributesCompatParcelizer();
        return (String) AudioAttributesCompatParcelizer(lambdaonAudioUnderrun7.AudioAttributesCompatParcelizer(), iAudioAttributesCompatParcelizer, 1748010995, iAudioAttributesCompatParcelizer2, new Object[0], lambdaonAudioUnderrun7.AudioAttributesCompatParcelizer(), -1748010993);
    }

    public static String MediaBrowserCompatItemReceiver() {
        int iAudioAttributesCompatParcelizer = lambdaonAudioUnderrun7.AudioAttributesCompatParcelizer();
        int iAudioAttributesCompatParcelizer2 = lambdaonAudioUnderrun7.AudioAttributesCompatParcelizer();
        return (String) AudioAttributesCompatParcelizer(lambdaonAudioUnderrun7.AudioAttributesCompatParcelizer(), iAudioAttributesCompatParcelizer, 141222384, iAudioAttributesCompatParcelizer2, new Object[0], lambdaonAudioUnderrun7.AudioAttributesCompatParcelizer(), -141222384);
    }

    private static boolean onMediaButtonEvent() {
        int iAudioAttributesCompatParcelizer = lambdaonAudioUnderrun7.AudioAttributesCompatParcelizer();
        int iAudioAttributesCompatParcelizer2 = lambdaonAudioUnderrun7.AudioAttributesCompatParcelizer();
        return ((Boolean) AudioAttributesCompatParcelizer(lambdaonAudioUnderrun7.AudioAttributesCompatParcelizer(), iAudioAttributesCompatParcelizer, -845179940, iAudioAttributesCompatParcelizer2, new Object[0], lambdaonAudioUnderrun7.AudioAttributesCompatParcelizer(), 845179943)).booleanValue();
    }

    public static boolean AudioAttributesImplBaseParcelizer() {
        int iAudioAttributesCompatParcelizer = lambdaonAudioUnderrun7.AudioAttributesCompatParcelizer();
        int iAudioAttributesCompatParcelizer2 = lambdaonAudioUnderrun7.AudioAttributesCompatParcelizer();
        return ((Boolean) AudioAttributesCompatParcelizer(lambdaonAudioUnderrun7.AudioAttributesCompatParcelizer(), iAudioAttributesCompatParcelizer, 2134417389, iAudioAttributesCompatParcelizer2, new Object[0], lambdaonAudioUnderrun7.AudioAttributesCompatParcelizer(), -2134417385)).booleanValue();
    }

    public static String MediaBrowserCompatSearchResultReceiver() {
        int iAudioAttributesCompatParcelizer = lambdaonAudioUnderrun7.AudioAttributesCompatParcelizer();
        int iAudioAttributesCompatParcelizer2 = lambdaonAudioUnderrun7.AudioAttributesCompatParcelizer();
        return (String) AudioAttributesCompatParcelizer(lambdaonAudioUnderrun7.AudioAttributesCompatParcelizer(), iAudioAttributesCompatParcelizer, -2042269330, iAudioAttributesCompatParcelizer2, new Object[0], lambdaonAudioUnderrun7.AudioAttributesCompatParcelizer(), 2042269331);
    }

    static void onCustomAction() {
        onCustomAction = 511807909983176976L;
    }
}
