package com.google.android.exoplayer2.drm;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.Pair;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.analytics.PlayerId;
import com.google.android.exoplayer2.decoder.CryptoConfig;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.drm.DrmSessionEventListener;
import com.google.android.exoplayer2.drm.ExoMediaDrm;
import com.google.android.exoplayer2.source.LoadEventInfo;
import com.google.android.exoplayer2.source.MediaLoadData;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Consumer;
import com.google.android.exoplayer2.util.CopyOnWriteMultiset;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.TrainingApplication;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.firstKnownRubyPosition;
import kotlin.startForeground;
import org.apache.commons.compress.archivers.tar.TarConstants;
import org.apache.commons.compress.archivers.zip.UnixStat;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
class DefaultDrmSession implements DrmSession {
    private static short[] AudioAttributesCompatParcelizer = null;
    private static final int MAX_LICENSE_DURATION_TO_RENEW_SECONDS = 60;
    private static final int MSG_KEYS = 1;
    private static final int MSG_PROVISION = 0;
    private static final String TAG = "DefaultDrmSession";
    private final MediaDrmCallback callback;
    private CryptoConfig cryptoConfig;
    private ExoMediaDrm.KeyRequest currentKeyRequest;
    private ExoMediaDrm.ProvisionRequest currentProvisionRequest;
    private final CopyOnWriteMultiset<DrmSessionEventListener.EventDispatcher> eventDispatchers;
    private final boolean isPlaceholderSession;
    private final HashMap<String, String> keyRequestParameters;
    private DrmSession.DrmSessionException lastException;
    private final LoadErrorHandlingPolicy loadErrorHandlingPolicy;
    private final ExoMediaDrm mediaDrm;
    private final int mode;
    private byte[] offlineLicenseKeySetId;
    private final boolean playClearSamplesWithoutKeys;
    private final Looper playbackLooper;
    private final PlayerId playerId;
    private final ProvisioningManager provisioningManager;
    private int referenceCount;
    private final ReferenceCountListener referenceCountListener;
    private RequestHandler requestHandler;
    private HandlerThread requestHandlerThread;
    private final ResponseHandler responseHandler;
    public final List<DrmInitData.SchemeData> schemeDatas;
    private byte[] sessionId;
    private int state;
    private final UUID uuid;
    private static final byte[] $$c = {81, 95, TarConstants.LF_LINK, -71};
    private static final int $$f = 52;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {8, -19, -66, -33, -66, TarConstants.LF_SYMLINK, 17, -43, 36, 4, 0, -12, 10, 0, -2, -16, -6, -10, 10, -16, -66, 67, -14, 11, 3, -13, 8, -14, 13, -51, 33, -1, 11, 5, -8, 5};
    private static final int $$e = 254;
    private static final byte[] $$a = {33, 74, 31, 28, TarConstants.LF_SYMLINK, -19, 3, 4, -48, TarConstants.LF_LINK, -2, -4, -11, -9, 17, -3, -17, 12, -50, 42, -4, 1, -17, 17, -38, 15, 15, -17, 0, 5, -5, 15, -23, 11, 24, 10, -3, -45, 42, -4, 1, -17, 17, -38, 15, 15, -17, 0, 5, -5, 15, -23, 11, -7, -11, 9, -17, -15, -6, 1};
    private static final int $$b = 84;
    private static int AudioAttributesImplApi21Parcelizer = 0;
    private static int AudioAttributesImplApi26Parcelizer = 1;
    private static int read = 1052323928;
    private static int IconCompatParcelizer = -819363117;
    private static int write = 1992797258;
    private static byte[] RemoteActionCompatParcelizer = {-123, 121, -114, -92, 91, -123, 124, -116, 119, -85, -88, TarConstants.LF_FIFO, -119, -52, 71, 118, 119, 112, -125, 123, -128, -93, 95, -82, TarConstants.LF_GNUTYPE_SPARSE, 80, -89, 72, -75, -92, -87, TarConstants.LF_PAX_EXTENDED_HEADER_UC, 84, -82, 92, -68, 69, -75, 78, -110, -111, 115, 77, -71, 65, -118, 121, 95, -95, 67, -17, 27, -62, TarConstants.LF_DIR, 27, -4, -9, 33, -21, -27, 27, -24, -25, -17, 21, 12, -13, -4, 5, 27, -44, 10, 4, -4, 2, -6, 30, 45, 28, -79, 15, 0, 60, -59, -12, -11, -14, 1, -7, 2, -29, 26, -23, 15, -30, -26, -31, -32, 28, TarConstants.LF_CHR, -47, 26, 21, -17, 28, -31, 14, -73, -73, -73, -73, -73, -73};

    public interface ProvisioningManager {
        void onProvisionCompleted();

        void onProvisionError(Exception exc, boolean z);

        void provisionRequired(DefaultDrmSession defaultDrmSession);
    }

    public interface ReferenceCountListener {
        void onReferenceCountDecremented(DefaultDrmSession defaultDrmSession, int i);

        void onReferenceCountIncremented(DefaultDrmSession defaultDrmSession, int i);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$g(int r6, int r7, short r8) {
        /*
            byte[] r0 = com.google.android.exoplayer2.drm.DefaultDrmSession.$$c
            int r8 = r8 * 4
            int r8 = r8 + 112
            int r7 = r7 * 4
            int r7 = 1 - r7
            int r6 = r6 * 4
            int r6 = 3 - r6
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L17
            r8 = r6
            r3 = r7
            r4 = r2
            goto L2e
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L25:
            int r6 = r6 + 1
            r4 = r0[r6]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2e:
            int r6 = r6 + r3
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.drm.DefaultDrmSession.$$g(int, int, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(short r5, byte r6, short r7, java.lang.Object[] r8) {
        /*
            int r6 = 119 - r6
            int r0 = 31 - r5
            int r7 = r7 + 4
            byte[] r1 = com.google.android.exoplayer2.drm.DefaultDrmSession.$$a
            byte[] r0 = new byte[r0]
            int r5 = 30 - r5
            r2 = 0
            if (r1 != 0) goto L13
            r4 = r6
            r3 = r2
            r6 = r5
            goto L27
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r5) goto L21
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L21:
            int r3 = r3 + 1
            int r7 = r7 + 1
            r4 = r1[r7]
        L27:
            int r6 = r6 + r4
            int r6 = r6 + 2
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.drm.DefaultDrmSession.a(short, byte, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(int r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 4
            int r6 = r6 + 4
            byte[] r0 = com.google.android.exoplayer2.drm.DefaultDrmSession.$$d
            int r7 = r7 * 4
            int r7 = r7 + 5
            int r8 = r8 * 8
            int r8 = 119 - r8
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r8
            r4 = r2
            r8 = r7
            goto L29
        L17:
            r3 = r2
        L18:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r7) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            r3 = r0[r6]
        L29:
            int r6 = r6 + 1
            int r8 = r8 + r3
            int r8 = r8 + 1
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.drm.DefaultDrmSession.c(int, byte, byte, java.lang.Object[]):void");
    }

    static /* synthetic */ void access$000(DefaultDrmSession defaultDrmSession, Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer + 83;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        defaultDrmSession.onProvisionResponse(obj, obj2);
        int i4 = AudioAttributesImplApi26Parcelizer + 5;
        AudioAttributesImplApi21Parcelizer = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 33 / 0;
        }
    }

    static /* synthetic */ void access$100(DefaultDrmSession defaultDrmSession, Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer + 107;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        defaultDrmSession.onKeyResponse(obj, obj2);
        if (i3 != 0) {
            throw null;
        }
        int i4 = AudioAttributesImplApi21Parcelizer + 29;
        AudioAttributesImplApi26Parcelizer = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 80 / 0;
        }
    }

    static /* synthetic */ UUID access$200(DefaultDrmSession defaultDrmSession) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi21Parcelizer;
        int i3 = i2 + 31;
        AudioAttributesImplApi26Parcelizer = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        UUID uuid = defaultDrmSession.uuid;
        if (i4 == 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 53;
        AudioAttributesImplApi26Parcelizer = i5 % 128;
        if (i5 % 2 != 0) {
            return uuid;
        }
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ MediaDrmCallback access$300(DefaultDrmSession defaultDrmSession) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi21Parcelizer + 75;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        MediaDrmCallback mediaDrmCallback = defaultDrmSession.callback;
        if (i3 == 0) {
            int i4 = 99 / 0;
        }
        return mediaDrmCallback;
    }

