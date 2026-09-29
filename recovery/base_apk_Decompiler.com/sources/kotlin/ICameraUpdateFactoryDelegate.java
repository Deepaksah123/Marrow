package kotlin;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import com.marrow.R;
import com.marrow.kt.ui.activities.sync.SyncingActivity;
import com.marrow2.ui.signup.college.viewmodel.CollegeSelectionParentViewModel;
import kotlin.ILocationSourceDelegate;
import kotlin.Metadata;
import kotlin.StreetViewLifecycleDelegate;
import kotlin.VisibilityChecker;
import kotlin.radius;
import kotlin.setPositionWithRadiusAndSource;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0003J\u000f\u0010\u0013\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0003J\u000f\u0010\u0014\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0014\u0010\u0003J\u000f\u0010\u0015\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0015\u0010\u0003R\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001b\u001a\u00020\u00198CX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u0010\u001a\u00020\u001d8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u001eR\u0016\u0010\u0011\u001a\u00020\u001d8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001e"}, d2 = {"Lo/ICameraUpdateFactoryDelegate;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Landroid/view/LayoutInflater;", "p0", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "write", "read", "AudioAttributesImplBaseParcelizer", "MediaBrowserCompatCustomActionResultReceiver", "MediaBrowserCompatItemReceiver", "AudioAttributesCompatParcelizer", "Lo/DefaultHlsExtractorFactory;", "IconCompatParcelizer", "Lo/DefaultHlsExtractorFactory;", "Lcom/marrow2/ui/signup/college/viewmodel/CollegeSelectionParentViewModel;", "Lo/RenewEligible;", "RemoteActionCompatParcelizer", "()Lcom/marrow2/ui/signup/college/viewmodel/CollegeSelectionParentViewModel;", "", "Z"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ICameraUpdateFactoryDelegate extends animateCameraWithDurationAndCallback {

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final RenewEligible RemoteActionCompatParcelizer;
    private DefaultHlsExtractorFactory IconCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private boolean read;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private boolean write;

    public ICameraUpdateFactoryDelegate() {
        ICameraUpdateFactoryDelegate iCameraUpdateFactoryDelegate = this;
        this.RemoteActionCompatParcelizer = _resolveFieldVsGetter.RemoteActionCompatParcelizer(toMagicModuleMetaDataUcModel.write(CollegeSelectionParentViewModel.class), new AnonymousClass3(iCameraUpdateFactoryDelegate), new AnonymousClass4(iCameraUpdateFactoryDelegate), new AnonymousClass5(iCameraUpdateFactoryDelegate));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CollegeSelectionParentViewModel RemoteActionCompatParcelizer() {
        return (CollegeSelectionParentViewModel) this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        DefaultHlsExtractorFactory defaultHlsExtractorFactoryRemoteActionCompatParcelizer = DefaultHlsExtractorFactory.RemoteActionCompatParcelizer(p0, p1);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(defaultHlsExtractorFactoryRemoteActionCompatParcelizer, "");
        this.IconCompatParcelizer = defaultHlsExtractorFactoryRemoteActionCompatParcelizer;
        if (defaultHlsExtractorFactoryRemoteActionCompatParcelizer == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            defaultHlsExtractorFactoryRemoteActionCompatParcelizer = null;
        }
        LinearLayout linearLayoutIconCompatParcelizer = defaultHlsExtractorFactoryRemoteActionCompatParcelizer.IconCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayoutIconCompatParcelizer, "");
        return linearLayoutIconCompatParcelizer;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View p0, Bundle p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        super.onViewCreated(p0, p1);
        write();
        AudioAttributesCompatParcelizer();
        read();
    }

    private final void write() {
        DefaultHlsExtractorFactory defaultHlsExtractorFactory = this.IconCompatParcelizer;
        DefaultHlsExtractorFactory defaultHlsExtractorFactory2 = null;
        if (defaultHlsExtractorFactory == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            defaultHlsExtractorFactory = null;
        }
        Toolbar toolbar = defaultHlsExtractorFactory.IconCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(toolbar, "");
        getHttpMethodString.read((View) toolbar, true, false, true, true, 0, 50);
        DefaultHlsExtractorFactory defaultHlsExtractorFactory3 = this.IconCompatParcelizer;
        if (defaultHlsExtractorFactory3 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            defaultHlsExtractorFactory2 = defaultHlsExtractorFactory3;
        }
        FrameLayout frameLayout = defaultHlsExtractorFactory2.write;
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
                setUpdatedStatus<defaultMarker> setupdatedstatusAudioAttributesImplBaseParcelizer = ICameraUpdateFactoryDelegate.this.RemoteActionCompatParcelizer().AudioAttributesImplBaseParcelizer();
                final ICameraUpdateFactoryDelegate iCameraUpdateFactoryDelegate = ICameraUpdateFactoryDelegate.this;
                this.write = 1;
                if (setupdatedstatusAudioAttributesImplBaseParcelizer.write(new getValidationToken() { // from class: o.ICameraUpdateFactoryDelegate.AudioAttributesCompatParcelizer.2

                    /* JADX INFO: renamed from: o.ICameraUpdateFactoryDelegate$AudioAttributesCompatParcelizer$2$read */
                    public static final /* synthetic */ class read {
                        public static final /* synthetic */ int[] RemoteActionCompatParcelizer;

                        static {
                            int[] iArr = new int[defaultMarker.values().length];
                            try {
                                iArr[defaultMarker.AudioAttributesImplApi26Parcelizer.ordinal()] = 1;
                            } catch (NoSuchFieldError unused) {
                            }
                            try {
                                iArr[defaultMarker.read.ordinal()] = 2;
                            } catch (NoSuchFieldError unused2) {
                            }
                            try {
                                iArr[defaultMarker.AudioAttributesImplBaseParcelizer.ordinal()] = 3;
                            } catch (NoSuchFieldError unused3) {
                            }
                            try {
                                iArr[defaultMarker.AudioAttributesCompatParcelizer.ordinal()] = 4;
                            } catch (NoSuchFieldError unused4) {
                            }
                            try {
                                iArr[defaultMarker.RemoteActionCompatParcelizer.ordinal()] = 5;
                            } catch (NoSuchFieldError unused5) {
                            }
                            try {
                                iArr[defaultMarker.IconCompatParcelizer.ordinal()] = 6;
                            } catch (NoSuchFieldError unused6) {
                            }
                            try {
                                iArr[defaultMarker.write.ordinal()] = 7;
                            } catch (NoSuchFieldError unused7) {
                            }
                            RemoteActionCompatParcelizer = iArr;
                        }
                    }

                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return read((defaultMarker) obj2);
                    }

                    private Object read(defaultMarker defaultmarker) {
                        StreetViewLifecycleDelegate streetViewLifecycleDelegateWrite;
                        if (defaultmarker != null) {
                            ICameraUpdateFactoryDelegate iCameraUpdateFactoryDelegate2 = iCameraUpdateFactoryDelegate;
                            iCameraUpdateFactoryDelegate2.AudioAttributesImplBaseParcelizer();
                            switch (read.RemoteActionCompatParcelizer[defaultmarker.ordinal()]) {
                                case 1:
                                    if (iCameraUpdateFactoryDelegate2.read) {
                                        iCameraUpdateFactoryDelegate2.requireActivity().setResult(10);
                                    }
                                    iCameraUpdateFactoryDelegate2.requireActivity().finish();
                                    return getShowPopup.INSTANCE;
                                case 2:
                                    StreetViewLifecycleDelegate.Companion companion = StreetViewLifecycleDelegate.INSTANCE;
                                    streetViewLifecycleDelegateWrite = StreetViewLifecycleDelegate.Companion.write();
                                    break;
                                case 3:
                                    StreetViewLifecycleDelegate.Companion companion2 = StreetViewLifecycleDelegate.INSTANCE;
                                    streetViewLifecycleDelegateWrite = StreetViewLifecycleDelegate.Companion.write();
                                    break;
                                case 4:
                                    setPositionWithRadiusAndSource.Companion companion3 = setPositionWithRadiusAndSource.INSTANCE;
                                    streetViewLifecycleDelegateWrite = setPositionWithRadiusAndSource.Companion.write();
                                    break;
                                case 5:
                                    ILocationSourceDelegate.Companion companion4 = ILocationSourceDelegate.INSTANCE;
                                    streetViewLifecycleDelegateWrite = ILocationSourceDelegate.Companion.IconCompatParcelizer();
                                    break;
                                case 6:
                                    iCameraUpdateFactoryDelegate2.MediaBrowserCompatCustomActionResultReceiver();
                                    radius.Companion companion5 = radius.INSTANCE;
                                    streetViewLifecycleDelegateWrite = radius.Companion.write();
                                    break;
                                case 7:
                                    if (!iCameraUpdateFactoryDelegate2.write) {
                                        if (iCameraUpdateFactoryDelegate2.read) {
                                            iCameraUpdateFactoryDelegate2.requireActivity().setResult(11);
                                            iCameraUpdateFactoryDelegate2.requireActivity().finish();
                                        } else {
                                            SyncingActivity.Companion companion6 = SyncingActivity.INSTANCE;
                                            Context contextRequireContext = iCameraUpdateFactoryDelegate2.requireContext();
                                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
                                            Intent intentRemoteActionCompatParcelizer = SyncingActivity.Companion.RemoteActionCompatParcelizer(contextRequireContext);
                                            intentRemoteActionCompatParcelizer.setFlags(268468224);
                                            iCameraUpdateFactoryDelegate2.requireActivity().startActivity(intentRemoteActionCompatParcelizer);
                                        }
                                    } else {
                                        String string = iCameraUpdateFactoryDelegate2.getString(R.string.college_name_update_success);
                                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
                                        CmcdConfigurationRequestConfig.AudioAttributesCompatParcelizer(iCameraUpdateFactoryDelegate2, string, 0);
                                        iCameraUpdateFactoryDelegate2.requireActivity().finish();
                                    }
                                    return getShowPopup.INSTANCE;
                                default:
                                    throw new RenewEligibleCreator();
                            }
                            CmcdConfigurationRequestConfig.write(iCameraUpdateFactoryDelegate2, R.id.container, streetViewLifecycleDelegateWrite);
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
            return ICameraUpdateFactoryDelegate.this.new AudioAttributesCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void read() {
        setBitrateKbps.read(this, new AudioAttributesCompatParcelizer(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AudioAttributesImplBaseParcelizer() {
        DefaultHlsExtractorFactory defaultHlsExtractorFactory = this.IconCompatParcelizer;
        DefaultHlsExtractorFactory defaultHlsExtractorFactory2 = null;
        if (defaultHlsExtractorFactory == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            defaultHlsExtractorFactory = null;
        }
        defaultHlsExtractorFactory.AudioAttributesCompatParcelizer.setAlpha(1.0f);
        DefaultHlsExtractorFactory defaultHlsExtractorFactory3 = this.IconCompatParcelizer;
        if (defaultHlsExtractorFactory3 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            defaultHlsExtractorFactory2 = defaultHlsExtractorFactory3;
        }
        defaultHlsExtractorFactory2.RemoteActionCompatParcelizer.setAlpha(0.5f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void MediaBrowserCompatCustomActionResultReceiver() {
        DefaultHlsExtractorFactory defaultHlsExtractorFactory = this.IconCompatParcelizer;
        DefaultHlsExtractorFactory defaultHlsExtractorFactory2 = null;
        if (defaultHlsExtractorFactory == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            defaultHlsExtractorFactory = null;
        }
        defaultHlsExtractorFactory.AudioAttributesCompatParcelizer.setAlpha(1.0f);
        DefaultHlsExtractorFactory defaultHlsExtractorFactory3 = this.IconCompatParcelizer;
        if (defaultHlsExtractorFactory3 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            defaultHlsExtractorFactory2 = defaultHlsExtractorFactory3;
        }
        defaultHlsExtractorFactory2.RemoteActionCompatParcelizer.setAlpha(1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void MediaBrowserCompatItemReceiver() {
        RemoteActionCompatParcelizer().MediaBrowserCompatSearchResultReceiver();
    }

    private final void AudioAttributesCompatParcelizer() {
        DefaultHlsExtractorFactory defaultHlsExtractorFactory = this.IconCompatParcelizer;
        if (defaultHlsExtractorFactory == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            defaultHlsExtractorFactory = null;
        }
        defaultHlsExtractorFactory.IconCompatParcelizer.setNavigationOnClickListener(new View.OnClickListener() { // from class: o.newLatLngBoundsWithSize
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ICameraUpdateFactoryDelegate.AudioAttributesImplApi26Parcelizer(this.write);
            }
        });
        onSetRating iconCompatParcelizer = requireActivity().getIconCompatParcelizer();
        hasGetter viewLifecycleOwner = getViewLifecycleOwner();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewLifecycleOwner, "");
        iconCompatParcelizer.AudioAttributesCompatParcelizer(viewLifecycleOwner, new read());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AudioAttributesImplApi26Parcelizer(ICameraUpdateFactoryDelegate iCameraUpdateFactoryDelegate) {
        iCameraUpdateFactoryDelegate.MediaBrowserCompatItemReceiver();
    }

    public static final class read extends onRemoveQueueItemAt {
        read() {
            super(true);
        }

        @Override // kotlin.onRemoveQueueItemAt
        public final void handleOnBackPressed() {
            ICameraUpdateFactoryDelegate.this.MediaBrowserCompatItemReceiver();
        }
    }

    /* JADX INFO: renamed from: o.ICameraUpdateFactoryDelegate$write, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lo/ICameraUpdateFactoryDelegate$write;", "", "<init>", "()V", "", "p0", "p1", "Lo/ICameraUpdateFactoryDelegate;", "read", "(ZZ)Lo/ICameraUpdateFactoryDelegate;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getMagicModuleMeta
        public static ICameraUpdateFactoryDelegate read(boolean p0, boolean p1) {
            ICameraUpdateFactoryDelegate iCameraUpdateFactoryDelegate = new ICameraUpdateFactoryDelegate();
            iCameraUpdateFactoryDelegate.write = p0;
            iCameraUpdateFactoryDelegate.read = p1;
            return iCameraUpdateFactoryDelegate;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    /* JADX INFO: renamed from: o.ICameraUpdateFactoryDelegate$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/hasMixIns;", "write", "()Lo/hasMixIns;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass3 extends MagicModuleUseCase implements getCreatedOnDateMs<hasMixIns> {
        private /* synthetic */ Fragment $write;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final hasMixIns invoke() {
            return this.$write.requireActivity().getViewModelStore();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(Fragment fragment) {
            super(0);
            this.$write = fragment;
        }
    }

    /* JADX INFO: renamed from: o.ICameraUpdateFactoryDelegate$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/withFieldVisibility;", "write", "()Lo/withFieldVisibility;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass4 extends MagicModuleUseCase implements getCreatedOnDateMs<withFieldVisibility> {
        private /* synthetic */ getCreatedOnDateMs $read = null;
        private /* synthetic */ Fragment $write;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final withFieldVisibility invoke() {
            return this.$write.requireActivity().getDefaultViewModelCreationExtras();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(Fragment fragment) {
            super(0);
            this.$write = fragment;
        }
    }

    /* JADX INFO: renamed from: o.ICameraUpdateFactoryDelegate$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/VisibilityChecker$RemoteActionCompatParcelizer;", "read", "()Lo/VisibilityChecker$RemoteActionCompatParcelizer;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass5 extends MagicModuleUseCase implements getCreatedOnDateMs<VisibilityChecker.RemoteActionCompatParcelizer> {
        private /* synthetic */ Fragment $AudioAttributesCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final VisibilityChecker.RemoteActionCompatParcelizer invoke() {
            return this.$AudioAttributesCompatParcelizer.requireActivity().getDefaultViewModelProviderFactory();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(Fragment fragment) {
            super(0);
            this.$AudioAttributesCompatParcelizer = fragment;
        }
    }
}
