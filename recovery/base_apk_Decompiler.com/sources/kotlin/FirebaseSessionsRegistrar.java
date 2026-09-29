package kotlin;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.activity.result.ActivityResult;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import com.google.android.exoplayer2.RendererCapabilities;
import com.marrow.designsystem.theme.AppTheme;
import com.marrow.designsystem.theme.ThemeKt;
import com.marrow.ui.activities.learn.video.LessonVideoActivity;
import com.marrow.ui.activities.plan.PlanActivity;
import com.marrow2.ui.video.revision_video.VideoRevisionListViewModel;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.VisibilityChecker;
import kotlin._init_lambda4;
import kotlin.ah;
import kotlin.component5;
import kotlin.withPropertyNamingStrategy;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0003R\u001b\u0010\u0015\u001a\u00020\u00138CX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0010\u001a\f\u0012\b\u0012\u0006*\u00020\u00180\u00180\u00178\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0019\u001a\u00020\u001e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001f"}, d2 = {"Lo/FirebaseSessionsRegistrar;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Landroid/view/LayoutInflater;", "p0", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "write", "onDestroyView", "RemoteActionCompatParcelizer", "Lcom/marrow2/ui/video/revision_video/VideoRevisionListViewModel;", "Lo/RenewEligible;", "AudioAttributesCompatParcelizer", "()Lcom/marrow2/ui/video/revision_video/VideoRevisionListViewModel;", "Lo/r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8;", "Landroid/content/Intent;", "IconCompatParcelizer", "Lo/r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8;", "Lo/FirebaseSessionsRegistrar$RemoteActionCompatParcelizer;", "read", "Lo/FirebaseSessionsRegistrar$RemoteActionCompatParcelizer;", "Lo/FirebaseSessionsRegistrar$read;", "Lo/FirebaseSessionsRegistrar$read;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FirebaseSessionsRegistrar extends FirebaseAnalyticsKtxRegistrar {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8<Intent> write;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final RenewEligible AudioAttributesCompatParcelizer;
    private final RemoteActionCompatParcelizer read;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final read IconCompatParcelizer;

    public FirebaseSessionsRegistrar() {
        FirebaseSessionsRegistrar firebaseSessionsRegistrar = this;
        this.AudioAttributesCompatParcelizer = _resolveFieldVsGetter.RemoteActionCompatParcelizer(toMagicModuleMetaDataUcModel.write(VideoRevisionListViewModel.class), new AnonymousClass5(firebaseSessionsRegistrar), new AnonymousClass3(firebaseSessionsRegistrar), new AnonymousClass2(firebaseSessionsRegistrar));
        r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8<Intent> r8lambdaibk6u1hk7j3awkl_wn934v2uvi8RegisterForActivityResult = registerForActivityResult(new _init_lambda4.AudioAttributesImplApi26Parcelizer(), new r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM() { // from class: o.defaultdisableHardwareAcceleration
            @Override // kotlin.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM
            public final void IconCompatParcelizer(Object obj) {
                FirebaseSessionsRegistrar.IconCompatParcelizer(this.AudioAttributesCompatParcelizer, (ActivityResult) obj);
            }
        });
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(r8lambdaibk6u1hk7j3awkl_wn934v2uvi8RegisterForActivityResult, "");
        this.write = r8lambdaibk6u1hk7j3awkl_wn934v2uvi8RegisterForActivityResult;
        this.read = new RemoteActionCompatParcelizer();
        this.IconCompatParcelizer = new read();
    }

    /* JADX INFO: renamed from: o.FirebaseSessionsRegistrar$AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/FirebaseSessionsRegistrar$AudioAttributesCompatParcelizer;", "", "<init>", "()V", "Lo/toAttestationRequestBody;", "p0", "Lo/FirebaseSessionsRegistrar;", "write", "(Lo/toAttestationRequestBody;)Lo/FirebaseSessionsRegistrar;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getMagicModuleMeta
        public static FirebaseSessionsRegistrar write(toAttestationRequestBody p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            FirebaseSessionsRegistrar firebaseSessionsRegistrar = new FirebaseSessionsRegistrar();
            firebaseSessionsRegistrar.setArguments(p0.AudioAttributesCompatParcelizer());
            return firebaseSessionsRegistrar;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final VideoRevisionListViewModel AudioAttributesCompatParcelizer() {
        return (VideoRevisionListViewModel) this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IconCompatParcelizer(FirebaseSessionsRegistrar firebaseSessionsRegistrar, ActivityResult activityResult) {
        toMagicModuleMetaRepoModel.write(activityResult, "");
        firebaseSessionsRegistrar.AudioAttributesCompatParcelizer().read(component5.RatingCompat.INSTANCE);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        Context contextRequireContext = requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        ComposeView composeView = new ComposeView(contextRequireContext, null, 0, 6, null);
        composeView.setViewCompositionStrategy(withPropertyNamingStrategy.AudioAttributesCompatParcelizer.INSTANCE);
        composeView.setContent(multiplyFft.IconCompatParcelizer(279292535, true, new MagicModuleSubmissionRequestBody() { // from class: o.HCaptcha1
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return FirebaseSessionsRegistrar.IconCompatParcelizer(this.RemoteActionCompatParcelizer, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
            }
        }));
        return composeView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(final FirebaseSessionsRegistrar firebaseSessionsRegistrar, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(279292535, i, -1, "com.marrow2.ui.video.revision_video.VideoRevisionListFragment.onCreateView.<anonymous>.<anonymous> (VideoRevisionListFragment.kt:54)");
            }
            ThemeKt.read((AppTheme) null, false, (MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup>) multiplyFft.AudioAttributesCompatParcelizer(1789198327, true, new MagicModuleSubmissionRequestBody() { // from class: o.RemoteConfigRegistrar
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return FirebaseSessionsRegistrar.write(this.read, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                }
            }, _handleunrecognizedcharacterescape, 54), _handleunrecognizedcharacterescape, RendererCapabilities.MODE_SUPPORT_MASK, 3);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(final FirebaseSessionsRegistrar firebaseSessionsRegistrar, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(1789198327, i, -1, "com.marrow2.ui.video.revision_video.VideoRevisionListFragment.onCreateView.<anonymous>.<anonymous>.<anonymous> (VideoRevisionListFragment.kt:55)");
            }
            VideoRevisionListViewModel videoRevisionListViewModelAudioAttributesCompatParcelizer = firebaseSessionsRegistrar.AudioAttributesCompatParcelizer();
            boolean zIconCompatParcelizer = _handleunrecognizedcharacterescape.IconCompatParcelizer(firebaseSessionsRegistrar);
            Object objOnPause = _handleunrecognizedcharacterescape.onPause();
            if (zIconCompatParcelizer || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause = new getCreatedOnDateMs() { // from class: o.FirebaseRemoteConfig
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return FirebaseSessionsRegistrar.MediaBrowserCompatItemReceiver(this.read);
                    }
                };
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
            }
            getCreatedOnDateMs getcreatedondatems = (getCreatedOnDateMs) objOnPause;
            boolean zIconCompatParcelizer2 = _handleunrecognizedcharacterescape.IconCompatParcelizer(firebaseSessionsRegistrar);
            Object objOnPause2 = _handleunrecognizedcharacterescape.onPause();
            if (zIconCompatParcelizer2 || objOnPause2 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause2 = new getCreatedOnDateMs() { // from class: o.FirebaseRemoteConfigKtxRegistrar
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return FirebaseSessionsRegistrar.MediaBrowserCompatCustomActionResultReceiver(this.read);
                    }
                };
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause2);
            }
            getCreatedOnDateMs getcreatedondatems2 = (getCreatedOnDateMs) objOnPause2;
            boolean zIconCompatParcelizer3 = _handleunrecognizedcharacterescape.IconCompatParcelizer(firebaseSessionsRegistrar);
            Object objOnPause3 = _handleunrecognizedcharacterescape.onPause();
            if (zIconCompatParcelizer3 || objOnPause3 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause3 = new getAnswerMap() { // from class: o.HCaptchaConfig
                    @Override // kotlin.getAnswerMap
                    public final Object invoke(Object obj) {
                        return FirebaseSessionsRegistrar.read(this.AudioAttributesCompatParcelizer, (String) obj);
                    }
                };
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause3);
            }
            getAnswerMap getanswermap = (getAnswerMap) objOnPause3;
            boolean zIconCompatParcelizer4 = _handleunrecognizedcharacterescape.IconCompatParcelizer(firebaseSessionsRegistrar);
            Object objOnPause4 = _handleunrecognizedcharacterescape.onPause();
            if (zIconCompatParcelizer4 || objOnPause4 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause4 = new getCreatedOnDateMs() { // from class: o.defaultapiEndpoint
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return FirebaseSessionsRegistrar.AudioAttributesImplApi26Parcelizer(this.IconCompatParcelizer);
                    }
                };
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause4);
            }
            getCreatedOnDateMs getcreatedondatems3 = (getCreatedOnDateMs) objOnPause4;
            boolean zIconCompatParcelizer5 = _handleunrecognizedcharacterescape.IconCompatParcelizer(firebaseSessionsRegistrar);
            Object objOnPause5 = _handleunrecognizedcharacterescape.onPause();
            if (zIconCompatParcelizer5 || objOnPause5 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause5 = new getCreatedOnDateMs() { // from class: o.defaultcustomTheme
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return FirebaseSessionsRegistrar.AudioAttributesImplBaseParcelizer(this.RemoteActionCompatParcelizer);
                    }
                };
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause5);
            }
            getCreatedOnDateMs getcreatedondatems4 = (getCreatedOnDateMs) objOnPause5;
            boolean zIconCompatParcelizer6 = _handleunrecognizedcharacterescape.IconCompatParcelizer(firebaseSessionsRegistrar);
            Object objOnPause6 = _handleunrecognizedcharacterescape.onPause();
            if (zIconCompatParcelizer6 || objOnPause6 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause6 = new MagicModuleSubmissionRequestBody() { // from class: o.defaultdiagnosticLog
                    @Override // kotlin.MagicModuleSubmissionRequestBody
                    public final Object invoke(Object obj, Object obj2) {
                        return FirebaseSessionsRegistrar.read(this.IconCompatParcelizer, (String) obj, (String) obj2);
                    }
                };
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause6);
            }
            defaultjsSrc.IconCompatParcelizer(videoRevisionListViewModelAudioAttributesCompatParcelizer, (getCreatedOnDateMs<getShowPopup>) getcreatedondatems, (getCreatedOnDateMs<getShowPopup>) getcreatedondatems2, (getAnswerMap<? super String, getShowPopup>) getanswermap, (getCreatedOnDateMs<getShowPopup>) getcreatedondatems3, (getCreatedOnDateMs<getShowPopup>) getcreatedondatems4, (MagicModuleSubmissionRequestBody<? super String, ? super String, getShowPopup>) objOnPause6, _handleunrecognizedcharacterescape, 0);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaBrowserCompatItemReceiver(FirebaseSessionsRegistrar firebaseSessionsRegistrar) {
        firebaseSessionsRegistrar.requireActivity().getIconCompatParcelizer().RemoteActionCompatParcelizer();
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesImplApi26Parcelizer(FirebaseSessionsRegistrar firebaseSessionsRegistrar) {
        Toast.makeText(firebaseSessionsRegistrar.requireContext(), "Navigate to Index", 0).show();
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaBrowserCompatCustomActionResultReceiver(FirebaseSessionsRegistrar firebaseSessionsRegistrar) {
        PlanActivity.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = PlanActivity.RemoteActionCompatParcelizer;
        Context contextRequireContext = firebaseSessionsRegistrar.requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        String lowerCase = "PRO_VIDEO_ACCESSED".toLowerCase(Locale.ROOT);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lowerCase, "");
        firebaseSessionsRegistrar.startActivity(PlanActivity.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(contextRequireContext, "Pro Subscription Dialog", lowerCase));
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(FirebaseSessionsRegistrar firebaseSessionsRegistrar, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        LessonVideoActivity.Companion companion = LessonVideoActivity.INSTANCE;
        Context contextRequireContext = firebaseSessionsRegistrar.requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        firebaseSessionsRegistrar.startActivity(LessonVideoActivity.Companion.AudioAttributesCompatParcelizer(contextRequireContext, str, false, true, true, false));
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesImplBaseParcelizer(FirebaseSessionsRegistrar firebaseSessionsRegistrar) {
        firebaseSessionsRegistrar.AudioAttributesCompatParcelizer().read(component5.AudioAttributesCompatParcelizer.INSTANCE);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(FirebaseSessionsRegistrar firebaseSessionsRegistrar, String str, String str2) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        ah.Companion companion = ah.INSTANCE;
        Context contextRequireContext = firebaseSessionsRegistrar.requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        firebaseSessionsRegistrar.write.read(ah.Companion.read(contextRequireContext, new ReviewInfo(str, str2)));
        return getShowPopup.INSTANCE;
    }

    public static final class RemoteActionCompatParcelizer extends setColorSpan {
        RemoteActionCompatParcelizer() {
        }

        @Override // kotlin.setColorSpan
        public final void AudioAttributesCompatParcelizer(String str, String str2) {
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            FirebaseSessionsRegistrar.this.AudioAttributesCompatParcelizer().read(new component5.MediaBrowserCompatMediaItem(str2, str));
        }

        @Override // kotlin.setColorSpan, android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            super.onReceive(context, intent);
        }
    }

    public static final class read extends setItalicSpan {
        read() {
        }

        @Override // kotlin.setItalicSpan
        public final void IconCompatParcelizer(int i, String str) {
            toMagicModuleMetaRepoModel.write(str, "");
            FirebaseSessionsRegistrar.this.AudioAttributesCompatParcelizer().read(new component5.AudioAttributesImplBaseParcelizer(i, str));
        }

        @Override // kotlin.setItalicSpan, android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            super.onReceive(context, intent);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View p0, Bundle p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        super.onViewCreated(p0, p1);
        write();
    }

    private final void write() {
        getProvider getprovider = getProvider.getInstance(requireContext());
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.read;
        getprovider.registerReceiver(remoteActionCompatParcelizer, remoteActionCompatParcelizer.AudioAttributesCompatParcelizer());
        getProvider getprovider2 = getProvider.getInstance(requireContext());
        read readVar = this.IconCompatParcelizer;
        getprovider2.registerReceiver(readVar, readVar.AudioAttributesCompatParcelizer());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        RemoteActionCompatParcelizer();
        super.onDestroyView();
    }

    private final void RemoteActionCompatParcelizer() {
        getProvider.getInstance(requireContext()).IconCompatParcelizer(this.IconCompatParcelizer);
        getProvider.getInstance(requireContext()).IconCompatParcelizer(this.read);
    }

    /* JADX INFO: renamed from: o.FirebaseSessionsRegistrar$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/hasMixIns;", "write", "()Lo/hasMixIns;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass5 extends MagicModuleUseCase implements getCreatedOnDateMs<hasMixIns> {
        private /* synthetic */ Fragment $IconCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final hasMixIns invoke() {
            return this.$IconCompatParcelizer.requireActivity().getViewModelStore();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(Fragment fragment) {
            super(0);
            this.$IconCompatParcelizer = fragment;
        }
    }

    /* JADX INFO: renamed from: o.FirebaseSessionsRegistrar$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/withFieldVisibility;", "AudioAttributesCompatParcelizer", "()Lo/withFieldVisibility;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass3 extends MagicModuleUseCase implements getCreatedOnDateMs<withFieldVisibility> {
        private /* synthetic */ Fragment $AudioAttributesCompatParcelizer;
        private /* synthetic */ getCreatedOnDateMs $IconCompatParcelizer = null;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final withFieldVisibility invoke() {
            return this.$AudioAttributesCompatParcelizer.requireActivity().getDefaultViewModelCreationExtras();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(Fragment fragment) {
            super(0);
            this.$AudioAttributesCompatParcelizer = fragment;
        }
    }

    /* JADX INFO: renamed from: o.FirebaseSessionsRegistrar$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/VisibilityChecker$RemoteActionCompatParcelizer;", "read", "()Lo/VisibilityChecker$RemoteActionCompatParcelizer;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass2 extends MagicModuleUseCase implements getCreatedOnDateMs<VisibilityChecker.RemoteActionCompatParcelizer> {
        private /* synthetic */ Fragment $write;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final VisibilityChecker.RemoteActionCompatParcelizer invoke() {
            return this.$write.requireActivity().getDefaultViewModelProviderFactory();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Fragment fragment) {
            super(0);
            this.$write = fragment;
        }
    }
}