    static /* synthetic */ LoadErrorHandlingPolicy access$400(DefaultDrmSession defaultDrmSession) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi21Parcelizer + 11;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        LoadErrorHandlingPolicy loadErrorHandlingPolicy = defaultDrmSession.loadErrorHandlingPolicy;
        if (i3 == 0) {
            int i4 = 84 / 0;
        }
        return loadErrorHandlingPolicy;
    }

    static /* synthetic */ ResponseHandler access$500(DefaultDrmSession defaultDrmSession) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer + 37;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        ResponseHandler responseHandler = defaultDrmSession.responseHandler;
        if (i3 != 0) {
            int i4 = 22 / 0;
        }
        return responseHandler;
    }

    public static final class UnexpectedDrmSessionException extends IOException {
        public UnexpectedDrmSessionException(Throwable th) {
            super(th);
        }
    }

    public DefaultDrmSession(UUID uuid, ExoMediaDrm exoMediaDrm, ProvisioningManager provisioningManager, ReferenceCountListener referenceCountListener, List<DrmInitData.SchemeData> list, int i, boolean z, boolean z2, byte[] bArr, HashMap<String, String> map, MediaDrmCallback mediaDrmCallback, Looper looper, LoadErrorHandlingPolicy loadErrorHandlingPolicy, PlayerId playerId) {
        if (i == 1 || i == 3) {
            Assertions.checkNotNull(bArr);
            int i2 = AudioAttributesImplApi26Parcelizer + 97;
            AudioAttributesImplApi21Parcelizer = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        }
        this.uuid = uuid;
        this.provisioningManager = provisioningManager;
        this.referenceCountListener = referenceCountListener;
        this.mediaDrm = exoMediaDrm;
        this.mode = i;
        this.playClearSamplesWithoutKeys = z;
        this.isPlaceholderSession = z2;
        if (bArr == null) {
            this.schemeDatas = Collections.unmodifiableList((List) Assertions.checkNotNull(list));
        } else {
            int i5 = AudioAttributesImplApi21Parcelizer + 121;
            AudioAttributesImplApi26Parcelizer = i5 % 128;
            int i6 = i5 % 2;
            this.offlineLicenseKeySetId = bArr;
            this.schemeDatas = null;
        }
        this.keyRequestParameters = map;
        this.callback = mediaDrmCallback;
        this.eventDispatchers = new CopyOnWriteMultiset<>();
        this.loadErrorHandlingPolicy = loadErrorHandlingPolicy;
        this.playerId = playerId;
        this.state = 2;
        this.playbackLooper = looper;
        this.responseHandler = new ResponseHandler(looper);
        int i7 = AudioAttributesImplApi26Parcelizer + 115;
        AudioAttributesImplApi21Parcelizer = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 60 / 0;
        }
    }

    public boolean hasSessionId(byte[] bArr) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer + 109;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        verifyPlaybackThread();
        boolean zEquals = Arrays.equals(this.sessionId, bArr);
        int i4 = AudioAttributesImplApi26Parcelizer + 31;
        AudioAttributesImplApi21Parcelizer = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 77 / 0;
        }
        return zEquals;
    }

    void onMediaDrmEvent(int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = AudioAttributesImplApi26Parcelizer + 31;
        int i4 = i3 % 128;
        AudioAttributesImplApi21Parcelizer = i4;
        if (i3 % 2 == 0 ? i == 2 : i == 5) {
            onKeysRequired();
            return;
        }
        int i5 = i4 + 21;
        AudioAttributesImplApi26Parcelizer = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x01fb A[PHI: r0
      0x01fb: PHI (r0v9 int) = (r0v8 int), (r0v59 int) binds: [B:53:0x01f9, B:50:0x01e7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01fd A[PHI: r0
      0x01fd: PHI (r0v56 int) = (r0v8 int), (r0v59 int) binds: [B:53:0x01f9, B:50:0x01e7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void b(byte r24, int r25, int r26, short r27, int r28, java.lang.Object[] r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 790
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.drm.DefaultDrmSession.b(byte, int, int, short, int, java.lang.Object[]):void");
    }

    void provision() {
        RequestHandler requestHandler;
        ExoMediaDrm.ProvisionRequest provisionRequest;
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi21Parcelizer + 41;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        if (i2 % 2 == 0) {
            this.currentProvisionRequest = this.mediaDrm.getProvisionRequest();
            requestHandler = (RequestHandler) Util.castNonNull(this.requestHandler);
            provisionRequest = this.currentProvisionRequest;
        } else {
            this.currentProvisionRequest = this.mediaDrm.getProvisionRequest();
            requestHandler = (RequestHandler) Util.castNonNull(this.requestHandler);
            provisionRequest = this.currentProvisionRequest;
        }
        requestHandler.post(0, Assertions.checkNotNull(provisionRequest), true);
        int i3 = AudioAttributesImplApi21Parcelizer + 101;
        AudioAttributesImplApi26Parcelizer = i3 % 128;
        int i4 = i3 % 2;
    }

    void onProvisionCompleted() throws Throwable {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi21Parcelizer + 37;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        if (i2 % 2 == 0) {
            openInternal();
            throw null;
        }
        if (openInternal()) {
            doLicense(true);
            int i3 = AudioAttributesImplApi26Parcelizer + 99;
            AudioAttributesImplApi21Parcelizer = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    void onProvisionError(Exception exc, boolean z) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer + 93;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        onError(exc, z ? 1 : 3);
        int i4 = AudioAttributesImplApi26Parcelizer + 43;
        AudioAttributesImplApi21Parcelizer = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 94 / 0;
        }
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final int getState() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer + 41;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        verifyPlaybackThread();
        int i4 = this.state;
        int i5 = AudioAttributesImplApi26Parcelizer + 107;
        AudioAttributesImplApi21Parcelizer = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public boolean playClearSamplesWithoutKeys() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer + 111;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        verifyPlaybackThread();
        boolean z = this.playClearSamplesWithoutKeys;
        int i4 = AudioAttributesImplApi21Parcelizer + 113;
        AudioAttributesImplApi26Parcelizer = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 2 / 0;
        }
        return z;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final DrmSession.DrmSessionException getError() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer + 47;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        if (i2 % 2 != 0) {
            verifyPlaybackThread();
            if (this.state != 1) {
                return null;
            }
        } else {
            verifyPlaybackThread();
            if (this.state != 1) {
                return null;
            }
        }
        DrmSession.DrmSessionException drmSessionException = this.lastException;
        int i3 = AudioAttributesImplApi26Parcelizer + 113;
        AudioAttributesImplApi21Parcelizer = i3 % 128;
        int i4 = i3 % 2;
        return drmSessionException;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final UUID getSchemeUuid() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer + 27;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        if (i2 % 2 == 0) {
            verifyPlaybackThread();
            return this.uuid;
        }
        verifyPlaybackThread();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final CryptoConfig getCryptoConfig() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer + 17;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        verifyPlaybackThread();
        CryptoConfig cryptoConfig = this.cryptoConfig;
        int i4 = AudioAttributesImplApi26Parcelizer + 73;
        AudioAttributesImplApi21Parcelizer = i4 % 128;
        if (i4 % 2 == 0) {
            return cryptoConfig;
        }
        throw null;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public Map<String, String> queryKeyStatus() {
        int i = 2 % 2;
        verifyPlaybackThread();
        byte[] bArr = this.sessionId;
        if (bArr == null) {
            int i2 = AudioAttributesImplApi21Parcelizer + 83;
            AudioAttributesImplApi26Parcelizer = i2 % 128;
            int i3 = i2 % 2;
            return null;
        }
        Map<String, String> mapQueryKeyStatus = this.mediaDrm.queryKeyStatus(bArr);
        int i4 = AudioAttributesImplApi21Parcelizer + 21;
        AudioAttributesImplApi26Parcelizer = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 18 / 0;
        }
        return mapQueryKeyStatus;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public byte[] getOfflineLicenseKeySetId() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi21Parcelizer + 73;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        if (i2 % 2 != 0) {
            verifyPlaybackThread();
            byte[] bArr = this.offlineLicenseKeySetId;
            int i3 = AudioAttributesImplApi21Parcelizer + 47;
            AudioAttributesImplApi26Parcelizer = i3 % 128;
            int i4 = i3 % 2;
            return bArr;
        }
        verifyPlaybackThread();
        throw null;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public boolean requiresSecureDecoder(String str) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer + 109;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        if (i2 % 2 == 0) {
            verifyPlaybackThread();
            boolean zRequiresSecureDecoder = this.mediaDrm.requiresSecureDecoder((byte[]) Assertions.checkStateNotNull(this.sessionId), str);
            int i3 = AudioAttributesImplApi26Parcelizer + 31;
            AudioAttributesImplApi21Parcelizer = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 57 / 0;
            }
            return zRequiresSecureDecoder;
        }
        verifyPlaybackThread();
        this.mediaDrm.requiresSecureDecoder((byte[]) Assertions.checkStateNotNull(this.sessionId), str);
        throw null;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public void acquire(DrmSessionEventListener.EventDispatcher eventDispatcher) throws Throwable {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer + 79;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        verifyPlaybackThread();
        if (this.referenceCount < 0) {
            StringBuilder sb = new StringBuilder("Session reference count less than zero: ");
            sb.append(this.referenceCount);
            Log.e(TAG, sb.toString());
            this.referenceCount = 0;
        }
        if (eventDispatcher != null) {
            int i4 = AudioAttributesImplApi26Parcelizer + 113;
            AudioAttributesImplApi21Parcelizer = i4 % 128;
            if (i4 % 2 != 0) {
                this.eventDispatchers.add(eventDispatcher);
                throw null;
            }
            this.eventDispatchers.add(eventDispatcher);
            int i5 = AudioAttributesImplApi26Parcelizer + 1;
            AudioAttributesImplApi21Parcelizer = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 3 / 2;
            }
        }
        int i7 = this.referenceCount + 1;
        this.referenceCount = i7;
        if (i7 == 1) {
            Assertions.checkState(this.state == 2);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.requestHandlerThread = handlerThread;
            handlerThread.start();
            this.requestHandler = new RequestHandler(this.requestHandlerThread.getLooper());
            if (openInternal()) {
                doLicense(true);
            }
        } else if (eventDispatcher != null) {
            int i8 = AudioAttributesImplApi21Parcelizer + 49;
            AudioAttributesImplApi26Parcelizer = i8 % 128;
            if (i8 % 2 == 0) {
                isOpen();
                throw null;
            }
            if (isOpen() && this.eventDispatchers.count(eventDispatcher) == 1) {
                int i9 = AudioAttributesImplApi26Parcelizer + 9;
                AudioAttributesImplApi21Parcelizer = i9 % 128;
                int i10 = i9 % 2;
                eventDispatcher.drmSessionAcquired(this.state);
            }
        }
        this.referenceCountListener.onReferenceCountIncremented(this, this.referenceCount);
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public void release(DrmSessionEventListener.EventDispatcher eventDispatcher) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer + 13;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        verifyPlaybackThread();
        int i4 = this.referenceCount;
        Object obj = null;
        if (i4 <= 0) {
            int i5 = AudioAttributesImplApi21Parcelizer + 9;
            AudioAttributesImplApi26Parcelizer = i5 % 128;
            if (i5 % 2 != 0) {
                Log.e(TAG, "release() called on a session that's already fully released.");
                return;
            } else {
                Log.e(TAG, "release() called on a session that's already fully released.");
                obj.hashCode();
                throw null;
            }
        }
        int i6 = i4 - 1;
        this.referenceCount = i6;
        if (i6 == 0) {
            this.state = 0;
            ((ResponseHandler) Util.castNonNull(this.responseHandler)).removeCallbacksAndMessages(null);
            ((RequestHandler) Util.castNonNull(this.requestHandler)).release();
            this.requestHandler = null;
            ((HandlerThread) Util.castNonNull(this.requestHandlerThread)).quit();
            this.requestHandlerThread = null;
            this.cryptoConfig = null;
            this.lastException = null;
            this.currentKeyRequest = null;
            this.currentProvisionRequest = null;
            byte[] bArr = this.sessionId;
            if (bArr != null) {
                this.mediaDrm.closeSession(bArr);
                this.sessionId = null;
                int i7 = AudioAttributesImplApi21Parcelizer + 33;
                AudioAttributesImplApi26Parcelizer = i7 % 128;
                int i8 = i7 % 2;
            }
        }
        if (eventDispatcher != null) {
            this.eventDispatchers.remove(eventDispatcher);
            if (this.eventDispatchers.count(eventDispatcher) == 0) {
                int i9 = AudioAttributesImplApi21Parcelizer + 29;
                AudioAttributesImplApi26Parcelizer = i9 % 128;
                int i10 = i9 % 2;
                eventDispatcher.drmSessionReleased();
            }
        }
        this.referenceCountListener.onReferenceCountDecremented(this, this.referenceCount);
    }

    static /* synthetic */ void lambda$openInternal$0(int i, DrmSessionEventListener.EventDispatcher eventDispatcher) {
        int i2 = 2 % 2;
        int i3 = AudioAttributesImplApi26Parcelizer + 29;
        AudioAttributesImplApi21Parcelizer = i3 % 128;
        int i4 = i3 % 2;
        eventDispatcher.drmSessionAcquired(i);
        int i5 = AudioAttributesImplApi26Parcelizer + 3;
        AudioAttributesImplApi21Parcelizer = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean openInternal() {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            boolean r1 = r5.isOpen()
            r2 = 1
            if (r1 == 0) goto L14
            int r5 = com.google.android.exoplayer2.drm.DefaultDrmSession.AudioAttributesImplApi26Parcelizer
            int r5 = r5 + 9
            int r1 = r5 % 128
            com.google.android.exoplayer2.drm.DefaultDrmSession.AudioAttributesImplApi21Parcelizer = r1
            int r5 = r5 % r0
            return r2
        L14:
            com.google.android.exoplayer2.drm.ExoMediaDrm r1 = r5.mediaDrm     // Catch: java.lang.Exception -> L47 android.media.NotProvisionedException -> L4c
            byte[] r1 = r1.openSession()     // Catch: java.lang.Exception -> L47 android.media.NotProvisionedException -> L4c
            r5.sessionId = r1     // Catch: java.lang.Exception -> L47 android.media.NotProvisionedException -> L4c
            com.google.android.exoplayer2.drm.ExoMediaDrm r3 = r5.mediaDrm     // Catch: java.lang.Exception -> L47 android.media.NotProvisionedException -> L4c
            com.google.android.exoplayer2.analytics.PlayerId r4 = r5.playerId     // Catch: java.lang.Exception -> L47 android.media.NotProvisionedException -> L4c
            r3.setPlayerIdForSession(r1, r4)     // Catch: java.lang.Exception -> L47 android.media.NotProvisionedException -> L4c
            com.google.android.exoplayer2.drm.ExoMediaDrm r1 = r5.mediaDrm     // Catch: java.lang.Exception -> L47 android.media.NotProvisionedException -> L4c
            byte[] r3 = r5.sessionId     // Catch: java.lang.Exception -> L47 android.media.NotProvisionedException -> L4c
            com.google.android.exoplayer2.decoder.CryptoConfig r1 = r1.createCryptoConfig(r3)     // Catch: java.lang.Exception -> L47 android.media.NotProvisionedException -> L4c
            r5.cryptoConfig = r1     // Catch: java.lang.Exception -> L47 android.media.NotProvisionedException -> L4c
            r1 = 3
            r5.state = r1     // Catch: java.lang.Exception -> L47 android.media.NotProvisionedException -> L4c
            com.google.android.exoplayer2.drm.DefaultDrmSession$$ExternalSyntheticLambda0 r3 = new com.google.android.exoplayer2.drm.DefaultDrmSession$$ExternalSyntheticLambda0     // Catch: java.lang.Exception -> L47 android.media.NotProvisionedException -> L4c
            r3.<init>()     // Catch: java.lang.Exception -> L47 android.media.NotProvisionedException -> L4c
            r5.dispatchEvent(r3)     // Catch: java.lang.Exception -> L47 android.media.NotProvisionedException -> L4c
            byte[] r1 = r5.sessionId     // Catch: java.lang.Exception -> L47 android.media.NotProvisionedException -> L4c
            com.google.android.exoplayer2.util.Assertions.checkNotNull(r1)     // Catch: java.lang.Exception -> L47 android.media.NotProvisionedException -> L4c
            int r5 = com.google.android.exoplayer2.drm.DefaultDrmSession.AudioAttributesImplApi26Parcelizer
            int r5 = r5 + 53
            int r1 = r5 % 128
            com.google.android.exoplayer2.drm.DefaultDrmSession.AudioAttributesImplApi21Parcelizer = r1
            int r5 = r5 % r0
            return r2
        L47:
            r1 = move-exception
            r5.onError(r1, r2)
            goto L51
        L4c:
            com.google.android.exoplayer2.drm.DefaultDrmSession$ProvisioningManager r1 = r5.provisioningManager
            r1.provisionRequired(r5)
        L51:
            int r5 = com.google.android.exoplayer2.drm.DefaultDrmSession.AudioAttributesImplApi21Parcelizer
            int r5 = r5 + 105
            int r1 = r5 % 128
            com.google.android.exoplayer2.drm.DefaultDrmSession.AudioAttributesImplApi26Parcelizer = r1
            int r5 = r5 % r0
            if (r5 == 0) goto L5e
            r5 = 0
            return r5
        L5e:
            r5 = 0
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.drm.DefaultDrmSession.openInternal():boolean");
    }

    private void onProvisionResponse(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi21Parcelizer + 109;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 96 / 0;
            if (obj != this.currentProvisionRequest) {
                return;
            }
        } else if (obj != this.currentProvisionRequest) {
            return;
        }
        if (this.state == 2 || !(!isOpen())) {
            this.currentProvisionRequest = null;
            if (obj2 instanceof Exception) {
                int i4 = AudioAttributesImplApi21Parcelizer + 43;
                AudioAttributesImplApi26Parcelizer = i4 % 128;
                if (i4 % 2 == 0) {
                    this.provisioningManager.onProvisionError((Exception) obj2, true);
                    return;
                } else {
                    this.provisioningManager.onProvisionError((Exception) obj2, false);
                    return;
                }
            }
            try {
                this.mediaDrm.provideProvisionResponse((byte[]) obj2);
                this.provisioningManager.onProvisionCompleted();
                int i5 = AudioAttributesImplApi21Parcelizer + 81;
                AudioAttributesImplApi26Parcelizer = i5 % 128;
                int i6 = i5 % 2;
            } catch (Exception e) {
                this.provisioningManager.onProvisionError(e, true);
            }
        }
    }

    class ResponseHandler extends Handler {
        public ResponseHandler(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Pair pair = (Pair) message.obj;
            Object obj = pair.first;
            Object obj2 = pair.second;
            int i = message.what;
            if (i == 0) {
                DefaultDrmSession.access$000(DefaultDrmSession.this, obj, obj2);
            } else {
                if (i != 1) {
                    return;
                }
                DefaultDrmSession.access$100(DefaultDrmSession.this, obj, obj2);
            }
        }
    }

    class RequestHandler extends Handler {
        private boolean isReleased;

        public RequestHandler(Looper looper) {
            super(looper);
        }

        void post(int i, Object obj, boolean z) {
            obtainMessage(i, new RequestTask(LoadEventInfo.getNewId(), z, SystemClock.elapsedRealtime(), obj)).sendToTarget();
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Object objExecuteProvisionRequest;
            RequestTask requestTask = (RequestTask) message.obj;
            try {
                int i = message.what;
                if (i == 0) {
                    objExecuteProvisionRequest = DefaultDrmSession.access$300(DefaultDrmSession.this).executeProvisionRequest(DefaultDrmSession.access$200(DefaultDrmSession.this), (ExoMediaDrm.ProvisionRequest) requestTask.request);
                } else if (i == 1) {
                    objExecuteProvisionRequest = DefaultDrmSession.access$300(DefaultDrmSession.this).executeKeyRequest(DefaultDrmSession.access$200(DefaultDrmSession.this), (ExoMediaDrm.KeyRequest) requestTask.request);
                } else {
                    throw new RuntimeException();
                }
            } catch (MediaDrmCallbackException e) {
                boolean zMaybeRetryRequest = maybeRetryRequest(message, e);
                objExecuteProvisionRequest = e;
                if (zMaybeRetryRequest) {
                    return;
                }
            } catch (Exception e2) {
                Log.w(DefaultDrmSession.TAG, "Key/provisioning request produced an unexpected exception. Not retrying.", e2);
                objExecuteProvisionRequest = e2;
            }
            DefaultDrmSession.access$400(DefaultDrmSession.this).onLoadTaskConcluded(requestTask.taskId);
            synchronized (this) {
                if (!this.isReleased) {
                    DefaultDrmSession.access$500(DefaultDrmSession.this).obtainMessage(message.what, Pair.create(requestTask.request, objExecuteProvisionRequest)).sendToTarget();
                }
            }
        }

        private boolean maybeRetryRequest(Message message, MediaDrmCallbackException mediaDrmCallbackException) {
            IOException unexpectedDrmSessionException;
            RequestTask requestTask = (RequestTask) message.obj;
            if (!requestTask.allowRetry) {
                return false;
            }
            requestTask.errorCount++;
            if (requestTask.errorCount > DefaultDrmSession.access$400(DefaultDrmSession.this).getMinimumLoadableRetryCount(3)) {
                return false;
            }
            LoadEventInfo loadEventInfo = new LoadEventInfo(requestTask.taskId, mediaDrmCallbackException.dataSpec, mediaDrmCallbackException.uriAfterRedirects, mediaDrmCallbackException.responseHeaders, SystemClock.elapsedRealtime(), SystemClock.elapsedRealtime() - requestTask.startTimeMs, mediaDrmCallbackException.bytesLoaded);
            MediaLoadData mediaLoadData = new MediaLoadData(3);
            if (mediaDrmCallbackException.getCause() instanceof IOException) {
                unexpectedDrmSessionException = (IOException) mediaDrmCallbackException.getCause();
            } else {
                unexpectedDrmSessionException = new UnexpectedDrmSessionException(mediaDrmCallbackException.getCause());
            }
            long retryDelayMsFor = DefaultDrmSession.access$400(DefaultDrmSession.this).getRetryDelayMsFor(new LoadErrorHandlingPolicy.LoadErrorInfo(loadEventInfo, mediaLoadData, unexpectedDrmSessionException, requestTask.errorCount));
            if (retryDelayMsFor == C.TIME_UNSET) {
                return false;
            }
            synchronized (this) {
                if (this.isReleased) {
                    return false;
                }
                sendMessageDelayed(Message.obtain(message), retryDelayMsFor);
                return true;
            }
        }

        public void release() {
            synchronized (this) {
                removeCallbacksAndMessages(null);
                this.isReleased = true;
            }
        }
    }

    static final class RequestTask {
        public final boolean allowRetry;
        public int errorCount;
        public final Object request;
        public final long startTimeMs;
        public final long taskId;

        public RequestTask(long j, boolean z, long j2, Object obj) {
            this.taskId = j;
            this.allowRetry = z;
            this.startTimeMs = j2;
            this.request = obj;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x1007  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void doLicense(boolean r42) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 5247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.drm.DefaultDrmSession.doLicense(boolean):void");
    }

    private boolean restoreKeys() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi21Parcelizer + 115;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        try {
            this.mediaDrm.restoreKeys(this.sessionId, this.offlineLicenseKeySetId);
            int i4 = AudioAttributesImplApi26Parcelizer + 113;
            AudioAttributesImplApi21Parcelizer = i4 % 128;
            int i5 = i4 % 2;
            return true;
        } catch (Exception e) {
            onError(e, 1);
            return false;
        }
    }

    private long getLicenseDurationRemainingSec() {
        int i = 2 % 2;
        if (!C.WIDEVINE_UUID.equals(this.uuid)) {
            int i2 = AudioAttributesImplApi21Parcelizer + 91;
            AudioAttributesImplApi26Parcelizer = i2 % 128;
            int i3 = i2 % 2;
            return Long.MAX_VALUE;
        }
        Pair pair = (Pair) Assertions.checkNotNull(WidevineUtil.getLicenseDurationRemainingSec(this));
        long jMin = Math.min(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
        int i4 = AudioAttributesImplApi21Parcelizer + 45;
        AudioAttributesImplApi26Parcelizer = i4 % 128;
        if (i4 % 2 != 0) {
            return jMin;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void postKeyRequest(byte[] bArr, int i, boolean z) throws Throwable {
        Object[] objArr;
        Object[] objArrRemoteActionCompatParcelizer$102327b9;
        int i2 = 2 % 2;
        int i3 = AudioAttributesImplApi21Parcelizer + 79;
        AudioAttributesImplApi26Parcelizer = i3 % 128;
        int i4 = i3 % 2;
        Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1653039781);
        if (objRemoteActionCompatParcelizer == null) {
            char cMyTid = (char) (Process.myTid() >> 22);
            int iResolveSize = View.resolveSize(0, 0) + 943;
            int iIndexOf = 36 - TextUtils.indexOf("", "");
            byte[] bArr2 = $$a;
            byte b = bArr2[28];
            Object[] objArr2 = new Object[1];
            a(b, (byte) (b | TarConstants.LF_FIFO), (byte) (-bArr2[21]), objArr2);
            objRemoteActionCompatParcelizer = startForeground.read(cMyTid, iResolveSize, iIndexOf, -483305010, false, (String) objArr2[0], null);
        }
        long j = ((Field) objRemoteActionCompatParcelizer).getLong(null);
        Object[] objArr3 = new Object[1];
        b((byte) (57 - TextUtils.indexOf((CharSequence) "", '0', 0)), 1175572836 - (ViewConfiguration.getWindowTouchSlop() >> 8), TextUtils.lastIndexOf("", '0') + 242175250, (short) (ViewConfiguration.getJumpTapTimeout() >> 16), (-78) - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        b((byte) (Color.argb(0, 0, 0, 0) - 20), (ViewConfiguration.getTouchSlop() >> 8) + 1175572840, Color.blue(0) + 242175270, (short) TextUtils.getOffsetBefore("", 0), (-85) - (ViewConfiguration.getLongPressTimeout() >> 16), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(1457787787);
        if (objRemoteActionCompatParcelizer2 == null) {
            char cMyPid = (char) (Process.myPid() >> 22);
            int iArgb = Color.argb(0, 0, 0, 0) + 943;
            int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0') + 37;
            Object[] objArr5 = new Object[1];
            a(r16[33], (byte) 46, (byte) ($$a[3] + 1), objArr5);
            objRemoteActionCompatParcelizer2 = startForeground.read(cMyPid, iArgb, iIndexOf2, 682481438, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objRemoteActionCompatParcelizer2).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(1839665188);
            if (objRemoteActionCompatParcelizer3 == null) {
                char packedPositionType = (char) ExpandableListView.getPackedPositionType(0L);
                int iRgb = (-16776273) - Color.rgb(0, 0, 0);
                int i5 = 37 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                Object[] objArr6 = new Object[1];
                a((byte) 26, r19[28], (byte) (-$$a[8]), objArr6);
                objRemoteActionCompatParcelizer3 = startForeground.read(packedPositionType, iRgb, i5, 334419121, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objRemoteActionCompatParcelizer3).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
            int i6 = (int) Runtime.getRuntime().totalMemory();
            int i7 = (~(621911757 | i6)) | 134479872;
            int i8 = ~i6;
            int i9 = ((((-232214393) + (((~(i8 | (-1083401))) | i7) * 886)) + (((~(i8 | (-621911758))) | 755308229) * (-1772))) + ((~(i8 | 755308229)) * 886)) - 364067188;
            int i10 = (i9 << 13) ^ i9;
            int i11 = i10 ^ (i10 >>> 17);
            ((int[]) objArr[1])[0] = i11 ^ (i11 << 5);
        } else {
            try {
                Object[] objArr8 = {-593395138};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(631003353);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) Color.red(0), (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 1115, ((Process.getThreadPriority(0) + 20) >> 6) + 24, 1540725836, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr9 = {Integer.valueOf(i), 0, -364067188, ((Constructor) objRemoteActionCompatParcelizer4).newInstance(objArr8), false};
                Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-876981243);
                if (objRemoteActionCompatParcelizer5 == null) {
                    char c = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                    int i12 = 943 - (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
                    int deadChar = KeyEvent.getDeadChar(0, 0) + 36;
                    Object[] objArr10 = new Object[1];
                    a(r9[33], (byte) 46, (byte) ($$a[3] + 1), objArr10);
                    objRemoteActionCompatParcelizer5 = startForeground.read(c, i12, deadChar, -1242328944, false, (String) objArr10[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) startForeground.IconCompatParcelizer((char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), ExpandableListView.getPackedPositionChild(0L) + 1059, (ViewConfiguration.getFadingEdgeLength() >> 16) + 57), Boolean.TYPE});
                }
                objArr = (Object[]) ((Method) objRemoteActionCompatParcelizer5).invoke(null, objArr9);
                Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(1839665188);
                if (objRemoteActionCompatParcelizer6 == null) {
                    char cIndexOf = (char) TextUtils.indexOf("", "");
                    int scrollBarFadeDuration = 943 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                    int iIndexOf3 = 36 - TextUtils.indexOf("", "");
                    Object[] objArr11 = new Object[1];
                    a((byte) 26, r8[28], (byte) (-$$a[8]), objArr11);
                    objRemoteActionCompatParcelizer6 = startForeground.read(cIndexOf, scrollBarFadeDuration, iIndexOf3, 334419121, false, (String) objArr11[0], null);
                }
                ((Field) objRemoteActionCompatParcelizer6).set(null, objArr);
                try {
                    Object[] objArr12 = new Object[1];
                    b((byte) (58 - (ViewConfiguration.getWindowTouchSlop() >> 8)), 1175572835 - TextUtils.indexOf((CharSequence) "", '0'), (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 242175249, (short) (TextUtils.lastIndexOf("", '0') + 1), (ViewConfiguration.getLongPressTimeout() >> 16) - 78, objArr12);
                    Class<?> cls2 = Class.forName((String) objArr12[0]);
                    Object[] objArr13 = new Object[1];
                    b((byte) ((Process.myTid() >> 22) - 20), 1175572841 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 242175270, (short) (TextUtils.lastIndexOf("", '0') + 1), (-85) - (ViewConfiguration.getEdgeSlop() >> 16), objArr13);
                    long jLongValue2 = ((Long) cls2.getDeclaredMethod((String) objArr13[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(1457787787);
                    if (objRemoteActionCompatParcelizer7 == null) {
                        char c2 = (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                        int iRgb2 = Color.rgb(0, 0, 0) + 16778159;
                        int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 37;
                        Object[] objArr14 = new Object[1];
                        a(r11[33], (byte) 46, (byte) ($$a[3] + 1), objArr14);
                        objRemoteActionCompatParcelizer7 = startForeground.read(c2, iRgb2, packedPositionChild, 682481438, false, (String) objArr14[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objRemoteActionCompatParcelizer8 = startForeground.RemoteActionCompatParcelizer(-1653039781);
                    if (objRemoteActionCompatParcelizer8 == null) {
                        int i13 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 942;
                        int modifierMetaStateMask = 35 - ((byte) KeyEvent.getModifierMetaStateMask());
                        byte[] bArr3 = $$a;
                        byte b2 = bArr3[28];
                        Object[] objArr15 = new Object[1];
                        a(b2, (byte) (b2 | TarConstants.LF_FIFO), (byte) (-bArr3[21]), objArr15);
                        objRemoteActionCompatParcelizer8 = startForeground.read((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), i13, modifierMetaStateMask, -483305010, false, (String) objArr15[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer8).set(null, lValueOf2);
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        int i14 = ((int[]) objArr[2])[0];
        int i15 = ((int[]) objArr[0])[0];
        try {
            if (i15 != i14) {
                ArrayList arrayList = new ArrayList();
                String[] strArr = (String[]) objArr[3];
                if (strArr != null) {
                    int i16 = AudioAttributesImplApi26Parcelizer + 105;
                    AudioAttributesImplApi21Parcelizer = i16 % 128;
                    int i17 = i16 % 2;
                    for (String str : strArr) {
                        arrayList.add(str);
                    }
                }
                Object[] objArr16 = new Object[1];
                b((byte) ((TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) - 72), Color.rgb(0, 0, 0) + 1192350052, 242175314 - View.MeasureSpec.makeMeasureSpec(0, 0), (short) ExpandableListView.getPackedPositionGroup(0L), TextUtils.indexOf((CharSequence) "", '0') - 73, objArr16);
                Class<?> cls3 = Class.forName((String) objArr16[0]);
                Object[] objArr17 = new Object[1];
                b((byte) ((TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) - 85), 1175572839 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 242175339 - TextUtils.indexOf("", "", 0), (short) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), Color.red(0) - 82, objArr17);
                Context applicationContext = (Context) cls3.getMethod((String) objArr17[0], new Class[0]).invoke(null, null);
                if (applicationContext != null) {
                    applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
                }
                if (Looper.myLooper() == null) {
                    int i18 = AudioAttributesImplApi21Parcelizer + 61;
                    AudioAttributesImplApi26Parcelizer = i18 % 128;
                    int i19 = i18 % 2;
                    applicationContext = null;
                }
                long j2 = i14 ^ i15;
                long j3 = -1;
                Object[] objArr18 = {applicationContext, Long.valueOf((((((long) 0) << 32) | (j3 - ((j3 >> 63) << 32))) & j2) ^ 4431629405852270592L), 1031819126L};
                byte[] bArr4 = $$d;
                Object[] objArr19 = new Object[1];
                c(bArr4[10], (byte) (-bArr4[14]), (byte) (-bArr4[31]), objArr19);
                Class<?> cls4 = Class.forName((String) objArr19[0]);
                byte b3 = bArr4[24];
                byte b4 = bArr4[10];
                Object[] objArr20 = new Object[1];
                c(b3, b4, b4, objArr20);
                cls4.getMethod((String) objArr20[0], Context.class, Long.TYPE, Long.TYPE).invoke(null, objArr18);
                int i20 = ((int[]) objArr[1])[0];
                Object[] objArr21 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
                int i21 = ~System.identityHashCode(this);
                int i22 = i20 + 1563739587 + ((~((-136618049) | i21)) * 52) + (((~(383327036 | i21)) | (~(249930564 | i21)) | (-519945085)) * (-52)) + (((~(i21 | (-383327037))) | 113312516) * 52);
                int i23 = (i22 << 13) ^ i22;
                int i24 = i23 ^ (i23 >>> 17);
                ((int[]) objArr21[1])[0] = i24 ^ (i24 << 5);
                long j4 = -1;
                long j5 = j2 & ((((long) 0) << 32) | (j4 - ((j4 >> 63) << 32)));
                long j6 = 0;
                long j7 = j5 | (((long) 1) << 32) | (j6 - ((j6 >> 63) << 32));
                Object objRemoteActionCompatParcelizer9 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer9 == null) {
                    objRemoteActionCompatParcelizer9 = startForeground.read((char) (Process.getGidForName("") + 4536), 6055 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (ViewConfiguration.getPressedStateDuration() >> 16) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer9).invoke(null, null);
                Object[] objArr22 = {-593395138, Long.valueOf(j7), arrayList, TrainingApplication.RemoteActionCompatParcelizer(), false, false};
                Object objRemoteActionCompatParcelizer10 = startForeground.RemoteActionCompatParcelizer(1458445422);
                if (objRemoteActionCompatParcelizer10 == null) {
                    objRemoteActionCompatParcelizer10 = startForeground.read((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), 6030 - (ViewConfiguration.getJumpTapTimeout() >> 16), 24 - (ViewConfiguration.getScrollBarSize() >> 8), 682088699, false, "IconCompatParcelizer", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
                }
                ((Method) objRemoteActionCompatParcelizer10).invoke(objInvoke, objArr22);
                int i25 = ((int[]) objArr21[1])[0];
                Object[] objArr23 = {new int[]{((int[]) objArr21[0])[0]}, new int[1], new int[]{((int[]) objArr21[2])[0]}, (String[]) objArr21[3]};
                int iUptimeMillis = (int) SystemClock.uptimeMillis();
                int i26 = i25 + (-329330145) + (((~(702856306 | iUptimeMillis)) | 1130504 | (~((-569459835) | iUptimeMillis))) * (-744)) + (((~iUptimeMillis) | 134526976) * 744) + ((iUptimeMillis | (-1130505)) * 744);
                int i27 = (i26 << 13) ^ i26;
                int i28 = i27 ^ (i27 >>> 17);
                ((int[]) objArr23[1])[0] = i28 ^ (i28 << 5);
                throw null;
            }
            int i29 = ((int[]) objArr[1])[0];
            Object[] objArr24 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            int i30 = ~elapsedCpuTime;
            int i31 = (~((-51086019) | i30)) | 50856642 | (~(82310453 | i30));
            int i32 = i29 + (-1109150995) + (((~(elapsedCpuTime | (-82081078))) | i31) * 590) + (i31 * (-1180)) + (((~((-82310454) | i30)) | (~(i30 | 51086018))) * 590);
            int i33 = (i32 << 13) ^ i32;
            int i34 = i33 ^ (i33 >>> 17);
            ((int[]) objArr24[1])[0] = i34 ^ (i34 << 5);
            int i35 = ((int[]) objArr24[1])[0];
            Object[] objArr25 = {new int[]{((int[]) objArr24[0])[0]}, new int[1], new int[]{((int[]) objArr24[2])[0]}, (String[]) objArr24[3]};
            int iUptimeMillis2 = (int) SystemClock.uptimeMillis();
            int i36 = ~iUptimeMillis2;
            int i37 = ~(572733339 | i36);
            int i38 = i35 + 1093914815 + (((-976207804) | i37) * (-712)) + (((~(iUptimeMillis2 | (-403474465))) | (~(i36 | 976207803))) * (-712)) + ((439336867 | i37) * 712);
            int i39 = (i38 << 13) ^ i38;
            int i40 = i39 ^ (i39 >>> 17);
            ((int[]) objArr25[1])[0] = i40 ^ (i40 << 5);
            int i41 = ((int[]) objArr25[1])[0];
            Object[] objArr26 = {new int[]{((int[]) objArr25[0])[0]}, new int[1], new int[]{((int[]) objArr25[2])[0]}, (String[]) objArr25[3]};
            int elapsedCpuTime2 = (int) Process.getElapsedCpuTime();
            int i42 = (~(362306295 | elapsedCpuTime2)) | 134447112;
            int i43 = ~elapsedCpuTime2;
            int i44 = i41 + 1226202267 + ((i42 | (~((-1050641) | i43))) * 886) + (((~(i43 | (-362306296))) | 495702767) * (-1772)) + ((~(i43 | 495702767)) * 886);
            int i45 = (i44 << 13) ^ i44;
            int i46 = i45 ^ (i45 >>> 17);
            ((int[]) objArr26[1])[0] = i46 ^ (i46 << 5);
            Object objRemoteActionCompatParcelizer11 = startForeground.RemoteActionCompatParcelizer(2009612874);
            if (objRemoteActionCompatParcelizer11 == null) {
                char absoluteGravity = (char) (Gravity.getAbsoluteGravity(0, 0) + 13183);
                int iRgb3 = Color.rgb(0, 0, 0) + 16778865;
                int iResolveOpacity = 26 - Drawable.resolveOpacity(0, 0);
                Object[] objArr27 = new Object[1];
                a((byte) ($$a[3] - 1), r4[29], (byte) 52, objArr27);
                objRemoteActionCompatParcelizer11 = startForeground.read(absoluteGravity, iRgb3, iResolveOpacity, 159483615, false, (String) objArr27[0], null);
            }
            long j8 = ((Field) objRemoteActionCompatParcelizer11).getLong(null);
            Object[] objArr28 = new Object[1];
            b((byte) (58 - (ViewConfiguration.getWindowTouchSlop() >> 8)), 1175572836 - (ViewConfiguration.getJumpTapTimeout() >> 16), 242175249 - (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (short) Drawable.resolveOpacity(0, 0), (-78) - View.resolveSize(0, 0), objArr28);
            Class<?> cls5 = Class.forName((String) objArr28[0]);
            Object[] objArr29 = new Object[1];
            b((byte) ((-20) - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), ExpandableListView.getPackedPositionChild(0L) + 1175572841, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 242175270, (short) View.MeasureSpec.getMode(0), (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) - 85, objArr29);
            long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr29[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objRemoteActionCompatParcelizer12 = startForeground.RemoteActionCompatParcelizer(1862466905);
            if (objRemoteActionCompatParcelizer12 == null) {
                char c3 = (char) (13184 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                int capsMode = 1649 - TextUtils.getCapsMode("", 0, 0);
                int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 27;
                Object[] objArr30 = new Object[1];
                a((byte) 26, r15[28], (byte) (-$$a[8]), objArr30);
                objRemoteActionCompatParcelizer12 = startForeground.read(c3, capsMode, iLastIndexOf, 290142668, false, (String) objArr30[0], null);
            }
            if (j8 == ((jLongValue3 - ((((Field) objRemoteActionCompatParcelizer12).getLong(null) << 52) >>> 52)) >> 12)) {
                int i47 = AudioAttributesImplApi26Parcelizer + 91;
                AudioAttributesImplApi21Parcelizer = i47 % 128;
                int i48 = i47 % 2;
                Object objRemoteActionCompatParcelizer13 = startForeground.RemoteActionCompatParcelizer(1029620304);
                if (objRemoteActionCompatParcelizer13 == null) {
                    char size = (char) (View.MeasureSpec.getSize(0) + 13183);
                    int iMyTid = 1649 - (Process.myTid() >> 22);
                    int offsetBefore = TextUtils.getOffsetBefore("", 0) + 26;
                    byte[] bArr5 = $$a;
                    byte b5 = bArr5[28];
                    Object[] objArr31 = new Object[1];
                    a(b5, (byte) (b5 | TarConstants.LF_FIFO), (byte) (-bArr5[21]), objArr31);
                    objRemoteActionCompatParcelizer13 = startForeground.read(size, iMyTid, offsetBefore, 1125582533, false, (String) objArr31[0], null);
                }
                Object[] objArr32 = (Object[]) ((Field) objRemoteActionCompatParcelizer13).get(null);
                objArrRemoteActionCompatParcelizer$102327b9 = new Object[]{strArr, new int[1], new int[]{i}, new int[]{i}};
                int i49 = ((int[]) objArr32[2])[0];
                int i50 = ((int[]) objArr32[3])[0];
                String[] strArr2 = (String[]) objArr32[0];
                int i51 = ((((1635862549 | r3) * (-658)) - 1856633075) + (((~(((int) Runtime.getRuntime().maxMemory()) | 731399644)) | 1073809409) * 658)) - 405849721;
                int i52 = (i51 << 13) ^ i51;
                int i53 = i52 ^ (i52 >>> 17);
                ((int[]) objArrRemoteActionCompatParcelizer$102327b9[1])[0] = i53 ^ (i53 << 5);
            } else {
                Object[] objArr33 = {-593395138};
                Object objRemoteActionCompatParcelizer14 = startForeground.RemoteActionCompatParcelizer(-725118424);
                if (objRemoteActionCompatParcelizer14 == null) {
                    objRemoteActionCompatParcelizer14 = startForeground.read((char) (ImageFormat.getBitsPerPixel(0) + 53911), 1630 - (ViewConfiguration.getPressedStateDuration() >> 16), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 19, -1433512259, false, null, new Class[]{Integer.TYPE});
                }
                objArrRemoteActionCompatParcelizer$102327b9 = firstKnownRubyPosition.RemoteActionCompatParcelizer$102327b9(i, ((Constructor) objRemoteActionCompatParcelizer14).newInstance(objArr33));
                Object objRemoteActionCompatParcelizer15 = startForeground.RemoteActionCompatParcelizer(1029620304);
                if (objRemoteActionCompatParcelizer15 == null) {
                    char c4 = (char) ((PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 13183);
                    int keyRepeatTimeout = 1649 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                    int iIndexOf4 = TextUtils.indexOf((CharSequence) "", '0') + 27;
                    byte[] bArr6 = $$a;
                    byte b6 = bArr6[28];
                    Object[] objArr34 = new Object[1];
                    a(b6, (byte) (b6 | TarConstants.LF_FIFO), (byte) (-bArr6[21]), objArr34);
                    objRemoteActionCompatParcelizer15 = startForeground.read(c4, keyRepeatTimeout, iIndexOf4, 1125582533, false, (String) objArr34[0], null);
                }
                ((Field) objRemoteActionCompatParcelizer15).set(null, objArrRemoteActionCompatParcelizer$102327b9);
                try {
                    Object[] objArr35 = new Object[1];
                    b((byte) (57 - TextUtils.lastIndexOf("", '0', 0)), KeyEvent.keyCodeFromString("") + 1175572836, 242175249 - (ViewConfiguration.getScrollBarSize() >> 8), (short) (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (-78) - KeyEvent.getDeadChar(0, 0), objArr35);
                    Class<?> cls6 = Class.forName((String) objArr35[0]);
                    Object[] objArr36 = new Object[1];
                    b((byte) ((-20) - (ViewConfiguration.getJumpTapTimeout() >> 16)), 1175572840 + View.resolveSizeAndState(0, 0, 0), 242175270 - TextUtils.getCapsMode("", 0, 0), (short) View.getDefaultSize(0, 0), (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) - 85, objArr36);
                    long jLongValue4 = ((Long) cls6.getDeclaredMethod((String) objArr36[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf3 = Long.valueOf(jLongValue4);
                    Object objRemoteActionCompatParcelizer16 = startForeground.RemoteActionCompatParcelizer(1862466905);
                    if (objRemoteActionCompatParcelizer16 == null) {
                        char maximumDrawingCacheSize = (char) (13183 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                        int i54 = (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 1649;
                        int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 26;
                        Object[] objArr37 = new Object[1];
                        a((byte) 26, r13[28], (byte) (-$$a[8]), objArr37);
                        objRemoteActionCompatParcelizer16 = startForeground.read(maximumDrawingCacheSize, i54, tapTimeout, 290142668, false, (String) objArr37[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer16).set(null, lValueOf3);
                    Long lValueOf4 = Long.valueOf(jLongValue4 >> 12);
                    Object objRemoteActionCompatParcelizer17 = startForeground.RemoteActionCompatParcelizer(2009612874);
                    if (objRemoteActionCompatParcelizer17 == null) {
                        char scrollBarFadeDuration2 = (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 13183);
                        int iMyPid = 1649 - (Process.myPid() >> 22);
                        int minimumFlingVelocity = 26 + (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                        Object[] objArr38 = new Object[1];
                        a((byte) ($$a[3] - 1), r4[29], (byte) 52, objArr38);
                        objRemoteActionCompatParcelizer17 = startForeground.read(scrollBarFadeDuration2, iMyPid, minimumFlingVelocity, 159483615, false, (String) objArr38[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer17).set(null, lValueOf4);
                } catch (Exception unused2) {
                    throw new RuntimeException();
                }
            }
            int i55 = ((int[]) objArrRemoteActionCompatParcelizer$102327b9[3])[0];
            int i56 = ((int[]) objArrRemoteActionCompatParcelizer$102327b9[2])[0];
            if (i56 != i55) {
                ArrayList arrayList2 = new ArrayList();
                String[] strArr3 = (String[]) objArrRemoteActionCompatParcelizer$102327b9[0];
                if (strArr3 != null) {
                    for (String str2 : strArr3) {
                        arrayList2.add(str2);
                    }
                }
                Object[] objArr39 = new Object[1];
                b((byte) ((-73) - Process.getGidForName("")), 1175572835 - TextUtils.indexOf((CharSequence) "", '0'), 242175314 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (short) (ViewConfiguration.getDoubleTapTimeout() >> 16), TextUtils.getCapsMode("", 0, 0) - 74, objArr39);
                Class<?> cls7 = Class.forName((String) objArr39[0]);
                Object[] objArr40 = new Object[1];
                b((byte) (Color.green(0) - 85), 1175572838 - (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 242175338 + (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (short) (ExpandableListView.getPackedPositionChild(0L) + 1), (-82) - (ViewConfiguration.getTapTimeout() >> 16), objArr40);
                Context applicationContext2 = (Context) cls7.getMethod((String) objArr40[0], new Class[0]).invoke(null, null);
                if (applicationContext2 != null) {
                    applicationContext2 = (((applicationContext2 instanceof ContextWrapper) ^ true) || ((ContextWrapper) applicationContext2).getBaseContext() != null) ? applicationContext2.getApplicationContext() : null;
                }
                if (Looper.myLooper() == null) {
                    int i57 = AudioAttributesImplApi26Parcelizer + 57;
                    AudioAttributesImplApi21Parcelizer = i57 % 128;
                    int i58 = i57 % 2;
                    applicationContext2 = null;
                }
                long j9 = i55 ^ i56;
                long j10 = -1;
                Object[] objArr41 = {applicationContext2, Long.valueOf((((((long) 0) << 32) | (j10 - ((j10 >> 63) << 32))) & j9) ^ (-4861516809972482048L)), -1131910086L};
                byte[] bArr7 = $$d;
                Object[] objArr42 = new Object[1];
                c(bArr7[9], bArr7[24], (byte) (-bArr7[31]), objArr42);
                Class<?> cls8 = Class.forName((String) objArr42[0]);
                byte b7 = bArr7[24];
                byte b8 = bArr7[10];
                Object[] objArr43 = new Object[1];
                c(b7, b8, b8, objArr43);
                cls8.getMethod((String) objArr43[0], Context.class, Long.TYPE, Long.TYPE).invoke(null, objArr41);
                Object[] objArr44 = {strArr, new int[1], new int[]{i}, new int[]{i}};
                int i59 = ((int[]) objArrRemoteActionCompatParcelizer$102327b9[1])[0];
                int i60 = ((int[]) objArrRemoteActionCompatParcelizer$102327b9[2])[0];
                int i61 = ((int[]) objArrRemoteActionCompatParcelizer$102327b9[3])[0];
                String[] strArr4 = (String[]) objArrRemoteActionCompatParcelizer$102327b9[0];
                int i62 = i59 + (((~(r2 | 1824186921)) * UnixStat.DEFAULT_FILE_PERM) - 1817796883) + (((~((~Process.myTid()) | 1824186921)) | 145907752) * UnixStat.DEFAULT_FILE_PERM);
                int i63 = (i62 << 13) ^ i62;
                int i64 = i63 ^ (i63 >>> 17);
                ((int[]) objArr44[1])[0] = i64 ^ (i64 << 5);
                long j11 = -1;
                long j12 = j9 & ((((long) 0) << 32) | (j11 - ((j11 >> 63) << 32)));
                long j13 = 0;
                long j14 = j12 | (((long) 2) << 32) | (j13 - ((j13 >> 63) << 32));
                Object objRemoteActionCompatParcelizer18 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer18 == null) {
                    objRemoteActionCompatParcelizer18 = startForeground.read((char) ((-16772681) - Color.rgb(0, 0, 0)), 6054 - KeyEvent.getDeadChar(0, 0), 42 - View.resolveSize(0, 0), -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke2 = ((Method) objRemoteActionCompatParcelizer18).invoke(null, null);
                Object[] objArr45 = {-593395138, Long.valueOf(j14), arrayList2, TrainingApplication.RemoteActionCompatParcelizer(), false, false};
                Object objRemoteActionCompatParcelizer19 = startForeground.RemoteActionCompatParcelizer(1458445422);
                if (objRemoteActionCompatParcelizer19 == null) {
                    objRemoteActionCompatParcelizer19 = startForeground.read((char) TextUtils.getCapsMode("", 0, 0), (ViewConfiguration.getLongPressTimeout() >> 16) + 6030, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 23, 682088699, false, "IconCompatParcelizer", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
                }
                ((Method) objRemoteActionCompatParcelizer19).invoke(objInvoke2, objArr45);
                int i65 = ((int[]) objArr44[1])[0];
                int i66 = ((int[]) objArr44[2])[0];
                int i67 = ((int[]) objArr44[3])[0];
                new int[1][0] = i66;
                new int[1][0] = i67;
                int i68 = ~i;
                int i69 = i65 + 1428326529 + (((~((-1337092285) | i68)) | (-637463274) | (~(1337092284 | i))) * (-564)) + ((~(i | (-541884994))) * 1128) + (((~((-637463274) | i68)) | (-1878977278)) * 564);
                int i70 = (i69 << 13) ^ i69;
                int i71 = i70 ^ (i70 >>> 17);
                int[] iArr = {i71 ^ (i71 << 5)};
                throw new RuntimeException(String.valueOf(i56));
            }
            Object[] objArr46 = {strArr, new int[1], new int[]{i}, new int[]{i}};
            int i72 = ((int[]) objArrRemoteActionCompatParcelizer$102327b9[1])[0];
            int i73 = ((int[]) objArrRemoteActionCompatParcelizer$102327b9[2])[0];
            int i74 = ((int[]) objArrRemoteActionCompatParcelizer$102327b9[3])[0];
            String[] strArr5 = (String[]) objArrRemoteActionCompatParcelizer$102327b9[0];
            int startUptimeMillis = (int) Process.getStartUptimeMillis();
            int i75 = ~startUptimeMillis;
            int i76 = (~((-890645188) | i75)) | 889455105;
            int i77 = ~(startUptimeMillis | (-1082720289));
            int i78 = i72 + 1615433550 + ((i76 | i77) * (-713)) + (i77 * 1426) + ((~((-1083910371) | i75)) * 713);
            int i79 = (i78 << 13) ^ i78;
            int i80 = i79 ^ (i79 >>> 17);
            ((int[]) objArr46[1])[0] = i80 ^ (i80 << 5);
            Object[] objArr47 = {strArr, new int[1], new int[]{i}, new int[]{i}};
            int i81 = ((int[]) objArr46[1])[0];
            int i82 = ((int[]) objArr46[2])[0];
            int i83 = ((int[]) objArr46[3])[0];
            String[] strArr6 = (String[]) objArr46[0];
            int iIdentityHashCode = System.identityHashCode(this);
            int i84 = ~(950235037 | iIdentityHashCode);
            int i85 = i81 + 1863972647 + ((84705280 | i84) * (-814)) + ((i84 | (~((~iIdentityHashCode) | (-1024320521))) | 10619797) * 407) + (((~(iIdentityHashCode | 1024320520)) | (~((-950235038) | iIdentityHashCode)) | 10619797) * 407);
            int i86 = (i85 << 13) ^ i85;
            int i87 = i86 ^ (i86 >>> 17);
            ((int[]) objArr47[1])[0] = i87 ^ (i87 << 5);
            Object[] objArr48 = {strArr, new int[1], new int[]{i}, new int[]{i}};
            int i88 = ((int[]) objArr47[1])[0];
            int i89 = ((int[]) objArr47[2])[0];
            int i90 = ((int[]) objArr47[3])[0];
            String[] strArr7 = (String[]) objArr47[0];
            int i91 = ~System.identityHashCode(this);
            int i92 = i88 + (-236826319) + ((~(1834562427 | i91)) * 52) + (((~(223883579 | i91)) | (~((-1750671979) | i91)) | 1610678848) * (-52)) + (((~(i91 | (-223883580))) | 83890449) * 52);
            int i93 = (i92 << 13) ^ i92;
            int i94 = i93 ^ (i93 >>> 17);
            ((int[]) objArr48[1])[0] = i94 ^ (i94 << 5);
            try {
                this.currentKeyRequest = this.mediaDrm.getKeyRequest(bArr, this.schemeDatas, i, this.keyRequestParameters);
                RequestHandler requestHandler = (RequestHandler) Util.castNonNull(this.requestHandler);
                ExoMediaDrm.KeyRequest keyRequest = this.currentKeyRequest;
                int i95 = ((int[]) objArr26[1])[0];
                int i96 = i95 * i95;
                int i97 = -(564247595 * i95);
                int i98 = (i96 & i97) + (i96 | i97);
                int i99 = -(i95 * 368745167);
                int i100 = ((i98 & i99) + (i99 | i98)) - (-1653553929);
                int i101 = i100 >> 20;
                int i102 = ((i101 ^ (-8191)) + ((i101 & (-8191)) << 1)) / 4096;
                int i103 = (i102 & 1) + (i102 | 1);
                int i104 = (i100 & i103) + (i103 | i100);
                int i105 = i100 >> 16;
                int i106 = (((-131071) & i105) + (i105 | (-131071))) / C.DEFAULT_BUFFER_SEGMENT_SIZE;
                int i107 = -(((i106 ^ 1) + ((i106 & 1) << 1)) ^ i104);
                int i108 = (i107 & 9) + (i107 | 9);
                int i109 = i108 >> 28;
                int i110 = ((i109 ^ (-31)) + ((i109 & (-31)) << 1)) / 16;
                int i111 = (i110 ^ 1) + ((i110 & 1) << 1);
                int i112 = 10217340 / (((-((i111 ^ 1) + ((i111 & 1) << 1))) & i108) * 1190);
                int i113 = ((int[]) objArr48[1])[0];
                int i114 = ((i113 * i113) - (~(-(1687461876 * i113)))) - 1;
                int i115 = -(i113 * 195106904);
                int i116 = ((i114 | i115) << 1) - (i115 ^ i114);
                int i117 = (i116 & 352933284) + (352933284 | i116);
                int i118 = i117 >> 24;
                int i119 = ((i118 ^ (-511)) + ((i118 & (-511)) << 1)) / 256;
                int i120 = ((i119 | 1) << 1) - (i119 ^ 1);
                int i121 = (i117 ^ i120) + ((i120 & i117) << 1);
                int i122 = ((i117 >> 19) - 16383) / 8192;
                int i123 = -(i121 ^ ((i122 & 1) + (i122 | 1)));
                int i124 = ((i123 | 9) << 1) - (i123 ^ 9);
                int i125 = ((i124 >> 21) - 4095) / 2048;
                requestHandler.post(i112 + ((-1432359) / (((-(((i125 & 1) + (i125 | 1)) - (-1))) & i124) * 167)), Assertions.checkNotNull(keyRequest), z);
            } catch (Exception e) {
                onKeysError(e, true);
            }
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void onKeyResponse(java.lang.Object r5, java.lang.Object r6) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            com.google.android.exoplayer2.drm.ExoMediaDrm$KeyRequest r1 = r4.currentKeyRequest
            if (r5 != r1) goto L8b
            int r5 = com.google.android.exoplayer2.drm.DefaultDrmSession.AudioAttributesImplApi21Parcelizer
            int r5 = r5 + 71
            int r1 = r5 % 128
            com.google.android.exoplayer2.drm.DefaultDrmSession.AudioAttributesImplApi26Parcelizer = r1
            int r5 = r5 % r0
            r1 = 0
            r2 = 1
            if (r5 != 0) goto L1f
            boolean r5 = r4.isOpen()
            r3 = 23
            int r3 = r3 / r1
            r5 = r5 ^ r2
            if (r5 == r2) goto L8b
            goto L26
        L1f:
            boolean r5 = r4.isOpen()
            r5 = r5 ^ r2
            if (r5 == r2) goto L8b
        L26:
            r5 = 0
            r4.currentKeyRequest = r5
            boolean r5 = r6 instanceof java.lang.Exception
            if (r5 == 0) goto L3c
            int r5 = com.google.android.exoplayer2.drm.DefaultDrmSession.AudioAttributesImplApi21Parcelizer
            int r5 = r5 + 41
            int r2 = r5 % 128
            com.google.android.exoplayer2.drm.DefaultDrmSession.AudioAttributesImplApi26Parcelizer = r2
            int r5 = r5 % r0
            java.lang.Exception r6 = (java.lang.Exception) r6
            r4.onKeysError(r6, r1)
            return
        L3c:
            byte[] r6 = (byte[]) r6     // Catch: java.lang.Exception -> L87
            int r5 = r4.mode     // Catch: java.lang.Exception -> L87
            r1 = 3
            if (r5 != r1) goto L59
            com.google.android.exoplayer2.drm.ExoMediaDrm r5 = r4.mediaDrm     // Catch: java.lang.Exception -> L87
            byte[] r0 = r4.offlineLicenseKeySetId     // Catch: java.lang.Exception -> L87
            java.lang.Object r0 = com.google.android.exoplayer2.util.Util.castNonNull(r0)     // Catch: java.lang.Exception -> L87
            byte[] r0 = (byte[]) r0     // Catch: java.lang.Exception -> L87
            r5.provideKeyResponse(r0, r6)     // Catch: java.lang.Exception -> L87
            com.google.android.exoplayer2.drm.DefaultDrmSession$$ExternalSyntheticLambda3 r5 = new com.google.android.exoplayer2.drm.DefaultDrmSession$$ExternalSyntheticLambda3     // Catch: java.lang.Exception -> L87
            r5.<init>()     // Catch: java.lang.Exception -> L87
            r4.dispatchEvent(r5)     // Catch: java.lang.Exception -> L87
            return
        L59:
            com.google.android.exoplayer2.drm.ExoMediaDrm r5 = r4.mediaDrm     // Catch: java.lang.Exception -> L87
            byte[] r1 = r4.sessionId     // Catch: java.lang.Exception -> L87
            byte[] r5 = r5.provideKeyResponse(r1, r6)     // Catch: java.lang.Exception -> L87
            int r6 = r4.mode     // Catch: java.lang.Exception -> L87
            if (r6 == r0) goto L74
            int r1 = com.google.android.exoplayer2.drm.DefaultDrmSession.AudioAttributesImplApi26Parcelizer
            int r1 = r1 + 11
            int r3 = r1 % 128
            com.google.android.exoplayer2.drm.DefaultDrmSession.AudioAttributesImplApi21Parcelizer = r3
            int r1 = r1 % r0
            if (r6 != 0) goto L7b
            byte[] r6 = r4.offlineLicenseKeySetId     // Catch: java.lang.Exception -> L87
            if (r6 == 0) goto L7b
        L74:
            if (r5 == 0) goto L7b
            int r6 = r5.length     // Catch: java.lang.Exception -> L87
            if (r6 == 0) goto L7b
            r4.offlineLicenseKeySetId = r5     // Catch: java.lang.Exception -> L87
        L7b:
            r5 = 4
            r4.state = r5     // Catch: java.lang.Exception -> L87
            com.google.android.exoplayer2.drm.DefaultDrmSession$$ExternalSyntheticLambda4 r5 = new com.google.android.exoplayer2.drm.DefaultDrmSession$$ExternalSyntheticLambda4     // Catch: java.lang.Exception -> L87
            r5.<init>()     // Catch: java.lang.Exception -> L87
            r4.dispatchEvent(r5)     // Catch: java.lang.Exception -> L87
            return
        L87:
            r5 = move-exception
            r4.onKeysError(r5, r2)
        L8b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.drm.DefaultDrmSession.onKeyResponse(java.lang.Object, java.lang.Object):void");
    }

    private void onKeysRequired() throws Throwable {
        boolean z;
        int i = 2 % 2;
        if (this.mode == 0 && this.state == 4) {
            int i2 = AudioAttributesImplApi26Parcelizer + 91;
            AudioAttributesImplApi21Parcelizer = i2 % 128;
            if (i2 % 2 != 0) {
                Util.castNonNull(this.sessionId);
                z = true;
            } else {
                Util.castNonNull(this.sessionId);
                z = false;
            }
            doLicense(z);
            int i3 = AudioAttributesImplApi26Parcelizer + 83;
            AudioAttributesImplApi21Parcelizer = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    private void onKeysError(Exception exc, boolean z) {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = AudioAttributesImplApi21Parcelizer;
        int i4 = i3 + 39;
        AudioAttributesImplApi26Parcelizer = i4 % 128;
        int i5 = i4 % 2;
        if (!(!(exc instanceof NotProvisionedException))) {
            int i6 = i3 + 7;
            AudioAttributesImplApi26Parcelizer = i6 % 128;
            int i7 = i6 % 2;
            this.provisioningManager.provisionRequired(this);
            return;
        }
        if (z) {
            int i8 = i3 + 95;
            int i9 = i8 % 128;
            AudioAttributesImplApi26Parcelizer = i9;
            int i10 = i8 % 2;
            int i11 = i9 + 53;
            AudioAttributesImplApi21Parcelizer = i11 % 128;
            int i12 = i11 % 2;
            i = 1;
        }
        onError(exc, i);
    }

    static /* synthetic */ void lambda$onError$1(Exception exc, DrmSessionEventListener.EventDispatcher eventDispatcher) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi21Parcelizer + 39;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        eventDispatcher.drmSessionManagerError(exc);
        int i4 = AudioAttributesImplApi21Parcelizer + 65;
        AudioAttributesImplApi26Parcelizer = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 33 / 0;
        }
    }

    private void onError(final Exception exc, int i) {
        int i2 = 2 % 2;
        this.lastException = new DrmSession.DrmSessionException(exc, DrmUtil.getErrorCodeForMediaDrmException(exc, i));
        Log.e(TAG, "DRM session error", exc);
        dispatchEvent(new Consumer() { // from class: com.google.android.exoplayer2.drm.DefaultDrmSession$$ExternalSyntheticLambda2
            @Override // com.google.android.exoplayer2.util.Consumer
            public final void accept(Object obj) {
                DefaultDrmSession.lambda$onError$1(exc, (DrmSessionEventListener.EventDispatcher) obj);
            }
        });
        if (this.state != 4) {
            int i3 = AudioAttributesImplApi26Parcelizer + 89;
            AudioAttributesImplApi21Parcelizer = i3 % 128;
            int i4 = i3 % 2;
            this.state = 1;
        }
        int i5 = AudioAttributesImplApi26Parcelizer + 107;
        AudioAttributesImplApi21Parcelizer = i5 % 128;
        int i6 = i5 % 2;
    }

    private boolean isOpen() {
        int i = 2 % 2;
        int i2 = this.state;
        if (i2 != 3) {
            int i3 = AudioAttributesImplApi21Parcelizer + 9;
            int i4 = i3 % 128;
            AudioAttributesImplApi26Parcelizer = i4;
            int i5 = i3 % 2;
            if (i2 != 4) {
                int i6 = i4 + 99;
                AudioAttributesImplApi21Parcelizer = i6 % 128;
                int i7 = i6 % 2;
                return false;
            }
        }
        int i8 = AudioAttributesImplApi26Parcelizer + 77;
        AudioAttributesImplApi21Parcelizer = i8 % 128;
        int i9 = i8 % 2;
        return true;
    }

    private void dispatchEvent(Consumer<DrmSessionEventListener.EventDispatcher> consumer) {
        int i = 2 % 2;
        Iterator<DrmSessionEventListener.EventDispatcher> it = this.eventDispatchers.elementSet().iterator();
        int i2 = AudioAttributesImplApi21Parcelizer + 47;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 5 % 4;
        }
        while (it.hasNext()) {
            int i4 = AudioAttributesImplApi26Parcelizer + 17;
            AudioAttributesImplApi21Parcelizer = i4 % 128;
            if (i4 % 2 != 0) {
                consumer.accept(it.next());
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            consumer.accept(it.next());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void verifyPlaybackThread() {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.google.android.exoplayer2.drm.DefaultDrmSession.AudioAttributesImplApi21Parcelizer
            int r1 = r1 + 13
            int r2 = r1 % 128
            com.google.android.exoplayer2.drm.DefaultDrmSession.AudioAttributesImplApi26Parcelizer = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L1f
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            android.os.Looper r2 = r4.playbackLooper
            java.lang.Thread r2 = r2.getThread()
            r3 = 84
            int r3 = r3 / 0
            if (r1 == r2) goto L5d
            goto L2b
        L1f:
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            android.os.Looper r2 = r4.playbackLooper
            java.lang.Thread r2 = r2.getThread()
            if (r1 == r2) goto L5d
        L2b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "DefaultDrmSession accessed on the wrong thread.\nCurrent thread: "
            r1.<init>(r2)
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            java.lang.String r2 = r2.getName()
            r1.append(r2)
            java.lang.String r2 = "\nExpected thread: "
            r1.append(r2)
            android.os.Looper r4 = r4.playbackLooper
            java.lang.Thread r4 = r4.getThread()
            java.lang.String r4 = r4.getName()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            java.lang.String r2 = "DefaultDrmSession"
            com.google.android.exoplayer2.util.Log.w(r2, r4, r1)
        L5d:
            int r4 = com.google.android.exoplayer2.drm.DefaultDrmSession.AudioAttributesImplApi26Parcelizer
            int r4 = r4 + 21
            int r1 = r4 % 128
            com.google.android.exoplayer2.drm.DefaultDrmSession.AudioAttributesImplApi21Parcelizer = r1
            int r4 = r4 % r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.drm.DefaultDrmSession.verifyPlaybackThread():void");
    }
}
