package kotlin;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ListView;
import com.google.android.exoplayer2.drm.DrmSessionEventListener$EventDispatcher$$ExternalSyntheticLambda4;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import com.marrow.data.models.common.DataSet;
import com.marrow.data.models.user.Country;
import com.marrow.data.models.user.State;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.parseStyleDeclaration;
import kotlin.resetBytesRead;
import org.apache.commons.compress.archivers.tar.TarConstants;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u001eB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u0005J\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0014\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001a\u001a\u00020\u00198CX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d"}, d2 = {"Lo/parseNextToken;", "Lcom/marrow/ui/activities/base/BaseDaggerActivity;", "Lo/parseStyleDeclaration$RemoteActionCompatParcelizer;", "Lo/parseStyleDeclaration$IconCompatParcelizer;", "<init>", "()V", "", "handleMediaPlayPauseIfPendingOnHandler", "()I", "Landroid/os/Bundle;", "p0", "", "onCreate", "(Landroid/os/Bundle;)V", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "Lo/NavigationBarViewSavedState;", "onAddQueueItem", "()Lo/NavigationBarViewSavedState;", "", "Lcom/marrow/data/models/user/Country;", "AudioAttributesCompatParcelizer", "([Lcom/marrow/data/models/user/Country;)V", "", "ai_", "()Z", "Lo/parseBaseUrl;", "read", "Lo/setSessionInfo;", "onCommand", "()Lo/parseBaseUrl;", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class parseNextToken extends parseBlock<parseStyleDeclaration.RemoteActionCompatParcelizer> implements parseStyleDeclaration.IconCompatParcelizer {
    private static /* synthetic */ isResolutionNotSupported<Object>[] AudioAttributesCompatParcelizer;
    private static int IconCompatParcelizer;
    private static int MediaBrowserCompatCustomActionResultReceiver;
    private static short[] MediaBrowserCompatMediaItem;
    private static byte[] MediaBrowserCompatSearchResultReceiver;
    private static long MediaDescriptionCompat;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static int onCommand;
    private static int write;
    private final setSessionInfo read = parseTrackTiming.write(this, SessionDescriptionParser.RemoteActionCompatParcelizer(), new IconCompatParcelizer());
    private static final byte[] $$l = {109, -78, -126, 25};
    private static final int $$o = 219;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$p = {117, -12, 2, 85, -61, 61, 2, 19, -34, 27, 19, 7, -4, 7, -3, -19, 41, -5, -7, -27, TarConstants.LF_NORMAL, 1, 2, -38, TarConstants.LF_NORMAL, 3, 4, -5, 2, 21, -7, 17, -9, 15, 9, -40, 24, 17, -9, 10, 2, 17, -1, -5, 15, -11, 23, 12, 6, 9, -11, -32, 38, 21, -7, 10, 3, -39, TarConstants.LF_NORMAL, 2, 7, -11, 23, -32, 21, 21, -11, 6, 11, 1, 21, -17, 17, -61, 41, 37, -15, 23, 5, 2, -42, TarConstants.LF_CONTIG, -17, 6, 15, 8, -7, 10, 3, -29, 24, 19, 4, -7, 17};
    private static final int $$q = 91;
    private static final byte[] $$d = {TarConstants.LF_NORMAL, -108, 98, 5, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -48, TarConstants.LF_CHR, -1, 2, -4, -1, -43, 35, 18, -10, 7, 0, -27, 20, 15, 3, -8, 9, -33, 20, -1, 3, 5, 14, -16, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 0, 32, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 5, 27, 18, 18, -14, 3, 8, -2, 18, -20, 14, -12, -3, 4, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -42, 44, -14, 9, -26, 20, -1, 3, 5, 14, -16, 14, 27, 13, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, 20, 9, 3, 6, -14, -35, 35, 18, -10, 7, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -47, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14};
    private static final int $$e = 85;
    private static int MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = 1;
    private static int MediaMetadataCompat = 0;
    private static int RatingCompat = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$r(int r6, int r7, byte r8) {
        /*
            int r6 = r6 * 4
            int r6 = 4 - r6
            byte[] r0 = kotlin.parseNextToken.$$l
            int r7 = r7 + 112
            int r8 = r8 * 2
            int r8 = r8 + 1
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L15
            r7 = r6
            r4 = r8
            r3 = r2
            goto L28
        L15:
            r3 = r2
            r5 = r7
            r7 = r6
            r6 = r5
        L19:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r8) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L26:
            r4 = r0[r7]
        L28:
            int r4 = -r4
            int r6 = r6 + r4
            int r7 = r7 + 1
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.parseNextToken.$$r(int, int, byte):java.lang.String");
    }

    public static /* synthetic */ Object IconCompatParcelizer(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i;
        int i8 = ~i6;
        int i9 = i7 | i8;
        int i10 = ~(i9 | i3);
        int i11 = (~i3) | i7;
        int i12 = i10 | (~(i11 | i6));
        int i13 = (~(i3 | i7)) | (~i9);
        int i14 = (~i11) | (~(i8 | i));
        int i15 = i + i6 + i2 + (783392123 * i4) + ((-786872706) * i5);
        int i16 = i15 * i15;
        int i17 = ((-1525980173) * i) + 1729888256 + (218870266 * i6) + (i12 * 1744850439) + ((-805266418) * i13) + (1744850439 * i14) + (1963720704 * i2) + ((-1731985408) * i4) + ((-471334912) * i5) + ((-600899584) * i16);
        int i18 = (i * 375823119) + 1642083618 + (i6 * 375823682) + (i12 * 563) + (i13 * 1126) + (i14 * 563) + (i2 * 375824245) + (i4 * (-117547465)) + (i5 * 763984278) + (i16 * (-763691008));
        int i19 = i17 + (i18 * i18 * 1830354944);
        return i19 != 1 ? i19 != 2 ? write(objArr) : IconCompatParcelizer(objArr) : AudioAttributesCompatParcelizer(objArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void g(short r5, short r6, byte r7, java.lang.Object[] r8) {
        /*
            int r6 = r6 + 4
            int r5 = r5 + 65
            int r0 = 44 - r7
            byte[] r1 = kotlin.parseNextToken.$$d
            byte[] r0 = new byte[r0]
            int r7 = 43 - r7
            r2 = -1
            if (r1 != 0) goto L12
            r4 = r7
            r3 = r2
            goto L27
        L12:
            r3 = r2
        L13:
            int r3 = r3 + 1
            byte r4 = (byte) r5
            r0[r3] = r4
            if (r3 != r7) goto L23
            java.lang.String r5 = new java.lang.String
            r6 = 0
            r5.<init>(r0, r6)
            r8[r6] = r5
            return
        L23:
            int r6 = r6 + 1
            r4 = r1[r6]
        L27:
            int r5 = r5 + r4
            int r5 = r5 + r2
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.parseNextToken.g(short, short, byte, java.lang.Object[]):void");
    }

    private static void h(int i, short s, short s2, Object[] objArr) {
        int i2 = s + 4;
        int i3 = s2 + 82;
        byte[] bArr = $$p;
        byte[] bArr2 = new byte[i + 5];
        int i4 = i + 4;
        int i5 = -1;
        if (bArr == null) {
            i3 = (i3 + i4) - 4;
            i2++;
        }
        while (true) {
            i5++;
            bArr2[i5] = (byte) i3;
            if (i5 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i3 = (i3 + bArr[i2]) - 4;
                i2++;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final parseBaseUrl onCommand() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 29;
        RatingCompat = i2 % 128;
        int i3 = i2 % 2;
        parseBaseUrl parsebaseurl = (parseBaseUrl) this.read.read(this, AudioAttributesCompatParcelizer[0]);
        int i4 = MediaMetadataCompat + 37;
        RatingCompat = i4 % 128;
        if (i4 % 2 != 0) {
            return parsebaseurl;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class IconCompatParcelizer implements getAnswerMap<parseNextToken, parseBaseUrl> {
        private static parseBaseUrl AudioAttributesCompatParcelizer(parseNextToken parsenexttoken) {
            toMagicModuleMetaRepoModel.write(parsenexttoken, "");
            return parseBaseUrl.read(SessionDescriptionParser.AudioAttributesCompatParcelizer(parsenexttoken));
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [o.getApplicationLabel, o.parseBaseUrl] */
        @Override // kotlin.getAnswerMap
        public final /* synthetic */ parseBaseUrl invoke(parseNextToken parsenexttoken) {
            return AudioAttributesCompatParcelizer(parsenexttoken);
        }
    }

    private static void f(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        notifyDownloadChanged notifydownloadchanged = new notifyDownloadChanged();
        notifydownloadchanged.read = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        notifydownloadchanged.AudioAttributesCompatParcelizer = 0;
        while (notifydownloadchanged.AudioAttributesCompatParcelizer < cArr.length) {
            int i3 = $11 + 85;
            $10 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = notifydownloadchanged.AudioAttributesCompatParcelizer;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[notifydownloadchanged.AudioAttributesCompatParcelizer]), notifydownloadchanged, notifydownloadchanged};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1435583294);
                    if (objRemoteActionCompatParcelizer == null) {
                        byte b = (byte) 0;
                        objRemoteActionCompatParcelizer = startForeground.read((char) (View.MeasureSpec.getMode(0) + 38461), 532 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 8 - ((Process.getThreadPriority(0) + 20) >> 6), -735610793, false, $$r(b, (byte) (b | 9), b), new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i4] = ((Long) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).longValue() - (MediaDescriptionCompat - 2192498202983240651L);
                    Object[] objArr3 = {notifydownloadchanged, notifydownloadchanged};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(1971306176);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        byte b2 = (byte) 0;
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) ((KeyEvent.getMaxKeyCode() >> 16) + 36621), Gravity.getAbsoluteGravity(0, 0) + 2340, 29 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 188119637, false, $$r(b2, (byte) (b2 | 7), b2), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i5 = notifydownloadchanged.AudioAttributesCompatParcelizer;
                try {
                    Object[] objArr4 = {Integer.valueOf(cArr[notifydownloadchanged.AudioAttributesCompatParcelizer]), notifydownloadchanged, notifydownloadchanged};
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1435583294);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        byte b3 = (byte) 0;
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) (38461 - (ViewConfiguration.getPressedStateDuration() >> 16)), Color.rgb(0, 0, 0) + 16777748, Drawable.resolveOpacity(0, 0) + 8, -735610793, false, $$r(b3, (byte) (b3 | 9), b3), new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i5] = ((Long) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).longValue() ^ (MediaDescriptionCompat ^ 2192498202983240651L);
                    Object[] objArr5 = {notifydownloadchanged, notifydownloadchanged};
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(1971306176);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        byte b4 = (byte) 0;
                        objRemoteActionCompatParcelizer4 = startForeground.read((char) (View.resolveSize(0, 0) + 36621), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 2341, 28 - Color.blue(0), 188119637, false, $$r(b4, (byte) (b4 | 7), b4), new Class[]{Object.class, Object.class});
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
        char[] cArr2 = new char[length];
        notifydownloadchanged.AudioAttributesCompatParcelizer = 0;
        while (notifydownloadchanged.AudioAttributesCompatParcelizer < cArr.length) {
            int i6 = $10 + 125;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                cArr2[notifydownloadchanged.AudioAttributesCompatParcelizer] = (char) jArr[notifydownloadchanged.AudioAttributesCompatParcelizer];
                Object[] objArr6 = {notifydownloadchanged, notifydownloadchanged};
                Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(1971306176);
                if (objRemoteActionCompatParcelizer5 == null) {
                    byte b5 = (byte) 0;
                    objRemoteActionCompatParcelizer5 = startForeground.read((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 36620), 2340 - TextUtils.indexOf("", ""), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 29, 188119637, false, $$r(b5, (byte) (b5 | 7), b5), new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer5).invoke(null, objArr6);
                int i7 = 79 / 0;
            } else {
                cArr2[notifydownloadchanged.AudioAttributesCompatParcelizer] = (char) jArr[notifydownloadchanged.AudioAttributesCompatParcelizer];
                Object[] objArr7 = {notifydownloadchanged, notifydownloadchanged};
                Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(1971306176);
                if (objRemoteActionCompatParcelizer6 == null) {
                    byte b6 = (byte) 0;
                    objRemoteActionCompatParcelizer6 = startForeground.read((char) (KeyEvent.getDeadChar(0, 0) + 36621), 2340 - Gravity.getAbsoluteGravity(0, 0), 27 - TextUtils.indexOf((CharSequence) "", '0', 0), 188119637, false, $$r(b6, (byte) (b6 | 7), b6), new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer6).invoke(null, objArr7);
            }
            int i8 = $10 + 71;
            $11 = i8 % 128;
            int i9 = i8 % 2;
        }
        objArr[0] = new String(cArr2);
    }

    /* JADX INFO: renamed from: o.parseNextToken$RemoteActionCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0007¢\u0006\u0004\b\r\u0010\u000eJ7\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0011\u0010\u0012"}, d2 = {"Lo/parseNextToken$RemoteActionCompatParcelizer;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "", "Lcom/marrow/data/models/user/State;", "p1", "", "p2", "p3", "Landroid/content/Intent;", "read", "(Landroid/content/Context;[Lcom/marrow/data/models/user/State;Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;", "Lcom/marrow/data/models/user/Country;", "", "RemoteActionCompatParcelizer", "(Landroid/content/Context;[Lcom/marrow/data/models/user/Country;Ljava/lang/String;)Landroid/content/Intent;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getMagicModuleMeta
        public static Intent read(Context p0, State[] p1, String p2, String p3) {
            String string;
            String str = "";
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            toMagicModuleMetaRepoModel.write(p2, "");
            toMagicModuleMetaRepoModel.write(p3, "");
            JSONArray jsonArray = DataSet.toJsonArray(p1);
            Intent intent = new Intent(p0, (Class<?>) parseNextToken.class);
            if (jsonArray != null && (string = jsonArray.toString()) != null) {
                str = string;
            }
            intent.putExtra("data_list", str);
            intent.putExtra("android.intent.extra.TITLE", p2);
            intent.putExtra("current_selected_data", p3);
            return intent;
        }

        @getMagicModuleMeta
        public static Intent RemoteActionCompatParcelizer(Context context, Country[] countryArr, String str) {
            toMagicModuleMetaRepoModel.write(context, "");
            toMagicModuleMetaRepoModel.write(countryArr, "");
            String strAudioAttributesCompatParcelizer = new setDownloadingStatesToQueued().AudioAttributesCompatParcelizer(countryArr);
            Intent intent = new Intent(context, (Class<?>) parseNextToken.class);
            intent.putExtra("data_list", strAudioAttributesCompatParcelizer != null ? strAudioAttributesCompatParcelizer.toString() : null);
            intent.putExtra("android.intent.extra.TITLE", str);
            intent.putExtra("fmge_st", true);
            return intent;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    private static void e(int i, byte b, int i2, int i3, short s, Object[] objArr) throws Throwable {
        int i4;
        long j;
        int i5 = 2;
        int i6 = 2 % 2;
        buildResumeDownloadsIntent buildresumedownloadsintent = new buildResumeDownloadsIntent();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(IconCompatParcelizer)};
            int i7 = 0;
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(559968424);
            if (objRemoteActionCompatParcelizer == null) {
                objRemoteActionCompatParcelizer = startForeground.read((char) Color.argb(0, 0, 0, 0), TextUtils.getCapsMode("", 0, 0) + 24297, (-16777204) - Color.rgb(0, 0, 0), 1596568637, false, CmcdHeadersFactory.STREAM_TYPE_LIVE, new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                int i8 = $11 + 63;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                i4 = 1;
            } else {
                i4 = 0;
            }
            if (i4 != 0) {
                int i10 = $10 + 23;
                $11 = i10 % 128;
                int i11 = i10 % 2;
                byte[] bArr = MediaBrowserCompatSearchResultReceiver;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i12 = 0;
                    while (i12 < length) {
                        int i13 = $11 + 69;
                        $10 = i13 % 128;
                        if (i13 % i5 != 0) {
                            Object[] objArr3 = new Object[1];
                            objArr3[i7] = Integer.valueOf(bArr[i12]);
                            Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(28234468);
                            if (objRemoteActionCompatParcelizer2 == null) {
                                byte b2 = (byte) i7;
                                byte b3 = b2;
                                objRemoteActionCompatParcelizer2 = startForeground.read((char) View.MeasureSpec.getSize(i7), (Process.myTid() >> 22) + 3082, 128 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 2145850993, false, $$r(b2, b3, b3), new Class[]{Integer.TYPE});
                            }
                            bArr2[i12] = ((Byte) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).byteValue();
                            i12 >>= 1;
                        } else {
                            Object[] objArr4 = {Integer.valueOf(bArr[i12])};
                            Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(28234468);
                            if (objRemoteActionCompatParcelizer3 == null) {
                                byte b4 = (byte) 0;
                                byte b5 = b4;
                                objRemoteActionCompatParcelizer3 = startForeground.read((char) (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 3083 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 127 - TextUtils.lastIndexOf("", '0', 0), 2145850993, false, $$r(b4, b5, b5), new Class[]{Integer.TYPE});
                            }
                            bArr2[i12] = ((Byte) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).byteValue();
                            i12++;
                        }
                        i5 = 2;
                        i7 = 0;
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = MediaBrowserCompatSearchResultReceiver;
                    Object[] objArr5 = {Integer.valueOf(i2), Integer.valueOf(write)};
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(559968424);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        objRemoteActionCompatParcelizer4 = startForeground.read((char) (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), TextUtils.indexOf("", "", 0) + 24297, View.MeasureSpec.makeMeasureSpec(0, 0) + 12, 1596568637, false, CmcdHeadersFactory.STREAM_TYPE_LIVE, new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).intValue()]) ^ 7899112766888837815L)) + ((int) (((long) IconCompatParcelizer) ^ 7899112766888837815L)));
                    j = 7899112766888837815L;
                } else {
                    j = 7899112766888837815L;
                    iIntValue = (short) (((short) (((long) MediaBrowserCompatMediaItem[i2 + ((int) (((long) write) ^ 7899112766888837815L))]) ^ 7899112766888837815L)) + ((int) (((long) IconCompatParcelizer) ^ 7899112766888837815L)));
                }
            } else {
                j = 7899112766888837815L;
            }
            if (iIntValue > 0) {
                buildresumedownloadsintent.read = ((i2 + iIntValue) - 2) + ((int) (((long) write) ^ j)) + i4;
                Object[] objArr6 = {buildresumedownloadsintent, Integer.valueOf(i), Integer.valueOf(MediaBrowserCompatCustomActionResultReceiver), sb};
                Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(107629512);
                if (objRemoteActionCompatParcelizer5 == null) {
                    objRemoteActionCompatParcelizer5 = startForeground.read((char) (34133 - ((byte) KeyEvent.getModifierMetaStateMask())), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 13432, 21 - Color.green(0), 2015596381, false, "t", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objRemoteActionCompatParcelizer5).invoke(null, objArr6)).append(buildresumedownloadsintent.IconCompatParcelizer);
                buildresumedownloadsintent.RemoteActionCompatParcelizer = buildresumedownloadsintent.IconCompatParcelizer;
                byte[] bArr4 = MediaBrowserCompatSearchResultReceiver;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i14 = 0; i14 < length2; i14++) {
                        bArr5[i14] = (byte) (((long) bArr4[i14]) ^ 7899112766888837815L);
                    }
                    bArr4 = bArr5;
                }
                boolean z = bArr4 != null;
                buildresumedownloadsintent.AudioAttributesCompatParcelizer = 1;
                while (buildresumedownloadsintent.AudioAttributesCompatParcelizer < iIntValue) {
                    if (!z) {
                        short[] sArr = MediaBrowserCompatMediaItem;
                        buildresumedownloadsintent.read = buildresumedownloadsintent.read - 1;
                        buildresumedownloadsintent.IconCompatParcelizer = (char) (buildresumedownloadsintent.RemoteActionCompatParcelizer + (((short) (((short) (((long) sArr[r3]) ^ 7899112766888837815L)) + s)) ^ b));
                    } else {
                        byte[] bArr6 = MediaBrowserCompatSearchResultReceiver;
                        buildresumedownloadsintent.read = buildresumedownloadsintent.read - 1;
                        buildresumedownloadsintent.IconCompatParcelizer = (char) (buildresumedownloadsintent.RemoteActionCompatParcelizer + (((byte) (((byte) (((long) bArr6[r3]) ^ 7899112766888837815L)) + s)) ^ b));
                    }
                    sb.append(buildresumedownloadsintent.IconCompatParcelizer);
                    buildresumedownloadsintent.RemoteActionCompatParcelizer = buildresumedownloadsintent.IconCompatParcelizer;
                    buildresumedownloadsintent.AudioAttributesCompatParcelizer++;
                    int i15 = $11 + 61;
                    $10 = i15 % 128;
                    int i16 = i15 % 2;
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

    private static /* synthetic */ Object write(Object[] objArr) {
        DataSet[] dataSetArr = (DataSet[]) objArr[0];
        parseNextToken parsenexttoken = (parseNextToken) objArr[1];
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        int i2 = RatingCompat + 45;
        MediaMetadataCompat = i2 % 128;
        if (i2 % 2 == 0) {
            String id = dataSetArr[iIntValue].getId();
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) id, (Object) "101")) {
                ((parseStyleDeclaration.RemoteActionCompatParcelizer) parsenexttoken.mPresenter).read();
                int i3 = MediaMetadataCompat + 99;
                RatingCompat = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 12 / 0;
                }
                return null;
            }
            Intent intent = new Intent();
            intent.putExtra("position", iIntValue);
            intent.putExtra("fmge_st", zBooleanValue);
            intent.putExtra("_id", id);
            intent.putExtra("selected_title", dataSetArr[iIntValue].getData());
            parsenexttoken.setResult(-1, intent);
            parsenexttoken.finish();
            return null;
        }
        toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) dataSetArr[iIntValue].getId(), (Object) "101");
        throw null;
    }

    private static final void write(parseNextToken parsenexttoken) {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 53;
        RatingCompat = i2 % 128;
        int i3 = i2 % 2;
        parsenexttoken.finish();
        if (i3 == 0) {
            int i4 = 20 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x02b6  */
    @Override // kotlin.parseBlock, com.marrow.ui.activities.base.BaseDaggerActivity, com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(android.os.Bundle r42) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 3189
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.parseNextToken.onCreate(android.os.Bundle):void");
    }

    private static /* synthetic */ Object AudioAttributesCompatParcelizer(Object[] objArr) {
        parseNextToken parsenexttoken = (parseNextToken) objArr[0];
        int i = 2 % 2;
        int i2 = RatingCompat + 57;
        MediaMetadataCompat = i2 % 128;
        int i3 = i2 % 2;
        ListView listView = parsenexttoken.onCommand().write;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(listView, "");
        getHttpMethodString.read((View) listView, false, true, true, true, 0, 49);
        int i4 = RatingCompat + 71;
        MediaMetadataCompat = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    @Override // com.marrow.ui.activities.base.BaseActivity
    public final NavigationBarViewSavedState onAddQueueItem() {
        int i = 2 % 2;
        NavigationBarViewSavedState navigationBarViewSavedState = new NavigationBarViewSavedState(CmcdConfigurationRequestConfig.IconCompatParcelizer(), Integer.valueOf(R.attr.colorSurfaceVariant14), null, 4, null);
        int i2 = RatingCompat + 55;
        MediaMetadataCompat = i2 % 128;
        if (i2 % 2 == 0) {
            return navigationBarViewSavedState;
        }
        throw null;
    }

    @Override // o.parseStyleDeclaration.IconCompatParcelizer
    public final void AudioAttributesCompatParcelizer(Country[] p0) {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 105;
        RatingCompat = i2 % 128;
        int i3 = i2 % 2;
        toMagicModuleMetaRepoModel.write(p0, "");
        Intent intentRemoteActionCompatParcelizer = Companion.RemoteActionCompatParcelizer(this, p0, getString(R.string.select_country_for_college));
        intentRemoteActionCompatParcelizer.addFlags(33554432);
        startActivity(intentRemoteActionCompatParcelizer);
        finish();
        int i4 = MediaMetadataCompat + 115;
        RatingCompat = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0181  */
    @Override // kotlin.parseBlock, com.marrow.ui.activities.base.BaseDaggerActivity, com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onResume() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 525
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.parseNextToken.onResume():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x017e  */
    @Override // kotlin.parseBlock, com.marrow.ui.activities.base.BaseDaggerActivity, com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onPause() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 523
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.parseNextToken.onPause():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x0cb6  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0cb7  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0ea2  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0ef3  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0f5a  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x12c6  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x13a8  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x13f7  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x1451  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x1837  */
    /* JADX WARN: Removed duplicated region for block: B:283:? A[RETURN, SYNTHETIC] */
    @Override // kotlin.parseBlock, com.marrow.ui.activities.base.BaseDaggerActivity, com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void attachBaseContext(android.content.Context r37) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 6647
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.parseNextToken.attachBaseContext(android.content.Context):void");
    }

    public static /* synthetic */ void IconCompatParcelizer(DataSet[] dataSetArr, parseNextToken parsenexttoken, boolean z, int i) {
        Object[] objArr = {dataSetArr, parsenexttoken, Boolean.valueOf(z), Integer.valueOf(i)};
        IconCompatParcelizer(1059233486, DrmSessionEventListener$EventDispatcher$$ExternalSyntheticLambda4.IconCompatParcelizer(), DrmSessionEventListener$EventDispatcher$$ExternalSyntheticLambda4.IconCompatParcelizer(), DrmSessionEventListener$EventDispatcher$$ExternalSyntheticLambda4.IconCompatParcelizer(), DrmSessionEventListener$EventDispatcher$$ExternalSyntheticLambda4.IconCompatParcelizer(), -1059233484, objArr);
    }

    public static /* synthetic */ void RemoteActionCompatParcelizer(parseNextToken parsenexttoken) {
        int i = 2 % 2;
        int i2 = RatingCompat + 93;
        MediaMetadataCompat = i2 % 128;
        int i3 = i2 % 2;
        write(parsenexttoken);
        int i4 = RatingCompat + 109;
        MediaMetadataCompat = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        onCommand = 0;
        MediaDescriptionCompat();
        AudioAttributesCompatParcelizer = new isResolutionNotSupported[]{toMagicModuleMetaDataUcModel.write(new downloadMagicModuleMetalambda0(parseNextToken.class, "binding", "getBinding()Lcom/marrow/databinding/ActivityDataSelectionBinding;", 0))};
        INSTANCE = new Companion(null);
        int i = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 69;
        onCommand = i % 128;
        int i2 = i % 2;
    }

    private final void MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 1747554977;
        IconCompatParcelizer(1829443043, DrmSessionEventListener$EventDispatcher$$ExternalSyntheticLambda4.IconCompatParcelizer(), length, DrmSessionEventListener$EventDispatcher$$ExternalSyntheticLambda4.IconCompatParcelizer(), resetBytesRead.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer(), -1829443042, new Object[]{this});
    }

    private static final void read(DataSet[] dataSetArr, parseNextToken parsenexttoken, boolean z, int i) {
        Object[] objArr = {dataSetArr, parsenexttoken, Boolean.valueOf(z), Integer.valueOf(i)};
        IconCompatParcelizer(2130115568, DrmSessionEventListener$EventDispatcher$$ExternalSyntheticLambda4.IconCompatParcelizer(), DrmSessionEventListener$EventDispatcher$$ExternalSyntheticLambda4.IconCompatParcelizer(), DrmSessionEventListener$EventDispatcher$$ExternalSyntheticLambda4.IconCompatParcelizer(), DrmSessionEventListener$EventDispatcher$$ExternalSyntheticLambda4.IconCompatParcelizer(), -2130115568, objArr);
    }

    @Override // com.marrow.ui.activities.base.BaseActivity
    public final int handleMediaPlayPauseIfPendingOnHandler() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 53;
        int i3 = i2 % 128;
        RatingCompat = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 99;
        MediaMetadataCompat = i5 % 128;
        if (i5 % 2 == 0) {
            return R.layout.activity_data_selection;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.marrow.ui.activities.base.BaseActivity
    public final boolean ai_() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 113;
        RatingCompat = i2 % 128;
        return true ^ (i2 % 2 == 0);
    }

    @Override // kotlin.parseBlock, com.marrow.ui.activities.base.BaseDaggerActivity, com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onStart() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 43;
        RatingCompat = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = RatingCompat + 81;
        MediaMetadataCompat = i4 % 128;
        int i5 = i4 % 2;
    }

    static void MediaDescriptionCompat() {
        write = 1509576049;
        IconCompatParcelizer = -819363107;
        MediaBrowserCompatCustomActionResultReceiver = -1394865888;
        MediaBrowserCompatSearchResultReceiver = new byte[]{-73, -71, -75, 67, 74, -107, -107, 12, -77, -10, 125, TarConstants.LF_GNUTYPE_LONGNAME, 77, 74, -71, 65, -70, TarConstants.LF_GNUTYPE_LONGNAME, -93, 107, -69, -76, TarConstants.LF_GNUTYPE_LONGLINK, 68, -67, -93, 108, -78, -68, 68, -70, 66, -90, -107, -92, 9, -73, -72, -124, 125, TarConstants.LF_GNUTYPE_LONGNAME, 77, 74, -71, 65, -70, 72, -79, 66, -92, 73, 77, 74, TarConstants.LF_GNUTYPE_LONGLINK, -73, -104, 122, -79, -66, 68, -73, 74, -91, -77, 121, -121, 101, 73, 72, -103, -76, -74, TarConstants.LF_GNUTYPE_LONGNAME, -65, -74, TarConstants.LF_GNUTYPE_LONGNAME, TarConstants.LF_GNUTYPE_LONGLINK, -66, 123, -124, 124, -75, -73, -75, -100, 72, -65, 74, -74, 123, -124, 102, -103, -77, -73, 73, TarConstants.LF_GNUTYPE_LONGNAME, 73, -66, 72, -73, TarConstants.LF_PAX_EXTENDED_HEADER_LC, -98, -78, TarConstants.LF_GNUTYPE_LONGLINK, -75, 74, 111, TarConstants.LF_GNUTYPE_LONGLINK, -77, -100, 101, -124, -74, 121, 73, -102, -75, 72, 72, 97, -99, -80, 122, -73, -124, 72, -79, -66, TarConstants.LF_PAX_EXTENDED_HEADER_UC, -90, -127, 74, 11, -16, 12, -74, -71, 73, 78, -78, -115, 113, 78, -72, -123, 117, 73, -69, -126, 126, 68, -90, 91, -77, 73, -72, 69, -90, 91, -71, -114, 13, -74, -91, 73, TarConstants.LF_PAX_EXTENDED_HEADER_UC, -92, TarConstants.LF_GNUTYPE_LONGLINK, 68, -67, 67, -15, 12, -72, 65, 78, -79, 74, 78, -70, -76, -65, 74, -126, -73, 66, 112, -76, TarConstants.LF_GNUTYPE_LONGLINK, -73, -69, -77, 77, -76, -76, 66, -73, 98, -121, 124, -76, 73, -103, -78, 102, -99, 102, -114, 74, 73, TarConstants.LF_PAX_GLOBAL_EXTENDED_HEADER, -98, -69, 65, -76, 73, -75, -80, 112, -103, 101, -103, -68, TarConstants.LF_GNUTYPE_LONGLINK, -73, 72, TarConstants.LF_GNUTYPE_LONGLINK, 72, 98, -122, 72, -65, 70, -74, 77, -111, -110, 112, 78, -70, 66, -119, 122, 92, -94, 64, -74, 66, -101, 108, 66, -91, -82, TarConstants.LF_PAX_EXTENDED_HEADER_LC, -78, -68, 66, -79, -66, -74, TarConstants.LF_GNUTYPE_LONGNAME, -65, 67, -76, -98, 97, -65, 70, -74, 77, -111, -110, 12, -77, -10, 125, TarConstants.LF_GNUTYPE_LONGNAME, 77, 74, -71, 65, -70, 77, 74, -80, TarConstants.LF_GNUTYPE_LONGNAME, -74, 74, -78, TarConstants.LF_GNUTYPE_LONGNAME, -80, 73, -73, -73, -73, -73, -73, -73, -73, -73, -73, -73, -73, -73};
        MediaDescriptionCompat = 2286936135898192879L;
    }

    private static /* synthetic */ Object IconCompatParcelizer(Object[] objArr) {
        DataSet[] dataSetArr = (DataSet[]) objArr[0];
        parseNextToken parsenexttoken = (parseNextToken) objArr[1];
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 123;
        RatingCompat = i2 % 128;
        if (i2 % 2 != 0) {
            Object[] objArr2 = {dataSetArr, parsenexttoken, Boolean.valueOf(zBooleanValue), Integer.valueOf(iIntValue)};
            IconCompatParcelizer(2130115568, DrmSessionEventListener$EventDispatcher$$ExternalSyntheticLambda4.IconCompatParcelizer(), DrmSessionEventListener$EventDispatcher$$ExternalSyntheticLambda4.IconCompatParcelizer(), DrmSessionEventListener$EventDispatcher$$ExternalSyntheticLambda4.IconCompatParcelizer(), DrmSessionEventListener$EventDispatcher$$ExternalSyntheticLambda4.IconCompatParcelizer(), -2130115568, objArr2);
            return null;
        }
        Object[] objArr3 = {dataSetArr, parsenexttoken, Boolean.valueOf(zBooleanValue), Integer.valueOf(iIntValue)};
        IconCompatParcelizer(2130115568, DrmSessionEventListener$EventDispatcher$$ExternalSyntheticLambda4.IconCompatParcelizer(), DrmSessionEventListener$EventDispatcher$$ExternalSyntheticLambda4.IconCompatParcelizer(), DrmSessionEventListener$EventDispatcher$$ExternalSyntheticLambda4.IconCompatParcelizer(), DrmSessionEventListener$EventDispatcher$$ExternalSyntheticLambda4.IconCompatParcelizer(), -2130115568, objArr3);
        int i3 = 53 / 0;
        return null;
    }
}
