package kotlin;

import android.content.Context;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.ScrollView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.textfield.TextInputLayout;
import com.marrow.R;
import com.marrow2.ui.notespurchase.NotesPurchaseActivityViewModel;
import com.marrow2.ui.notespurchase.addressinput.NotesPurchaseAddressInputFragmentViewModel;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import kotlin.IGmsServiceBrokerStub;
import kotlin.Metadata;
import kotlin.VisibilityChecker;
import kotlin.efmt;
import kotlin.pii;
import kotlin.validateScopes;
import kotlin.withFieldVisibility;
import org.apache.commons.compress.archivers.tar.TarConstants;
import org.apache.commons.compress.utils.CharsetNames;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0003J\u0017\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001c\u0010\u0003R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001eR\u0014\u0010\u0010\u001a\u00020\u001d8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u001fR\u001b\u0010\u0017\u001a\u00020 8CX\u0083\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u0017\u0010#R\u001b\u0010!\u001a\u00020$8CX\u0083\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\"\u001a\u0004\b!\u0010%"}, d2 = {"Lo/IAccountAccessor;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Landroid/view/LayoutInflater;", "p0", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "read", "MediaBrowserCompatCustomActionResultReceiver", "AudioAttributesImplBaseParcelizer", "Lo/setSourceChunk;", "RemoteActionCompatParcelizer", "(Lo/setSourceChunk;)V", "Lo/GmsLogger;", "write", "(Lo/setSourceChunk;Lo/GmsLogger;)V", "Lo/getOrStartHandlerThread;", "IconCompatParcelizer", "(Lo/getOrStartHandlerThread;)V", "onDestroyView", "Lo/resolveTimeToLiveEdgeUs;", "Lo/resolveTimeToLiveEdgeUs;", "()Lo/resolveTimeToLiveEdgeUs;", "Lcom/marrow2/ui/notespurchase/addressinput/NotesPurchaseAddressInputFragmentViewModel;", "AudioAttributesCompatParcelizer", "Lo/RenewEligible;", "()Lcom/marrow2/ui/notespurchase/addressinput/NotesPurchaseAddressInputFragmentViewModel;", "Lcom/marrow2/ui/notespurchase/NotesPurchaseActivityViewModel;", "()Lcom/marrow2/ui/notespurchase/NotesPurchaseActivityViewModel;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class IAccountAccessor extends canLog {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final RenewEligible write;
    private resolveTimeToLiveEdgeUs IconCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final RenewEligible AudioAttributesCompatParcelizer;

    public IAccountAccessor() {
        IAccountAccessor iAccountAccessor = this;
        RenewEligible renewEligibleWrite = getRenewExpiresOn.write(RenewEligibleCompanion.read, new AnonymousClass1(new AnonymousClass4(iAccountAccessor)));
        this.write = _resolveFieldVsGetter.RemoteActionCompatParcelizer(toMagicModuleMetaDataUcModel.write(NotesPurchaseAddressInputFragmentViewModel.class), new AnonymousClass10(renewEligibleWrite), new AnonymousClass9(renewEligibleWrite), new AnonymousClass7(iAccountAccessor, renewEligibleWrite));
        this.AudioAttributesCompatParcelizer = _resolveFieldVsGetter.RemoteActionCompatParcelizer(toMagicModuleMetaDataUcModel.write(NotesPurchaseActivityViewModel.class), new AnonymousClass3(iAccountAccessor), new AnonymousClass2(iAccountAccessor), new AnonymousClass5(iAccountAccessor));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final resolveTimeToLiveEdgeUs RemoteActionCompatParcelizer() {
        resolveTimeToLiveEdgeUs resolvetimetoliveedgeus = this.IconCompatParcelizer;
        toMagicModuleMetaRepoModel.write(resolvetimetoliveedgeus);
        return resolvetimetoliveedgeus;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NotesPurchaseAddressInputFragmentViewModel write() {
        return (NotesPurchaseAddressInputFragmentViewModel) this.write.RemoteActionCompatParcelizer();
    }

    private final NotesPurchaseActivityViewModel AudioAttributesCompatParcelizer() {
        return (NotesPurchaseActivityViewModel) this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        this.IconCompatParcelizer = resolveTimeToLiveEdgeUs.read(p0, p1);
        ConstraintLayout constraintLayoutIconCompatParcelizer = RemoteActionCompatParcelizer().IconCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayoutIconCompatParcelizer, "");
        return constraintLayoutIconCompatParcelizer;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View p0, Bundle p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        super.onViewCreated(p0, p1);
        AudioAttributesCompatParcelizer().IconCompatParcelizer(new validateScopes.IconCompatParcelizer("Delivery Information"));
        AudioAttributesCompatParcelizer().IconCompatParcelizer(validateScopes.AudioAttributesCompatParcelizer.INSTANCE);
        read();
        MediaBrowserCompatCustomActionResultReceiver();
        AudioAttributesImplBaseParcelizer();
    }

    private final void read() {
        if (DeviceProperties.isTablet(requireContext())) {
            Context contextRequireContext = requireContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
            ScrollView scrollView = RemoteActionCompatParcelizer().write;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(scrollView, "");
            bytesRead.write(contextRequireContext, scrollView);
            Context contextRequireContext2 = requireContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext2, "");
            Button button = RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(button, "");
            bytesRead.IconCompatParcelizer(contextRequireContext2, button);
        }
    }

    private final void MediaBrowserCompatCustomActionResultReceiver() {
        setSourceChunk setsourcechunk = RemoteActionCompatParcelizer().read;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(setsourcechunk, "");
        RemoteActionCompatParcelizer(setsourcechunk);
        RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer.setOnClickListener(new View.OnClickListener() { // from class: o.v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IAccountAccessor.read(this.IconCompatParcelizer);
            }
        });
    }

    public static final class AudioAttributesCompatParcelizer implements TextWatcher {
        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public AudioAttributesCompatParcelizer() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            IAccountAccessor.this.write().write(new efmt.AudioAttributesImplApi26Parcelizer(TestGroupLSModel.AudioAttributesImplApi26Parcelizer((CharSequence) String.valueOf(editable)).toString()));
        }
    }

    public static final class AudioAttributesImplApi21Parcelizer implements TextWatcher {
        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public AudioAttributesImplApi21Parcelizer() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            IAccountAccessor.this.write().write(new efmt.RemoteActionCompatParcelizer(TestGroupLSModel.AudioAttributesImplApi26Parcelizer((CharSequence) String.valueOf(editable)).toString()));
        }
    }

    public static final class AudioAttributesImplApi26Parcelizer implements TextWatcher {
        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public AudioAttributesImplApi26Parcelizer() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            IAccountAccessor.this.write().write(new efmt.AudioAttributesImplBaseParcelizer(TestGroupLSModel.AudioAttributesImplApi26Parcelizer((CharSequence) String.valueOf(editable)).toString()));
        }
    }

    public static final class AudioAttributesImplBaseParcelizer implements TextWatcher {
        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public AudioAttributesImplBaseParcelizer() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            IAccountAccessor.this.write().write(new efmt.write(TestGroupLSModel.AudioAttributesImplApi26Parcelizer((CharSequence) String.valueOf(editable)).toString()));
        }
    }

    public static final class IconCompatParcelizer implements TextWatcher {
        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public IconCompatParcelizer() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            IAccountAccessor.this.write().write(new efmt.IconCompatParcelizer(TestGroupLSModel.AudioAttributesImplApi26Parcelizer((CharSequence) String.valueOf(editable)).toString()));
        }
    }

    public static final class MediaBrowserCompatCustomActionResultReceiver implements TextWatcher {
        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public MediaBrowserCompatCustomActionResultReceiver() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            IAccountAccessor.this.write().write(new efmt.AudioAttributesCompatParcelizer(TestGroupLSModel.AudioAttributesImplApi26Parcelizer((CharSequence) String.valueOf(editable)).toString()));
        }
    }

    public static final class RemoteActionCompatParcelizer implements TextWatcher {
        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public RemoteActionCompatParcelizer() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            IAccountAccessor.this.write().write(new efmt.read(TestGroupLSModel.AudioAttributesImplApi26Parcelizer((CharSequence) String.valueOf(editable)).toString()));
        }
    }

    public static final class read implements TextWatcher {
        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public read() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            IAccountAccessor.this.write().write(new efmt.MediaBrowserCompatCustomActionResultReceiver(TestGroupLSModel.AudioAttributesImplApi26Parcelizer((CharSequence) String.valueOf(editable)).toString()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void read(IAccountAccessor iAccountAccessor) {
        iAccountAccessor.write().write(efmt.MediaBrowserCompatItemReceiver.INSTANCE);
    }

    static final class MediaBrowserCompatItemReceiver extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int IconCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                NewNumberOtpResendRequest<pii> newNumberOtpResendRequest = IAccountAccessor.this.write().read();
                final IAccountAccessor iAccountAccessor = IAccountAccessor.this;
                this.IconCompatParcelizer = 1;
                if (newNumberOtpResendRequest.write(new getValidationToken() { // from class: o.IAccountAccessor.MediaBrowserCompatItemReceiver.5
                    private static long read;
                    private static char[] write;
                    private static final byte[] $$c = {34, TarConstants.LF_NORMAL, 18, 42};
                    private static final int $$d = 113;
                    private static int $10 = 0;
                    private static int $11 = 1;
                    private static final byte[] $$a = {30, -87, -70, -33, -20, 6, -5, 19, 10, 3, 8, -9};
                    private static final int $$b = 54;
                    private static int RemoteActionCompatParcelizer = 0;
                    private static int AudioAttributesCompatParcelizer = 1;

                    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
                    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    private static java.lang.String $$e(int r6, byte r7, int r8) {
                        /*
                            int r8 = r8 * 2
                            int r8 = 3 - r8
                            int r7 = r7 * 2
                            int r7 = 1 - r7
                            byte[] r0 = o.IAccountAccessor.MediaBrowserCompatItemReceiver.AnonymousClass5.$$c
                            int r6 = r6 * 3
                            int r6 = 101 - r6
                            byte[] r1 = new byte[r7]
                            r2 = 0
                            if (r0 != 0) goto L16
                            r3 = r7
                            r5 = r2
                            goto L28
                        L16:
                            r3 = r2
                        L17:
                            byte r4 = (byte) r6
                            int r5 = r3 + 1
                            r1[r3] = r4
                            int r8 = r8 + 1
                            if (r5 != r7) goto L26
                            java.lang.String r6 = new java.lang.String
                            r6.<init>(r1, r2)
                            return r6
                        L26:
                            r3 = r0[r8]
                        L28:
                            int r6 = r6 + r3
                            r3 = r5
                            goto L17
                        */
                        throw new UnsupportedOperationException("Method not decompiled: o.IAccountAccessor.MediaBrowserCompatItemReceiver.AnonymousClass5.$$e(int, byte, int):java.lang.String");
                    }

                    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
                    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x002a). Please report as a decompilation issue!!! */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    private static void b(int r6, byte r7, int r8, java.lang.Object[] r9) {
                        /*
                            int r0 = r8 + 3
                            int r7 = r7 * 3
                            int r7 = r7 + 4
                            int r6 = 114 - r6
                            byte[] r1 = o.IAccountAccessor.MediaBrowserCompatItemReceiver.AnonymousClass5.$$a
                            byte[] r0 = new byte[r0]
                            int r8 = r8 + 2
                            r2 = 0
                            if (r1 != 0) goto L14
                            r3 = r7
                            r4 = r2
                            goto L2a
                        L14:
                            r3 = r2
                        L15:
                            byte r4 = (byte) r6
                            r0[r3] = r4
                            if (r3 != r8) goto L22
                            java.lang.String r6 = new java.lang.String
                            r6.<init>(r0, r2)
                            r9[r2] = r6
                            return
                        L22:
                            r4 = r1[r7]
                            int r3 = r3 + 1
                            r5 = r3
                            r3 = r7
                            r7 = r4
                            r4 = r5
                        L2a:
                            int r7 = -r7
                            int r6 = r6 + r7
                            int r7 = r3 + 1
                            int r6 = r6 + 6
                            r3 = r4
                            goto L15
                        */
                        throw new UnsupportedOperationException("Method not decompiled: o.IAccountAccessor.MediaBrowserCompatItemReceiver.AnonymousClass5.b(int, byte, int, java.lang.Object[]):void");
                    }

                    @Override // kotlin.getValidationToken
                    public final /* bridge */ /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        int i2 = 2 % 2;
                        int i3 = RemoteActionCompatParcelizer + 37;
                        AudioAttributesCompatParcelizer = i3 % 128;
                        int i4 = i3 % 2;
                        Object objIconCompatParcelizer2 = IconCompatParcelizer((pii) obj2);
                        int i5 = RemoteActionCompatParcelizer + 51;
                        AudioAttributesCompatParcelizer = i5 % 128;
                        if (i5 % 2 == 0) {
                            int i6 = 31 / 0;
                        }
                        return objIconCompatParcelizer2;
                    }

                    private Object IconCompatParcelizer(pii piiVar) {
                        int i2 = 2 % 2;
                        if (piiVar instanceof pii.write) {
                            int i3 = RemoteActionCompatParcelizer + 85;
                            AudioAttributesCompatParcelizer = i3 % 128;
                            if (i3 % 2 == 0) {
                                IAccountAccessor iAccountAccessor2 = iAccountAccessor;
                                IAccountAccessor iAccountAccessor3 = iAccountAccessor2;
                                String string = iAccountAccessor2.getString(R.string.please_fill_required_fields);
                                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
                                CmcdConfigurationRequestConfig.AudioAttributesCompatParcelizer(iAccountAccessor3, string, 0);
                                Object obj2 = null;
                                obj2.hashCode();
                                throw null;
                            }
                            IAccountAccessor iAccountAccessor4 = iAccountAccessor;
                            IAccountAccessor iAccountAccessor5 = iAccountAccessor4;
                            String string2 = iAccountAccessor4.getString(R.string.please_fill_required_fields);
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string2, "");
                            CmcdConfigurationRequestConfig.AudioAttributesCompatParcelizer(iAccountAccessor5, string2, 0);
                            int i4 = AudioAttributesCompatParcelizer + 33;
                            RemoteActionCompatParcelizer = i4 % 128;
                            int i5 = i4 % 2;
                        } else if (piiVar instanceof pii.AudioAttributesCompatParcelizer) {
                            int i6 = AudioAttributesCompatParcelizer + 87;
                            RemoteActionCompatParcelizer = i6 % 128;
                            int i7 = i6 % 2;
                            iAccountAccessor.IconCompatParcelizer(((pii.AudioAttributesCompatParcelizer) piiVar).read());
                        }
                        return getShowPopup.INSTANCE;
                    }

                    private static void a(char c, int i2, int i3, Object[] objArr) throws Throwable {
                        int i4 = 2;
                        int i5 = 2 % 2;
                        DownloadService downloadService = new DownloadService();
                        long[] jArr = new long[i3];
                        downloadService.write = 0;
                        int i6 = $10 + 23;
                        $11 = i6 % 128;
                        int i7 = i6 % 2;
                        while (downloadService.write < i3) {
                            int i8 = $10 + 69;
                            $11 = i8 % 128;
                            if (i8 % i4 == 0) {
                                int i9 = downloadService.write;
                                try {
                                    Object[] objArr2 = {Integer.valueOf(write[i2 / i9])};
                                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(1659892375);
                                    if (objRemoteActionCompatParcelizer == null) {
                                        byte b = (byte) 0;
                                        byte b2 = b;
                                        objRemoteActionCompatParcelizer = startForeground.read((char) (36620 - TextUtils.lastIndexOf("", '0', 0)), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 2339, ImageFormat.getBitsPerPixel(0) + 29, 480654850, false, $$e(b, b2, b2), new Class[]{Integer.TYPE});
                                    }
                                    try {
                                        Object[] objArr3 = {Long.valueOf(((Long) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).longValue()), Long.valueOf(i9), Long.valueOf(read), Integer.valueOf(c)};
                                        Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(955774634);
                                        if (objRemoteActionCompatParcelizer2 == null) {
                                            objRemoteActionCompatParcelizer2 = startForeground.read((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 9700, 26 - TextUtils.getOffsetBefore("", 0), 1186869823, false, "d", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                                        }
                                        jArr[i9] = ((Long) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).longValue();
                                        Object[] objArr4 = {downloadService, downloadService};
                                        Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-452087292);
                                        if (objRemoteActionCompatParcelizer3 == null) {
                                            objRemoteActionCompatParcelizer3 = startForeground.read((char) ((-1) - TextUtils.lastIndexOf("", '0', 0)), 23783 - Process.getGidForName(""), (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 32, -1690012015, false, "b", new Class[]{Object.class, Object.class});
                                        }
                                        ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                                    } catch (Throwable th) {
                                        Throwable cause = th.getCause();
                                        if (cause == null) {
                                            throw th;
                                        }
                                        throw cause;
                                    }
                                } catch (Throwable th2) {
                                    Throwable cause2 = th2.getCause();
                                    if (cause2 == null) {
                                        throw th2;
                                    }
                                    throw cause2;
                                }
                            } else {
                                int i10 = downloadService.write;
                                Object[] objArr5 = {Integer.valueOf(write[i2 + i10])};
                                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(1659892375);
                                if (objRemoteActionCompatParcelizer4 == null) {
                                    byte b3 = (byte) 0;
                                    byte b4 = b3;
                                    objRemoteActionCompatParcelizer4 = startForeground.read((char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 36621), TextUtils.indexOf((CharSequence) "", '0', 0) + 2341, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 28, 480654850, false, $$e(b3, b4, b4), new Class[]{Integer.TYPE});
                                }
                                Object[] objArr6 = {Long.valueOf(((Long) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).longValue()), Long.valueOf(i10), Long.valueOf(read), Integer.valueOf(c)};
                                Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(955774634);
                                if (objRemoteActionCompatParcelizer5 == null) {
                                    objRemoteActionCompatParcelizer5 = startForeground.read((char) TextUtils.getTrimmedLength(""), (ViewConfiguration.getScrollBarSize() >> 8) + 9701, ExpandableListView.getPackedPositionChild(0L) + 27, 1186869823, false, "d", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                                }
                                jArr[i10] = ((Long) ((Method) objRemoteActionCompatParcelizer5).invoke(null, objArr6)).longValue();
                                Object[] objArr7 = {downloadService, downloadService};
                                Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(-452087292);
                                if (objRemoteActionCompatParcelizer6 == null) {
                                    objRemoteActionCompatParcelizer6 = startForeground.read((char) View.resolveSizeAndState(0, 0, 0), TextUtils.getOffsetAfter("", 0) + 23784, ImageFormat.getBitsPerPixel(0) + 34, -1690012015, false, "b", new Class[]{Object.class, Object.class});
                                }
                                ((Method) objRemoteActionCompatParcelizer6).invoke(null, objArr7);
                            }
                            i4 = 2;
                        }
                        char[] cArr = new char[i3];
                        downloadService.write = 0;
                        while (downloadService.write < i3) {
                            cArr[downloadService.write] = (char) jArr[downloadService.write];
                            Object[] objArr8 = {downloadService, downloadService};
                            Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(-452087292);
                            if (objRemoteActionCompatParcelizer7 == null) {
                                objRemoteActionCompatParcelizer7 = startForeground.read((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), View.MeasureSpec.getMode(0) + 23784, 34 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), -1690012015, false, "b", new Class[]{Object.class, Object.class});
                            }
                            ((Method) objRemoteActionCompatParcelizer7).invoke(null, objArr8);
                        }
                        String str = new String(cArr);
                        int i11 = $11 + 95;
                        $10 = i11 % 128;
                        int i12 = i11 % 2;
                        objArr[0] = str;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:106:0x0a84  */
                    /* JADX WARN: Removed duplicated region for block: B:131:0x0d4d  */
                    /* JADX WARN: Removed duplicated region for block: B:192:0x127e  */
                    /* JADX WARN: Removed duplicated region for block: B:309:0x2aa8 A[Catch: all -> 0x030c, TryCatch #6 {all -> 0x030c, blocks: (B:13:0x01eb, B:15:0x01f8, B:16:0x0238, B:31:0x0417, B:33:0x0424, B:34:0x0461, B:43:0x056e, B:45:0x057b, B:47:0x05bc, B:78:0x0816, B:80:0x081c, B:81:0x0852, B:111:0x0b60, B:113:0x0b6d, B:115:0x0baf, B:122:0x0cb9, B:124:0x0cc6, B:125:0x0d09, B:133:0x0daf, B:135:0x0dbc, B:136:0x0dfe, B:142:0x0f22, B:144:0x0f2f, B:145:0x0f6e, B:158:0x1114, B:160:0x1121, B:161:0x1169, B:209:0x14f8, B:211:0x1505, B:212:0x1546, B:231:0x1718, B:233:0x1725, B:234:0x176f, B:241:0x1849, B:243:0x184f, B:244:0x1882, B:247:0x193e, B:249:0x1950, B:250:0x198d, B:256:0x1a5e, B:258:0x1a6b, B:259:0x1aae, B:261:0x1ab7, B:263:0x1acf, B:264:0x1b0e, B:307:0x2a9b, B:309:0x2aa8, B:310:0x2aec, B:326:0x2f83, B:328:0x2f90, B:330:0x2fe0, B:389:0x3659, B:391:0x3666, B:392:0x36a1, B:336:0x30f6, B:338:0x3103, B:339:0x313e, B:313:0x2af8, B:315:0x2b10, B:316:0x2b4f, B:273:0x27aa, B:275:0x27b7, B:277:0x2809, B:284:0x2825, B:286:0x2832, B:287:0x287a, B:215:0x1598, B:217:0x15a5, B:218:0x15e7, B:193:0x131a, B:195:0x1327, B:196:0x1360, B:52:0x06a0, B:54:0x06ad, B:55:0x06ee, B:62:0x0742, B:64:0x074f, B:65:0x078d, B:68:0x079a, B:70:0x07a7, B:71:0x07e9), top: B:417:0x01eb }] */
                    /* JADX WARN: Removed duplicated region for block: B:312:0x2af5  */
                    /* JADX WARN: Removed duplicated region for block: B:313:0x2af8 A[Catch: all -> 0x030c, TryCatch #6 {all -> 0x030c, blocks: (B:13:0x01eb, B:15:0x01f8, B:16:0x0238, B:31:0x0417, B:33:0x0424, B:34:0x0461, B:43:0x056e, B:45:0x057b, B:47:0x05bc, B:78:0x0816, B:80:0x081c, B:81:0x0852, B:111:0x0b60, B:113:0x0b6d, B:115:0x0baf, B:122:0x0cb9, B:124:0x0cc6, B:125:0x0d09, B:133:0x0daf, B:135:0x0dbc, B:136:0x0dfe, B:142:0x0f22, B:144:0x0f2f, B:145:0x0f6e, B:158:0x1114, B:160:0x1121, B:161:0x1169, B:209:0x14f8, B:211:0x1505, B:212:0x1546, B:231:0x1718, B:233:0x1725, B:234:0x176f, B:241:0x1849, B:243:0x184f, B:244:0x1882, B:247:0x193e, B:249:0x1950, B:250:0x198d, B:256:0x1a5e, B:258:0x1a6b, B:259:0x1aae, B:261:0x1ab7, B:263:0x1acf, B:264:0x1b0e, B:307:0x2a9b, B:309:0x2aa8, B:310:0x2aec, B:326:0x2f83, B:328:0x2f90, B:330:0x2fe0, B:389:0x3659, B:391:0x3666, B:392:0x36a1, B:336:0x30f6, B:338:0x3103, B:339:0x313e, B:313:0x2af8, B:315:0x2b10, B:316:0x2b4f, B:273:0x27aa, B:275:0x27b7, B:277:0x2809, B:284:0x2825, B:286:0x2832, B:287:0x287a, B:215:0x1598, B:217:0x15a5, B:218:0x15e7, B:193:0x131a, B:195:0x1327, B:196:0x1360, B:52:0x06a0, B:54:0x06ad, B:55:0x06ee, B:62:0x0742, B:64:0x074f, B:65:0x078d, B:68:0x079a, B:70:0x07a7, B:71:0x07e9), top: B:417:0x01eb }] */
                    /* JADX WARN: Removed duplicated region for block: B:347:0x3222  */
                    /* JADX WARN: Removed duplicated region for block: B:351:0x33f8  */
                    /* JADX WARN: Removed duplicated region for block: B:374:0x3517 A[Catch: all -> 0x35f9, TryCatch #5 {all -> 0x35f9, blocks: (B:372:0x350a, B:374:0x3517, B:375:0x3555), top: B:415:0x350a, outer: #0 }] */
                    /* JADX WARN: Removed duplicated region for block: B:379:0x35f2 A[Catch: Exception -> 0x3603, TryCatch #0 {Exception -> 0x3603, blocks: (B:371:0x34b2, B:377:0x35a0, B:379:0x35f2, B:383:0x35fa, B:385:0x3601, B:386:0x3602, B:372:0x350a, B:374:0x3517, B:375:0x3555), top: B:407:0x34b2, inners: #5 }] */
                    /* JADX WARN: Removed duplicated region for block: B:380:0x35f5  */
                    /* JADX WARN: Removed duplicated region for block: B:391:0x3666 A[Catch: all -> 0x030c, TryCatch #6 {all -> 0x030c, blocks: (B:13:0x01eb, B:15:0x01f8, B:16:0x0238, B:31:0x0417, B:33:0x0424, B:34:0x0461, B:43:0x056e, B:45:0x057b, B:47:0x05bc, B:78:0x0816, B:80:0x081c, B:81:0x0852, B:111:0x0b60, B:113:0x0b6d, B:115:0x0baf, B:122:0x0cb9, B:124:0x0cc6, B:125:0x0d09, B:133:0x0daf, B:135:0x0dbc, B:136:0x0dfe, B:142:0x0f22, B:144:0x0f2f, B:145:0x0f6e, B:158:0x1114, B:160:0x1121, B:161:0x1169, B:209:0x14f8, B:211:0x1505, B:212:0x1546, B:231:0x1718, B:233:0x1725, B:234:0x176f, B:241:0x1849, B:243:0x184f, B:244:0x1882, B:247:0x193e, B:249:0x1950, B:250:0x198d, B:256:0x1a5e, B:258:0x1a6b, B:259:0x1aae, B:261:0x1ab7, B:263:0x1acf, B:264:0x1b0e, B:307:0x2a9b, B:309:0x2aa8, B:310:0x2aec, B:326:0x2f83, B:328:0x2f90, B:330:0x2fe0, B:389:0x3659, B:391:0x3666, B:392:0x36a1, B:336:0x30f6, B:338:0x3103, B:339:0x313e, B:313:0x2af8, B:315:0x2b10, B:316:0x2b4f, B:273:0x27aa, B:275:0x27b7, B:277:0x2809, B:284:0x2825, B:286:0x2832, B:287:0x287a, B:215:0x1598, B:217:0x15a5, B:218:0x15e7, B:193:0x131a, B:195:0x1327, B:196:0x1360, B:52:0x06a0, B:54:0x06ad, B:55:0x06ee, B:62:0x0742, B:64:0x074f, B:65:0x078d, B:68:0x079a, B:70:0x07a7, B:71:0x07e9), top: B:417:0x01eb }] */
                    /* JADX WARN: Removed duplicated region for block: B:440:0x349c A[SYNTHETIC] */
                    /* JADX WARN: Removed duplicated region for block: B:59:0x06ff  */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public static java.lang.Object[] RemoteActionCompatParcelizer(android.content.Context r49, int r50, int r51, int r52) throws java.lang.Throwable {
                        /*
                            Method dump skipped, instruction units count: 14371
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: o.IAccountAccessor.MediaBrowserCompatItemReceiver.AnonymousClass5.RemoteActionCompatParcelizer(android.content.Context, int, int, int):java.lang.Object[]");
                    }

                    static {
                        char[] cArr = new char[2156];
                        ByteBuffer.wrap("Ü#\u008a\u000bp¯ßS\u0085¯s\u0084Ú1\u0080ÕopÕ\u0011\u0083»j>ÐÀ¿Te\u0007Ó¥ºX`íÎ\u009fµ&cÃÊL°ý\u001e\u0099Å%³Ä\u001agÜ#\u008a\u000bp¯ßS\u0085¯s\u0084Ú1\u0080ÕopÕ\u0011\u0083»j>ÐÀ¿Te\u0016Ó¨ºL`úÎ¥µ1cÀÊa°í\u001e\u009dÅ Ü#\u008a\u000bp¯ßS\u0085¯s\u0084Ú1\u0080ÕopÕ\u0011\u0083»j>ÐÀ¿Te\u0015Ó¸ºR`ü¥Bó}\tÒ¦7üÎ\nï£Pù¼\u0016\u0000¬zúÖ\u0013\u0003©®Æ\u0005\u001ckªÄÃ;\u0019\u0097·èÌ\\\u001a\u008e³\u0010É\u008egü¼QÊ£c\u0011¹eêt¼]Féé\u0011³øEÐìn¶ÀY3ãRµê\\jìêºÃ@wï\u008fµfCYêþ°\u001d_óåÎ³iZëà\u0011Ó\u001a\u0085%\u007f\u0097Ð\u007f\u008aØ|¨Õ\u0003\u008f¯`\u007fÚ\b\u008c¦e\u001bßç°Wj\u001bÜ\u0099µqoÇÜ#\u008a\u000bp«ßQ\u0085ásÌÚp\u0080ÚodÕ\u0002\u0083»j#ÐÎ¿dÜ~\u008a\u0000päßG\u0085ïs\u008cÚ*\u0080\u0097ofÕ\u0012\u0083¶j?ÐÇ¿be\u0002Ó\u009eºR`úÎ\u008eµ\ncÔÊ}°ý\u001eØ·\u008aáô\u001b\u0010´³î\u001b\u0018x±Þëc\u0004\u0092¾æèB\u0001Ë»3Ô\u0096\u000eö¸jÑ¦\u000b\u000e¥zÞþ\b ¡\u0089Û\tu/\u0094.Â\u00118¾\u0097[Íù;\u008b\u0092>È\u009b'u\u009d\u0013Ë½\"o\u0098É÷o-\t\u009b¢òS(¼\u0086\u0084ý7\u0095çÃ\u008f9$\u0096ÂÌf:\u0012ÜP\u008a.\u0005¢S\u009d©2\u0006×\\uª\u0007\u0003²Y\u0017¶÷\f\u009fZ=³ã\tGfï¼\u008a\n5cë¹S\u0017VlººT\u0013ÿizÇE\u001c¦jIÃí\u0019\u0088w+ÌÕ\u001a{Ü#\u008a\u001cp³ßV\u0085ôs\u0086Ú3\u0080\u0096ovÕ\u001e\u0083¼jbÐÆ¿ne\u000bÓ´ºj`ÒÎ×µ%cÂÊ|°þ\u007fr)MÓâ|\u0007&¥Ð×yb#ÇÌ)vO áÉ3s\u0095\u001c3ÆUpþ\u0019\bÃ£mÞ\u0016RÀ¬i2\u0013\u00ad½×fe\u0010Ø¹ cC\u009aâÌÊ6n\u0099\u0092Ãn5L\u009cúÆ\u0015) \u0093ÑÅf,é\u0096\u001aù¾W\\\u0001\"ûÆTe\u000e×ø¨Q\u0010\u000bÿä\u0018^=\b\u009fá\u001c[þÜb\u008a\np«ßV\u0085åsÍÚ0\u0080Üo`Ü#\u008a\u001fp¸ßJ\u0085ãsÌÚ8\u0080ÐoxÕ\u0012\u0083¡j4ÐÛ¿\u007fe\u0003Ó¬ºOÜb\u008a\np§ßP\u0085ós\u0085Ü~\u008a\u0000päßU\u0085òs\u008cÚ:\u0080ÌowÕ\u0003\u0083üj ÐÉ¿ee\u0013Ó§º]`üÎ\u008eµ cÂÊv°üÜk\u008a\np¤ß\\aõ7\u0083Í1bß8`Î\u0019g£=\u001eÒîh\u0087>(×êmC\u0002æØÁn,\u0007ÐÝts\u0006\b»Þ\u0017wý\rw£\u0015xã\u000eH§ê}\u009f\u00134¨í~x\u0014\b\u00ad\u0090C\u0019\u0018Ñ®iD\u0007\u001d®³RHâ\u001e\u0098´,Ü|\u008a\np¸ßV\u0085és\u0090Ú*\u0080\u0097ogÕ\u000e\u0083¡jcÐÊ¿oeHÓ¥ºY`ýÎ\u008fµ2c\u009eÊt°þ\u001e\u009cÅj³Á\u001acÀ\u0016®½\u0015dÃñ©\u0081\u0010\u0019þ\u0090¥\\\u0013àù\u008e '\u000eÑõk0Uf#\u009c\u00913\u007fiÀ\u009f¹6\u0003l¾\u0083N9'o\u0088\u0086J<ãSF\u0089a?\u008cVp\u008cÔ\"¦Y\u001b\u008f·&H\\Èòî)\u000e_ÿöB&wp\u0001\u008a³%]\u007fâ\u0089\u009b !z\u009c\u0095l/\u0005yª\u0090h*ÁEd\u009fC)®@R\u009aö4\u0084O9\u0099\u00950jJêäÌ?#IÍàjWæ\u0001\u0090û\"TÌ\u000esø\nQ°\u000b\räý^\u0094\b;áù[P4õîÒX?1ÃëgE\u0015>¨è\u0004Aû;{\u0095]N³8^\u0091ûÜ|\u008a\np¸ßV\u0085és\u0090Ú*\u0080\u0097ogÕ\u000e\u0083¡jcÐÊ¿oeHÓ¥ºY`ýÎ\u008fµ2c\u009eÊa°á\u001eÇÅ)³É\u001aað\u0012¦e\\Íó5©\u009b_íø\u001f®#T\u0084ûv¡ßWðþ\u000f¤êKLñ>§\u0082N\u0014ôçÜz\u008a\rp¥ß]\u0085çs\u0096Ú;\u0080Êo`Ü#\u008a\u001cp³ßV\u0085ôs\u0086Ú3\u0080\u0096orÕ\u0005\u0083³j ÐÍ¿|e\tÓ³ºW`°Î\u008dµ<cÞÊw°á\u001e\u009eÅ7³\u008a\u001aqÀ\u0004®«\u0015OÃó©\u009c\u00103þ¼¥O\u0013÷ù\u0096 &\u000eÌõ7£\u001e\t¶ð@Ñ\\\u0087f}ÐÒ4\u0088\u009b~ó×S\u008déb\u0007Øa\u008eÏg\u0004Ýã²[hqÞÉ·lm\u0081Ãð¸Nn¦Ç\u0003½ß\u0013æÈI¾±\u0017\u0010Íc£Õ\u0018=ÎÇ¤ù\u001dzóÞ¨1\u001e\u0095ôè\u00adO\u0003ïø\u0015®d\u0095²Ã\u00889>\u0096ÚÌu:\u001d\u0093½É\u0007&é\u009c\u008fÊ!#ê\u0099\röµ,\u009f\u009a'ó\u0082)f\u0087\u001cü§*N\u0083ïùoW\u0017\u008c¦úSSá\u0089Âç>\\Ã\u008aià\u0004Y\u0092·)ìÈZ:°\u0002é½8\u0017n(\u0094\u0087;baÀ\u0097²>\u0007d¢\u008bL1*g\u0084\u008eO4¨[\u0010\u008117\u0099^g\u0084Þ*ªQ>\u0087å.NTÞú±!/WúþX$=J\u0089ñ}'ÄM¤ô;\u001a\u009eA3÷Ò\u001d¤D\u0007ê¤\u0011^G/Ü#\u008a\np¾ßF\u0085¯s\u008aÚ0\u0080Ðo`ÕX\u0083»j#ÐÁ¿\u007feHÓ¢ºP`ðÎ\u008fµ1cÃÊv°ü\u001e\u009fÅ-³Ä\u001agÀS®ª\u0015Xºðì±\u0016\u001f¹çãV\u00157¼\u0091æk\tÀ³¢Üy\u008a\u0001p¡ßK\u0085ïs\u0094Ú0Üo\u008a\u0007p¸ßJ\u0085ís\u008aÚ+\u0080Ô¢fô\u0018\u000eü¡Mûê\r\u0094¤\"þÔ\u0011o«\u001býä\u00141®ÕÁe\u001b\u0017\u00adºÄAÈ@\u009e7d\u009fËg\u0091\u0082gïÎ\u0014Ük\u008a\np¤ß@\u0085òs\u008aÚ=\u0018\u0095Nô´Z\u001b¾A\f·t\u001eÃD\u0018«\u0092\u0011±G\u001aÜk\u008a\np¤ß@\u0085òs\u008aÚ=\u0080æolÕO\u0083äj\u0012Ð\u009e¿?Ü~\u008a\u0000päßU\u0085òs\u008cÚ:\u0080ÌowÕ\u0003\u0083üj ÐÇ¿oe\u0003Ó\u00adÜ\u007f\u008a\u000bp¡Üi\u008a\u0002p¿ßI\u0085ás\u0097Ú1\u0080ËÜM\u008a\u001fpºß\u0005\u0085Òs\u0096Ú0\u0080Ío}Õ\u001a\u0083·jmÐÎ¿de\u0014Óáº\u007f`÷Î\u0088µ:cÝÊvT\u0014\u0002Xø÷W\u000e\r¶ûÓRc\bÀç\u001e]j\u000bÀâ4X\u00937'íV[ô2\u0011èæFÅ=cë\u009bBj8¯\u0096\u0088M+ÜM\u008a\u0001p®ßW\u0085ïs\u008aÚ:\u0080\u0099oGÕ3\u0083\u0099jmÐÊ¿~e\u000fÓ\u00adºH`¿Î\u009cµ:cÂÊ3°ö\u001eÑÅr³ø\u001a4ÀI^%\b[ò¿]\u0016\u0007ºñÊXa\u0002\u0095í.W^\u0001ìÜk\u008a\u0000p¦ßA\u0085æs\u008aÚ-\u0080Ñ\u0006¸PÏªg\u0005\u009f_z©\u0017Ü~\u008a\u000ep¤ßF\u0085ès\u0096õÉ£·YSöâ¬EZ;ó\u008d©{FÀü´ªKC\u0098ùm\u0096ÝL¿ú\u0012}-+SÑ·~\u001d$¶ÒÂ{c!\u008fÎ+t\n\"ðË{q\u0096\u001e-=\u0092Ü~\u008a\u0000päßV\u0085ås\u0080Ú+\u0080ËoqËÛ\u0097ÓÁ\u00ad;I\u0094êÎX8'\u0091\u009fËp$\u0097\u009eªÈ\r!\u008f\u009baôÓ.¨\u0098\u0018×J\u0081:{\u0086Ôi\u008eÿx»ÑF\u008b¯Ü~\u008a\u0000päßG\u0085õs\u008aÚ2\u0080Ýo:Õ\u0011\u0083»j#ÐÏ¿ne\u0014Ó±ºN`öÎ\u0094µ!2Êd«\u009e\u00051ákS\u009d+4\u009cn7\u0081Æ;²m\u0018\u0084Ã>nQÏ\u008b©=\u0005Tï\u008eW 8\u0093öÅ\u0097?9\u0090ÝÊo<\u0017\u0095 Ï{ ñ\u009aÒÌy%ÿ\u009fFðò*\u0090\u009c\u0003õÙ/:\u0081Qúç,J\u0085ëÿ}Q\u0011\u008a«üSUü\u008f¿á=Z\u009e\u008c=Ük\u008a\np¤ß@\u0085òs\u008aÚ=\u0080\u0096osÕ\u0018\u0083½j*ÐÄ¿ne9Ó²ºX`ôÎÕµ2cÕÊ}°ë\u001e\u009bÅ-³ÄÜk\u008a\np¤ß@\u0085òs\u008aÚ=\u0080\u0096obÕ\u0015\u0083½j5Ð\u0090¿=e\u0016ÓîºJ`ýÎ\u0095µ-c\u0088Ê%°þ\feZ\u000e «\u000fLUâ£\u0088\n\u007fPÄ¿~\u0005\u0012S\u0083º$\u0000Öomµ\u0007\u0003¡jW°Î\u001e\u008cec³\u0088\u001a2`çÎ\u0082\u0015$cÌÊ~\u0010\u001a~µÅj\u0013àyÇÀTÜ~\u008a\u0000päßG\u0085ïs\u008cÚ*\u0080Õo{Õ\u0016\u0083¶j(ÐÚÜ~\u008a\u0000päßG\u0085ïs\u008cÚ*\u0080ÐoyÕ\u0016\u0083µj(Ð\u0086¿ie\u0013Ó¨ºP`ûÎÔµ3cÙÊ}°é\u001e\u008cÅ6³×\u001apÀ\u0014®¶\u0015OÜM\u008a\u0001p®ßW\u0085ïs\u008aÚ:\u0080\u0094olÕO\u0083äÜ~\u008a\u0000päßG\u0085õs\u008aÚ2\u0080Ýo:Õ\u0013\u0083»j>ÐØ¿ge\u0007Ó¸º\u0012`öÎ\u009e©\u008dÿÿ\u0005Lª¤ðX{Q-5×\u0097xe\"\u009aÔ¤}\u001c'îÈ\u000er2$\u0083Í\u0014wé\u0018\u0012Â\"t\u0087\u001dgÇÛi½Ü}\u008a\np§ßP\u0085®s\u008bÚ)\u0080\u0097oyÕ\u0016\u0083»j#ÐÃ¿ne\u001fÓ²Ü}\u008a\np§ßP\u0085®s\u0090Ú8\u0080\u0097orÕ\u0016\u0083¹j(Ð÷¿he\u0007Ó¬ºY`íÎ\u009bÜ}\u008a\np§ßP\u0085®s\u0090Ú8\u0080\u0097oxÕ\u0014\u0083¶j\u0012ÐÌ¿ne\bÓ²ºU`ëÎ\u0083Ü~\u008a\u0000päßN\u0085ås\u0091Ú0\u0080ÜoxÕY\u0083³j#ÐÌ¿ye\tÓ¨ºX`±Î\u008bµ0cÝÊf°ê\u0082ðÔ\u008e.j\u0081ÉÛa-\u0002\u0084¤Þ\u00191ë\u008b\u009cÝ14¶\u008e\báä;\u009e\u008d+äí>\u007f\u0090\u0015ë¶=[Ü~\u008a\u0000päßJ\u0085äs\u008eÚp\u0080ÛoaÕ\u001e\u0083¾j)Ð\u0086¿me\u000fÓ¯º[`úÎ\u0088µ%cÂÊz°à\u001e\u009dÜ~\u008a\u0000päßU\u0085òs\u008cÚ:\u0080ÌowÕ\u0003\u0083üj/ÐÝ¿be\nÓ¥º\u0012`ùÎ\u0093µ;c×Êv°ü\u001e\u0099Å6³Î\u001alÀ\tÜ~\u008a\u0000päßV\u0085ùs\u0090Ú*\u0080ÜoyÕY\u0083°j8ÐÁ¿ge\u0002ÓïºZ`öÎ\u0094µ2cÕÊa°þ\u001e\u009bÅ-³É\u001av\u008e\u0095Øë\"\u000f\u008d½×\u0012!{\u0088ÁÒ7=\u0092\u0087ÃÑ\\8Þ\u00827íÎ7ï\u0081_è¾2\u0018\u009cuç\u00901=\u0098\u0091â\u000bLe\u0097Êá>H\u0099\u0092äüZG¾\u0091\t´ìâ\u0092\u0018v·Áíw\u001b\u001f²¨èD\u0007ô½Ëë\"\u0002ª¸S×õ\r\u0090»}ÒÈ\bd¦\u0006Ý \u000bG¢óØlv\t\u00ad¿Û[rä(Á~¿\u0084[+ìqZ\u00872.\u0085ti\u009bÙ!\u0097w\t\u009e\u009e$|KÙ\u0091÷'\u001cNö\u0094I:)A\u008e\u0097!>ÊDXê81\u009cG}îÏ4²Z\u0015áí7G]:Ü$Ü \u008aOÜ6IÊ`\u00836«Ì\u000fcó9\u000fÏ2f\u009b<tÓÁi\u0088?\u0002Ö\u0084lx\u0003ÎÜ#\u008a\u000bp¯ßS\u0085¯s\u0090Ú1\u0080Úo\u007fÕ\u0012\u0083¦jbÐÊ¿je\u0015Ó¤º^`þÎ\u0094µ1cïÊt°ë\u001e\u0087Å=³Ã\u0013øEÐ¿t\u0010\u0088Jt¼K\u0015êO\u0001 ¤\u001aÉL}¥¹\u001f\u0014pµªÓ\u001ccu\u0083\u00ad¨û\u0080\u0001$®Øô$\u0002\u001b«ºñQ\u001eô¤\u0099ò-\u001bé¡RÎå\u0014\u0080¢?ËÓÜ#\u008a\u001cp³ßV\u0085¯s\u0092Ú;\u0080ÔoaÕ(\u0083¦j?ÐÉ¿he\u0003Ü#\u008a\u001cp³ßV\u0085ôs\u0086Ú3\u0080\u0096oxÕ\u001e\u0083°jbÐÄ¿be\u0004Ó¢ºc`òÎ\u009bµ9cÜÊ|°í\u001e¶Å ³Â\u001a`À\b®¿\u0015dÃç©\u0094\u0010\u0001þº¥\u0004\u0013öù\u008f/Ùyñ\u0083U,©vU\u0080{)×s7\u009c±&êpX\u0099ÄâÓ´ûN_á£»_MqäÝ¾=Q»ëó½KTÐî=Ü#\u008a\u000bp¯ßS\u0085¯s\u0090Ú1\u0080Úo\u007fÕ\u0012\u0083¦jbÐÊ¿xe\u0012Ó§ºS`óÎ\u009eµ0cÂÊw©^ÿa\u0005Îª+ð\u0089\u0006û¯Nõë\u001a\u0005 cöÍ\u001f\u001f¥¹Ê\u001f\u0010y¦ÞÏ2\u0015\u0096»áÀG\u0016¡¿\nÅ\u0096kæ°fÆ°o\u0011µiÛ\u008b`5¶\u0084Ü#\u008a\u000bp¯ßS\u0085¯s\u0081Ú-\u0080ÍouÕ\u0014\u0083±j(ÑB\u0087j}ÎÒ2\u0088Î~à×L\u008d¬b\u0012Øo\u008eÁgC üöÔ\fp£\u008cùp\u000f^¦òü\u0012\u0013¦©Íÿj\u0016üXR\u000ezôÞ[\"\u0001Þ÷ð^\\\u0004¼ë\nQt\u0007ÊîYtO\"gØÃw?-ÃÛírA(¡Ç\u000e}v+ÍÂFÜ#\u008a\u000bp¯ßS\u0085¯s\u0081Ú-\u0080ÍodÕ\u0010\u0083³j$ÐØ¿hÜ#\u008a\u000bp¯ßS\u0085¯s\u0081Ú-\u0080ÍoKÕ\u001e\u0083¿j(Ü#\u008a\u000bp«ßQ\u0085ásÌÚ:\u0080ÖocÕ\u0019\u0083¾j\"ÐÉ¿oe\u0015Óîº\u0012`çÎ\u0098µzcÒÊ`°ú\u001e\u0082Ü#\u008a\u0002p¤ßQ\u0085¯s\u0094Ú7\u0080×opÕ\u0018\u0083¥j>Ð\u0087¿Ie\u0015Óµºo`÷Î\u009bµ'cÕÊw°È\u001e\u0086Å(³Ã\u001agÀ\u000fï\u008e¹²C\u0015ìç¶N@aé\u009a³{\\Éæµ°\rY\u0094ãvÜ<\u008a\tp¬ß\u0005\u0085º\u0096\u0084À¸:\u001f\u0095íÏD9k\u0090\u008aÊ{%ß\u009f¶ÉZ \u0087\u009anõÜ/²Ük\u008a\u001dp«ßI\u0085ìs\u008cÚ=\u0080\u0097osÕ\u0018\u0083¾j)ÐÎ¿be\u0015Ó©º\u0012`ìÎ\u0095Ü`\u008a\u0006p¨ßb\u0085Ìs¦Ú\r\u0080æovÕ\u0004\u0083¦jcÐÛ¿dÜ#\u008a\np¾ßF\u0085¯s\u008eÚ;\u0080Ýo}Õ\u0016\u0083\u008dj.ÐÇ¿oe\u0003Ó¢ºO`±Î\u0082µ8cÜÜn\u008a\u0003p¿ß@\u0085ós\u0097Ú?\u0080Úo\u007fÕ\u0004Ü#\u008a\np¾ßF\u0085¯s\u008eÚ1\u0080ÌozÕ\u0003\u0083¡\u0082\u0015Ô=.\u009d\u0081gÛ×-ú\u0084\fÞà1U\u008b/Ý\u00884\u0014\u008eÿáY;#\u008dØä$>Í\u0090¼ëL=ç\u0094UîÈ@¬\u009b\\íéDY\u009e'Ü#\u008a\u001fp¸ßJ\u0085ãsÌÚ=\u0080ÉoaÕ\u001e\u0083¼j+ÐÇ\n¨\\ã¦E\t¢S\u0005¥i\fÎV2A[\u0017síÓB)\u0018\u0099î´GK\u001d¨ò\u001fHl\u001e\u0085÷EM¢\"\u001cøxNÐ'(ý\u0082Sñ(\u0002þ«W\u001e-\u0084\u0083¾X\f.ð\u0087\u0019]j3Í\u0088m^\u00834à\u008dwcÅ8=\u008e\u008bdñ=I\u0093²hO>a\u0094Êm'Ã \u0098\u0019n~ÄÛ".getBytes(CharsetNames.ISO_8859_1)).asCharBuffer().get(cArr, 0, 2156);
                        write = cArr;
                        read = 3544254624588139119L;
                    }
                }, this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            return getShowPopup.INSTANCE;
        }

        MediaBrowserCompatItemReceiver(SampleVideos<? super MediaBrowserCompatItemReceiver> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return IAccountAccessor.this.new MediaBrowserCompatItemReceiver(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaBrowserCompatItemReceiver) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void AudioAttributesImplBaseParcelizer() {
        IAccountAccessor iAccountAccessor = this;
        setBitrateKbps.read(iAccountAccessor, new MediaBrowserCompatItemReceiver(null));
        setBitrateKbps.read(iAccountAccessor, new MediaMetadataCompat(null));
    }

    static final class MediaMetadataCompat extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<GmsLogger> setupdatedstatusIconCompatParcelizer = IAccountAccessor.this.write().IconCompatParcelizer();
                final IAccountAccessor iAccountAccessor = IAccountAccessor.this;
                this.RemoteActionCompatParcelizer = 1;
                if (setupdatedstatusIconCompatParcelizer.write(new getValidationToken() { // from class: o.IAccountAccessor.MediaMetadataCompat.1
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return AudioAttributesCompatParcelizer((GmsLogger) obj2);
                    }

                    private Object AudioAttributesCompatParcelizer(GmsLogger gmsLogger) {
                        IAccountAccessor iAccountAccessor2 = iAccountAccessor;
                        setSourceChunk setsourcechunk = iAccountAccessor2.RemoteActionCompatParcelizer().read;
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(setsourcechunk, "");
                        iAccountAccessor2.write(setsourcechunk, gmsLogger);
                        iAccountAccessor.RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer.setAlpha(gmsLogger.MediaDescriptionCompat() ? 1.0f : 0.5f);
                        return getShowPopup.INSTANCE;
                    }
                }, this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            throw new PlanDetailsCreator();
        }

        MediaMetadataCompat(SampleVideos<? super MediaMetadataCompat> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return IAccountAccessor.this.new MediaMetadataCompat(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaMetadataCompat) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void RemoteActionCompatParcelizer(final setSourceChunk p0) {
        EditText editText = p0.AudioAttributesImplApi21Parcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(editText, "");
        editText.addTextChangedListener(new read());
        EditText editText2 = p0.MediaBrowserCompatCustomActionResultReceiver;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(editText2, "");
        editText2.addTextChangedListener(new AudioAttributesCompatParcelizer());
        EditText editText3 = p0.IconCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(editText3, "");
        editText3.addTextChangedListener(new IconCompatParcelizer());
        EditText editText4 = p0.AudioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(editText4, "");
        editText4.addTextChangedListener(new RemoteActionCompatParcelizer());
        EditText editText5 = p0.RemoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(editText5, "");
        editText5.addTextChangedListener(new MediaBrowserCompatCustomActionResultReceiver());
        EditText editText6 = p0.read;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(editText6, "");
        editText6.addTextChangedListener(new AudioAttributesImplApi21Parcelizer());
        EditText editText7 = p0.AudioAttributesImplBaseParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(editText7, "");
        editText7.addTextChangedListener(new AudioAttributesImplBaseParcelizer());
        EditText editText8 = p0.AudioAttributesImplApi26Parcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(editText8, "");
        editText8.addTextChangedListener(new AudioAttributesImplApi26Parcelizer());
        AutoCompleteTextView autoCompleteTextView = p0.write;
        autoCompleteTextView.setOnClickListener(new View.OnClickListener() { // from class: o.HideFirstParty
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IAccountAccessor.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, p0);
            }
        });
        autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: o.wfmt
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
                IAccountAccessor.write(this.write, adapterView, i);
            }
        });
    }

    /* JADX INFO: renamed from: o.IAccountAccessor$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Landroidx/fragment/app/Fragment;", "RemoteActionCompatParcelizer", "()Landroidx/fragment/app/Fragment;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass4 extends MagicModuleUseCase implements getCreatedOnDateMs<Fragment> {
        private /* synthetic */ Fragment $IconCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.$IconCompatParcelizer;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(Fragment fragment) {
            super(0);
            this.$IconCompatParcelizer = fragment;
        }
    }

    /* JADX INFO: renamed from: o.IAccountAccessor$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/TypeResolutionContext;", "read", "()Lo/TypeResolutionContext;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass1 extends MagicModuleUseCase implements getCreatedOnDateMs<TypeResolutionContext> {
        private /* synthetic */ getCreatedOnDateMs $IconCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final TypeResolutionContext invoke() {
            return (TypeResolutionContext) this.$IconCompatParcelizer.invoke();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(getCreatedOnDateMs getcreatedondatems) {
            super(0);
            this.$IconCompatParcelizer = getcreatedondatems;
        }
    }

    /* JADX INFO: renamed from: o.IAccountAccessor$10, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/hasMixIns;", "IconCompatParcelizer", "()Lo/hasMixIns;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass10 extends MagicModuleUseCase implements getCreatedOnDateMs<hasMixIns> {
        private /* synthetic */ RenewEligible $write;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final hasMixIns invoke() {
            return _resolveFieldVsGetter.write(this.$write).getViewModelStore();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass10(RenewEligible renewEligible) {
            super(0);
            this.$write = renewEligible;
        }
    }

    /* JADX INFO: renamed from: o.IAccountAccessor$9, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/withFieldVisibility;", "IconCompatParcelizer", "()Lo/withFieldVisibility;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass9 extends MagicModuleUseCase implements getCreatedOnDateMs<withFieldVisibility> {
        private /* synthetic */ getCreatedOnDateMs $RemoteActionCompatParcelizer = null;
        private /* synthetic */ RenewEligible $read;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final withFieldVisibility invoke() {
            TypeResolutionContext typeResolutionContextWrite = _resolveFieldVsGetter.write(this.$read);
            anyExplicitsWithoutIgnoral anyexplicitswithoutignoral = typeResolutionContextWrite instanceof anyExplicitsWithoutIgnoral ? (anyExplicitsWithoutIgnoral) typeResolutionContextWrite : null;
            return anyexplicitswithoutignoral != null ? anyexplicitswithoutignoral.getDefaultViewModelCreationExtras() : withFieldVisibility.write.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass9(RenewEligible renewEligible) {
            super(0);
            this.$read = renewEligible;
        }
    }

    /* JADX INFO: renamed from: o.IAccountAccessor$7, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/VisibilityChecker$RemoteActionCompatParcelizer;", "write", "()Lo/VisibilityChecker$RemoteActionCompatParcelizer;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass7 extends MagicModuleUseCase implements getCreatedOnDateMs<VisibilityChecker.RemoteActionCompatParcelizer> {
        private /* synthetic */ Fragment $RemoteActionCompatParcelizer;
        private /* synthetic */ RenewEligible $write;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final VisibilityChecker.RemoteActionCompatParcelizer invoke() {
            VisibilityChecker.RemoteActionCompatParcelizer defaultViewModelProviderFactory;
            TypeResolutionContext typeResolutionContextWrite = _resolveFieldVsGetter.write(this.$write);
            anyExplicitsWithoutIgnoral anyexplicitswithoutignoral = typeResolutionContextWrite instanceof anyExplicitsWithoutIgnoral ? (anyExplicitsWithoutIgnoral) typeResolutionContextWrite : null;
            return (anyexplicitswithoutignoral == null || (defaultViewModelProviderFactory = anyexplicitswithoutignoral.getDefaultViewModelProviderFactory()) == null) ? this.$RemoteActionCompatParcelizer.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass7(Fragment fragment, RenewEligible renewEligible) {
            super(0);
            this.$RemoteActionCompatParcelizer = fragment;
            this.$write = renewEligible;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RemoteActionCompatParcelizer(IAccountAccessor iAccountAccessor, setSourceChunk setsourcechunk) {
        setBitrateKbps.AudioAttributesCompatParcelizer(iAccountAccessor);
        setsourcechunk.write.showDropDown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void write(IAccountAccessor iAccountAccessor, AdapterView adapterView, int i) {
        iAccountAccessor.write().write(new efmt.AudioAttributesImplApi21Parcelizer(adapterView.getItemAtPosition(i).toString()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void write(setSourceChunk p0, GmsLogger p1) {
        TextInputLayout textInputLayout = p0.MediaBrowserCompatMediaItem;
        Editable text = p0.AudioAttributesImplApi21Parcelizer.getText();
        String string = null;
        textInputLayout.setError((text == null || text.length() == 0 || p1.getMediaMetadataCompat()) ? null : getString(R.string.name_validation_error));
        textInputLayout.setErrorEnabled(textInputLayout.AudioAttributesImplBaseParcelizer() != null);
        TextInputLayout textInputLayout2 = p0.MediaMetadataCompat;
        Editable text2 = p0.MediaBrowserCompatCustomActionResultReceiver.getText();
        textInputLayout2.setError((text2 == null || text2.length() == 0 || p1.getMediaDescriptionCompat()) ? null : getString(R.string.phone_validation_error));
        textInputLayout2.setErrorEnabled(textInputLayout2.AudioAttributesImplBaseParcelizer() != null);
        TextInputLayout textInputLayout3 = p0.MediaBrowserCompatItemReceiver;
        Editable text3 = p0.IconCompatParcelizer.getText();
        textInputLayout3.setError((text3 == null || text3.length() == 0 || p1.getMediaBrowserCompatItemReceiver()) ? null : getString(R.string.phone_validation_error));
        textInputLayout3.setErrorEnabled(textInputLayout3.AudioAttributesImplBaseParcelizer() != null);
        TextInputLayout textInputLayout4 = p0.MediaBrowserCompatSearchResultReceiver;
        Editable text4 = p0.AudioAttributesImplBaseParcelizer.getText();
        textInputLayout4.setError((text4 == null || text4.length() == 0 || p1.getAudioAttributesImplBaseParcelizer()) ? null : getString(R.string.city_validation_error));
        textInputLayout4.setErrorEnabled(textInputLayout4.AudioAttributesImplBaseParcelizer() != null);
        TextInputLayout textInputLayout5 = p0.MediaDescriptionCompat;
        Editable text5 = p0.AudioAttributesImplApi26Parcelizer.getText();
        if (text5 != null && text5.length() != 0 && !p1.getMediaBrowserCompatMediaItem()) {
            string = getString(R.string.pincode_validation_error);
        }
        textInputLayout5.setError(string);
        textInputLayout5.setErrorEnabled(textInputLayout5.AudioAttributesImplBaseParcelizer() != null);
        if (p1.AudioAttributesImplBaseParcelizer().isEmpty()) {
            return;
        }
        p0.write.setAdapter(new ArrayAdapter(requireContext(), R.layout.layout_state_dropdown_item, p1.AudioAttributesImplBaseParcelizer()));
    }

    /* JADX INFO: renamed from: o.IAccountAccessor$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/hasMixIns;", "AudioAttributesCompatParcelizer", "()Lo/hasMixIns;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass3 extends MagicModuleUseCase implements getCreatedOnDateMs<hasMixIns> {
        private /* synthetic */ Fragment $RemoteActionCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final hasMixIns invoke() {
            return this.$RemoteActionCompatParcelizer.requireActivity().getViewModelStore();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(Fragment fragment) {
            super(0);
            this.$RemoteActionCompatParcelizer = fragment;
        }
    }

    /* JADX INFO: renamed from: o.IAccountAccessor$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/withFieldVisibility;", "write", "()Lo/withFieldVisibility;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass2 extends MagicModuleUseCase implements getCreatedOnDateMs<withFieldVisibility> {
        private /* synthetic */ Fragment $RemoteActionCompatParcelizer;
        private /* synthetic */ getCreatedOnDateMs $write = null;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final withFieldVisibility invoke() {
            return this.$RemoteActionCompatParcelizer.requireActivity().getDefaultViewModelCreationExtras();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Fragment fragment) {
            super(0);
            this.$RemoteActionCompatParcelizer = fragment;
        }
    }

    /* JADX INFO: renamed from: o.IAccountAccessor$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/VisibilityChecker$RemoteActionCompatParcelizer;", "IconCompatParcelizer", "()Lo/VisibilityChecker$RemoteActionCompatParcelizer;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass5 extends MagicModuleUseCase implements getCreatedOnDateMs<VisibilityChecker.RemoteActionCompatParcelizer> {
        private /* synthetic */ Fragment $write;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final VisibilityChecker.RemoteActionCompatParcelizer invoke() {
            return this.$write.requireActivity().getDefaultViewModelProviderFactory();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(Fragment fragment) {
            super(0);
            this.$write = fragment;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void IconCompatParcelizer(getOrStartHandlerThread p0) {
        MethodInvocation methodInvocation = new MethodInvocation(p0.AudioAttributesImplBaseParcelizer(), p0.AudioAttributesImplApi26Parcelizer(), p0.read(), p0.RemoteActionCompatParcelizer(), p0.AudioAttributesCompatParcelizer(), p0.write(), p0.IconCompatParcelizer(), p0.AudioAttributesImplApi21Parcelizer(), p0.MediaBrowserCompatCustomActionResultReceiver());
        _doAddInjectable _doaddinjectableIconCompatParcelizer = getParentFragmentManager().IconCompatParcelizer();
        IGmsServiceBrokerStub.Companion companion = IGmsServiceBrokerStub.INSTANCE;
        _doaddinjectableIconCompatParcelizer.write(R.id.container, IGmsServiceBrokerStub.Companion.RemoteActionCompatParcelizer(methodInvocation)).read((String) null).write();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.IconCompatParcelizer = null;
        super.onDestroyView();
    }
}
