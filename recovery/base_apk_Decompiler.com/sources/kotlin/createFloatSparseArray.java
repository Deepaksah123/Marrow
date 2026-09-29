package kotlin;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.util.DeviceProperties;
import com.marrow.R;
import com.marrow2.ui.onboarding.landing.OnboardViewModel;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResolvableApiException;
import kotlin.SafeParcelReaderParseException;
import kotlin.SmsCodeBrowserClient;
import kotlin.VisibilityChecker;
import kotlin._init_lambda4;
import kotlin.createSparseBooleanArray;
import kotlin.createSparseLongArray;
import kotlin.getAutofillClient;
import kotlin.icon;
import kotlin.shouldEscapeCharacter;
import kotlin.withFieldVisibility;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u0000  2\u00020\u00012\u00020\u0002:\u0001 B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J+\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0004J!\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0004J\u000f\u0010\u0013\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0004J\u000f\u0010\u0014\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0004J\u000f\u0010\u0015\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0015\u0010\u0004J\u000f\u0010\u0016\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0016\u0010\u0004J\u000f\u0010\u0017\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0017\u0010\u0004J\u000f\u0010\u0018\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0018\u0010\u0004J\u000f\u0010\u0019\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0019\u0010\u0004J\u000f\u0010\u001a\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001a\u0010\u0004R\u001b\u0010 \u001a\u00020\u001b8CX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0018\u0010\u0015\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\"R\u0014\u0010\u001c\u001a\u00020!8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010#R\u001e\u0010\u0019\u001a\f\u0012\b\u0012\u0006*\u00020%0%0$8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010&"}, d2 = {"Lo/createFloatSparseArray;", "Landroidx/fragment/app/Fragment;", "Lo/SmsCodeBrowserClient$RemoteActionCompatParcelizer;", "<init>", "()V", "Landroid/view/LayoutInflater;", "p0", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "onDestroyView", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "AudioAttributesImplApi26Parcelizer", "onResume", "AudioAttributesImplBaseParcelizer", "write", "MediaBrowserCompatCustomActionResultReceiver", "AudioAttributesImplApi21Parcelizer", "MediaBrowserCompatItemReceiver", "RemoteActionCompatParcelizer", "MediaBrowserCompatSearchResultReceiver", "Lcom/marrow2/ui/onboarding/landing/OnboardViewModel;", "AudioAttributesCompatParcelizer", "Lo/RenewEligible;", "read", "()Lcom/marrow2/ui/onboarding/landing/OnboardViewModel;", "IconCompatParcelizer", "Lo/obtainsChunksForPlaylist;", "Lo/obtainsChunksForPlaylist;", "()Lo/obtainsChunksForPlaylist;", "Lo/r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8;", "", "Lo/r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class createFloatSparseArray extends createDoubleArray implements SmsCodeBrowserClient.RemoteActionCompatParcelizer {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final RenewEligible IconCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private obtainsChunksForPlaylist write;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8<String> RemoteActionCompatParcelizer;

    public createFloatSparseArray() {
        createFloatSparseArray createfloatsparsearray = this;
        RenewEligible renewEligibleWrite = getRenewExpiresOn.write(RenewEligibleCompanion.read, new AnonymousClass1(new AnonymousClass3(createfloatsparsearray)));
        this.IconCompatParcelizer = _resolveFieldVsGetter.RemoteActionCompatParcelizer(toMagicModuleMetaDataUcModel.write(OnboardViewModel.class), new AnonymousClass4(renewEligibleWrite), new AnonymousClass5(renewEligibleWrite), new AnonymousClass2(createfloatsparsearray, renewEligibleWrite));
        r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8<String> r8lambdaibk6u1hk7j3awkl_wn934v2uvi8RegisterForActivityResult = registerForActivityResult(new _init_lambda4.write(), new r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM() { // from class: o.createIBinderList
            @Override // kotlin.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM
            public final void IconCompatParcelizer(Object obj) {
                createFloatSparseArray.write(this.IconCompatParcelizer, (Boolean) obj);
            }
        });
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(r8lambdaibk6u1hk7j3awkl_wn934v2uvi8RegisterForActivityResult, "");
        this.RemoteActionCompatParcelizer = r8lambdaibk6u1hk7j3awkl_wn934v2uvi8RegisterForActivityResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OnboardViewModel read() {
        return (OnboardViewModel) this.IconCompatParcelizer.RemoteActionCompatParcelizer();
    }

    private final obtainsChunksForPlaylist AudioAttributesCompatParcelizer() {
        obtainsChunksForPlaylist obtainschunksforplaylist = this.write;
        toMagicModuleMetaRepoModel.write(obtainschunksforplaylist);
        return obtainschunksforplaylist;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void write(createFloatSparseArray createfloatsparsearray, Boolean bool) {
        toMagicModuleMetaRepoModel.write(bool, "");
        createfloatsparsearray.read().AudioAttributesCompatParcelizer(new createSparseBooleanArray.RemoteActionCompatParcelizer(bool.booleanValue()));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        this.write = obtainsChunksForPlaylist.AudioAttributesCompatParcelizer(p0, p1);
        FrameLayout frameLayoutIconCompatParcelizer = AudioAttributesCompatParcelizer().IconCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(frameLayoutIconCompatParcelizer, "");
        return frameLayoutIconCompatParcelizer;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.write = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View p0, Bundle p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        super.onViewCreated(p0, p1);
        AudioAttributesImplApi21Parcelizer();
        MediaBrowserCompatItemReceiver();
        AudioAttributesImplBaseParcelizer();
        RemoteActionCompatParcelizer();
        AudioAttributesImplApi26Parcelizer();
    }

    private final void AudioAttributesImplApi26Parcelizer() {
        if (DeviceProperties.isTablet(requireContext())) {
            Context contextRequireContext = requireContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
            LinearLayout linearLayout = AudioAttributesCompatParcelizer().write;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout, "");
            bytesRead.AudioAttributesCompatParcelizer(contextRequireContext, linearLayout);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
    }

    /* JADX INFO: loaded from: classes3.dex */
    static final class AudioAttributesCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<TrackSelectionViewTrackInfo> setupdatedstatusAudioAttributesCompatParcelizer = createFloatSparseArray.this.read().AudioAttributesCompatParcelizer();
                final createFloatSparseArray createfloatsparsearray = createFloatSparseArray.this;
                this.write = 1;
                if (setupdatedstatusAudioAttributesCompatParcelizer.write(new getValidationToken() { // from class: o.createFloatSparseArray.AudioAttributesCompatParcelizer.1
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return read();
                    }

                    private static Object read() {
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
            return createFloatSparseArray.this.new AudioAttributesCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void AudioAttributesImplBaseParcelizer() {
        createFloatSparseArray createfloatsparsearray = this;
        setBitrateKbps.read(createfloatsparsearray, new AudioAttributesCompatParcelizer(null));
        setBitrateKbps.read(createfloatsparsearray, new read(null));
        setBitrateKbps.read(createfloatsparsearray, new RemoteActionCompatParcelizer(null));
    }

    /* JADX INFO: renamed from: o.createFloatSparseArray$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Landroidx/fragment/app/Fragment;", "RemoteActionCompatParcelizer", "()Landroidx/fragment/app/Fragment;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass3 extends MagicModuleUseCase implements getCreatedOnDateMs<Fragment> {
        private /* synthetic */ Fragment $write;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.$write;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(Fragment fragment) {
            super(0);
            this.$write = fragment;
        }
    }

    /* JADX INFO: renamed from: o.createFloatSparseArray$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/TypeResolutionContext;", "RemoteActionCompatParcelizer", "()Lo/TypeResolutionContext;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass1 extends MagicModuleUseCase implements getCreatedOnDateMs<TypeResolutionContext> {
        private /* synthetic */ getCreatedOnDateMs $read;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final TypeResolutionContext invoke() {
            return (TypeResolutionContext) this.$read.invoke();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(getCreatedOnDateMs getcreatedondatems) {
            super(0);
            this.$read = getcreatedondatems;
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    static final class read extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<createSparseLongArray> setupdatedstatusIconCompatParcelizer = createFloatSparseArray.this.read().IconCompatParcelizer();
                final createFloatSparseArray createfloatsparsearray = createFloatSparseArray.this;
                this.read = 1;
                if (setupdatedstatusIconCompatParcelizer.write(new getValidationToken() { // from class: o.createFloatSparseArray.read.3
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return write((createSparseLongArray) obj2);
                    }

                    private Object write(createSparseLongArray createsparselongarray) throws Throwable {
                        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(createsparselongarray, createSparseLongArray.read.INSTANCE)) {
                            createfloatsparsearray.requireActivity().finishAffinity();
                            createfloatsparsearray.read().AudioAttributesCompatParcelizer(createSparseBooleanArray.MediaBrowserCompatCustomActionResultReceiver.INSTANCE);
                        } else if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(createsparselongarray, createSparseLongArray.write.INSTANCE)) {
                            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(createsparselongarray, createSparseLongArray.AudioAttributesCompatParcelizer.INSTANCE)) {
                                joinWithSeparator.AudioAttributesCompatParcelizer(createfloatsparsearray.requireContext());
                                createfloatsparsearray.read().AudioAttributesCompatParcelizer(createSparseBooleanArray.MediaBrowserCompatCustomActionResultReceiver.INSTANCE);
                            } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(createsparselongarray, createSparseLongArray.RemoteActionCompatParcelizer.INSTANCE)) {
                                createfloatsparsearray.write();
                                createfloatsparsearray.read().AudioAttributesCompatParcelizer(createSparseBooleanArray.MediaBrowserCompatCustomActionResultReceiver.INSTANCE);
                            } else {
                                throw new RenewEligibleCreator();
                            }
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

        read(SampleVideos<? super read> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return createFloatSparseArray.this.new read(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((read) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: o.createFloatSparseArray$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/hasMixIns;", "AudioAttributesCompatParcelizer", "()Lo/hasMixIns;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass4 extends MagicModuleUseCase implements getCreatedOnDateMs<hasMixIns> {
        private /* synthetic */ RenewEligible $RemoteActionCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final hasMixIns invoke() {
            return _resolveFieldVsGetter.write(this.$RemoteActionCompatParcelizer).getViewModelStore();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(RenewEligible renewEligible) {
            super(0);
            this.$RemoteActionCompatParcelizer = renewEligible;
        }
    }

    /* JADX INFO: renamed from: o.createFloatSparseArray$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/withFieldVisibility;", "AudioAttributesCompatParcelizer", "()Lo/withFieldVisibility;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass5 extends MagicModuleUseCase implements getCreatedOnDateMs<withFieldVisibility> {
        private /* synthetic */ getCreatedOnDateMs $RemoteActionCompatParcelizer = null;
        private /* synthetic */ RenewEligible $write;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final withFieldVisibility invoke() {
            TypeResolutionContext typeResolutionContextWrite = _resolveFieldVsGetter.write(this.$write);
            anyExplicitsWithoutIgnoral anyexplicitswithoutignoral = typeResolutionContextWrite instanceof anyExplicitsWithoutIgnoral ? (anyExplicitsWithoutIgnoral) typeResolutionContextWrite : null;
            return anyexplicitswithoutignoral != null ? anyexplicitswithoutignoral.getDefaultViewModelCreationExtras() : withFieldVisibility.write.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(RenewEligible renewEligible) {
            super(0);
            this.$write = renewEligible;
        }
    }

    /* JADX INFO: renamed from: o.createFloatSparseArray$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/VisibilityChecker$RemoteActionCompatParcelizer;", "write", "()Lo/VisibilityChecker$RemoteActionCompatParcelizer;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass2 extends MagicModuleUseCase implements getCreatedOnDateMs<VisibilityChecker.RemoteActionCompatParcelizer> {
        private /* synthetic */ RenewEligible $AudioAttributesCompatParcelizer;
        private /* synthetic */ Fragment $write;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final VisibilityChecker.RemoteActionCompatParcelizer invoke() {
            VisibilityChecker.RemoteActionCompatParcelizer defaultViewModelProviderFactory;
            TypeResolutionContext typeResolutionContextWrite = _resolveFieldVsGetter.write(this.$AudioAttributesCompatParcelizer);
            anyExplicitsWithoutIgnoral anyexplicitswithoutignoral = typeResolutionContextWrite instanceof anyExplicitsWithoutIgnoral ? (anyExplicitsWithoutIgnoral) typeResolutionContextWrite : null;
            return (anyexplicitswithoutignoral == null || (defaultViewModelProviderFactory = anyexplicitswithoutignoral.getDefaultViewModelProviderFactory()) == null) ? this.$write.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Fragment fragment, RenewEligible renewEligible) {
            super(0);
            this.$write = fragment;
            this.$AudioAttributesCompatParcelizer = renewEligible;
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<Boolean> setupdatedstatus = createFloatSparseArray.this.read().read();
                final createFloatSparseArray createfloatsparsearray = createFloatSparseArray.this;
                this.AudioAttributesCompatParcelizer = 1;
                if (setupdatedstatus.write(new getValidationToken() { // from class: o.createFloatSparseArray.RemoteActionCompatParcelizer.4
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return write(((Boolean) obj2).booleanValue());
                    }

                    private Object write(boolean z) {
                        if (Build.VERSION.SDK_INT >= 33 && z) {
                            Context contextRequireContext = createfloatsparsearray.requireContext();
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
                            if (!CmcdConfigurationRequestConfig.write(contextRequireContext)) {
                                CmcdConfigurationRequestConfig.AudioAttributesCompatParcelizer((r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8<String>) createfloatsparsearray.RemoteActionCompatParcelizer);
                            }
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
            return createFloatSparseArray.this.new RemoteActionCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void write() throws Throwable {
        Context contextRequireContext = requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        String strAudioAttributesCompatParcelizer = CmcdConfigurationRequestConfig.AudioAttributesCompatParcelizer(contextRequireContext);
        List<String> listIconCompatParcelizer = setChunkDurationUs.INSTANCE.IconCompatParcelizer();
        if (!(listIconCompatParcelizer instanceof Collection) || !listIconCompatParcelizer.isEmpty()) {
            Iterator<T> it = listIconCompatParcelizer.iterator();
            while (it.hasNext()) {
                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(it.next(), (Object) strAudioAttributesCompatParcelizer)) {
                    return;
                }
            }
        }
        MediaBrowserCompatSearchResultReceiver();
        MediaBrowserCompatCustomActionResultReceiver();
    }

    private final void MediaBrowserCompatCustomActionResultReceiver() {
        isHandledMediaKey ishandledmediakey = isHandledMediaKey.INSTANCE;
        Context contextRequireContext = requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        read().AudioAttributesCompatParcelizer(new createSparseBooleanArray.read(isHandledMediaKey.AudioAttributesCompatParcelizer(contextRequireContext)));
    }

    private final void AudioAttributesImplApi21Parcelizer() {
        AudioAttributesCompatParcelizer().read.setOnClickListener(new View.OnClickListener() { // from class: o.createIBinderArray
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                createFloatSparseArray.MediaBrowserCompatItemReceiver(this.RemoteActionCompatParcelizer);
            }
        });
        AudioAttributesCompatParcelizer().RemoteActionCompatParcelizer.setOnClickListener(new View.OnClickListener() { // from class: o.createIBinderSparseArray
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                createFloatSparseArray.MediaBrowserCompatCustomActionResultReceiver(this.write);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MediaBrowserCompatItemReceiver(createFloatSparseArray createfloatsparsearray) {
        createfloatsparsearray.read().AudioAttributesCompatParcelizer(createSparseBooleanArray.AudioAttributesCompatParcelizer.INSTANCE);
        SafeParcelReaderParseException.Companion companion = SafeParcelReaderParseException.INSTANCE;
        Context contextRequireContext = createfloatsparsearray.requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        createfloatsparsearray.startActivity(SafeParcelReaderParseException.Companion.read(contextRequireContext));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MediaBrowserCompatCustomActionResultReceiver(createFloatSparseArray createfloatsparsearray) {
        icon.Companion companion = icon.INSTANCE;
        Context contextRequireContext = createfloatsparsearray.requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        createfloatsparsearray.startActivity(icon.Companion.read(contextRequireContext));
    }

    private final void MediaBrowserCompatItemReceiver() {
        String string = getString(R.string.btn_terms_and_condition);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        String string2 = getString(R.string.clickable_text_privacy_landing_page);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string2, "");
        String string3 = getString(R.string.clickable_terms_condition_landing_page);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string3, "");
        write writeVar = new write();
        AudioAttributesImplApi21Parcelizer audioAttributesImplApi21Parcelizer = new AudioAttributesImplApi21Parcelizer();
        shouldEscapeCharacter.Companion companion = shouldEscapeCharacter.INSTANCE;
        Context contextRequireContext = requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(shouldEscapeCharacter.Companion.read(contextRequireContext, R.attr.colorPrimary, new TypedValue(), true));
        shouldEscapeCharacter.Companion companion2 = shouldEscapeCharacter.INSTANCE;
        Context contextRequireContext2 = requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext2, "");
        ForegroundColorSpan foregroundColorSpan2 = new ForegroundColorSpan(shouldEscapeCharacter.Companion.read(contextRequireContext2, R.attr.onSurfaceBlue, new TypedValue(), true));
        String str = string;
        int i = TestGroupLSModel.read((CharSequence) str, string2, 0, false, 6);
        int i2 = TestGroupLSModel.read((CharSequence) str, string3, 0, false, 6);
        TextView textView = AudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.setSpan(writeVar, i, string2.length() + i, 18);
        spannableStringBuilder.setSpan(audioAttributesImplApi21Parcelizer, i2, string3.length() + i2, 18);
        spannableStringBuilder.setSpan(foregroundColorSpan, i, string2.length() + i, 18);
        spannableStringBuilder.setSpan(foregroundColorSpan2, i2, string3.length() + i2, 18);
        textView.setText(spannableStringBuilder);
        AudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public static final class write extends ClickableSpan {
        write() {
        }

        @Override // android.text.style.ClickableSpan
        public final void onClick(View view) {
            toMagicModuleMetaRepoModel.write(view, "");
            ResolvableApiException.Companion companion = ResolvableApiException.INSTANCE;
            Context contextRequireContext = createFloatSparseArray.this.requireContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
            String string = createFloatSparseArray.this.getString(R.string.clickable_text_privacy_landing_page);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
            createFloatSparseArray.this.startActivity(ResolvableApiException.Companion.read(contextRequireContext, new canceledPendingResult("https://www.marrow.com/home/privacy-policy", string, null, 4, null)));
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public final void updateDrawState(TextPaint textPaint) {
            toMagicModuleMetaRepoModel.write(textPaint, "");
            super.updateDrawState(textPaint);
            shouldEscapeCharacter.Companion companion = shouldEscapeCharacter.INSTANCE;
            Context contextRequireContext = createFloatSparseArray.this.requireContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
            textPaint.setColor(shouldEscapeCharacter.Companion.read(contextRequireContext, R.attr.onSurfaceBlue, new TypedValue(), true));
            textPaint.setUnderlineText(false);
        }
    }

    public static final class AudioAttributesImplApi21Parcelizer extends ClickableSpan {
        AudioAttributesImplApi21Parcelizer() {
        }

        @Override // android.text.style.ClickableSpan
        public final void onClick(View view) {
            toMagicModuleMetaRepoModel.write(view, "");
            ResolvableApiException.Companion companion = ResolvableApiException.INSTANCE;
            Context contextRequireContext = createFloatSparseArray.this.requireContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
            String string = createFloatSparseArray.this.getString(R.string.clickable_terms_condition_landing_page);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
            createFloatSparseArray.this.startActivity(ResolvableApiException.Companion.read(contextRequireContext, new canceledPendingResult("https://www.marrow.com/home/terms", string, null, 4, null)));
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public final void updateDrawState(TextPaint textPaint) {
            toMagicModuleMetaRepoModel.write(textPaint, "");
            super.updateDrawState(textPaint);
            shouldEscapeCharacter.Companion companion = shouldEscapeCharacter.INSTANCE;
            Context contextRequireContext = createFloatSparseArray.this.requireContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
            textPaint.setColor(shouldEscapeCharacter.Companion.read(contextRequireContext, R.attr.colorPrimary, new TypedValue(), true));
            textPaint.setUnderlineText(false);
        }
    }

    private final void RemoteActionCompatParcelizer() {
        getChildFragmentManager().IconCompatParcelizer(SmsRetrieverStatusCodes.write.getWrite(), getViewLifecycleOwner(), new _addFields() { // from class: o.createIntArray
            @Override // kotlin._addFields
            public final void AudioAttributesCompatParcelizer(String str, Bundle bundle) {
                createFloatSparseArray.write(this.IconCompatParcelizer, str, bundle);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void write(createFloatSparseArray createfloatsparsearray, String str, Bundle bundle) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(bundle, "");
        if (bundle.getBoolean("positive_key_press")) {
            createfloatsparsearray.read().AudioAttributesCompatParcelizer(createSparseBooleanArray.IconCompatParcelizer.INSTANCE);
        } else if (bundle.getBoolean("negative_key_press")) {
            createfloatsparsearray.read().AudioAttributesCompatParcelizer(createSparseBooleanArray.write.INSTANCE);
        }
    }

    private final void MediaBrowserCompatSearchResultReceiver() {
        getAutofillClient.Companion companion = getAutofillClient.INSTANCE;
        String string = getString(R.string.warning);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        String string2 = getString(R.string.play_store_dialog_description);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string2, "");
        String string3 = getString(R.string.download_from_play_store);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string3, "");
        String string4 = getString(R.string.back);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string4, "");
        getAutofillClient.Companion.AudioAttributesCompatParcelizer(string, string2, string3, string4, 0, SmsRetrieverStatusCodes.write, false, false, null, 272).show(getChildFragmentManager(), (String) null);
    }

    /* JADX INFO: renamed from: o.createFloatSparseArray$IconCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo/createFloatSparseArray$IconCompatParcelizer;", "", "<init>", "()V", "Lo/createFloatSparseArray;", "RemoteActionCompatParcelizer", "()Lo/createFloatSparseArray;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static createFloatSparseArray RemoteActionCompatParcelizer() {
            return new createFloatSparseArray();
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
