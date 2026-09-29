package kotlin;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.util.DeviceProperties;
import com.marrow.R;
import com.marrow2.ui.signup.college.college_list.viewmodel.CollegeSelectionViewModel;
import com.marrow2.ui.signup.college.viewmodel.CollegeSelectionParentViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.VisibilityChecker;
import kotlin.getStreetViewPanorama;
import kotlin.setPositionWithSource;
import kotlin.withFieldVisibility;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0003J\u000f\u0010\u0013\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0003R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00148CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0017R\u001b\u0010\u001a\u001a\u00020\u00198CX\u0083\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u001cR\u001b\u0010\u001e\u001a\u00020\u001d8CX\u0083\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u001b\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0015\u001a\u00020 8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010!"}, d2 = {"Lo/setPositionWithRadiusAndSource;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Landroid/view/LayoutInflater;", "p0", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "write", "AudioAttributesImplBaseParcelizer", "MediaBrowserCompatCustomActionResultReceiver", "AudioAttributesImplApi26Parcelizer", "Lo/loadMedia;", "read", "Lo/loadMedia;", "()Lo/loadMedia;", "AudioAttributesCompatParcelizer", "Lcom/marrow2/ui/signup/college/college_list/viewmodel/CollegeSelectionViewModel;", "IconCompatParcelizer", "Lo/RenewEligible;", "()Lcom/marrow2/ui/signup/college/college_list/viewmodel/CollegeSelectionViewModel;", "Lcom/marrow2/ui/signup/college/viewmodel/CollegeSelectionParentViewModel;", "RemoteActionCompatParcelizer", "()Lcom/marrow2/ui/signup/college/viewmodel/CollegeSelectionParentViewModel;", "Lo/snapshotForTest;", "Lo/snapshotForTest;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class setPositionWithRadiusAndSource extends setPositionWithRadius {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final snapshotForTest read;
    private final RenewEligible IconCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private loadMedia write;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final RenewEligible RemoteActionCompatParcelizer;

    public setPositionWithRadiusAndSource() {
        setPositionWithRadiusAndSource setpositionwithradiusandsource = this;
        RenewEligible renewEligibleWrite = getRenewExpiresOn.write(RenewEligibleCompanion.read, new AnonymousClass5(new AnonymousClass2(setpositionwithradiusandsource)));
        this.IconCompatParcelizer = _resolveFieldVsGetter.RemoteActionCompatParcelizer(toMagicModuleMetaDataUcModel.write(CollegeSelectionViewModel.class), new AnonymousClass7(renewEligibleWrite), new AnonymousClass9(renewEligibleWrite), new AnonymousClass6(setpositionwithradiusandsource, renewEligibleWrite));
        this.RemoteActionCompatParcelizer = _resolveFieldVsGetter.RemoteActionCompatParcelizer(toMagicModuleMetaDataUcModel.write(CollegeSelectionParentViewModel.class), new AnonymousClass1(setpositionwithradiusandsource), new AnonymousClass3(setpositionwithradiusandsource), new AnonymousClass4(setpositionwithradiusandsource));
        this.read = new snapshotForTest(new getAnswerMap() { // from class: o.setPositionWithID
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return setPositionWithRadiusAndSource.IconCompatParcelizer(this.read, ((Integer) obj).intValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final loadMedia read() {
        loadMedia loadmedia = this.write;
        toMagicModuleMetaRepoModel.write(loadmedia);
        return loadmedia;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CollegeSelectionViewModel AudioAttributesCompatParcelizer() {
        return (CollegeSelectionViewModel) this.IconCompatParcelizer.RemoteActionCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CollegeSelectionParentViewModel RemoteActionCompatParcelizer() {
        return (CollegeSelectionParentViewModel) this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(setPositionWithRadiusAndSource setpositionwithradiusandsource, int i) {
        setpositionwithradiusandsource.AudioAttributesCompatParcelizer().IconCompatParcelizer(new setPositionWithSource.IconCompatParcelizer(i));
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: renamed from: o.setPositionWithRadiusAndSource$RemoteActionCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo/setPositionWithRadiusAndSource$RemoteActionCompatParcelizer;", "", "<init>", "()V", "Lo/setPositionWithRadiusAndSource;", "write", "()Lo/setPositionWithRadiusAndSource;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static setPositionWithRadiusAndSource write() {
            return new setPositionWithRadiusAndSource();
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        this.write = loadMedia.IconCompatParcelizer(p0, p1);
        FrameLayout frameLayoutIconCompatParcelizer = read().IconCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(frameLayoutIconCompatParcelizer, "");
        return frameLayoutIconCompatParcelizer;
    }

    public static final class AudioAttributesCompatParcelizer implements TextWatcher {
        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public AudioAttributesCompatParcelizer() {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            setPositionWithRadiusAndSource.this.AudioAttributesCompatParcelizer().IconCompatParcelizer(new setPositionWithSource.write(String.valueOf(charSequence)));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View p0, Bundle p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        super.onViewCreated(p0, p1);
        AudioAttributesImplApi26Parcelizer();
        AudioAttributesImplBaseParcelizer();
        write();
        MediaBrowserCompatCustomActionResultReceiver();
    }

    private final void write() {
        AppCompatEditText appCompatEditText = read().AudioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(appCompatEditText, "");
        appCompatEditText.addTextChangedListener(new AudioAttributesCompatParcelizer());
    }

    private final void AudioAttributesImplBaseParcelizer() {
        Pair<String, Boolean> pairMediaBrowserCompatCustomActionResultReceiver = RemoteActionCompatParcelizer().MediaBrowserCompatCustomActionResultReceiver();
        AudioAttributesCompatParcelizer().IconCompatParcelizer(new setPositionWithSource.AudioAttributesCompatParcelizer(pairMediaBrowserCompatCustomActionResultReceiver.write(), pairMediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer().booleanValue()));
        setPositionWithRadiusAndSource setpositionwithradiusandsource = this;
        setBitrateKbps.RemoteActionCompatParcelizer(setpositionwithradiusandsource, new write(null));
        setBitrateKbps.read(setpositionwithradiusandsource, new read(null));
        setBitrateKbps.read(setpositionwithradiusandsource, new IconCompatParcelizer(null));
        setBitrateKbps.RemoteActionCompatParcelizer(setpositionwithradiusandsource, new MediaBrowserCompatItemReceiver(null));
    }

    static final class write extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<MapLifecycleDelegate> setupdatedstatusIconCompatParcelizer = setPositionWithRadiusAndSource.this.RemoteActionCompatParcelizer().IconCompatParcelizer();
                final setPositionWithRadiusAndSource setpositionwithradiusandsource = setPositionWithRadiusAndSource.this;
                this.AudioAttributesCompatParcelizer = 1;
                if (setupdatedstatusIconCompatParcelizer.write(new getValidationToken() { // from class: o.setPositionWithRadiusAndSource.write.5

                    /* JADX INFO: renamed from: o.setPositionWithRadiusAndSource$write$5$IconCompatParcelizer */
                    public static final /* synthetic */ class IconCompatParcelizer {
                        public static final /* synthetic */ int[] IconCompatParcelizer;

                        static {
                            int[] iArr = new int[MapLifecycleDelegate.values().length];
                            try {
                                iArr[MapLifecycleDelegate.write.ordinal()] = 1;
                            } catch (NoSuchFieldError unused) {
                            }
                            try {
                                iArr[MapLifecycleDelegate.RemoteActionCompatParcelizer.ordinal()] = 2;
                            } catch (NoSuchFieldError unused2) {
                            }
                            try {
                                iArr[MapLifecycleDelegate.IconCompatParcelizer.ordinal()] = 3;
                            } catch (NoSuchFieldError unused3) {
                            }
                            try {
                                iArr[MapLifecycleDelegate.read.ordinal()] = 4;
                            } catch (NoSuchFieldError unused4) {
                            }
                            IconCompatParcelizer = iArr;
                        }
                    }

                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return RemoteActionCompatParcelizer((MapLifecycleDelegate) obj2);
                    }

                    private Object RemoteActionCompatParcelizer(MapLifecycleDelegate mapLifecycleDelegate) {
                        TextView textView = setpositionwithradiusandsource.read().read;
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView, "");
                        bytesRead.AudioAttributesImplApi21Parcelizer(textView);
                        int i2 = IconCompatParcelizer.IconCompatParcelizer[mapLifecycleDelegate.ordinal()];
                        if (i2 == 1) {
                            setpositionwithradiusandsource.read().AudioAttributesImplBaseParcelizer.setText(setpositionwithradiusandsource.getString(R.string.which_pg_school_did_you_go_to));
                            setpositionwithradiusandsource.read().read.setText(setpositionwithradiusandsource.getString(R.string.name_of_the_college));
                        } else if (i2 == 2) {
                            setpositionwithradiusandsource.read().AudioAttributesImplBaseParcelizer.setText(setpositionwithradiusandsource.getString(R.string.select_country_for_college));
                            TextView textView2 = setpositionwithradiusandsource.read().read;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView2, "");
                            bytesRead.MediaBrowserCompatCustomActionResultReceiver(textView2);
                        } else if (i2 == 3) {
                            setpositionwithradiusandsource.read().AudioAttributesImplBaseParcelizer.setText(setpositionwithradiusandsource.getString(R.string.which_school_did_you_go_to));
                            setpositionwithradiusandsource.read().read.setText(setpositionwithradiusandsource.getString(R.string.name_of_the_college));
                        } else if (i2 != 4) {
                            throw new RenewEligibleCreator();
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
            return setPositionWithRadiusAndSource.this.new write(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((write) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: o.setPositionWithRadiusAndSource$2, reason: invalid class name */
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

    static final class read extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<getStreetViewPanoramaLocation> setupdatedstatusAudioAttributesCompatParcelizer = setPositionWithRadiusAndSource.this.AudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer();
                final setPositionWithRadiusAndSource setpositionwithradiusandsource = setPositionWithRadiusAndSource.this;
                this.AudioAttributesCompatParcelizer = 1;
                if (setupdatedstatusAudioAttributesCompatParcelizer.write(new getValidationToken() { // from class: o.setPositionWithRadiusAndSource.read.3
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return AudioAttributesCompatParcelizer((getStreetViewPanoramaLocation) obj2);
                    }

                    private Object AudioAttributesCompatParcelizer(getStreetViewPanoramaLocation getstreetviewpanoramalocation) {
                        snapshotForTest snapshotfortest = setpositionwithradiusandsource.read;
                        List<fromPath> listAudioAttributesCompatParcelizer = getstreetviewpanoramalocation.AudioAttributesCompatParcelizer();
                        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) listAudioAttributesCompatParcelizer, 10));
                        Iterator<T> it = listAudioAttributesCompatParcelizer.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((fromPath) it.next()).IconCompatParcelizer());
                        }
                        snapshotfortest.RemoteActionCompatParcelizer(arrayList);
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
            return setPositionWithRadiusAndSource.this.new read(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((read) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: o.setPositionWithRadiusAndSource$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/TypeResolutionContext;", "write", "()Lo/TypeResolutionContext;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass5 extends MagicModuleUseCase implements getCreatedOnDateMs<TypeResolutionContext> {
        private /* synthetic */ getCreatedOnDateMs $IconCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final TypeResolutionContext invoke() {
            return (TypeResolutionContext) this.$IconCompatParcelizer.invoke();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(getCreatedOnDateMs getcreatedondatems) {
            super(0);
            this.$IconCompatParcelizer = getcreatedondatems;
        }
    }

    /* JADX INFO: renamed from: o.setPositionWithRadiusAndSource$7, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/hasMixIns;", "write", "()Lo/hasMixIns;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass7 extends MagicModuleUseCase implements getCreatedOnDateMs<hasMixIns> {
        private /* synthetic */ RenewEligible $read;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final hasMixIns invoke() {
            return _resolveFieldVsGetter.write(this.$read).getViewModelStore();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass7(RenewEligible renewEligible) {
            super(0);
            this.$read = renewEligible;
        }
    }

    static final class IconCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int IconCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<Boolean> setupdatedstatus = setPositionWithRadiusAndSource.this.AudioAttributesCompatParcelizer().read();
                final setPositionWithRadiusAndSource setpositionwithradiusandsource = setPositionWithRadiusAndSource.this;
                this.IconCompatParcelizer = 1;
                if (setupdatedstatus.write(new getValidationToken() { // from class: o.setPositionWithRadiusAndSource.IconCompatParcelizer.2
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return write(((Boolean) obj2).booleanValue());
                    }

                    private Object write(boolean z) {
                        ProgressBar progressBar = setpositionwithradiusandsource.read().RemoteActionCompatParcelizer;
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

        IconCompatParcelizer(SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return setPositionWithRadiusAndSource.this.new IconCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((IconCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: o.setPositionWithRadiusAndSource$9, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/withFieldVisibility;", "AudioAttributesCompatParcelizer", "()Lo/withFieldVisibility;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass9 extends MagicModuleUseCase implements getCreatedOnDateMs<withFieldVisibility> {
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
        public AnonymousClass9(RenewEligible renewEligible) {
            super(0);
            this.$read = renewEligible;
        }
    }

    /* JADX INFO: renamed from: o.setPositionWithRadiusAndSource$6, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/VisibilityChecker$RemoteActionCompatParcelizer;", "IconCompatParcelizer", "()Lo/VisibilityChecker$RemoteActionCompatParcelizer;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass6 extends MagicModuleUseCase implements getCreatedOnDateMs<VisibilityChecker.RemoteActionCompatParcelizer> {
        private /* synthetic */ RenewEligible $AudioAttributesCompatParcelizer;
        private /* synthetic */ Fragment $read;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final VisibilityChecker.RemoteActionCompatParcelizer invoke() {
            VisibilityChecker.RemoteActionCompatParcelizer defaultViewModelProviderFactory;
            TypeResolutionContext typeResolutionContextWrite = _resolveFieldVsGetter.write(this.$AudioAttributesCompatParcelizer);
            anyExplicitsWithoutIgnoral anyexplicitswithoutignoral = typeResolutionContextWrite instanceof anyExplicitsWithoutIgnoral ? (anyExplicitsWithoutIgnoral) typeResolutionContextWrite : null;
            return (anyexplicitswithoutignoral == null || (defaultViewModelProviderFactory = anyexplicitswithoutignoral.getDefaultViewModelProviderFactory()) == null) ? this.$read.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(Fragment fragment, RenewEligible renewEligible) {
            super(0);
            this.$read = fragment;
            this.$AudioAttributesCompatParcelizer = renewEligible;
        }
    }

    static final class MediaBrowserCompatItemReceiver extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int IconCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<getStreetViewPanorama> setupdatedstatusIconCompatParcelizer = setPositionWithRadiusAndSource.this.AudioAttributesCompatParcelizer().IconCompatParcelizer();
                final setPositionWithRadiusAndSource setpositionwithradiusandsource = setPositionWithRadiusAndSource.this;
                this.IconCompatParcelizer = 1;
                if (setupdatedstatusIconCompatParcelizer.write(new getValidationToken() { // from class: o.setPositionWithRadiusAndSource.MediaBrowserCompatItemReceiver.3
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return write((getStreetViewPanorama) obj2);
                    }

                    private Object write(getStreetViewPanorama getstreetviewpanorama) {
                        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getstreetviewpanorama, getStreetViewPanorama.read.INSTANCE)) {
                            if (getstreetviewpanorama instanceof getStreetViewPanorama.write) {
                                getStreetViewPanorama.write writeVar = (getStreetViewPanorama.write) getstreetviewpanorama;
                                setpositionwithradiusandsource.RemoteActionCompatParcelizer().RemoteActionCompatParcelizer(writeVar.read().getWrite(), writeVar.read().getRemoteActionCompatParcelizer());
                                setpositionwithradiusandsource.AudioAttributesCompatParcelizer().IconCompatParcelizer(setPositionWithSource.RemoteActionCompatParcelizer.INSTANCE);
                            } else if (getstreetviewpanorama instanceof getStreetViewPanorama.AudioAttributesCompatParcelizer) {
                                CmcdConfigurationRequestConfig.AudioAttributesCompatParcelizer(setpositionwithradiusandsource, ((getStreetViewPanorama.AudioAttributesCompatParcelizer) getstreetviewpanorama).IconCompatParcelizer(), 0);
                            } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getstreetviewpanorama, getStreetViewPanorama.RemoteActionCompatParcelizer.INSTANCE)) {
                                setPositionWithRadiusAndSource setpositionwithradiusandsource2 = setpositionwithradiusandsource;
                                setPositionWithRadiusAndSource setpositionwithradiusandsource3 = setpositionwithradiusandsource2;
                                String string = setpositionwithradiusandsource2.getString(R.string.app_error_no_internet);
                                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
                                CmcdConfigurationRequestConfig.AudioAttributesCompatParcelizer(setpositionwithradiusandsource3, string, 0);
                                setpositionwithradiusandsource.RemoteActionCompatParcelizer().MediaBrowserCompatSearchResultReceiver();
                            } else {
                                if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getstreetviewpanorama, getStreetViewPanorama.IconCompatParcelizer.INSTANCE)) {
                                    throw new RenewEligibleCreator();
                                }
                                setPositionWithRadiusAndSource setpositionwithradiusandsource4 = setpositionwithradiusandsource;
                                setPositionWithRadiusAndSource setpositionwithradiusandsource5 = setpositionwithradiusandsource4;
                                String string2 = setpositionwithradiusandsource4.getString(R.string.toast_onboarding_no_institute_available);
                                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string2, "");
                                CmcdConfigurationRequestConfig.AudioAttributesCompatParcelizer(setpositionwithradiusandsource5, string2, 0);
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

        MediaBrowserCompatItemReceiver(SampleVideos<? super MediaBrowserCompatItemReceiver> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return setPositionWithRadiusAndSource.this.new MediaBrowserCompatItemReceiver(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaBrowserCompatItemReceiver) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void MediaBrowserCompatCustomActionResultReceiver() {
        if (DeviceProperties.isTablet(requireContext())) {
            Context contextRequireContext = requireContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
            RecyclerView recyclerView = read().write;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(recyclerView, "");
            bytesRead.AudioAttributesCompatParcelizer(contextRequireContext, recyclerView);
            Context contextRequireContext2 = requireContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext2, "");
            LinearLayout linearLayout = read().IconCompatParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout, "");
            bytesRead.AudioAttributesCompatParcelizer(contextRequireContext2, linearLayout);
        }
    }

    private final void AudioAttributesImplApi26Parcelizer() {
        read().write.setAdapter(this.read);
    }

    /* JADX INFO: renamed from: o.setPositionWithRadiusAndSource$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/hasMixIns;", "IconCompatParcelizer", "()Lo/hasMixIns;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass1 extends MagicModuleUseCase implements getCreatedOnDateMs<hasMixIns> {
        private /* synthetic */ Fragment $AudioAttributesCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final hasMixIns invoke() {
            return this.$AudioAttributesCompatParcelizer.requireActivity().getViewModelStore();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Fragment fragment) {
            super(0);
            this.$AudioAttributesCompatParcelizer = fragment;
        }
    }

    /* JADX INFO: renamed from: o.setPositionWithRadiusAndSource$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/withFieldVisibility;", "RemoteActionCompatParcelizer", "()Lo/withFieldVisibility;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass3 extends MagicModuleUseCase implements getCreatedOnDateMs<withFieldVisibility> {
        private /* synthetic */ getCreatedOnDateMs $RemoteActionCompatParcelizer = null;
        private /* synthetic */ Fragment $read;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final withFieldVisibility invoke() {
            return this.$read.requireActivity().getDefaultViewModelCreationExtras();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(Fragment fragment) {
            super(0);
            this.$read = fragment;
        }
    }

    /* JADX INFO: renamed from: o.setPositionWithRadiusAndSource$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/VisibilityChecker$RemoteActionCompatParcelizer;", "AudioAttributesCompatParcelizer", "()Lo/VisibilityChecker$RemoteActionCompatParcelizer;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass4 extends MagicModuleUseCase implements getCreatedOnDateMs<VisibilityChecker.RemoteActionCompatParcelizer> {
        private /* synthetic */ Fragment $read;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final VisibilityChecker.RemoteActionCompatParcelizer invoke() {
            return this.$read.requireActivity().getDefaultViewModelProviderFactory();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(Fragment fragment) {
            super(0);
            this.$read = fragment;
        }
    }
}
