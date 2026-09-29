package kotlin;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.util.DeviceProperties;
import com.marrow.R;
import com.marrow2.ui.signup.college.state_country.viewmodel.CountryStateSelectionViewModel;
import com.marrow2.ui.signup.college.viewmodel.CollegeSelectionParentViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.VisibilityChecker;
import kotlin.fromAsset;
import kotlin.fromFile;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0003R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00138CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001b\u001a\u00020\u00198CX\u0083\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\u0014\u001a\u00020\u001d8CX\u0083\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u001a\u001a\u0004\b\u0016\u0010\u001eR\u0014\u0010\u0010\u001a\u00020\u001f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010 "}, d2 = {"Lo/StreetViewLifecycleDelegate;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Landroid/view/LayoutInflater;", "p0", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "RemoteActionCompatParcelizer", "AudioAttributesImplBaseParcelizer", "AudioAttributesImplApi26Parcelizer", "Lo/invalidateExtractor;", "IconCompatParcelizer", "Lo/invalidateExtractor;", "read", "AudioAttributesCompatParcelizer", "()Lo/invalidateExtractor;", "Lcom/marrow2/ui/signup/college/state_country/viewmodel/CountryStateSelectionViewModel;", "Lo/RenewEligible;", "write", "()Lcom/marrow2/ui/signup/college/state_country/viewmodel/CountryStateSelectionViewModel;", "Lcom/marrow2/ui/signup/college/viewmodel/CollegeSelectionParentViewModel;", "()Lcom/marrow2/ui/signup/college/viewmodel/CollegeSelectionParentViewModel;", "Lo/snapshotForTest;", "Lo/snapshotForTest;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class StreetViewLifecycleDelegate extends fromBitmap {

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final RenewEligible write;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private invalidateExtractor read;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final RenewEligible IconCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final snapshotForTest RemoteActionCompatParcelizer = new snapshotForTest(new getAnswerMap() { // from class: o.BitmapDescriptor
        @Override // kotlin.getAnswerMap
        public final Object invoke(Object obj) {
            return StreetViewLifecycleDelegate.write(this.IconCompatParcelizer, ((Integer) obj).intValue());
        }
    });

    public StreetViewLifecycleDelegate() {
        StreetViewLifecycleDelegate streetViewLifecycleDelegate = this;
        this.write = _resolveFieldVsGetter.RemoteActionCompatParcelizer(toMagicModuleMetaDataUcModel.write(CountryStateSelectionViewModel.class), new AnonymousClass2(streetViewLifecycleDelegate), new AnonymousClass3(streetViewLifecycleDelegate), new AnonymousClass1(streetViewLifecycleDelegate));
        this.IconCompatParcelizer = _resolveFieldVsGetter.RemoteActionCompatParcelizer(toMagicModuleMetaDataUcModel.write(CollegeSelectionParentViewModel.class), new AnonymousClass4(streetViewLifecycleDelegate), new AnonymousClass5(streetViewLifecycleDelegate), new AnonymousClass8(streetViewLifecycleDelegate));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final invalidateExtractor AudioAttributesCompatParcelizer() {
        invalidateExtractor invalidateextractor = this.read;
        toMagicModuleMetaRepoModel.write(invalidateextractor);
        return invalidateextractor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CountryStateSelectionViewModel write() {
        return (CountryStateSelectionViewModel) this.write.RemoteActionCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CollegeSelectionParentViewModel read() {
        return (CollegeSelectionParentViewModel) this.IconCompatParcelizer.RemoteActionCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(StreetViewLifecycleDelegate streetViewLifecycleDelegate, int i) {
        streetViewLifecycleDelegate.write().RemoteActionCompatParcelizer(new fromFile.read(i));
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: renamed from: o.StreetViewLifecycleDelegate$read, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo/StreetViewLifecycleDelegate$read;", "", "<init>", "()V", "Lo/StreetViewLifecycleDelegate;", "write", "()Lo/StreetViewLifecycleDelegate;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static StreetViewLifecycleDelegate write() {
            return new StreetViewLifecycleDelegate();
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        this.read = invalidateExtractor.IconCompatParcelizer(p0, p1);
        FrameLayout frameLayoutIconCompatParcelizer = AudioAttributesCompatParcelizer().IconCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(frameLayoutIconCompatParcelizer, "");
        return frameLayoutIconCompatParcelizer;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View p0, Bundle p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        super.onViewCreated(p0, p1);
        write().write(read().AudioAttributesImplApi21Parcelizer());
        AudioAttributesImplBaseParcelizer();
        RemoteActionCompatParcelizer();
        AudioAttributesImplApi26Parcelizer();
    }

    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int IconCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<MapLifecycleDelegate> setupdatedstatusIconCompatParcelizer = StreetViewLifecycleDelegate.this.read().IconCompatParcelizer();
                final StreetViewLifecycleDelegate streetViewLifecycleDelegate = StreetViewLifecycleDelegate.this;
                this.IconCompatParcelizer = 1;
                if (setupdatedstatusIconCompatParcelizer.write(new getValidationToken() { // from class: o.StreetViewLifecycleDelegate.RemoteActionCompatParcelizer.5

                    /* JADX INFO: renamed from: o.StreetViewLifecycleDelegate$RemoteActionCompatParcelizer$5$write */
                    public static final /* synthetic */ class write {
                        public static final /* synthetic */ int[] AudioAttributesCompatParcelizer;

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
                            AudioAttributesCompatParcelizer = iArr;
                        }
                    }

                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return AudioAttributesCompatParcelizer((MapLifecycleDelegate) obj2);
                    }

                    private Object AudioAttributesCompatParcelizer(MapLifecycleDelegate mapLifecycleDelegate) {
                        TextView textView = streetViewLifecycleDelegate.AudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer;
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView, "");
                        bytesRead.AudioAttributesImplApi21Parcelizer(textView);
                        int i2 = write.AudioAttributesCompatParcelizer[mapLifecycleDelegate.ordinal()];
                        if (i2 == 1) {
                            streetViewLifecycleDelegate.AudioAttributesCompatParcelizer().read.setText(streetViewLifecycleDelegate.getString(R.string.which_pg_school_did_you_go_to));
                            streetViewLifecycleDelegate.AudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer.setText(streetViewLifecycleDelegate.getString(R.string.select_pg_state_for_college));
                        } else if (i2 == 2) {
                            streetViewLifecycleDelegate.AudioAttributesCompatParcelizer().read.setText(streetViewLifecycleDelegate.getString(R.string.select_country_for_college));
                            TextView textView2 = streetViewLifecycleDelegate.AudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView2, "");
                            bytesRead.MediaBrowserCompatCustomActionResultReceiver(textView2);
                        } else if (i2 == 3) {
                            streetViewLifecycleDelegate.AudioAttributesCompatParcelizer().read.setText(streetViewLifecycleDelegate.getString(R.string.which_school_did_you_go_to));
                            streetViewLifecycleDelegate.AudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer.setText(streetViewLifecycleDelegate.getString(R.string.select_state_for_college));
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

        RemoteActionCompatParcelizer(SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return StreetViewLifecycleDelegate.this.new RemoteActionCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void RemoteActionCompatParcelizer() {
        StreetViewLifecycleDelegate streetViewLifecycleDelegate = this;
        setBitrateKbps.RemoteActionCompatParcelizer(streetViewLifecycleDelegate, new RemoteActionCompatParcelizer(null));
        setBitrateKbps.read(streetViewLifecycleDelegate, new AudioAttributesCompatParcelizer(null));
        setBitrateKbps.read(streetViewLifecycleDelegate, new IconCompatParcelizer(null));
        setBitrateKbps.read(streetViewLifecycleDelegate, new write(null));
    }

    static final class AudioAttributesCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<List<fromPath>> setupdatedstatusAudioAttributesCompatParcelizer = StreetViewLifecycleDelegate.this.write().AudioAttributesCompatParcelizer();
                final StreetViewLifecycleDelegate streetViewLifecycleDelegate = StreetViewLifecycleDelegate.this;
                this.AudioAttributesCompatParcelizer = 1;
                if (setupdatedstatusAudioAttributesCompatParcelizer.write(new getValidationToken() { // from class: o.StreetViewLifecycleDelegate.AudioAttributesCompatParcelizer.4
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return RemoteActionCompatParcelizer((List) obj2);
                    }

                    private Object RemoteActionCompatParcelizer(List<fromPath> list) {
                        snapshotForTest snapshotfortest = streetViewLifecycleDelegate.RemoteActionCompatParcelizer;
                        List<fromPath> list2 = list;
                        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list2, 10));
                        Iterator<T> it = list2.iterator();
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

        AudioAttributesCompatParcelizer(SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return StreetViewLifecycleDelegate.this.new AudioAttributesCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
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
                setUpdatedStatus<fromAsset> setupdatedstatusIconCompatParcelizer = StreetViewLifecycleDelegate.this.write().IconCompatParcelizer();
                final StreetViewLifecycleDelegate streetViewLifecycleDelegate = StreetViewLifecycleDelegate.this;
                this.read = 1;
                if (setupdatedstatusIconCompatParcelizer.write(new getValidationToken() { // from class: o.StreetViewLifecycleDelegate.IconCompatParcelizer.4
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return AudioAttributesCompatParcelizer((fromAsset) obj2);
                    }

                    private Object AudioAttributesCompatParcelizer(fromAsset fromasset) {
                        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(fromasset, fromAsset.read.INSTANCE)) {
                            if (fromasset instanceof fromAsset.RemoteActionCompatParcelizer) {
                                streetViewLifecycleDelegate.read().AudioAttributesCompatParcelizer(((fromAsset.RemoteActionCompatParcelizer) fromasset).write());
                                streetViewLifecycleDelegate.write().RemoteActionCompatParcelizer(fromFile.IconCompatParcelizer.INSTANCE);
                            } else if (fromasset instanceof fromAsset.IconCompatParcelizer) {
                                CmcdConfigurationRequestConfig.AudioAttributesCompatParcelizer(streetViewLifecycleDelegate, ((fromAsset.IconCompatParcelizer) fromasset).read(), 0);
                            } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(fromasset, fromAsset.AudioAttributesCompatParcelizer.INSTANCE)) {
                                StreetViewLifecycleDelegate streetViewLifecycleDelegate2 = streetViewLifecycleDelegate;
                                StreetViewLifecycleDelegate streetViewLifecycleDelegate3 = streetViewLifecycleDelegate2;
                                String string = streetViewLifecycleDelegate2.getString(R.string.app_error_no_internet);
                                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
                                CmcdConfigurationRequestConfig.AudioAttributesCompatParcelizer(streetViewLifecycleDelegate3, string, 0);
                            } else if (fromasset instanceof fromAsset.write) {
                                streetViewLifecycleDelegate.read().AudioAttributesCompatParcelizer(((fromAsset.write) fromasset).AudioAttributesCompatParcelizer());
                                streetViewLifecycleDelegate.write().RemoteActionCompatParcelizer(fromFile.IconCompatParcelizer.INSTANCE);
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

        IconCompatParcelizer(SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return StreetViewLifecycleDelegate.this.new IconCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((IconCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    static final class write extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<Boolean> setupdatedstatus = StreetViewLifecycleDelegate.this.write().read();
                final StreetViewLifecycleDelegate streetViewLifecycleDelegate = StreetViewLifecycleDelegate.this;
                this.write = 1;
                if (setupdatedstatus.write(new getValidationToken() { // from class: o.StreetViewLifecycleDelegate.write.4
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return write(((Boolean) obj2).booleanValue());
                    }

                    private Object write(boolean z) {
                        ProgressBar progressBar = streetViewLifecycleDelegate.AudioAttributesCompatParcelizer().IconCompatParcelizer;
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
            return StreetViewLifecycleDelegate.this.new write(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((write) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void AudioAttributesImplBaseParcelizer() {
        AudioAttributesCompatParcelizer().write.setAdapter(this.RemoteActionCompatParcelizer);
    }

    private final void AudioAttributesImplApi26Parcelizer() {
        if (DeviceProperties.isTablet(requireContext())) {
            Context contextRequireContext = requireContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
            RecyclerView recyclerView = AudioAttributesCompatParcelizer().write;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(recyclerView, "");
            bytesRead.AudioAttributesCompatParcelizer(contextRequireContext, recyclerView);
        }
    }

    /* JADX INFO: renamed from: o.StreetViewLifecycleDelegate$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/hasMixIns;", "IconCompatParcelizer", "()Lo/hasMixIns;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass2 extends MagicModuleUseCase implements getCreatedOnDateMs<hasMixIns> {
        private /* synthetic */ Fragment $write;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final hasMixIns invoke() {
            return this.$write.requireActivity().getViewModelStore();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Fragment fragment) {
            super(0);
            this.$write = fragment;
        }
    }

    /* JADX INFO: renamed from: o.StreetViewLifecycleDelegate$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/hasMixIns;", "AudioAttributesCompatParcelizer", "()Lo/hasMixIns;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass4 extends MagicModuleUseCase implements getCreatedOnDateMs<hasMixIns> {
        private /* synthetic */ Fragment $write;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final hasMixIns invoke() {
            return this.$write.requireActivity().getViewModelStore();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(Fragment fragment) {
            super(0);
            this.$write = fragment;
        }
    }

    /* JADX INFO: renamed from: o.StreetViewLifecycleDelegate$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/withFieldVisibility;", "AudioAttributesCompatParcelizer", "()Lo/withFieldVisibility;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass3 extends MagicModuleUseCase implements getCreatedOnDateMs<withFieldVisibility> {
        private /* synthetic */ getCreatedOnDateMs $AudioAttributesCompatParcelizer = null;
        private /* synthetic */ Fragment $RemoteActionCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final withFieldVisibility invoke() {
            return this.$RemoteActionCompatParcelizer.requireActivity().getDefaultViewModelCreationExtras();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(Fragment fragment) {
            super(0);
            this.$RemoteActionCompatParcelizer = fragment;
        }
    }

    /* JADX INFO: renamed from: o.StreetViewLifecycleDelegate$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/withFieldVisibility;", "RemoteActionCompatParcelizer", "()Lo/withFieldVisibility;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass5 extends MagicModuleUseCase implements getCreatedOnDateMs<withFieldVisibility> {
        private /* synthetic */ getCreatedOnDateMs $AudioAttributesCompatParcelizer = null;
        private /* synthetic */ Fragment $write;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final withFieldVisibility invoke() {
            return this.$write.requireActivity().getDefaultViewModelCreationExtras();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(Fragment fragment) {
            super(0);
            this.$write = fragment;
        }
    }

    /* JADX INFO: renamed from: o.StreetViewLifecycleDelegate$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/VisibilityChecker$RemoteActionCompatParcelizer;", "IconCompatParcelizer", "()Lo/VisibilityChecker$RemoteActionCompatParcelizer;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass1 extends MagicModuleUseCase implements getCreatedOnDateMs<VisibilityChecker.RemoteActionCompatParcelizer> {
        private /* synthetic */ Fragment $IconCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final VisibilityChecker.RemoteActionCompatParcelizer invoke() {
            return this.$IconCompatParcelizer.requireActivity().getDefaultViewModelProviderFactory();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Fragment fragment) {
            super(0);
            this.$IconCompatParcelizer = fragment;
        }
    }

    /* JADX INFO: renamed from: o.StreetViewLifecycleDelegate$8, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/VisibilityChecker$RemoteActionCompatParcelizer;", "IconCompatParcelizer", "()Lo/VisibilityChecker$RemoteActionCompatParcelizer;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass8 extends MagicModuleUseCase implements getCreatedOnDateMs<VisibilityChecker.RemoteActionCompatParcelizer> {
        private /* synthetic */ Fragment $AudioAttributesCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final VisibilityChecker.RemoteActionCompatParcelizer invoke() {
            return this.$AudioAttributesCompatParcelizer.requireActivity().getDefaultViewModelProviderFactory();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass8(Fragment fragment) {
            super(0);
            this.$AudioAttributesCompatParcelizer = fragment;
        }
    }
}
