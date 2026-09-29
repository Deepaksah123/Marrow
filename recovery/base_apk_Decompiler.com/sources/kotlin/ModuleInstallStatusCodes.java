package kotlin;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.appbar.MaterialToolbar;
import com.marrow2.ui.pearl.viewmodel.PearlDetailViewModel;
import java.util.List;
import kotlin.ConnectionTracker;
import kotlin.Metadata;
import kotlin.VisibilityChecker;
import kotlin.withFieldVisibility;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0003R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0011\u001a\u00020\u00178CX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0016\u0010\u0019R\u0016\u0010\u0012\u001a\u00020\u001a8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u0011\u0010\u001b"}, d2 = {"Lo/ModuleInstallStatusCodes;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Landroid/view/LayoutInflater;", "p0", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "write", "AudioAttributesCompatParcelizer", "read", "Lo/setTrackSelection;", "IconCompatParcelizer", "Lo/setTrackSelection;", "RemoteActionCompatParcelizer", "Lcom/marrow2/ui/pearl/viewmodel/PearlDetailViewModel;", "Lo/RenewEligible;", "()Lcom/marrow2/ui/pearl/viewmodel/PearlDetailViewModel;", "Lo/zzae;", "Lo/zzae;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ModuleInstallStatusCodes extends isLoggable {

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private C0238zzae read;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private setTrackSelection RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final RenewEligible AudioAttributesCompatParcelizer;

    public ModuleInstallStatusCodes() {
        ModuleInstallStatusCodes moduleInstallStatusCodes = this;
        RenewEligible renewEligibleWrite = getRenewExpiresOn.write(RenewEligibleCompanion.read, new AnonymousClass1(new AnonymousClass2(moduleInstallStatusCodes)));
        this.AudioAttributesCompatParcelizer = _resolveFieldVsGetter.RemoteActionCompatParcelizer(toMagicModuleMetaDataUcModel.write(PearlDetailViewModel.class), new AnonymousClass4(renewEligibleWrite), new AnonymousClass3(renewEligibleWrite), new AnonymousClass5(moduleInstallStatusCodes, renewEligibleWrite));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PearlDetailViewModel RemoteActionCompatParcelizer() {
        return (PearlDetailViewModel) this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        maybeGetTypeVariable maybegettypevariableRequireActivity = requireActivity();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(maybegettypevariableRequireActivity, "");
        CmcdConfigurationRequestConfig.write(maybegettypevariableRequireActivity, null, 0, 0, false, 15);
        setTrackSelection settrackselectionAudioAttributesCompatParcelizer = setTrackSelection.AudioAttributesCompatParcelizer(p0, p1);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(settrackselectionAudioAttributesCompatParcelizer, "");
        this.RemoteActionCompatParcelizer = settrackselectionAudioAttributesCompatParcelizer;
        if (settrackselectionAudioAttributesCompatParcelizer == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            settrackselectionAudioAttributesCompatParcelizer = null;
        }
        LinearLayout linearLayoutIconCompatParcelizer = settrackselectionAudioAttributesCompatParcelizer.IconCompatParcelizer();
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
        setTrackSelection settrackselection = this.RemoteActionCompatParcelizer;
        setTrackSelection settrackselection2 = null;
        if (settrackselection == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            settrackselection = null;
        }
        MaterialToolbar materialToolbar = settrackselection.read;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(materialToolbar, "");
        getHttpMethodString.read((View) materialToolbar, true, false, true, true, 0, 50);
        setTrackSelection settrackselection3 = this.RemoteActionCompatParcelizer;
        if (settrackselection3 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            settrackselection2 = settrackselection3;
        }
        ViewPager2 viewPager2 = settrackselection2.AudioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewPager2, "");
        getHttpMethodString.read((View) viewPager2, false, true, true, true, 0, 49);
    }

    private final void AudioAttributesCompatParcelizer() {
        setTrackSelection settrackselection = this.RemoteActionCompatParcelizer;
        setTrackSelection settrackselection2 = null;
        if (settrackselection == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            settrackselection = null;
        }
        settrackselection.read.setNavigationOnClickListener(new View.OnClickListener() { // from class: o.ModuleInstallStatusUpdate
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ModuleInstallStatusCodes.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer);
            }
        });
        ConnectionTracker.IconCompatParcelizer iconCompatParcelizer = ConnectionTracker.RemoteActionCompatParcelizer;
        Bundle bundleRequireArguments = requireArguments();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(bundleRequireArguments, "");
        this.read = new C0238zzae(this, ConnectionTracker.IconCompatParcelizer.read(bundleRequireArguments), null, 4, null);
        setTrackSelection settrackselection3 = this.RemoteActionCompatParcelizer;
        if (settrackselection3 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            settrackselection3 = null;
        }
        settrackselection3.AudioAttributesCompatParcelizer.setSaveEnabled(false);
        setTrackSelection settrackselection4 = this.RemoteActionCompatParcelizer;
        if (settrackselection4 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            settrackselection4 = null;
        }
        ViewPager2 viewPager2 = settrackselection4.AudioAttributesCompatParcelizer;
        C0238zzae c0238zzae = this.read;
        if (c0238zzae == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            c0238zzae = null;
        }
        viewPager2.setAdapter(c0238zzae);
        setTrackSelection settrackselection5 = this.RemoteActionCompatParcelizer;
        if (settrackselection5 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            settrackselection2 = settrackselection5;
        }
        settrackselection2.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(new IconCompatParcelizer());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RemoteActionCompatParcelizer(ModuleInstallStatusCodes moduleInstallStatusCodes) {
        moduleInstallStatusCodes.requireActivity().onBackPressed();
    }

    public static final class IconCompatParcelizer extends ViewPager2.write {
        IconCompatParcelizer() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.write
        public final void RemoteActionCompatParcelizer(int i) {
            ModuleInstallStatusCodes.this.requireActivity().setResult(-1);
            ModuleInstallStatusCodes.this.RemoteActionCompatParcelizer().read(i);
        }
    }

    static final class AudioAttributesCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                isDark<String> isdark = ModuleInstallStatusCodes.this.RemoteActionCompatParcelizer().read();
                final ModuleInstallStatusCodes moduleInstallStatusCodes = ModuleInstallStatusCodes.this;
                this.AudioAttributesCompatParcelizer = 1;
                if (isdark.write(new getValidationToken() { // from class: o.ModuleInstallStatusCodes.AudioAttributesCompatParcelizer.4
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return RemoteActionCompatParcelizer((String) obj2);
                    }

                    private Object RemoteActionCompatParcelizer(String str) {
                        setTrackSelection settrackselection = moduleInstallStatusCodes.RemoteActionCompatParcelizer;
                        if (settrackselection == null) {
                            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                            settrackselection = null;
                        }
                        settrackselection.RemoteActionCompatParcelizer.setText(str);
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
            return ModuleInstallStatusCodes.this.new AudioAttributesCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void read() {
        ModuleInstallStatusCodes moduleInstallStatusCodes = this;
        setBitrateKbps.RemoteActionCompatParcelizer(moduleInstallStatusCodes, new AudioAttributesCompatParcelizer(null));
        setBitrateKbps.RemoteActionCompatParcelizer(moduleInstallStatusCodes, new read(null));
        setBitrateKbps.read(moduleInstallStatusCodes, new RemoteActionCompatParcelizer(null));
    }

    static final class read extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                isDark<DataSourceBitmapLoaderExternalSyntheticLambda0<List<setWindow>>> isdarkIconCompatParcelizer = ModuleInstallStatusCodes.this.RemoteActionCompatParcelizer().IconCompatParcelizer();
                final ModuleInstallStatusCodes moduleInstallStatusCodes = ModuleInstallStatusCodes.this;
                this.write = 1;
                if (isdarkIconCompatParcelizer.write(new getValidationToken() { // from class: o.ModuleInstallStatusCodes.read.4
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return write((DataSourceBitmapLoaderExternalSyntheticLambda0) obj2);
                    }

                    private Object write(DataSourceBitmapLoaderExternalSyntheticLambda0<List<setWindow>> dataSourceBitmapLoaderExternalSyntheticLambda0) {
                        if (dataSourceBitmapLoaderExternalSyntheticLambda0 instanceof decodeBitmap) {
                            C0238zzae c0238zzae = moduleInstallStatusCodes.read;
                            if (c0238zzae == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                c0238zzae = null;
                            }
                            c0238zzae.AudioAttributesCompatParcelizer((List<setWindow>) ((decodeBitmap) dataSourceBitmapLoaderExternalSyntheticLambda0).RemoteActionCompatParcelizer());
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
            return ModuleInstallStatusCodes.this.new read(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((read) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<Integer> setupdatedstatusAudioAttributesCompatParcelizer = ModuleInstallStatusCodes.this.RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer();
                final ModuleInstallStatusCodes moduleInstallStatusCodes = ModuleInstallStatusCodes.this;
                this.read = 1;
                if (setupdatedstatusAudioAttributesCompatParcelizer.write(new getValidationToken() { // from class: o.ModuleInstallStatusCodes.RemoteActionCompatParcelizer.4
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return write(((Number) obj2).intValue());
                    }

                    private Object write(int i2) {
                        setTrackSelection settrackselection = moduleInstallStatusCodes.RemoteActionCompatParcelizer;
                        if (settrackselection == null) {
                            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                            settrackselection = null;
                        }
                        ViewPager2 viewPager2 = settrackselection.AudioAttributesCompatParcelizer;
                        if (viewPager2.read() != i2) {
                            viewPager2.setCurrentItem(i2, false);
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
            return ModuleInstallStatusCodes.this.new RemoteActionCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: o.ModuleInstallStatusCodes$write, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/ModuleInstallStatusCodes$write;", "", "<init>", "()V", "Lo/ConnectionTracker;", "p0", "Landroidx/fragment/app/Fragment;", "IconCompatParcelizer", "(Lo/ConnectionTracker;)Landroidx/fragment/app/Fragment;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static Fragment IconCompatParcelizer(ConnectionTracker p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            ModuleInstallStatusCodes moduleInstallStatusCodes = new ModuleInstallStatusCodes();
            moduleInstallStatusCodes.setArguments(p0.write());
            return moduleInstallStatusCodes;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    /* JADX INFO: renamed from: o.ModuleInstallStatusCodes$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Landroidx/fragment/app/Fragment;", "RemoteActionCompatParcelizer", "()Landroidx/fragment/app/Fragment;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass2 extends MagicModuleUseCase implements getCreatedOnDateMs<Fragment> {
        private /* synthetic */ Fragment $AudioAttributesCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.$AudioAttributesCompatParcelizer;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Fragment fragment) {
            super(0);
            this.$AudioAttributesCompatParcelizer = fragment;
        }
    }

    /* JADX INFO: renamed from: o.ModuleInstallStatusCodes$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/TypeResolutionContext;", "AudioAttributesCompatParcelizer", "()Lo/TypeResolutionContext;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass1 extends MagicModuleUseCase implements getCreatedOnDateMs<TypeResolutionContext> {
        private /* synthetic */ getCreatedOnDateMs $IconCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final TypeResolutionContext invoke() {
            return (TypeResolutionContext) this.$IconCompatParcelizer.invoke();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(getCreatedOnDateMs getcreatedondatems) {
            super(0);
            this.$IconCompatParcelizer = getcreatedondatems;
        }
    }

    /* JADX INFO: renamed from: o.ModuleInstallStatusCodes$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/hasMixIns;", "RemoteActionCompatParcelizer", "()Lo/hasMixIns;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass4 extends MagicModuleUseCase implements getCreatedOnDateMs<hasMixIns> {
        private /* synthetic */ RenewEligible $IconCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final hasMixIns invoke() {
            return _resolveFieldVsGetter.write(this.$IconCompatParcelizer).getViewModelStore();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(RenewEligible renewEligible) {
            super(0);
            this.$IconCompatParcelizer = renewEligible;
        }
    }

    /* JADX INFO: renamed from: o.ModuleInstallStatusCodes$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/withFieldVisibility;", "RemoteActionCompatParcelizer", "()Lo/withFieldVisibility;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass3 extends MagicModuleUseCase implements getCreatedOnDateMs<withFieldVisibility> {
        private /* synthetic */ getCreatedOnDateMs $IconCompatParcelizer = null;
        private /* synthetic */ RenewEligible $write;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final withFieldVisibility invoke() {
            TypeResolutionContext typeResolutionContextWrite = _resolveFieldVsGetter.write(this.$write);
            anyExplicitsWithoutIgnoral anyexplicitswithoutignoral = typeResolutionContextWrite instanceof anyExplicitsWithoutIgnoral ? (anyExplicitsWithoutIgnoral) typeResolutionContextWrite : null;
            return anyexplicitswithoutignoral != null ? anyexplicitswithoutignoral.getDefaultViewModelCreationExtras() : withFieldVisibility.write.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(RenewEligible renewEligible) {
            super(0);
            this.$write = renewEligible;
        }
    }

    /* JADX INFO: renamed from: o.ModuleInstallStatusCodes$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/VisibilityChecker$RemoteActionCompatParcelizer;", "write", "()Lo/VisibilityChecker$RemoteActionCompatParcelizer;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass5 extends MagicModuleUseCase implements getCreatedOnDateMs<VisibilityChecker.RemoteActionCompatParcelizer> {
        private /* synthetic */ Fragment $AudioAttributesCompatParcelizer;
        private /* synthetic */ RenewEligible $read;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final VisibilityChecker.RemoteActionCompatParcelizer invoke() {
            VisibilityChecker.RemoteActionCompatParcelizer defaultViewModelProviderFactory;
            TypeResolutionContext typeResolutionContextWrite = _resolveFieldVsGetter.write(this.$read);
            anyExplicitsWithoutIgnoral anyexplicitswithoutignoral = typeResolutionContextWrite instanceof anyExplicitsWithoutIgnoral ? (anyExplicitsWithoutIgnoral) typeResolutionContextWrite : null;
            return (anyexplicitswithoutignoral == null || (defaultViewModelProviderFactory = anyexplicitswithoutignoral.getDefaultViewModelProviderFactory()) == null) ? this.$AudioAttributesCompatParcelizer.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(Fragment fragment, RenewEligible renewEligible) {
            super(0);
            this.$AudioAttributesCompatParcelizer = fragment;
            this.$read = renewEligible;
        }
    }
}
