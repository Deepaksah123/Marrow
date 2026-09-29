package kotlin;

import android.app.Service;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Binder;
import android.os.IBinder;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.marrow.R;
import com.marrow.TrainingApplication;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.initCodec;
import org.apache.commons.compress.archivers.tar.TarConstants;
import org.apache.commons.compress.utils.CharsetNames;

/* JADX INFO: loaded from: classes5.dex */
public abstract class isSecure extends Service {
    private static short[] AudioAttributesImplBaseParcelizer = null;
    static final long MESSAGE_TIMEOUT_S = 20;
    private static final String TAG = "EnhancedIntentService";
    private Binder binder;
    private int lastStartId;
    private static final byte[] $$c = {99, -29, 19, 27};
    private static final int $$f = 19;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {3, 110, -29, 16, 26, 15, 9, 12, -8, -29, 41, 24, -4, 13, 6, -36, TarConstants.LF_CHR, 5, 10, -8, 26, -29, 24, 24, -8, 9, 14, 4, 24, -14, 20, -58, 64, 5, 22, -25, 27, 20, -1, -4, 19, -6, 15, 10, -16, 36, 1, -65, TarConstants.LF_DIR, 26, 15, 9, 12, -8, -29, 41, 24, -4, 13, 6, -36, TarConstants.LF_CHR, 5, 10, -8, 26, -29, 24, 24, -8, 9, 14, 4, 24, -14, 20};
    private static final int $$k = 9;
    private static final byte[] $$a = {32, -59, 22, 74, 12, 3, -4, -20, -9, -3, -6, 14, 35, -35, -18, 10, -7, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, 42, -44, 14, -9, 26, -20, 1, -3, -5, -14, 16, -14, -27, -13, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, TarConstants.LF_NORMAL, -51, 1, -2, 4, 1, 43, -35, -18, 10, -7, 0, 27, -20, -15, -3, 8, -9, 33, -20, 1, -3, -5, -14, 16, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, 0, -32, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, -5, -27, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 47, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14};
    private static final int $$b = 219;
    private static int AudioAttributesImplApi26Parcelizer = 0;
    private static int MediaBrowserCompatItemReceiver = 1;
    private static long write = 3049237760098733470L;
    private static int RemoteActionCompatParcelizer = 533196141;
    private static int IconCompatParcelizer = -819363167;
    private static int read = -1027384035;
    private static byte[] AudioAttributesCompatParcelizer = {TarConstants.LF_PAX_EXTENDED_HEADER_UC, -109, 12, -76, 100, -99, -96, -27, -81, -38, -77, -47, -65, -44, -66, -29, -85, -34, -7, -96, -75, -38, -65, -28, -43, -79, -23, -79, -81, -23, -79, -44, -86, -30, -76, -36, -77, -30, -83, -7, -95, -8, -37, -27, -78, -83, -27, -96, -27, -81, -43, -81, -73, -38, -82, -95, -73, -83, -30, -33, -82, -78, -37, -65, -81, -45, -95, -66, -43, -71, 71, -110, -73, -100, 68, -119, -71, 66, -106, -67, -106, 78, -118, -119, -105, -66, 91, -15, 68, -119, 69, 64, -128, -71, -107, -71, 92, -117, 71, -120, -117, -120, -110, -74, -120, -73, 116, 80, 9, 19, -66, 116, 91, 11, 66, 46, 47, -127, 0, -53, -78, 65, 66, 71, 118, 94, 119, 78, -44, 24, -41, 4, 5, -48, 13, -30, -47, -18, 29, 1, -41, 25, 77, -64, -36, 37, -118, -36, TarConstants.LF_CHR, -56, -122, -52, -38, -36, -49, -40, -64, -22, 66, 44, 41, 79, 43, 69, 41, 65, 43, 79, 40};
    final ExecutorService executor = isTunnelingV21.AudioAttributesCompatParcelizer();
    private final Object lock = new Object();
    private int runningTasks = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$i(int r7, byte r8, short r9) {
        /*
            int r7 = 121 - r7
            int r9 = r9 * 4
            int r9 = 1 - r9
            byte[] r0 = kotlin.isSecure.$$c
            int r8 = r8 * 4
            int r8 = 4 - r8
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r8
            r4 = r2
            goto L28
        L14:
            r3 = r2
        L15:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r9) goto L22
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L22:
            r3 = r0[r8]
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r6
        L28:
            int r7 = r7 + r8
            int r8 = r3 + 1
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.isSecure.$$i(int, byte, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(int r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 + 4
            int r8 = 114 - r8
            byte[] r0 = kotlin.isSecure.$$a
            int r1 = r7 + 4
            byte[] r1 = new byte[r1]
            int r7 = r7 + 3
            r2 = 0
            if (r0 != 0) goto L13
            r8 = r6
            r4 = r7
            r3 = r2
            goto L2b
        L13:
            r3 = r2
        L14:
            r5 = r8
            r8 = r6
            r6 = r5
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r7) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L24:
            int r3 = r3 + 1
            r4 = r0[r8]
            r5 = r8
            r8 = r6
            r6 = r5
        L2b:
            int r4 = -r4
            int r6 = r6 + 1
            int r8 = r8 + r4
            int r8 = r8 + (-1)
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.isSecure.c(int, byte, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void d(short r5, int r6, short r7, java.lang.Object[] r8) {
        /*
            int r7 = r7 * 18
            int r0 = 46 - r7
            int r5 = r5 * 29
            int r5 = 111 - r5
            byte[] r1 = kotlin.isSecure.$$j
            int r6 = r6 * 27
            int r6 = 31 - r6
            byte[] r0 = new byte[r0]
            int r7 = 45 - r7
            r2 = 0
            if (r1 != 0) goto L19
            r3 = r5
            r5 = r7
            r4 = r2
            goto L2b
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r5
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L29
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L29:
            r3 = r1[r6]
        L2b:
            int r5 = r5 + r3
            int r6 = r6 + 1
            int r5 = r5 + (-7)
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.isSecure.d(short, int, short, java.lang.Object[]):void");
    }

    public abstract void handleIntent(Intent intent);

    static /* synthetic */ Task access$000(isSecure issecure, Intent intent) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 109;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        Task<Void> taskProcessIntent = issecure.processIntent(intent);
        int i4 = AudioAttributesImplApi26Parcelizer + 19;
        MediaBrowserCompatItemReceiver = i4 % 128;
        int i5 = i4 % 2;
        return taskProcessIntent;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        Binder binder;
        synchronized (this) {
            if (this.binder == null) {
                this.binder = new initCodec(new initCodec.read() { // from class: o.isSecure.2
                    @Override // o.initCodec.read
                    public final Task<Void> write(Intent intent2) {
                        return isSecure.access$000(isSecure.this, intent2);
                    }
                });
            }
            binder = this.binder;
        }
        return binder;
    }

