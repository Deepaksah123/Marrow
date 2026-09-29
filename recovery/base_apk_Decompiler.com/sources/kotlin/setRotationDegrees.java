package kotlin;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import com.bumptech.glide.Glide;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.moveToLast;
import kotlin.removeMediaSourcesInternal;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes2.dex */
public final class setRotationDegrees extends ContextWrapper {
    private static setTileCountHorizontal<?, ?> IconCompatParcelizer;
    private static long MediaBrowserCompatMediaItem;
    private static int MediaDescriptionCompat;
    private static char[] MediaMetadataCompat;
    private static int RatingCompat;
    private final setSubtitleConfigurations AudioAttributesCompatParcelizer;
    private final setDrmSessionForClearPeriods AudioAttributesImplApi21Parcelizer;
    private final int AudioAttributesImplApi26Parcelizer;
    private final Map<Class<?>, setTileCountHorizontal<?, ?>> AudioAttributesImplBaseParcelizer;
    private final MediaSourceList MediaBrowserCompatCustomActionResultReceiver;
    private final setPeakBitrate MediaBrowserCompatItemReceiver;
    private final removeMediaSourcesInternal.RemoteActionCompatParcelizer<setSelectionFlags> MediaBrowserCompatSearchResultReceiver;
    private final List<getUpdatedMediaPeriodInfo<Object>> RemoteActionCompatParcelizer;
    private getPlayingPeriod read;
    private final Glide.AudioAttributesCompatParcelizer write;
    private static final byte[] $$c = {85, -29, -43, -21};
    private static final int $$f = 76;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {TarConstants.LF_GNUTYPE_LONGLINK, 94, -43, -123, -17, -6, 0, -3, 17, 38, -32, -15, 13, -4, 3, 45, -42, 4, -1, 17, -17, 38, -15, -15, 17, 0, -5, 5, -15, 23, -11, 67, -55, 4, -13, TarConstants.LF_SYMLINK, -35, 7, 20, -17, 37, -49, 17, 2, 3, -11, 80, -81, 7, 11, -9, 17, -50, 19, -3, -4, TarConstants.LF_NORMAL, -49, 2, 4, 11, 9, -17, 3, 17, -12, TarConstants.LF_SYMLINK, -42, 4, -1, 17, -17, 38, -15, -15, 17, 0, -5, 5, -15, 23, -11};
    private static final int $$e = 51;
    private static final byte[] $$a = {11, -82, -98, -28, 20, 9, 3, 6, -14, -35, 35, 18, -10, 7, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, -12, -3, 4, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -42, 44, -14, 9, -26, 20, -1, 3, 5, 14, -16, 14, 27, 13, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -48, TarConstants.LF_CHR, -1, 2, -4, -1, -43, 35, 18, -10, 7, 0, -27, 20, 15, 3, -8, 9, -33, 20, -1, 3, 5, 14, -16, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 0, 32, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 5, 27, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -47, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14};
    private static final int $$b = 225;
    private static int MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = 0;
    private static int handleMediaPlayPauseIfPendingOnHandler = 1;
    private static int onCustomAction = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$g(byte r6, byte r7, short r8) {
        /*
            byte[] r0 = kotlin.setRotationDegrees.$$c
            int r7 = r7 * 4
            int r7 = r7 + 101
            int r6 = r6 * 4
            int r1 = r6 + 1
            int r8 = r8 * 3
            int r8 = 4 - r8
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L17
            r7 = r6
            r3 = r8
            r4 = r2
            goto L2a
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L25:
            r3 = r0[r8]
            r5 = r3
            r3 = r8
            r8 = r5
        L2a:
            int r8 = -r8
            int r7 = r7 + r8
            int r8 = r3 + 1
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setRotationDegrees.$$g(byte, byte, short):java.lang.String");
    }

    public static /* synthetic */ Object IconCompatParcelizer(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i6;
        int i8 = ~i4;
        int i9 = ~(i7 | i8);
        int i10 = ~(i2 | i4);
        int i11 = i9 | i10;
        int i12 = ~i2;
        int i13 = i9 | (~(i12 | i6)) | i10;
        int i14 = (~(i4 | i2 | i6)) | (~(i7 | i12 | i8));
        int i15 = i2 + i6 + i3 + (1322235619 * i5) + (440487356 * i);
        int i16 = i15 * i15;
        int i17 = (((-1102165783) * i2) - 2100690944) + ((-281430247) * i6) + ((-820735536) * i11) + (i13 * 410367768) + (410367768 * i14) + ((-691798016) * i3) + ((-942931968) * i5) + ((-1410334720) * i) + (1251606528 * i16);
        int i18 = (i2 * 157034417) + 1376579869 + (i6 * 157036385) + (i11 * (-1968)) + (i13 * 984) + (i14 * 984) + (i3 * 157035401) + (i5 * (-982187909)) + (i * (-1869533796)) + (i16 * (-899022848));
        return i17 + ((i18 * i18) * (-511311872)) != 1 ? AudioAttributesCompatParcelizer(objArr) : IconCompatParcelizer(objArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(byte r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = 191 - r8
            int r0 = 44 - r7
            byte[] r1 = kotlin.setRotationDegrees.$$a
            int r6 = r6 + 65
            byte[] r0 = new byte[r0]
            int r7 = 43 - r7
            r2 = 0
            if (r1 != 0) goto L13
            r4 = r7
            r6 = r8
            r3 = r2
            goto L28
        L13:
            r3 = r2
            r5 = r8
            r8 = r6
            r6 = r5
        L17:
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r7) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L24:
            r4 = r1[r6]
            int r3 = r3 + 1
        L28:
            int r8 = r8 + r4
            int r6 = r6 + 1
            int r8 = r8 + (-1)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setRotationDegrees.c(byte, byte, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void d(byte r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = kotlin.setRotationDegrees.$$d
            int r6 = r6 * 3
            int r6 = r6 + 22
            int r7 = r7 + 65
            int r8 = r8 * 3
            int r8 = 52 - r8
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r8
            r4 = r2
            goto L2a
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r6) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L24:
            r4 = r0[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2a:
            int r8 = -r8
            int r7 = r7 + r8
            int r7 = r7 + 2
            int r8 = r3 + 1
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setRotationDegrees.d(byte, short, short, java.lang.Object[]):void");
    }

    static {
        RatingCompat = 0;
        AudioAttributesImplBaseParcelizer();
        IconCompatParcelizer = new setLanguage();
        int i = onCustomAction + 73;
        RatingCompat = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public setRotationDegrees(Context context, setSubtitleConfigurations setsubtitleconfigurations, removeMediaSourcesInternal.RemoteActionCompatParcelizer<setSelectionFlags> remoteActionCompatParcelizer, MediaSourceList mediaSourceList, Glide.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, Map<Class<?>, setTileCountHorizontal<?, ?>> map, List<getUpdatedMediaPeriodInfo<Object>> list, setDrmSessionForClearPeriods setdrmsessionforclearperiods, setPeakBitrate setpeakbitrate, int i) {
        super(context.getApplicationContext());
        this.AudioAttributesCompatParcelizer = setsubtitleconfigurations;
        this.MediaBrowserCompatCustomActionResultReceiver = mediaSourceList;
        this.write = audioAttributesCompatParcelizer;
        this.RemoteActionCompatParcelizer = list;
        this.AudioAttributesImplBaseParcelizer = map;
        this.AudioAttributesImplApi21Parcelizer = setdrmsessionforclearperiods;
        this.MediaBrowserCompatItemReceiver = setpeakbitrate;
        this.AudioAttributesImplApi26Parcelizer = i;
        this.MediaBrowserCompatSearchResultReceiver = removeMediaSourcesInternal.write(remoteActionCompatParcelizer);
    }

    public final List<getUpdatedMediaPeriodInfo<Object>> read() {
        int i = 2 % 2;
        int i2 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        int i3 = i2 + 69;
        handleMediaPlayPauseIfPendingOnHandler = i3 % 128;
        int i4 = i3 % 2;
        List<getUpdatedMediaPeriodInfo<Object>> list = this.RemoteActionCompatParcelizer;
        int i5 = i2 + 45;
        handleMediaPlayPauseIfPendingOnHandler = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    private static /* synthetic */ Object AudioAttributesCompatParcelizer(Object[] objArr) {
        getPlayingPeriod getplayingperiod;
        setRotationDegrees setrotationdegrees = (setRotationDegrees) objArr[0];
        synchronized (setrotationdegrees) {
            if (setrotationdegrees.read == null) {
                setrotationdegrees.read = setrotationdegrees.write.RemoteActionCompatParcelizer().onSetPlaybackSpeed();
            }
            getplayingperiod = setrotationdegrees.read;
        }
        return getplayingperiod;
    }

    public final <T> setTileCountHorizontal<?, T> write(Class<T> cls) {
        int i = 2 % 2;
        setTileCountHorizontal<?, T> settilecounthorizontal = (setTileCountHorizontal) this.AudioAttributesImplBaseParcelizer.get(cls);
        if (settilecounthorizontal == null) {
            Iterator<Map.Entry<Class<?>, setTileCountHorizontal<?, ?>>> it = this.AudioAttributesImplBaseParcelizer.entrySet().iterator();
            while (it.hasNext()) {
                int i2 = handleMediaPlayPauseIfPendingOnHandler + 81;
                MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i2 % 128;
                if (i2 % 2 == 0) {
                    Map.Entry<Class<?>, setTileCountHorizontal<?, ?>> next = it.next();
                    if (next.getKey().isAssignableFrom(cls)) {
                        int i3 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 75;
                        handleMediaPlayPauseIfPendingOnHandler = i3 % 128;
                        if (i3 % 2 == 0) {
                            settilecounthorizontal = (setTileCountHorizontal) next.getValue();
                            int i4 = 68 / 0;
                        } else {
                            settilecounthorizontal = (setTileCountHorizontal) next.getValue();
                        }
                    }
                } else {
                    it.next().getKey().isAssignableFrom(cls);
                    throw null;
                }
            }
        }
        if (settilecounthorizontal == null) {
            int i5 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 109;
            handleMediaPlayPauseIfPendingOnHandler = i5 % 128;
            int i6 = i5 % 2;
            return (setTileCountHorizontal<?, T>) IconCompatParcelizer;
        }
        int i7 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 109;
        handleMediaPlayPauseIfPendingOnHandler = i7 % 128;
        int i8 = i7 % 2;
        return settilecounthorizontal;
    }

    private static void b(int i, char c, int i2, Object[] objArr) throws Throwable {
        int i3 = 2;
        int i4 = 2 % 2;
        DownloadService downloadService = new DownloadService();
        long[] jArr = new long[i];
        downloadService.write = 0;
        while (downloadService.write < i) {
            int i5 = $11 + 17;
            $10 = i5 % 128;
            if (i5 % i3 != 0) {
                int i6 = downloadService.write;
                try {
                    Object[] objArr2 = {Integer.valueOf(MediaMetadataCompat[i2 / i6])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(1659892375);
                    if (objRemoteActionCompatParcelizer == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objRemoteActionCompatParcelizer = startForeground.read((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 36622), 2341 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), TextUtils.lastIndexOf("", '0', 0, 0) + 29, 480654850, false, $$g(b, b2, b2), new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(MediaBrowserCompatMediaItem), Integer.valueOf(c)};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(955774634);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) TextUtils.getOffsetBefore("", 0), (-16767515) - Color.rgb(0, 0, 0), 26 - Color.argb(0, 0, 0, 0), 1186869823, false, "d", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i6] = ((Long) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {downloadService, downloadService};
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-452087292);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), TextUtils.lastIndexOf("", '0') + 23785, View.resolveSize(0, 0) + 33, -1690012015, false, "b", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i7 = downloadService.write;
                Object[] objArr5 = {Integer.valueOf(MediaMetadataCompat[i2 + i7])};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(1659892375);
                if (objRemoteActionCompatParcelizer4 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 36621), 2340 - Gravity.getAbsoluteGravity(0, 0), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 28, 480654850, false, $$g(b3, b4, b4), new Class[]{Integer.TYPE});
                }
                Object[] objArr6 = {Long.valueOf(((Long) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).longValue()), Long.valueOf(i7), Long.valueOf(MediaBrowserCompatMediaItem), Integer.valueOf(c)};
                Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(955774634);
                if (objRemoteActionCompatParcelizer5 == null) {
                    objRemoteActionCompatParcelizer5 = startForeground.read((char) Color.green(0), (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 9701, 26 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 1186869823, false, "d", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i7] = ((Long) ((Method) objRemoteActionCompatParcelizer5).invoke(null, objArr6)).longValue();
                Object[] objArr7 = {downloadService, downloadService};
                Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(-452087292);
                if (objRemoteActionCompatParcelizer6 == null) {
                    objRemoteActionCompatParcelizer6 = startForeground.read((char) Color.blue(0), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 23785, 32 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), -1690012015, false, "b", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer6).invoke(null, objArr7);
            }
            i3 = 2;
        }
        char[] cArr = new char[i];
        downloadService.write = 0;
        while (downloadService.write < i) {
            int i8 = $11 + 49;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            cArr[downloadService.write] = (char) jArr[downloadService.write];
            Object[] objArr8 = {downloadService, downloadService};
            Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(-452087292);
            if (objRemoteActionCompatParcelizer7 == null) {
                objRemoteActionCompatParcelizer7 = startForeground.read((char) TextUtils.getTrimmedLength(""), (ViewConfiguration.getScrollBarSize() >> 8) + 23784, (ViewConfiguration.getTouchSlop() >> 8) + 33, -1690012015, false, "b", new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer7).invoke(null, objArr8);
        }
        objArr[0] = new String(cArr);
    }

    public final <X> MediaPeriodQueueExternalSyntheticLambda0<ImageView, X> RemoteActionCompatParcelizer(ImageView imageView, Class<X> cls) {
        int i = 2 % 2;
        int i2 = handleMediaPlayPauseIfPendingOnHandler + 65;
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        MediaPeriodQueueExternalSyntheticLambda0<ImageView, X> mediaPeriodQueueExternalSyntheticLambda0AudioAttributesCompatParcelizer = MediaSourceList.AudioAttributesCompatParcelizer(imageView, cls);
        int i4 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 77;
        handleMediaPlayPauseIfPendingOnHandler = i4 % 128;
        int i5 = i4 % 2;
        return mediaPeriodQueueExternalSyntheticLambda0AudioAttributesCompatParcelizer;
    }

    public final setDrmSessionForClearPeriods RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = handleMediaPlayPauseIfPendingOnHandler + 117;
        int i3 = i2 % 128;
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        setDrmSessionForClearPeriods setdrmsessionforclearperiods = this.AudioAttributesImplApi21Parcelizer;
        int i4 = i3 + 113;
        handleMediaPlayPauseIfPendingOnHandler = i4 % 128;
        int i5 = i4 % 2;
        return setdrmsessionforclearperiods;
    }

    public final setSelectionFlags AudioAttributesImplApi26Parcelizer() {
        int i = 2 % 2;
        int i2 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 5;
        handleMediaPlayPauseIfPendingOnHandler = i2 % 128;
        int i3 = i2 % 2;
        setSelectionFlags setselectionflagsRemoteActionCompatParcelizer = this.MediaBrowserCompatSearchResultReceiver.RemoteActionCompatParcelizer();
        int i4 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 13;
        handleMediaPlayPauseIfPendingOnHandler = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 29 / 0;
        }
        return setselectionflagsRemoteActionCompatParcelizer;
    }

    public final int MediaBrowserCompatCustomActionResultReceiver() {
        int i = 2 % 2;
        int i2 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        int i3 = i2 + 75;
        handleMediaPlayPauseIfPendingOnHandler = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.AudioAttributesImplApi26Parcelizer;
        int i6 = i2 + 7;
        handleMediaPlayPauseIfPendingOnHandler = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    private static /* synthetic */ Object IconCompatParcelizer(Object[] objArr) {
        setRotationDegrees setrotationdegrees = (setRotationDegrees) objArr[0];
        int i = 2 % 2;
        int i2 = handleMediaPlayPauseIfPendingOnHandler;
        int i3 = i2 + 53;
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i3 % 128;
        int i4 = i3 % 2;
        setSubtitleConfigurations setsubtitleconfigurations = setrotationdegrees.AudioAttributesCompatParcelizer;
        int i5 = i2 + 13;
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i5 % 128;
        if (i5 % 2 == 0) {
            return setsubtitleconfigurations;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final setPeakBitrate write() {
        int i = 2 % 2;
        int i2 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 91;
        int i3 = i2 % 128;
        handleMediaPlayPauseIfPendingOnHandler = i3;
        int i4 = i2 % 2;
        setPeakBitrate setpeakbitrate = this.MediaBrowserCompatItemReceiver;
        int i5 = i3 + 13;
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i5 % 128;
        if (i5 % 2 == 0) {
            return setpeakbitrate;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(int i, boolean z, char[] cArr, int i2, int i3, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        clearDownloadManagerHelpers cleardownloadmanagerhelpers = new clearDownloadManagerHelpers();
        char[] cArr2 = new char[i2];
        cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer = 0;
        while (cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer < i2) {
            int i5 = $10 + 41;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            cleardownloadmanagerhelpers.RemoteActionCompatParcelizer = cArr[cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer];
            cArr2[cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer] = (char) (i3 + cleardownloadmanagerhelpers.RemoteActionCompatParcelizer);
            int i7 = cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i7]), Integer.valueOf(MediaDescriptionCompat)};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-579447922);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) Drawable.resolveOpacity(0, 0), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 23703, 32 - (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), -1556113637, false, CmcdHeadersFactory.OBJECT_TYPE_AUDIO_ONLY, new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i7] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {cleardownloadmanagerhelpers, cleardownloadmanagerhelpers};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-322440307);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (44862 - Drawable.resolveOpacity(0, 0)), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 18943, 28 - (ViewConfiguration.getScrollDefaultDelay() >> 16), -1836173544, false, "c", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3);
                int i8 = $11 + 51;
                $10 = i8 % 128;
                if (i8 % 2 != 0) {
                    int i9 = 3 / 2;
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        if (i > 0) {
            int i10 = $10 + 53;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            cleardownloadmanagerhelpers.write = i;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - cleardownloadmanagerhelpers.write, cleardownloadmanagerhelpers.write);
            System.arraycopy(cArr3, cleardownloadmanagerhelpers.write, cArr2, 0, i2 - cleardownloadmanagerhelpers.write);
        }
        if (!(!z)) {
            char[] cArr4 = new char[i2];
            cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer = 0;
            while (cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer < i2) {
                int i12 = $11 + 73;
                $10 = i12 % 128;
                if (i12 % 2 != 0) {
                    cArr4[cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer] = cArr2[i2 - cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer];
                    Object[] objArr4 = {cleardownloadmanagerhelpers, cleardownloadmanagerhelpers};
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-322440307);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) (44862 - View.MeasureSpec.getSize(0)), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 18945, 28 - Color.blue(0), -1836173544, false, "c", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                } else {
                    cArr4[cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer] = cArr2[(i2 - cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer) - 1];
                    Object[] objArr5 = {cleardownloadmanagerhelpers, cleardownloadmanagerhelpers};
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-322440307);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        objRemoteActionCompatParcelizer4 = startForeground.read((char) (44863 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 18944 - View.MeasureSpec.getMode(0), 28 - (ViewConfiguration.getFadingEdgeLength() >> 16), -1836173544, false, "c", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
                }
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(39:0|2|(2:(2:7|(2:9|(1:15)(1:14))(2:16|17))(1:18)|(10:20|272|21|(1:23)|24|25|26|(1:28)|29|30)(1:33))(0)|34|(26:267|36|(2:38|(3:40|(2:42|47)|46)(3:43|(2:45|47)|46))(1:47)|83|282|84|(1:86)|87|(3:89|(1:91)|92)(19:93|94|274|95|(1:97)|98|99|268|100|(1:102)|103|104|105|(1:107)|108|(1:110)|111|(1:113)|114)|115|(4:118|(13:284|120|(3:122|(3:125|126|123)|288)|127|259|128|(1:130)|131|132|133|276|134|287)(1:286)|285|116)|283|169|(1:171)|172|(3:174|(1:176)|177)(13:179|280|180|181|(1:183)|184|270|185|186|(1:188)|189|(1:191)|192)|178|193|(6:195|196|(1:198)|199|200|201)|202|(1:204)|205|(3:207|(1:209)|210)(14:212|213|(1:215)|216|217|(1:219)|220|257|221|222|(1:224)|225|(1:227)|228)|211|229|(7:231|232|(1:234)|235|236|237|238)(1:289))|51|261|52|(1:54)|55|278|56|(1:58)|59|60|83|282|84|(0)|87|(0)(0)|115|(1:116)|283|169|(0)|172|(0)(0)|178|193|(0)|202|(0)|205|(0)(0)|211|229|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0bfe, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0bff, code lost:
    
        r9 = new java.lang.Object[1];
        b(11 - (android.util.TypedValue.complexToFloat(0) > com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_RED ? 1 : (android.util.TypedValue.complexToFloat(0) == com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (char) (((android.content.Context) java.lang.Class.forName("android.app.ActivityThread").getMethod(r8, new java.lang.Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.marrow.R.string.exo_item_list).substring(0, 4).codePointAt(1) - 49), ((android.content.Context) java.lang.Class.forName("android.app.ActivityThread").getMethod(r8, new java.lang.Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.marrow.R.string.exo_item_list).substring(0, 4).codePointAt(2) + 168, r9);
        r2 = (java.lang.String) r9[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0c6e, code lost:
    
        r4 = new java.io.ByteArrayOutputStream();
        r6 = new java.io.PrintStream(r4);
        r0.printStackTrace(r6);
        r6.close();
        r1 = r4.toString(org.apache.commons.compress.utils.CharsetNames.UTF_8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0c85, code lost:
    
        r1 = java.lang.String.valueOf(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0c89, code lost:
    
        r4 = new java.util.ArrayList(2);
        r4.add(r1);
        r4.add(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0c98, code lost:
    
        r1 = kotlin.startForeground.RemoteActionCompatParcelizer(-1407079962);
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0c9c, code lost:
    
        if (r1 == null) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0c9e, code lost:
    
        r1 = kotlin.startForeground.read((char) (4534 - ((byte) android.view.KeyEvent.getModifierMetaStateMask())), 6054 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), android.graphics.Color.rgb(0, 0, 0) + 16777258, -764908173, false, "IconCompatParcelizer", new java.lang.Class[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0ccb, code lost:
    
        r1 = ((java.lang.reflect.Method) r1).invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0cd7, code lost:
    
        r7 = new java.lang.Object[]{-111393119, 81604378625L, r4, com.marrow.TrainingApplication.RemoteActionCompatParcelizer(), false};
        r2 = (java.lang.Class) kotlin.startForeground.IconCompatParcelizer((char) ((-1) - android.text.TextUtils.lastIndexOf("", '0', 0)), (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 6030, android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0) + 25);
        r4 = kotlin.setRotationDegrees.$$d;
        r6 = r4[43];
        r4 = r4[8];
        r12 = new java.lang.Object[1];
        d(r6, r4, (byte) (r4 - 1), r12);
        r2.getMethod((java.lang.String) r12[0], java.lang.Integer.TYPE, java.lang.Long.TYPE, java.util.List.class, java.lang.String.class, java.lang.Boolean.TYPE).invoke(r1, r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0ac9 A[Catch: all -> 0x0bfe, TryCatch #14 {all -> 0x0bfe, blocks: (B:84:0x06b5, B:86:0x06bb, B:87:0x06fd, B:89:0x070a, B:91:0x0713, B:92:0x0755, B:115:0x0abf, B:116:0x0ac3, B:118:0x0ac9, B:120:0x0adf, B:123:0x0aec, B:125:0x0aef, B:132:0x0b57, B:138:0x0bd8, B:140:0x0bde, B:141:0x0bdf, B:143:0x0be1, B:145:0x0be8, B:146:0x0be9, B:93:0x0760, B:105:0x0908, B:107:0x090e, B:108:0x094e, B:110:0x0a17, B:111:0x0a59, B:113:0x0a70, B:114:0x0ab9, B:148:0x0beb, B:150:0x0bf2, B:151:0x0bf3, B:153:0x0bf5, B:155:0x0bfc, B:156:0x0bfd, B:128:0x0b1c, B:130:0x0b22, B:131:0x0b50, B:100:0x0886, B:102:0x089a, B:103:0x08fc, B:95:0x083b, B:97:0x084f, B:98:0x087f, B:134:0x0b5c), top: B:282:0x06b5, outer: #5, inners: #1, #7, #10, #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0d5f  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0db1  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0e08  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x1150  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x1232  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x127b  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x12d1  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x163e  */
    /* JADX WARN: Removed duplicated region for block: B:289:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x06bb A[Catch: all -> 0x0bfe, TryCatch #14 {all -> 0x0bfe, blocks: (B:84:0x06b5, B:86:0x06bb, B:87:0x06fd, B:89:0x070a, B:91:0x0713, B:92:0x0755, B:115:0x0abf, B:116:0x0ac3, B:118:0x0ac9, B:120:0x0adf, B:123:0x0aec, B:125:0x0aef, B:132:0x0b57, B:138:0x0bd8, B:140:0x0bde, B:141:0x0bdf, B:143:0x0be1, B:145:0x0be8, B:146:0x0be9, B:93:0x0760, B:105:0x0908, B:107:0x090e, B:108:0x094e, B:110:0x0a17, B:111:0x0a59, B:113:0x0a70, B:114:0x0ab9, B:148:0x0beb, B:150:0x0bf2, B:151:0x0bf3, B:153:0x0bf5, B:155:0x0bfc, B:156:0x0bfd, B:128:0x0b1c, B:130:0x0b22, B:131:0x0b50, B:100:0x0886, B:102:0x089a, B:103:0x08fc, B:95:0x083b, B:97:0x084f, B:98:0x087f, B:134:0x0b5c), top: B:282:0x06b5, outer: #5, inners: #1, #7, #10, #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x070a A[Catch: all -> 0x0bfe, TryCatch #14 {all -> 0x0bfe, blocks: (B:84:0x06b5, B:86:0x06bb, B:87:0x06fd, B:89:0x070a, B:91:0x0713, B:92:0x0755, B:115:0x0abf, B:116:0x0ac3, B:118:0x0ac9, B:120:0x0adf, B:123:0x0aec, B:125:0x0aef, B:132:0x0b57, B:138:0x0bd8, B:140:0x0bde, B:141:0x0bdf, B:143:0x0be1, B:145:0x0be8, B:146:0x0be9, B:93:0x0760, B:105:0x0908, B:107:0x090e, B:108:0x094e, B:110:0x0a17, B:111:0x0a59, B:113:0x0a70, B:114:0x0ab9, B:148:0x0beb, B:150:0x0bf2, B:151:0x0bf3, B:153:0x0bf5, B:155:0x0bfc, B:156:0x0bfd, B:128:0x0b1c, B:130:0x0b22, B:131:0x0b50, B:100:0x0886, B:102:0x089a, B:103:0x08fc, B:95:0x083b, B:97:0x084f, B:98:0x087f, B:134:0x0b5c), top: B:282:0x06b5, outer: #5, inners: #1, #7, #10, #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0760 A[Catch: all -> 0x0bfe, TRY_LEAVE, TryCatch #14 {all -> 0x0bfe, blocks: (B:84:0x06b5, B:86:0x06bb, B:87:0x06fd, B:89:0x070a, B:91:0x0713, B:92:0x0755, B:115:0x0abf, B:116:0x0ac3, B:118:0x0ac9, B:120:0x0adf, B:123:0x0aec, B:125:0x0aef, B:132:0x0b57, B:138:0x0bd8, B:140:0x0bde, B:141:0x0bdf, B:143:0x0be1, B:145:0x0be8, B:146:0x0be9, B:93:0x0760, B:105:0x0908, B:107:0x090e, B:108:0x094e, B:110:0x0a17, B:111:0x0a59, B:113:0x0a70, B:114:0x0ab9, B:148:0x0beb, B:150:0x0bf2, B:151:0x0bf3, B:153:0x0bf5, B:155:0x0bfc, B:156:0x0bfd, B:128:0x0b1c, B:130:0x0b22, B:131:0x0b50, B:100:0x0886, B:102:0x089a, B:103:0x08fc, B:95:0x083b, B:97:0x084f, B:98:0x087f, B:134:0x0b5c), top: B:282:0x06b5, outer: #5, inners: #1, #7, #10, #11 }] */
    @Override // android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void attachBaseContext(android.content.Context r33) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 6250
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setRotationDegrees.attachBaseContext(android.content.Context):void");
    }

    public final setSubtitleConfigurations AudioAttributesCompatParcelizer() {
        int iIconCompatParcelizer = moveToLast.AnonymousClass7.IconCompatParcelizer();
        int iIconCompatParcelizer2 = moveToLast.AnonymousClass7.IconCompatParcelizer();
        int iIconCompatParcelizer3 = moveToLast.AnonymousClass7.IconCompatParcelizer();
        return (setSubtitleConfigurations) IconCompatParcelizer(moveToLast.AnonymousClass7.IconCompatParcelizer(), new Object[]{this}, -1599502422, iIconCompatParcelizer2, iIconCompatParcelizer, iIconCompatParcelizer3, 1599502423);
    }

    public final getPlayingPeriod IconCompatParcelizer() {
        int iIconCompatParcelizer = moveToLast.AnonymousClass7.IconCompatParcelizer();
        int iIconCompatParcelizer2 = moveToLast.AnonymousClass7.IconCompatParcelizer();
        int iIconCompatParcelizer3 = moveToLast.AnonymousClass7.IconCompatParcelizer();
        return (getPlayingPeriod) IconCompatParcelizer(moveToLast.AnonymousClass7.IconCompatParcelizer(), new Object[]{this}, -1029949516, iIconCompatParcelizer2, iIconCompatParcelizer, iIconCompatParcelizer3, 1029949516);
    }

    static void AudioAttributesImplBaseParcelizer() {
        MediaDescriptionCompat = 1000326237;
        MediaMetadataCompat = new char[]{56380, 7665, 24403, 39142, 55875, 5243, 21903, 38760, 53449, 4789, 19524, 36260, 53076, 2363, 19148, 33912, 50573, 1815, 16753, 33423, 64610, 15810, 32684, 47367, 64190, 13395, 30257, 46998, 61821, 13021, 27834, 44574, 61436, 10598, 27282, 42149, 58962, 10216, 24907, 41774, 40068, 56949, 8066, 23010, 39744, 54444, 5721, 20586, 37276, 54027, 3301, 20038, 34853, 51587, 2924, 17611, 34468, 49220, 421, 17157, 48433, 65231, 14459, 31193, 56420, 7654, 24388, 39078, 55815, 5152, 21911, 38769, 53400, 4835, 19529, 36266, 53021, 2424, 19143, 33851, 50562, 1814, 16739, 33432, 64544, 15762, 32746, 47451, 64189, 13334, 30307, 47047, 61751, 12958, 27814, 44617, 61369, 10547, 27266, 42226, 58951, 10155, 24845, 41855, 40142, 56871, 8142, 23013, 39755, 54439, 5703, 20591, 37340, 54107, 3327, 19999, 34938, 51677, 2877, 17549, 34536, 49165, 438, 17236, 48427, 65231, 14398, 31115, 48098, 62822, 14019, 47960, 31441, 14444, 65423, 48439, 29509, 56382, 7587, 24402, 39137, 55874, 5160, 21897, 38767, 53457, 4794, 19526, 36350, 52994, 2343, 19100, 33912, 50648, 1861, 16701, 33423, 64566, 15816, 32680, 47379, 64186, 13397, 30305, 46996, 61811, 12943, 27883, 44616, 61437, 10547, 27334, 42144, 42719, 26442, 9727, 57870, 41187, 28367, 12128, 60809, 43554, 26645, 14026, 63238, 46510, 29639, 12404, 65178, 20465, 36454, 52425, 2878, 18847, 34791, 50756, 1172, 17153, 33147, 57300, 7722, 23701, 39679, 55637, 56376, 7584, 24329, 39138, 55885, 5164, 21903, 38764, 53445, 4788, 19472};
        MediaBrowserCompatMediaItem = 8149023945866681746L;
    }
}
