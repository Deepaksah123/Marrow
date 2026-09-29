package kotlin;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.snackbar.Snackbar;
import com.marrow.R;
import com.marrow2.ui.pearl.viewmodel.PearlSubjectListViewModel;
import java.util.List;
import kotlin.ActivityC0235zzab;
import kotlin.Metadata;
import kotlin.VisibilityChecker;
import kotlin.registerAcquireEvent;
import kotlin.registerReleaseEvent;
import kotlin.toInteger;
import kotlin.withFieldVisibility;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 *2\u00020\u0001:\u0001*B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u001a\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010\u001b\u001a\u00020\u0019H\u0002J\b\u0010\u001c\u001a\u00020\u0019H\u0002J\b\u0010\u001d\u001a\u00020\u0019H\u0002J\u0010\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020 H\u0002J\b\u0010!\u001a\u00020\u0019H\u0002J\u001a\u0010\"\u001a\u00020\u00192\u0010\u0010#\u001a\f\u0012\b\u0012\u00060%j\u0002`&0$H\u0002J\u0014\u0010'\u001a\u00020\u00192\n\u0010(\u001a\u00060%j\u0002`&H\u0002J\b\u0010)\u001a\u00020\u0019H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u000e\u0010\f\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/marrow2/ui/pearl/fragment/PearlSubjectListFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "binding", "Lcom/marrow/databinding/FragmentPearlSubjectListBinding;", "viewModel", "Lcom/marrow2/ui/pearl/viewmodel/PearlSubjectListViewModel;", "getViewModel", "()Lcom/marrow2/ui/pearl/viewmodel/PearlSubjectListViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "adapter", "Lcom/marrow2/ui/pearl/adapter/PearlSubjectAdapter;", "pearlDeletionSnack", "Lcom/google/android/material/snackbar/Snackbar;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", "view", "applyEdgeToEdgeInsets", "initView", "initObservers", "showHidePearlDeletion", "isVisible", "", "onSearchTapped", "setRecyclerView", "data", "", "Lcom/marrow2/domain/pearl/model/PearlSubjectUCModel;", "Lcom/marrow2/ui/pearl/model/PearlSubjectVMModel;", "openPearlList", "item", "setMargins", "Companion", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FastSafeParcelableJsonResponse extends deferredInstall {
    public static final RemoteActionCompatParcelizer IconCompatParcelizer = new RemoteActionCompatParcelizer(null);
    private HlsDataSourceFactory AudioAttributesCompatParcelizer;
    private final RenewEligible RemoteActionCompatParcelizer;
    private Logger read;
    private Snackbar write;

    public FastSafeParcelableJsonResponse() {
        FastSafeParcelableJsonResponse fastSafeParcelableJsonResponse = this;
        RenewEligible renewEligibleWrite = getRenewExpiresOn.write(RenewEligibleCompanion.read, new AnonymousClass3(new AnonymousClass2(fastSafeParcelableJsonResponse)));
        this.RemoteActionCompatParcelizer = _resolveFieldVsGetter.RemoteActionCompatParcelizer(toMagicModuleMetaDataUcModel.write(PearlSubjectListViewModel.class), new AnonymousClass4(renewEligibleWrite), new AnonymousClass5(renewEligibleWrite), new AnonymousClass1(fastSafeParcelableJsonResponse, renewEligibleWrite));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PearlSubjectListViewModel write() {
        return (PearlSubjectListViewModel) this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        toMagicModuleMetaRepoModel.write(inflater, "");
        HlsDataSourceFactory hlsDataSourceFactoryRemoteActionCompatParcelizer = HlsDataSourceFactory.RemoteActionCompatParcelizer(inflater, container);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(hlsDataSourceFactoryRemoteActionCompatParcelizer, "");
        this.AudioAttributesCompatParcelizer = hlsDataSourceFactoryRemoteActionCompatParcelizer;
        if (hlsDataSourceFactoryRemoteActionCompatParcelizer == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            hlsDataSourceFactoryRemoteActionCompatParcelizer = null;
        }
        ConstraintLayout constraintLayoutIconCompatParcelizer = hlsDataSourceFactoryRemoteActionCompatParcelizer.IconCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayoutIconCompatParcelizer, "");
        return constraintLayoutIconCompatParcelizer;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle savedInstanceState) {
        toMagicModuleMetaRepoModel.write(view, "");
        super.onViewCreated(view, savedInstanceState);
        read();
        AudioAttributesImplApi26Parcelizer();
        RemoteActionCompatParcelizer();
        AudioAttributesCompatParcelizer();
    }

    private final void read() {
        HlsDataSourceFactory hlsDataSourceFactory = this.AudioAttributesCompatParcelizer;
        HlsDataSourceFactory hlsDataSourceFactory2 = null;
        if (hlsDataSourceFactory == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            hlsDataSourceFactory = null;
        }
        MaterialToolbar materialToolbar = hlsDataSourceFactory.RemoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(materialToolbar, "");
        getHttpMethodString.read((View) materialToolbar, true, false, true, true, 0, 50);
        HlsDataSourceFactory hlsDataSourceFactory3 = this.AudioAttributesCompatParcelizer;
        if (hlsDataSourceFactory3 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            hlsDataSourceFactory2 = hlsDataSourceFactory3;
        }
        RecyclerView recyclerView = hlsDataSourceFactory2.AudioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(recyclerView, "");
        getHttpMethodString.read((View) recyclerView, false, true, true, true, 0, 49);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AudioAttributesCompatParcelizer(FastSafeParcelableJsonResponse fastSafeParcelableJsonResponse) {
        fastSafeParcelableJsonResponse.requireActivity().onBackPressed();
    }

    private final void RemoteActionCompatParcelizer() {
        int i;
        HlsDataSourceFactory hlsDataSourceFactory = this.AudioAttributesCompatParcelizer;
        HlsDataSourceFactory hlsDataSourceFactory2 = null;
        if (hlsDataSourceFactory == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            hlsDataSourceFactory = null;
        }
        hlsDataSourceFactory.RemoteActionCompatParcelizer.setNavigationOnClickListener(new View.OnClickListener() { // from class: o.getSafeParcelableFieldId
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FastSafeParcelableJsonResponse.AudioAttributesCompatParcelizer(this.IconCompatParcelizer);
            }
        });
        HlsDataSourceFactory hlsDataSourceFactory3 = this.AudioAttributesCompatParcelizer;
        if (hlsDataSourceFactory3 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            hlsDataSourceFactory3 = null;
        }
        hlsDataSourceFactory3.read.setOnClickListener(new View.OnClickListener() { // from class: o.CursorWrapper
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FastSafeParcelableJsonResponse.AudioAttributesImplApi26Parcelizer(this.AudioAttributesCompatParcelizer);
            }
        });
        if (DeviceProperties.isTablet(requireContext())) {
            Context contextRequireContext = requireContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
            i = PlayerControlViewExternalSyntheticLambda1.read(contextRequireContext);
        } else {
            i = setObjectType.read(24);
        }
        int i2 = i;
        HlsDataSourceFactory hlsDataSourceFactory4 = this.AudioAttributesCompatParcelizer;
        if (hlsDataSourceFactory4 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            hlsDataSourceFactory2 = hlsDataSourceFactory4;
        }
        RecyclerView recyclerView = hlsDataSourceFactory2.AudioAttributesCompatParcelizer;
        Context contextRequireContext2 = requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext2, "");
        recyclerView.AudioAttributesCompatParcelizer(new CmcdHeadersFactoryCmcdObject(contextRequireContext2, i2, false, 4, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AudioAttributesImplApi26Parcelizer(FastSafeParcelableJsonResponse fastSafeParcelableJsonResponse) {
        fastSafeParcelableJsonResponse.MediaBrowserCompatCustomActionResultReceiver();
    }

    static final class write extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                isDark<DataSourceBitmapLoaderExternalSyntheticLambda0<List<readUnsignedInt>>> isdarkAudioAttributesCompatParcelizer = FastSafeParcelableJsonResponse.this.write().AudioAttributesCompatParcelizer();
                final FastSafeParcelableJsonResponse fastSafeParcelableJsonResponse = FastSafeParcelableJsonResponse.this;
                this.write = 1;
                if (isdarkAudioAttributesCompatParcelizer.write(new getValidationToken() { // from class: o.FastSafeParcelableJsonResponse.write.5
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return RemoteActionCompatParcelizer((DataSourceBitmapLoaderExternalSyntheticLambda0) obj2);
                    }

                    private Object RemoteActionCompatParcelizer(DataSourceBitmapLoaderExternalSyntheticLambda0<List<readUnsignedInt>> dataSourceBitmapLoaderExternalSyntheticLambda0) {
                        if (dataSourceBitmapLoaderExternalSyntheticLambda0 instanceof decodeBitmap) {
                            fastSafeParcelableJsonResponse.read((List<readUnsignedInt>) ((decodeBitmap) dataSourceBitmapLoaderExternalSyntheticLambda0).RemoteActionCompatParcelizer());
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
            return FastSafeParcelableJsonResponse.this.new write(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((write) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void AudioAttributesCompatParcelizer() {
        FastSafeParcelableJsonResponse fastSafeParcelableJsonResponse = this;
        setBitrateKbps.read(fastSafeParcelableJsonResponse, new write(null));
        setBitrateKbps.read(fastSafeParcelableJsonResponse, new IconCompatParcelizer(null));
        setBitrateKbps.read(fastSafeParcelableJsonResponse, new AudioAttributesCompatParcelizer(null));
    }

    static final class IconCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                isDark<Boolean> isdark = FastSafeParcelableJsonResponse.this.write().read();
                final FastSafeParcelableJsonResponse fastSafeParcelableJsonResponse = FastSafeParcelableJsonResponse.this;
                this.AudioAttributesCompatParcelizer = 1;
                if (isdark.write(new getValidationToken() { // from class: o.FastSafeParcelableJsonResponse.IconCompatParcelizer.2
                    @Override // kotlin.getValidationToken
                    public final /* bridge */ /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return IconCompatParcelizer(((Boolean) obj2).booleanValue());
                    }

                    private Object IconCompatParcelizer(boolean z) {
                        fastSafeParcelableJsonResponse.AudioAttributesCompatParcelizer(z);
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
            return FastSafeParcelableJsonResponse.this.new IconCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((IconCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
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
                setUpdatedStatus<registerReleaseEvent> setupdatedstatusIconCompatParcelizer = FastSafeParcelableJsonResponse.this.write().IconCompatParcelizer();
                final FastSafeParcelableJsonResponse fastSafeParcelableJsonResponse = FastSafeParcelableJsonResponse.this;
                this.write = 1;
                if (setupdatedstatusIconCompatParcelizer.write(new getValidationToken() { // from class: o.FastSafeParcelableJsonResponse.AudioAttributesCompatParcelizer.3
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return read((registerReleaseEvent) obj2);
                    }

                    private Object read(registerReleaseEvent registerreleaseevent) {
                        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(registerreleaseevent, registerReleaseEvent.read.INSTANCE)) {
                            if (registerreleaseevent instanceof registerReleaseEvent.RemoteActionCompatParcelizer) {
                                fastSafeParcelableJsonResponse.IconCompatParcelizer(((registerReleaseEvent.RemoteActionCompatParcelizer) registerreleaseevent).AudioAttributesCompatParcelizer());
                            } else {
                                throw new RenewEligibleCreator();
                            }
                        }
                        fastSafeParcelableJsonResponse.write().RemoteActionCompatParcelizer(registerAcquireEvent.AudioAttributesCompatParcelizer.INSTANCE);
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
            return FastSafeParcelableJsonResponse.this.new AudioAttributesCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AudioAttributesCompatParcelizer(boolean z) {
        Snackbar snackbar = null;
        HlsDataSourceFactory hlsDataSourceFactory = null;
        if (z) {
            bytesToStringUppercase bytestostringuppercase = bytesToStringUppercase.INSTANCE;
            HlsDataSourceFactory hlsDataSourceFactory2 = this.AudioAttributesCompatParcelizer;
            if (hlsDataSourceFactory2 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            } else {
                hlsDataSourceFactory = hlsDataSourceFactory2;
            }
            ConstraintLayout constraintLayoutIconCompatParcelizer = hlsDataSourceFactory.IconCompatParcelizer();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayoutIconCompatParcelizer, "");
            this.write = bytesToStringUppercase.RemoteActionCompatParcelizer(constraintLayoutIconCompatParcelizer, new getCreatedOnDateMs() { // from class: o.FastJsonResponseFieldConverter
                @Override // kotlin.getCreatedOnDateMs
                public final Object invoke() {
                    return FastSafeParcelableJsonResponse.MediaBrowserCompatCustomActionResultReceiver(this.AudioAttributesCompatParcelizer);
                }
            });
            return;
        }
        Snackbar snackbar2 = this.write;
        if (snackbar2 != null) {
            if (snackbar2 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            } else {
                snackbar = snackbar2;
            }
            snackbar.RemoteActionCompatParcelizer();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaBrowserCompatCustomActionResultReceiver(FastSafeParcelableJsonResponse fastSafeParcelableJsonResponse) {
        fastSafeParcelableJsonResponse.write().RemoteActionCompatParcelizer(registerAcquireEvent.IconCompatParcelizer.INSTANCE);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: renamed from: o.FastSafeParcelableJsonResponse$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Landroidx/fragment/app/Fragment;", "IconCompatParcelizer", "()Landroidx/fragment/app/Fragment;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass2 extends MagicModuleUseCase implements getCreatedOnDateMs<Fragment> {
        private /* synthetic */ Fragment $write;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.$write;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Fragment fragment) {
            super(0);
            this.$write = fragment;
        }
    }

    /* JADX INFO: renamed from: o.FastSafeParcelableJsonResponse$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/TypeResolutionContext;", "read", "()Lo/TypeResolutionContext;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass3 extends MagicModuleUseCase implements getCreatedOnDateMs<TypeResolutionContext> {
        private /* synthetic */ getCreatedOnDateMs $write;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final TypeResolutionContext invoke() {
            return (TypeResolutionContext) this.$write.invoke();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(getCreatedOnDateMs getcreatedondatems) {
            super(0);
            this.$write = getcreatedondatems;
        }
    }

    /* JADX INFO: renamed from: o.FastSafeParcelableJsonResponse$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/hasMixIns;", "AudioAttributesCompatParcelizer", "()Lo/hasMixIns;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass4 extends MagicModuleUseCase implements getCreatedOnDateMs<hasMixIns> {
        private /* synthetic */ RenewEligible $write;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final hasMixIns invoke() {
            return _resolveFieldVsGetter.write(this.$write).getViewModelStore();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(RenewEligible renewEligible) {
            super(0);
            this.$write = renewEligible;
        }
    }

    private final void MediaBrowserCompatCustomActionResultReceiver() {
        toInteger.Companion companion = toInteger.INSTANCE;
        Context contextRequireContext = requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        startActivity(toInteger.Companion.write(contextRequireContext, null));
    }

    /* JADX INFO: renamed from: o.FastSafeParcelableJsonResponse$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/withFieldVisibility;", "write", "()Lo/withFieldVisibility;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass5 extends MagicModuleUseCase implements getCreatedOnDateMs<withFieldVisibility> {
        public static int read;
        public static int write;
        private /* synthetic */ RenewEligible $AudioAttributesCompatParcelizer;
        private /* synthetic */ getCreatedOnDateMs $RemoteActionCompatParcelizer = null;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final withFieldVisibility invoke() {
            TypeResolutionContext typeResolutionContextWrite = _resolveFieldVsGetter.write(this.$AudioAttributesCompatParcelizer);
            anyExplicitsWithoutIgnoral anyexplicitswithoutignoral = typeResolutionContextWrite instanceof anyExplicitsWithoutIgnoral ? (anyExplicitsWithoutIgnoral) typeResolutionContextWrite : null;
            return anyexplicitswithoutignoral != null ? anyexplicitswithoutignoral.getDefaultViewModelCreationExtras() : withFieldVisibility.write.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(RenewEligible renewEligible) {
            super(0);
            this.$AudioAttributesCompatParcelizer = renewEligible;
        }

        public static int AudioAttributesCompatParcelizer() {
            int i = write;
            int i2 = i % 7841579;
            write = i + 1;
            if (i2 != 0) {
                return read;
            }
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            read = iFreeMemory;
            return iFreeMemory;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void read(List<readUnsignedInt> list) {
        Logger logger = null;
        HlsDataSourceFactory hlsDataSourceFactory = null;
        if (list.isEmpty()) {
            HlsDataSourceFactory hlsDataSourceFactory2 = this.AudioAttributesCompatParcelizer;
            if (hlsDataSourceFactory2 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            } else {
                hlsDataSourceFactory = hlsDataSourceFactory2;
            }
            RecyclerView recyclerView = hlsDataSourceFactory.AudioAttributesCompatParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(recyclerView, "");
            bytesRead.MediaBrowserCompatCustomActionResultReceiver(recyclerView);
            Toast.makeText(requireContext(), getString(R.string.no_pearl_message), 0).show();
            return;
        }
        HlsDataSourceFactory hlsDataSourceFactory3 = this.AudioAttributesCompatParcelizer;
        if (hlsDataSourceFactory3 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            hlsDataSourceFactory3 = null;
        }
        RecyclerView recyclerView2 = hlsDataSourceFactory3.AudioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(recyclerView2, "");
        bytesRead.AudioAttributesImplApi21Parcelizer(recyclerView2);
        this.read = new Logger(list, new getAnswerMap() { // from class: o.onMove
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return FastSafeParcelableJsonResponse.write(this.IconCompatParcelizer, (readUnsignedInt) obj);
            }
        });
        HlsDataSourceFactory hlsDataSourceFactory4 = this.AudioAttributesCompatParcelizer;
        if (hlsDataSourceFactory4 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            hlsDataSourceFactory4 = null;
        }
        RecyclerView recyclerView3 = hlsDataSourceFactory4.AudioAttributesCompatParcelizer;
        Logger logger2 = this.read;
        if (logger2 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            logger = logger2;
        }
        recyclerView3.setAdapter(logger);
    }

    /* JADX INFO: renamed from: o.FastSafeParcelableJsonResponse$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/VisibilityChecker$RemoteActionCompatParcelizer;", "read", "()Lo/VisibilityChecker$RemoteActionCompatParcelizer;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass1 extends MagicModuleUseCase implements getCreatedOnDateMs<VisibilityChecker.RemoteActionCompatParcelizer> {
        private /* synthetic */ Fragment $IconCompatParcelizer;
        private /* synthetic */ RenewEligible $write;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final VisibilityChecker.RemoteActionCompatParcelizer invoke() {
            VisibilityChecker.RemoteActionCompatParcelizer defaultViewModelProviderFactory;
            TypeResolutionContext typeResolutionContextWrite = _resolveFieldVsGetter.write(this.$write);
            anyExplicitsWithoutIgnoral anyexplicitswithoutignoral = typeResolutionContextWrite instanceof anyExplicitsWithoutIgnoral ? (anyExplicitsWithoutIgnoral) typeResolutionContextWrite : null;
            return (anyexplicitswithoutignoral == null || (defaultViewModelProviderFactory = anyexplicitswithoutignoral.getDefaultViewModelProviderFactory()) == null) ? this.$IconCompatParcelizer.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Fragment fragment, RenewEligible renewEligible) {
            super(0);
            this.$IconCompatParcelizer = fragment;
            this.$write = renewEligible;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(FastSafeParcelableJsonResponse fastSafeParcelableJsonResponse, readUnsignedInt readunsignedint) {
        toMagicModuleMetaRepoModel.write(readunsignedint, "");
        fastSafeParcelableJsonResponse.write().RemoteActionCompatParcelizer(new registerAcquireEvent.write(readunsignedint));
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void IconCompatParcelizer(readUnsignedInt readunsignedint) {
        ActivityC0235zzab.Companion companion = ActivityC0235zzab.INSTANCE;
        Context contextRequireContext = requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        startActivity(ActivityC0235zzab.Companion.AudioAttributesCompatParcelizer(contextRequireContext, new WakeLockEvent(readunsignedint.AudioAttributesCompatParcelizer(), readunsignedint.IconCompatParcelizer(), false)));
    }

    private final void AudioAttributesImplApi26Parcelizer() {
        if (DeviceProperties.isTablet(requireContext())) {
            Context contextRequireContext = requireContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
            HlsDataSourceFactory hlsDataSourceFactory = this.AudioAttributesCompatParcelizer;
            if (hlsDataSourceFactory == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                hlsDataSourceFactory = null;
            }
            RecyclerView recyclerView = hlsDataSourceFactory.AudioAttributesCompatParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(recyclerView, "");
            PlayerControlViewExternalSyntheticLambda1.IconCompatParcelizer(contextRequireContext, recyclerView);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo/FastSafeParcelableJsonResponse$RemoteActionCompatParcelizer;", "", "<init>", "()V", "Lo/FastSafeParcelableJsonResponse;", "AudioAttributesCompatParcelizer", "()Lo/FastSafeParcelableJsonResponse;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RemoteActionCompatParcelizer {
        private RemoteActionCompatParcelizer() {
        }

        public static FastSafeParcelableJsonResponse AudioAttributesCompatParcelizer() {
            return new FastSafeParcelableJsonResponse();
        }

        public /* synthetic */ RemoteActionCompatParcelizer(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
