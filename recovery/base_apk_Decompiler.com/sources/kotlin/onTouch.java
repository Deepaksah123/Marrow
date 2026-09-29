package kotlin;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import java.lang.reflect.Method;
import kotlin.Metadata;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Lo/onTouch;", "Lo/addObserverForBackInvoker;", "<init>", "()V", "Landroid/os/Bundle;", "p0", "", "onCreate", "(Landroid/os/Bundle;)V", "Lo/parseContentType;", "read", "Lo/parseContentType;", "RemoteActionCompatParcelizer", "write"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class onTouch extends TouchTrackerListener {
    private static char[] AudioAttributesCompatParcelizer;
    private static short[] AudioAttributesImplApi21Parcelizer;
    private static byte[] AudioAttributesImplApi26Parcelizer;
    private static int AudioAttributesImplBaseParcelizer;
    private static int IconCompatParcelizer;
    private static int MediaBrowserCompatCustomActionResultReceiver;
    private static int MediaBrowserCompatItemReceiver;
    private static char RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private parseContentType RemoteActionCompatParcelizer;
    private static final byte[] $$c = {TarConstants.LF_GNUTYPE_LONGLINK, 94, -43, -123};
    private static final int $$f = 143;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$g = {42, -44, 23, -55, -67, 29, 22, -3, 3, -10, -32, 42, -13, -1, -4, -15, 17, -7, -1, 8, -31, 17, 7, -12, -1, 11, -15, 11, -49, 42, -13, -1, -4, -24, 18, 21, -36, 9, 9, 7, -18, 12, -15, -6, 1, 17, 6, 0, 3, -17, -38, 32, 15, -13, 4, -3, -45, 42, -4, 1, -17, 17, -38, 15, 15, -17, 0, 5, -5, 15, -23, 11, -67, TarConstants.LF_CONTIG, -4, 13, -50, 35, -7, -20, 17, -37, TarConstants.LF_LINK, -17, -2, -3, 11, -80, 81, -7, -11, 9, -17, TarConstants.LF_SYMLINK, -19, 3, 4, -48, TarConstants.LF_LINK, -2, -4, -11, -9, 17, -3, -17, 12, -50, 42, -4, 1, -17, 17, -38, 15, 15, -17, 0, 5, -5, 15, -23, 11};
    private static final int $$h = 162;
    private static final byte[] $$a = {31, 34, 9, -77, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -48, TarConstants.LF_CHR, -1, 2, -4, -1, -43, 35, 18, -10, 7, 0, -27, 20, 15, 3, -8, 9, -33, 20, -1, 3, 5, 14, -16, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 0, 32, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 5, 27, 18, 18, -14, 3, 8, -2, 18, -20, 14, -12, -3, 4, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -42, 44, -14, 9, -26, 20, -1, 3, 5, 14, -16, 14, 27, 13, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, 20, 9, 3, 6, -14, -35, 35, 18, -10, 7, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -47, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14};
    private static final int $$b = 95;
    private static int MediaBrowserCompatMediaItem = 0;
    private static int MediaMetadataCompat = 1;
    private static int RatingCompat = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$i(int r6, byte r7, short r8) {
        /*
            int r7 = r7 + 4
            int r6 = r6 * 2
            int r6 = 112 - r6
            byte[] r0 = kotlin.onTouch.$$c
            int r8 = r8 * 4
            int r1 = 1 - r8
            byte[] r1 = new byte[r1]
            r2 = 0
            int r8 = 0 - r8
            if (r0 != 0) goto L16
            r3 = r7
            r4 = r2
            goto L30
        L16:
            r3 = r2
        L17:
            r5 = r7
            r7 = r6
            r6 = r5
            byte r4 = (byte) r7
            r1[r3] = r4
            int r6 = r6 + 1
            if (r3 != r8) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L27:
            int r3 = r3 + 1
            r4 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L30:
            int r6 = r6 + r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.onTouch.$$i(int, byte, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(short r5, byte r6, int r7, java.lang.Object[] r8) {
        /*
            int r5 = 191 - r5
            int r7 = 114 - r7
            byte[] r0 = kotlin.onTouch.$$a
            int r1 = r6 + 4
            byte[] r1 = new byte[r1]
            int r6 = r6 + 3
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r6
            r4 = r2
            goto L24
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L22:
            r3 = r0[r5]
        L24:
            int r5 = r5 + 1
            int r7 = r7 + r3
            int r7 = r7 + (-1)
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.onTouch.c(short, byte, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void d(short r7, short r8, int r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 + 4
            int r9 = 114 - r9
            int r8 = 39 - r8
            byte[] r0 = kotlin.onTouch.$$g
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L11
            r3 = r9
            r5 = r2
            r9 = r7
            goto L29
        L11:
            r3 = r2
        L12:
            byte r4 = (byte) r9
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r8) goto L21
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L21:
            int r7 = r7 + 1
            r3 = r0[r7]
            r6 = r9
            r9 = r7
            r7 = r3
            r3 = r6
        L29:
            int r3 = r3 + r7
            int r7 = r3 + 2
            r3 = r5
            r6 = r9
            r9 = r7
            r7 = r6
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.onTouch.d(short, short, int, java.lang.Object[]):void");
    }

    /* JADX INFO: renamed from: o.onTouch$write, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lo/onTouch$write;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Lo/WorkAccountClient;", "p1", "Landroid/content/Intent;", "AudioAttributesCompatParcelizer", "(Landroid/content/Context;Lo/WorkAccountClient;)Landroid/content/Intent;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getMagicModuleMeta
        public static Intent AudioAttributesCompatParcelizer(Context p0, WorkAccountClient p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            Intent intent = new Intent(p0, (Class<?>) onTouch.class);
            p1.AudioAttributesCompatParcelizer(intent);
            return intent;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    private static void b(int i, short s, int i2, int i3, byte b, Object[] objArr) throws Throwable {
        int i4;
        int i5 = 2 % 2;
        buildResumeDownloadsIntent buildresumedownloadsintent = new buildResumeDownloadsIntent();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(AudioAttributesImplBaseParcelizer)};
            int i6 = 0;
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(559968424);
            if (objRemoteActionCompatParcelizer == null) {
                objRemoteActionCompatParcelizer = startForeground.read((char) KeyEvent.getDeadChar(0, 0), ((byte) KeyEvent.getModifierMetaStateMask()) + 24298, AndroidCharacter.getMirror('0') - '$', 1596568637, false, CmcdHeadersFactory.STREAM_TYPE_LIVE, new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
            int i7 = iIntValue == -1 ? 1 : 0;
            if (i7 != 0) {
                int i8 = $11;
                int i9 = i8 + 43;
                $10 = i9 % 128;
                int i10 = i9 % 2;
                byte[] bArr = AudioAttributesImplApi26Parcelizer;
                float f = BitmapDescriptorFactory.HUE_RED;
                if (bArr != null) {
                    int i11 = i8 + 11;
                    $10 = i11 % 128;
                    int i12 = i11 % 2;
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i13 = 0;
                    while (i13 < length) {
                        Object[] objArr3 = new Object[1];
                        objArr3[i6] = Integer.valueOf(bArr[i13]);
                        Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(28234468);
                        if (objRemoteActionCompatParcelizer2 == null) {
                            char cResolveSize = (char) View.resolveSize(i6, i6);
                            int mode = View.MeasureSpec.getMode(i6) + 3082;
                            int i14 = (TypedValue.complexToFraction(i6, f, f) > f ? 1 : (TypedValue.complexToFraction(i6, f, f) == f ? 0 : -1)) + 128;
                            byte b2 = (byte) i6;
                            byte b3 = (byte) (b2 - 1);
                            objRemoteActionCompatParcelizer2 = startForeground.read(cResolveSize, mode, i14, 2145850993, false, $$i(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE});
                        }
                        bArr2[i13] = ((Byte) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).byteValue();
                        i13++;
                        i6 = 0;
                        f = BitmapDescriptorFactory.HUE_RED;
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    int i15 = $10 + 21;
                    $11 = i15 % 128;
                    if (i15 % 2 == 0) {
                        byte[] bArr3 = AudioAttributesImplApi26Parcelizer;
                        Object[] objArr4 = {Integer.valueOf(i3), Integer.valueOf(IconCompatParcelizer)};
                        Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(559968424);
                        if (objRemoteActionCompatParcelizer3 == null) {
                            objRemoteActionCompatParcelizer3 = startForeground.read((char) (ViewConfiguration.getPressedStateDuration() >> 16), 24297 - KeyEvent.getDeadChar(0, 0), Gravity.getAbsoluteGravity(0, 0) + 12, 1596568637, false, CmcdHeadersFactory.STREAM_TYPE_LIVE, new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        i4 = ((byte) (((long) bArr3[((Integer) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).intValue()]) / 7899112766888837815L)) >> ((int) (((long) AudioAttributesImplBaseParcelizer) - 7899112766888837815L));
                    } else {
                        byte[] bArr4 = AudioAttributesImplApi26Parcelizer;
                        Object[] objArr5 = {Integer.valueOf(i3), Integer.valueOf(IconCompatParcelizer)};
                        Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(559968424);
                        if (objRemoteActionCompatParcelizer4 == null) {
                            objRemoteActionCompatParcelizer4 = startForeground.read((char) TextUtils.getOffsetAfter("", 0), View.MeasureSpec.getMode(0) + 24297, (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 12, 1596568637, false, CmcdHeadersFactory.STREAM_TYPE_LIVE, new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        i4 = ((byte) (((long) bArr4[((Integer) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).intValue()]) ^ 7899112766888837815L)) + ((int) (((long) AudioAttributesImplBaseParcelizer) ^ 7899112766888837815L));
                    }
                    iIntValue = (byte) i4;
                } else {
                    iIntValue = (short) (((short) (((long) AudioAttributesImplApi21Parcelizer[i3 + ((int) (((long) IconCompatParcelizer) ^ 7899112766888837815L))]) ^ 7899112766888837815L)) + ((int) (((long) AudioAttributesImplBaseParcelizer) ^ 7899112766888837815L)));
                }
            }
            if (iIntValue > 0) {
                int i16 = $10 + 91;
                $11 = i16 % 128;
                int i17 = i16 % 2;
                buildresumedownloadsintent.read = ((i3 + iIntValue) - 2) + ((int) (((long) IconCompatParcelizer) ^ 7899112766888837815L)) + i7;
                Object[] objArr6 = {buildresumedownloadsintent, Integer.valueOf(i2), Integer.valueOf(MediaBrowserCompatItemReceiver), sb};
                Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(107629512);
                if (objRemoteActionCompatParcelizer5 == null) {
                    objRemoteActionCompatParcelizer5 = startForeground.read((char) (34134 - Color.green(0)), 13431 - TextUtils.lastIndexOf("", '0', 0, 0), (-16777195) - Color.rgb(0, 0, 0), 2015596381, false, "t", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objRemoteActionCompatParcelizer5).invoke(null, objArr6)).append(buildresumedownloadsintent.IconCompatParcelizer);
                buildresumedownloadsintent.RemoteActionCompatParcelizer = buildresumedownloadsintent.IconCompatParcelizer;
                byte[] bArr5 = AudioAttributesImplApi26Parcelizer;
                if (bArr5 != null) {
                    int length2 = bArr5.length;
                    byte[] bArr6 = new byte[length2];
                    for (int i18 = 0; i18 < length2; i18++) {
                        bArr6[i18] = (byte) (((long) bArr5[i18]) ^ 7899112766888837815L);
                    }
                    bArr5 = bArr6;
                }
                boolean z = bArr5 != null;
                buildresumedownloadsintent.AudioAttributesCompatParcelizer = 1;
                while (buildresumedownloadsintent.AudioAttributesCompatParcelizer < iIntValue) {
                    if (!(!z)) {
                        int i19 = $10 + 69;
                        $11 = i19 % 128;
                        int i20 = i19 % 2;
                        byte[] bArr7 = AudioAttributesImplApi26Parcelizer;
                        buildresumedownloadsintent.read = buildresumedownloadsintent.read - 1;
                        buildresumedownloadsintent.IconCompatParcelizer = (char) (buildresumedownloadsintent.RemoteActionCompatParcelizer + (((byte) (((byte) (((long) bArr7[r6]) ^ 7899112766888837815L)) + s)) ^ b));
                    } else {
                        short[] sArr = AudioAttributesImplApi21Parcelizer;
                        buildresumedownloadsintent.read = buildresumedownloadsintent.read - 1;
                        buildresumedownloadsintent.IconCompatParcelizer = (char) (buildresumedownloadsintent.RemoteActionCompatParcelizer + (((short) (((short) (((long) sArr[r6]) ^ 7899112766888837815L)) + s)) ^ b));
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

    /* JADX WARN: Removed duplicated region for block: B:11:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x012d  */
    @Override // kotlin.TouchTrackerListener, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(android.os.Bundle r35) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 3062
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.onTouch.onCreate(android.os.Bundle):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(int r33, char[] r34, byte r35, java.lang.Object[] r36) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 782
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.onTouch.a(int, char[], byte, java.lang.Object[]):void");
    }

    @Override // kotlin.TouchTrackerListener, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onResume() throws Throwable {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 93;
        MediaBrowserCompatMediaItem = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            getBaseContext();
            obj.hashCode();
            throw null;
        }
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            int i3 = MediaMetadataCompat + 69;
            MediaBrowserCompatMediaItem = i3 % 128;
            int i4 = i3 % 2;
            Object[] objArr = new Object[1];
            a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).length() + 22, new char[]{' ', 21, ' ', ',', 15, 24, 31, '\t', 29, 14, 17, '\b', '-', 1, '$', 26, '+', 29, '%', '/', ' ', '&', '*', 25, 29, 31}, (byte) (44 - ExpandableListView.getPackedPositionType(0L)), objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 17, new char[]{4, 2, 13844, 13844, 22, 26, '$', '/', 13846, 13846, 24, 23, 0, 31, '$', 26, 18, 24}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 9), objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            int i5 = MediaMetadataCompat + 117;
            MediaBrowserCompatMediaItem = i5 % 128;
            if (i5 % 2 != 0) {
                boolean z = baseContext instanceof ContextWrapper;
                throw null;
            }
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            try {
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 4534), 6054 - Drawable.resolveOpacity(0, 0), 42 - TextUtils.indexOf("", "", 0), -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(823471051);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) Color.argb(0, 0, 0, 0), 6031 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (ViewConfiguration.getWindowTouchSlop() >> 8) + 24, 1331490654, false, "RemoteActionCompatParcelizer", new Class[]{Context.class});
                }
                ((Method) objRemoteActionCompatParcelizer2).invoke(objInvoke, objArr3);
                int i6 = MediaMetadataCompat + 21;
                MediaBrowserCompatMediaItem = i6 % 128;
                int i7 = i6 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        super.onResume();
    }

    @Override // kotlin.TouchTrackerListener, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onPause() throws Throwable {
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            a((ViewConfiguration.getScrollBarSize() >> 8) + 26, new char[]{' ', 21, ' ', ',', 15, 24, 31, '\t', 29, 14, 17, '\b', '-', 1, '$', 26, '+', 29, '%', '/', ' ', '&', '*', 25, 29, 31}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 34), objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(6) - 96, new char[]{4, 2, 13844, 13844, 22, 26, '$', '/', 13846, 13846, 24, 23, 0, 31, '$', 26, 18, 24}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 9), objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            int i2 = MediaBrowserCompatMediaItem + 11;
            MediaMetadataCompat = i2 % 128;
            int i3 = i2 % 2;
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            int i4 = MediaBrowserCompatMediaItem + 103;
            MediaMetadataCompat = i4 % 128;
            int i5 = i4 % 2;
            try {
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (4535 - (ViewConfiguration.getLongPressTimeout() >> 16)), 6054 - Color.alpha(0), 41 - TextUtils.lastIndexOf("", '0', 0), -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1293416902);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) View.MeasureSpec.getSize(0), 6078 - AndroidCharacter.getMirror('0'), 24 - ExpandableListView.getPackedPositionGroup(0L), -861814097, false, "read", new Class[]{Context.class});
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
        super.onPause();
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x0b28 A[Catch: all -> 0x0497, TryCatch #12 {all -> 0x0497, blocks: (B:202:0x1337, B:204:0x133d, B:205:0x136c, B:238:0x1920, B:240:0x1926, B:241:0x1951, B:219:0x15b6, B:221:0x15d9, B:222:0x162b, B:169:0x0dd3, B:171:0x0dd9, B:172:0x0e02, B:125:0x0b22, B:127:0x0b28, B:128:0x0b51, B:19:0x014c, B:21:0x0152, B:22:0x017f, B:24:0x0406, B:26:0x0437, B:27:0x0491), top: B:286:0x014c }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0111  */
    @Override // kotlin.TouchTrackerListener, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void attachBaseContext(android.content.Context r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 6940
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.onTouch.attachBaseContext(android.content.Context):void");
    }

    static {
        MediaBrowserCompatCustomActionResultReceiver = 0;
        AudioAttributesImplBaseParcelizer();
        INSTANCE = new Companion(null);
        int i = RatingCompat + 93;
        MediaBrowserCompatCustomActionResultReceiver = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // kotlin.TouchTrackerListener, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onStart() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 85;
        MediaBrowserCompatMediaItem = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = MediaMetadataCompat + 63;
        MediaBrowserCompatMediaItem = i4 % 128;
        int i5 = i4 % 2;
    }

    static void AudioAttributesImplBaseParcelizer() {
        AudioAttributesCompatParcelizer = new char[]{6431, 6493, 6479, 6475, 6425, 6491, 6404, 6427, 6507, 6474, 6406, 6402, 6410, 6401, 6478, 6488, 6417, 6471, 6424, 6428, 6520, 6477, 6465, 6468, 6411, 6470, 6400, 6496, 6473, 6426, 6476, 6524, 6489, 6430, 6418, 6409, 6494, 6429, 6416, 6464, 6492, 6405, 6408, 6505, 6481, 6403, 6490, 6407, 6469};
        RemoteActionCompatParcelizer = (char) 11445;
        IconCompatParcelizer = 743270823;
        AudioAttributesImplBaseParcelizer = -819363093;
        MediaBrowserCompatItemReceiver = -1762910627;
        AudioAttributesImplApi26Parcelizer = new byte[]{30, 36, -53, 3, -45, 99, 121, -85, -121, -123, 122, -128, 73, -85, TarConstants.LF_GNUTYPE_SPARSE, 121, -121, 123, -87, -126, TarConstants.LF_GNUTYPE_LONGLINK, -77, TarConstants.LF_PAX_EXTENDED_HEADER_LC, -121, TarConstants.LF_PAX_EXTENDED_HEADER_LC, 84, -85, 72, -88, 121, 85, -121, -76, -123, TarConstants.LF_GNUTYPE_LONGLINK, TarConstants.LF_PAX_EXTENDED_HEADER_LC, -77, 125, 87, TarConstants.LF_PAX_EXTENDED_HEADER_LC, -121, -86, -128, 123, -124, 84, -121, 123, -121, 123, -80, 125, 84, TarConstants.LF_GNUTYPE_SPARSE, -5, 6, -8, 45, -44, 42, -56, TarConstants.LF_CONTIG, -55, 4, -4, 41, 2, -5, -42, 45, -56, 7, TarConstants.LF_FIFO, -54, TarConstants.LF_SYMLINK, -54, -8, TarConstants.LF_SYMLINK, -54, TarConstants.LF_CONTIG, -3, 5, -41, 47, -44, 5, -2, 2, -6, 3, 44, 6, -43, -2, 6, -5, 6, -8, TarConstants.LF_FIFO, -8, -48, 45, -7, -6, -48, -2, 5, 40, -7, -43, 44, -56, -8, TarConstants.LF_BLK, -6, -55, TarConstants.LF_FIFO, 29, TarConstants.LF_PAX_EXTENDED_HEADER_UC, -90, 95, 95, -87, 3, -67, 68, -76, 79, -109, -112, 114, TarConstants.LF_GNUTYPE_LONGNAME, -72, 64, -117, TarConstants.LF_PAX_EXTENDED_HEADER_LC, 94, -96, 66, 13, 101, -103, 110, 68, -69, 101, -100, 108, -105, TarConstants.LF_GNUTYPE_LONGLINK, 72, -42, 105, 44, -89, -106, -105, -112, 99, -101, 96, 4, -124, TarConstants.LF_PAX_EXTENDED_HEADER_LC, -119, 116, 119, -128, 111, -110, -125, -114, 127, 115, -119, 123, 24, -124, 122, TarConstants.LF_PAX_EXTENDED_HEADER_LC, -121, -126, 121, -126, 124, -125, 127};
    }
}
