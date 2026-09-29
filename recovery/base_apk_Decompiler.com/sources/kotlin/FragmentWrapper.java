package kotlin;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import com.marrow.ui.activities.plan.PlanActivity;
import com.marrow2.ui.plan.plan_validity.viewmodel.PlanValidityViewModel;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.ResolvableApiException;
import kotlin.VisibilityChecker;
import kotlin.getRemoteVersion;
import kotlin.unwrap;
import kotlin.withFieldVisibility;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0003J\u000f\u0010\u0013\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0003J\u000f\u0010\u0014\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0014\u0010\u0003J\u0017\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u001b\u0010\u0014\u001a\u00020\u00188CX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0016\u0010\u001bR\u0016\u0010\u0019\u001a\u00020\u001c8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u0016\u0010\u001dR\u0014\u0010\u0010\u001a\u00020\u001e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001f"}, d2 = {"Lo/FragmentWrapper;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Landroid/view/LayoutInflater;", "p0", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "read", "AudioAttributesImplBaseParcelizer", "MediaBrowserCompatCustomActionResultReceiver", "RemoteActionCompatParcelizer", "AudioAttributesCompatParcelizer", "Lo/DynamiteModule;", "write", "(Lo/DynamiteModule;)V", "Lcom/marrow2/ui/plan/plan_validity/viewmodel/PlanValidityViewModel;", "IconCompatParcelizer", "Lo/RenewEligible;", "()Lcom/marrow2/ui/plan/plan_validity/viewmodel/PlanValidityViewModel;", "Lo/HlsExtractorFactory;", "Lo/HlsExtractorFactory;", "Lo/DeferredLifecycleHelper;", "Lo/DeferredLifecycleHelper;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FragmentWrapper extends IFragmentWrapper {

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final RenewEligible AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final DeferredLifecycleHelper read;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private HlsExtractorFactory IconCompatParcelizer;

    public FragmentWrapper() {
        FragmentWrapper fragmentWrapper = this;
        RenewEligible renewEligibleWrite = getRenewExpiresOn.write(RenewEligibleCompanion.read, new AnonymousClass2(new AnonymousClass5(fragmentWrapper)));
        this.AudioAttributesCompatParcelizer = _resolveFieldVsGetter.RemoteActionCompatParcelizer(toMagicModuleMetaDataUcModel.write(PlanValidityViewModel.class), new AnonymousClass1(renewEligibleWrite), new AnonymousClass3(renewEligibleWrite), new AnonymousClass4(fragmentWrapper, renewEligibleWrite));
        this.read = new DeferredLifecycleHelper(new getCreatedOnDateMs() { // from class: o.ObjectWrapper
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return FragmentWrapper.AudioAttributesImplApi21Parcelizer(this.read);
            }
        }, new getAnswerMap() { // from class: o.IObjectWrapperStub
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return FragmentWrapper.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, (String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PlanValidityViewModel write() {
        return (PlanValidityViewModel) this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesImplApi21Parcelizer(FragmentWrapper fragmentWrapper) {
        fragmentWrapper.write().AudioAttributesCompatParcelizer(getRemoteVersion.read.INSTANCE);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(FragmentWrapper fragmentWrapper, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        fragmentWrapper.write().AudioAttributesCompatParcelizer(new getRemoteVersion.AudioAttributesCompatParcelizer(str));
        return getShowPopup.INSTANCE;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        HlsExtractorFactory hlsExtractorFactoryAudioAttributesCompatParcelizer = HlsExtractorFactory.AudioAttributesCompatParcelizer(p0, p1);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(hlsExtractorFactoryAudioAttributesCompatParcelizer, "");
        this.IconCompatParcelizer = hlsExtractorFactoryAudioAttributesCompatParcelizer;
        if (hlsExtractorFactoryAudioAttributesCompatParcelizer == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            hlsExtractorFactoryAudioAttributesCompatParcelizer = null;
        }
        ConstraintLayout constraintLayoutIconCompatParcelizer = hlsExtractorFactoryAudioAttributesCompatParcelizer.IconCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayoutIconCompatParcelizer, "");
        return constraintLayoutIconCompatParcelizer;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View p0, Bundle p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        super.onViewCreated(p0, p1);
        read();
        MediaBrowserCompatCustomActionResultReceiver();
        AudioAttributesCompatParcelizer();
        RemoteActionCompatParcelizer();
        AudioAttributesImplBaseParcelizer();
    }

    private final void read() {
        HlsExtractorFactory hlsExtractorFactory = this.IconCompatParcelizer;
        HlsExtractorFactory hlsExtractorFactory2 = null;
        if (hlsExtractorFactory == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            hlsExtractorFactory = null;
        }
        Toolbar toolbar = hlsExtractorFactory.RatingCompat;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(toolbar, "");
        getHttpMethodString.read((View) toolbar, true, false, true, true, 0, 50);
        HlsExtractorFactory hlsExtractorFactory3 = this.IconCompatParcelizer;
        if (hlsExtractorFactory3 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            hlsExtractorFactory3 = null;
        }
        NestedScrollView nestedScrollView = hlsExtractorFactory3.MediaBrowserCompatCustomActionResultReceiver;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(nestedScrollView, "");
        getHttpMethodString.read((View) nestedScrollView, false, false, true, true, 0, 51);
        HlsExtractorFactory hlsExtractorFactory4 = this.IconCompatParcelizer;
        if (hlsExtractorFactory4 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            hlsExtractorFactory2 = hlsExtractorFactory4;
        }
        LinearLayout linearLayout = hlsExtractorFactory2.IconCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout, "");
        getHttpMethodString.read((View) linearLayout, false, true, true, true, 0, 49);
    }

    private final void AudioAttributesImplBaseParcelizer() {
        if (DeviceProperties.isTablet(requireContext())) {
            Context contextRequireContext = requireContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
            HlsExtractorFactory hlsExtractorFactory = this.IconCompatParcelizer;
            HlsExtractorFactory hlsExtractorFactory2 = null;
            if (hlsExtractorFactory == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                hlsExtractorFactory = null;
            }
            ConstraintLayout constraintLayout = hlsExtractorFactory.RemoteActionCompatParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayout, "");
            bytesRead.AudioAttributesCompatParcelizer(contextRequireContext, constraintLayout);
            Context contextRequireContext2 = requireContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext2, "");
            HlsExtractorFactory hlsExtractorFactory3 = this.IconCompatParcelizer;
            if (hlsExtractorFactory3 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            } else {
                hlsExtractorFactory2 = hlsExtractorFactory3;
            }
            LinearLayout linearLayout = hlsExtractorFactory2.IconCompatParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout, "");
            bytesRead.AudioAttributesCompatParcelizer(contextRequireContext2, linearLayout);
        }
    }

    private final void MediaBrowserCompatCustomActionResultReceiver() {
        HlsExtractorFactory hlsExtractorFactory = this.IconCompatParcelizer;
        if (hlsExtractorFactory == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            hlsExtractorFactory = null;
        }
        hlsExtractorFactory.MediaBrowserCompatItemReceiver.setAdapter(this.read);
    }

    private final void RemoteActionCompatParcelizer() {
        HlsExtractorFactory hlsExtractorFactory = this.IconCompatParcelizer;
        HlsExtractorFactory hlsExtractorFactory2 = null;
        if (hlsExtractorFactory == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            hlsExtractorFactory = null;
        }
        hlsExtractorFactory.write.setOnClickListener(new View.OnClickListener() { // from class: o.IFragmentWrapperStub
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FragmentWrapper.MediaBrowserCompatItemReceiver(this.AudioAttributesCompatParcelizer);
            }
        });
        hlsExtractorFactory.RatingCompat.setNavigationOnClickListener(new View.OnClickListener() { // from class: o.LifecycleDelegate
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FragmentWrapper.AudioAttributesImplBaseParcelizer(this.IconCompatParcelizer);
            }
        });
        HlsExtractorFactory hlsExtractorFactory3 = this.IconCompatParcelizer;
        if (hlsExtractorFactory3 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            hlsExtractorFactory2 = hlsExtractorFactory3;
        }
        hlsExtractorFactory2.MediaBrowserCompatSearchResultReceiver.setOnClickListener(new View.OnClickListener() { // from class: o.IObjectWrapper
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FragmentWrapper.MediaDescriptionCompat(this.RemoteActionCompatParcelizer);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MediaBrowserCompatItemReceiver(FragmentWrapper fragmentWrapper) {
        fragmentWrapper.write().AudioAttributesCompatParcelizer(getRemoteVersion.write.INSTANCE);
    }

    /* JADX INFO: renamed from: o.FragmentWrapper$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Landroidx/fragment/app/Fragment;", "RemoteActionCompatParcelizer", "()Landroidx/fragment/app/Fragment;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass5 extends MagicModuleUseCase implements getCreatedOnDateMs<Fragment> {
        private /* synthetic */ Fragment $AudioAttributesCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.$AudioAttributesCompatParcelizer;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(Fragment fragment) {
            super(0);
            this.$AudioAttributesCompatParcelizer = fragment;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AudioAttributesImplBaseParcelizer(FragmentWrapper fragmentWrapper) {
        maybeGetTypeVariable activity = fragmentWrapper.getActivity();
        if (activity != null) {
            activity.onBackPressed();
        }
    }

    /* JADX INFO: renamed from: o.FragmentWrapper$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/TypeResolutionContext;", "IconCompatParcelizer", "()Lo/TypeResolutionContext;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass2 extends MagicModuleUseCase implements getCreatedOnDateMs<TypeResolutionContext> {
        private /* synthetic */ getCreatedOnDateMs $RemoteActionCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final TypeResolutionContext invoke() {
            return (TypeResolutionContext) this.$RemoteActionCompatParcelizer.invoke();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(getCreatedOnDateMs getcreatedondatems) {
            super(0);
            this.$RemoteActionCompatParcelizer = getcreatedondatems;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MediaDescriptionCompat(FragmentWrapper fragmentWrapper) {
        fragmentWrapper.write().AudioAttributesCompatParcelizer(getRemoteVersion.RemoteActionCompatParcelizer.INSTANCE);
    }

    /* JADX INFO: renamed from: o.FragmentWrapper$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/hasMixIns;", "AudioAttributesCompatParcelizer", "()Lo/hasMixIns;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass1 extends MagicModuleUseCase implements getCreatedOnDateMs<hasMixIns> {
        private /* synthetic */ RenewEligible $read;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final hasMixIns invoke() {
            return _resolveFieldVsGetter.write(this.$read).getViewModelStore();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(RenewEligible renewEligible) {
            super(0);
            this.$read = renewEligible;
        }
    }

    /* JADX INFO: renamed from: o.FragmentWrapper$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/withFieldVisibility;", "AudioAttributesCompatParcelizer", "()Lo/withFieldVisibility;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass3 extends MagicModuleUseCase implements getCreatedOnDateMs<withFieldVisibility> {
        private /* synthetic */ getCreatedOnDateMs $RemoteActionCompatParcelizer = null;
        private /* synthetic */ RenewEligible $read;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final withFieldVisibility invoke() {
            TypeResolutionContext typeResolutionContextWrite = _resolveFieldVsGetter.write(this.$read);
            anyExplicitsWithoutIgnoral anyexplicitswithoutignoral = typeResolutionContextWrite instanceof anyExplicitsWithoutIgnoral ? (anyExplicitsWithoutIgnoral) typeResolutionContextWrite : null;
            return anyexplicitswithoutignoral != null ? anyexplicitswithoutignoral.getDefaultViewModelCreationExtras() : withFieldVisibility.write.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(RenewEligible renewEligible) {
            super(0);
            this.$read = renewEligible;
        }
    }

    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<Boolean> setupdatedstatusMediaBrowserCompatCustomActionResultReceiver = FragmentWrapper.this.write().MediaBrowserCompatCustomActionResultReceiver();
                final FragmentWrapper fragmentWrapper = FragmentWrapper.this;
                this.AudioAttributesCompatParcelizer = 1;
                if (setupdatedstatusMediaBrowserCompatCustomActionResultReceiver.write(new getValidationToken() { // from class: o.FragmentWrapper.RemoteActionCompatParcelizer.3
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return write(((Boolean) obj2).booleanValue());
                    }

                    private Object write(boolean z) {
                        HlsExtractorFactory hlsExtractorFactory = fragmentWrapper.IconCompatParcelizer;
                        if (hlsExtractorFactory == null) {
                            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                            hlsExtractorFactory = null;
                        }
                        FrameLayout frameLayout = hlsExtractorFactory.AudioAttributesImplApi26Parcelizer;
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(frameLayout, "");
                        frameLayout.setVisibility(z ? 0 : 8);
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
            return FragmentWrapper.this.new RemoteActionCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void AudioAttributesCompatParcelizer() {
        FragmentWrapper fragmentWrapper = this;
        setBitrateKbps.read(fragmentWrapper, new RemoteActionCompatParcelizer(null));
        setBitrateKbps.read(fragmentWrapper, new AudioAttributesCompatParcelizer(null));
        setBitrateKbps.read(fragmentWrapper, new IconCompatParcelizer(null));
        setBitrateKbps.read(fragmentWrapper, new write(null));
        setBitrateKbps.read(fragmentWrapper, new MediaBrowserCompatItemReceiver(null));
    }

    /* JADX INFO: renamed from: o.FragmentWrapper$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/VisibilityChecker$RemoteActionCompatParcelizer;", "AudioAttributesCompatParcelizer", "()Lo/VisibilityChecker$RemoteActionCompatParcelizer;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass4 extends MagicModuleUseCase implements getCreatedOnDateMs<VisibilityChecker.RemoteActionCompatParcelizer> {
        private /* synthetic */ Fragment $IconCompatParcelizer;
        private /* synthetic */ RenewEligible $write;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final VisibilityChecker.RemoteActionCompatParcelizer invoke() {
            VisibilityChecker.RemoteActionCompatParcelizer defaultViewModelProviderFactory;
            TypeResolutionContext typeResolutionContextWrite = _resolveFieldVsGetter.write(this.$write);
            anyExplicitsWithoutIgnoral anyexplicitswithoutignoral = typeResolutionContextWrite instanceof anyExplicitsWithoutIgnoral ? (anyExplicitsWithoutIgnoral) typeResolutionContextWrite : null;
            return (anyexplicitswithoutignoral == null || (defaultViewModelProviderFactory = anyexplicitswithoutignoral.getDefaultViewModelProviderFactory()) == null) ? this.$IconCompatParcelizer.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(Fragment fragment, RenewEligible renewEligible) {
            super(0);
            this.$IconCompatParcelizer = fragment;
            this.$write = renewEligible;
        }
    }

    static final class AudioAttributesCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<unwrap> setupdatedstatusAudioAttributesImplApi26Parcelizer = FragmentWrapper.this.write().AudioAttributesImplApi26Parcelizer();
                final FragmentWrapper fragmentWrapper = FragmentWrapper.this;
                this.write = 1;
                if (setupdatedstatusAudioAttributesImplApi26Parcelizer.write(new getValidationToken() { // from class: o.FragmentWrapper.AudioAttributesCompatParcelizer.1
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return AudioAttributesCompatParcelizer((unwrap) obj2);
                    }

                    private Object AudioAttributesCompatParcelizer(unwrap unwrapVar) {
                        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(unwrapVar, unwrap.RemoteActionCompatParcelizer.INSTANCE)) {
                            if (unwrapVar instanceof unwrap.IconCompatParcelizer) {
                                try {
                                    fragmentWrapper.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(((unwrap.IconCompatParcelizer) unwrapVar).RemoteActionCompatParcelizer())));
                                } catch (Exception unused) {
                                    ResolvableApiException.Companion companion = ResolvableApiException.INSTANCE;
                                    Context contextRequireContext = fragmentWrapper.requireContext();
                                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
                                    fragmentWrapper.startActivity(ResolvableApiException.Companion.read(contextRequireContext, new canceledPendingResult(((unwrap.IconCompatParcelizer) unwrapVar).RemoteActionCompatParcelizer(), "", null, 4, null)));
                                }
                                fragmentWrapper.write().AudioAttributesCompatParcelizer(getRemoteVersion.IconCompatParcelizer.INSTANCE);
                            } else if (unwrapVar instanceof unwrap.AudioAttributesCompatParcelizer) {
                                FragmentWrapper fragmentWrapper2 = fragmentWrapper;
                                PlanActivity.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = PlanActivity.RemoteActionCompatParcelizer;
                                Context contextRequireContext2 = fragmentWrapper.requireContext();
                                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext2, "");
                                String lowerCase = "PLAN_VALIDITY".toLowerCase(Locale.ROOT);
                                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lowerCase, "");
                                fragmentWrapper2.startActivity(PlanActivity.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(contextRequireContext2, "Pro Subscription Dialog", lowerCase));
                                fragmentWrapper.write().AudioAttributesCompatParcelizer(getRemoteVersion.IconCompatParcelizer.INSTANCE);
                            } else if (unwrapVar instanceof unwrap.write) {
                                FragmentWrapper fragmentWrapper3 = fragmentWrapper;
                                FragmentWrapper fragmentWrapper4 = fragmentWrapper3;
                                String string = fragmentWrapper3.getString(R.string.my_plan_error);
                                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
                                CmcdConfigurationRequestConfig.AudioAttributesCompatParcelizer(fragmentWrapper4, string, 1);
                                fragmentWrapper.write().AudioAttributesCompatParcelizer(getRemoteVersion.IconCompatParcelizer.INSTANCE);
                            } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(unwrapVar, unwrap.MediaBrowserCompatCustomActionResultReceiver.INSTANCE)) {
                                FragmentWrapper fragmentWrapper5 = fragmentWrapper;
                                FragmentWrapper fragmentWrapper6 = fragmentWrapper5;
                                String string2 = fragmentWrapper5.getString(R.string.app_error_no_internet);
                                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string2, "");
                                CmcdConfigurationRequestConfig.AudioAttributesCompatParcelizer(fragmentWrapper6, string2, 0);
                                fragmentWrapper.write().AudioAttributesCompatParcelizer(getRemoteVersion.IconCompatParcelizer.INSTANCE);
                            } else {
                                if (!(unwrapVar instanceof unwrap.read)) {
                                    throw new RenewEligibleCreator();
                                }
                                fragmentWrapper.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(((unwrap.read) unwrapVar).read())));
                                fragmentWrapper.write().AudioAttributesCompatParcelizer(getRemoteVersion.IconCompatParcelizer.INSTANCE);
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

        AudioAttributesCompatParcelizer(SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return FragmentWrapper.this.new AudioAttributesCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    static final class IconCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<getLocalVersion> setupdatedstatus = FragmentWrapper.this.write().read();
                final FragmentWrapper fragmentWrapper = FragmentWrapper.this;
                this.RemoteActionCompatParcelizer = 1;
                if (setupdatedstatus.write(new getValidationToken() { // from class: o.FragmentWrapper.IconCompatParcelizer.5
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return RemoteActionCompatParcelizer((getLocalVersion) obj2);
                    }

                    private Object RemoteActionCompatParcelizer(getLocalVersion getlocalversion) {
                        HlsExtractorFactory hlsExtractorFactory = fragmentWrapper.IconCompatParcelizer;
                        HlsExtractorFactory hlsExtractorFactory2 = null;
                        if (hlsExtractorFactory == null) {
                            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                            hlsExtractorFactory = null;
                        }
                        FragmentWrapper fragmentWrapper2 = fragmentWrapper;
                        TextView textView = hlsExtractorFactory.handleMediaPlayPauseIfPendingOnHandler;
                        String audioAttributesImplApi21Parcelizer = getlocalversion.getAudioAttributesImplApi21Parcelizer();
                        if (audioAttributesImplApi21Parcelizer.length() == 0) {
                            audioAttributesImplApi21Parcelizer = "-";
                        }
                        textView.setText(audioAttributesImplApi21Parcelizer);
                        TextView textView2 = hlsExtractorFactory.onCommand;
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView2, "");
                        textView2.setVisibility(getlocalversion.getIconCompatParcelizer() ? 0 : 8);
                        TextView textView3 = hlsExtractorFactory.AudioAttributesImplBaseParcelizer;
                        String audioAttributesCompatParcelizer = getlocalversion.getAudioAttributesCompatParcelizer();
                        if (audioAttributesCompatParcelizer.length() == 0) {
                            audioAttributesCompatParcelizer = "-";
                        }
                        textView3.setText(audioAttributesCompatParcelizer);
                        TextView textView4 = hlsExtractorFactory.MediaBrowserCompatMediaItem;
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView4, "");
                        textView4.setVisibility(getlocalversion.getRemoteActionCompatParcelizer() ? 0 : 8);
                        TextView textView5 = hlsExtractorFactory.MediaMetadataCompat;
                        String mediaBrowserCompatCustomActionResultReceiver = getlocalversion.getMediaBrowserCompatCustomActionResultReceiver();
                        textView5.setText(mediaBrowserCompatCustomActionResultReceiver.length() != 0 ? mediaBrowserCompatCustomActionResultReceiver : "-");
                        TextView textView6 = hlsExtractorFactory.MediaDescriptionCompat;
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView6, "");
                        textView6.setVisibility(getlocalversion.getWrite() ? 0 : 8);
                        boolean read = getlocalversion.getRead();
                        HlsExtractorFactory hlsExtractorFactory3 = fragmentWrapper2.IconCompatParcelizer;
                        if (hlsExtractorFactory3 == null) {
                            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                            hlsExtractorFactory3 = null;
                        }
                        LinearLayout linearLayout = hlsExtractorFactory3.AudioAttributesImplApi21Parcelizer;
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout, "");
                        linearLayout.setVisibility(read ? 0 : 8);
                        Pair pair = read ? new Pair(QBankStatsResponse.write(BitmapDescriptorFactory.HUE_RED), QBankStatsResponse.write(180.0f)) : new Pair(QBankStatsResponse.write(180.0f), QBankStatsResponse.write(BitmapDescriptorFactory.HUE_RED));
                        float fFloatValue = ((Number) pair.RemoteActionCompatParcelizer()).floatValue();
                        float fFloatValue2 = ((Number) pair.read()).floatValue();
                        HlsExtractorFactory hlsExtractorFactory4 = fragmentWrapper2.IconCompatParcelizer;
                        if (hlsExtractorFactory4 == null) {
                            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                        } else {
                            hlsExtractorFactory2 = hlsExtractorFactory4;
                        }
                        ImageView imageView = hlsExtractorFactory2.read;
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView, "");
                        createEquirectangular.AudioAttributesCompatParcelizer(imageView, fFloatValue, fFloatValue2, 200L);
                        fragmentWrapper2.write().AudioAttributesCompatParcelizer(getRemoteVersion.IconCompatParcelizer.INSTANCE);
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

        IconCompatParcelizer(SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return FragmentWrapper.this.new IconCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((IconCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    static final class write extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<List<DynamiteModule>> setupdatedstatusIconCompatParcelizer = FragmentWrapper.this.write().IconCompatParcelizer();
                final FragmentWrapper fragmentWrapper = FragmentWrapper.this;
                this.RemoteActionCompatParcelizer = 1;
                if (setupdatedstatusIconCompatParcelizer.write(new getValidationToken() { // from class: o.FragmentWrapper.write.5
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return read((List) obj2);
                    }

                    private Object read(List<DynamiteModule> list) {
                        HlsExtractorFactory hlsExtractorFactory = fragmentWrapper.IconCompatParcelizer;
                        HlsExtractorFactory hlsExtractorFactory2 = null;
                        if (hlsExtractorFactory == null) {
                            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                            hlsExtractorFactory = null;
                        }
                        hlsExtractorFactory.AudioAttributesImplApi21Parcelizer.removeAllViews();
                        if (!list.isEmpty()) {
                            HlsExtractorFactory hlsExtractorFactory3 = fragmentWrapper.IconCompatParcelizer;
                            if (hlsExtractorFactory3 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                hlsExtractorFactory3 = null;
                            }
                            LinearLayout linearLayout = hlsExtractorFactory3.MediaBrowserCompatSearchResultReceiver;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout, "");
                            bytesRead.AudioAttributesImplApi21Parcelizer(linearLayout);
                            FragmentWrapper fragmentWrapper2 = fragmentWrapper;
                            Iterator<T> it = list.iterator();
                            while (it.hasNext()) {
                                fragmentWrapper2.write((DynamiteModule) it.next());
                            }
                            HlsExtractorFactory hlsExtractorFactory4 = fragmentWrapper.IconCompatParcelizer;
                            if (hlsExtractorFactory4 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                            } else {
                                hlsExtractorFactory2 = hlsExtractorFactory4;
                            }
                            View viewFindViewById = hlsExtractorFactory2.AudioAttributesImplApi21Parcelizer.getChildAt(IntermediateLoginResponseBody.write((List) list)).findViewById(R.id.viewSubjectDivider);
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewFindViewById, "");
                            bytesRead.MediaBrowserCompatCustomActionResultReceiver(viewFindViewById);
                        } else {
                            HlsExtractorFactory hlsExtractorFactory5 = fragmentWrapper.IconCompatParcelizer;
                            if (hlsExtractorFactory5 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                            } else {
                                hlsExtractorFactory2 = hlsExtractorFactory5;
                            }
                            LinearLayout linearLayout2 = hlsExtractorFactory2.MediaBrowserCompatSearchResultReceiver;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout2, "");
                            bytesRead.MediaBrowserCompatCustomActionResultReceiver(linearLayout2);
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

        write(SampleVideos<? super write> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return FragmentWrapper.this.new write(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((write) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    static final class MediaBrowserCompatItemReceiver extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<List<OnDelegateCreatedListener>> setupdatedstatusAudioAttributesCompatParcelizer = FragmentWrapper.this.write().AudioAttributesCompatParcelizer();
                final FragmentWrapper fragmentWrapper = FragmentWrapper.this;
                this.read = 1;
                if (setupdatedstatusAudioAttributesCompatParcelizer.write(new getValidationToken() { // from class: o.FragmentWrapper.MediaBrowserCompatItemReceiver.5
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return read((List) obj2);
                    }

                    private Object read(List<OnDelegateCreatedListener> list) {
                        fragmentWrapper.read.RemoteActionCompatParcelizer(list);
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
            return FragmentWrapper.this.new MediaBrowserCompatItemReceiver(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaBrowserCompatItemReceiver) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void write(DynamiteModule p0) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        HlsExtractorFactory hlsExtractorFactory = this.IconCompatParcelizer;
        HlsExtractorFactory hlsExtractorFactory2 = null;
        if (hlsExtractorFactory == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            hlsExtractorFactory = null;
        }
        HlsMediaPlaylistSegment hlsMediaPlaylistSegment = HlsMediaPlaylistSegment.read(layoutInflaterFrom, hlsExtractorFactory.AudioAttributesCompatParcelizer);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(hlsMediaPlaylistSegment, "");
        hlsMediaPlaylistSegment.write.setText(p0.IconCompatParcelizer());
        TextView textView = hlsMediaPlaylistSegment.RemoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView, "");
        textView.setVisibility(!p0.RemoteActionCompatParcelizer() ? 8 : 0);
        hlsMediaPlaylistSegment.AudioAttributesCompatParcelizer.setText(p0.AudioAttributesCompatParcelizer());
        HlsExtractorFactory hlsExtractorFactory3 = this.IconCompatParcelizer;
        if (hlsExtractorFactory3 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            hlsExtractorFactory2 = hlsExtractorFactory3;
        }
        hlsExtractorFactory2.AudioAttributesImplApi21Parcelizer.addView(hlsMediaPlaylistSegment.IconCompatParcelizer());
    }

    /* JADX INFO: renamed from: o.FragmentWrapper$read, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo/FragmentWrapper$read;", "", "<init>", "()V", "Lo/FragmentWrapper;", "read", "()Lo/FragmentWrapper;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static FragmentWrapper read() {
            return new FragmentWrapper();
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
