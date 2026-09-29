package kotlin;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.material.appbar.MaterialToolbar;
import com.marrow2.ui.share.viewmodel.ShareAppViewModel;
import kotlin.Metadata;
import kotlin.VisibilityChecker;
import kotlin.setMapToolbarEnabled;
import kotlin.withFieldVisibility;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 ,2\u00020\u0001:\u0001,B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u001a\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\b\u0010\u001a\u001a\u00020\u0018H\u0002J\b\u0010\u001b\u001a\u00020\u0018H\u0002J\u0010\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u0018\u0010\u001f\u001a\u00020\u00182\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020!H\u0002J\b\u0010#\u001a\u00020\u0018H\u0002J\u0018\u0010$\u001a\u00020%2\u0006\u0010 \u001a\u00020!2\u0006\u0010&\u001a\u00020!H\u0002J\u0010\u0010'\u001a\u00020%2\u0006\u0010\"\u001a\u00020!H\u0002J\u001c\u0010(\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020!2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010!H\u0002J\b\u0010*\u001a\u00020\u0018H\u0016J\u0010\u0010+\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020!H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f¨\u0006-"}, d2 = {"Lcom/marrow2/ui/share/fragment/ShareAppFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "_binding", "Lcom/marrow/databinding/FragmentShareAppBinding;", "binding", "getBinding", "()Lcom/marrow/databinding/FragmentShareAppBinding;", "viewModel", "Lcom/marrow2/ui/share/viewmodel/ShareAppViewModel;", "getViewModel", "()Lcom/marrow2/ui/share/viewmodel/ShareAppViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", "view", "applyEdgeToEdgeInsets", "setObservables", "setUi", "copy", "Lcom/marrow2/ui/share/model/ShareCopyVMModel;", "shareWithEmail", "subject", "", "message", "initClickListener", "getEmailIntent", "Landroid/content/Intent;", "text", "getShareIntent", "shareWith", "packageName", "onDestroyView", "startShareMessageActivity", "Companion", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class isTiltGesturesEnabled extends isMyLocationButtonEnabled {
    public static final IconCompatParcelizer write = new IconCompatParcelizer(null);
    private final RenewEligible IconCompatParcelizer;
    private HlsMediaChunkExtractor read;

    public isTiltGesturesEnabled() {
        isTiltGesturesEnabled istiltgesturesenabled = this;
        RenewEligible renewEligibleWrite = getRenewExpiresOn.write(RenewEligibleCompanion.read, new AnonymousClass1(new AnonymousClass2(istiltgesturesenabled)));
        this.IconCompatParcelizer = _resolveFieldVsGetter.RemoteActionCompatParcelizer(toMagicModuleMetaDataUcModel.write(ShareAppViewModel.class), new AnonymousClass3(renewEligibleWrite), new AnonymousClass5(renewEligibleWrite), new AnonymousClass4(istiltgesturesenabled, renewEligibleWrite));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HlsMediaChunkExtractor RemoteActionCompatParcelizer() {
        HlsMediaChunkExtractor hlsMediaChunkExtractor = this.read;
        toMagicModuleMetaRepoModel.write(hlsMediaChunkExtractor);
        return hlsMediaChunkExtractor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ShareAppViewModel AudioAttributesCompatParcelizer() {
        return (ShareAppViewModel) this.IconCompatParcelizer.RemoteActionCompatParcelizer();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        toMagicModuleMetaRepoModel.write(inflater, "");
        this.read = HlsMediaChunkExtractor.AudioAttributesCompatParcelizer(inflater, container);
        ConstraintLayout constraintLayoutIconCompatParcelizer = RemoteActionCompatParcelizer().IconCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayoutIconCompatParcelizer, "");
        return constraintLayoutIconCompatParcelizer;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle savedInstanceState) {
        toMagicModuleMetaRepoModel.write(view, "");
        super.onViewCreated(view, savedInstanceState);
        write();
        read();
        AudioAttributesImplApi26Parcelizer();
        RemoteActionCompatParcelizer().AudioAttributesImplBaseParcelizer.setNavigationOnClickListener(new View.OnClickListener() { // from class: o.setCompassEnabled
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                isTiltGesturesEnabled.MediaBrowserCompatCustomActionResultReceiver(this.RemoteActionCompatParcelizer);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MediaBrowserCompatCustomActionResultReceiver(isTiltGesturesEnabled istiltgesturesenabled) {
        istiltgesturesenabled.requireActivity().getIconCompatParcelizer().RemoteActionCompatParcelizer();
    }

    private final void write() {
        MaterialToolbar materialToolbar = RemoteActionCompatParcelizer().AudioAttributesImplBaseParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(materialToolbar, "");
        getHttpMethodString.read((View) materialToolbar, true, false, true, true, 0, 50);
        ScrollView scrollView = RemoteActionCompatParcelizer().write;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(scrollView, "");
        getHttpMethodString.read((View) scrollView, false, true, true, true, 0, 49);
    }

    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int IconCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                isDark<setIndoorLevelPickerEnabled> isdarkAudioAttributesCompatParcelizer = isTiltGesturesEnabled.this.AudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer();
                final isTiltGesturesEnabled istiltgesturesenabled = isTiltGesturesEnabled.this;
                this.IconCompatParcelizer = 1;
                if (isdarkAudioAttributesCompatParcelizer.write(new getValidationToken() { // from class: o.isTiltGesturesEnabled.RemoteActionCompatParcelizer.4
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return RemoteActionCompatParcelizer((setIndoorLevelPickerEnabled) obj2);
                    }

                    private Object RemoteActionCompatParcelizer(setIndoorLevelPickerEnabled setindoorlevelpickerenabled) {
                        if (setindoorlevelpickerenabled != null) {
                            istiltgesturesenabled.IconCompatParcelizer(setindoorlevelpickerenabled);
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
            return isTiltGesturesEnabled.this.new RemoteActionCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void AudioAttributesImplApi26Parcelizer() {
        isTiltGesturesEnabled istiltgesturesenabled = this;
        setBitrateKbps.RemoteActionCompatParcelizer(istiltgesturesenabled, new RemoteActionCompatParcelizer(null));
        setBitrateKbps.RemoteActionCompatParcelizer(istiltgesturesenabled, new read(null));
        setBitrateKbps.RemoteActionCompatParcelizer(istiltgesturesenabled, new AudioAttributesCompatParcelizer(null));
    }

    static final class read extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                isDark<Boolean> isdark = isTiltGesturesEnabled.this.AudioAttributesCompatParcelizer().read();
                final isTiltGesturesEnabled istiltgesturesenabled = isTiltGesturesEnabled.this;
                this.read = 1;
                if (isdark.write(new getValidationToken() { // from class: o.isTiltGesturesEnabled.read.4
                    @Override // kotlin.getValidationToken
                    public final /* bridge */ /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return IconCompatParcelizer(((Boolean) obj2).booleanValue());
                    }

                    private Object IconCompatParcelizer(boolean z) {
                        ProgressBar progressBar = istiltgesturesenabled.RemoteActionCompatParcelizer().RemoteActionCompatParcelizer;
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(progressBar, "");
                        progressBar.setVisibility(z ? 0 : 8);
                        MaterialToolbar materialToolbar = istiltgesturesenabled.RemoteActionCompatParcelizer().AudioAttributesImplBaseParcelizer;
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(materialToolbar, "");
                        materialToolbar.setVisibility(z ? 8 : 0);
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
            return isTiltGesturesEnabled.this.new read(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((read) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    static final class AudioAttributesCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                NewNumberOtpResendRequest<setMapToolbarEnabled> newNumberOtpResendRequestIconCompatParcelizer = isTiltGesturesEnabled.this.AudioAttributesCompatParcelizer().IconCompatParcelizer();
                final isTiltGesturesEnabled istiltgesturesenabled = isTiltGesturesEnabled.this;
                this.RemoteActionCompatParcelizer = 1;
                if (newNumberOtpResendRequestIconCompatParcelizer.write(new getValidationToken() { // from class: o.isTiltGesturesEnabled.AudioAttributesCompatParcelizer.4
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return AudioAttributesCompatParcelizer((setMapToolbarEnabled) obj2);
                    }

                    private Object AudioAttributesCompatParcelizer(setMapToolbarEnabled setmaptoolbarenabled) {
                        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(setmaptoolbarenabled, setMapToolbarEnabled.AudioAttributesCompatParcelizer.INSTANCE)) {
                            istiltgesturesenabled.requireActivity().getIconCompatParcelizer().RemoteActionCompatParcelizer();
                        } else if (setmaptoolbarenabled instanceof setMapToolbarEnabled.RemoteActionCompatParcelizer) {
                            setMapToolbarEnabled.RemoteActionCompatParcelizer remoteActionCompatParcelizer = (setMapToolbarEnabled.RemoteActionCompatParcelizer) setmaptoolbarenabled;
                            istiltgesturesenabled.write(remoteActionCompatParcelizer.AudioAttributesCompatParcelizer(), remoteActionCompatParcelizer.write());
                        } else if (!(setmaptoolbarenabled instanceof setMapToolbarEnabled.IconCompatParcelizer)) {
                            if (setmaptoolbarenabled instanceof setMapToolbarEnabled.read) {
                                istiltgesturesenabled.RemoteActionCompatParcelizer(((setMapToolbarEnabled.read) setmaptoolbarenabled).IconCompatParcelizer(), "com.whatsapp");
                            } else {
                                throw new RenewEligibleCreator();
                            }
                        } else {
                            istiltgesturesenabled.RemoteActionCompatParcelizer(((setMapToolbarEnabled.IconCompatParcelizer) setmaptoolbarenabled).write(), (String) null);
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
            return getShowPopup.INSTANCE;
        }

        AudioAttributesCompatParcelizer(SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return isTiltGesturesEnabled.this.new AudioAttributesCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void IconCompatParcelizer(setIndoorLevelPickerEnabled setindoorlevelpickerenabled) {
        RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer.setVisibility(0);
        RemoteActionCompatParcelizer().MediaBrowserCompatItemReceiver.setText(setindoorlevelpickerenabled.AudioAttributesCompatParcelizer());
        RemoteActionCompatParcelizer().read.setText(setindoorlevelpickerenabled.write());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void write(String str, String str2) {
        try {
            startActivity(AudioAttributesCompatParcelizer(str, str2));
        } catch (ActivityNotFoundException unused) {
            read(str2);
        }
    }

    /* JADX INFO: renamed from: o.isTiltGesturesEnabled$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Landroidx/fragment/app/Fragment;", "AudioAttributesCompatParcelizer", "()Landroidx/fragment/app/Fragment;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass2 extends MagicModuleUseCase implements getCreatedOnDateMs<Fragment> {
        private /* synthetic */ Fragment $IconCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.$IconCompatParcelizer;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Fragment fragment) {
            super(0);
            this.$IconCompatParcelizer = fragment;
        }
    }

    /* JADX INFO: renamed from: o.isTiltGesturesEnabled$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/TypeResolutionContext;", "AudioAttributesCompatParcelizer", "()Lo/TypeResolutionContext;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass1 extends MagicModuleUseCase implements getCreatedOnDateMs<TypeResolutionContext> {
        private /* synthetic */ getCreatedOnDateMs $RemoteActionCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final TypeResolutionContext invoke() {
            return (TypeResolutionContext) this.$RemoteActionCompatParcelizer.invoke();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(getCreatedOnDateMs getcreatedondatems) {
            super(0);
            this.$RemoteActionCompatParcelizer = getcreatedondatems;
        }
    }

    /* JADX INFO: renamed from: o.isTiltGesturesEnabled$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/hasMixIns;", "IconCompatParcelizer", "()Lo/hasMixIns;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass3 extends MagicModuleUseCase implements getCreatedOnDateMs<hasMixIns> {
        private /* synthetic */ RenewEligible $write;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final hasMixIns invoke() {
            return _resolveFieldVsGetter.write(this.$write).getViewModelStore();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(RenewEligible renewEligible) {
            super(0);
            this.$write = renewEligible;
        }
    }

    private final void read() {
        RemoteActionCompatParcelizer().MediaBrowserCompatCustomActionResultReceiver.setOnClickListener(new View.OnClickListener() { // from class: o.isScrollGesturesEnabled
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                isTiltGesturesEnabled.AudioAttributesImplBaseParcelizer(this.IconCompatParcelizer);
            }
        });
        RemoteActionCompatParcelizer().IconCompatParcelizer.setOnClickListener(new View.OnClickListener() { // from class: o.isScrollGesturesEnabledDuringRotateOrZoom
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                isTiltGesturesEnabled.AudioAttributesImplApi21Parcelizer(this.read);
            }
        });
        RemoteActionCompatParcelizer().AudioAttributesImplApi21Parcelizer.setOnClickListener(new View.OnClickListener() { // from class: o.isRotateGesturesEnabled
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                isTiltGesturesEnabled.AudioAttributesImplApi26Parcelizer(this.RemoteActionCompatParcelizer);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AudioAttributesImplBaseParcelizer(isTiltGesturesEnabled istiltgesturesenabled) {
        istiltgesturesenabled.AudioAttributesCompatParcelizer().read(setAllGesturesEnabled.write);
    }

    /* JADX INFO: renamed from: o.isTiltGesturesEnabled$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/withFieldVisibility;", "AudioAttributesCompatParcelizer", "()Lo/withFieldVisibility;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass5 extends MagicModuleUseCase implements getCreatedOnDateMs<withFieldVisibility> {
        private /* synthetic */ getCreatedOnDateMs $AudioAttributesCompatParcelizer = null;
        private /* synthetic */ RenewEligible $read;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final withFieldVisibility invoke() {
            TypeResolutionContext typeResolutionContextWrite = _resolveFieldVsGetter.write(this.$read);
            anyExplicitsWithoutIgnoral anyexplicitswithoutignoral = typeResolutionContextWrite instanceof anyExplicitsWithoutIgnoral ? (anyExplicitsWithoutIgnoral) typeResolutionContextWrite : null;
            return anyexplicitswithoutignoral != null ? anyexplicitswithoutignoral.getDefaultViewModelCreationExtras() : withFieldVisibility.write.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(RenewEligible renewEligible) {
            super(0);
            this.$read = renewEligible;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AudioAttributesImplApi21Parcelizer(isTiltGesturesEnabled istiltgesturesenabled) {
        istiltgesturesenabled.AudioAttributesCompatParcelizer().read(setAllGesturesEnabled.AudioAttributesCompatParcelizer);
    }

    /* JADX INFO: renamed from: o.isTiltGesturesEnabled$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/VisibilityChecker$RemoteActionCompatParcelizer;", "AudioAttributesCompatParcelizer", "()Lo/VisibilityChecker$RemoteActionCompatParcelizer;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass4 extends MagicModuleUseCase implements getCreatedOnDateMs<VisibilityChecker.RemoteActionCompatParcelizer> {
        private /* synthetic */ Fragment $AudioAttributesCompatParcelizer;
        private /* synthetic */ RenewEligible $IconCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final VisibilityChecker.RemoteActionCompatParcelizer invoke() {
            VisibilityChecker.RemoteActionCompatParcelizer defaultViewModelProviderFactory;
            TypeResolutionContext typeResolutionContextWrite = _resolveFieldVsGetter.write(this.$IconCompatParcelizer);
            anyExplicitsWithoutIgnoral anyexplicitswithoutignoral = typeResolutionContextWrite instanceof anyExplicitsWithoutIgnoral ? (anyExplicitsWithoutIgnoral) typeResolutionContextWrite : null;
            return (anyexplicitswithoutignoral == null || (defaultViewModelProviderFactory = anyexplicitswithoutignoral.getDefaultViewModelProviderFactory()) == null) ? this.$AudioAttributesCompatParcelizer.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(Fragment fragment, RenewEligible renewEligible) {
            super(0);
            this.$AudioAttributesCompatParcelizer = fragment;
            this.$IconCompatParcelizer = renewEligible;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AudioAttributesImplApi26Parcelizer(isTiltGesturesEnabled istiltgesturesenabled) {
        istiltgesturesenabled.AudioAttributesCompatParcelizer().read(setAllGesturesEnabled.RemoteActionCompatParcelizer);
    }

    private static Intent AudioAttributesCompatParcelizer(String str, String str2) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.setPackage("com.google.android.gm");
        intent.putExtra("android.intent.extra.SUBJECT", str);
        intent.putExtra("android.intent.extra.TEXT", str2);
        return intent;
    }

    private static Intent write(String str) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.addFlags(268435456);
        intent.putExtra("android.intent.extra.TEXT", str);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void RemoteActionCompatParcelizer(String str, String str2) {
        Intent intentWrite = write(str);
        String str3 = str2;
        if (str3 != null && str3.length() != 0) {
            intentWrite.setPackage(str2);
        }
        try {
            startActivity(intentWrite);
        } catch (ActivityNotFoundException unused) {
            read(str);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.read = null;
        super.onDestroyView();
    }

    private final void read(String str) {
        startActivity(Intent.createChooser(write(str), "Share with "));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo/isTiltGesturesEnabled$IconCompatParcelizer;", "", "<init>", "()V", "Lo/isTiltGesturesEnabled;", "AudioAttributesCompatParcelizer", "()Lo/isTiltGesturesEnabled;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class IconCompatParcelizer {
        private IconCompatParcelizer() {
        }

        @getMagicModuleMeta
        public static isTiltGesturesEnabled AudioAttributesCompatParcelizer() {
            return new isTiltGesturesEnabled();
        }

        public /* synthetic */ IconCompatParcelizer(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
