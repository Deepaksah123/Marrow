package kotlin;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.marrow.R;
import com.marrow2.ui.internal_web.ui.main.InternalWebViewModel;
import kotlin.MagicModuleUseCaseImplWhenMappings;
import kotlin.Metadata;
import kotlin.ResolvingResultCallbacks;
import kotlin.SaveAccountLinkingTokenResult;
import kotlin.VisibilityChecker;
import kotlin.getAutofillClient;
import kotlin.onFailure;
import kotlin.withFieldVisibility;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0003J!\u0010\u0014\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0007\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J1\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00162\b\u0010\u0007\u001a\u0004\u0018\u00010\u00172\u0006\u0010\t\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u0010\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0010\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001d\u0010\u0003J\u000f\u0010\u001e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001e\u0010\u0003J'\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001a\u0010\u001fJ\u000f\u0010 \u001a\u00020\rH\u0002¢\u0006\u0004\b \u0010\u0003J\u000f\u0010!\u001a\u00020\rH\u0002¢\u0006\u0004\b!\u0010\u0003J\u000f\u0010\"\u001a\u00020\rH\u0016¢\u0006\u0004\b\"\u0010\u0003R\u001b\u0010\u0010\u001a\u00020#8CX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0018\u0010$\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b&\u0010)R\u0014\u0010\u001a\u001a\u00020(8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b$\u0010*"}, d2 = {"Lo/ResultCallback;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Landroid/view/LayoutInflater;", "p0", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "read", "AudioAttributesImplBaseParcelizer", "", "Lo/Response;", "RemoteActionCompatParcelizer", "(Ljava/lang/String;Lo/Response;)V", "Landroid/webkit/WebView;", "Landroid/net/Uri;", "p3", "", "IconCompatParcelizer", "(Landroid/webkit/WebView;Landroid/net/Uri;Ljava/lang/String;Lo/Response;)Z", "(Ljava/lang/String;)Z", "MediaMetadataCompat", "AudioAttributesImplApi26Parcelizer", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "MediaBrowserCompatCustomActionResultReceiver", "AudioAttributesImplApi21Parcelizer", "onDestroyView", "Lcom/marrow2/ui/internal_web/ui/main/InternalWebViewModel;", "AudioAttributesCompatParcelizer", "Lo/RenewEligible;", "write", "()Lcom/marrow2/ui/internal_web/ui/main/InternalWebViewModel;", "Lo/getFullEncryptionKeyUri;", "Lo/getFullEncryptionKeyUri;", "()Lo/getFullEncryptionKeyUri;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ResultCallback extends onSuccess {

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final RenewEligible read;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private getFullEncryptionKeyUri AudioAttributesCompatParcelizer;

    public ResultCallback() {
        ResultCallback resultCallback = this;
        RenewEligible renewEligibleWrite = getRenewExpiresOn.write(RenewEligibleCompanion.read, new AnonymousClass1(new AnonymousClass2(resultCallback)));
        this.read = _resolveFieldVsGetter.RemoteActionCompatParcelizer(toMagicModuleMetaDataUcModel.write(InternalWebViewModel.class), new AnonymousClass5(renewEligibleWrite), new AnonymousClass3(renewEligibleWrite), new AnonymousClass4(resultCallback, renewEligibleWrite));
    }

    /* JADX INFO: renamed from: o.ResultCallback$read, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/ResultCallback$read;", "", "<init>", "()V", "Lo/canceledPendingResult;", "p0", "Lo/ResultCallback;", "AudioAttributesCompatParcelizer", "(Lo/canceledPendingResult;)Lo/ResultCallback;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static ResultCallback AudioAttributesCompatParcelizer(canceledPendingResult p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            ResultCallback resultCallback = new ResultCallback();
            resultCallback.setArguments(p0.IconCompatParcelizer());
            return resultCallback;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InternalWebViewModel write() {
        return (InternalWebViewModel) this.read.RemoteActionCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final getFullEncryptionKeyUri AudioAttributesCompatParcelizer() {
        getFullEncryptionKeyUri getfullencryptionkeyuri = this.AudioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.write(getfullencryptionkeyuri);
        return getfullencryptionkeyuri;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        this.AudioAttributesCompatParcelizer = getFullEncryptionKeyUri.IconCompatParcelizer(p0, p1);
        AudioAttributesCompatParcelizer().MediaBrowserCompatCustomActionResultReceiver.setNavigationOnClickListener(new View.OnClickListener() { // from class: o.ResultTransform
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ResultCallback.AudioAttributesImplApi21Parcelizer(this.RemoteActionCompatParcelizer);
            }
        });
        AudioAttributesCompatParcelizer().write.getSettings().setJavaScriptEnabled(true);
        LinearLayout linearLayoutIconCompatParcelizer = AudioAttributesCompatParcelizer().IconCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayoutIconCompatParcelizer, "");
        return linearLayoutIconCompatParcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AudioAttributesImplApi21Parcelizer(ResultCallback resultCallback) {
        maybeGetTypeVariable activity = resultCallback.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View p0, Bundle p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        super.onViewCreated(p0, p1);
        read();
        AudioAttributesImplBaseParcelizer();
        Button button = AudioAttributesCompatParcelizer().IconCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(button, "");
        bytesRead.IconCompatParcelizer(button, (getCreatedOnDateMs<getShowPopup>) new getCreatedOnDateMs() { // from class: o.onResult
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return ResultCallback.AudioAttributesImplBaseParcelizer(this.write);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesImplBaseParcelizer(ResultCallback resultCallback) {
        ProgressBar progressBar = resultCallback.AudioAttributesCompatParcelizer().RemoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(progressBar, "");
        bytesRead.AudioAttributesImplApi21Parcelizer(progressBar);
        resultCallback.RemoteActionCompatParcelizer(resultCallback.write().AudioAttributesCompatParcelizer().IconCompatParcelizer().getIconCompatParcelizer(), resultCallback.write().AudioAttributesCompatParcelizer().IconCompatParcelizer().getRead());
        return getShowPopup.INSTANCE;
    }

    private final void read() {
        Toolbar toolbar = AudioAttributesCompatParcelizer().MediaBrowserCompatCustomActionResultReceiver;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(toolbar, "");
        getHttpMethodString.read((View) toolbar, true, false, true, true, 0, 50);
        FrameLayout frameLayout = AudioAttributesCompatParcelizer().read;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(frameLayout, "");
        getHttpMethodString.read((View) frameLayout, false, true, true, true, 0, 49);
    }

    static final class AudioAttributesCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<onUnresolvableFailure> setupdatedstatusAudioAttributesCompatParcelizer = ResultCallback.this.write().AudioAttributesCompatParcelizer();
                final ResultCallback resultCallback = ResultCallback.this;
                this.write = 1;
                if (setupdatedstatusAudioAttributesCompatParcelizer.write(new getValidationToken() { // from class: o.ResultCallback.AudioAttributesCompatParcelizer.4
                    @Override // kotlin.getValidationToken
                    public final /* bridge */ /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return IconCompatParcelizer((onUnresolvableFailure) obj2);
                    }

                    private Object IconCompatParcelizer(onUnresolvableFailure onunresolvablefailure) {
                        resultCallback.AudioAttributesCompatParcelizer().MediaBrowserCompatCustomActionResultReceiver.setTitle(onunresolvablefailure.getRemoteActionCompatParcelizer());
                        resultCallback.RemoteActionCompatParcelizer(onunresolvablefailure.getIconCompatParcelizer(), onunresolvablefailure.getRead());
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

        AudioAttributesCompatParcelizer(SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return ResultCallback.this.new AudioAttributesCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void AudioAttributesImplBaseParcelizer() {
        ResultCallback resultCallback = this;
        setBitrateKbps.read(resultCallback, new AudioAttributesCompatParcelizer(null));
        setBitrateKbps.read(resultCallback, new RemoteActionCompatParcelizer(null));
        setBitrateKbps.read(resultCallback, new AudioAttributesImplBaseParcelizer(null));
        setBitrateKbps.read(resultCallback, new MediaBrowserCompatItemReceiver(null));
    }

    /* JADX INFO: renamed from: o.ResultCallback$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Landroidx/fragment/app/Fragment;", "IconCompatParcelizer", "()Landroidx/fragment/app/Fragment;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass2 extends MagicModuleUseCase implements getCreatedOnDateMs<Fragment> {
        private /* synthetic */ Fragment $RemoteActionCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.$RemoteActionCompatParcelizer;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Fragment fragment) {
            super(0);
            this.$RemoteActionCompatParcelizer = fragment;
        }
    }

    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int IconCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<Boolean> setupdatedstatusMediaBrowserCompatItemReceiver = ResultCallback.this.write().MediaBrowserCompatItemReceiver();
                final ResultCallback resultCallback = ResultCallback.this;
                this.IconCompatParcelizer = 1;
                if (setupdatedstatusMediaBrowserCompatItemReceiver.write(new getValidationToken() { // from class: o.ResultCallback.RemoteActionCompatParcelizer.4
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return RemoteActionCompatParcelizer(((Boolean) obj2).booleanValue());
                    }

                    private Object RemoteActionCompatParcelizer(boolean z) {
                        if (z) {
                            resultCallback.MediaMetadataCompat();
                        } else {
                            resultCallback.AudioAttributesImplApi26Parcelizer();
                        }
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

        RemoteActionCompatParcelizer(SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return ResultCallback.this.new RemoteActionCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: o.ResultCallback$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/TypeResolutionContext;", "IconCompatParcelizer", "()Lo/TypeResolutionContext;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass1 extends MagicModuleUseCase implements getCreatedOnDateMs<TypeResolutionContext> {
        private /* synthetic */ getCreatedOnDateMs $RemoteActionCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final TypeResolutionContext invoke() {
            return (TypeResolutionContext) this.$RemoteActionCompatParcelizer.invoke();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(getCreatedOnDateMs getcreatedondatems) {
            super(0);
            this.$RemoteActionCompatParcelizer = getcreatedondatems;
        }
    }

    /* JADX INFO: renamed from: o.ResultCallback$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/hasMixIns;", "IconCompatParcelizer", "()Lo/hasMixIns;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass5 extends MagicModuleUseCase implements getCreatedOnDateMs<hasMixIns> {
        private /* synthetic */ RenewEligible $write;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final hasMixIns invoke() {
            return _resolveFieldVsGetter.write(this.$write).getViewModelStore();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(RenewEligible renewEligible) {
            super(0);
            this.$write = renewEligible;
        }
    }

    /* JADX INFO: renamed from: o.ResultCallback$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/withFieldVisibility;", "read", "()Lo/withFieldVisibility;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass3 extends MagicModuleUseCase implements getCreatedOnDateMs<withFieldVisibility> {
        private /* synthetic */ RenewEligible $AudioAttributesCompatParcelizer;
        private /* synthetic */ getCreatedOnDateMs $IconCompatParcelizer = null;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final withFieldVisibility invoke() {
            TypeResolutionContext typeResolutionContextWrite = _resolveFieldVsGetter.write(this.$AudioAttributesCompatParcelizer);
            anyExplicitsWithoutIgnoral anyexplicitswithoutignoral = typeResolutionContextWrite instanceof anyExplicitsWithoutIgnoral ? (anyExplicitsWithoutIgnoral) typeResolutionContextWrite : null;
            return anyexplicitswithoutignoral != null ? anyexplicitswithoutignoral.getDefaultViewModelCreationExtras() : withFieldVisibility.write.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(RenewEligible renewEligible) {
            super(0);
            this.$AudioAttributesCompatParcelizer = renewEligible;
        }
    }

    static final class AudioAttributesImplBaseParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int IconCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<Boolean> setupdatedstatusIconCompatParcelizer = ResultCallback.this.write().IconCompatParcelizer();
                final ResultCallback resultCallback = ResultCallback.this;
                this.IconCompatParcelizer = 1;
                if (setupdatedstatusIconCompatParcelizer.write(new getValidationToken() { // from class: o.ResultCallback.AudioAttributesImplBaseParcelizer.1
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return RemoteActionCompatParcelizer(((Boolean) obj2).booleanValue());
                    }

                    private Object RemoteActionCompatParcelizer(boolean z) {
                        if (z) {
                            ProgressBar progressBar = resultCallback.AudioAttributesCompatParcelizer().RemoteActionCompatParcelizer;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(progressBar, "");
                            bytesRead.AudioAttributesImplApi21Parcelizer(progressBar);
                        } else {
                            ProgressBar progressBar2 = resultCallback.AudioAttributesCompatParcelizer().RemoteActionCompatParcelizer;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(progressBar2, "");
                            bytesRead.MediaBrowserCompatCustomActionResultReceiver(progressBar2);
                        }
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

        AudioAttributesImplBaseParcelizer(SampleVideos<? super AudioAttributesImplBaseParcelizer> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return ResultCallback.this.new AudioAttributesImplBaseParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesImplBaseParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: o.ResultCallback$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/VisibilityChecker$RemoteActionCompatParcelizer;", "IconCompatParcelizer", "()Lo/VisibilityChecker$RemoteActionCompatParcelizer;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass4 extends MagicModuleUseCase implements getCreatedOnDateMs<VisibilityChecker.RemoteActionCompatParcelizer> {
        private /* synthetic */ Fragment $AudioAttributesCompatParcelizer;
        private /* synthetic */ RenewEligible $read;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final VisibilityChecker.RemoteActionCompatParcelizer invoke() {
            VisibilityChecker.RemoteActionCompatParcelizer defaultViewModelProviderFactory;
            TypeResolutionContext typeResolutionContextWrite = _resolveFieldVsGetter.write(this.$read);
            anyExplicitsWithoutIgnoral anyexplicitswithoutignoral = typeResolutionContextWrite instanceof anyExplicitsWithoutIgnoral ? (anyExplicitsWithoutIgnoral) typeResolutionContextWrite : null;
            return (anyexplicitswithoutignoral == null || (defaultViewModelProviderFactory = anyexplicitswithoutignoral.getDefaultViewModelProviderFactory()) == null) ? this.$AudioAttributesCompatParcelizer.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(Fragment fragment, RenewEligible renewEligible) {
            super(0);
            this.$AudioAttributesCompatParcelizer = fragment;
            this.$read = renewEligible;
        }
    }

    static final class MediaBrowserCompatItemReceiver extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<ResolvingResultCallbacks> setupdatedstatus = ResultCallback.this.write().read();
                final ResultCallback resultCallback = ResultCallback.this;
                this.write = 1;
                if (setupdatedstatus.write(new getValidationToken() { // from class: o.ResultCallback.MediaBrowserCompatItemReceiver.1
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return RemoteActionCompatParcelizer((ResolvingResultCallbacks) obj2);
                    }

                    private Object RemoteActionCompatParcelizer(ResolvingResultCallbacks resolvingResultCallbacks) {
                        if (resolvingResultCallbacks instanceof ResolvingResultCallbacks.read) {
                            Context context = resultCallback.getContext();
                            ResolvingResultCallbacks.read readVar = (ResolvingResultCallbacks.read) resolvingResultCallbacks;
                            String strIconCompatParcelizer = readVar.IconCompatParcelizer();
                            String strRemoteActionCompatParcelizer = readVar.RemoteActionCompatParcelizer();
                            String strAudioAttributesCompatParcelizer = readVar.AudioAttributesCompatParcelizer();
                            String strAudioAttributesCompatParcelizer2 = parseDuration.AudioAttributesCompatParcelizer(resultCallback.requireContext());
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strAudioAttributesCompatParcelizer2, "");
                            String strAudioAttributesCompatParcelizer3 = populateHttpRequestHeaders.AudioAttributesCompatParcelizer(strAudioAttributesCompatParcelizer2, readVar.read(), readVar.write());
                            StringBuilder sb = new StringBuilder();
                            sb.append(strAudioAttributesCompatParcelizer);
                            sb.append("\n");
                            sb.append(strAudioAttributesCompatParcelizer3);
                            DataSink.RemoteActionCompatParcelizer(context, strIconCompatParcelizer, strRemoteActionCompatParcelizer, sb.toString());
                        } else if (resolvingResultCallbacks instanceof ResolvingResultCallbacks.RemoteActionCompatParcelizer) {
                            ResolvingResultCallbacks.RemoteActionCompatParcelizer remoteActionCompatParcelizer = (ResolvingResultCallbacks.RemoteActionCompatParcelizer) resolvingResultCallbacks;
                            resultCallback.IconCompatParcelizer(remoteActionCompatParcelizer.RemoteActionCompatParcelizer(), remoteActionCompatParcelizer.IconCompatParcelizer(), remoteActionCompatParcelizer.AudioAttributesCompatParcelizer());
                        } else if (resolvingResultCallbacks instanceof ResolvingResultCallbacks.AudioAttributesImplBaseParcelizer) {
                            CmcdConfigurationRequestConfig.AudioAttributesCompatParcelizer(resultCallback, ((ResolvingResultCallbacks.AudioAttributesImplBaseParcelizer) resolvingResultCallbacks).read(), 0);
                        } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(resolvingResultCallbacks, ResolvingResultCallbacks.write.INSTANCE)) {
                            resultCallback.AudioAttributesImplApi21Parcelizer();
                        } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(resolvingResultCallbacks, ResolvingResultCallbacks.AudioAttributesCompatParcelizer.INSTANCE)) {
                            resultCallback.MediaBrowserCompatCustomActionResultReceiver();
                        } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(resolvingResultCallbacks, ResolvingResultCallbacks.MediaBrowserCompatCustomActionResultReceiver.INSTANCE)) {
                            ResultCallback resultCallback2 = resultCallback;
                            ResultCallback resultCallback3 = resultCallback2;
                            String string = resultCallback2.getString(R.string.thanks_message_on_subscription);
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
                            CmcdConfigurationRequestConfig.AudioAttributesCompatParcelizer(resultCallback3, string, 0);
                        } else if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(resolvingResultCallbacks, ResolvingResultCallbacks.IconCompatParcelizer.INSTANCE)) {
                            throw new RenewEligibleCreator();
                        }
                        resultCallback.write().read(onFailure.read.INSTANCE);
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

        MediaBrowserCompatItemReceiver(SampleVideos<? super MediaBrowserCompatItemReceiver> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return ResultCallback.this.new MediaBrowserCompatItemReceiver(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaBrowserCompatItemReceiver) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void RemoteActionCompatParcelizer(String p0, Response p1) {
        String str = p0;
        if (str == null || str.length() == 0) {
            return;
        }
        write().read(onFailure.IconCompatParcelizer.INSTANCE);
        if (!getTrackName.write(getContext())) {
            write().read(onFailure.MediaBrowserCompatItemReceiver.INSTANCE);
            return;
        }
        AudioAttributesCompatParcelizer().write.loadUrl(p0);
        AudioAttributesCompatParcelizer().write.getSettings().setCacheMode(2);
        AudioAttributesCompatParcelizer().write.setWebChromeClient(new write(p1, new MagicModuleUseCaseImplWhenMappings.IconCompatParcelizer(), this, p0));
        AudioAttributesCompatParcelizer().write.setWebViewClient(new IconCompatParcelizer(p0, p1));
    }

    public static final class write extends WebChromeClient {
        private /* synthetic */ ResultCallback AudioAttributesCompatParcelizer;
        private /* synthetic */ Response IconCompatParcelizer;
        private /* synthetic */ MagicModuleUseCaseImplWhenMappings.IconCompatParcelizer read;
        private /* synthetic */ String write;

        write(Response response, MagicModuleUseCaseImplWhenMappings.IconCompatParcelizer iconCompatParcelizer, ResultCallback resultCallback, String str) {
            this.IconCompatParcelizer = response;
            this.read = iconCompatParcelizer;
            this.AudioAttributesCompatParcelizer = resultCallback;
            this.write = str;
        }

        @Override // android.webkit.WebChromeClient
        public final void onProgressChanged(WebView webView, int i) {
            super.onProgressChanged(webView, i);
            if (this.IconCompatParcelizer == Response.AudioAttributesCompatParcelizer) {
                this.read.AudioAttributesCompatParcelizer++;
                if (this.read.AudioAttributesCompatParcelizer == 2 && i == 100) {
                    this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(this.write, this.IconCompatParcelizer);
                }
            }
        }
    }

    public static final class IconCompatParcelizer extends WebViewClient {
        private /* synthetic */ Response AudioAttributesCompatParcelizer;
        private /* synthetic */ String RemoteActionCompatParcelizer;

        IconCompatParcelizer(String str, Response response) {
            this.RemoteActionCompatParcelizer = str;
            this.AudioAttributesCompatParcelizer = response;
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            toMagicModuleMetaRepoModel.write(webView, "");
            toMagicModuleMetaRepoModel.write(str, "");
            super.onPageFinished(webView, str);
            if (TestGroupLSModel.MediaBrowserCompatCustomActionResultReceiver(str, "file:///android_asset/#")) {
                return;
            }
            ResultCallback.this.write().read(onFailure.write.INSTANCE);
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            toMagicModuleMetaRepoModel.write(webView, "");
            toMagicModuleMetaRepoModel.write(webResourceRequest, "");
            return ResultCallback.this.IconCompatParcelizer(webView, webResourceRequest.getUrl(), this.RemoteActionCompatParcelizer, this.AudioAttributesCompatParcelizer);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean IconCompatParcelizer(WebView p0, Uri p1, String p2, Response p3) {
        if (p1 == null) {
            return false;
        }
        String string = p1.toString();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        if (TestGroupLSModel.MediaBrowserCompatCustomActionResultReceiver(string, "mailto:")) {
            String string2 = p1.toString();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string2, "");
            if (TestGroupLSModel.write((CharSequence) string2, (CharSequence) "userdetails=true", false)) {
                InternalWebViewModel internalWebViewModelWrite = write();
                String string3 = p1.toString();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string3, "");
                internalWebViewModelWrite.read(new onFailure.RemoteActionCompatParcelizer(string3));
                return true;
            }
            startActivity(new Intent("android.intent.action.SENDTO", p1));
            return true;
        }
        String string4 = p1.toString();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string4, "");
        if (TestGroupLSModel.MediaBrowserCompatCustomActionResultReceiver(string4, "tel:")) {
            startActivity(new Intent("android.intent.action.DIAL", p1));
            return true;
        }
        String string5 = p1.toString();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string5, "");
        if (TestGroupLSModel.MediaBrowserCompatCustomActionResultReceiver(string5, "callback:")) {
            write().read(onFailure.MediaBrowserCompatCustomActionResultReceiver.INSTANCE);
            return true;
        }
        if (p3 == Response.AudioAttributesCompatParcelizer) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(p2));
            startActivity(intent);
            return true;
        }
        String string6 = p1.toString();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string6, "");
        if (!read(string6)) {
            p0.loadUrl(p1.toString());
            return false;
        }
        maybeGetTypeVariable activity = getActivity();
        if (activity == null) {
            return true;
        }
        activity.finish();
        return true;
    }

    private final boolean read(String p0) {
        return joinWithSeparator.write(getContext(), p0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void MediaMetadataCompat() {
        AudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer.setVisibility(0);
        AudioAttributesCompatParcelizer().AudioAttributesImplApi26Parcelizer.setText(getString(R.string.text_error_possible_reason_no_internet));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AudioAttributesImplApi26Parcelizer() {
        AudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void IconCompatParcelizer(String p0, String p1, String p2) {
        String str = Build.MANUFACTURER;
        String str2 = Build.DEVICE;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" - ");
        sb.append(str2);
        String string = getString(R.string.f_get_callback_email_signature, sb.toString(), p0, p2, "12.0.0", "496", Build.VERSION.RELEASE, p1);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        String string2 = getString(R.string.f_send_email_title_pro);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string2, "");
        String string3 = getString(R.string.f_get_callback, p0);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(string3);
        sb2.append("\n\n");
        sb2.append(string);
        String string4 = sb2.toString();
        String string5 = getString(R.string.support_email);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string5, "");
        DataSink.RemoteActionCompatParcelizer(getContext(), string5, string2, string4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void MediaBrowserCompatCustomActionResultReceiver() {
        SaveAccountLinkingTokenResult.Companion companion = SaveAccountLinkingTokenResult.INSTANCE;
        SaveAccountLinkingTokenResult saveAccountLinkingTokenResultWrite = SaveAccountLinkingTokenResult.Companion.write(true);
        FragmentManager childFragmentManager = getChildFragmentManager();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(childFragmentManager, "");
        SignInClient.RemoteActionCompatParcelizer(saveAccountLinkingTokenResultWrite, childFragmentManager, new getModuleData() { // from class: o.ResultCallbacks
            @Override // kotlin.getModuleData
            public final Object AudioAttributesCompatParcelizer(Object obj, Object obj2, Object obj3) {
                return ResultCallback.read(this.read, (String) obj, (String) obj2, (String) obj3);
            }
        }, new getCreatedOnDateMs() { // from class: o.Result
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return ResultCallback.MediaBrowserCompatItemReceiver();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(ResultCallback resultCallback, String str, String str2, String str3) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        resultCallback.write().read(new onFailure.AudioAttributesCompatParcelizer(str, str2, str3));
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaBrowserCompatItemReceiver() {
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AudioAttributesImplApi21Parcelizer() {
        getAutofillClient.Companion companion = getAutofillClient.INSTANCE;
        String string = getString(R.string.text_already_callback_active);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        String string2 = getString(R.string.text_okay);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string2, "");
        getAutofillClient.Companion.AudioAttributesCompatParcelizer(null, string, string2, null, 0, null, true, false, null, 441).show(getChildFragmentManager(), "callback_cnf_dig");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.AudioAttributesCompatParcelizer = null;
    }
}
