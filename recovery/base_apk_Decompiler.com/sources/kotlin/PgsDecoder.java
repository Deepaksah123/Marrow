package kotlin;

import android.app.Dialog;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.onDownloadChanged;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\r\u0010\u000eJ+\u0010\u0014\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0016\u0010\u0003J!\u0010\u0017\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00132\b\u0010\u0011\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0019\u0010\u0003R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u001a8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\u001b\u001a\u00020!8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\""}, d2 = {"Lo/PgsDecoder;", "Lo/argCount;", "<init>", "()V", "", "getTheme", "()I", "Landroid/os/Bundle;", "p0", "", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "p1", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onStart", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "Lo/containsUri;", "write", "Lo/containsUri;", "read", "IconCompatParcelizer", "()Lo/containsUri;", "RemoteActionCompatParcelizer", "", "Z"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PgsDecoder extends argCount {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char[] AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static int MediaBrowserCompatItemReceiver;
    private static char RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private boolean write = true;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private containsUri read;
    private static final byte[] $$d = {20, 28, 18, 12, -74, 14, -7, -4, -2, 25, -12, -21, -14, -7, -7, -26, 8, 10, -13, -8, -12, -22, -74, 74, -14, -18, 2, -24, 17, 3, -10, -52, 35, -11, -6, -24, 10, -45, 8, 8, -24, -7, -2, -12, 8, -30, 4, 10, -1, -7, -4, -24, -45, 25, 8, -20, -3, -10, -52, 35, -11, -6, -24, 10, -45, 8, 8, -24, -7, -2, -12, 8, -30, 4};
    private static final int $$e = 249;
    private static final byte[] $$a = {57, 34, -8, 64, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, TarConstants.LF_NORMAL, -51, 1, -2, 4, 1, 43, -35, -18, 10, -7, 0, 27, -20, -15, -3, 8, -9, 33, -20, 1, -3, -5, -14, 16, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, 0, -32, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, -5, -27, -18, -18, 14, -3, -8, 2, -18, 20, -14};
    private static final int $$b = 97;
    private static int AudioAttributesImplBaseParcelizer = 1;
    private static int AudioAttributesImplApi21Parcelizer = 0;
    private static int MediaBrowserCompatCustomActionResultReceiver = 1;

    public static /* synthetic */ Object IconCompatParcelizer(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i6;
        int i8 = ~(i7 | i4);
        int i9 = (~(i7 | (~i4) | i5)) | (~(i5 | i6 | i4));
        int i10 = ~i5;
        int i11 = (~(i4 | i6)) | (~(i10 | i4)) | (~(i10 | i6));
        int i12 = i5 + i6 + i + (1698977638 * i3) + (1466394737 * i2);
        int i13 = i12 * i12;
        int i14 = (((-1250291696) * i5) - 490274816) + ((-1116082190) * i6) + (i8 * (-67104753)) + ((-67104753) * i9) + (67104753 * i11) + ((-1183186944) * i) + (1553727488 * i3) + (1859780608 * i2) + (925827072 * i13);
        int i15 = ((i5 * (-1787956080)) - 1478154965) + (i6 * (-1787955198)) + (i8 * (-441)) + (i9 * (-441)) + (i11 * 441) + (i * (-1787955639)) + (i3 * 552005654) + (i2 * (-2013897159)) + (i13 * (-429457408));
        if (i14 + (i15 * i15 * (-402587648)) != 1) {
            return write(objArr);
        }
        PgsDecoder pgsDecoder = (PgsDecoder) objArr[0];
        int i16 = 2 % 2;
        int i17 = AudioAttributesImplApi21Parcelizer + 33;
        MediaBrowserCompatCustomActionResultReceiver = i17 % 128;
        int i18 = i17 % 2;
        AudioAttributesImplApi26Parcelizer(pgsDecoder);
        int i19 = AudioAttributesImplApi21Parcelizer + 111;
        MediaBrowserCompatCustomActionResultReceiver = i19 % 128;
        int i20 = i19 % 2;
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(byte r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 + 4
            int r8 = r8 * 10
            int r0 = r8 + 34
            int r7 = r7 * 12
            int r7 = 77 - r7
            byte[] r1 = kotlin.PgsDecoder.$$a
            byte[] r0 = new byte[r0]
            int r8 = r8 + 33
            r2 = 0
            if (r1 != 0) goto L16
            r3 = r8
            r4 = r2
            goto L2c
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r8) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L24:
            int r3 = r3 + 1
            r4 = r1[r6]
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L2c:
            int r7 = -r7
            int r3 = r3 + r7
            int r7 = r3 + (-1)
            int r6 = r6 + 1
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.PgsDecoder.a(byte, int, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(short r5, short r6, int r7, java.lang.Object[] r8) {
        /*
            int r5 = 46 - r5
            int r7 = r7 + 73
            int r0 = 28 - r6
            byte[] r1 = kotlin.PgsDecoder.$$d
            byte[] r0 = new byte[r0]
            int r6 = 27 - r6
            r2 = 0
            if (r1 != 0) goto L13
            r4 = r7
            r3 = r2
            r7 = r6
            goto L27
        L13:
            r3 = r2
        L14:
            int r5 = r5 + 1
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r6) goto L23
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L23:
            r4 = r1[r5]
            int r3 = r3 + 1
        L27:
            int r7 = r7 + r4
            int r7 = r7 + 9
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.PgsDecoder.c(short, short, int, java.lang.Object[]):void");
    }

    private final containsUri IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 5;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        containsUri containsuri = this.read;
        toMagicModuleMetaRepoModel.write(containsuri);
        if (i3 == 0) {
            return containsuri;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // kotlin.argCount
    public final int getTheme() {
        int i;
        int i2 = 2 % 2;
        int i3 = AudioAttributesImplApi21Parcelizer + 87;
        MediaBrowserCompatCustomActionResultReceiver = i3 % 128;
        if (i3 % 2 == 0) {
            i = CmcdConfigurationRequestConfig.read();
            int i4 = 43 / 0;
        } else {
            i = CmcdConfigurationRequestConfig.read();
        }
        int i5 = MediaBrowserCompatCustomActionResultReceiver + 71;
        AudioAttributesImplApi21Parcelizer = i5 % 128;
        int i6 = i5 % 2;
        return i;
    }

    /* JADX INFO: renamed from: o.PgsDecoder$IconCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/PgsDecoder$IconCompatParcelizer;", "", "<init>", "()V", "", "p0", "Lo/PgsDecoder;", "AudioAttributesCompatParcelizer", "(Z)Lo/PgsDecoder;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static PgsDecoder AudioAttributesCompatParcelizer(boolean p0) {
            PgsDecoder pgsDecoder = new PgsDecoder();
            pgsDecoder.setArguments(_getIndexResolver.write(setAction.write("show_stream_online_only", Boolean.valueOf(p0))));
            return pgsDecoder;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ff  */
    @Override // kotlin.argCount, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(android.os.Bundle r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1155
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.PgsDecoder.onCreate(android.os.Bundle):void");
    }

    @Override // kotlin.argCount
    public final Dialog onCreateDialog(Bundle p0) {
        int i = 2 % 2;
        Dialog dialog = new Dialog(requireContext(), getTheme());
        dialog.setCanceledOnTouchOutside(true);
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 93;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        if (i2 % 2 == 0) {
            return dialog;
        }
        throw null;
    }

    private static /* synthetic */ Object write(Object[] objArr) {
        PgsDecoder pgsDecoder = (PgsDecoder) objArr[0];
        LayoutInflater layoutInflater = (LayoutInflater) objArr[1];
        ViewGroup viewGroup = (ViewGroup) objArr[2];
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 85;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        toMagicModuleMetaRepoModel.write(layoutInflater, "");
        pgsDecoder.read = containsUri.IconCompatParcelizer(layoutInflater, viewGroup);
        LinearLayout linearLayoutIconCompatParcelizer = pgsDecoder.IconCompatParcelizer().IconCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayoutIconCompatParcelizer, "");
        LinearLayout linearLayout = linearLayoutIconCompatParcelizer;
        int i4 = MediaBrowserCompatCustomActionResultReceiver + 47;
        AudioAttributesImplApi21Parcelizer = i4 % 128;
        if (i4 % 2 == 0) {
            return linearLayout;
        }
        throw null;
    }

    @Override // kotlin.argCount, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 21;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        if (i2 % 2 == 0) {
            super.onStart();
            Dialog dialog = getDialog();
            if (dialog == null || (window = dialog.getWindow()) == null) {
                return;
            }
            window.setLayout(getResources().getDimensionPixelSize(R.dimen.video_dialog_width), -2);
            int i3 = MediaBrowserCompatCustomActionResultReceiver + 85;
            AudioAttributesImplApi21Parcelizer = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        super.onStart();
        getDialog();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void write(PgsDecoder pgsDecoder) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 33;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        withAlwaysAsId.read(pgsDecoder, "result_downloaded_video_options", _getIndexResolver.write(setAction.write("selected_option", "delete_offline_video")));
        pgsDecoder.dismiss();
        int i4 = AudioAttributesImplApi21Parcelizer + 111;
        MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void IconCompatParcelizer(PgsDecoder pgsDecoder) {
        PgsDecoder pgsDecoder2;
        Bundle bundleWrite;
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 99;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        if (i2 % 2 != 0) {
            pgsDecoder2 = pgsDecoder;
            Pair[] pairArr = new Pair[1];
            pairArr[1] = setAction.write("selected_option", "stream_online");
            bundleWrite = _getIndexResolver.write(pairArr);
        } else {
            pgsDecoder2 = pgsDecoder;
            bundleWrite = _getIndexResolver.write(setAction.write("selected_option", "stream_online"));
        }
        withAlwaysAsId.read(pgsDecoder2, "result_downloaded_video_options", bundleWrite);
        pgsDecoder.dismiss();
        int i3 = MediaBrowserCompatCustomActionResultReceiver + 73;
        AudioAttributesImplApi21Parcelizer = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View p0, Bundle p1) {
        int i;
        int i2 = 2 % 2;
        int i3 = MediaBrowserCompatCustomActionResultReceiver + 109;
        AudioAttributesImplApi21Parcelizer = i3 % 128;
        int i4 = i3 % 2;
        toMagicModuleMetaRepoModel.write(p0, "");
        TextView textView = IconCompatParcelizer().RemoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView, "");
        TextView textView2 = textView;
        int i5 = 0;
        if (this.write) {
            int i6 = MediaBrowserCompatCustomActionResultReceiver + 91;
            AudioAttributesImplApi21Parcelizer = i6 % 128;
            int i7 = i6 % 2;
            i = 0;
        } else {
            i = 8;
        }
        textView2.setVisibility(i);
        TextView textView3 = IconCompatParcelizer().IconCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView3, "");
        TextView textView4 = textView3;
        if (!this.write) {
            int i8 = MediaBrowserCompatCustomActionResultReceiver + 73;
            AudioAttributesImplApi21Parcelizer = i8 % 128;
            int i9 = i8 % 2;
        } else {
            int i10 = MediaBrowserCompatCustomActionResultReceiver + 49;
            AudioAttributesImplApi21Parcelizer = i10 % 128;
            int i11 = i10 % 2;
            i5 = 8;
        }
        textView4.setVisibility(i5);
        IconCompatParcelizer().read.setOnClickListener(new View.OnClickListener() { // from class: o.readNextSection
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PgsDecoder.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer);
            }
        });
        IconCompatParcelizer().RemoteActionCompatParcelizer.setOnClickListener(new View.OnClickListener() { // from class: o.parseBitmapSection
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PgsDecoder.read(this.IconCompatParcelizer);
            }
        });
        IconCompatParcelizer().IconCompatParcelizer.setOnClickListener(new View.OnClickListener() { // from class: o.PgsSubtitle
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr = {this.AudioAttributesCompatParcelizer};
                int i12 = onDownloadChanged.RemoteActionCompatParcelizer.read();
                PgsDecoder.IconCompatParcelizer(onDownloadChanged.RemoteActionCompatParcelizer.read(), onDownloadChanged.RemoteActionCompatParcelizer.read(), onDownloadChanged.RemoteActionCompatParcelizer.read(), i12, 1554187371, objArr, -1554187370);
            }
        });
    }

    private static final void AudioAttributesImplApi26Parcelizer(PgsDecoder pgsDecoder) {
        PgsDecoder pgsDecoder2;
        Bundle bundleWrite;
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi21Parcelizer + 1;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        if (i2 % 2 == 0) {
            pgsDecoder2 = pgsDecoder;
            bundleWrite = _getIndexResolver.write(setAction.write("selected_option", "stream_offline"));
        } else {
            pgsDecoder2 = pgsDecoder;
            bundleWrite = _getIndexResolver.write(setAction.write("selected_option", "stream_offline"));
        }
        withAlwaysAsId.read(pgsDecoder2, "result_downloaded_video_options", bundleWrite);
        pgsDecoder.dismiss();
        int i3 = AudioAttributesImplApi21Parcelizer + 61;
        MediaBrowserCompatCustomActionResultReceiver = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // kotlin.argCount, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 31;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        super.onDestroyView();
        this.read = null;
        int i4 = MediaBrowserCompatCustomActionResultReceiver + 97;
        AudioAttributesImplApi21Parcelizer = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private static void b(int i, char[] cArr, byte b, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        long j;
        int length;
        char[] cArr2;
        int i3 = 2 % 2;
        needsStartedService needsstartedservice = new needsStartedService();
        char[] cArr3 = AudioAttributesCompatParcelizer;
        Object obj2 = null;
        if (cArr3 != null) {
            int i4 = $10 + 39;
            $11 = i4 % 128;
            if (i4 % 2 == 0) {
                length = cArr3.length;
                cArr2 = new char[length];
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
            }
            for (int i5 = 0; i5 < length; i5++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i5])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1527982763);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (ViewConfiguration.getScrollBarSize() >> 8), 7015 - (ViewConfiguration.getScrollBarSize() >> 8), View.resolveSize(0, 0) + 30, -626716224, false, "o", new Class[]{Integer.TYPE});
                    }
                    cArr2[i5] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr2;
        }
        try {
            Object[] objArr3 = {Integer.valueOf(RemoteActionCompatParcelizer)};
            Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1527982763);
            long j2 = 0;
            if (objRemoteActionCompatParcelizer2 == null) {
                objRemoteActionCompatParcelizer2 = startForeground.read((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), ExpandableListView.getPackedPositionGroup(0L) + 7015, View.resolveSizeAndState(0, 0, 0) + 30, -626716224, false, "o", new Class[]{Integer.TYPE});
            }
            char cCharValue = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).charValue();
            char[] cArr4 = new char[i];
            if (i % 2 != 0) {
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b);
            } else {
                i2 = i;
            }
            if (i2 > 1) {
                needsstartedservice.AudioAttributesCompatParcelizer = 0;
                int i6 = $10 + 5;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                while (needsstartedservice.AudioAttributesCompatParcelizer < i2) {
                    needsstartedservice.write = cArr[needsstartedservice.AudioAttributesCompatParcelizer];
                    needsstartedservice.RemoteActionCompatParcelizer = cArr[needsstartedservice.AudioAttributesCompatParcelizer + 1];
                    if (needsstartedservice.write == needsstartedservice.RemoteActionCompatParcelizer) {
                        cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = (char) (needsstartedservice.write - b);
                        cArr4[needsstartedservice.AudioAttributesCompatParcelizer + 1] = (char) (needsstartedservice.RemoteActionCompatParcelizer - b);
                        j = j2;
                        obj = obj2;
                    } else {
                        Object[] objArr4 = {needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice};
                        Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(105000849);
                        if (objRemoteActionCompatParcelizer3 == null) {
                            objRemoteActionCompatParcelizer3 = startForeground.read((char) (48194 - ((Process.getThreadPriority(0) + 20) >> 6)), Color.rgb(0, 0, 0) + 16797342, TextUtils.getOffsetAfter("", 0) + 20, 2014046980, false, "n", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).intValue() == needsstartedservice.AudioAttributesImplBaseParcelizer) {
                            Object[] objArr5 = {needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice};
                            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(50135433);
                            if (objRemoteActionCompatParcelizer4 == null) {
                                j = 0;
                                objRemoteActionCompatParcelizer4 = startForeground.read((char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 19367 - ((byte) KeyEvent.getModifierMetaStateMask()), 18 - (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 2092221724, false, "k", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            } else {
                                j = 0;
                            }
                            obj = null;
                            int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).intValue();
                            int i8 = (needsstartedservice.read * cCharValue) + needsstartedservice.AudioAttributesImplBaseParcelizer;
                            cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = cArr3[iIntValue];
                            cArr4[needsstartedservice.AudioAttributesCompatParcelizer + 1] = cArr3[i8];
                        } else {
                            obj = null;
                            j = 0;
                            if (needsstartedservice.IconCompatParcelizer == needsstartedservice.read) {
                                int i9 = $11 + 53;
                                $10 = i9 % 128;
                                int i10 = i9 % 2;
                                needsstartedservice.MediaBrowserCompatItemReceiver = ((needsstartedservice.MediaBrowserCompatItemReceiver + cCharValue) - 1) % cCharValue;
                                needsstartedservice.AudioAttributesImplBaseParcelizer = ((needsstartedservice.AudioAttributesImplBaseParcelizer + cCharValue) - 1) % cCharValue;
                                int i11 = (needsstartedservice.IconCompatParcelizer * cCharValue) + needsstartedservice.MediaBrowserCompatItemReceiver;
                                int i12 = (needsstartedservice.read * cCharValue) + needsstartedservice.AudioAttributesImplBaseParcelizer;
                                cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = cArr3[i11];
                                cArr4[needsstartedservice.AudioAttributesCompatParcelizer + 1] = cArr3[i12];
                            } else {
                                int i13 = (needsstartedservice.IconCompatParcelizer * cCharValue) + needsstartedservice.AudioAttributesImplBaseParcelizer;
                                int i14 = (needsstartedservice.read * cCharValue) + needsstartedservice.MediaBrowserCompatItemReceiver;
                                cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = cArr3[i13];
                                cArr4[needsstartedservice.AudioAttributesCompatParcelizer + 1] = cArr3[i14];
                            }
                        }
                    }
                    needsstartedservice.AudioAttributesCompatParcelizer += 2;
                    obj2 = obj;
                    j2 = j;
                }
            }
            for (int i15 = 0; i15 < i; i15++) {
                cArr4[i15] = (char) (cArr4[i15] ^ 13722);
            }
            objArr[0] = new String(cArr4);
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    public static /* synthetic */ void AudioAttributesCompatParcelizer(PgsDecoder pgsDecoder) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi21Parcelizer + 125;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        write(pgsDecoder);
        if (i3 == 0) {
            int i4 = 12 / 0;
        }
    }

    public static /* synthetic */ void RemoteActionCompatParcelizer(PgsDecoder pgsDecoder) {
        int i = onDownloadChanged.RemoteActionCompatParcelizer.read();
        int i2 = onDownloadChanged.RemoteActionCompatParcelizer.read();
        int i3 = onDownloadChanged.RemoteActionCompatParcelizer.read();
        IconCompatParcelizer(i2, onDownloadChanged.RemoteActionCompatParcelizer.read(), i3, i, 1554187371, new Object[]{pgsDecoder}, -1554187370);
    }

    public static /* synthetic */ void read(PgsDecoder pgsDecoder) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 71;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        IconCompatParcelizer(pgsDecoder);
        int i4 = MediaBrowserCompatCustomActionResultReceiver + 71;
        AudioAttributesImplApi21Parcelizer = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    static {
        MediaBrowserCompatItemReceiver = 0;
        write();
        INSTANCE = new Companion(null);
        int i = AudioAttributesImplBaseParcelizer + 1;
        MediaBrowserCompatItemReceiver = i % 128;
        int i2 = i % 2;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        int i = onDownloadChanged.RemoteActionCompatParcelizer.read();
        int i2 = onDownloadChanged.RemoteActionCompatParcelizer.read();
        int i3 = onDownloadChanged.RemoteActionCompatParcelizer.read();
        return (View) IconCompatParcelizer(i2, onDownloadChanged.RemoteActionCompatParcelizer.read(), i3, i, -1587928376, new Object[]{this, p0, p1, p2}, 1587928376);
    }

    static void write() {
        AudioAttributesCompatParcelizer = new char[]{6406, 6496, 6467, 6523, 6473, 6488, 6479, 6477, 6476, 6475, 6469, 6468, 6492, 6481, 6465, 6522, 6507, 6464, 6494, 6470, 6491, 6466, 6471, 6407, 6490};
        RemoteActionCompatParcelizer = (char) 11447;
    }
}
