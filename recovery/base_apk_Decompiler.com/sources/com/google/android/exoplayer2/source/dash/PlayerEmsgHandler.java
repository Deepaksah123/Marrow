package com.google.android.exoplayer2.source.dash;

import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.MetadataInputBuffer;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import com.google.android.exoplayer2.metadata.emsg.EventMessageDecoder;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.exoplayer2.source.SampleQueue;
import com.google.android.exoplayer2.source.chunk.Chunk;
import com.google.android.exoplayer2.source.dash.manifest.DashManifest;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.exoplayer2.upstream.DataReader;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import kotlin.buildSetStopReasonIntent;
import kotlin.notifyDownloads;
import kotlin.startForeground;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class PlayerEmsgHandler implements Handler.Callback {
    private static final int EMSG_MANIFEST_EXPIRED = 1;
    private final Allocator allocator;
    private boolean chunkLoadedCompletedSinceLastManifestRefreshRequest;
    private long expiredManifestPublishTimeUs;
    private boolean isWaitingForManifestRefresh;
    private DashManifest manifest;
    private final PlayerEmsgCallback playerEmsgCallback;
    private boolean released;
    private final TreeMap<Long, Long> manifestPublishTimeToExpiryTimeUs = new TreeMap<>();
    private final Handler handler = Util.createHandlerForCurrentLooper(this);
    private final EventMessageDecoder decoder = new EventMessageDecoder();

    public interface PlayerEmsgCallback {
        void onDashManifestPublishTimeExpired(long j);

        void onDashManifestRefreshRequested();
    }

    public PlayerEmsgHandler(DashManifest dashManifest, PlayerEmsgCallback playerEmsgCallback, Allocator allocator) {
        this.manifest = dashManifest;
        this.playerEmsgCallback = playerEmsgCallback;
        this.allocator = allocator;
    }

    public final void updateManifest(DashManifest dashManifest) {
        this.isWaitingForManifestRefresh = false;
        this.expiredManifestPublishTimeUs = C.TIME_UNSET;
        this.manifest = dashManifest;
        removePreviouslyExpiredManifestPublishTimeValues();
    }

    public final PlayerTrackEmsgHandler newPlayerTrackEmsgHandler() {
        return new PlayerTrackEmsgHandler(this.allocator);
    }

    public final void release() {
        this.released = true;
        this.handler.removeCallbacksAndMessages(null);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (this.released) {
            return true;
        }
        if (message.what != 1) {
            return false;
        }
        ManifestExpiryEventInfo manifestExpiryEventInfo = (ManifestExpiryEventInfo) message.obj;
        handleManifestExpiredMessage(manifestExpiryEventInfo.eventTimeUs, manifestExpiryEventInfo.manifestPublishTimeMsInEmsg);
        return true;
    }

    final boolean maybeRefreshManifestBeforeLoadingNextChunk(long j) {
        boolean z = false;
        if (!this.manifest.dynamic) {
            return false;
        }
        if (this.isWaitingForManifestRefresh) {
            return true;
        }
        Map.Entry<Long, Long> entryCeilingExpiryEntryForPublishTime = ceilingExpiryEntryForPublishTime(this.manifest.publishTimeMs);
        if (entryCeilingExpiryEntryForPublishTime != null && entryCeilingExpiryEntryForPublishTime.getValue().longValue() < j) {
            this.expiredManifestPublishTimeUs = entryCeilingExpiryEntryForPublishTime.getKey().longValue();
            notifyManifestPublishTimeExpired();
            z = true;
        }
        if (z) {
            maybeNotifyDashManifestRefreshNeeded();
        }
        return z;
    }

    public static final class ManifestExpiryEventInfo {
        private static int $10 = 0;
        private static int $11 = 1;
        private static boolean AudioAttributesCompatParcelizer;
        private static int AudioAttributesImplApi21Parcelizer;
        private static int IconCompatParcelizer;
        private static char[] MediaBrowserCompatItemReceiver;
        private static boolean RemoteActionCompatParcelizer;
        private static char[] read;
        private static int write;
        public final long eventTimeUs;
        public final long manifestPublishTimeMsInEmsg;
        private static final byte[] $$a = {9, -34, 82, 56, -26, -12, 1, 43, -44, 2, -3, 15, -19, 36, -17, -17, 15, -2, -7, 3, -17, 21, -13};
        private static final int $$b = 117;
        private static final byte[] AudioAttributesImplBaseParcelizer = {32, -59, 22, 74, 9, -21, 21, TarConstants.LF_CHR, -62, 11, -13, 7, 57, -37, -33, 2, 9, -5, 7, 3, 4, 3, -11, 9, -21, 21, TarConstants.LF_CHR, -62, 11, -13, 7, 57, -27, -37, -6, 15, -2, 2, -13, 21, -11, -9, 16, 22, -23, -5, -6, 30, -11, -11, -9, 16, -13, 10, -14, 3, 6, 5, TarConstants.LF_FIFO, -72, 13, 4, -18, 73, -40, -19, 4, -18, TarConstants.LF_BLK, -44, 1, 8, -3, 2, -14, 3, 17, -19, 11, -6, 1, 2, -15, 32, -27, -6, 18, -5, 21, -25, -3, -1, 9, -21, 21, TarConstants.LF_CHR, -62, 11, -13, 7, 57, -38, -20, -10, 3, -8, 22, -1, -10, 7, 2, -15, TarConstants.LF_LINK, -30, -20, 2, 14, 9, -21, 21, TarConstants.LF_CHR, -62, 11, -13, 7, 57, -33, -19, -8, 5, 2, -17, 9, -21, 21, TarConstants.LF_CHR, -62, 11, -13, 7, 57, -30, -35, 1, 7, -5, 9, 11, 9, -21, 21, TarConstants.LF_CHR, -62, 11, -13, 7, 57, -68, 13, -1, -6, 7, 2, -17, 70, -19, -34, 0, -2, -14, 0, 10, 7, -10, 7, 22, -19, -8, 5, 2, -17, 14, -15, TarConstants.LF_CHR, -34, 0, -2, -14, 0, 10, 7, -10, 7, 9, -21, 21, TarConstants.LF_CHR, -62, 11, -13, 7, 57, -68, 13, -1, -6, 7, 2, -17, 70, -31, -24, -15, 12, -7, 11, -5, -8, 7, 4, 6, 15, -30, 9, -21, 21, TarConstants.LF_CHR, -62, 11, -13, 7, 57, -33, -19, -8, 5, 2, -17, 57};
        private static final int MediaBrowserCompatCustomActionResultReceiver = 247;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002d). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void d(byte r6, short r7, int r8, java.lang.Object[] r9) {
            /*
                int r8 = r8 * 3
                int r8 = 73 - r8
                byte[] r0 = com.google.android.exoplayer2.source.dash.PlayerEmsgHandler.ManifestExpiryEventInfo.$$a
                int r6 = r6 * 4
                int r1 = 20 - r6
                int r7 = r7 * 2
                int r7 = r7 + 4
                byte[] r1 = new byte[r1]
                int r6 = 19 - r6
                r2 = 0
                if (r0 != 0) goto L18
                r3 = r6
                r4 = r2
                goto L2d
            L18:
                r3 = r2
            L19:
                byte r4 = (byte) r8
                r1[r3] = r4
                int r4 = r3 + 1
                if (r3 != r6) goto L28
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L28:
                r3 = r0[r7]
                r5 = r3
                r3 = r8
                r8 = r5
            L2d:
                int r7 = r7 + 1
                int r8 = -r8
                int r8 = r8 + r3
                r3 = r4
                goto L19
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.dash.PlayerEmsgHandler.ManifestExpiryEventInfo.d(byte, short, int, java.lang.Object[]):void");
        }

        private static void a(boolean z, byte[] bArr, int[] iArr, Object[] objArr) throws Throwable {
            buildSetStopReasonIntent buildsetstopreasonintent = new buildSetStopReasonIntent();
            int i = iArr[0];
            int i2 = iArr[1];
            int i3 = iArr[2];
            int i4 = iArr[3];
            char[] cArr = MediaBrowserCompatItemReceiver;
            char c = '0';
            if (cArr != null) {
                int length = cArr.length;
                char[] cArr2 = new char[length];
                int i5 = 0;
                while (i5 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[i5])};
                        Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-338863922);
                        if (objRemoteActionCompatParcelizer == null) {
                            objRemoteActionCompatParcelizer = startForeground.read((char) (MotionEvent.axisFromString("") + 1), TextUtils.lastIndexOf("", c, 0) + 11614, 20 - TextUtils.indexOf("", "", 0, 0), -1786471333, false, "u", new Class[]{Integer.TYPE});
                        }
                        cArr2[i5] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                        i5++;
                        c = '0';
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr = cArr2;
            }
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr, i, cArr3, 0, i2);
            if (bArr != null) {
                char[] cArr4 = new char[i2];
                buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
                char c2 = 0;
                while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i2) {
                    if (bArr[buildsetstopreasonintent.RemoteActionCompatParcelizer] == 1) {
                        int i6 = buildsetstopreasonintent.RemoteActionCompatParcelizer;
                        Object[] objArr3 = {Integer.valueOf(cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer]), Integer.valueOf(c2)};
                        Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1429458299);
                        if (objRemoteActionCompatParcelizer2 == null) {
                            objRemoteActionCompatParcelizer2 = startForeground.read((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 22959, (ViewConfiguration.getJumpTapTimeout() >> 16) + 43, -729418224, false, "x", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i6] = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).charValue();
                    } else {
                        int i7 = buildsetstopreasonintent.RemoteActionCompatParcelizer;
                        Object[] objArr4 = {Integer.valueOf(cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer]), Integer.valueOf(c2)};
                        Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(1859710730);
                        if (objRemoteActionCompatParcelizer3 == null) {
                            objRemoteActionCompatParcelizer3 = startForeground.read((char) (31589 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), Drawable.resolveOpacity(0, 0) + 9863, 65 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 277949343, false, "v", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i7] = ((Character) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).charValue();
                    }
                    c2 = cArr4[buildsetstopreasonintent.RemoteActionCompatParcelizer];
                    Object[] objArr5 = {buildsetstopreasonintent, buildsetstopreasonintent};
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(1104966666);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        objRemoteActionCompatParcelizer4 = startForeground.read((char) (37821 - TextUtils.indexOf((CharSequence) "", '0')), (Process.myPid() >> 22) + 9754, (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 27, 1066774687, false, "B", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
                }
                cArr3 = cArr4;
            }
            if (i4 > 0) {
                char[] cArr5 = new char[i2];
                System.arraycopy(cArr3, 0, cArr5, 0, i2);
                int i8 = i2 - i4;
                System.arraycopy(cArr5, 0, cArr3, i8, i4);
                System.arraycopy(cArr5, i4, cArr3, 0, i8);
            }
            if (z) {
                char[] cArr6 = new char[i2];
                buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
                while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i2) {
                    cArr6[buildsetstopreasonintent.RemoteActionCompatParcelizer] = cArr3[(i2 - buildsetstopreasonintent.RemoteActionCompatParcelizer) - 1];
                    buildsetstopreasonintent.RemoteActionCompatParcelizer++;
                }
                cArr3 = cArr6;
            }
            if (i3 > 0) {
                buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
                while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i2) {
                    cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer] = (char) (cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer] - iArr[2]);
                    buildsetstopreasonintent.RemoteActionCompatParcelizer++;
                }
            }
            objArr[0] = new String(cArr3);
        }

        private static void c(byte[] bArr, int i, int[] iArr, char[] cArr, Object[] objArr) throws Throwable {
            char[] cArr2;
            int i2 = 2 % 2;
            notifyDownloads notifydownloads = new notifyDownloads();
            char[] cArr3 = read;
            char c = '0';
            if (cArr3 != null) {
                int length = cArr3.length;
                char[] cArr4 = new char[length];
                int i3 = 0;
                while (i3 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr3[i3])};
                        Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-298077624);
                        if (objRemoteActionCompatParcelizer == null) {
                            objRemoteActionCompatParcelizer = startForeground.read((char) (44861 - MotionEvent.axisFromString("")), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 18944, 27 - TextUtils.lastIndexOf("", c, 0), -1871546659, false, CmcdHeadersFactory.STREAMING_FORMAT_SS, new Class[]{Integer.TYPE});
                        }
                        cArr4[i3] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                        i3++;
                        c = '0';
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr3 = cArr4;
            }
            try {
                Object[] objArr3 = {Integer.valueOf(IconCompatParcelizer)};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(680566917);
                float f = BitmapDescriptorFactory.HUE_RED;
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 19032 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), TextUtils.indexOf("", "", 0) + 75, 1457087504, false, "r", new Class[]{Integer.TYPE});
                }
                int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
                if (RemoteActionCompatParcelizer) {
                    notifydownloads.AudioAttributesCompatParcelizer = bArr.length;
                    char[] cArr5 = new char[notifydownloads.AudioAttributesCompatParcelizer];
                    notifydownloads.IconCompatParcelizer = 0;
                    while (notifydownloads.IconCompatParcelizer < notifydownloads.AudioAttributesCompatParcelizer) {
                        cArr5[notifydownloads.IconCompatParcelizer] = (char) (cArr3[bArr[(notifydownloads.AudioAttributesCompatParcelizer - 1) - notifydownloads.IconCompatParcelizer] + i] - iIntValue);
                        Object[] objArr4 = {notifydownloads, notifydownloads};
                        Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1593953308);
                        if (objRemoteActionCompatParcelizer3 == null) {
                            objRemoteActionCompatParcelizer3 = startForeground.read((char) (Process.myTid() >> 22), 11439 - (Process.myTid() >> 22), 14 - (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), -558368911, false, "q", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                    }
                    String str = new String(cArr5);
                    int i4 = $10 + 45;
                    $11 = i4 % 128;
                    int i5 = i4 % 2;
                    objArr[0] = str;
                    return;
                }
                if (!AudioAttributesCompatParcelizer) {
                    notifydownloads.AudioAttributesCompatParcelizer = iArr.length;
                    char[] cArr6 = new char[notifydownloads.AudioAttributesCompatParcelizer];
                    notifydownloads.IconCompatParcelizer = 0;
                    while (notifydownloads.IconCompatParcelizer < notifydownloads.AudioAttributesCompatParcelizer) {
                        int i6 = $10 + 113;
                        $11 = i6 % 128;
                        int i7 = i6 % 2;
                        cArr6[notifydownloads.IconCompatParcelizer] = (char) (cArr3[iArr[(notifydownloads.AudioAttributesCompatParcelizer - 1) - notifydownloads.IconCompatParcelizer] - i] - iIntValue);
                        notifydownloads.IconCompatParcelizer++;
                    }
                    objArr[0] = new String(cArr6);
                    return;
                }
                int i8 = $10 + 101;
                $11 = i8 % 128;
                if (i8 % 2 == 0) {
                    notifydownloads.AudioAttributesCompatParcelizer = cArr.length;
                    cArr2 = new char[notifydownloads.AudioAttributesCompatParcelizer];
                    notifydownloads.IconCompatParcelizer = 1;
                } else {
                    notifydownloads.AudioAttributesCompatParcelizer = cArr.length;
                    cArr2 = new char[notifydownloads.AudioAttributesCompatParcelizer];
                    notifydownloads.IconCompatParcelizer = 0;
                }
                while (notifydownloads.IconCompatParcelizer < notifydownloads.AudioAttributesCompatParcelizer) {
                    cArr2[notifydownloads.IconCompatParcelizer] = (char) (cArr3[cArr[(notifydownloads.AudioAttributesCompatParcelizer - 1) - notifydownloads.IconCompatParcelizer] - i] - iIntValue);
                    Object[] objArr5 = {notifydownloads, notifydownloads};
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1593953308);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        objRemoteActionCompatParcelizer4 = startForeground.read((char) Gravity.getAbsoluteGravity(0, 0), Process.getGidForName("") + 11440, 15 - (ViewConfiguration.getScrollFriction() > f ? 1 : (ViewConfiguration.getScrollFriction() == f ? 0 : -1)), -558368911, false, "q", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
                    f = BitmapDescriptorFactory.HUE_RED;
                }
                objArr[0] = new String(cArr2);
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }

        public ManifestExpiryEventInfo(long j, long j2) {
            this.eventTimeUs = j;
            this.manifestPublishTimeMsInEmsg = j2;
        }

        /* JADX WARN: Removed duplicated region for block: B:138:0x059a  */
        /* JADX WARN: Removed duplicated region for block: B:188:0x05a8 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static void AudioAttributesCompatParcelizer(android.content.Context r19, long r20, long r22) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 1676
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.dash.PlayerEmsgHandler.ManifestExpiryEventInfo.AudioAttributesCompatParcelizer(android.content.Context, long, long):void");
        }

        static {
            IconCompatParcelizer();
            write = 0;
            AudioAttributesImplApi21Parcelizer = 1;
            read = new char[]{28490, 28491, 28492};
            IconCompatParcelizer = 411398126;
            AudioAttributesCompatParcelizer = true;
            RemoteActionCompatParcelizer = true;
        }

        static void IconCompatParcelizer() {
            MediaBrowserCompatItemReceiver = new char[]{45028, 44904, 44904, 44885, 44885, 44886, 44907, 44907, 44906, 44906, 44906, 44906, 44885, 44885, 44885, 44885, 44884, 44884, 44884, 44885, 44906, 44905, 44906, 44886, 44885, 44905, 44906, 44886, 44885, 44904, 44906, 44886, 44884, 44904, 44906, 44886, 44904, 44908, 44885, 44884, 44907, 44906, 44886, 44885, 44905, 44906, 44884, 44904, 44906, 44904, 44911, 44885, 44886, 44904, 44911, 44885, 44886, 44904, 44911, 44885, 44886, 44907, 44910, 44885, 44886, 44907, 44910, 44885, 44886, 44904, 44908, 44885, 44906, 44905, 44885, 44886, 44904, 44911, 44885, 44907, 44911, 44885, 44907, 44910, 44885, 44906, 44910, 44885, 44906, 44905, 44885, 44886, 44885, 44904, 44885, 44886, 44884, 44907, 44885, 44906, 44905, 44885, 44884, 44907, 44885, 44884, 44907, 44885, 44885, 44904, 44885, 44886, 44884, 44907, 44885, 44906, 44905, 44885, 44884, 44907, 44885, 44884, 44907, 44885, 44884, 44907, 44885, 44886, 44884, 44907, 44885, 44884, 44907, 44885, 44886, 44885, 44905, 44885, 44906, 44905, 44885, 44904, 44911, 44885, 44886, 44885, 44904, 44885, 44904, 44910, 44885, 44886, 44904, 44911, 44885, 44907, 44910, 44885, 44886, 44884, 44904, 44885, 44907, 44905, 44885, 44886, 44884, 44907, 44885, 44906, 44905, 44885, 44886, 44884, 44907, 44885, 44906, 44904, 44885, 44886, 44885, 44904, 44885, 44886, 44904, 44911, 44885, 44906, 44905, 44885, 44904, 44911, 44885, 44907, 44910, 44885, 44907, 44910, 44885, 44906, 44905, 44885, 44906, 44905, 44885, 44885, 44907, 44885, 44886, 44884, 44907, 44885, 44885, 44904, 44885, 44884, 44907, 44885, 44886, 44884, 44907, 44885, 44884, 44906, 44885, 44886, 44884, 44907, 44885, 44884, 44906, 44885, 44886, 44904, 44910, 44884, 44904, 44905, 44886, 44904, 44904, 44886, 44907, 44904, 44886, 44907, 44905, 44884, 44907, 44907, 44886, 44907, 44905, 44884, 44906, 44907, 44886, 44884, 44884, 44906, 44906, 44886, 44885, 44907, 44884, 44884, 44907, 44884, 44884, 44906, 44884, 44885, 44906, 44956};
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0028). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void b(short r6, int r7, int r8, java.lang.Object[] r9) {
            /*
                int r8 = 118 - r8
                int r0 = 34 - r6
                byte[] r1 = com.google.android.exoplayer2.source.dash.PlayerEmsgHandler.ManifestExpiryEventInfo.AudioAttributesImplBaseParcelizer
                int r7 = r7 + 4
                byte[] r0 = new byte[r0]
                int r6 = 33 - r6
                r2 = 0
                if (r1 != 0) goto L13
                r4 = r8
                r3 = r2
                r8 = r7
                goto L28
            L13:
                r3 = r2
            L14:
                byte r4 = (byte) r8
                r0[r3] = r4
                if (r3 != r6) goto L21
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                r9[r2] = r6
                return
            L21:
                int r3 = r3 + 1
                r4 = r1[r7]
                r5 = r8
                r8 = r7
                r7 = r5
            L28:
                int r4 = -r4
                int r7 = r7 + r4
                int r8 = r8 + 1
                r5 = r8
                r8 = r7
                r7 = r5
                goto L14
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.dash.PlayerEmsgHandler.ManifestExpiryEventInfo.b(short, int, int, java.lang.Object[]):void");
        }
    }

    final void onChunkLoadCompleted(Chunk chunk) {
        this.chunkLoadedCompletedSinceLastManifestRefreshRequest = true;
    }

    final boolean onChunkLoadError(boolean z) {
        if (!this.manifest.dynamic) {
            return false;
        }
        if (this.isWaitingForManifestRefresh) {
            return true;
        }
        if (!z) {
            return false;
        }
        maybeNotifyDashManifestRefreshNeeded();
        return true;
    }

    private void handleManifestExpiredMessage(long j, long j2) {
        Long l = this.manifestPublishTimeToExpiryTimeUs.get(Long.valueOf(j2));
        if (l == null) {
            this.manifestPublishTimeToExpiryTimeUs.put(Long.valueOf(j2), Long.valueOf(j));
        } else if (l.longValue() > j) {
            this.manifestPublishTimeToExpiryTimeUs.put(Long.valueOf(j2), Long.valueOf(j));
        }
    }

    private Map.Entry<Long, Long> ceilingExpiryEntryForPublishTime(long j) {
        return this.manifestPublishTimeToExpiryTimeUs.ceilingEntry(Long.valueOf(j));
    }

    private void removePreviouslyExpiredManifestPublishTimeValues() {
        Iterator<Map.Entry<Long, Long>> it = this.manifestPublishTimeToExpiryTimeUs.entrySet().iterator();
        while (it.hasNext()) {
            if (it.next().getKey().longValue() < this.manifest.publishTimeMs) {
                it.remove();
            }
        }
    }

    private void notifyManifestPublishTimeExpired() {
        this.playerEmsgCallback.onDashManifestPublishTimeExpired(this.expiredManifestPublishTimeUs);
    }

    private void maybeNotifyDashManifestRefreshNeeded() {
        if (this.chunkLoadedCompletedSinceLastManifestRefreshRequest) {
            this.isWaitingForManifestRefresh = true;
            this.chunkLoadedCompletedSinceLastManifestRefreshRequest = false;
            this.playerEmsgCallback.onDashManifestRefreshRequested();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long getManifestPublishTimeMsInEmsg(EventMessage eventMessage) {
        try {
            return Util.parseXsDateTime(Util.fromUtf8Bytes(eventMessage.messageData));
        } catch (ParserException unused) {
            return C.TIME_UNSET;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isPlayerEmsgEvent(String str, String str2) {
        if ("urn:mpeg:dash:event:2012".equals(str)) {
            return IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(str2) || "2".equals(str2) || "3".equals(str2);
        }
        return false;
    }

    public final class PlayerTrackEmsgHandler implements TrackOutput {
        private final SampleQueue sampleQueue;
        private final FormatHolder formatHolder = new FormatHolder();
        private final MetadataInputBuffer buffer = new MetadataInputBuffer();
        private long maxLoadedChunkEndTimeUs = C.TIME_UNSET;

        PlayerTrackEmsgHandler(Allocator allocator) {
            this.sampleQueue = SampleQueue.createWithoutDrm(allocator);
        }

        @Override // com.google.android.exoplayer2.extractor.TrackOutput
        public final void format(Format format) {
            this.sampleQueue.format(format);
        }

        @Override // com.google.android.exoplayer2.extractor.TrackOutput
        public final int sampleData(DataReader dataReader, int i, boolean z, int i2) throws IOException {
            return this.sampleQueue.sampleData(dataReader, i, z);
        }

        @Override // com.google.android.exoplayer2.extractor.TrackOutput
        public final void sampleData(ParsableByteArray parsableByteArray, int i, int i2) {
            this.sampleQueue.sampleData(parsableByteArray, i);
        }

        @Override // com.google.android.exoplayer2.extractor.TrackOutput
        public final void sampleMetadata(long j, int i, int i2, int i3, TrackOutput.CryptoData cryptoData) {
            this.sampleQueue.sampleMetadata(j, i, i2, i3, cryptoData);
            parseAndDiscardSamples();
        }

        public final boolean maybeRefreshManifestBeforeLoadingNextChunk(long j) {
            return PlayerEmsgHandler.this.maybeRefreshManifestBeforeLoadingNextChunk(j);
        }

        public final void onChunkLoadCompleted(Chunk chunk) {
            if (this.maxLoadedChunkEndTimeUs == C.TIME_UNSET || chunk.endTimeUs > this.maxLoadedChunkEndTimeUs) {
                this.maxLoadedChunkEndTimeUs = chunk.endTimeUs;
            }
            PlayerEmsgHandler.this.onChunkLoadCompleted(chunk);
        }

        public final boolean onChunkLoadError(Chunk chunk) {
            long j = this.maxLoadedChunkEndTimeUs;
            return PlayerEmsgHandler.this.onChunkLoadError(j != C.TIME_UNSET && j < chunk.startTimeUs);
        }

        public final void release() {
            this.sampleQueue.release();
        }

        private void parseAndDiscardSamples() {
            while (this.sampleQueue.isReady(false)) {
                MetadataInputBuffer metadataInputBufferDequeueSample = dequeueSample();
                if (metadataInputBufferDequeueSample != null) {
                    long j = metadataInputBufferDequeueSample.timeUs;
                    Metadata metadataDecode = PlayerEmsgHandler.this.decoder.decode(metadataInputBufferDequeueSample);
                    if (metadataDecode != null) {
                        EventMessage eventMessage = (EventMessage) metadataDecode.get(0);
                        if (PlayerEmsgHandler.isPlayerEmsgEvent(eventMessage.schemeIdUri, eventMessage.value)) {
                            parsePlayerEmsgEvent(j, eventMessage);
                        }
                    }
                }
            }
            this.sampleQueue.discardToRead();
        }

        private MetadataInputBuffer dequeueSample() {
            this.buffer.clear();
            if (this.sampleQueue.read(this.formatHolder, this.buffer, 0, false) != -4) {
                return null;
            }
            this.buffer.flip();
            return this.buffer;
        }

        private void parsePlayerEmsgEvent(long j, EventMessage eventMessage) {
            long manifestPublishTimeMsInEmsg = PlayerEmsgHandler.getManifestPublishTimeMsInEmsg(eventMessage);
            if (manifestPublishTimeMsInEmsg == C.TIME_UNSET) {
                return;
            }
            onManifestExpiredMessageEncountered(j, manifestPublishTimeMsInEmsg);
        }

        private void onManifestExpiredMessageEncountered(long j, long j2) {
            PlayerEmsgHandler.this.handler.sendMessage(PlayerEmsgHandler.this.handler.obtainMessage(1, new ManifestExpiryEventInfo(j, j2)));
        }
    }
}