    private static void a(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        notifyDownloadChanged notifydownloadchanged = new notifyDownloadChanged();
        notifydownloadchanged.read = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        notifydownloadchanged.AudioAttributesCompatParcelizer = 0;
        while (notifydownloadchanged.AudioAttributesCompatParcelizer < cArr.length) {
            int i3 = notifydownloadchanged.AudioAttributesCompatParcelizer;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[notifydownloadchanged.AudioAttributesCompatParcelizer]), notifydownloadchanged, notifydownloadchanged};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1435583294);
                if (objRemoteActionCompatParcelizer == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objRemoteActionCompatParcelizer = startForeground.read((char) (38462 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), 532 - ExpandableListView.getPackedPositionType(0L), (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 8, -735610793, false, $$i(b, b2, b2), new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i3] = ((Long) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).longValue() ^ (write ^ 2192498202983240651L);
                Object[] objArr3 = {notifydownloadchanged, notifydownloadchanged};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(1971306176);
                if (objRemoteActionCompatParcelizer2 == null) {
                    char c = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 36622);
                    int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 2340;
                    int i4 = 27 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                    byte b3 = (byte) ($$f & 14);
                    byte b4 = (byte) (b3 - 2);
                    objRemoteActionCompatParcelizer2 = startForeground.read(c, iKeyCodeFromString, i4, 188119637, false, $$i(b3, b4, b4), new Class[]{Object.class, Object.class});
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
        char[] cArr2 = new char[length];
        notifydownloadchanged.AudioAttributesCompatParcelizer = 0;
        while (notifydownloadchanged.AudioAttributesCompatParcelizer < cArr.length) {
            int i5 = $11 + 27;
            $10 = i5 % 128;
            if (i5 % 2 != 0) {
                cArr2[notifydownloadchanged.AudioAttributesCompatParcelizer] = (char) jArr[notifydownloadchanged.AudioAttributesCompatParcelizer];
                Object[] objArr4 = {notifydownloadchanged, notifydownloadchanged};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(1971306176);
                if (objRemoteActionCompatParcelizer3 == null) {
                    char cLastIndexOf = (char) (36620 - TextUtils.lastIndexOf("", '0', 0));
                    int iIndexOf = 2339 - TextUtils.indexOf((CharSequence) "", '0');
                    int iKeyCodeFromString2 = 28 - KeyEvent.keyCodeFromString("");
                    byte b5 = (byte) ($$f & 14);
                    byte b6 = (byte) (b5 - 2);
                    objRemoteActionCompatParcelizer3 = startForeground.read(cLastIndexOf, iIndexOf, iKeyCodeFromString2, 188119637, false, $$i(b5, b6, b6), new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                throw null;
            }
            cArr2[notifydownloadchanged.AudioAttributesCompatParcelizer] = (char) jArr[notifydownloadchanged.AudioAttributesCompatParcelizer];
            Object[] objArr5 = {notifydownloadchanged, notifydownloadchanged};
            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(1971306176);
            if (objRemoteActionCompatParcelizer4 == null) {
                char cResolveSizeAndState = (char) (36621 - View.resolveSizeAndState(0, 0, 0));
                int modifierMetaStateMask = 2339 - ((byte) KeyEvent.getModifierMetaStateMask());
                int iRgb = (-16777188) - Color.rgb(0, 0, 0);
                byte b7 = (byte) ($$f & 14);
                byte b8 = (byte) (b7 - 2);
                objRemoteActionCompatParcelizer4 = startForeground.read(cResolveSizeAndState, modifierMetaStateMask, iRgb, 188119637, false, $$i(b7, b8, b8), new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
            int i6 = $11 + 101;
            $10 = i6 % 128;
            int i7 = i6 % 2;
        }
        objArr[0] = new String(cArr2);
    }

    /* JADX INFO: renamed from: lambda$processIntent$0$com-google-firebase-messaging-EnhancedIntentService, reason: not valid java name */
    /* synthetic */ void m381lambda$processIntent$0$comgooglefirebasemessagingEnhancedIntentService(Intent intent, TaskCompletionSource taskCompletionSource) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer + 75;
        MediaBrowserCompatItemReceiver = i2 % 128;
        Object obj = null;
        try {
            if (i2 % 2 != 0) {
                handleIntent(intent);
                taskCompletionSource.setResult(null);
                int i3 = AudioAttributesImplApi26Parcelizer + 21;
                MediaBrowserCompatItemReceiver = i3 % 128;
                int i4 = i3 % 2;
                return;
            }
            handleIntent(intent);
            taskCompletionSource.setResult(null);
            obj.hashCode();
            throw null;
        } catch (Throwable th) {
            taskCompletionSource.setResult(null);
            throw th;
        }
    }

    private Task<Void> processIntent(final Intent intent) {
        int i = 2 % 2;
        if (!(!handleIntentOnMainThread(intent))) {
            int i2 = MediaBrowserCompatItemReceiver + 95;
            AudioAttributesImplApi26Parcelizer = i2 % 128;
            if (i2 % 2 == 0) {
                return Tasks.forResult(null);
            }
            int i3 = 88 / 0;
            return Tasks.forResult(null);
        }
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.executor.execute(new Runnable() { // from class: o.isCodecProfileAndLevelSupported
            @Override // java.lang.Runnable
            public final void run() {
                this.write.m381lambda$processIntent$0$comgooglefirebasemessagingEnhancedIntentService(intent, taskCompletionSource);
            }
        });
        Task<Void> task = taskCompletionSource.getTask();
        int i4 = AudioAttributesImplApi26Parcelizer + 85;
        MediaBrowserCompatItemReceiver = i4 % 128;
        if (i4 % 2 != 0) {
            return task;
        }
        throw null;
    }

    @Override // android.app.Service
    public final int onStartCommand(final Intent intent, int i, int i2) {
        synchronized (this.lock) {
            this.lastStartId = i2;
            this.runningTasks++;
        }
        Intent startCommandIntent = getStartCommandIntent(intent);
        if (startCommandIntent == null) {
            finishTask(intent);
            return 2;
        }
        Task<Void> taskProcessIntent = processIntent(startCommandIntent);
        if (taskProcessIntent.isComplete()) {
            finishTask(intent);
            return 2;
        }
        taskProcessIntent.addOnCompleteListener(new ObjectIdWriter(), new OnCompleteListener() { // from class: o.isSampleMimeTypeSupported
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                this.RemoteActionCompatParcelizer.m380lambda$onStartCommand$1$comgooglefirebasemessagingEnhancedIntentService(intent, task);
            }
        });
        return 3;
    }

    /* JADX INFO: renamed from: lambda$onStartCommand$1$com-google-firebase-messaging-EnhancedIntentService, reason: not valid java name */
    /* synthetic */ void m380lambda$onStartCommand$1$comgooglefirebasemessagingEnhancedIntentService(Intent intent, Task task) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 73;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        finishTask(intent);
        int i4 = AudioAttributesImplApi26Parcelizer + 81;
        MediaBrowserCompatItemReceiver = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // android.app.Service
    public void onDestroy() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer + 49;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
        this.executor.shutdown();
        super.onDestroy();
        int i4 = MediaBrowserCompatItemReceiver + 51;
        AudioAttributesImplApi26Parcelizer = i4 % 128;
        int i5 = i4 % 2;
    }

    private void finishTask(Intent intent) {
        if (intent != null) {
            isMediaCodecException.AudioAttributesCompatParcelizer(intent);
        }
        synchronized (this.lock) {
            int i = this.runningTasks - 1;
            this.runningTasks = i;
            if (i == 0) {
                stopSelfResultHook(this.lastStartId);
            }
        }
    }

    boolean stopSelfResultHook(int i) {
        int i2 = 2 % 2;
        int i3 = AudioAttributesImplApi26Parcelizer + 49;
        MediaBrowserCompatItemReceiver = i3 % 128;
        if (i3 % 2 != 0) {
            return stopSelfResult(i);
        }
        stopSelfResult(i);
        throw null;
    }

    private static void b(int i, short s, int i2, int i3, byte b, Object[] objArr) throws Throwable {
        int i4;
        int length;
        byte[] bArr;
        int i5;
        int i6 = 2 % 2;
        buildResumeDownloadsIntent buildresumedownloadsintent = new buildResumeDownloadsIntent();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(IconCompatParcelizer)};
            int i7 = 0;
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(559968424);
            if (objRemoteActionCompatParcelizer == null) {
                objRemoteActionCompatParcelizer = startForeground.read((char) (1 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), (KeyEvent.getMaxKeyCode() >> 16) + 24297, 11 - ((byte) KeyEvent.getModifierMetaStateMask()), 1596568637, false, CmcdHeadersFactory.STREAM_TYPE_LIVE, new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                int i8 = $10 + 97;
                int i9 = i8 % 128;
                $11 = i9;
                int i10 = i8 % 2;
                int i11 = i9 + 67;
                $10 = i11 % 128;
                int i12 = i11 % 2;
                i4 = 1;
            } else {
                i4 = 0;
            }
            if (i4 != 0) {
                byte[] bArr2 = AudioAttributesCompatParcelizer;
                if (bArr2 != null) {
                    int i13 = $10 + 77;
                    $11 = i13 % 128;
                    int i14 = i13 % 2;
                    int length2 = bArr2.length;
                    byte[] bArr3 = new byte[length2];
                    int i15 = 0;
                    while (i15 < length2) {
                        Object[] objArr3 = new Object[1];
                        objArr3[i7] = Integer.valueOf(bArr2[i15]);
                        Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(28234468);
                        if (objRemoteActionCompatParcelizer2 == null) {
                            byte b2 = (byte) i7;
                            objRemoteActionCompatParcelizer2 = startForeground.read((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 3082 - View.resolveSizeAndState(i7, i7, i7), 128 - KeyEvent.normalizeMetaState(i7), 2145850993, false, $$i((byte) ($$f >>> 1), b2, b2), new Class[]{Integer.TYPE});
                        }
                        bArr3[i15] = ((Byte) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).byteValue();
                        i15++;
                        i7 = 0;
                    }
                    bArr2 = bArr3;
                }
                if (bArr2 != null) {
                    byte[] bArr4 = AudioAttributesCompatParcelizer;
                    Object[] objArr4 = {Integer.valueOf(i3), Integer.valueOf(RemoteActionCompatParcelizer)};
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(559968424);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) (MotionEvent.axisFromString("") + 1), TextUtils.indexOf((CharSequence) "", '0') + 24298, TextUtils.indexOf((CharSequence) "", '0', 0) + 13, 1596568637, false, CmcdHeadersFactory.STREAM_TYPE_LIVE, new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr4[((Integer) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).intValue()]) ^ 7899112766888837815L)) + ((int) (((long) IconCompatParcelizer) ^ 7899112766888837815L)));
                } else {
                    iIntValue = (short) (((short) (((long) AudioAttributesImplBaseParcelizer[i3 + ((int) (((long) RemoteActionCompatParcelizer) ^ 7899112766888837815L))]) ^ 7899112766888837815L)) + ((int) (((long) IconCompatParcelizer) ^ 7899112766888837815L)));
                }
            }
            if (iIntValue > 0) {
                int i16 = $11 + 89;
                $10 = i16 % 128;
                int i17 = i16 % 2;
                buildresumedownloadsintent.read = ((i3 + iIntValue) - 2) + ((int) (((long) RemoteActionCompatParcelizer) ^ 7899112766888837815L)) + i4;
                Object[] objArr5 = {buildresumedownloadsintent, Integer.valueOf(i2), Integer.valueOf(read), sb};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(107629512);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) (34134 - ((Process.getThreadPriority(0) + 20) >> 6)), AndroidCharacter.getMirror('0') + 13384, 21 - ((Process.getThreadPriority(0) + 20) >> 6), 2015596381, false, "t", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).append(buildresumedownloadsintent.IconCompatParcelizer);
                buildresumedownloadsintent.RemoteActionCompatParcelizer = buildresumedownloadsintent.IconCompatParcelizer;
                byte[] bArr5 = AudioAttributesCompatParcelizer;
                if (bArr5 != null) {
                    int i18 = $11 + 53;
                    $10 = i18 % 128;
                    if (i18 % 2 != 0) {
                        length = bArr5.length;
                        bArr = new byte[length];
                        i5 = 1;
                    } else {
                        length = bArr5.length;
                        bArr = new byte[length];
                        i5 = 0;
                    }
                    while (i5 < length) {
                        bArr[i5] = (byte) (((long) bArr5[i5]) ^ 7899112766888837815L);
                        i5++;
                    }
                    bArr5 = bArr;
                }
                boolean z = bArr5 != null;
                buildresumedownloadsintent.AudioAttributesCompatParcelizer = 1;
                while (buildresumedownloadsintent.AudioAttributesCompatParcelizer < iIntValue) {
                    int i19 = $11;
                    int i20 = i19 + 41;
                    $10 = i20 % 128;
                    if (i20 % 2 != 0) {
                        throw null;
                    }
                    if (!(!z)) {
                        int i21 = i19 + 53;
                        $10 = i21 % 128;
                        int i22 = i21 % 2;
                        byte[] bArr6 = AudioAttributesCompatParcelizer;
                        buildresumedownloadsintent.read = buildresumedownloadsintent.read - 1;
                        buildresumedownloadsintent.IconCompatParcelizer = (char) (buildresumedownloadsintent.RemoteActionCompatParcelizer + (((byte) (((byte) (((long) bArr6[r1]) ^ 7899112766888837815L)) + s)) ^ b));
                    } else {
                        short[] sArr = AudioAttributesImplBaseParcelizer;
                        buildresumedownloadsintent.read = buildresumedownloadsintent.read - 1;
                        buildresumedownloadsintent.IconCompatParcelizer = (char) (buildresumedownloadsintent.RemoteActionCompatParcelizer + (((short) (((short) (((long) sArr[r1]) ^ 7899112766888837815L)) + s)) ^ b));
                    }
                    sb.append(buildresumedownloadsintent.IconCompatParcelizer);
                    buildresumedownloadsintent.RemoteActionCompatParcelizer = buildresumedownloadsintent.IconCompatParcelizer;
                    buildresumedownloadsintent.AudioAttributesCompatParcelizer++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(Context context) throws Throwable {
        String strValueOf;
        String strValueOf2;
        Object[] objArr;
        Object[] objArr2;
        char c;
        List<Object[]> list;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object[] objArr3 = new Object[1];
        a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 54241, new char[]{7732, 52688, 47591, 26086, 20886, 15787, 59827, 54550, 33122, 28005, 22869, 1308, 61731, 56533, 35052, 29941, 8342, 3261}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).length() - 27, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 4), (-233496385) + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length(), 789680131 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(0) - 78), objArr4);
        int iIntValue = ((Integer) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).intValue() % 100000;
        if (iIntValue < 99000 || iIntValue > 99999) {
            Context applicationContext = context != null ? ((context instanceof ContextWrapper) && ((ContextWrapper) context).getBaseContext() == null) ? null : context.getApplicationContext() : context;
            if (applicationContext != null) {
                try {
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (View.getDefaultSize(0, 0) + 4535), 6054 - View.MeasureSpec.getMode(0), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                    Object[] objArr5 = new Object[1];
                    a((Process.myPid() >> 22) + 65213, new char[]{7734, 57565, 58143, 57860, 58562, 59264, 58970, 59676, 60297, 60102, 60676, 60531, 61164, 61866, 61543, 62323, 62901, 62653, 63356, 63074, 63650, 64433, 64013, 64663, 65493, 65094, 49491, 50139, 49866, 50445, 50241, 50822, 51600, 51258, 52089, 52711, 52387, 53095, 52793, 53417, 54201, 53795, 54638, 55263, 54801, 55637, 56261, 55939}, objArr5);
                    String str = (String) objArr5[0];
                    Object[] objArr6 = new Object[1];
                    a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() + 26569, new char[]{7781, 31227, 53676, 10498, 33110, 6453, 28844, 51448, 8200, 47191, 4147, 27640, 50169, 23309, 45831, 2912, 25316, 64173, 21086, 43611, 615, 40380, 62975, 19719, 42255, 15713, 38070, 60666, 17408, 56411, 13409, 36790, 59333, 32524, 55053, 12129, 34535, 7878, 30216, 52830, 9829, 33207, 6549, 29022, 51469, 8506, 47282, 4242, 26645, 49233, 22634, 46002, 3008, 25373, 64351, 21355, 43701, 662, 39490, 61961, 19052, 42473, 15808, 38161}, objArr6);
                    String str2 = (String) objArr6[0];
                    Object[] objArr7 = new Object[1];
                    b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).length() - 27, (short) (73 - TextUtils.indexOf((CharSequence) "", '0', 0)), (-233496392) - View.resolveSize(0, 0), 789680170 - Process.getGidForName(""), (byte) (99 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), objArr7);
                    String str3 = (String) objArr7[0];
                    Object[] objArr8 = new Object[1];
                    a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 64814, new char[]{7741, 58224, 58499, 59862, 60258, 60666, 61852, 62285, 62649, 63981, 64278, 64578, 49632, 49978, 50260, 51615, 52011, 52304, 53652, 54136, 54389, 55704, 56017, 56439, 41388, 41672, 41996, 43455, 43770, 44044, 45317, 45821, 46080, 47429, 47845, 48162, 33090, 33425, 33830, 35171, 35471, 36809, 37169, 37549, 38870, 39173, 39668, 40939, 24853, 25277, 26536, 26911, 27215, 28663, 28966, 29249, 30617, 31091, 31353, 32716, 16518, 17021, 18365, 18655, 19067, 20400, 20676}, objArr8);
                    String str4 = (String) objArr8[0];
                    Object[] objArr9 = new Object[1];
                    a((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 51130, new char[]{7788, 55744, 37138, 18768, 151, 63680}, objArr9);
                    String str5 = (String) objArr9[0];
                    Object[] objArr10 = new Object[1];
                    b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 58, (short) ((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 103), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(3) - 233496486, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 789680200, (byte) ((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 87), objArr10);
                    Object[] objArr11 = {applicationContext, str, str2, str3, str4, true, str5, (String) objArr10[0], 86400};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(448819875);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) Color.blue(0), (Process.myPid() >> 22) + 6030, 23 - MotionEvent.axisFromString(""), 1686746678, false, "AudioAttributesCompatParcelizer", new Class[]{Context.class, String.class, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, Integer.TYPE});
                    }
                    ((Method) objRemoteActionCompatParcelizer2).invoke(objInvoke, objArr11);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
        }
        try {
            try {
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-18205161);
                if (objRemoteActionCompatParcelizer3 == null) {
                    char pressedStateDuration = (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 61148);
                    int iIndexOf = 2145 - TextUtils.indexOf("", "", 0, 0);
                    int iMyTid = 12 - (Process.myTid() >> 22);
                    short s = $$a[17];
                    byte b = (byte) s;
                    Object[] objArr12 = new Object[1];
                    c(s, b, b, objArr12);
                    objRemoteActionCompatParcelizer3 = startForeground.read(pressedStateDuration, iIndexOf, iMyTid, -2136739198, false, (String) objArr12[0], null);
                }
                long j = ((Field) objRemoteActionCompatParcelizer3).getLong(null);
                Object[] objArr13 = new Object[1];
                b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 58, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() - 91), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) - 233496392, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 789680236, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(8) - 11), objArr13);
                Class<?> cls2 = Class.forName((String) objArr13[0]);
                Object[] objArr14 = new Object[1];
                b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).length() - 27, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 44), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 233496399, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 789680258, (byte) (KeyEvent.getDeadChar(0, 0) - 94), objArr14);
                long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr14[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(301834150);
                if (objRemoteActionCompatParcelizer4 == null) {
                    char cNormalizeMetaState = (char) (61148 - KeyEvent.normalizeMetaState(0));
                    int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 2145;
                    int keyRepeatDelay = 12 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                    byte[] bArr = $$a;
                    Object[] objArr15 = new Object[1];
                    c(bArr[5], (byte) ($$b & 60), bArr[0], objArr15);
                    objRemoteActionCompatParcelizer4 = startForeground.read(cNormalizeMetaState, fadingEdgeLength, keyRepeatDelay, 1874090803, false, (String) objArr15[0], null);
                }
                if (j == ((jLongValue - ((((Field) objRemoteActionCompatParcelizer4).getLong(null) << 52) >>> 52)) >> 12)) {
                    int i2 = AudioAttributesImplApi26Parcelizer + 1;
                    MediaBrowserCompatItemReceiver = i2 % 128;
                    int i3 = i2 % 2;
                    Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-629126231);
                    if (objRemoteActionCompatParcelizer5 == null) {
                        char size = (char) (61148 - View.MeasureSpec.getSize(0));
                        int pressedStateDuration2 = 2145 - (ViewConfiguration.getPressedStateDuration() >> 16);
                        int iLastIndexOf = 11 - TextUtils.lastIndexOf("", '0', 0);
                        Object[] objArr16 = new Object[1];
                        c(r1[38], r1[55], (byte) (-$$a[140]), objArr16);
                        objRemoteActionCompatParcelizer5 = startForeground.read(size, pressedStateDuration2, iLastIndexOf, -1530294468, false, (String) objArr16[0], null);
                    }
                    list = (List) ((Field) objRemoteActionCompatParcelizer5).get(null);
                } else {
                    Object[] objArr17 = new Object[1];
                    a(Color.green(0) + 12583, new char[]{7743, 12051, 31853, 36161, 56039, 60410, 14558, 17962, 38666, 42020, 62848, 641, 21490, 24794, 44562, 65393}, objArr17);
                    Class<?> cls3 = Class.forName((String) objArr17[0]);
                    Object[] objArr18 = new Object[1];
                    b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).codePointAt(1) - 72, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).codePointAt(2) - 144), (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) - 233496386, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() + 789680304, (byte) ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length(), objArr18);
                    int iIntValue2 = ((Integer) cls3.getMethod((String) objArr18[0], Object.class).invoke(null, this)).intValue();
                    try {
                        Object[] objArr19 = {1151321646};
                        Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(-173351824);
                        if (objRemoteActionCompatParcelizer6 == null) {
                            objRemoteActionCompatParcelizer6 = startForeground.read((char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 45845), (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 912, 9 - TextUtils.indexOf((CharSequence) "", '0'), -1948051227, false, null, new Class[]{Integer.TYPE});
                        }
                        try {
                            Object[] objArr20 = {Integer.valueOf(iIntValue2), ((Constructor) objRemoteActionCompatParcelizer6).newInstance(objArr19)};
                            Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(1891595430);
                            if (objRemoteActionCompatParcelizer7 == null) {
                                char cRgb = (char) ((-16716068) - Color.rgb(0, 0, 0));
                                int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 2145;
                                int fadingEdgeLength2 = (ViewConfiguration.getFadingEdgeLength() >> 16) + 12;
                                Object[] objArr21 = new Object[1];
                                c((short) (-$$a[1]), r1[61], r1[139], objArr21);
                                objRemoteActionCompatParcelizer7 = startForeground.read(cRgb, iNormalizeMetaState, fadingEdgeLength2, 251047987, false, (String) objArr21[0], new Class[]{Integer.TYPE, (Class) startForeground.IconCompatParcelizer((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), TextUtils.getTrimmedLength("") + 557, 18 - View.MeasureSpec.makeMeasureSpec(0, 0))});
                            }
                            list = (List) ((Method) objRemoteActionCompatParcelizer7).invoke(null, objArr20);
                            Object objRemoteActionCompatParcelizer8 = startForeground.RemoteActionCompatParcelizer(-629126231);
                            if (objRemoteActionCompatParcelizer8 == null) {
                                char cKeyCodeFromString = (char) (KeyEvent.keyCodeFromString("") + 61148);
                                int i4 = 2146 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                                int iNormalizeMetaState2 = KeyEvent.normalizeMetaState(0) + 12;
                                Object[] objArr22 = new Object[1];
                                c(r2[38], r2[55], (byte) (-$$a[140]), objArr22);
                                objRemoteActionCompatParcelizer8 = startForeground.read(cKeyCodeFromString, i4, iNormalizeMetaState2, -1530294468, false, (String) objArr22[0], null);
                            }
                            ((Field) objRemoteActionCompatParcelizer8).set(null, list);
                            Object[] objArr23 = new Object[1];
                            b((-23) - (ViewConfiguration.getPressedStateDuration() >> 16), (short) (TextUtils.indexOf("", "", 0, 0) - 87), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).codePointAt(2) - 233496429, Color.red(0) + 789680271, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).codePointAt(1) + 51), objArr23);
                            Class<?> cls4 = Class.forName((String) objArr23[0]);
                            Object[] objArr24 = new Object[1];
                            b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(1) - 134, (short) ((-8) - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 233496424, Process.getGidForName("") + 789680294, (byte) ((-94) - View.MeasureSpec.getSize(0)), objArr24);
                            long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr24[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf = Long.valueOf(jLongValue2);
                            Object objRemoteActionCompatParcelizer9 = startForeground.RemoteActionCompatParcelizer(301834150);
                            if (objRemoteActionCompatParcelizer9 == null) {
                                char cIndexOf = (char) (TextUtils.indexOf("", "", 0) + 61148);
                                int i5 = 2146 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                                int iResolveOpacity = 12 - Drawable.resolveOpacity(0, 0);
                                byte[] bArr2 = $$a;
                                Object[] objArr25 = new Object[1];
                                c(bArr2[5], (byte) ($$b & 60), bArr2[0], objArr25);
                                objRemoteActionCompatParcelizer9 = startForeground.read(cIndexOf, i5, iResolveOpacity, 1874090803, false, (String) objArr25[0], null);
                            }
                            ((Field) objRemoteActionCompatParcelizer9).set(null, lValueOf);
                            Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                            Object objRemoteActionCompatParcelizer10 = startForeground.RemoteActionCompatParcelizer(-18205161);
                            if (objRemoteActionCompatParcelizer10 == null) {
                                char c2 = (char) ((AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 61148);
                                int i6 = 2146 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
                                int iIndexOf2 = 11 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                                short s2 = $$a[17];
                                byte b2 = (byte) s2;
                                Object[] objArr26 = new Object[1];
                                c(s2, b2, b2, objArr26);
                                objRemoteActionCompatParcelizer10 = startForeground.read(c2, i6, iIndexOf2, -2136739198, false, (String) objArr26[0], null);
                            }
                            ((Field) objRemoteActionCompatParcelizer10).set(null, lValueOf2);
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    } catch (Throwable th3) {
                        Throwable cause3 = th3.getCause();
                        if (cause3 == null) {
                            throw th3;
                        }
                        throw cause3;
                    }
                }
                for (Object[] objArr27 : list) {
                    int i7 = ((int[]) objArr27[3])[0];
                    int i8 = ((int[]) objArr27[1])[0];
                    if (i8 != i7) {
                        ArrayList arrayList = new ArrayList();
                        String[] strArr = (String[]) objArr27[2];
                        if (strArr != null) {
                            for (String str6 : strArr) {
                                int i9 = AudioAttributesImplApi26Parcelizer + 61;
                                MediaBrowserCompatItemReceiver = i9 % 128;
                                int i10 = i9 % 2;
                                arrayList.add(str6);
                            }
                        }
                        long j2 = -1;
                        long j3 = ((long) (i8 ^ i7)) & ((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32)));
                        long j4 = 0;
                        long j5 = j3 | (((long) 10) << 32) | (j4 - ((j4 >> 63) << 32));
                        try {
                            Object objRemoteActionCompatParcelizer11 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                            if (objRemoteActionCompatParcelizer11 == null) {
                                objRemoteActionCompatParcelizer11 = startForeground.read((char) (TextUtils.indexOf("", "") + 4535), 6054 - View.MeasureSpec.getSize(0), (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 41, -764908173, false, "IconCompatParcelizer", new Class[0]);
                            }
                            Object objInvoke2 = ((Method) objRemoteActionCompatParcelizer11).invoke(null, null);
                            try {
                                Object[] objArr28 = {1151321646, Long.valueOf(j5), arrayList, TrainingApplication.RemoteActionCompatParcelizer(), false};
                                Class cls5 = (Class) startForeground.IconCompatParcelizer((char) ((ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) - 1), 6030 - (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (ViewConfiguration.getTouchSlop() >> 8) + 24);
                                byte b3 = $$j[46];
                                byte b4 = b3;
                                Object[] objArr29 = new Object[1];
                                d(b3, b4, b4, objArr29);
                                cls5.getMethod((String) objArr29[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke2, objArr28);
                            } catch (Throwable th4) {
                                Throwable cause4 = th4.getCause();
                                if (cause4 == null) {
                                    throw th4;
                                }
                                throw cause4;
                            }
                        } catch (Throwable th5) {
                            Throwable cause5 = th5.getCause();
                            if (cause5 == null) {
                                throw th5;
                            }
                            throw cause5;
                        }
                    }
                }
            } catch (Throwable th6) {
                Throwable cause6 = th6.getCause();
                if (cause6 == null) {
                    throw th6;
                }
                throw cause6;
            }
        } catch (Throwable th7) {
            Object[] objArr30 = new Object[1];
            b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).length() - 27, (short) ((-74) - TextUtils.lastIndexOf("", '0', 0)), (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) - 233496439, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).codePointAt(2) + 789680288, (byte) ((-89) - Process.getGidForName("")), objArr30);
            String str7 = (String) objArr30[0];
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                PrintStream printStream = new PrintStream(byteArrayOutputStream);
                th7.printStackTrace(printStream);
                printStream.close();
                strValueOf = byteArrayOutputStream.toString(CharsetNames.UTF_8);
            } catch (Throwable unused) {
                strValueOf = String.valueOf(th7);
            }
            ArrayList arrayList2 = new ArrayList(2);
            arrayList2.add(strValueOf);
            arrayList2.add(str7);
            Object objRemoteActionCompatParcelizer12 = startForeground.RemoteActionCompatParcelizer(-1407079962);
            if (objRemoteActionCompatParcelizer12 == null) {
                objRemoteActionCompatParcelizer12 = startForeground.read((char) (4535 - Gravity.getAbsoluteGravity(0, 0)), 6054 - (ViewConfiguration.getKeyRepeatDelay() >> 16), Process.getGidForName("") + 43, -764908173, false, "IconCompatParcelizer", new Class[0]);
            }
            Object objInvoke3 = ((Method) objRemoteActionCompatParcelizer12).invoke(null, null);
            String strRemoteActionCompatParcelizer = TrainingApplication.RemoteActionCompatParcelizer();
            int i11 = AudioAttributesImplApi26Parcelizer + 61;
            MediaBrowserCompatItemReceiver = i11 % 128;
            int i12 = i11 % 2;
            Object[] objArr31 = {1151321646, 81604378625L, arrayList2, strRemoteActionCompatParcelizer, false};
            Class cls6 = (Class) startForeground.IconCompatParcelizer((char) (ViewConfiguration.getEdgeSlop() >> 16), 6030 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), View.MeasureSpec.makeMeasureSpec(0, 0) + 24);
            byte b5 = $$j[46];
            byte b6 = b5;
            Object[] objArr32 = new Object[1];
            d(b5, b6, b6, objArr32);
            cls6.getMethod((String) objArr32[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke3, objArr31);
        }
        Context applicationContext2 = context;
        if (applicationContext2 != null) {
            try {
                applicationContext2 = ((applicationContext2 instanceof ContextWrapper) && ((ContextWrapper) applicationContext2).getBaseContext() == null) ? null : context.getApplicationContext();
            } catch (Throwable th8) {
                Object[] objArr33 = new Object[1];
                a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).codePointAt(1) + 53370, new char[]{7789, 52943, 48949, 27748, 23757, 3377, 64096, 43712, 39739, 18532, 14543}, objArr33);
                String str8 = (String) objArr33[0];
                try {
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    PrintStream printStream2 = new PrintStream(byteArrayOutputStream2);
                    th8.printStackTrace(printStream2);
                    printStream2.close();
                    strValueOf2 = byteArrayOutputStream2.toString(CharsetNames.UTF_8);
                } catch (Throwable unused2) {
                    strValueOf2 = String.valueOf(th8);
                }
                ArrayList arrayList3 = new ArrayList(2);
                arrayList3.add(strValueOf2);
                arrayList3.add(str8);
                Object objRemoteActionCompatParcelizer13 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer13 == null) {
                    objRemoteActionCompatParcelizer13 = startForeground.read((char) (KeyEvent.keyCodeFromString("") + 4535), 6054 - (Process.myTid() >> 22), TextUtils.lastIndexOf("", '0', 0) + 43, -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke4 = ((Method) objRemoteActionCompatParcelizer13).invoke(null, null);
                Object[] objArr34 = {1151321646, 81604378625L, arrayList3, TrainingApplication.RemoteActionCompatParcelizer(), false};
                Class cls7 = (Class) startForeground.IconCompatParcelizer((char) View.combineMeasuredStates(0, 0), 6030 - TextUtils.getOffsetAfter("", 0), TextUtils.getTrimmedLength("") + 24);
                byte b7 = $$j[46];
                byte b8 = b7;
                Object[] objArr35 = new Object[1];
                d(b7, b8, b8, objArr35);
                cls7.getMethod((String) objArr35[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke4, objArr34);
            }
        }
        try {
            Object[] objArr36 = {1151321646};
            Object objRemoteActionCompatParcelizer14 = startForeground.RemoteActionCompatParcelizer(-1128409246);
            if (objRemoteActionCompatParcelizer14 == null) {
                objRemoteActionCompatParcelizer14 = startForeground.read((char) (Process.myPid() >> 22), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1990, (ViewConfiguration.getLongPressTimeout() >> 16) + 12, -1024191497, false, null, new Class[]{Integer.TYPE});
            }
            try {
                Object[] objArr37 = {applicationContext2, ((Constructor) objRemoteActionCompatParcelizer14).newInstance(objArr36)};
                Object objRemoteActionCompatParcelizer15 = startForeground.RemoteActionCompatParcelizer(352975618);
                if (objRemoteActionCompatParcelizer15 == null) {
                    char threadPriority = (char) (((Process.getThreadPriority(0) + 20) >> 6) + 19323);
                    int iLastIndexOf2 = 2758 - TextUtils.lastIndexOf("", '0');
                    int maxKeyCode = 99 - (KeyEvent.getMaxKeyCode() >> 16);
                    byte[] bArr3 = $$a;
                    Object[] objArr38 = new Object[1];
                    c(bArr3[5], (byte) ($$b & 60), bArr3[0], objArr38);
                    objRemoteActionCompatParcelizer15 = startForeground.read(threadPriority, iLastIndexOf2, maxKeyCode, 1799372695, false, (String) objArr38[0], new Class[]{Context.class, (Class) startForeground.IconCompatParcelizer((char) ((TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 9580), (ViewConfiguration.getJumpTapTimeout() >> 16) + 3446, 143 - ((byte) KeyEvent.getModifierMetaStateMask()))});
                }
                ((Method) objRemoteActionCompatParcelizer15).invoke(null, objArr37);
                Object objRemoteActionCompatParcelizer16 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                if (objRemoteActionCompatParcelizer16 == null) {
                    char cResolveOpacity = (char) (Drawable.resolveOpacity(0, 0) + 13183);
                    int iMyPid = 1649 - (Process.myPid() >> 22);
                    int maxKeyCode2 = (KeyEvent.getMaxKeyCode() >> 16) + 26;
                    byte[] bArr4 = $$a;
                    Object[] objArr39 = new Object[1];
                    c((short) 78, (byte) (bArr4[139] - 1), (byte) (-bArr4[140]), objArr39);
                    objRemoteActionCompatParcelizer16 = startForeground.read(cResolveOpacity, iMyPid, maxKeyCode2, -133433128, false, (String) objArr39[0], null);
                }
                if (((Field) objRemoteActionCompatParcelizer16).getLong(null) != -1) {
                    int i13 = AudioAttributesImplApi26Parcelizer + 63;
                    MediaBrowserCompatItemReceiver = i13 % 128;
                    int i14 = i13 % 2;
                    Object objRemoteActionCompatParcelizer17 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                    if (objRemoteActionCompatParcelizer17 == null) {
                        char maximumFlingVelocity = (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 13183);
                        int keyRepeatDelay2 = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 1649;
                        int i15 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 25;
                        Object[] objArr40 = new Object[1];
                        c((short) 121, r2[38], (byte) (-$$a[39]), objArr40);
                        objRemoteActionCompatParcelizer17 = startForeground.read(maximumFlingVelocity, keyRepeatDelay2, i15, -1033747278, false, (String) objArr40[0], null);
                    }
                    objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer17).get(null);
                } else {
                    Object[] objArr41 = new Object[1];
                    a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(2) + 12474, new char[]{7743, 12051, 31853, 36161, 56039, 60410, 14558, 17962, 38666, 42020, 62848, 641, 21490, 24794, 44562, 65393}, objArr41);
                    Class<?> cls8 = Class.forName((String) objArr41[0]);
                    Object[] objArr42 = new Object[1];
                    b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(2) - 59, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(1) - 157), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 233496395, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 789680304, (byte) ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length(), objArr42);
                    try {
                        Object[] objArr43 = {Integer.valueOf(((Integer) cls8.getMethod((String) objArr42[0], Object.class).invoke(null, this)).intValue()), 0, -695975689};
                        byte[] bArr5 = $$j;
                        byte b9 = (byte) (bArr5[46] - 1);
                        byte b10 = b9;
                        Object[] objArr44 = new Object[1];
                        d(b9, b10, b10, objArr44);
                        Class<?> cls9 = Class.forName((String) objArr44[0]);
                        byte b11 = bArr5[46];
                        byte b12 = b11;
                        Object[] objArr45 = new Object[1];
                        d(b11, b12, b12, objArr45);
                        objArr = (Object[]) cls9.getMethod((String) objArr45[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr43);
                        Object objRemoteActionCompatParcelizer18 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                        if (objRemoteActionCompatParcelizer18 == null) {
                            char c3 = (char) (13183 - (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)));
                            int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 1650;
                            int maximumDrawingCacheSize = 26 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                            Object[] objArr46 = new Object[1];
                            c((short) 121, r4[38], (byte) (-$$a[39]), objArr46);
                            objRemoteActionCompatParcelizer18 = startForeground.read(c3, bitsPerPixel, maximumDrawingCacheSize, -1033747278, false, (String) objArr46[0], null);
                        }
                        ((Field) objRemoteActionCompatParcelizer18).set(null, objArr);
                        try {
                            Object[] objArr47 = new Object[1];
                            b((-23) - (ViewConfiguration.getEdgeSlop() >> 16), (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 97), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(3) - 233496439, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 789680270, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).codePointAt(1) + 51), objArr47);
                            Class<?> cls10 = Class.forName((String) objArr47[0]);
                            Object[] objArr48 = new Object[1];
                            b((-23) - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() - 13), (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) - 233496390, 789680182 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(1), (byte) ((-94) - (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), objArr48);
                            long jLongValue3 = ((Long) cls10.getDeclaredMethod((String) objArr48[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf3 = Long.valueOf(jLongValue3);
                            Object objRemoteActionCompatParcelizer19 = startForeground.RemoteActionCompatParcelizer(2104791916);
                            if (objRemoteActionCompatParcelizer19 == null) {
                                char cCombineMeasuredStates = (char) (View.combineMeasuredStates(0, 0) + 13183);
                                int i16 = 1648 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                                int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 26;
                                Object[] objArr49 = new Object[1];
                                c((short) ($$b & 958), r12[38], (byte) (-$$a[39]), objArr49);
                                objRemoteActionCompatParcelizer19 = startForeground.read(cCombineMeasuredStates, i16, packedPositionType, 54351865, false, (String) objArr49[0], null);
                            }
                            ((Field) objRemoteActionCompatParcelizer19).set(null, lValueOf3);
                            Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                            Object objRemoteActionCompatParcelizer20 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                            if (objRemoteActionCompatParcelizer20 == null) {
                                char offsetBefore = (char) (TextUtils.getOffsetBefore("", 0) + 13183);
                                int iResolveSize = View.resolveSize(0, 0) + 1649;
                                int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 26;
                                byte[] bArr6 = $$a;
                                Object[] objArr50 = new Object[1];
                                c((short) 78, (byte) (bArr6[139] - 1), (byte) (-bArr6[140]), objArr50);
                                objRemoteActionCompatParcelizer20 = startForeground.read(offsetBefore, iResolveSize, iKeyCodeFromString, -133433128, false, (String) objArr50[0], null);
                            }
                            ((Field) objRemoteActionCompatParcelizer20).set(null, lValueOf4);
                        } catch (Exception unused3) {
                            throw new RuntimeException();
                        }
                    } catch (Throwable th9) {
                        Throwable cause7 = th9.getCause();
                        if (cause7 == null) {
                            throw th9;
                        }
                        throw cause7;
                    }
                }
                int i17 = ((int[]) objArr[3])[0];
                int i18 = ((int[]) objArr[2])[0];
                if (i18 != i17) {
                    long j6 = -1;
                    long j7 = ((long) (i18 ^ i17)) & ((((long) 0) << 32) | (j6 - ((j6 >> 63) << 32)));
                    long j8 = 0;
                    long j9 = j7 | (((long) 2) << 32) | (j8 - ((j8 >> 63) << 32));
                    Object objRemoteActionCompatParcelizer21 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer21 == null) {
                        objRemoteActionCompatParcelizer21 = startForeground.read((char) (4536 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), ((Process.getThreadPriority(0) + 20) >> 6) + 6054, View.getDefaultSize(0, 0) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke5 = ((Method) objRemoteActionCompatParcelizer21).invoke(null, null);
                    Object[] objArr51 = {1151321646, Long.valueOf(j9), new ArrayList(), TrainingApplication.RemoteActionCompatParcelizer(), true};
                    Class cls11 = (Class) startForeground.IconCompatParcelizer((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), KeyEvent.keyCodeFromString("") + 6030, Color.rgb(0, 0, 0) + 16777240);
                    byte b13 = $$j[46];
                    byte b14 = b13;
                    Object[] objArr52 = new Object[1];
                    d(b13, b14, b14, objArr52);
                    cls11.getMethod((String) objArr52[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke5, objArr51);
                }
                Object objRemoteActionCompatParcelizer22 = startForeground.RemoteActionCompatParcelizer(-2008995297);
                if (objRemoteActionCompatParcelizer22 == null) {
                    char cResolveSize = (char) View.resolveSize(0, 0);
                    int i19 = (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 943;
                    int i20 = (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 35;
                    short s3 = $$a[17];
                    byte b15 = (byte) s3;
                    Object[] objArr53 = new Object[1];
                    c(s3, b15, b15, objArr53);
                    objRemoteActionCompatParcelizer22 = startForeground.read(cResolveSize, i19, i20, -167186806, false, (String) objArr53[0], null);
                }
                if (((Field) objRemoteActionCompatParcelizer22).getLong(null) != -1) {
                    Object objRemoteActionCompatParcelizer23 = startForeground.RemoteActionCompatParcelizer(-757676623);
                    if (objRemoteActionCompatParcelizer23 == null) {
                        char gidForName = (char) ((-1) - Process.getGidForName(""));
                        int i21 = (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 943;
                        int iIndexOf3 = 35 - TextUtils.indexOf((CharSequence) "", '0');
                        Object[] objArr54 = new Object[1];
                        c(r1[38], r1[55], (byte) (-$$a[140]), objArr54);
                        objRemoteActionCompatParcelizer23 = startForeground.read(gidForName, i21, iIndexOf3, -1398865628, false, (String) objArr54[0], null);
                    }
                    objArr2 = (Object[]) ((Field) objRemoteActionCompatParcelizer23).get(null);
                    c = 2;
                } else {
                    Object[] objArr55 = new Object[1];
                    a(12583 - (ViewConfiguration.getFadingEdgeLength() >> 16), new char[]{7743, 12051, 31853, 36161, 56039, 60410, 14558, 17962, 38666, 42020, 62848, 641, 21490, 24794, 44562, 65393}, objArr55);
                    Class<?> cls12 = Class.forName((String) objArr55[0]);
                    Object[] objArr56 = new Object[1];
                    b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 58, (short) (TextUtils.indexOf((CharSequence) "", '0') - 107), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(6) - 233496499, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(1) + 789680197, (byte) (Color.alpha(0) + 10), objArr56);
                    Object[] objArr57 = {Integer.valueOf(((Integer) cls12.getMethod((String) objArr56[0], Object.class).invoke(null, this)).intValue()), 0, -1312242768};
                    Object objRemoteActionCompatParcelizer24 = startForeground.RemoteActionCompatParcelizer(-21191141);
                    if (objRemoteActionCompatParcelizer24 == null) {
                        char c4 = (char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                        int i22 = (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 942;
                        int absoluteGravity = 36 - Gravity.getAbsoluteGravity(0, 0);
                        Object[] objArr58 = new Object[1];
                        c((short) 187, r9[111], (byte) (-$$a[39]), objArr58);
                        objRemoteActionCompatParcelizer24 = startForeground.read(c4, i22, absoluteGravity, -2131402098, false, (String) objArr58[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    objArr2 = (Object[]) ((Method) objRemoteActionCompatParcelizer24).invoke(null, objArr57);
                    Object objRemoteActionCompatParcelizer25 = startForeground.RemoteActionCompatParcelizer(-757676623);
                    if (objRemoteActionCompatParcelizer25 == null) {
                        char cMyPid = (char) (Process.myPid() >> 22);
                        int minimumFlingVelocity = 943 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                        int touchSlop = 36 - (ViewConfiguration.getTouchSlop() >> 8);
                        Object[] objArr59 = new Object[1];
                        c(r2[38], r2[55], (byte) (-$$a[140]), objArr59);
                        objRemoteActionCompatParcelizer25 = startForeground.read(cMyPid, minimumFlingVelocity, touchSlop, -1398865628, false, (String) objArr59[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer25).set(null, objArr2);
                    try {
                        Object[] objArr60 = new Object[1];
                        b(TextUtils.lastIndexOf("", '0', 0, 0) - 22, (short) ((-87) - (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), ((byte) KeyEvent.getModifierMetaStateMask()) - 233496392, View.MeasureSpec.makeMeasureSpec(0, 0) + 789680271, (byte) ((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 99), objArr60);
                        Class<?> cls13 = Class.forName((String) objArr60[0]);
                        Object[] objArr61 = new Object[1];
                        b(KeyEvent.keyCodeFromString("") - 23, (short) ((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) - 10), (-233496388) - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 789680283, (byte) ((-94) - TextUtils.getTrimmedLength("")), objArr61);
                        long jLongValue4 = ((Long) cls13.getDeclaredMethod((String) objArr61[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf5 = Long.valueOf(jLongValue4);
                        Object objRemoteActionCompatParcelizer26 = startForeground.RemoteActionCompatParcelizer(-1539638354);
                        if (objRemoteActionCompatParcelizer26 == null) {
                            int iNormalizeMetaState3 = 943 - KeyEvent.normalizeMetaState(0);
                            int iNormalizeMetaState4 = 36 - KeyEvent.normalizeMetaState(0);
                            byte[] bArr7 = $$a;
                            Object[] objArr62 = new Object[1];
                            c(bArr7[5], (byte) ($$b & 60), bArr7[0], objArr62);
                            objRemoteActionCompatParcelizer26 = startForeground.read((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), iNormalizeMetaState3, iNormalizeMetaState4, -629981381, false, (String) objArr62[0], null);
                        }
                        ((Field) objRemoteActionCompatParcelizer26).set(null, lValueOf5);
                        Long lValueOf6 = Long.valueOf(jLongValue4 >> 12);
                        Object objRemoteActionCompatParcelizer27 = startForeground.RemoteActionCompatParcelizer(-2008995297);
                        if (objRemoteActionCompatParcelizer27 == null) {
                            char cIndexOf2 = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0));
                            int mirror = AndroidCharacter.getMirror('0') + 895;
                            int mirror2 = 'T' - AndroidCharacter.getMirror('0');
                            short s4 = $$a[17];
                            byte b16 = (byte) s4;
                            Object[] objArr63 = new Object[1];
                            c(s4, b16, b16, objArr63);
                            objRemoteActionCompatParcelizer27 = startForeground.read(cIndexOf2, mirror, mirror2, -167186806, false, (String) objArr63[0], null);
                        }
                        ((Field) objRemoteActionCompatParcelizer27).set(null, lValueOf6);
                        int i23 = AudioAttributesImplApi26Parcelizer + 29;
                        MediaBrowserCompatItemReceiver = i23 % 128;
                        c = 2;
                        int i24 = i23 % 2;
                    } catch (Exception unused4) {
                        throw new RuntimeException();
                    }
                }
                int i25 = ((int[]) objArr2[c])[0];
                int i26 = ((int[]) objArr2[0])[0];
                if (i26 != i25) {
                    long j10 = -1;
                    long j11 = 0;
                    long j12 = (((long) (i26 ^ i25)) & ((((long) 0) << 32) | (j10 - ((j10 >> 63) << 32)))) | (((long) 1) << 32) | (j11 - ((j11 >> 63) << 32));
                    Object objRemoteActionCompatParcelizer28 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer28 == null) {
                        objRemoteActionCompatParcelizer28 = startForeground.read((char) (4534 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 6054 - ExpandableListView.getPackedPositionGroup(0L), 41 - MotionEvent.axisFromString(""), -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke6 = ((Method) objRemoteActionCompatParcelizer28).invoke(null, null);
                    Object[] objArr64 = {1151321646, Long.valueOf(j12), new ArrayList(), TrainingApplication.RemoteActionCompatParcelizer(), true};
                    Class cls14 = (Class) startForeground.IconCompatParcelizer((char) View.MeasureSpec.makeMeasureSpec(0, 0), 6030 - (ViewConfiguration.getScrollBarSize() >> 8), MotionEvent.axisFromString("") + 25);
                    byte b17 = $$j[46];
                    byte b18 = b17;
                    Object[] objArr65 = new Object[1];
                    d(b17, b18, b18, objArr65);
                    cls14.getMethod((String) objArr65[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke6, objArr64);
                }
            } catch (Throwable th10) {
                Throwable cause8 = th10.getCause();
                if (cause8 == null) {
                    throw th10;
                }
                throw cause8;
            }
        } catch (Throwable th11) {
            Throwable cause9 = th11.getCause();
            if (cause9 == null) {
                throw th11;
            }
            throw cause9;
        }
    }

    protected Intent getStartCommandIntent(Intent intent) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 61;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        if (i2 % 2 == 0) {
            return intent;
        }
        throw null;
    }

    public boolean handleIntentOnMainThread(Intent intent) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer;
        int i3 = i2 + 113;
        MediaBrowserCompatItemReceiver = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 95;
        MediaBrowserCompatItemReceiver = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    @Override // android.app.Service
    public void onCreate() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer + 5;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
        super.onCreate();
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
