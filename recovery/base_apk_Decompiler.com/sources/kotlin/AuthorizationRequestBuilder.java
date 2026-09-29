package kotlin;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import in.juspay.hyper.constants.LogCategory;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.WorkAccountClient;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\tH\u0014¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lo/AuthorizationRequestBuilder;", "Lo/addObserverForBackInvoker;", "<init>", "()V", "Landroid/os/Bundle;", "p0", "", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/content/Intent;", "onNewIntent", "(Landroid/content/Intent;)V", "Lo/buildUtcTimingElement;", "read", "Lo/buildUtcTimingElement;", "RemoteActionCompatParcelizer", "Lo/filterByHostedDomain;", "write", "Lo/filterByHostedDomain;", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AuthorizationRequestBuilder extends requestOfflineAccess {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static char[] AudioAttributesImplApi21Parcelizer;
    private static byte[] AudioAttributesImplApi26Parcelizer;
    private static int AudioAttributesImplBaseParcelizer;
    private static int IconCompatParcelizer;
    private static short[] MediaBrowserCompatCustomActionResultReceiver;
    private static int MediaBrowserCompatMediaItem;
    private static int RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private buildUtcTimingElement RemoteActionCompatParcelizer;
    private filterByHostedDomain write;
    private static final byte[] $$c = {61, 46, 102, -127};
    private static final int $$f = 67;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$g = {TarConstants.LF_GNUTYPE_LONGLINK, -63, -64, 24, -61, 61, 2, 19, -47, 39, 10, 15, 2, 5, -11, 3, -11, 31, 7, 5, 2, -9, 0, 16, -35, 45, 7, -1, -8, 23, 23, 12, 6, 9, -11, -32, 38, 21, -7, 10, 3, -39, TarConstants.LF_NORMAL, 2, 7, -11, 23, -32, 21, 21, -11, 6, 11, 1, 21, -17, 17, -61, 61, 2, 19, -34, 27, 19, 7, -4, 7, -3, -19, 41, -5, -7, -27, TarConstants.LF_NORMAL, 1, 2, -38, TarConstants.LF_NORMAL, 3, 4, -5, 2, 21, -7, 17, -9, 15, 9, -40, 24, 17, -9, 10, 2, 17, -1, -5, 15, -11};
    private static final int $$h = 34;
    private static final byte[] $$a = {32, -59, 22, 74, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -48, TarConstants.LF_CHR, -1, 2, -4, -1, -43, 35, 18, -10, 7, 0, -27, 20, 15, 3, -8, 9, -33, 20, -1, 3, 5, 14, -16, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 0, 32, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 5, 27, 18, 18, -14, 3, 8, -2, 18, -20, 14, -12, -3, 4, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -42, 44, -14, 9, -26, 20, -1, 3, 5, 14, -16, 14, 27, 13, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, 20, 9, 3, 6, -14, -35, 35, 18, -10, 7, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -47, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14};
    private static final int $$b = 91;
    private static int RatingCompat = 0;
    private static int MediaDescriptionCompat = 1;
    private static int MediaBrowserCompatItemReceiver = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$i(int r6, int r7, short r8) {
        /*
            int r6 = r6 * 4
            int r6 = r6 + 112
            int r8 = r8 * 3
            int r0 = r8 + 1
            int r7 = r7 * 4
            int r7 = 4 - r7
            byte[] r1 = kotlin.AuthorizationRequestBuilder.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L17
            r3 = r7
            r6 = r8
            r4 = r2
            goto L2a
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L25:
            r3 = r1[r7]
            r5 = r3
            r3 = r7
            r7 = r5
        L2a:
            int r7 = -r7
            int r6 = r6 + r7
            int r7 = r3 + 1
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.AuthorizationRequestBuilder.$$i(int, int, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(int r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 + 4
            int r0 = r7 + 4
            int r6 = r6 + 65
            byte[] r1 = kotlin.AuthorizationRequestBuilder.$$a
            byte[] r0 = new byte[r0]
            int r7 = r7 + 3
            r2 = -1
            if (r1 != 0) goto L12
            r3 = r8
            r4 = r2
            goto L2b
        L12:
            r3 = r2
        L13:
            int r3 = r3 + 1
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L23
            java.lang.String r6 = new java.lang.String
            r7 = 0
            r6.<init>(r0, r7)
            r9[r7] = r6
            return
        L23:
            int r8 = r8 + 1
            r4 = r1[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2b:
            int r6 = r6 + r8
            int r6 = r6 + r2
            r8 = r3
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.AuthorizationRequestBuilder.c(int, byte, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void d(short r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r0 = 39 - r8
            int r6 = 94 - r6
            byte[] r1 = kotlin.AuthorizationRequestBuilder.$$g
            int r7 = r7 + 82
            byte[] r0 = new byte[r0]
            int r8 = 38 - r8
            r2 = 0
            if (r1 != 0) goto L13
            r4 = r7
            r3 = r2
            r7 = r6
            goto L2a
        L13:
            r3 = r2
        L14:
            int r6 = r6 + 1
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L23:
            int r3 = r3 + 1
            r4 = r1[r6]
            r5 = r7
            r7 = r6
            r6 = r5
        L2a:
            int r6 = r6 + r4
            int r6 = r6 + (-4)
            r5 = r7
            r7 = r6
            r6 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.AuthorizationRequestBuilder.d(short, byte, short, java.lang.Object[]):void");
    }

    /* JADX INFO: renamed from: o.AuthorizationRequestBuilder$AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/marrow2/ui/custom_module/introduction/activity/CustomModuleIntroductionActivity$Companion;", "", "<init>", "()V", "DEEP_LINK_INVITE_CODE", "", "getLaunchIntent", "Landroid/content/Intent;", LogCategory.CONTEXT, "Landroid/content/Context;", "args", "Lcom/marrow2/ui/custom_module/creation/model/CustomModuleCreationArgs;", "deepLinkInviteCode", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getMagicModuleMeta
        public static Intent AudioAttributesCompatParcelizer(Context context, WorkAccountClient workAccountClient, String str) {
            toMagicModuleMetaRepoModel.write(context, "");
            toMagicModuleMetaRepoModel.write(workAccountClient, "");
            Intent intent = new Intent(context, (Class<?>) AuthorizationRequestBuilder.class);
            workAccountClient.AudioAttributesCompatParcelizer(intent);
            intent.putExtra("deepLinkInviteCode", str);
            return intent;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    private static void b(boolean z, byte[] bArr, int[] iArr, Object[] objArr) throws Throwable {
        int i = 2;
        int i2 = 2 % 2;
        buildSetStopReasonIntent buildsetstopreasonintent = new buildSetStopReasonIntent();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr = AudioAttributesImplApi21Parcelizer;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i7 = 0;
            while (i7 < length) {
                int i8 = $11 + 61;
                $10 = i8 % 128;
                int i9 = i8 % i;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i7])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-338863922);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) Color.alpha(0), View.resolveSizeAndState(0, 0, 0) + 11613, (ViewConfiguration.getPressedStateDuration() >> 16) + 20, -1786471333, false, "u", new Class[]{Integer.TYPE});
                    }
                    cArr2[i7] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                    i7++;
                    i = 2;
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
        char[] cArr3 = new char[i4];
        System.arraycopy(cArr, i3, cArr3, 0, i4);
        if (bArr != null) {
            char[] cArr4 = new char[i4];
            buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            char c = 0;
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i4) {
                if (bArr[buildsetstopreasonintent.RemoteActionCompatParcelizer] == 1) {
                    int i10 = buildsetstopreasonintent.RemoteActionCompatParcelizer;
                    Object[] objArr3 = {Integer.valueOf(cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer]), Integer.valueOf(c)};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1429458299);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) ((-1) - Process.getGidForName("")), AndroidCharacter.getMirror('0') + 22911, 43 - (Process.myPid() >> 22), -729418224, false, "x", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i10] = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).charValue();
                } else {
                    int i11 = buildsetstopreasonintent.RemoteActionCompatParcelizer;
                    Object[] objArr4 = {Integer.valueOf(cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer]), Integer.valueOf(c)};
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(1859710730);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) (31589 - KeyEvent.getDeadChar(0, 0)), ExpandableListView.getPackedPositionChild(0L) + 9864, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 65, 277949343, false, "v", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i11] = ((Character) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).charValue();
                }
                c = cArr4[buildsetstopreasonintent.RemoteActionCompatParcelizer];
                Object[] objArr5 = {buildsetstopreasonintent, buildsetstopreasonintent};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(1104966666);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) (ExpandableListView.getPackedPositionType(0L) + 37822), (ViewConfiguration.getScrollBarSize() >> 8) + 9754, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 26, 1066774687, false, "B", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i6 > 0) {
            char[] cArr5 = new char[i4];
            System.arraycopy(cArr3, 0, cArr5, 0, i4);
            int i12 = i4 - i6;
            System.arraycopy(cArr5, 0, cArr3, i12, i6);
            System.arraycopy(cArr5, i6, cArr3, 0, i12);
        }
        if (z) {
            int i13 = $11 + 5;
            $10 = i13 % 128;
            int i14 = i13 % 2;
            char[] cArr6 = new char[i4];
            buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            int i15 = $11 + 53;
            $10 = i15 % 128;
            int i16 = i15 % 2;
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i4) {
                cArr6[buildsetstopreasonintent.RemoteActionCompatParcelizer] = cArr3[(i4 - buildsetstopreasonintent.RemoteActionCompatParcelizer) - 1];
                buildsetstopreasonintent.RemoteActionCompatParcelizer++;
            }
            cArr3 = cArr6;
        }
        if (i5 > 0) {
            buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i4) {
                cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer] = (char) (cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer] - iArr[2]);
                buildsetstopreasonintent.RemoteActionCompatParcelizer++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0087 A[PHI: r4
      0x0087: PHI (r4v8 byte[] A[IMMUTABLE_TYPE]) = (r4v7 byte[]), (r4v19 byte[]) binds: [B:21:0x0085, B:18:0x0080] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0165  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(byte r23, int r24, int r25, short r26, int r27, java.lang.Object[] r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 710
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.AuthorizationRequestBuilder.a(byte, int, int, short, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00ed  */
    @Override // kotlin.requestOfflineAccess, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(android.os.Bundle r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2650
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.AuthorizationRequestBuilder.onCreate(android.os.Bundle):void");
    }

    @Override // kotlin.MediaBrowserCompatMediaItem, android.app.Activity
    public final void onNewIntent(Intent p0) {
        getShowPopup getshowpopup;
        int i = 2 % 2;
        toMagicModuleMetaRepoModel.write(p0, "");
        super.onNewIntent(p0);
        String stringExtra = p0.getStringExtra("deepLinkInviteCode");
        if (stringExtra != null) {
            filterByHostedDomain filterbyhosteddomain = this.write;
            if (filterbyhosteddomain != null) {
                int i2 = MediaDescriptionCompat + 71;
                RatingCompat = i2 % 128;
                int i3 = i2 % 2;
                filterbyhosteddomain.read(stringExtra);
                getshowpopup = getShowPopup.INSTANCE;
                int i4 = RatingCompat + 93;
                MediaDescriptionCompat = i4 % 128;
                int i5 = i4 % 2;
            } else {
                getshowpopup = null;
            }
            if (getshowpopup != null) {
                return;
            }
        }
        WorkAccountClient.IconCompatParcelizer iconCompatParcelizer = WorkAccountClient.write;
        WorkAccountClient workAccountClient = WorkAccountClient.IconCompatParcelizer.read(p0);
        filterByHostedDomain filterbyhosteddomain2 = this.write;
        if (filterbyhosteddomain2 != null) {
            int i6 = RatingCompat + 91;
            MediaDescriptionCompat = i6 % 128;
            int i7 = i6 % 2;
            filterbyhosteddomain2.read(workAccountClient);
            getShowPopup getshowpopup2 = getShowPopup.INSTANCE;
            if (i7 == 0) {
                throw null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006e  */
    @Override // kotlin.requestOfflineAccess, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onResume() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 279
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.AuthorizationRequestBuilder.onResume():void");
    }

    @Override // kotlin.requestOfflineAccess, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onPause() throws Throwable {
        Method method;
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        Object obj = null;
        if (baseContext == null) {
            int i2 = MediaDescriptionCompat + 31;
            RatingCompat = i2 % 128;
            if (i2 % 2 != 0) {
                Object[] objArr = new Object[1];
                b(true, new byte[]{0, 0, 0, 1, 1, 1, 0, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0}, new int[]{5, 26, 178, 4}, objArr);
                Class<?> cls = Class.forName((String) objArr[0]);
                Object[] objArr2 = new Object[1];
                b(true, new byte[]{1, 0, 1, 0, 1, 1, 0, 1, 1, 0, 0, 1, 0, 0, 1, 1, 0, 1}, new int[]{31, 18, 76, 0}, objArr2);
                method = cls.getMethod((String) objArr2[0], new Class[0]);
            } else {
                Object[] objArr3 = new Object[1];
                b(true, new byte[]{0, 0, 0, 1, 1, 1, 0, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0}, new int[]{5, 26, 178, 4}, objArr3);
                Class<?> cls2 = Class.forName((String) objArr3[0]);
                Object[] objArr4 = new Object[1];
                b(false, new byte[]{1, 0, 1, 0, 1, 1, 0, 1, 1, 0, 0, 1, 0, 0, 1, 1, 0, 1}, new int[]{31, 18, 76, 0}, objArr4);
                method = cls2.getMethod((String) objArr4[0], new Class[0]);
            }
            baseContext = (Context) method.invoke(null, null);
        }
        if (baseContext != null) {
            int i3 = MediaDescriptionCompat + 41;
            RatingCompat = i3 % 128;
            int i4 = i3 % 2;
            if ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) {
                baseContext = null;
            } else {
                baseContext = baseContext.getApplicationContext();
                int i5 = RatingCompat + 3;
                MediaDescriptionCompat = i5 % 128;
                int i6 = i5 % 2;
            }
        }
        if (baseContext != null) {
            int i7 = MediaDescriptionCompat + 77;
            RatingCompat = i7 % 128;
            try {
                if (i7 % 2 != 0) {
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 4534), 6054 - (ViewConfiguration.getLongPressTimeout() >> 16), (Process.myPid() >> 22) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                    Object[] objArr5 = {baseContext};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1293416902);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) Drawable.resolveOpacity(0, 0), 6030 - (ViewConfiguration.getTouchSlop() >> 8), ExpandableListView.getPackedPositionChild(0L) + 25, -861814097, false, "read", new Class[]{Context.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer2).invoke(objInvoke, objArr5);
                    int i8 = 67 / 0;
                } else {
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) (4535 - (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), 6054 - (KeyEvent.getMaxKeyCode() >> 16), TextUtils.getOffsetAfter("", 0) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke2 = ((Method) objRemoteActionCompatParcelizer3).invoke(null, null);
                    Object[] objArr6 = {baseContext};
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1293416902);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        objRemoteActionCompatParcelizer4 = startForeground.read((char) (TextUtils.lastIndexOf("", '0') + 1), 6030 - TextUtils.getOffsetBefore("", 0), 24 - (ViewConfiguration.getJumpTapTimeout() >> 16), -861814097, false, "read", new Class[]{Context.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer4).invoke(objInvoke2, objArr6);
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        super.onPause();
        int i9 = MediaDescriptionCompat + 23;
        RatingCompat = i9 % 128;
        if (i9 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:136:0x0b00 A[Catch: all -> 0x0bb9, TryCatch #13 {all -> 0x0bb9, blocks: (B:134:0x0aeb, B:136:0x0b00, B:137:0x0b31), top: B:282:0x0aeb, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0b44 A[Catch: all -> 0x0baf, TryCatch #7 {all -> 0x0baf, blocks: (B:138:0x0b37, B:140:0x0b44, B:141:0x0ba7), top: B:270:0x0b37, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0cce  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0d1d  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0dd3  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x115c  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x123d  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x128b  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x12df  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x163a  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0ad1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:296:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x089c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x08dc A[Catch: all -> 0x09a2, TryCatch #1 {all -> 0x09a2, blocks: (B:79:0x08d6, B:81:0x08dc, B:82:0x0908), top: B:261:0x08d6, outer: #3 }] */
    @Override // kotlin.requestOfflineAccess, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void attachBaseContext(android.content.Context r33) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 6092
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.AuthorizationRequestBuilder.attachBaseContext(android.content.Context):void");
    }

    static {
        MediaBrowserCompatMediaItem = 1;
        AudioAttributesImplApi21Parcelizer();
        INSTANCE = new Companion(null);
        int i = MediaBrowserCompatItemReceiver + 35;
        MediaBrowserCompatMediaItem = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    @getMagicModuleMeta
    public static final Intent IconCompatParcelizer(Context context, WorkAccountClient workAccountClient, String str) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 69;
        RatingCompat = i2 % 128;
        if (i2 % 2 != 0) {
            Companion.AudioAttributesCompatParcelizer(context, workAccountClient, str);
            throw null;
        }
        Intent intentAudioAttributesCompatParcelizer = Companion.AudioAttributesCompatParcelizer(context, workAccountClient, str);
        int i3 = RatingCompat + 47;
        MediaDescriptionCompat = i3 % 128;
        int i4 = i3 % 2;
        return intentAudioAttributesCompatParcelizer;
    }

    @Override // kotlin.requestOfflineAccess, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onStart() {
        int i = 2 % 2;
        int i2 = RatingCompat + 23;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = MediaDescriptionCompat + 117;
        RatingCompat = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 35 / 0;
        }
    }

    static void AudioAttributesImplApi21Parcelizer() {
        IconCompatParcelizer = 2060030498;
        RemoteActionCompatParcelizer = -819363190;
        AudioAttributesImplBaseParcelizer = -1352272069;
        AudioAttributesImplApi26Parcelizer = new byte[]{-38, -52, -40, -42, -35, 56, 56, -97, -58, 25, -128, -33, -48, -35, -52, -44, -51, TarConstants.LF_NORMAL, -26, 4, -30, TarConstants.LF_FIFO, TarConstants.LF_DIR, 6, TarConstants.LF_LINK, TarConstants.LF_CHR, -55, 60, TarConstants.LF_CHR, -55, -56, 59, -8, 1, -7, TarConstants.LF_SYMLINK, TarConstants.LF_BLK, TarConstants.LF_SYMLINK, 25, TarConstants.LF_DIR, 60, TarConstants.LF_CONTIG, TarConstants.LF_CHR, -8, 1, -29, 6, TarConstants.LF_NORMAL, TarConstants.LF_BLK, TarConstants.LF_FIFO, -55, TarConstants.LF_FIFO, 59, TarConstants.LF_DIR, TarConstants.LF_BLK, -27, 27, 63, -56, TarConstants.LF_SYMLINK, TarConstants.LF_CONTIG, -20, -56, TarConstants.LF_NORMAL, 25, -30, 1, TarConstants.LF_CHR, -26, TarConstants.LF_FIFO, 7, TarConstants.LF_SYMLINK, TarConstants.LF_DIR, TarConstants.LF_DIR, -18, 26, 61, -25, TarConstants.LF_BLK, 1, 15, 25, 0, 0, 30, 0, 23, 7, 30, 98, 99, -63, 31, 11, 19, 90, -53, 45, 115, 17, 74, 70, -97, 96, 70, -71, -94, 124, -74, -80, 70, -75, -78, 74, 64, -117, -1, -114, -5, -8, -9, -32, -123, -12, -127, -16, -28, -114, -4, -73, -73, -73, -73, -73, -73};
        AudioAttributesImplApi21Parcelizer = new char[]{45044, 44915, 44913, 44684, 44912, 44824, 44695, 44689, 44691, 44702, 44702, 44703, 44695, 44693, 44698, 44690, 44706, 44714, 44715, 44715, 44714, 44695, 44686, 44899, 44683, 44712, 44688, 44915, 44913, 44690, 44692, 45021, 44850, 44853, 44852, 44861, 44863, 44855, 44844, 44846, 44854, 44848, 44860, 44856, 44836, 44860, 44848, 44850, 44848, 44807, 44681, 44899, 44680, 44689, 44688, 44691, 44690, 44680, 44902, 44897, 44903, 44684, 44694, 44694, 44681, 44899, 44683, 44689, 44682, 44898, 44681, 44694, 44684, 44901, 44684, 44686, 44683, 44683, 44899, 44898, 44898, 44683, 44680, 44897, 44686, 44688, 44691, 44691, 44681, 44686, 44680, 44903, 44900, 44903, 44901, 44684, 44694, 44950, 44989, 44988, 44988, 44998, 44993, 44993, 44995, 44992, 44993, 44990, 44985, 44995, 45033, 45039, 44998, 44993, 44994, 44987, 44992, 44995, 44992, 44993, 44987, 44993, 44998, 44998, 45033, 45033, 44996, 44998, 44992, 44988, 44990, 44985, 44990, 44988, 44996, 45038, 44997, 44991, 44984, 44984, 44987, 44987, 44995, 45035, 44998, 44996, 45038, 45032, 44998, 44990, 44985, 44998, 45038, 44996, 44999, 44992, 44987, 44992, 45032, 44995, 44995, 44826, 44687, 44897, 44922, 44696, 44711, 44708, 44730, 44704, 44707, 44709, 44711, 44719, 44707, 44707, 44684, 44902, 44698, 44676, 44679, 44709, 44706, 44712, 44716, 44717, 44674, 44674, 44706, 44718, 44686, 44672, 44704, 44719, 44686, 44687, 44717, 44719, 44717, 44709, 44708, 44717, 44717, 44719, 44717, 44704, 44684, 44679, 44709, 44716, 44692, 44717, 44716, 44693, 44717, 44707, 44704, 44679, 44678, 44717, 44719, 44711, 44708, 44710, 44731, 44708, 44716, 44715, 44956, 44984, 44991, 44991, 44991, 44986, 44995, 44997, 44997, 44997, 44984, 44965, 44987, 44987, 44990, 44988, 44998, 44995, 44987, 44990, 44988, 44993, 44995, 44993, 45038, 45038, 44996, 44990, 44995, 44998, 44996, 44995, 44964, 44987, 44992, 44999, 44895, 44907, 44884, 44863, 44885, 44893, 44908, 44911, 44897, 44879, 44842, 44911, 44907, 44842, 44892, 44881, 44907, 44910, 44892, 44906, 44889, 44887, 44945, 44990, 44991, 44989, 44985, 44984, 44985, 44991, 44988, 44988, 44989, 44946, 44985, 44985, 44990, 44988, 44985, 44990, 44989, 44989, 44991, 44985};
    }
}
