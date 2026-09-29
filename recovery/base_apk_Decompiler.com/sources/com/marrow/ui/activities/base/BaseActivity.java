package com.marrow.ui.activities.base;

import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.hardware.display.DisplayManager;
import android.media.AudioTrack;
import android.net.ConnectivityManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Display;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import com.fasterxml.jackson.core.TokenStreamFactory;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import com.marrow.TrainingApplication;
import com.marrow.data.models.ResponseError;
import com.marrow.data.models.plan.PlanGroup$$ExternalSyntheticLambda0;
import com.marrow.services.NetworkAvailableJobService;
import dagger.Lazy;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.BandwidthMeterEventListenerEventDispatcherHandlerAndListener;
import kotlin.CmcdConfigurationRequestConfig;
import kotlin.MediaSessionConnectorCustomActionProvider;
import kotlin.NavigationBarViewSavedState;
import kotlin.PgsDecoderCueBuilder;
import kotlin._doAddInjectable;
import kotlin._isNaN;
import kotlin.addObserverForBackInvoker;
import kotlin.argCount;
import kotlin.buildResolutionString;
import kotlin.clearDownloadManagerHelpers;
import kotlin.createFloatList;
import kotlin.dispatchTouchEvent;
import kotlin.getEventTimes;
import kotlin.getExamName;
import kotlin.getProvider;
import kotlin.getTrackGroup;
import kotlin.getTrackName;
import kotlin.handlePreambleAddressCode;
import kotlin.hasSelectionOverride;
import kotlin.isMidrowCtrlCode;
import kotlin.isRepeatable;
import kotlin.isServiceSwitchCommand;
import kotlin.notifyDownloads;
import kotlin.parseCea608AccessibilityChannel;
import kotlin.selectTextTrack;
import kotlin.setSdkPayload;
import kotlin.startForeground;
import kotlin.updateShuffleButton;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseActivity extends addObserverForBackInvoker implements View.OnClickListener {
    private static int $10 = 0;
    private static int $11 = 1;
    public static boolean AudioAttributesImplBaseParcelizer = false;
    private argCount AudioAttributesCompatParcelizer;
    public Dialog AudioAttributesImplApi21Parcelizer;
    private Toast IconCompatParcelizer;
    private ConnectivityManager read;

    @setSdkPayload
    public Lazy<BandwidthMeterEventListenerEventDispatcherHandlerAndListener> syncManager;
    private boolean write;
    private static final byte[] $$H = {8, -19, -66, -33, 64, -58, 1, -16, 31, -21, -14, 7, 10, -13, 12, -9, -4, 22, -30, 5, 71, -47, -20, -9, -3, -6, 14, 35, -35, -18, 10, -7, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -20, -9, -3, -6, 14, 35, -35, -18, 10, -7, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -13, 1, 62, -58, -9, -1, 7, -6, 6, TarConstants.LF_FIFO, -52, -14, 9, -15, 2, 5, 4, TarConstants.LF_DIR, -64, 11, -20, 14, -14, 8, 7, -12, 61, -71, 18, -2, -18, 68, -39, -14, -2, 21, -22, -25, 9, -7, 0, 79, -79, 12, 3, -4, -27, -13, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14};
    private static final int $$I = 29;
    private static final byte[] $$m = {27, -119, -113, 73, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -48, TarConstants.LF_CHR, -1, 2, -4, -1, -43, 35, 18, -10, 7, 0, -27, 20, 15, 3, -8, 9, -33, 20, -1, 3, 5, 14, -16, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 0, 32, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 5, 27, 18, 18, -14, 3, 8, -2, 18, -20, 14, -12, -3, 4, 20, 9, 3, 6, -14, -35, 35, 18, -10, 7, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -42, 44, -14, 9, -26, 20, -1, 3, 5, 14, -16, 14, 27, 13, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -47, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14};
    private static final int $$n = 102;
    private static int onCommand = 0;
    private static int onCustomAction = 1;
    private static int MediaBrowserCompatSearchResultReceiver = 1000326176;
    private static char[] MediaMetadataCompat = {28533, 28425, 28525, 28537, 28540, 28513, 28530, 28430, 28531, 28594, 28528, 28481, 28543, 28428, 28426, 28524, 28536, 28541, 28493, 28592, 28538, 28542, 28492, 28490, 28495, 28489, 28488, 28593, 28494, 28491, 28431, 28486, 28595, 28532, 28429, 28539, 28529, 28597, 28534, 28527, 28511, 28535, 28526};
    private static int RatingCompat = 411398016;
    private static boolean MediaBrowserCompatMediaItem = true;
    private static boolean onAddQueueItem = true;
    protected boolean AudioAttributesImplApi26Parcelizer = false;
    private isRepeatable RemoteActionCompatParcelizer = new isRepeatable() { // from class: com.marrow.ui.activities.base.BaseActivity.4
        @Override // kotlin.isRepeatable
        public final void read() {
            BaseActivity.this.onSkipToQueueItem();
        }

        @Override // kotlin.isRepeatable, android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            super.onReceive(context, intent);
        }
    };
    private isMidrowCtrlCode MediaDescriptionCompat = new isMidrowCtrlCode() { // from class: com.marrow.ui.activities.base.BaseActivity.5
        @Override // kotlin.isMidrowCtrlCode
        public final void write() {
            BaseActivity.this.AudioAttributesImplApi26Parcelizer = true;
            BaseActivity.this.onRemoveQueueItem();
        }

        @Override // kotlin.isMidrowCtrlCode
        public final void read() {
            BaseActivity.this.AudioAttributesImplApi26Parcelizer = false;
        }

        @Override // kotlin.isMidrowCtrlCode, android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            super.onReceive(context, intent);
        }
    };
    public isServiceSwitchCommand MediaBrowserCompatItemReceiver = new isServiceSwitchCommand() { // from class: com.marrow.ui.activities.base.BaseActivity.2
        @Override // kotlin.isServiceSwitchCommand
        public final void RemoteActionCompatParcelizer(Context context) throws NoSuchMethodException {
            boolean zWrite = getTrackName.write(context);
            BaseActivity.this.IconCompatParcelizer(zWrite);
            if (zWrite) {
                return;
            }
            BaseActivity.this.onPrepareFromUri();
        }

        @Override // kotlin.isServiceSwitchCommand, android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            super.onReceive(context, intent);
        }
    };
    private ConnectivityManager.NetworkCallback MediaBrowserCompatCustomActionResultReceiver = null;

    public static /* synthetic */ Object RemoteActionCompatParcelizer(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i2;
        int i8 = ~i6;
        int i9 = ~(i7 | i8);
        int i10 = ~i;
        int i11 = i9 | (~(i8 | i10));
        int i12 = ~(i | i2 | i6);
        int i13 = i11 | i12;
        int i14 = i10 | i2;
        int i15 = i2 + i6 + i5 + (112060874 * i4) + ((-1891258303) * i3);
        int i16 = i15 * i15;
        int i17 = (i2 * 1286644997) + 1783103488 + (1286644997 * i6) + (i13 * (-1821943044)) + ((-651081208) * i12) + ((-1821943044) * i14) + ((-535298048) * i5) + ((-1427111936) * i4) + (1712848896 * i3) + (159514624 * i16);
        int i18 = ((i2 * (-1669307009)) - 1771304782) + (i6 * (-1669307009)) + (i13 * 564) + (i12 * (-1128)) + (i14 * 564) + (i5 * (-1669306445)) + (i4 * (-1582645698)) + (i3 * (-198941581)) + (i16 * (-203030528));
        int i19 = i17 + (i18 * i18 * (-2008154112));
        return i19 != 1 ? i19 != 2 ? i19 != 3 ? read(objArr) : AudioAttributesCompatParcelizer(objArr) : RemoteActionCompatParcelizer(objArr) : IconCompatParcelizer(objArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void s(short r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.marrow.ui.activities.base.BaseActivity.$$m
            int r1 = 44 - r8
            int r7 = 114 - r7
            int r6 = r6 + 4
            byte[] r1 = new byte[r1]
            int r8 = 43 - r8
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r7
            r4 = r2
            r7 = r6
            goto L2c
        L13:
            r3 = r2
        L14:
            int r6 = r6 + 1
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L23:
            int r3 = r3 + 1
            r4 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2c:
            int r3 = r3 + r6
            int r6 = r3 + (-1)
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow.ui.activities.base.BaseActivity.s(short, int, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void t(int r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.marrow.ui.activities.base.BaseActivity.$$H
            int r6 = 111 - r6
            int r7 = 121 - r7
            int r1 = r8 + 20
            byte[] r1 = new byte[r1]
            int r8 = r8 + 19
            r2 = 0
            if (r0 != 0) goto L13
            r6 = r7
            r4 = r8
            r3 = r2
            goto L2a
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r6
            int r7 = r7 + 1
            r1[r3] = r4
            if (r3 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L23:
            r4 = r0[r7]
            int r3 = r3 + 1
            r5 = r7
            r7 = r6
            r6 = r5
        L2a:
            int r4 = -r4
            int r7 = r7 + r4
            int r7 = r7 + (-1)
            r5 = r7
            r7 = r6
            r6 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow.ui.activities.base.BaseActivity.t(int, short, short, java.lang.Object[]):void");
    }

    public abstract int handleMediaPlayPauseIfPendingOnHandler();

    @Override // android.content.ContextWrapper, android.content.Context
    public /* synthetic */ Context getApplicationContext() {
        int i = 2 % 2;
        int i2 = onCustomAction + 63;
        onCommand = i2 % 128;
        if (i2 % 2 == 0) {
            return onRemoveQueueItemAt();
        }
        onRemoveQueueItemAt();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void AudioAttributesCompatParcelizer(argCount argcount) {
        int i = 2 % 2;
        int i2 = onCommand;
        int i3 = i2 + 119;
        onCustomAction = i3 % 128;
        int i4 = i3 % 2;
        this.AudioAttributesCompatParcelizer = argcount;
        int i5 = i2 + 37;
        onCustomAction = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 64 / 0;
        }
    }

    public final void onRemoveQueueItem() {
        int i = 2 % 2;
        int i2 = onCustomAction + 27;
        onCommand = i2 % 128;
        if (i2 % 2 == 0) {
            if (onSetRating() && onSetShuffleMode()) {
                int i3 = onCommand + 29;
                onCustomAction = i3 % 128;
                int i4 = i3 % 2;
                onSkipToNext();
                return;
            }
            return;
        }
        onSetRating();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void q(boolean z, int i, int i2, int i3, char[] cArr, Object[] objArr) throws Throwable {
        char[] cArr2;
        int i4 = 2 % 2;
        clearDownloadManagerHelpers cleardownloadmanagerhelpers = new clearDownloadManagerHelpers();
        char[] cArr3 = new char[i];
        cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer = 0;
        while (cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer < i) {
            int i5 = $10 + 95;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            cleardownloadmanagerhelpers.RemoteActionCompatParcelizer = cArr[cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer];
            cArr3[cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer] = (char) (i2 + cleardownloadmanagerhelpers.RemoteActionCompatParcelizer);
            int i7 = cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr3[i7]), Integer.valueOf(MediaBrowserCompatSearchResultReceiver)};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-579447922);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) Color.blue(0), 23704 - ((Process.getThreadPriority(0) + 20) >> 6), 32 - Drawable.resolveOpacity(0, 0), -1556113637, false, CmcdHeadersFactory.OBJECT_TYPE_AUDIO_ONLY, new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr3[i7] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {cleardownloadmanagerhelpers, cleardownloadmanagerhelpers};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-322440307);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (44862 - View.MeasureSpec.makeMeasureSpec(0, 0)), (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 18944, 27 - MotionEvent.axisFromString(""), -1836173544, false, "c", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3);
                int i8 = $10 + 113;
                $11 = i8 % 128;
                int i9 = i8 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        if (i3 > 0) {
            cleardownloadmanagerhelpers.write = i3;
            char[] cArr4 = new char[i];
            System.arraycopy(cArr3, 0, cArr4, 0, i);
            System.arraycopy(cArr4, 0, cArr3, i - cleardownloadmanagerhelpers.write, cleardownloadmanagerhelpers.write);
            System.arraycopy(cArr4, cleardownloadmanagerhelpers.write, cArr3, 0, i - cleardownloadmanagerhelpers.write);
            int i10 = $11 + 69;
            $10 = i10 % 128;
            int i11 = i10 % 2;
        }
        if (z) {
            int i12 = $10 + 109;
            $11 = i12 % 128;
            if (i12 % 2 == 0) {
                cArr2 = new char[i];
                cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer = 1;
            } else {
                cArr2 = new char[i];
                cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer = 0;
            }
            while (cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer < i) {
                int i13 = $11 + 21;
                $10 = i13 % 128;
                if (i13 % 2 != 0) {
                    int i14 = cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer;
                    int i15 = i / cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer;
                    cArr2[i14] = cArr3[0];
                    Object[] objArr4 = {cleardownloadmanagerhelpers, cleardownloadmanagerhelpers};
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-322440307);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) (44862 - (ViewConfiguration.getTapTimeout() >> 16)), 18944 - (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 28 - Gravity.getAbsoluteGravity(0, 0), -1836173544, false, "c", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                } else {
                    cArr2[cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer] = cArr3[(i - cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer) - 1];
                    try {
                        Object[] objArr5 = {cleardownloadmanagerhelpers, cleardownloadmanagerhelpers};
                        Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-322440307);
                        if (objRemoteActionCompatParcelizer4 == null) {
                            objRemoteActionCompatParcelizer4 = startForeground.read((char) (44862 - TextUtils.getOffsetBefore("", 0)), 18944 - (KeyEvent.getMaxKeyCode() >> 16), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 28, -1836173544, false, "c", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
            }
            cArr3 = cArr2;
        }
        objArr[0] = new String(cArr3);
    }

    public final boolean onSetRating() {
        int i = 2 % 2;
        int i2 = onCommand + 109;
        onCustomAction = i2 % 128;
        int i3 = i2 % 2;
        boolean z = this.AudioAttributesImplApi26Parcelizer;
        if (i3 == 0) {
            int i4 = 47 / 0;
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0034 A[PHI: r0
      0x0034: PHI (r0v4 android.app.Dialog) = (r0v3 android.app.Dialog), (r0v7 android.app.Dialog) binds: [B:12:0x0032, B:9:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onSkipToNext() {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.marrow.ui.activities.base.BaseActivity.onCustomAction
            int r1 = r1 + 105
            int r2 = r1 % 128
            com.marrow.ui.activities.base.BaseActivity.onCommand = r2
            int r1 = r1 % r0
            android.app.Dialog r1 = r5.AudioAttributesImplApi21Parcelizer
            r2 = 0
            r3 = 21
            if (r1 == 0) goto L3d
            boolean r1 = r1.isShowing()
            if (r1 == 0) goto L3d
            int r1 = com.marrow.ui.activities.base.BaseActivity.onCommand
            int r1 = r1 + 105
            int r4 = r1 % 128
            com.marrow.ui.activities.base.BaseActivity.onCustomAction = r4
            int r1 = r1 % r0
            if (r1 != 0) goto L2e
            android.app.Dialog r0 = r5.AudioAttributesImplApi21Parcelizer
            boolean r1 = r0 instanceof kotlin.canSelectFormat
            r4 = 36
            int r4 = r4 / r2
            if (r1 == 0) goto L3d
            goto L34
        L2e:
            android.app.Dialog r0 = r5.AudioAttributesImplApi21Parcelizer
            boolean r1 = r0 instanceof kotlin.canSelectFormat
            if (r1 == 0) goto L3d
        L34:
            o.canSelectFormat r0 = (kotlin.canSelectFormat) r0
            int r0 = r0.RemoteActionCompatParcelizer()
            if (r3 != r0) goto L3d
            return
        L3d:
            r5.RemoteActionCompatParcelizer()
            o.canSelectFormat r0 = new o.canSelectFormat
            r1 = 2131951662(0x7f13002e, float:1.9539745E38)
            java.lang.String r1 = r5.getString(r1)
            r0.<init>(r5, r1, r3)
            r5.AudioAttributesImplApi21Parcelizer = r0
            r1 = r0
            o.canSelectFormat r1 = (kotlin.canSelectFormat) r1
            r1 = 2131951755(0x7f13008b, float:1.9539933E38)
            java.lang.String r1 = r5.getString(r1)
            r0.write(r1)
            android.app.Dialog r0 = r5.AudioAttributesImplApi21Parcelizer
            r0.setCancelable(r2)
            android.app.Dialog r5 = r5.AudioAttributesImplApi21Parcelizer
            r5.show()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow.ui.activities.base.BaseActivity.onSkipToNext():void");
    }

    private static void r(char[] cArr, byte[] bArr, int i, int[] iArr, Object[] objArr) throws Throwable {
        char[] cArr2;
        int i2 = 2 % 2;
        notifyDownloads notifydownloads = new notifyDownloads();
        char[] cArr3 = MediaMetadataCompat;
        long j = 0;
        if (cArr3 != null) {
            int i3 = $11 + 17;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int i5 = 0;
            while (i5 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i5])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-298077624);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) ((SystemClock.elapsedRealtimeNanos() > j ? 1 : (SystemClock.elapsedRealtimeNanos() == j ? 0 : -1)) + 44861), 18945 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 28, -1871546659, false, CmcdHeadersFactory.STREAMING_FORMAT_SS, new Class[]{Integer.TYPE});
                    }
                    cArr4[i5] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                    i5++;
                    j = 0;
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
        Object[] objArr3 = {Integer.valueOf(RatingCompat)};
        Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(680566917);
        if (objRemoteActionCompatParcelizer2 == null) {
            objRemoteActionCompatParcelizer2 = startForeground.read((char) TextUtils.getOffsetBefore("", 0), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 19032, 75 - TextUtils.getOffsetBefore("", 0), 1457087504, false, "r", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
        if (onAddQueueItem) {
            int i6 = $10 + 115;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            notifydownloads.AudioAttributesCompatParcelizer = bArr.length;
            char[] cArr5 = new char[notifydownloads.AudioAttributesCompatParcelizer];
            notifydownloads.IconCompatParcelizer = 0;
            while (notifydownloads.IconCompatParcelizer < notifydownloads.AudioAttributesCompatParcelizer) {
                cArr5[notifydownloads.IconCompatParcelizer] = (char) (cArr3[bArr[(notifydownloads.AudioAttributesCompatParcelizer - 1) - notifydownloads.IconCompatParcelizer] + i] - iIntValue);
                Object[] objArr4 = {notifydownloads, notifydownloads};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1593953308);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), 11439 - TextUtils.indexOf("", "", 0, 0), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 14, -558368911, false, "q", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
            }
            objArr[0] = new String(cArr5);
            return;
        }
        if (!MediaBrowserCompatMediaItem) {
            notifydownloads.AudioAttributesCompatParcelizer = iArr.length;
            char[] cArr6 = new char[notifydownloads.AudioAttributesCompatParcelizer];
            notifydownloads.IconCompatParcelizer = 0;
            while (notifydownloads.IconCompatParcelizer < notifydownloads.AudioAttributesCompatParcelizer) {
                cArr6[notifydownloads.IconCompatParcelizer] = (char) (cArr3[iArr[(notifydownloads.AudioAttributesCompatParcelizer - 1) - notifydownloads.IconCompatParcelizer] - i] - iIntValue);
                notifydownloads.IconCompatParcelizer++;
            }
            objArr[0] = new String(cArr6);
            return;
        }
        int i8 = $11 + 123;
        $10 = i8 % 128;
        if (i8 % 2 != 0) {
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
                objRemoteActionCompatParcelizer4 = startForeground.read((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), ((byte) KeyEvent.getModifierMetaStateMask()) + 11440, (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 14, -558368911, false, "q", new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr2);
    }

    public final String MediaDescriptionCompat(String str) {
        int i = 2 % 2;
        int i2 = onCustomAction + 67;
        onCommand = i2 % 128;
        int i3 = i2 % 2;
        String stringExtra = getIntent().getStringExtra(str);
        int i4 = onCommand + 3;
        onCustomAction = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 2 / 0;
        }
        return stringExtra;
    }

    public final int write(String str, int i) {
        int i2 = 2 % 2;
        int i3 = onCommand + 1;
        onCustomAction = i3 % 128;
        int i4 = i3 % 2;
        int intExtra = getIntent().getIntExtra(str, i);
        int i5 = onCommand + 107;
        onCustomAction = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 9 / 0;
        }
        return intExtra;
    }

    public final int MediaBrowserCompatSearchResultReceiver(String str) {
        int i = 2 % 2;
        int i2 = onCommand + 95;
        onCustomAction = i2 % 128;
        int i3 = i2 % 2;
        int iWrite = write(str, 0);
        int i4 = onCommand + 63;
        onCustomAction = i4 % 128;
        int i5 = i4 % 2;
        return iWrite;
    }

    private boolean write(String str) {
        int i = 2 % 2;
        int i2 = onCommand + 111;
        onCustomAction = i2 % 128;
        int i3 = i2 % 2;
        boolean booleanExtra = getIntent().getBooleanExtra(str, false);
        int i4 = onCommand + 75;
        onCustomAction = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 27 / 0;
        }
        return booleanExtra;
    }

    private static /* synthetic */ Object IconCompatParcelizer(Object[] objArr) {
        BaseActivity baseActivity = (BaseActivity) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = onCommand + 119;
        onCustomAction = i2 % 128;
        int i3 = i2 % 2;
        boolean zWrite = baseActivity.write(str);
        if (i3 == 0) {
            int i4 = 25 / 0;
        }
        int i5 = onCustomAction + 1;
        onCommand = i5 % 128;
        int i6 = i5 % 2;
        return Boolean.valueOf(zWrite);
    }

    private ArrayList<handlePreambleAddressCode> MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        int i = 2 % 2;
        ArrayList<handlePreambleAddressCode> arrayList = new ArrayList<>();
        handlePreambleAddressCode handlepreambleaddresscodeAudioAttributesImplApi26Parcelizer = AudioAttributesImplApi26Parcelizer();
        handlePreambleAddressCode[] handlepreambleaddresscodeArrMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver();
        if (handlepreambleaddresscodeAudioAttributesImplApi26Parcelizer != null) {
            arrayList.add(handlepreambleaddresscodeAudioAttributesImplApi26Parcelizer);
        }
        if (handlepreambleaddresscodeArrMediaBrowserCompatCustomActionResultReceiver != null) {
            int length = handlepreambleaddresscodeArrMediaBrowserCompatCustomActionResultReceiver.length;
            int i2 = 0;
            while (i2 < length) {
                handlePreambleAddressCode handlepreambleaddresscode = handlepreambleaddresscodeArrMediaBrowserCompatCustomActionResultReceiver[i2];
                if (handlepreambleaddresscode != null) {
                    int i3 = onCommand + 113;
                    onCustomAction = i3 % 128;
                    if (i3 % 2 == 0) {
                        arrayList.add(handlepreambleaddresscode);
                        throw null;
                    }
                    arrayList.add(handlepreambleaddresscode);
                }
                i2++;
                int i4 = onCommand + 71;
                onCustomAction = i4 % 128;
                int i5 = i4 % 2;
            }
        }
        if (ai_()) {
            int i6 = onCommand + 71;
            onCustomAction = i6 % 128;
            if (i6 % 2 == 0) {
                arrayList.add(this.RemoteActionCompatParcelizer);
                int i7 = 39 / 0;
            } else {
                arrayList.add(this.RemoteActionCompatParcelizer);
            }
        }
        return arrayList;
    }

    public NavigationBarViewSavedState onAddQueueItem() {
        int i = 2 % 2;
        NavigationBarViewSavedState navigationBarViewSavedState = new NavigationBarViewSavedState(R.style.AppTheme_Light_Regular, null, null);
        int i2 = onCommand + 57;
        onCustomAction = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 99 / 0;
        }
        return navigationBarViewSavedState;
    }

    protected final void onSkipToQueueItem() {
        int i = 2 % 2;
        finish();
        if (AudioAttributesImplBaseParcelizer) {
            return;
        }
        int i2 = onCommand + 103;
        onCustomAction = i2 % 128;
        int i3 = i2 % 2;
        Intent intentRemoteActionCompatParcelizer = createFloatList.RemoteActionCompatParcelizer(this);
        intentRemoteActionCompatParcelizer.setFlags(268468224);
        startActivity(intentRemoteActionCompatParcelizer);
        AudioAttributesImplBaseParcelizer = true;
        int i4 = onCommand + 37;
        onCustomAction = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onCreate(Bundle bundle) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object[] objArr2 = new Object[1];
        q(true, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).length() + 14, ((byte) KeyEvent.getModifierMetaStateMask()) + 127, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 26, new char[]{'\f', 65483, 1, 6, '\f', 15, 1, 11, 65534, 16, 16, 2, 0, '\f', 15, 65517, 65483, 16}, objArr2);
        Class<?> cls = Class.forName((String) objArr2[0]);
        Object[] objArr3 = new Object[1];
        r(null, new byte[]{-123, -124, -125, -126, -127}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(1) + 78, null, objArr3);
        int iIntValue = ((Integer) cls.getDeclaredMethod((String) objArr3[0], new Class[0]).invoke(null, new Object[0])).intValue() % 100000;
        if (iIntValue < 99000 || iIntValue > 99999) {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                Object[] objArr4 = new Object[1];
                r(null, new byte[]{-123, -122, -110, -120, -111, -112, -126, -114, -124, -113, -124, -114, -115, -116, -118, -117, -117, -122, -118, -123, -124, -119, -120, -123, -121, -122}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).codePointAt(0) + 90, null, objArr4);
                Class<?> cls2 = Class.forName((String) objArr4[0]);
                Object[] objArr5 = new Object[1];
                q(false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() + 14, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(7) + 19, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(3) - 40, new char[]{65529, 65527, '\n', 65535, 5, 4, 65529, 11, '\b', '\b', 65531, 4, '\n', 65495, 6, 6, 2, 65535}, objArr5);
                baseContext = (Context) cls2.getMethod((String) objArr5[0], new Class[0]).invoke(null, null);
            }
            if (baseContext != null) {
                baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
            }
            if (baseContext != null) {
                try {
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (4535 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), 6054 - TextUtils.indexOf("", ""), TextUtils.getCapsMode("", 0, 0) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                    Object[] objArr6 = new Object[1];
                    r(null, new byte[]{-110, -107, -102, -101, -109, -102, -103, -123, -98, -106, -115, -106, -110, -104, -99, -110, -108, -99, -100, -103, -122, -105, -107, -101, -102, -107, -110, -103, -108, -115, -110, -108, -109, -123, -107, -110, -102, -103, -104, -105, -106, -122, -123, -115, -107, -108, -109, -115}, (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 126, null, objArr6);
                    String str = (String) objArr6[0];
                    Object[] objArr7 = new Object[1];
                    q(true, ((Process.getThreadPriority(0) + 20) >> 6) + 64, 142 - AndroidCharacter.getMirror('0'), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 25, new char[]{' ', '\"', '#', 65525, 65522, 65521, 65526, 65518, 65517, 65522, 65526, 65517, '!', 65518, '#', '!', '!', 31, 65524, 65525, 65517, 65520, 65519, '#', 65520, 31, 65521, 65517, 65517, 65519, 65524, 65526, 65517, 65518, 65518, 31, 65526, 65521, 65525, 65523, 65526, 30, '\"', 30, 65523, '!', 65518, 65517, 31, '!', 65524, 65522, 65523, 65524, 30, 65524, 65517, ' ', ' ', 65517, 65524, 65520, '\"', 65522}, objArr7);
                    String str2 = (String) objArr7[0];
                    Object[] objArr8 = new Object[1];
                    q(false, (ViewConfiguration.getTouchSlop() >> 8) + 64, Color.green(0) + 98, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 9, new char[]{65515, 65513, 26, 65518, 29, 31, 26, 65514, 65519, 65516, 28, 65514, 27, 65518, 27, 65519, 65520, 65519, 65521, 27, 65514, 26, 29, 65514, 65515, 28, 65521, 29, 29, 65518, 65514, 65521, 26, 29, 29, 65521, 26, 27, 65514, 65515, 65514, 65516, 65515, 65522, 30, 29, 65522, 65516, 65519, 65514, 65521, 65517, 26, 65520, 30, 26, 30, 65516, 31, 65514, 65515, 30, 65513, 28}, objArr8);
                    String str3 = (String) objArr8[0];
                    Object[] objArr9 = new Object[1];
                    r(null, new byte[]{-97, -114, -121, -110, -113, -110, -95, -99, -113, -95, -114, -97, -110, -92, -121, -124, -95, -124, -117, -122, -95, -127, -119, -115, -118, -110, -120, -122, -93, -91, -97, -123, -120, -122, -93, -92, -118, -114, -97, -122, -115, -114, -122, -110, -120, -111, -114, -118, -97, -123, -121, -93, -119, -120, -126, -94, -124, -122, -123, -95, -95, -96, -97, -117, -114, -114, -111}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 92, null, objArr9);
                    String str4 = (String) objArr9[0];
                    Object[] objArr10 = new Object[1];
                    q(false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).length() + 2, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 78, 4 - TextUtils.indexOf("", ""), new char[]{65535, 2, 65532, 0, 7, 65532}, objArr10);
                    String str5 = (String) objArr10[0];
                    Object[] objArr11 = new Object[1];
                    r(null, new byte[]{-104, -104, -122, -100, -107, -115, -110, -98, -99, -122, -98, -107, -90, -108, -99, -106, -102, -90, -98, -105, -104, -105, -90, -107, -101, -107, -101, -90, -100, -100, -99, -104, -98, -106, -100, -99}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 117, null, objArr11);
                    Object[] objArr12 = {baseContext, str, str2, str3, str4, true, str5, (String) objArr11[0], 86400};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(448819875);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), 6030 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 24 - TextUtils.indexOf("", "", 0, 0), 1686746678, false, "AudioAttributesCompatParcelizer", new Class[]{Context.class, String.class, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, Integer.TYPE});
                    }
                    ((Method) objRemoteActionCompatParcelizer2).invoke(objInvoke, objArr12);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
        }
        Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-2042479539);
        if (objRemoteActionCompatParcelizer3 == null) {
            char c = (char) (13184 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)));
            int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 1649;
            int iBlue = 26 - Color.blue(0);
            byte[] bArr = $$m;
            Object[] objArr13 = new Object[1];
            s(bArr[17], bArr[62], bArr[5], objArr13);
            objRemoteActionCompatParcelizer3 = startForeground.read(c, pressedStateDuration, iBlue, -133433128, false, (String) objArr13[0], null);
        }
        if (((Field) objRemoteActionCompatParcelizer3).getLong(null) != -1) {
            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1137999833);
            if (objRemoteActionCompatParcelizer4 == null) {
                char scrollDefaultDelay = (char) (13183 - (ViewConfiguration.getScrollDefaultDelay() >> 16));
                int i2 = (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 1648;
                int iIndexOf = TextUtils.indexOf("", "") + 26;
                byte[] bArr2 = $$m;
                Object[] objArr14 = new Object[1];
                s((short) (-bArr2[65]), bArr2[9], (byte) (-bArr2[30]), objArr14);
                objRemoteActionCompatParcelizer4 = startForeground.read(scrollDefaultDelay, i2, iIndexOf, -1033747278, false, (String) objArr14[0], null);
            }
            objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer4).get(null);
        } else {
            Object[] objArr15 = new Object[1];
            r(null, new byte[]{-127, -110, -114, -97, -126, -88, -118, -92, -121, -122, -94, -118, -122, -113, -122, -89}, ExpandableListView.getPackedPositionChild(0L) + 128, null, objArr15);
            Class<?> cls3 = Class.forName((String) objArr15[0]);
            Object[] objArr16 = new Object[1];
            q(false, ImageFormat.getBitsPerPixel(0) + 17, (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 128, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() + 6, new char[]{14, 19, 65506, 65531, '\r', 2, 65501, '\t', 65534, 65535, 3, 65534, 65535, '\b', 14, 3}, objArr16);
            try {
                Object[] objArr17 = {Integer.valueOf(((Integer) cls3.getMethod((String) objArr16[0], Object.class).invoke(null, this)).intValue()), 0, -1273959197};
                byte b = $$H[32];
                int i3 = $$I;
                Object[] objArr18 = new Object[1];
                t(b, (byte) (b | 118), (byte) (i3 - 3), objArr18);
                Class<?> cls4 = Class.forName((String) objArr18[0]);
                Object[] objArr19 = new Object[1];
                t((byte) i3, (byte) 73, r0[0], objArr19);
                objArr = (Object[]) cls4.getMethod((String) objArr19[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr17);
                Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer5 == null) {
                    char cBlue = (char) (Color.blue(0) + 13183);
                    int gidForName = 1648 - Process.getGidForName("");
                    int i4 = 26 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                    byte[] bArr3 = $$m;
                    Object[] objArr20 = new Object[1];
                    s((short) (-bArr3[65]), bArr3[9], (byte) (-bArr3[30]), objArr20);
                    objRemoteActionCompatParcelizer5 = startForeground.read(cBlue, gidForName, i4, -1033747278, false, (String) objArr20[0], null);
                }
                ((Field) objRemoteActionCompatParcelizer5).set(null, objArr);
                try {
                    Object[] objArr21 = new Object[1];
                    r(null, new byte[]{-86, -115, -119, -94, -87, -127, -110, -114, -97, -126, -88, -118, -97, -119, -118, -123, -124, -119, -120, -123, -121, -122}, (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 126, null, objArr21);
                    Class<?> cls5 = Class.forName((String) objArr21[0]);
                    Object[] objArr22 = new Object[1];
                    r(null, new byte[]{-110, -127, -124, -114, -94, -122, -110, -85, -123, -110, -97, -117, -122, -94, -110}, 127 - TextUtils.getOffsetAfter("", 0), null, objArr22);
                    long jLongValue = ((Long) cls5.getDeclaredMethod((String) objArr22[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(2104791916);
                    if (objRemoteActionCompatParcelizer6 == null) {
                        char pressedStateDuration2 = (char) (13183 - (ViewConfiguration.getPressedStateDuration() >> 16));
                        int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 1649;
                        int bitsPerPixel = 25 - ImageFormat.getBitsPerPixel(0);
                        Object[] objArr23 = new Object[1];
                        s((short) 75, r13[9], (byte) (-$$m[30]), objArr23);
                        objRemoteActionCompatParcelizer6 = startForeground.read(pressedStateDuration2, packedPositionGroup, bitsPerPixel, 54351865, false, (String) objArr23[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer6).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                    if (objRemoteActionCompatParcelizer7 == null) {
                        char keyRepeatTimeout = (char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 13183);
                        int iMyPid = 1649 - (Process.myPid() >> 22);
                        int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 26;
                        byte[] bArr4 = $$m;
                        Object[] objArr24 = new Object[1];
                        s(bArr4[17], bArr4[62], bArr4[5], objArr24);
                        objRemoteActionCompatParcelizer7 = startForeground.read(keyRepeatTimeout, iMyPid, iNormalizeMetaState, -133433128, false, (String) objArr24[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer7).set(null, lValueOf2);
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        int i5 = ((int[]) objArr[3])[0];
        int i6 = ((int[]) objArr[2])[0];
        if (i6 != i5) {
            long j = -1;
            long j2 = 0;
            long j3 = (((long) (i6 ^ i5)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))) | (((long) 2) << 32) | (j2 - ((j2 >> 63) << 32));
            Object objRemoteActionCompatParcelizer8 = startForeground.RemoteActionCompatParcelizer(-1407079962);
            if (objRemoteActionCompatParcelizer8 == null) {
                objRemoteActionCompatParcelizer8 = startForeground.read((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 4536), (ViewConfiguration.getTouchSlop() >> 8) + 6054, 42 - (ViewConfiguration.getJumpTapTimeout() >> 16), -764908173, false, "IconCompatParcelizer", new Class[0]);
            }
            Object objInvoke2 = ((Method) objRemoteActionCompatParcelizer8).invoke(null, null);
            ArrayList arrayList = new ArrayList();
            String strRemoteActionCompatParcelizer = TrainingApplication.RemoteActionCompatParcelizer();
            int i7 = onCommand + 59;
            onCustomAction = i7 % 128;
            int i8 = i7 % 2;
            try {
                Object[] objArr25 = {1258705703, Long.valueOf(j3), arrayList, strRemoteActionCompatParcelizer, true};
                Class cls6 = (Class) startForeground.IconCompatParcelizer((char) (ViewConfiguration.getPressedStateDuration() >> 16), 6031 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 24 - (ViewConfiguration.getTouchSlop() >> 8));
                Object[] objArr26 = new Object[1];
                t((byte) $$I, (byte) 73, $$H[0], objArr26);
                cls6.getMethod((String) objArr26[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke2, objArr25);
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        }
        RemoteActionCompatParcelizer(new Object[]{this, "onCreate"}, TokenStreamFactory.IconCompatParcelizer(), -127142627, PlanGroup$$ExternalSyntheticLambda0.IconCompatParcelizer(), PlanGroup$$ExternalSyntheticLambda0.IconCompatParcelizer(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() - 701957759, 127142630);
        if (!(!RatingCompat())) {
            requestWindowFeature(1);
            getWindow().setFlags(1024, 1024);
        }
        super.onCreate(bundle);
        if (updateShuffleButton.AudioAttributesImplBaseParcelizer(this)) {
            finish();
        }
        NavigationBarViewSavedState navigationBarViewSavedStateOnAddQueueItem = onAddQueueItem();
        setTheme(navigationBarViewSavedStateOnAddQueueItem.getRemoteActionCompatParcelizer());
        if (navigationBarViewSavedStateOnAddQueueItem.getRead() != null || navigationBarViewSavedStateOnAddQueueItem.getWrite() != null) {
            CmcdConfigurationRequestConfig.RemoteActionCompatParcelizer(this, navigationBarViewSavedStateOnAddQueueItem.getRead(), navigationBarViewSavedStateOnAddQueueItem.getWrite());
        }
        if (onSetPlaybackSpeed()) {
            int i9 = onCustomAction + 31;
            onCommand = i9 % 128;
            int i10 = i9 % 2;
            MediaDescriptionCompat();
            int i11 = onCustomAction + 17;
            onCommand = i11 % 128;
            if (i11 % 2 != 0) {
                int i12 = 3 % 3;
            }
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            if (handleMediaPlayPauseIfPendingOnHandler() != -1) {
                int i13 = onCustomAction + 101;
                onCommand = i13 % 128;
                int i14 = i13 % 2;
                setContentView(handleMediaPlayPauseIfPendingOnHandler());
            }
            buildResolutionString.read(getClass(), "frames : layout inflation:", jCurrentTimeMillis);
            this.read = (ConnectivityManager) getSystemService("connectivity");
        } catch (Throwable th4) {
            buildResolutionString.read(getClass(), "frames : layout inflation:", jCurrentTimeMillis);
            throw th4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
    
        overridePendingTransition(com.marrow.R.anim.trans_left_in, com.marrow.R.anim.trans_left_out);
        r4 = com.marrow.ui.activities.base.BaseActivity.onCommand + 31;
        com.marrow.ui.activities.base.BaseActivity.onCustomAction = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003e, code lost:
    
        if ((r4 % 2) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
    
        r4 = null;
        r4.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0045, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001b, code lost:
    
        if ((!MediaBrowserCompatSearchResultReceiver()) != true) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:
    
        if ((!MediaBrowserCompatSearchResultReceiver()) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0028, code lost:
    
        overridePendingTransition(0, 0);
     */
    @Override // kotlin.addObserverForBackInvoker, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onPostCreate(android.os.Bundle r5) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.marrow.ui.activities.base.BaseActivity.onCommand
            int r1 = r1 + 103
            int r2 = r1 % 128
            com.marrow.ui.activities.base.BaseActivity.onCustomAction = r2
            int r1 = r1 % r0
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L1e
            super.onPostCreate(r5)
            boolean r5 = r4.MediaBrowserCompatSearchResultReceiver()
            r1 = 11
            int r1 = r1 / r3
            r5 = r5 ^ r2
            if (r5 == r2) goto L28
            goto L2c
        L1e:
            super.onPostCreate(r5)
            boolean r5 = r4.MediaBrowserCompatSearchResultReceiver()
            r5 = r5 ^ r2
            if (r5 == 0) goto L2c
        L28:
            r4.overridePendingTransition(r3, r3)
            return
        L2c:
            r5 = 2130772023(0x7f010037, float:1.7147153E38)
            r1 = 2130772024(0x7f010038, float:1.7147155E38)
            r4.overridePendingTransition(r5, r1)
            int r4 = com.marrow.ui.activities.base.BaseActivity.onCommand
            int r4 = r4 + 31
            int r5 = r4 % 128
            com.marrow.ui.activities.base.BaseActivity.onCustomAction = r5
            int r4 = r4 % r0
            if (r4 == 0) goto L41
            return
        L41:
            r4 = 0
            r4.hashCode()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow.ui.activities.base.BaseActivity.onPostCreate(android.os.Bundle):void");
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public void startActivity(Intent intent) {
        int i = 2 % 2;
        int i2 = onCommand + 45;
        onCustomAction = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            MediaBrowserCompatSearchResultReceiver();
            obj.hashCode();
            throw null;
        }
        if (!(!MediaBrowserCompatSearchResultReceiver())) {
            overridePendingTransition(R.anim.trans_left_in, R.anim.trans_left_out);
        } else {
            overridePendingTransition(0, 0);
        }
        super.startActivity(intent);
        int i3 = onCustomAction + 11;
        onCommand = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // kotlin.MediaBrowserCompatMediaItem, android.app.Activity
    public void startActivityForResult(Intent intent, int i) {
        int i2 = 2 % 2;
        if (!MediaBrowserCompatSearchResultReceiver()) {
            overridePendingTransition(0, 0);
        } else {
            int i3 = onCommand + 79;
            onCustomAction = i3 % 128;
            if (i3 % 2 == 0) {
                overridePendingTransition(R.anim.trans_left_in, R.anim.trans_left_out);
                int i4 = 74 / 0;
            } else {
                overridePendingTransition(R.anim.trans_left_in, R.anim.trans_left_out);
            }
        }
        super.startActivityForResult(intent, i);
        int i5 = onCustomAction + 53;
        onCommand = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // android.app.Activity
    public void finish() {
        int i = 2 % 2;
        super.finish();
        if (!MediaBrowserCompatSearchResultReceiver()) {
            overridePendingTransition(0, 0);
            return;
        }
        int i2 = onCustomAction + 79;
        onCommand = i2 % 128;
        int i3 = i2 % 2;
        overridePendingTransition(R.anim.trans_right_in, R.anim.trans_right_out);
        int i4 = onCommand + 61;
        onCustomAction = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onStart() {
        int i = 2 % 2;
        super.onStart();
        Iterator<handlePreambleAddressCode> it = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().iterator();
        while (true) {
            Object obj = null;
            if (!it.hasNext()) {
                if (Build.VERSION.SDK_INT >= 34) {
                    int i2 = onCustomAction + 11;
                    onCommand = i2 % 128;
                    int i3 = i2 % 2;
                    isMidrowCtrlCode ismidrowctrlcode = this.MediaDescriptionCompat;
                    registerReceiver(ismidrowctrlcode, ismidrowctrlcode.AudioAttributesCompatParcelizer(), 4);
                } else {
                    isMidrowCtrlCode ismidrowctrlcode2 = this.MediaDescriptionCompat;
                    registerReceiver(ismidrowctrlcode2, ismidrowctrlcode2.AudioAttributesCompatParcelizer());
                }
                RemoteActionCompatParcelizer(new Object[]{this, "onStart"}, TokenStreamFactory.IconCompatParcelizer(), -127142627, PlanGroup$$ExternalSyntheticLambda0.IconCompatParcelizer(), PlanGroup$$ExternalSyntheticLambda0.IconCompatParcelizer(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() - 701957759, 127142630);
                return;
            }
            int i4 = onCustomAction + 115;
            onCommand = i4 % 128;
            if (i4 % 2 != 0) {
                it.next();
                obj.hashCode();
                throw null;
            }
            handlePreambleAddressCode next = it.next();
            if (next != null) {
                write(next, next.AudioAttributesCompatParcelizer());
            }
        }
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, android.app.Activity
    public void onStop() throws NoSuchMethodException {
        int i = 2 % 2;
        int i2 = onCommand + 89;
        onCustomAction = i2 % 128;
        int i3 = i2 % 2;
        int i4 = onCustomAction + 23;
        onCommand = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 3 % 3;
        }
        for (handlePreambleAddressCode handlepreambleaddresscode : MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()) {
            if (handlepreambleaddresscode != null) {
                int i6 = onCustomAction + 9;
                onCommand = i6 % 128;
                int i7 = i6 % 2;
                IconCompatParcelizer(handlepreambleaddresscode);
            }
        }
        unregisterReceiver(this.MediaDescriptionCompat);
        RemoteActionCompatParcelizer(new Object[]{this, "onStop"}, TokenStreamFactory.IconCompatParcelizer(), -127142627, PlanGroup$$ExternalSyntheticLambda0.IconCompatParcelizer(), PlanGroup$$ExternalSyntheticLambda0.IconCompatParcelizer(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() - 701957759, 127142630);
        super.onStop();
    }

    @Override // kotlin.MediaBrowserCompatMediaItem, android.app.Activity
    public void onBackPressed() {
        int i = 2 % 2;
        int i2 = onCustomAction + 27;
        onCommand = i2 % 128;
        int i3 = i2 % 2;
        super.onBackPressed();
        if (!(!MediaBrowserCompatSearchResultReceiver())) {
            int i4 = onCommand + 21;
            onCustomAction = i4 % 128;
            int i5 = i4 % 2;
            overridePendingTransition(R.anim.trans_right_in, R.anim.trans_right_out);
            return;
        }
        overridePendingTransition(0, 0);
    }

    public void RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = onCustomAction + 79;
        onCommand = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        Dialog dialog = this.AudioAttributesImplApi21Parcelizer;
        if (dialog != null && dialog.isShowing()) {
            int i3 = onCommand + 57;
            onCustomAction = i3 % 128;
            if (i3 % 2 == 0) {
                this.AudioAttributesImplApi21Parcelizer.dismiss();
                obj.hashCode();
                throw null;
            }
            this.AudioAttributesImplApi21Parcelizer.dismiss();
        }
        argCount argcount = this.AudioAttributesCompatParcelizer;
        if (argcount != null) {
            int i4 = onCustomAction + 83;
            onCommand = i4 % 128;
            if (i4 % 2 != 0) {
                argcount.getDialog();
                obj.hashCode();
                throw null;
            }
            if (argcount.getDialog() != null && this.AudioAttributesCompatParcelizer.getDialog().isShowing()) {
                int i5 = onCommand + 35;
                onCustomAction = i5 % 128;
                int i6 = i5 % 2;
                if (!this.AudioAttributesCompatParcelizer.isRemoving()) {
                    int i7 = onCommand + 121;
                    onCustomAction = i7 % 128;
                    int i8 = i7 % 2;
                    this.AudioAttributesCompatParcelizer.dismiss();
                }
            }
        }
        int i9 = onCustomAction + 79;
        onCommand = i9 % 128;
        int i10 = i9 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0107  */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onPause() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 514
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow.ui.activities.base.BaseActivity.onPause():void");
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onResume() throws Throwable {
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            int i2 = onCommand + 5;
            onCustomAction = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = new Object[1];
            r(null, new byte[]{-123, -122, -110, -120, -111, -112, -126, -114, -124, -113, -124, -114, -115, -116, -118, -117, -117, -122, -118, -123, -124, -119, -120, -123, -121, -122}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).codePointAt(2) + 91, null, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            q(false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 17, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 98, (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 5, new char[]{65529, 65527, '\n', 65535, 5, 4, 65529, 11, '\b', '\b', 65531, 4, '\n', 65495, 6, 6, 2, 65535}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
            int i4 = onCustomAction + 19;
            onCommand = i4 % 128;
            int i5 = i4 % 2;
        }
        if (baseContext != null) {
            int i6 = onCommand + 123;
            onCustomAction = i6 % 128;
            int i7 = i6 % 2;
            if ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) {
                int i8 = onCommand + 69;
                onCustomAction = i8 % 128;
                int i9 = i8 % 2;
                baseContext = null;
            } else {
                baseContext = baseContext.getApplicationContext();
            }
        }
        if (baseContext != null) {
            try {
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (Color.argb(0, 0, 0, 0) + 4535), 16783270 + Color.rgb(0, 0, 0), 42 - (ViewConfiguration.getScrollDefaultDelay() >> 16), -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(823471051);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), 6030 - KeyEvent.keyCodeFromString(""), 25 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 1331490654, false, "RemoteActionCompatParcelizer", new Class[]{Context.class});
                }
                ((Method) objRemoteActionCompatParcelizer2).invoke(objInvoke, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        super.onResume();
        Intent intent = getIntent();
        if (intent != null) {
            int i10 = onCustomAction + 47;
            onCommand = i10 % 128;
            int i11 = i10 % 2;
            getTrackGroup.AudioAttributesCompatParcelizer("screen_view", dispatchTouchEvent.RemoteActionCompatParcelizer(intent));
        }
        if (this.syncManager.get() != null) {
            int i12 = onCommand + 113;
            onCustomAction = i12 % 128;
            int i13 = i12 % 2;
            BandwidthMeterEventListenerEventDispatcherHandlerAndListener.read(getExamName.onRemoveQueueItem(), new Object[]{this.syncManager.get()}, getExamName.onRemoveQueueItem(), 1896980334, getExamName.onRemoveQueueItem(), -1896980334, getExamName.onRemoveQueueItem());
        }
        this.write = false;
        RemoteActionCompatParcelizer(new Object[]{this, "onResume"}, TokenStreamFactory.IconCompatParcelizer(), -127142627, PlanGroup$$ExternalSyntheticLambda0.IconCompatParcelizer(), PlanGroup$$ExternalSyntheticLambda0.IconCompatParcelizer(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() - 701957759, 127142630);
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, android.app.Activity
    public void onDestroy() throws NoSuchMethodException {
        int i = 2 % 2;
        int i2 = onCommand + 19;
        onCustomAction = i2 % 128;
        int i3 = i2 % 2;
        RemoteActionCompatParcelizer(new Object[]{this, "onDestroy"}, TokenStreamFactory.IconCompatParcelizer(), -127142627, PlanGroup$$ExternalSyntheticLambda0.IconCompatParcelizer(), PlanGroup$$ExternalSyntheticLambda0.IconCompatParcelizer(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() - 701957759, 127142630);
        super.onDestroy();
        int i4 = onCommand + 77;
        onCustomAction = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 42 / 0;
        }
    }

    protected boolean MediaBrowserCompatSearchResultReceiver() {
        int i = 2 % 2;
        int i2 = onCommand + 47;
        onCustomAction = i2 % 128;
        int i3 = i2 % 2;
        boolean booleanExtra = getIntent().getBooleanExtra("key_override_transition", true);
        int i4 = onCustomAction + 105;
        onCommand = i4 % 128;
        if (i4 % 2 == 0) {
            return booleanExtra;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void RemoteActionCompatParcelizer(hasSelectionOverride hasselectionoverride) {
        int i = 2 % 2;
        int i2 = onCommand + 125;
        onCustomAction = i2 % 128;
        int i3 = i2 % 2;
        getSupportFragmentManager().IconCompatParcelizer().write(R.id.video_fragment_container, hasselectionoverride).RemoteActionCompatParcelizer();
        if (i3 == 0) {
            int i4 = 90 / 0;
        }
        int i5 = onCommand + 95;
        onCustomAction = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public void write(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        int i = 2 % 2;
        int i2 = onCommand + 63;
        onCustomAction = i2 % 128;
        int i3 = i2 % 2;
        getProvider.getInstance(this).registerReceiver(broadcastReceiver, intentFilter);
        if (i3 == 0) {
            throw null;
        }
        int i4 = onCommand + 117;
        onCustomAction = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public void IconCompatParcelizer(BroadcastReceiver broadcastReceiver) {
        int i = 2 % 2;
        int i2 = onCustomAction + 113;
        onCommand = i2 % 128;
        int i3 = i2 % 2;
        getProvider.getInstance(this).IconCompatParcelizer(broadcastReceiver);
        int i4 = onCommand + 57;
        onCustomAction = i4 % 128;
        int i5 = i4 % 2;
    }

    public void AudioAttributesCompatParcelizer(Intent intent) {
        int i = 2 % 2;
        int i2 = onCommand + 73;
        onCustomAction = i2 % 128;
        int i3 = i2 % 2;
        getProvider.getInstance(this).AudioAttributesCompatParcelizer(intent);
        if (i3 == 0) {
            int i4 = 55 / 0;
        }
    }

    protected final int onSeekTo() {
        int i = 2 % 2;
        int i2 = onCustomAction + 11;
        onCommand = i2 % 128;
        if (i2 % 2 != 0) {
            _isNaN.getColor(this, R.color.c_7eaaff);
            throw null;
        }
        int color = _isNaN.getColor(this, R.color.c_7eaaff);
        int i3 = onCustomAction + 37;
        onCommand = i3 % 128;
        int i4 = i3 % 2;
        return color;
    }

    public void aj_() {
        int i = 2 % 2;
        if (!isFinishing()) {
            RemoteActionCompatParcelizer();
            selectTextTrack selecttexttrack = new selectTextTrack(this);
            selecttexttrack.RemoteActionCompatParcelizer();
            this.AudioAttributesImplApi21Parcelizer = selecttexttrack;
            selecttexttrack.show();
            int i2 = onCustomAction + 89;
            onCommand = i2 % 128;
            int i3 = i2 % 2;
        }
        int i4 = onCommand + 69;
        onCustomAction = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object read(Object[] objArr) {
        BaseActivity baseActivity = (BaseActivity) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i = 2 % 2;
        int i2 = onCustomAction + 81;
        int i3 = i2 % 128;
        onCommand = i3;
        int i4 = i2 % 2;
        Toast toast = baseActivity.IconCompatParcelizer;
        Object obj = null;
        if (toast != null) {
            int i5 = i3 + 17;
            onCustomAction = i5 % 128;
            if (i5 % 2 != 0) {
                toast.cancel();
            } else {
                toast.cancel();
                obj.hashCode();
                throw null;
            }
        }
        Toast toastMakeText = Toast.makeText(baseActivity, iIntValue, 1);
        baseActivity.IconCompatParcelizer = toastMakeText;
        toastMakeText.show();
        return null;
    }

    public final void handleMediaPlayPauseIfPendingOnHandler(String str) {
        int i = 2 % 2;
        int i2 = onCommand + 77;
        onCustomAction = i2 % 128;
        int i3 = i2 % 2;
        Toast toast = this.IconCompatParcelizer;
        if (toast != null) {
            toast.cancel();
            int i4 = onCommand + 111;
            onCustomAction = i4 % 128;
            int i5 = i4 % 2;
        }
        Toast toastMakeText = Toast.makeText(this, str, 1);
        this.IconCompatParcelizer = toastMakeText;
        toastMakeText.show();
    }

    public void write(ResponseError responseError) {
        int i = 2 % 2;
        int i2 = onCommand + 73;
        onCustomAction = i2 % 128;
        int i3 = i2 % 2;
        int iIconCompatParcelizer = MediaSessionConnectorCustomActionProvider.IconCompatParcelizer();
        int iIconCompatParcelizer2 = MediaSessionConnectorCustomActionProvider.IconCompatParcelizer();
        int iIconCompatParcelizer3 = MediaSessionConnectorCustomActionProvider.IconCompatParcelizer();
        handleMediaPlayPauseIfPendingOnHandler((String) updateShuffleButton.IconCompatParcelizer(iIconCompatParcelizer2, -953939975, MediaSessionConnectorCustomActionProvider.IconCompatParcelizer(), iIconCompatParcelizer3, 953939977, new Object[]{responseError, this}, iIconCompatParcelizer));
        int i4 = onCustomAction + 119;
        onCommand = i4 % 128;
        int i5 = i4 % 2;
    }

    public final TrainingApplication onRemoveQueueItemAt() {
        int i = 2 % 2;
        int i2 = onCustomAction + 109;
        onCommand = i2 % 128;
        int i3 = i2 % 2;
        TrainingApplication trainingApplication = (TrainingApplication) super.getApplicationContext();
        int i4 = onCustomAction + 79;
        onCommand = i4 % 128;
        if (i4 % 2 == 0) {
            return trainingApplication;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.app.Activity
    protected void onRestart() throws NoSuchMethodException {
        int i = 2 % 2;
        int i2 = onCustomAction + 27;
        onCommand = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            super.onRestart();
            RemoteActionCompatParcelizer(new Object[]{this, "onRestart"}, TokenStreamFactory.IconCompatParcelizer(), -127142627, PlanGroup$$ExternalSyntheticLambda0.IconCompatParcelizer(), PlanGroup$$ExternalSyntheticLambda0.IconCompatParcelizer(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() - 701957759, 127142630);
            return;
        }
        super.onRestart();
        RemoteActionCompatParcelizer(new Object[]{this, "onRestart"}, TokenStreamFactory.IconCompatParcelizer(), -127142627, PlanGroup$$ExternalSyntheticLambda0.IconCompatParcelizer(), PlanGroup$$ExternalSyntheticLambda0.IconCompatParcelizer(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() - 701957759, 127142630);
        obj.hashCode();
        throw null;
    }

    protected final void IconCompatParcelizer(boolean z) throws NoSuchMethodException {
        int i = 2 % 2;
        int i2 = onCommand + 59;
        onCustomAction = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            RemoteActionCompatParcelizer(new Object[]{this, "NetworkChange  --> Has Internet :".concat(String.valueOf(z))}, TokenStreamFactory.IconCompatParcelizer(), -127142627, PlanGroup$$ExternalSyntheticLambda0.IconCompatParcelizer(), PlanGroup$$ExternalSyntheticLambda0.IconCompatParcelizer(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() - 701957759, 127142630);
            obj.hashCode();
            throw null;
        }
        RemoteActionCompatParcelizer(new Object[]{this, "NetworkChange  --> Has Internet :".concat(String.valueOf(z))}, TokenStreamFactory.IconCompatParcelizer(), -127142627, PlanGroup$$ExternalSyntheticLambda0.IconCompatParcelizer(), PlanGroup$$ExternalSyntheticLambda0.IconCompatParcelizer(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() - 701957759, 127142630);
        int i3 = onCommand + 55;
        onCustomAction = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    protected final void onPrepareFromUri() {
        int i = 2 % 2;
        int i2 = onCustomAction + 91;
        onCommand = i2 % 128;
        int i3 = i2 % 2;
        NetworkAvailableJobService.IconCompatParcelizer(this);
        int i4 = onCustomAction + 121;
        onCommand = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public boolean aC_() {
        int i = 2 % 2;
        int i2 = onCustomAction + 25;
        onCommand = i2 % 128;
        int i3 = i2 % 2;
        boolean zWrite = getTrackName.write(this);
        int i4 = onCommand + 25;
        onCustomAction = i4 % 128;
        int i5 = i4 % 2;
        return zWrite;
    }

    protected final void AudioAttributesCompatParcelizer(hasSelectionOverride hasselectionoverride) {
        int i = 2 % 2;
        int i2 = onCommand + 55;
        onCustomAction = i2 % 128;
        int i3 = i2 % 2;
        write(hasselectionoverride);
        if (i3 == 0) {
            throw null;
        }
        int i4 = onCustomAction + 83;
        onCommand = i4 % 128;
        int i5 = i4 % 2;
    }

    private void write(hasSelectionOverride hasselectionoverride) {
        int i = 2 % 2;
        int i2 = onCustomAction + 9;
        onCommand = i2 % 128;
        int i3 = i2 % 2;
        getSupportFragmentManager().IconCompatParcelizer().write(R.id.fragment_container, hasselectionoverride).RemoteActionCompatParcelizer();
        int i4 = onCommand + 79;
        onCustomAction = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void read(hasSelectionOverride hasselectionoverride) {
        int i = 2 % 2;
        int i2 = onCustomAction + 95;
        onCommand = i2 % 128;
        int i3 = i2 % 2;
        _doAddInjectable _doaddinjectableIconCompatParcelizer = getSupportFragmentManager().IconCompatParcelizer();
        _doaddinjectableIconCompatParcelizer.RemoteActionCompatParcelizer(R.anim.trans_left_in, R.anim.trans_left_out, R.anim.trans_right_in, R.anim.trans_right_out);
        _doaddinjectableIconCompatParcelizer.IconCompatParcelizer(R.id.fragment_container, hasselectionoverride).read((String) null).write();
        int i4 = onCustomAction + 105;
        onCommand = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object AudioAttributesCompatParcelizer(Object[] objArr) {
        BaseActivity baseActivity = (BaseActivity) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = onCommand + 95;
        onCustomAction = i2 % 128;
        int i3 = i2 % 2;
        buildResolutionString.read(baseActivity.getClass(), str);
        if (i3 == 0) {
            throw null;
        }
        int i4 = onCustomAction + 73;
        onCommand = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    @Override // kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        int i = 2 % 2;
        int i2 = onCustomAction + 121;
        onCommand = i2 % 128;
        int i3 = i2 % 2;
        this.write = true;
        super.onSaveInstanceState(bundle);
        int i4 = onCommand + 121;
        onCustomAction = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object RemoteActionCompatParcelizer(Object[] objArr) {
        int i = 2 % 2;
        if ((((BaseActivity) objArr[0]).getWindow().getAttributes().flags & 8192) != 0) {
            int i2 = onCommand + 119;
            onCustomAction = i2 % 128;
            return i2 % 2 != 0;
        }
        int i3 = onCustomAction + 95;
        onCommand = i3 % 128;
        int i4 = i3 % 2;
        return false;
    }

    @Override // kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        int i3 = 2 % 2;
        int i4 = onCommand + 33;
        onCustomAction = i4 % 128;
        int i5 = i4 % 2;
        if (i != 400) {
            super.onActivityResult(i, i2, intent);
            return;
        }
        finish();
        int i6 = onCommand + 97;
        onCustomAction = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 35 / 0;
        }
    }

    public boolean onSetCaptioningEnabled() {
        int i = 2 % 2;
        int i2 = onCustomAction + 17;
        onCommand = i2 % 128;
        int i3 = i2 % 2;
        boolean zRatingCompat = onRemoveQueueItemAt().RatingCompat();
        int i4 = onCustomAction + 47;
        onCommand = i4 % 128;
        if (i4 % 2 == 0) {
            return zRatingCompat;
        }
        throw null;
    }

    private void MediaDescriptionCompat() throws NoSuchMethodException {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = onCustomAction + 105;
        onCommand = i3 % 128;
        int i4 = i3 % 2;
        boolean zBooleanValue = ((Boolean) RemoteActionCompatParcelizer(new Object[]{this}, (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) - 111817575, 2053487603, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 1380344770, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(0) + 1560178843, PlanGroup$$ExternalSyntheticLambda0.IconCompatParcelizer(), -2053487601)).booleanValue();
        getWindow().setFlags(8192, 8192);
        if (((Boolean) RemoteActionCompatParcelizer(new Object[]{this}, (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) - 111817575, 2053487603, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 1380344770, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(0) + 1560178843, PlanGroup$$ExternalSyntheticLambda0.IconCompatParcelizer(), -2053487601)).booleanValue()) {
            i = 0;
        } else {
            int i5 = onCommand + 55;
            onCustomAction = i5 % 128;
            int i6 = i5 % 2;
        }
        onRemoveQueueItemAt().MediaDescriptionCompat().AudioAttributesImplBaseParcelizer((zBooleanValue ? 1 : 0) + i);
    }

    protected final void onRewind() {
        int i = 2 % 2;
        int i2 = onCustomAction + 109;
        onCommand = i2 % 128;
        if (i2 % 2 == 0) {
            Display[] displays = ((DisplayManager) getSystemService("display")).getDisplays("android.hardware.display.category.PRESENTATION");
            if (parseCea608AccessibilityChannel.read(displays)) {
                return;
            }
            new getEventTimes(this, displays[0], new PgsDecoderCueBuilder() { // from class: com.marrow.ui.activities.base.BaseActivity.3
                @Override // kotlin.PgsDecoderCueBuilder
                public final void RemoteActionCompatParcelizer() {
                    BaseActivity.this.onSkipToPrevious();
                }
            }).show();
            int i3 = onCustomAction + 111;
            onCommand = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        parseCea608AccessibilityChannel.read(((DisplayManager) getSystemService("display")).getDisplays("android.hardware.display.category.PRESENTATION"));
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x0985 A[Catch: all -> 0x0309, TryCatch #3 {all -> 0x0309, blocks: (B:209:0x1001, B:211:0x1007, B:212:0x1032, B:245:0x1412, B:247:0x1418, B:248:0x1440, B:226:0x11f6, B:228:0x1218, B:229:0x126f, B:170:0x0b91, B:172:0x0b97, B:173:0x0bc0, B:126:0x097f, B:128:0x0985, B:129:0x09b4, B:19:0x00e2, B:21:0x00e8, B:22:0x0112, B:24:0x027d, B:26:0x02ae, B:27:0x0303, B:134:0x0a45, B:136:0x0a49, B:140:0x0a55, B:156:0x0b25, B:158:0x0b2b, B:159:0x0b2c, B:161:0x0b2e, B:163:0x0b35, B:164:0x0b36), top: B:276:0x00e2, inners: #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00c1  */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void attachBaseContext(android.content.Context r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 5856
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow.ui.activities.base.BaseActivity.attachBaseContext(android.content.Context):void");
    }

    private void RemoteActionCompatParcelizer(String str) {
        RemoteActionCompatParcelizer(new Object[]{this, str}, TokenStreamFactory.IconCompatParcelizer(), -127142627, PlanGroup$$ExternalSyntheticLambda0.IconCompatParcelizer(), PlanGroup$$ExternalSyntheticLambda0.IconCompatParcelizer(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() - 701957759, 127142630);
    }

    public final boolean MediaMetadataCompat(String str) {
        return ((Boolean) RemoteActionCompatParcelizer(new Object[]{this, str}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 165356252, 1105055713, TokenStreamFactory.IconCompatParcelizer(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 789822874, 1229616748 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length(), -1105055712)).booleanValue();
    }

    protected handlePreambleAddressCode AudioAttributesImplApi26Parcelizer() {
        int i = 2 % 2;
        int i2 = onCustomAction;
        int i3 = i2 + 45;
        onCommand = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 54 / 0;
        }
        int i5 = i2 + 93;
        onCommand = i5 % 128;
        Object obj = null;
        if (i5 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    protected handlePreambleAddressCode[] MediaBrowserCompatCustomActionResultReceiver() {
        int i = 2 % 2;
        int i2 = onCommand;
        int i3 = i2 + 27;
        onCustomAction = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        int i4 = i2 + 11;
        onCustomAction = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    protected boolean RatingCompat() {
        int i = 2 % 2;
        int i2 = onCustomAction + 75;
        int i3 = i2 % 128;
        onCommand = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 73;
        onCustomAction = i5 % 128;
        if (i5 % 2 != 0) {
            return false;
        }
        throw null;
    }

    protected boolean ai_() {
        int i = 2 % 2;
        int i2 = onCustomAction;
        int i3 = i2 + 89;
        onCommand = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 103;
        onCommand = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    public final boolean onSetRepeatMode() {
        return ((Boolean) RemoteActionCompatParcelizer(new Object[]{this}, (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) - 111817575, 2053487603, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 1380344770, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(0) + 1560178843, PlanGroup$$ExternalSyntheticLambda0.IconCompatParcelizer(), -2053487601)).booleanValue();
    }

    protected boolean onSetPlaybackSpeed() {
        int i = 2 % 2;
        int i2 = onCommand;
        int i3 = i2 + 35;
        onCustomAction = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 31;
        onCustomAction = i5 % 128;
        if (i5 % 2 != 0) {
            return false;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    protected boolean onSetShuffleMode() {
        int i = 2 % 2;
        int i2 = onCommand + 99;
        onCustomAction = i2 % 128;
        return i2 % 2 == 0;
    }

    protected void onSkipToPrevious() {
        int i = 2 % 2;
        int i2 = onCustomAction + 19;
        onCommand = i2 % 128;
        int i3 = i2 % 2;
    }

    public void onClick(View view) {
        int i = 2 % 2;
        int i2 = onCustomAction + 65;
        onCommand = i2 % 128;
        int i3 = i2 % 2;
    }

    public final void write(int i) {
        Object[] objArr = {this, Integer.valueOf(i)};
        int iIconCompatParcelizer = PlanGroup$$ExternalSyntheticLambda0.IconCompatParcelizer();
        int iIconCompatParcelizer2 = PlanGroup$$ExternalSyntheticLambda0.IconCompatParcelizer();
        RemoteActionCompatParcelizer(objArr, iIconCompatParcelizer, 1520881339, PlanGroup$$ExternalSyntheticLambda0.IconCompatParcelizer(), PlanGroup$$ExternalSyntheticLambda0.IconCompatParcelizer(), iIconCompatParcelizer2, -1520881339);
    }
}
