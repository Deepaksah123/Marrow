package kotlin;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Method;
import kotlin.Metadata;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0003R\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0016\u001a\u00020\u00158CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0019"}, d2 = {"Lo/zbi;", "Lo/argCount;", "<init>", "()V", "Landroid/os/Bundle;", "p0", "", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "p1", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onDestroyView", "", "RemoteActionCompatParcelizer", "Ljava/lang/String;", "AudioAttributesCompatParcelizer", "Lo/SegmentBaseSingleSegmentBase;", "IconCompatParcelizer", "Lo/SegmentBaseSingleSegmentBase;", "write", "()Lo/SegmentBaseSingleSegmentBase;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class zbi extends argCount {
    private static byte[] AudioAttributesImplApi26Parcelizer;
    private static int AudioAttributesImplBaseParcelizer;
    private static int MediaBrowserCompatCustomActionResultReceiver;
    private static short[] MediaBrowserCompatItemReceiver;
    private static int MediaBrowserCompatMediaItem;
    private static int read;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private String AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private SegmentBaseSingleSegmentBase write;
    private String RemoteActionCompatParcelizer;
    private static final byte[] $$c = {69, 85, TarConstants.LF_DIR, TarConstants.LF_LINK};
    private static final int $$f = 249;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {104, 100, TarConstants.LF_GNUTYPE_SPARSE, -75, -58, 44, 40, -12, 26, 8, 5, -39, 58, -14, 9, 18, 11, -4, 13, 6, -26, 27, 22, 7, -4, 20, 26, 15, 9, 12, -8, -29, 41, 24, -4, 13, 6, -36, TarConstants.LF_CHR, 5, 10, -8, 26, -29, 24, 24, -8, 9, 14, 4, 24, -14, 20};
    private static final int $$e = 10;
    private static final byte[] $$a = {TarConstants.LF_FIFO, -78, 96, -9, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, TarConstants.LF_NORMAL, -51, 1, -2, 4, 1, 43, -35, -18, 10, -7, 0, 27, -20, -15, -3, 8, -9, 33, -20, 1, -3, -5, -14, 16, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, 0, -32, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, -5, -27, -18, -18, 14, -3, -8, 2, -18, 20, -14};
    private static final int $$b = 140;
    private static int MediaBrowserCompatSearchResultReceiver = 1;
    private static int AudioAttributesImplApi21Parcelizer = 0;
    private static int RatingCompat = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$g(byte r5, short r6, int r7) {
        /*
            byte[] r0 = kotlin.zbi.$$c
            int r5 = r5 * 4
            int r5 = r5 + 4
            int r6 = r6 * 3
            int r6 = r6 + 112
            int r7 = r7 * 2
            int r1 = r7 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r7
            r4 = r2
            goto L26
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L24:
            r3 = r0[r5]
        L26:
            int r6 = r6 + r3
            int r5 = r5 + 1
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.zbi.$$g(byte, short, int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(int r7, byte r8, byte r9, java.lang.Object[] r10) {
        /*
            int r8 = 79 - r8
            int r9 = r9 * 12
            int r9 = 77 - r9
            int r7 = r7 * 10
            int r7 = 44 - r7
            byte[] r0 = kotlin.zbi.$$a
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r9
            r4 = r2
            r9 = r8
            goto L2d
        L15:
            r3 = r2
        L16:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            int r8 = r8 + 1
            if (r4 != r7) goto L27
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L27:
            r3 = r0[r8]
            r6 = r9
            r9 = r8
            r8 = r3
            r3 = r6
        L2d:
            int r8 = -r8
            int r3 = r3 + r8
            int r8 = r3 + (-1)
            r3 = r4
            r6 = r9
            r9 = r8
            r8 = r6
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.zbi.a(int, byte, byte, java.lang.Object[]):void");
    }

    private static void c(byte b, int i, short s, Object[] objArr) {
        int i2 = i * 5;
        int i3 = 111 - (s * 29);
        byte[] bArr = $$d;
        int i4 = 25 - (b * 22);
        byte[] bArr2 = new byte[28 - i2];
        int i5 = 27 - i2;
        int i6 = -1;
        if (bArr == null) {
            i3 = (i5 + i3) - 7;
        }
        while (true) {
            i4++;
            i6++;
            bArr2[i6] = (byte) i3;
            if (i6 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i3 = (i3 + bArr[i4]) - 7;
        }
    }

    private final SegmentBaseSingleSegmentBase AudioAttributesCompatParcelizer() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi21Parcelizer + 35;
        RatingCompat = i2 % 128;
        int i3 = i2 % 2;
        SegmentBaseSingleSegmentBase segmentBaseSingleSegmentBase = this.write;
        toMagicModuleMetaRepoModel.write(segmentBaseSingleSegmentBase);
        if (i3 != 0) {
            return segmentBaseSingleSegmentBase;
        }
        throw null;
    }

    /* JADX INFO: renamed from: o.zbi$write, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lo/zbi$write;", "", "<init>", "()V", "", "p0", "p1", "Lo/zbi;", "RemoteActionCompatParcelizer", "(Ljava/lang/String;Ljava/lang/String;)Lo/zbi;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getMagicModuleMeta
        public static zbi RemoteActionCompatParcelizer(String p0, String p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            zbi zbiVar = new zbi();
            Bundle bundle = new Bundle();
            bundle.putString("titleKey", p0);
            bundle.putString("warningKey", p1);
            zbiVar.setArguments(bundle);
            return zbiVar;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0469  */
    @Override // kotlin.argCount, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(android.os.Bundle r33) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1193
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.zbi.onCreate(android.os.Bundle):void");
    }

    private static final void AudioAttributesCompatParcelizer(zbi zbiVar) {
        zbi zbiVar2;
        Bundle bundleWrite;
        int i = 2 % 2;
        int i2 = RatingCompat + 77;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        if (i2 % 2 != 0) {
            zbiVar2 = zbiVar;
            Pair[] pairArr = new Pair[1];
            pairArr[1] = setAction.write("positive_key_press", Boolean.TRUE);
            bundleWrite = _getIndexResolver.write(pairArr);
        } else {
            zbiVar2 = zbiVar;
            bundleWrite = _getIndexResolver.write(setAction.write("positive_key_press", Boolean.TRUE));
        }
        withAlwaysAsId.read(zbiVar2, "kyc_failed_dialog_key", bundleWrite);
        zbiVar.dismiss();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        int i = 2 % 2;
        toMagicModuleMetaRepoModel.write(p0, "");
        this.write = SegmentBaseSingleSegmentBase.read(p0, p1);
        TextView textView = AudioAttributesCompatParcelizer().read;
        String str = this.RemoteActionCompatParcelizer;
        String str2 = null;
        if (str == null) {
            int i2 = AudioAttributesImplApi21Parcelizer + 73;
            RatingCompat = i2 % 128;
            int i3 = i2 % 2;
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            str = null;
        }
        textView.setText(str);
        TextView textView2 = AudioAttributesCompatParcelizer().read;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView2, "");
        TextView textView3 = textView2;
        String str3 = this.RemoteActionCompatParcelizer;
        if (str3 == null) {
            int i4 = AudioAttributesImplApi21Parcelizer + 101;
            RatingCompat = i4 % 128;
            int i5 = i4 % 2;
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            str3 = null;
        }
        int i6 = 0;
        textView3.setVisibility((str3.length() <= 0) ^ true ? 0 : 8);
        TextView textView4 = AudioAttributesCompatParcelizer().RemoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView4, "");
        TextView textView5 = textView4;
        String str4 = this.AudioAttributesCompatParcelizer;
        if (str4 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            str4 = null;
        }
        if (str4.length() > 0) {
            int i7 = AudioAttributesImplApi21Parcelizer + 71;
            int i8 = i7 % 128;
            RatingCompat = i8;
            int i9 = i7 % 2;
            int i10 = i8 + 89;
            AudioAttributesImplApi21Parcelizer = i10 % 128;
            int i11 = i10 % 2;
        } else {
            i6 = 8;
        }
        textView5.setVisibility(i6);
        TextView textView6 = AudioAttributesCompatParcelizer().RemoteActionCompatParcelizer;
        String str5 = this.AudioAttributesCompatParcelizer;
        if (str5 == null) {
            int i12 = RatingCompat + 123;
            AudioAttributesImplApi21Parcelizer = i12 % 128;
            int i13 = i12 % 2;
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            str2 = str5;
        }
        textView6.setText(str2);
        AudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer.setOnClickListener(new View.OnClickListener() { // from class: o.zbk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                zbi.write(this.read);
            }
        });
        ScrollView scrollViewIconCompatParcelizer = AudioAttributesCompatParcelizer().IconCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(scrollViewIconCompatParcelizer, "");
        return scrollViewIconCompatParcelizer;
    }

    @Override // kotlin.argCount, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int i = 2 % 2;
        int i2 = RatingCompat + 115;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            super.onDestroyView();
            this.write = null;
        } else {
            super.onDestroyView();
            this.write = null;
            obj.hashCode();
            throw null;
        }
    }

    private static void b(byte b, int i, int i2, short s, int i3, Object[] objArr) throws Throwable {
        long j;
        char c;
        int i4;
        int i5 = 2 % 2;
        buildResumeDownloadsIntent buildresumedownloadsintent = new buildResumeDownloadsIntent();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(MediaBrowserCompatCustomActionResultReceiver)};
            int i6 = 0;
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(559968424);
            long j2 = 0;
            if (objRemoteActionCompatParcelizer == null) {
                objRemoteActionCompatParcelizer = startForeground.read((char) (AndroidCharacter.getMirror('0') - '0'), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 24296, 12 - (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 1596568637, false, CmcdHeadersFactory.STREAM_TYPE_LIVE, new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
            int i7 = iIntValue == -1 ? 1 : 0;
            if (i7 != 0) {
                int i8 = $11 + 113;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                byte[] bArr = AudioAttributesImplApi26Parcelizer;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i10 = 0;
                    while (i10 < length) {
                        Object[] objArr3 = new Object[1];
                        objArr3[i6] = Integer.valueOf(bArr[i10]);
                        Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(28234468);
                        if (objRemoteActionCompatParcelizer2 == null) {
                            byte b2 = (byte) i6;
                            byte b3 = b2;
                            objRemoteActionCompatParcelizer2 = startForeground.read((char) ((SystemClock.uptimeMillis() > j2 ? 1 : (SystemClock.uptimeMillis() == j2 ? 0 : -1)) - 1), 3081 - MotionEvent.axisFromString(""), TextUtils.getTrimmedLength("") + 128, 2145850993, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        bArr2[i10] = ((Byte) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).byteValue();
                        i10++;
                        i6 = 0;
                        j2 = 0;
                    }
                    bArr = bArr2;
                }
                if (bArr == null) {
                    j = 7899112766888837815L;
                    iIntValue = (short) (((short) (((long) MediaBrowserCompatItemReceiver[i2 + ((int) (((long) read) ^ 7899112766888837815L))]) ^ 7899112766888837815L)) + ((int) (((long) MediaBrowserCompatCustomActionResultReceiver) ^ 7899112766888837815L)));
                } else {
                    int i11 = $10 + 105;
                    $11 = i11 % 128;
                    if (i11 % 2 == 0) {
                        byte[] bArr3 = AudioAttributesImplApi26Parcelizer;
                        Object[] objArr4 = {Integer.valueOf(i2), Integer.valueOf(read)};
                        Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(559968424);
                        if (objRemoteActionCompatParcelizer3 == null) {
                            objRemoteActionCompatParcelizer3 = startForeground.read((char) TextUtils.getOffsetBefore("", 0), TextUtils.getTrimmedLength("") + 24297, Color.alpha(0) + 12, 1596568637, false, CmcdHeadersFactory.STREAM_TYPE_LIVE, new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        i4 = ((byte) (((long) bArr3[((Integer) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).intValue()]) % 7899112766888837815L)) >> ((int) (((long) MediaBrowserCompatCustomActionResultReceiver) % 7899112766888837815L));
                    } else {
                        byte[] bArr4 = AudioAttributesImplApi26Parcelizer;
                        Object[] objArr5 = {Integer.valueOf(i2), Integer.valueOf(read)};
                        Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(559968424);
                        if (objRemoteActionCompatParcelizer4 == null) {
                            objRemoteActionCompatParcelizer4 = startForeground.read((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 24298, ExpandableListView.getPackedPositionChild(0L) + 13, 1596568637, false, CmcdHeadersFactory.STREAM_TYPE_LIVE, new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        i4 = ((byte) (((long) bArr4[((Integer) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).intValue()]) ^ 7899112766888837815L)) + ((int) (((long) MediaBrowserCompatCustomActionResultReceiver) ^ 7899112766888837815L));
                    }
                    iIntValue = (byte) i4;
                    j = 7899112766888837815L;
                }
            } else {
                j = 7899112766888837815L;
            }
            if (iIntValue > 0) {
                buildresumedownloadsintent.read = ((i2 + iIntValue) - 2) + ((int) (((long) read) ^ j)) + i7;
                Object[] objArr6 = {buildresumedownloadsintent, Integer.valueOf(i), Integer.valueOf(AudioAttributesImplBaseParcelizer), sb};
                Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(107629512);
                if (objRemoteActionCompatParcelizer5 == null) {
                    objRemoteActionCompatParcelizer5 = startForeground.read((char) (34134 - TextUtils.getOffsetAfter("", 0)), View.resolveSizeAndState(0, 0, 0) + 13432, TextUtils.lastIndexOf("", '0', 0) + 22, 2015596381, false, "t", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objRemoteActionCompatParcelizer5).invoke(null, objArr6)).append(buildresumedownloadsintent.IconCompatParcelizer);
                buildresumedownloadsintent.RemoteActionCompatParcelizer = buildresumedownloadsintent.IconCompatParcelizer;
                byte[] bArr5 = AudioAttributesImplApi26Parcelizer;
                if (bArr5 != null) {
                    int length2 = bArr5.length;
                    byte[] bArr6 = new byte[length2];
                    for (int i12 = 0; i12 < length2; i12++) {
                        bArr6[i12] = (byte) (((long) bArr5[i12]) ^ 7899112766888837815L);
                    }
                    bArr5 = bArr6;
                }
                boolean z = bArr5 != null;
                buildresumedownloadsintent.AudioAttributesCompatParcelizer = 1;
                while (buildresumedownloadsintent.AudioAttributesCompatParcelizer < iIntValue) {
                    if (z) {
                        int i13 = $10 + 117;
                        $11 = i13 % 128;
                        if (i13 % 2 == 0) {
                            byte[] bArr7 = AudioAttributesImplApi26Parcelizer;
                            buildresumedownloadsintent.read = buildresumedownloadsintent.read % 0;
                            c = (char) (buildresumedownloadsintent.RemoteActionCompatParcelizer >>> (((byte) (((byte) (((long) bArr7[r3]) * 7899112766888837815L)) / s)) ^ b));
                        } else {
                            byte[] bArr8 = AudioAttributesImplApi26Parcelizer;
                            buildresumedownloadsintent.read = buildresumedownloadsintent.read - 1;
                            c = (char) (buildresumedownloadsintent.RemoteActionCompatParcelizer + (((byte) (((byte) (((long) bArr8[r3]) ^ 7899112766888837815L)) + s)) ^ b));
                        }
                        buildresumedownloadsintent.IconCompatParcelizer = c;
                    } else {
                        short[] sArr = MediaBrowserCompatItemReceiver;
                        buildresumedownloadsintent.read = buildresumedownloadsintent.read - 1;
                        buildresumedownloadsintent.IconCompatParcelizer = (char) (buildresumedownloadsintent.RemoteActionCompatParcelizer + (((short) (((short) (((long) sArr[r3]) ^ 7899112766888837815L)) + s)) ^ b));
                    }
                    sb.append(buildresumedownloadsintent.IconCompatParcelizer);
                    buildresumedownloadsintent.RemoteActionCompatParcelizer = buildresumedownloadsintent.IconCompatParcelizer;
                    buildresumedownloadsintent.AudioAttributesCompatParcelizer++;
                    int i14 = $10 + 3;
                    $11 = i14 % 128;
                    int i15 = i14 % 2;
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

    public static /* synthetic */ void write(zbi zbiVar) {
        int i = 2 % 2;
        int i2 = RatingCompat + 91;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        AudioAttributesCompatParcelizer(zbiVar);
        if (i3 != 0) {
            throw null;
        }
    }

    static {
        MediaBrowserCompatMediaItem = 0;
        IconCompatParcelizer();
        INSTANCE = new Companion(null);
        int i = MediaBrowserCompatSearchResultReceiver + 45;
        MediaBrowserCompatMediaItem = i % 128;
        if (i % 2 != 0) {
            int i2 = 10 / 0;
        }
    }

    static void IconCompatParcelizer() {
        read = 424911737;
        MediaBrowserCompatCustomActionResultReceiver = -819363180;
        AudioAttributesImplBaseParcelizer = 861145263;
        AudioAttributesImplApi26Parcelizer = new byte[]{59, -62, TarConstants.LF_SYMLINK, -55, 21, 22, -12, -54, 62, -58, 13, -2, -40, 38, -60, 106, -98, 71, -80, -98, 121, 114, -92, 110, 96, -98, 109, 98, 106, -112, -33, 35, -44, -2, 1, -33, 38, -42, 45, -15, -14, 108, -45, -106, 29, 44, 45, 42, -39, 33, -38, 66, -66, 79, -78, -79, 70, -87, 84, 69, 72, -71, -75, 79, -67, -73, -73, -73, -73};
    }
}
