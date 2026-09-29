package kotlin;

import android.graphics.Color;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ScrollView;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import java.lang.reflect.Method;
import kotlin.Metadata;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u0003J\u0019\u0010\u0012\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\bJ\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\bR\u0016\u0010\u0010\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0016R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00198CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c"}, d2 = {"Lo/zbm;", "Lo/argCount;", "<init>", "()V", "Landroid/os/Bundle;", "p0", "", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "p1", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "read", "onDestroyView", "onViewStateRestored", "onSaveInstanceState", "", "RemoteActionCompatParcelizer", "Z", "AudioAttributesCompatParcelizer", "write", "Lo/parseTemplate;", "Lo/parseTemplate;", "IconCompatParcelizer", "()Lo/parseTemplate;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class zbm extends argCount {
    private static byte[] AudioAttributesImplApi21Parcelizer;
    private static int AudioAttributesImplApi26Parcelizer;
    private static short[] AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static int MediaBrowserCompatCustomActionResultReceiver;
    private static int MediaBrowserCompatItemReceiver;
    private static int MediaBrowserCompatMediaItem;

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private boolean write;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private boolean read;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private boolean AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private parseTemplate RemoteActionCompatParcelizer;
    private static final byte[] $$c = {67, -110, -113, 74};
    private static final int $$f = 133;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {25, 68, TarConstants.LF_LINK, 97, TarConstants.LF_FIFO, -68, -9, -26, 21, -38, -16, 8, -22, 31, -62, 4, -11, -10, -24, 2, -10, 21, -60, -8, 6, -30, 0, -17, -10, 14, -41, 68, -40, -63, 6, -16, -17, 35, -62, -11, -9, -2, -4, -30, -10, 4, -25, 37, -55, -9, -14, 4, -30, 25, -28, -28, 4, -13, -18, -8, -28, 10, -24, 2, -7, -14, -30, -19, -13, -16, 4, 25, -45, -28, 0, -17, -10, 32, -55, -9, -14, 4, -30, 25, -28, -28, 4, -13, -18, -8, -28, 10, -24};
    private static final int $$e = 122;
    private static final byte[] $$a = {16, -101, -28, -55, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -48, TarConstants.LF_CHR, -1, 2, -4, -1, -43, 35, 18, -10, 7, 0, -27, 20, 15, 3, -8, 9, -33, 20, -1, 3, 5, 14, -16, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 0, 32, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 5, 27, 18, 18, -14, 3, 8, -2, 18, -20, 14};
    private static final int $$b = 96;
    private static int MediaMetadataCompat = 0;
    private static int MediaDescriptionCompat = 0;
    private static int RatingCompat = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$g(byte r7, short r8, byte r9) {
        /*
            int r9 = r9 * 4
            int r9 = r9 + 112
            int r7 = r7 + 4
            byte[] r0 = kotlin.zbm.$$c
            int r8 = r8 * 2
            int r8 = 1 - r8
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L15
            r9 = r7
            r3 = r8
            r4 = r2
            goto L2b
        L15:
            r3 = r2
        L16:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            int r7 = r7 + 1
            if (r4 != r8) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L25:
            r3 = r0[r7]
            r6 = r9
            r9 = r7
            r7 = r3
            r3 = r6
        L2b:
            int r7 = r7 + r3
            r3 = r4
            r6 = r9
            r9 = r7
            r7 = r6
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.zbm.$$g(byte, short, byte):java.lang.String");
    }

    public static /* synthetic */ Object IconCompatParcelizer(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i2;
        int i8 = i3 | i7;
        int i9 = (~(i | i2)) | i3;
        int i10 = ~i;
        int i11 = (~(i2 | i | i3)) | (~(i7 | i10)) | (~((~i3) | i10));
        int i12 = i + i3 + i6 + (1609234610 * i5) + (1307081305 * i4);
        int i13 = i12 * i12;
        int i14 = (((-490261092) * i) - 1772093440) + (1576585830 * i3) + (i8 * 1033423461) + ((-2066846922) * i9) + (1033423461 * i11) + (543162368 * i6) + ((-2101346304) * i5) + (23068672 * i4) + ((-2103967744) * i13);
        int i15 = (i * 273352028) + 245730370 + (i3 * 273352646) + (i8 * 309) + (i9 * (-618)) + (i11 * 309) + (i6 * 273352337) + (i5 * (-770635566)) + (i4 * (-73506199)) + (i13 * (-2011693056));
        int i16 = i14 + (i15 * i15 * 1080557568);
        return i16 != 1 ? i16 != 2 ? IconCompatParcelizer(objArr) : write(objArr) : AudioAttributesCompatParcelizer(objArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(byte r5, short r6, short r7, java.lang.Object[] r8) {
        /*
            int r7 = r7 * 10
            int r0 = 44 - r7
            int r6 = r6 * 12
            int r6 = r6 + 65
            byte[] r1 = kotlin.zbm.$$a
            int r5 = 80 - r5
            byte[] r0 = new byte[r0]
            int r7 = 43 - r7
            r2 = 0
            if (r1 != 0) goto L16
            r3 = r5
            r4 = r2
            goto L28
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L26
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L26:
            r3 = r1[r5]
        L28:
            int r5 = r5 + 1
            int r6 = r6 + r3
            int r6 = r6 + (-1)
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.zbm.a(byte, short, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(byte r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 8
            int r0 = 60 - r7
            int r8 = r8 + 4
            byte[] r1 = kotlin.zbm.$$d
            int r6 = 114 - r6
            byte[] r0 = new byte[r0]
            int r7 = 59 - r7
            r2 = 0
            if (r1 != 0) goto L15
            r4 = r7
            r6 = r8
            r3 = r2
            goto L2d
        L15:
            r3 = r2
        L16:
            r5 = r8
            r8 = r6
            r6 = r5
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r7) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L26:
            int r3 = r3 + 1
            r4 = r1[r6]
            r5 = r8
            r8 = r6
            r6 = r5
        L2d:
            int r8 = r8 + 1
            int r4 = -r4
            int r6 = r6 + r4
            int r6 = r6 + (-11)
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.zbm.c(byte, byte, byte, java.lang.Object[]):void");
    }

    private static /* synthetic */ Object AudioAttributesCompatParcelizer(Object[] objArr) {
        zbm zbmVar = (zbm) objArr[0];
        int i = 2 % 2;
        int i2 = RatingCompat + 79;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        parseTemplate parsetemplate = zbmVar.RemoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.write(parsetemplate);
        int i4 = RatingCompat + 21;
        MediaDescriptionCompat = i4 % 128;
        if (i4 % 2 == 0) {
            return parsetemplate;
        }
        throw null;
    }

    /* JADX INFO: renamed from: o.zbm$IconCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u0005H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/marrow2/ui/dialogs/LegalDialogFragment$Companion;", "", "<init>", "()V", "REQUEST_KEY", "", "POSITIVE_KEY_PRESS", "newInstance", "Lcom/marrow2/ui/dialogs/LegalDialogFragment;", "title", "warningMessage", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        @getMagicModuleMeta
        public static zbm IconCompatParcelizer(String str, String str2) {
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            zbm zbmVar = new zbm();
            Bundle bundle = new Bundle();
            bundle.putString("titleKey", str);
            bundle.putString("warningKey", str2);
            zbmVar.setArguments(bundle);
            return zbmVar;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0113  */
    @Override // kotlin.argCount, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(android.os.Bundle r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1168
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.zbm.onCreate(android.os.Bundle):void");
    }

    private static final void AudioAttributesImplApi26Parcelizer(zbm zbmVar) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 117;
        RatingCompat = i2 % 128;
        int i3 = i2 % 2;
        zbmVar.read = !zbmVar.read;
        int i4 = SideSheetBehavior.read();
        int i5 = SideSheetBehavior.read();
        ((parseTemplate) IconCompatParcelizer(-2139656521, i4, 2139656522, SideSheetBehavior.read(), SideSheetBehavior.read(), i5, new Object[]{zbmVar})).RemoteActionCompatParcelizer.setChecked(zbmVar.read);
        int i6 = SideSheetBehavior.read();
        int i7 = SideSheetBehavior.read();
        IconCompatParcelizer(-660749254, i6, 660749254, SideSheetBehavior.read(), SideSheetBehavior.read(), i7, new Object[]{zbmVar});
        int i8 = MediaDescriptionCompat + 79;
        RatingCompat = i8 % 128;
        if (i8 % 2 == 0) {
            throw null;
        }
    }

    private static final void AudioAttributesImplApi21Parcelizer(zbm zbmVar) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 123;
        RatingCompat = i2 % 128;
        int i3 = i2 % 2;
        zbmVar.write = !zbmVar.write;
        int i4 = SideSheetBehavior.read();
        int i5 = SideSheetBehavior.read();
        ((parseTemplate) IconCompatParcelizer(-2139656521, i4, 2139656522, SideSheetBehavior.read(), SideSheetBehavior.read(), i5, new Object[]{zbmVar})).AudioAttributesCompatParcelizer.setChecked(zbmVar.write);
        int i6 = SideSheetBehavior.read();
        int i7 = SideSheetBehavior.read();
        IconCompatParcelizer(-660749254, i6, 660749254, SideSheetBehavior.read(), SideSheetBehavior.read(), i7, new Object[]{zbmVar});
        int i8 = MediaDescriptionCompat + 97;
        RatingCompat = i8 % 128;
        int i9 = i8 % 2;
    }

    private static final void AudioAttributesImplBaseParcelizer(zbm zbmVar) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 33;
        RatingCompat = i2 % 128;
        if (i2 % 2 == 0) {
            zbmVar.AudioAttributesCompatParcelizer = !zbmVar.AudioAttributesCompatParcelizer;
            int i3 = SideSheetBehavior.read();
            int i4 = SideSheetBehavior.read();
            ((parseTemplate) IconCompatParcelizer(-2139656521, i3, 2139656522, SideSheetBehavior.read(), SideSheetBehavior.read(), i4, new Object[]{zbmVar})).IconCompatParcelizer.setChecked(zbmVar.AudioAttributesCompatParcelizer);
            int i5 = SideSheetBehavior.read();
            int i6 = SideSheetBehavior.read();
            IconCompatParcelizer(-660749254, i5, 660749254, SideSheetBehavior.read(), SideSheetBehavior.read(), i6, new Object[]{zbmVar});
        } else {
            zbmVar.AudioAttributesCompatParcelizer = !zbmVar.AudioAttributesCompatParcelizer;
            int i7 = SideSheetBehavior.read();
            int i8 = SideSheetBehavior.read();
            ((parseTemplate) IconCompatParcelizer(-2139656521, i7, 2139656522, SideSheetBehavior.read(), SideSheetBehavior.read(), i8, new Object[]{zbmVar})).IconCompatParcelizer.setChecked(zbmVar.AudioAttributesCompatParcelizer);
            int i9 = SideSheetBehavior.read();
            int i10 = SideSheetBehavior.read();
            IconCompatParcelizer(-660749254, i9, 660749254, SideSheetBehavior.read(), SideSheetBehavior.read(), i10, new Object[]{zbmVar});
        }
        int i11 = MediaDescriptionCompat + 41;
        RatingCompat = i11 % 128;
        int i12 = i11 % 2;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        int i = 2 % 2;
        toMagicModuleMetaRepoModel.write(p0, "");
        this.RemoteActionCompatParcelizer = parseTemplate.AudioAttributesCompatParcelizer(p0, p1);
        int i2 = SideSheetBehavior.read();
        int i3 = SideSheetBehavior.read();
        int i4 = SideSheetBehavior.read();
        ((parseTemplate) IconCompatParcelizer(-2139656521, i2, 2139656522, SideSheetBehavior.read(), i4, i3, new Object[]{this})).RemoteActionCompatParcelizer.setOnClickListener(new View.OnClickListener() { // from class: o.zbp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr = {this.read};
                int i5 = SideSheetBehavior.read();
                int i6 = SideSheetBehavior.read();
                zbm.IconCompatParcelizer(-1767356610, i5, 1767356612, SideSheetBehavior.read(), SideSheetBehavior.read(), i6, objArr);
            }
        });
        int i5 = SideSheetBehavior.read();
        int i6 = SideSheetBehavior.read();
        int i7 = SideSheetBehavior.read();
        ((parseTemplate) IconCompatParcelizer(-2139656521, i5, 2139656522, SideSheetBehavior.read(), i7, i6, new Object[]{this})).AudioAttributesCompatParcelizer.setOnClickListener(new View.OnClickListener() { // from class: o.zbq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                zbm.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer);
            }
        });
        int i8 = SideSheetBehavior.read();
        int i9 = SideSheetBehavior.read();
        int i10 = SideSheetBehavior.read();
        ((parseTemplate) IconCompatParcelizer(-2139656521, i8, 2139656522, SideSheetBehavior.read(), i10, i9, new Object[]{this})).IconCompatParcelizer.setOnClickListener(new View.OnClickListener() { // from class: o.zbo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                zbm.write(this.IconCompatParcelizer);
            }
        });
        int i11 = SideSheetBehavior.read();
        int i12 = SideSheetBehavior.read();
        int i13 = SideSheetBehavior.read();
        IconCompatParcelizer(-660749254, i11, 660749254, SideSheetBehavior.read(), i13, i12, new Object[]{this});
        int i14 = SideSheetBehavior.read();
        int i15 = SideSheetBehavior.read();
        int i16 = SideSheetBehavior.read();
        ScrollView scrollViewIconCompatParcelizer = ((parseTemplate) IconCompatParcelizer(-2139656521, i14, 2139656522, SideSheetBehavior.read(), i16, i15, new Object[]{this})).IconCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(scrollViewIconCompatParcelizer, "");
        ScrollView scrollView = scrollViewIconCompatParcelizer;
        int i17 = MediaDescriptionCompat + 81;
        RatingCompat = i17 % 128;
        int i18 = i17 % 2;
        return scrollView;
    }

    private static final void IconCompatParcelizer(zbm zbmVar) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 47;
        RatingCompat = i2 % 128;
        int i3 = i2 % 2;
        withAlwaysAsId.read(zbmVar, "legal_dialog_key", _getIndexResolver.write(setAction.write("positive_key_press", Boolean.TRUE)));
        zbmVar.dismiss();
        int i4 = MediaDescriptionCompat + 59;
        RatingCompat = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ java.lang.Object IconCompatParcelizer(java.lang.Object[] r19) {
        /*
            Method dump skipped, instruction units count: 348
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.zbm.IconCompatParcelizer(java.lang.Object[]):java.lang.Object");
    }

    @Override // kotlin.argCount, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 89;
        RatingCompat = i2 % 128;
        int i3 = i2 % 2;
        super.onDestroyView();
        this.RemoteActionCompatParcelizer = null;
        int i4 = MediaDescriptionCompat + 81;
        RatingCompat = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // kotlin.argCount, androidx.fragment.app.Fragment
    public final void onViewStateRestored(Bundle p0) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 103;
        RatingCompat = i2 % 128;
        if (i2 % 2 != 0) {
            super.onViewStateRestored(p0);
            if (p0 != null) {
                this.read = p0.getBoolean("condition1", false);
                this.write = p0.getBoolean("condition2", false);
                this.AudioAttributesCompatParcelizer = p0.getBoolean("condition3", false);
                int i3 = SideSheetBehavior.read();
                int i4 = SideSheetBehavior.read();
                int i5 = SideSheetBehavior.read();
                ((parseTemplate) IconCompatParcelizer(-2139656521, i3, 2139656522, SideSheetBehavior.read(), i5, i4, new Object[]{this})).RemoteActionCompatParcelizer.setChecked(this.read);
                int i6 = SideSheetBehavior.read();
                int i7 = SideSheetBehavior.read();
                int i8 = SideSheetBehavior.read();
                ((parseTemplate) IconCompatParcelizer(-2139656521, i6, 2139656522, SideSheetBehavior.read(), i8, i7, new Object[]{this})).AudioAttributesCompatParcelizer.setChecked(this.write);
                int i9 = SideSheetBehavior.read();
                int i10 = SideSheetBehavior.read();
                int i11 = SideSheetBehavior.read();
                ((parseTemplate) IconCompatParcelizer(-2139656521, i9, 2139656522, SideSheetBehavior.read(), i11, i10, new Object[]{this})).IconCompatParcelizer.setChecked(this.AudioAttributesCompatParcelizer);
                int i12 = SideSheetBehavior.read();
                int i13 = SideSheetBehavior.read();
                int i14 = SideSheetBehavior.read();
                IconCompatParcelizer(-660749254, i12, 660749254, SideSheetBehavior.read(), i14, i13, new Object[]{this});
                int i15 = RatingCompat + 123;
                MediaDescriptionCompat = i15 % 128;
                int i16 = i15 % 2;
                return;
            }
            return;
        }
        super.onViewStateRestored(p0);
        throw null;
    }

    @Override // kotlin.argCount, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle p0) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 107;
        RatingCompat = i2 % 128;
        int i3 = i2 % 2;
        toMagicModuleMetaRepoModel.write(p0, "");
        super.onSaveInstanceState(p0);
        p0.putBoolean("condition1", this.read);
        p0.putBoolean("condition2", this.write);
        p0.putBoolean("condition3", this.AudioAttributesCompatParcelizer);
        int i4 = MediaDescriptionCompat + 41;
        RatingCompat = i4 % 128;
        int i5 = i4 % 2;
    }

    private static void b(byte b, int i, int i2, short s, int i3, Object[] objArr) throws Throwable {
        boolean z;
        int i4;
        int i5 = 2;
        int i6 = 2 % 2;
        buildResumeDownloadsIntent buildresumedownloadsintent = new buildResumeDownloadsIntent();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(MediaBrowserCompatItemReceiver)};
            char c = 0;
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(559968424);
            if (objRemoteActionCompatParcelizer == null) {
                objRemoteActionCompatParcelizer = startForeground.read((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 24297 - TextUtils.getOffsetAfter("", 0), 12 - (ViewConfiguration.getFadingEdgeLength() >> 16), 1596568637, false, CmcdHeadersFactory.STREAM_TYPE_LIVE, new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
            int i7 = -1;
            if (iIntValue == -1) {
                int i8 = $11 + 79;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                z = true;
            } else {
                z = false;
            }
            if (z) {
                byte[] bArr = AudioAttributesImplApi21Parcelizer;
                long j = 0;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i10 = 0;
                    while (i10 < length) {
                        int i11 = $10 + 93;
                        $11 = i11 % 128;
                        int i12 = i11 % i5;
                        Object[] objArr3 = new Object[1];
                        objArr3[c] = Integer.valueOf(bArr[i10]);
                        Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(28234468);
                        if (objRemoteActionCompatParcelizer2 == null) {
                            char keyRepeatTimeout = (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                            int windowTouchSlop = 3082 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                            int i13 = 129 - (SystemClock.elapsedRealtime() > j ? 1 : (SystemClock.elapsedRealtime() == j ? 0 : -1));
                            byte b2 = (byte) i7;
                            byte b3 = (byte) (b2 + 1);
                            objRemoteActionCompatParcelizer2 = startForeground.read(keyRepeatTimeout, windowTouchSlop, i13, 2145850993, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        bArr2[i10] = ((Byte) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).byteValue();
                        i10++;
                        i5 = 2;
                        c = 0;
                        i7 = -1;
                        j = 0;
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = AudioAttributesImplApi21Parcelizer;
                    Object[] objArr4 = {Integer.valueOf(i2), Integer.valueOf(AudioAttributesImplApi26Parcelizer)};
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(559968424);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), 24297 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 11 - TextUtils.lastIndexOf("", '0', 0, 0), 1596568637, false, CmcdHeadersFactory.STREAM_TYPE_LIVE, new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).intValue()]) ^ 7899112766888837815L)) + ((int) (((long) MediaBrowserCompatItemReceiver) ^ 7899112766888837815L)));
                } else {
                    iIntValue = (short) (((short) (((long) AudioAttributesImplBaseParcelizer[i2 + ((int) (((long) AudioAttributesImplApi26Parcelizer) ^ 7899112766888837815L))]) ^ 7899112766888837815L)) + ((int) (((long) MediaBrowserCompatItemReceiver) ^ 7899112766888837815L)));
                }
            }
            if (iIntValue > 0) {
                int i14 = ((i2 + iIntValue) - 2) + ((int) (((long) AudioAttributesImplApi26Parcelizer) ^ 7899112766888837815L));
                if (z) {
                    int i15 = $11 + 41;
                    $10 = i15 % 128;
                    int i16 = i15 % 2;
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                buildresumedownloadsintent.read = i14 + i4;
                Object[] objArr5 = {buildresumedownloadsintent, Integer.valueOf(i), Integer.valueOf(MediaBrowserCompatCustomActionResultReceiver), sb};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(107629512);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) (34134 - KeyEvent.normalizeMetaState(0)), Color.green(0) + 13432, 21 - KeyEvent.getDeadChar(0, 0), 2015596381, false, "t", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).append(buildresumedownloadsintent.IconCompatParcelizer);
                buildresumedownloadsintent.RemoteActionCompatParcelizer = buildresumedownloadsintent.IconCompatParcelizer;
                byte[] bArr4 = AudioAttributesImplApi21Parcelizer;
                if (bArr4 != null) {
                    int i17 = $10 + 57;
                    $11 = i17 % 128;
                    int i18 = i17 % 2;
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i19 = 0; i19 < length2; i19++) {
                        bArr5[i19] = (byte) (((long) bArr4[i19]) ^ 7899112766888837815L);
                    }
                    int i20 = $10 + 103;
                    $11 = i20 % 128;
                    int i21 = i20 % 2;
                    bArr4 = bArr5;
                }
                boolean z2 = bArr4 != null;
                buildresumedownloadsintent.AudioAttributesCompatParcelizer = 1;
                while (buildresumedownloadsintent.AudioAttributesCompatParcelizer < iIntValue) {
                    if (!z2) {
                        short[] sArr = AudioAttributesImplBaseParcelizer;
                        buildresumedownloadsintent.read = buildresumedownloadsintent.read - 1;
                        buildresumedownloadsintent.IconCompatParcelizer = (char) (buildresumedownloadsintent.RemoteActionCompatParcelizer + (((short) (((short) (((long) sArr[r3]) ^ 7899112766888837815L)) + s)) ^ b));
                    } else {
                        int i22 = $10 + 11;
                        $11 = i22 % 128;
                        int i23 = i22 % 2;
                        byte[] bArr6 = AudioAttributesImplApi21Parcelizer;
                        buildresumedownloadsintent.read = buildresumedownloadsintent.read - 1;
                        buildresumedownloadsintent.IconCompatParcelizer = (char) (buildresumedownloadsintent.RemoteActionCompatParcelizer + (((byte) (((byte) (((long) bArr6[r6]) ^ 7899112766888837815L)) + s)) ^ b));
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

    public static /* synthetic */ void AudioAttributesCompatParcelizer(zbm zbmVar) {
        int i = 2 % 2;
        int i2 = RatingCompat + 7;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        IconCompatParcelizer(zbmVar);
        int i4 = RatingCompat + 41;
        MediaDescriptionCompat = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void RemoteActionCompatParcelizer(zbm zbmVar) {
        int i = 2 % 2;
        int i2 = RatingCompat + 63;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        AudioAttributesImplApi21Parcelizer(zbmVar);
        if (i3 != 0) {
            int i4 = 25 / 0;
        }
    }

    public static /* synthetic */ void write(zbm zbmVar) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 55;
        RatingCompat = i2 % 128;
        int i3 = i2 % 2;
        AudioAttributesImplBaseParcelizer(zbmVar);
        int i4 = MediaDescriptionCompat + 27;
        RatingCompat = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 54 / 0;
        }
    }

    public static /* synthetic */ void read(zbm zbmVar) {
        int i = SideSheetBehavior.read();
        int i2 = SideSheetBehavior.read();
        int i3 = SideSheetBehavior.read();
        IconCompatParcelizer(-1767356610, i, 1767356612, SideSheetBehavior.read(), i3, i2, new Object[]{zbmVar});
    }

    static {
        MediaBrowserCompatMediaItem = 1;
        AudioAttributesCompatParcelizer();
        INSTANCE = new Companion(null);
        int i = MediaMetadataCompat + 75;
        MediaBrowserCompatMediaItem = i % 128;
        int i2 = i % 2;
    }

    private final void read() {
        int i = SideSheetBehavior.read();
        int i2 = SideSheetBehavior.read();
        int i3 = SideSheetBehavior.read();
        IconCompatParcelizer(-660749254, i, 660749254, SideSheetBehavior.read(), i3, i2, new Object[]{this});
    }

    private final parseTemplate IconCompatParcelizer() {
        int i = SideSheetBehavior.read();
        int i2 = SideSheetBehavior.read();
        int i3 = SideSheetBehavior.read();
        return (parseTemplate) IconCompatParcelizer(-2139656521, i, 2139656522, SideSheetBehavior.read(), i3, i2, new Object[]{this});
    }

    static void AudioAttributesCompatParcelizer() {
        AudioAttributesImplApi26Parcelizer = -573200894;
        MediaBrowserCompatItemReceiver = -819363137;
        MediaBrowserCompatCustomActionResultReceiver = 1283376807;
        AudioAttributesImplApi21Parcelizer = new byte[]{-65, -82, 87, -89, 92, -128, -125, 97, 95, -85, TarConstants.LF_GNUTYPE_SPARSE, -104, 107, 77, -77, 81, -65, TarConstants.LF_BLK, -64, 25, -18, -64, 39, 44, -6, TarConstants.LF_NORMAL, 62, -64, TarConstants.LF_CHR, 60, TarConstants.LF_BLK, -50, -71, 42, -42, 33, 11, -12, 42, -45, 35, -40, 4, 7, -103, 38, 99, -24, -39, -40, -33, 44, -44, 47, -80, -103, 101, -108, 105, 106, -99, 114, -113, -98, -109, 98, 110, -108, 102};
    }

    private static /* synthetic */ Object write(Object[] objArr) {
        zbm zbmVar = (zbm) objArr[0];
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 57;
        RatingCompat = i2 % 128;
        int i3 = i2 % 2;
        AudioAttributesImplApi26Parcelizer(zbmVar);
        int i4 = RatingCompat + 85;
        MediaDescriptionCompat = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }
}
