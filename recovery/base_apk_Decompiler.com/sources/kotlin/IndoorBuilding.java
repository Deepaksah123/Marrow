package kotlin;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.util.DeviceProperties;
import com.marrow.R;
import com.marrow2.data.user.remote.model.CourseModelV3;
import com.marrow2.ui.signup.course.viewmodel.SignUpCourseViewModel;
import kotlin.LatLngBounds;
import kotlin.Metadata;
import kotlin.VisibilityChecker;
import kotlin.including;
import kotlin.setWatermarkEnabled;
import kotlin.withFieldVisibility;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0003J\u000f\u0010\u0013\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0003J\u000f\u0010\u0014\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0014\u0010\u0003R\u0016\u0010\u0017\u001a\u00020\u00158\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0011\u0010\u0016R\u001b\u0010\u0019\u001a\u00020\u00188CX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u0016\u0010\u0011\u001a\u00020\u001c8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u0017\u0010\u001d"}, d2 = {"Lo/IndoorBuilding;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Landroid/view/LayoutInflater;", "p0", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "AudioAttributesImplApi26Parcelizer", "AudioAttributesCompatParcelizer", "RemoteActionCompatParcelizer", "AudioAttributesImplBaseParcelizer", "read", "Lo/DefaultHlsPlaylistTracker;", "Lo/DefaultHlsPlaylistTracker;", "IconCompatParcelizer", "Lcom/marrow2/ui/signup/course/viewmodel/SignUpCourseViewModel;", "write", "Lo/RenewEligible;", "()Lcom/marrow2/ui/signup/course/viewmodel/SignUpCourseViewModel;", "Lo/anchor;", "Lo/anchor;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class IndoorBuilding extends positionFromBounds {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private DefaultHlsPlaylistTracker IconCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private anchor AudioAttributesCompatParcelizer;
    private final RenewEligible write;

    public IndoorBuilding() {
        IndoorBuilding indoorBuilding = this;
        RenewEligible renewEligibleWrite = getRenewExpiresOn.write(RenewEligibleCompanion.read, new AnonymousClass5(new AnonymousClass2(indoorBuilding)));
        this.write = _resolveFieldVsGetter.RemoteActionCompatParcelizer(toMagicModuleMetaDataUcModel.write(SignUpCourseViewModel.class), new AnonymousClass3(renewEligibleWrite), new AnonymousClass1(renewEligibleWrite), new AnonymousClass4(indoorBuilding, renewEligibleWrite));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SignUpCourseViewModel write() {
        return (SignUpCourseViewModel) this.write.RemoteActionCompatParcelizer();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        DefaultHlsPlaylistTracker defaultHlsPlaylistTracker = DefaultHlsPlaylistTracker.read(p0, p1);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(defaultHlsPlaylistTracker, "");
        this.IconCompatParcelizer = defaultHlsPlaylistTracker;
        if (defaultHlsPlaylistTracker == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            defaultHlsPlaylistTracker = null;
        }
        LinearLayout linearLayoutIconCompatParcelizer = defaultHlsPlaylistTracker.IconCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayoutIconCompatParcelizer, "");
        return linearLayoutIconCompatParcelizer;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View p0, Bundle p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        super.onViewCreated(p0, p1);
        AudioAttributesCompatParcelizer();
        RemoteActionCompatParcelizer();
        read();
        AudioAttributesImplBaseParcelizer();
        AudioAttributesImplApi26Parcelizer();
    }

    private final void AudioAttributesImplApi26Parcelizer() {
        if (DeviceProperties.isTablet(requireContext())) {
            Context contextRequireContext = requireContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
            DefaultHlsPlaylistTracker defaultHlsPlaylistTracker = this.IconCompatParcelizer;
            if (defaultHlsPlaylistTracker == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                defaultHlsPlaylistTracker = null;
            }
            RecyclerView recyclerView = defaultHlsPlaylistTracker.write;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(recyclerView, "");
            bytesRead.AudioAttributesCompatParcelizer(contextRequireContext, recyclerView);
        }
    }

    private final void AudioAttributesCompatParcelizer() {
        DefaultHlsPlaylistTracker defaultHlsPlaylistTracker = this.IconCompatParcelizer;
        DefaultHlsPlaylistTracker defaultHlsPlaylistTracker2 = null;
        if (defaultHlsPlaylistTracker == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            defaultHlsPlaylistTracker = null;
        }
        Toolbar toolbar = defaultHlsPlaylistTracker.RemoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(toolbar, "");
        getHttpMethodString.read((View) toolbar, true, false, true, true, 0, 50);
        DefaultHlsPlaylistTracker defaultHlsPlaylistTracker3 = this.IconCompatParcelizer;
        if (defaultHlsPlaylistTracker3 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            defaultHlsPlaylistTracker2 = defaultHlsPlaylistTracker3;
        }
        FrameLayout frameLayout = defaultHlsPlaylistTracker2.AudioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(frameLayout, "");
        getHttpMethodString.read((View) frameLayout, false, true, true, true, 0, 49);
    }

    private final void RemoteActionCompatParcelizer() {
        this.AudioAttributesCompatParcelizer = new anchor(new getAnswerMap() { // from class: o.JointType
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return IndoorBuilding.IconCompatParcelizer(this.RemoteActionCompatParcelizer, (CourseModelV3) obj);
            }
        });
        DefaultHlsPlaylistTracker defaultHlsPlaylistTracker = this.IconCompatParcelizer;
        anchor anchorVar = null;
        if (defaultHlsPlaylistTracker == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            defaultHlsPlaylistTracker = null;
        }
        RecyclerView recyclerView = defaultHlsPlaylistTracker.write;
        anchor anchorVar2 = this.AudioAttributesCompatParcelizer;
        if (anchorVar2 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            anchorVar = anchorVar2;
        }
        recyclerView.setAdapter(anchorVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(IndoorBuilding indoorBuilding, CourseModelV3 courseModelV3) {
        toMagicModuleMetaRepoModel.write(courseModelV3, "");
        indoorBuilding.write().read(new including.read(courseModelV3));
        return getShowPopup.INSTANCE;
    }

    static final class write extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<Boolean> setupdatedstatusAudioAttributesCompatParcelizer = IndoorBuilding.this.write().AudioAttributesCompatParcelizer();
                final IndoorBuilding indoorBuilding = IndoorBuilding.this;
                this.write = 1;
                if (setupdatedstatusAudioAttributesCompatParcelizer.write(new getValidationToken() { // from class: o.IndoorBuilding.write.4
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return write(((Boolean) obj2).booleanValue());
                    }

                    private Object write(boolean z) {
                        DefaultHlsPlaylistTracker defaultHlsPlaylistTracker = indoorBuilding.IconCompatParcelizer;
                        if (defaultHlsPlaylistTracker == null) {
                            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                            defaultHlsPlaylistTracker = null;
                        }
                        ProgressBar progressBar = defaultHlsPlaylistTracker.IconCompatParcelizer;
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(progressBar, "");
                        progressBar.setVisibility(z ? 0 : 8);
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
            return IndoorBuilding.this.new write(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((write) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void AudioAttributesImplBaseParcelizer() {
        IndoorBuilding indoorBuilding = this;
        setBitrateKbps.RemoteActionCompatParcelizer(indoorBuilding, new write(null));
        setBitrateKbps.RemoteActionCompatParcelizer(indoorBuilding, new read(null));
        setBitrateKbps.RemoteActionCompatParcelizer(indoorBuilding, new IconCompatParcelizer(null));
    }

    static final class read extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<LatLng> setupdatedstatusIconCompatParcelizer = IndoorBuilding.this.write().IconCompatParcelizer();
                final IndoorBuilding indoorBuilding = IndoorBuilding.this;
                this.AudioAttributesCompatParcelizer = 1;
                if (setupdatedstatusIconCompatParcelizer.write(new getValidationToken() { // from class: o.IndoorBuilding.read.1
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return write((LatLng) obj2);
                    }

                    private Object write(LatLng latLng) {
                        anchor anchorVar = indoorBuilding.AudioAttributesCompatParcelizer;
                        if (anchorVar == null) {
                            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                            anchorVar = null;
                        }
                        anchorVar.IconCompatParcelizer(latLng.AudioAttributesCompatParcelizer(), latLng.getRead());
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
            return IndoorBuilding.this.new read(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((read) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    static final class IconCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<LatLngBounds> setupdatedstatus = IndoorBuilding.this.write().read();
                final IndoorBuilding indoorBuilding = IndoorBuilding.this;
                this.read = 1;
                if (setupdatedstatus.write(new getValidationToken() { // from class: o.IndoorBuilding.IconCompatParcelizer.2
                    @Override // kotlin.getValidationToken
                    public final /* bridge */ /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return IconCompatParcelizer((LatLngBounds) obj2);
                    }

                    private Object IconCompatParcelizer(LatLngBounds latLngBounds) {
                        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(latLngBounds, LatLngBounds.IconCompatParcelizer.INSTANCE)) {
                            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(latLngBounds, LatLngBounds.RemoteActionCompatParcelizer.INSTANCE)) {
                                IndoorBuilding indoorBuilding2 = indoorBuilding;
                                IndoorBuilding indoorBuilding3 = indoorBuilding2;
                                String string = indoorBuilding2.getString(R.string.app_error_no_internet);
                                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
                                CmcdConfigurationRequestConfig.AudioAttributesCompatParcelizer(indoorBuilding3, string, 0);
                            } else if (latLngBounds instanceof LatLngBounds.write) {
                                CmcdConfigurationRequestConfig.AudioAttributesCompatParcelizer(indoorBuilding, ((LatLngBounds.write) latLngBounds).RemoteActionCompatParcelizer(), 0);
                            } else {
                                if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(latLngBounds, LatLngBounds.AudioAttributesCompatParcelizer.INSTANCE)) {
                                    throw new RenewEligibleCreator();
                                }
                                setWatermarkEnabled.Companion companion = setWatermarkEnabled.INSTANCE;
                                Context contextRequireContext = indoorBuilding.requireContext();
                                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
                                indoorBuilding.startActivity(setWatermarkEnabled.Companion.AudioAttributesCompatParcelizer(contextRequireContext, false, false, 6));
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

        IconCompatParcelizer(SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return IndoorBuilding.this.new IconCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((IconCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: o.IndoorBuilding$2, reason: invalid class name */
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

    /* JADX INFO: renamed from: o.IndoorBuilding$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/TypeResolutionContext;", "AudioAttributesCompatParcelizer", "()Lo/TypeResolutionContext;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass5 extends MagicModuleUseCase implements getCreatedOnDateMs<TypeResolutionContext> {
        private /* synthetic */ getCreatedOnDateMs $write;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final TypeResolutionContext invoke() {
            return (TypeResolutionContext) this.$write.invoke();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(getCreatedOnDateMs getcreatedondatems) {
            super(0);
            this.$write = getcreatedondatems;
        }
    }

    /* JADX INFO: renamed from: o.IndoorBuilding$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/hasMixIns;", "IconCompatParcelizer", "()Lo/hasMixIns;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass3 extends MagicModuleUseCase implements getCreatedOnDateMs<hasMixIns> {
        private /* synthetic */ RenewEligible $RemoteActionCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final hasMixIns invoke() {
            return _resolveFieldVsGetter.write(this.$RemoteActionCompatParcelizer).getViewModelStore();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(RenewEligible renewEligible) {
            super(0);
            this.$RemoteActionCompatParcelizer = renewEligible;
        }
    }

    /* JADX INFO: renamed from: o.IndoorBuilding$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/withFieldVisibility;", "write", "()Lo/withFieldVisibility;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass1 extends MagicModuleUseCase implements getCreatedOnDateMs<withFieldVisibility> {
        private /* synthetic */ RenewEligible $AudioAttributesCompatParcelizer;
        private /* synthetic */ getCreatedOnDateMs $write = null;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final withFieldVisibility invoke() {
            TypeResolutionContext typeResolutionContextWrite = _resolveFieldVsGetter.write(this.$AudioAttributesCompatParcelizer);
            anyExplicitsWithoutIgnoral anyexplicitswithoutignoral = typeResolutionContextWrite instanceof anyExplicitsWithoutIgnoral ? (anyExplicitsWithoutIgnoral) typeResolutionContextWrite : null;
            return anyexplicitswithoutignoral != null ? anyexplicitswithoutignoral.getDefaultViewModelCreationExtras() : withFieldVisibility.write.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(RenewEligible renewEligible) {
            super(0);
            this.$AudioAttributesCompatParcelizer = renewEligible;
        }
    }

    /* JADX INFO: renamed from: o.IndoorBuilding$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/VisibilityChecker$RemoteActionCompatParcelizer;", "IconCompatParcelizer", "()Lo/VisibilityChecker$RemoteActionCompatParcelizer;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass4 extends MagicModuleUseCase implements getCreatedOnDateMs<VisibilityChecker.RemoteActionCompatParcelizer> {
        private /* synthetic */ RenewEligible $RemoteActionCompatParcelizer;
        private /* synthetic */ Fragment $write;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final VisibilityChecker.RemoteActionCompatParcelizer invoke() {
            VisibilityChecker.RemoteActionCompatParcelizer defaultViewModelProviderFactory;
            TypeResolutionContext typeResolutionContextWrite = _resolveFieldVsGetter.write(this.$RemoteActionCompatParcelizer);
            anyExplicitsWithoutIgnoral anyexplicitswithoutignoral = typeResolutionContextWrite instanceof anyExplicitsWithoutIgnoral ? (anyExplicitsWithoutIgnoral) typeResolutionContextWrite : null;
            return (anyexplicitswithoutignoral == null || (defaultViewModelProviderFactory = anyexplicitswithoutignoral.getDefaultViewModelProviderFactory()) == null) ? this.$write.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(Fragment fragment, RenewEligible renewEligible) {
            super(0);
            this.$write = fragment;
            this.$RemoteActionCompatParcelizer = renewEligible;
        }
    }

    private final void read() {
        DefaultHlsPlaylistTracker defaultHlsPlaylistTracker = this.IconCompatParcelizer;
        DefaultHlsPlaylistTracker defaultHlsPlaylistTracker2 = null;
        if (defaultHlsPlaylistTracker == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            defaultHlsPlaylistTracker = null;
        }
        defaultHlsPlaylistTracker.RemoteActionCompatParcelizer.setNavigationOnClickListener(new View.OnClickListener() { // from class: o.transparency
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IndoorBuilding.MediaBrowserCompatCustomActionResultReceiver(this.RemoteActionCompatParcelizer);
            }
        });
        DefaultHlsPlaylistTracker defaultHlsPlaylistTracker3 = this.IconCompatParcelizer;
        if (defaultHlsPlaylistTracker3 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            defaultHlsPlaylistTracker2 = defaultHlsPlaylistTracker3;
        }
        Button button = defaultHlsPlaylistTracker2.read;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(button, "");
        bytesRead.IconCompatParcelizer(button, (getCreatedOnDateMs<getShowPopup>) new getCreatedOnDateMs() { // from class: o.IndoorBuildingzza
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return IndoorBuilding.AudioAttributesImplApi26Parcelizer(this.write);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MediaBrowserCompatCustomActionResultReceiver(IndoorBuilding indoorBuilding) {
        maybeGetTypeVariable activity = indoorBuilding.getActivity();
        if (activity != null) {
            activity.onBackPressed();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesImplApi26Parcelizer(IndoorBuilding indoorBuilding) {
        indoorBuilding.write().read(including.IconCompatParcelizer.INSTANCE);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: renamed from: o.IndoorBuilding$RemoteActionCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo/IndoorBuilding$RemoteActionCompatParcelizer;", "", "<init>", "()V", "Lo/IndoorBuilding;", "write", "()Lo/IndoorBuilding;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static IndoorBuilding write() {
            return new IndoorBuilding();
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
