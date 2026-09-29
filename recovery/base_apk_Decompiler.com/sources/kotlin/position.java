package kotlin;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;
import com.marrow.R;
import com.marrow2.ui.settings.reset.ResetContentViewModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.SupportMapFragmentzza;
import kotlin.SupportMapFragmentzzb;
import kotlin.VisibilityChecker;
import kotlin.getAutofillClient;
import kotlin.withFieldVisibility;
import kotlin.zbu;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0003J\u000f\u0010\u0013\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0003J\u000f\u0010\u0014\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0014\u0010\u0003J\u0017\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0018\u0010\u0003J\u000f\u0010\u0016\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0016\u0010\u0003J\u000f\u0010\u0019\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0019\u0010\u0003J\u000f\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u0016\u0010\u001eJ'\u0010\"\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u001f2\u0006\u0010\u0007\u001a\u00020 2\u0006\u0010\t\u001a\u00020!H\u0002¢\u0006\u0004\b\"\u0010#J\u001f\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020 2\u0006\u0010\u0007\u001a\u00020!H\u0002¢\u0006\u0004\b\u001b\u0010$J\u001f\u0010%\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020 2\u0006\u0010\u0007\u001a\u00020!H\u0002¢\u0006\u0004\b%\u0010$J)\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020 2\u0006\u0010\u0007\u001a\u00020 2\b\u0010\t\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0010\u0010&J!\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020 2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u001b\u0010'R\u001b\u0010\u0016\u001a\u00020(8CX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010)\u001a\u0004\b*\u0010+R\u0018\u0010\u0010\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010-R\u0014\u0010%\u001a\u00020,8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010."}, d2 = {"Lo/position;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Landroid/view/LayoutInflater;", "p0", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "AudioAttributesCompatParcelizer", "MediaBrowserCompatItemReceiver", "MediaBrowserCompatCustomActionResultReceiver", "AudioAttributesImplBaseParcelizer", "AudioAttributesImplApi26Parcelizer", "", "read", "(Ljava/lang/String;)V", "MediaBrowserCompatSearchResultReceiver", "MediaMetadataCompat", "Lo/StreetViewPanoramaViewzzb;", "write", "()Lo/StreetViewPanoramaViewzzb;", "Lo/SupportStreetViewPanoramaFragmentzza;", "(Lo/SupportStreetViewPanoramaFragmentzza;)V", "Landroid/widget/RadioButton;", "Landroid/widget/TextView;", "", "RemoteActionCompatParcelizer", "(Landroid/widget/RadioButton;Landroid/widget/TextView;J)V", "(Landroid/widget/TextView;J)V", "IconCompatParcelizer", "(Landroid/widget/TextView;Landroid/widget/TextView;Ljava/lang/String;)V", "(Landroid/widget/TextView;Ljava/lang/String;)V", "Lcom/marrow2/ui/settings/reset/ResetContentViewModel;", "Lo/RenewEligible;", "AudioAttributesImplApi21Parcelizer", "()Lcom/marrow2/ui/settings/reset/ResetContentViewModel;", "Lo/maybeLoadInitData;", "Lo/maybeLoadInitData;", "()Lo/maybeLoadInitData;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class position extends getPanningGesturesEnabled {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private maybeLoadInitData AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final RenewEligible read;

    public static final /* synthetic */ class RemoteActionCompatParcelizer {
        public static final /* synthetic */ int[] read;

        static {
            int[] iArr = new int[StreetViewPanoramaViewzzb.values().length];
            try {
                iArr[StreetViewPanoramaViewzzb.RemoteActionCompatParcelizer.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StreetViewPanoramaViewzzb.read.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StreetViewPanoramaViewzzb.write.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[StreetViewPanoramaViewzzb.IconCompatParcelizer.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            read = iArr;
        }
    }

    public position() {
        position positionVar = this;
        RenewEligible renewEligibleWrite = getRenewExpiresOn.write(RenewEligibleCompanion.read, new AnonymousClass5(new AnonymousClass3(positionVar)));
        this.read = _resolveFieldVsGetter.RemoteActionCompatParcelizer(toMagicModuleMetaDataUcModel.write(ResetContentViewModel.class), new AnonymousClass1(renewEligibleWrite), new AnonymousClass4(renewEligibleWrite), new AnonymousClass2(positionVar, renewEligibleWrite));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ResetContentViewModel AudioAttributesImplApi21Parcelizer() {
        return (ResetContentViewModel) this.read.RemoteActionCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final maybeLoadInitData RemoteActionCompatParcelizer() {
        maybeLoadInitData maybeloadinitdata = this.AudioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.write(maybeloadinitdata);
        return maybeloadinitdata;
    }

    /* JADX INFO: renamed from: o.position$AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo/position$AudioAttributesCompatParcelizer;", "", "<init>", "()V", "Lo/position;", "read", "()Lo/position;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static position read() {
            return new position();
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        this.AudioAttributesCompatParcelizer = maybeLoadInitData.AudioAttributesCompatParcelizer(p0, p1);
        return RemoteActionCompatParcelizer().IconCompatParcelizer();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View p0, Bundle p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        super.onViewCreated(p0, p1);
        AudioAttributesCompatParcelizer();
        MediaBrowserCompatItemReceiver();
        AudioAttributesImplBaseParcelizer();
    }

    private final void AudioAttributesCompatParcelizer() {
        MaterialToolbar materialToolbar = RemoteActionCompatParcelizer().MediaBrowserCompatMediaItem;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(materialToolbar, "");
        getHttpMethodString.read((View) materialToolbar, true, false, true, true, 0, 50);
        ScrollView scrollView = RemoteActionCompatParcelizer().MediaBrowserCompatItemReceiver;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(scrollView, "");
        getHttpMethodString.read((View) scrollView, false, false, true, true, 0, 51);
        LinearLayout linearLayout = RemoteActionCompatParcelizer().write;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout, "");
        getHttpMethodString.read((View) linearLayout, false, true, true, true, 0, 49);
    }

    private final void MediaBrowserCompatItemReceiver() {
        maybeLoadInitData maybeloadinitdataRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        maybeloadinitdataRemoteActionCompatParcelizer.MediaBrowserCompatMediaItem.setNavigationOnClickListener(new View.OnClickListener() { // from class: o.panoramaCamera
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                position.MediaBrowserCompatMediaItem(this.write);
            }
        });
        maybeloadinitdataRemoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: o.getUserNavigationEnabled
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i) {
                position.RatingCompat(this.write);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MediaBrowserCompatMediaItem(position positionVar) {
        positionVar.requireActivity().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RatingCompat(position positionVar) {
        positionVar.MediaBrowserCompatCustomActionResultReceiver();
    }

    private final void MediaBrowserCompatCustomActionResultReceiver() {
        MaterialButton materialButton = RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer;
        materialButton.setAlpha(1.0f);
        materialButton.setClickable(true);
        toMagicModuleMetaRepoModel.write(materialButton);
        bytesRead.IconCompatParcelizer(materialButton, (getCreatedOnDateMs<getShowPopup>) new getCreatedOnDateMs() { // from class: o.panningGesturesEnabled
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return position.MediaDescriptionCompat(this.IconCompatParcelizer);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaDescriptionCompat(position positionVar) {
        positionVar.AudioAttributesImplApi26Parcelizer();
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
                isDark<SupportMapFragmentzzb> isdarkAudioAttributesCompatParcelizer = position.this.AudioAttributesImplApi21Parcelizer().AudioAttributesCompatParcelizer();
                final position positionVar = position.this;
                this.write = 1;
                if (isdarkAudioAttributesCompatParcelizer.write(new getValidationToken() { // from class: o.position.write.2
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return write((SupportMapFragmentzzb) obj2);
                    }

                    private Object write(SupportMapFragmentzzb supportMapFragmentzzb) {
                        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(supportMapFragmentzzb, SupportMapFragmentzzb.read.INSTANCE)) {
                            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(supportMapFragmentzzb, SupportMapFragmentzzb.RemoteActionCompatParcelizer.INSTANCE)) {
                                positionVar.MediaBrowserCompatSearchResultReceiver();
                            } else if (supportMapFragmentzzb instanceof SupportMapFragmentzzb.IconCompatParcelizer) {
                                positionVar.read();
                                CmcdConfigurationRequestConfig.AudioAttributesCompatParcelizer(positionVar, ((SupportMapFragmentzzb.IconCompatParcelizer) supportMapFragmentzzb).write(), 0);
                                positionVar.requireActivity().onBackPressed();
                            } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(supportMapFragmentzzb, SupportMapFragmentzzb.write.INSTANCE)) {
                                positionVar.read();
                                positionVar.MediaMetadataCompat();
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

        write(SampleVideos<? super write> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return position.this.new write(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((write) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void AudioAttributesImplBaseParcelizer() {
        position positionVar = this;
        setBitrateKbps.read(positionVar, new write(null));
        setBitrateKbps.read(positionVar, new read(null));
        setBitrateKbps.read(positionVar, new IconCompatParcelizer(null));
    }

    /* JADX INFO: renamed from: o.position$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Landroidx/fragment/app/Fragment;", "read", "()Landroidx/fragment/app/Fragment;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass3 extends MagicModuleUseCase implements getCreatedOnDateMs<Fragment> {
        private /* synthetic */ Fragment $IconCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.$IconCompatParcelizer;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(Fragment fragment) {
            super(0);
            this.$IconCompatParcelizer = fragment;
        }
    }

    /* JADX INFO: renamed from: o.position$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/TypeResolutionContext;", "IconCompatParcelizer", "()Lo/TypeResolutionContext;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass5 extends MagicModuleUseCase implements getCreatedOnDateMs<TypeResolutionContext> {
        private /* synthetic */ getCreatedOnDateMs $RemoteActionCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final TypeResolutionContext invoke() {
            return (TypeResolutionContext) this.$RemoteActionCompatParcelizer.invoke();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(getCreatedOnDateMs getcreatedondatems) {
            super(0);
            this.$RemoteActionCompatParcelizer = getcreatedondatems;
        }
    }

    /* JADX INFO: renamed from: o.position$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/hasMixIns;", "IconCompatParcelizer", "()Lo/hasMixIns;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass1 extends MagicModuleUseCase implements getCreatedOnDateMs<hasMixIns> {
        private /* synthetic */ RenewEligible $AudioAttributesCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final hasMixIns invoke() {
            return _resolveFieldVsGetter.write(this.$AudioAttributesCompatParcelizer).getViewModelStore();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(RenewEligible renewEligible) {
            super(0);
            this.$AudioAttributesCompatParcelizer = renewEligible;
        }
    }

    /* JADX INFO: renamed from: o.position$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/withFieldVisibility;", "IconCompatParcelizer", "()Lo/withFieldVisibility;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass4 extends MagicModuleUseCase implements getCreatedOnDateMs<withFieldVisibility> {
        private /* synthetic */ getCreatedOnDateMs $AudioAttributesCompatParcelizer = null;
        private /* synthetic */ RenewEligible $read;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final withFieldVisibility invoke() {
            TypeResolutionContext typeResolutionContextWrite = _resolveFieldVsGetter.write(this.$read);
            anyExplicitsWithoutIgnoral anyexplicitswithoutignoral = typeResolutionContextWrite instanceof anyExplicitsWithoutIgnoral ? (anyExplicitsWithoutIgnoral) typeResolutionContextWrite : null;
            return anyexplicitswithoutignoral != null ? anyexplicitswithoutignoral.getDefaultViewModelCreationExtras() : withFieldVisibility.write.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(RenewEligible renewEligible) {
            super(0);
            this.$read = renewEligible;
        }
    }

    /* JADX INFO: renamed from: o.position$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/VisibilityChecker$RemoteActionCompatParcelizer;", "write", "()Lo/VisibilityChecker$RemoteActionCompatParcelizer;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass2 extends MagicModuleUseCase implements getCreatedOnDateMs<VisibilityChecker.RemoteActionCompatParcelizer> {
        private /* synthetic */ RenewEligible $IconCompatParcelizer;
        private /* synthetic */ Fragment $write;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final VisibilityChecker.RemoteActionCompatParcelizer invoke() {
            VisibilityChecker.RemoteActionCompatParcelizer defaultViewModelProviderFactory;
            TypeResolutionContext typeResolutionContextWrite = _resolveFieldVsGetter.write(this.$IconCompatParcelizer);
            anyExplicitsWithoutIgnoral anyexplicitswithoutignoral = typeResolutionContextWrite instanceof anyExplicitsWithoutIgnoral ? (anyExplicitsWithoutIgnoral) typeResolutionContextWrite : null;
            return (anyexplicitswithoutignoral == null || (defaultViewModelProviderFactory = anyexplicitswithoutignoral.getDefaultViewModelProviderFactory()) == null) ? this.$write.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Fragment fragment, RenewEligible renewEligible) {
            super(0);
            this.$write = fragment;
            this.$IconCompatParcelizer = renewEligible;
        }
    }

    static final class read extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                isDark<SupportStreetViewPanoramaFragmentzza> isdarkIconCompatParcelizer = position.this.AudioAttributesImplApi21Parcelizer().IconCompatParcelizer();
                final position positionVar = position.this;
                this.RemoteActionCompatParcelizer = 1;
                if (isdarkIconCompatParcelizer.write(new getValidationToken() { // from class: o.position.read.3
                    @Override // kotlin.getValidationToken
                    public final /* bridge */ /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return IconCompatParcelizer((SupportStreetViewPanoramaFragmentzza) obj2);
                    }

                    private Object IconCompatParcelizer(SupportStreetViewPanoramaFragmentzza supportStreetViewPanoramaFragmentzza) {
                        positionVar.read(supportStreetViewPanoramaFragmentzza);
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
            return position.this.new read(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((read) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    static final class IconCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<Boolean> setupdatedstatus = position.this.AudioAttributesImplApi21Parcelizer().read();
                final position positionVar = position.this;
                this.write = 1;
                if (setupdatedstatus.write(new getValidationToken() { // from class: o.position.IconCompatParcelizer.3
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return RemoteActionCompatParcelizer(((Boolean) obj2).booleanValue());
                    }

                    private Object RemoteActionCompatParcelizer(boolean z) {
                        if (z) {
                            ProgressBar progressBar = positionVar.RemoteActionCompatParcelizer().read;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(progressBar, "");
                            bytesRead.AudioAttributesImplApi21Parcelizer(progressBar);
                        } else {
                            ProgressBar progressBar2 = positionVar.RemoteActionCompatParcelizer().read;
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

        IconCompatParcelizer(SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return position.this.new IconCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((IconCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void AudioAttributesImplApi26Parcelizer() {
        String string;
        int i = RemoteActionCompatParcelizer.read[write().ordinal()];
        String str = "";
        if (i != 1) {
            if (i == 2) {
                string = getString(R.string.qbank_only_warning);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
            } else if (i == 3) {
                string = getString(R.string.bookmark_only_warning);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
            } else {
                if (i != 4) {
                    throw new RenewEligibleCreator();
                }
                string = getString(R.string.qbank_bookmark_warning);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
            }
            str = string;
        }
        read(str);
    }

    private final void read(String p0) {
        getAutofillClient.Companion companion = getAutofillClient.INSTANCE;
        String string = getString(R.string.warning_label);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        String string2 = getString(R.string.nav_reset);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string2, "");
        String string3 = getString(R.string.btn_cancel);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string3, "");
        getAutofillClient getautofillclientAudioAttributesCompatParcelizer = getAutofillClient.Companion.AudioAttributesCompatParcelizer(string, p0, string2, string3, R.drawable.ic_red_warning, null, false, false, null, 480);
        FragmentManager childFragmentManager = getChildFragmentManager();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(childFragmentManager, "");
        getBrowserClient.IconCompatParcelizer(getautofillclientAudioAttributesCompatParcelizer, childFragmentManager, new getCreatedOnDateMs() { // from class: o.StreetViewPanoramaView
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return position.MediaMetadataCompat(this.RemoteActionCompatParcelizer);
            }
        }, null, 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaMetadataCompat(position positionVar) {
        positionVar.AudioAttributesImplApi21Parcelizer().read(new SupportMapFragmentzza.read(positionVar.write()));
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void MediaBrowserCompatSearchResultReceiver() {
        if (getChildFragmentManager().findFragmentByTag("reset_progress_dialog") != null) {
            return;
        }
        zbu.Companion companion = zbu.INSTANCE;
        String string = getString(R.string.reset_in_progress_title);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        CharSequence text = getText(R.string.reset_in_progress_message);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(text, "");
        zbu.Companion.RemoteActionCompatParcelizer(new zbn(string, text)).show(getChildFragmentManager(), "reset_progress_dialog");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void read() {
        Fragment fragmentFindFragmentByTag = getChildFragmentManager().findFragmentByTag("reset_progress_dialog");
        argCount argcount = fragmentFindFragmentByTag instanceof argCount ? (argCount) fragmentFindFragmentByTag : null;
        if (argcount != null) {
            argcount.dismissAllowingStateLoss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void MediaMetadataCompat() {
        getAutofillClient.Companion companion = getAutofillClient.INSTANCE;
        String string = getString(R.string.reset_completed_message);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        String string2 = getString(R.string.reset_completed);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string2, "");
        String string3 = getString(R.string.btn_okay);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string3, "");
        getAutofillClient getautofillclientAudioAttributesCompatParcelizer = getAutofillClient.Companion.AudioAttributesCompatParcelizer(string2, string, string3, null, 0, null, false, false, 338, 248);
        FragmentManager childFragmentManager = getChildFragmentManager();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(childFragmentManager, "");
        getBrowserClient.IconCompatParcelizer(getautofillclientAudioAttributesCompatParcelizer, childFragmentManager, new getCreatedOnDateMs() { // from class: o.panoramaId
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return position.MediaBrowserCompatSearchResultReceiver(this.RemoteActionCompatParcelizer);
            }
        }, null, 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaBrowserCompatSearchResultReceiver(position positionVar) {
        maybeGetTypeVariable activity = positionVar.getActivity();
        if (activity != null) {
            activity.finish();
        }
        return getShowPopup.INSTANCE;
    }

    private final StreetViewPanoramaViewzzb write() {
        int checkedRadioButtonId = RemoteActionCompatParcelizer().AudioAttributesImplApi21Parcelizer.getCheckedRadioButtonId();
        return checkedRadioButtonId == RemoteActionCompatParcelizer().AudioAttributesImplApi26Parcelizer.getId() ? StreetViewPanoramaViewzzb.read : checkedRadioButtonId == RemoteActionCompatParcelizer().AudioAttributesImplBaseParcelizer.getId() ? StreetViewPanoramaViewzzb.write : checkedRadioButtonId == RemoteActionCompatParcelizer().MediaBrowserCompatCustomActionResultReceiver.getId() ? StreetViewPanoramaViewzzb.IconCompatParcelizer : StreetViewPanoramaViewzzb.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void read(SupportStreetViewPanoramaFragmentzza p0) {
        String remoteActionCompatParcelizer = p0.getRemoteActionCompatParcelizer();
        String string = getString(R.string.reset_screen_title);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        RemoteActionCompatParcelizer().onFastForward.setText(DataSpecBuilder.write(remoteActionCompatParcelizer, string));
        for (isMapToolbarEnabled ismaptoolbarenabled : p0.AudioAttributesCompatParcelizer()) {
            int i = RemoteActionCompatParcelizer.read[ismaptoolbarenabled.AudioAttributesCompatParcelizer().ordinal()];
            if (i != 1) {
                if (i == 2) {
                    bytesRead.AudioAttributesCompatParcelizer((List<? extends View>) IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Object[]) new View[]{RemoteActionCompatParcelizer().RemoteActionCompatParcelizer, RemoteActionCompatParcelizer().onCustomAction}));
                    RadioButton radioButton = RemoteActionCompatParcelizer().AudioAttributesImplApi26Parcelizer;
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(radioButton, "");
                    TextView textView = RemoteActionCompatParcelizer().onMediaButtonEvent;
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView, "");
                    AudioAttributesCompatParcelizer(radioButton, textView, ismaptoolbarenabled.IconCompatParcelizer());
                    TextView textView2 = RemoteActionCompatParcelizer().onCustomAction;
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView2, "");
                    write(textView2, ismaptoolbarenabled.read());
                    TextView textView3 = RemoteActionCompatParcelizer().onPause;
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView3, "");
                    IconCompatParcelizer(textView3, ismaptoolbarenabled.write());
                    TextView textView4 = RemoteActionCompatParcelizer().onPlay;
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView4, "");
                    write(textView4, ismaptoolbarenabled.RemoteActionCompatParcelizer());
                    RadioButton radioButton2 = RemoteActionCompatParcelizer().AudioAttributesImplApi26Parcelizer;
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(radioButton2, "");
                    TextView textView5 = RemoteActionCompatParcelizer().onMediaButtonEvent;
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView5, "");
                    RemoteActionCompatParcelizer(radioButton2, textView5, ismaptoolbarenabled.RemoteActionCompatParcelizer());
                } else if (i == 3) {
                    bytesRead.AudioAttributesCompatParcelizer((List<? extends View>) IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Object[]) new View[]{RemoteActionCompatParcelizer().IconCompatParcelizer, RemoteActionCompatParcelizer().MediaMetadataCompat}));
                    RadioButton radioButton3 = RemoteActionCompatParcelizer().AudioAttributesImplBaseParcelizer;
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(radioButton3, "");
                    TextView textView6 = RemoteActionCompatParcelizer().onCommand;
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView6, "");
                    AudioAttributesCompatParcelizer(radioButton3, textView6, ismaptoolbarenabled.IconCompatParcelizer());
                    TextView textView7 = RemoteActionCompatParcelizer().MediaMetadataCompat;
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView7, "");
                    write(textView7, ismaptoolbarenabled.read());
                    TextView textView8 = RemoteActionCompatParcelizer().MediaDescriptionCompat;
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView8, "");
                    IconCompatParcelizer(textView8, ismaptoolbarenabled.write());
                    TextView textView9 = RemoteActionCompatParcelizer().onAddQueueItem;
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView9, "");
                    write(textView9, ismaptoolbarenabled.RemoteActionCompatParcelizer());
                    RadioButton radioButton4 = RemoteActionCompatParcelizer().AudioAttributesImplBaseParcelizer;
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(radioButton4, "");
                    TextView textView10 = RemoteActionCompatParcelizer().onCommand;
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView10, "");
                    RemoteActionCompatParcelizer(radioButton4, textView10, ismaptoolbarenabled.RemoteActionCompatParcelizer());
                } else {
                    if (i != 4) {
                        throw new RenewEligibleCreator();
                    }
                    bytesRead.AudioAttributesCompatParcelizer((List<? extends View>) IntermediateLoginResponseBody.RemoteActionCompatParcelizer(RemoteActionCompatParcelizer().MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver));
                    RadioButton radioButton5 = RemoteActionCompatParcelizer().MediaBrowserCompatCustomActionResultReceiver;
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(radioButton5, "");
                    TextView textView11 = RemoteActionCompatParcelizer().handleMediaPlayPauseIfPendingOnHandler;
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView11, "");
                    AudioAttributesCompatParcelizer(radioButton5, textView11, ismaptoolbarenabled.IconCompatParcelizer());
                    TextView textView12 = RemoteActionCompatParcelizer().MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView12, "");
                    write(textView12, ismaptoolbarenabled.read());
                    TextView textView13 = RemoteActionCompatParcelizer().RatingCompat;
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView13, "");
                    IconCompatParcelizer(textView13, ismaptoolbarenabled.write());
                    TextView textView14 = RemoteActionCompatParcelizer().MediaBrowserCompatSearchResultReceiver;
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView14, "");
                    write(textView14, ismaptoolbarenabled.RemoteActionCompatParcelizer());
                    RadioButton radioButton6 = RemoteActionCompatParcelizer().MediaBrowserCompatCustomActionResultReceiver;
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(radioButton6, "");
                    TextView textView15 = RemoteActionCompatParcelizer().handleMediaPlayPauseIfPendingOnHandler;
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView15, "");
                    RemoteActionCompatParcelizer(radioButton6, textView15, ismaptoolbarenabled.RemoteActionCompatParcelizer());
                }
            }
        }
    }

    private static void RemoteActionCompatParcelizer(RadioButton p0, TextView p1, long p2) {
        if (p2 > System.currentTimeMillis()) {
            bytesRead.MediaBrowserCompatCustomActionResultReceiver(p0);
            bytesRead.AudioAttributesImplApi21Parcelizer(p1);
        } else {
            bytesRead.AudioAttributesImplApi21Parcelizer(p0);
            bytesRead.MediaBrowserCompatCustomActionResultReceiver(p1);
        }
    }

    private final void write(TextView p0, long p1) {
        if (p1 > System.currentTimeMillis()) {
            bytesRead.AudioAttributesImplApi21Parcelizer(p0);
            p0.setText(getString(R.string.reset_available_date, parseEac3SupplementalProperties.write(p1, "dd MMM yyyy")));
        } else {
            bytesRead.MediaBrowserCompatCustomActionResultReceiver(p0);
        }
    }

    private final void IconCompatParcelizer(TextView p0, long p1) {
        if (p1 > 0) {
            bytesRead.AudioAttributesImplApi21Parcelizer(p0);
            p0.setText(getString(R.string.reset_last_reset, parseEac3SupplementalProperties.write(p1, "dd MMM yyyy")));
        } else {
            bytesRead.MediaBrowserCompatCustomActionResultReceiver(p0);
        }
    }

    private static void AudioAttributesCompatParcelizer(TextView p0, TextView p1, String p2) {
        String str = p2;
        p0.setVisibility((str == null || str.length() == 0) ? 8 : 0);
        p1.setVisibility((str == null || str.length() == 0) ? 8 : 0);
        p0.setText(p2 == null ? "" : p2);
        if (p2 == null) {
            p2 = "";
        }
        p1.setText(p2);
    }

    private static void write(TextView p0, String p1) {
        String str = p1;
        p0.setVisibility((str == null || str.length() == 0) ? 8 : 0);
        if (p1 == null) {
            p1 = "";
        }
        p0.setText(p1);
    }
}
