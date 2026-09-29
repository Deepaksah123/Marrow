package com.marrow2.ui.signup.college.college_list.viewmodel;

import com.marrow2.ui.signup.college.college_list.viewmodel.CollegeSelectionViewModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.CmcdHeadersFactoryCmcdObjectBuilder;
import kotlin.IntermediateLoginResponseBody;
import kotlin.MagicModuleSubmissionRequestBody;
import kotlin.Metadata;
import kotlin.POJOPropertyBuilderWithMember;
import kotlin.QBankStatsResponse;
import kotlin.RenewEligibleCreator;
import kotlin.SampleVideos;
import kotlin.SdkPayloadData;
import kotlin.TestGroupLSModel;
import kotlin.TypeResolutionContextBasic;
import kotlin.VerifyNewNumberRequest;
import kotlin.fromPath;
import kotlin.getAnswerMap;
import kotlin.getMagicModuleStats;
import kotlin.getResolutionSize;
import kotlin.getShowPopup;
import kotlin.getStreetViewPanorama;
import kotlin.getStreetViewPanoramaLocation;
import kotlin.getYear;
import kotlin.peekChar;
import kotlin.peekUnsignedByte;
import kotlin.setPositionWithSource;
import kotlin.setSdkPayload;
import kotlin.setStartTime;
import kotlin.setUpdatedStatus;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\n*\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\u0003\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001bR\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001c8\u0007¢\u0006\f\n\u0004\b\u0012\u0010\u001d\u001a\u0004\b\r\u0010\u001eR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u00198\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001bR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00100\u001c8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b\u0012\u0010\u001eR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u00198\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001bR \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020 0\u001c8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b\b\u0010\u001eR\u001c\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\f0\n8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\""}, d2 = {"Lcom/marrow2/ui/signup/college/college_list/viewmodel/CollegeSelectionViewModel;", "Lo/POJOPropertyBuilderWithMember;", "Lo/peekChar;", "p0", "<init>", "(Lo/peekChar;)V", "Lo/setPositionWithSource;", "", "IconCompatParcelizer", "(Lo/setPositionWithSource;)V", "", "Lo/peekUnsignedByte;", "Lo/fromPath;", "AudioAttributesCompatParcelizer", "(Ljava/util/List;)Ljava/util/List;", "", "", "p1", "read", "(Ljava/lang/String;Z)V", "write", "(Ljava/lang/String;)Ljava/util/List;", "MediaBrowserCompatCustomActionResultReceiver", "Lo/peekChar;", "RemoteActionCompatParcelizer", "Lo/getResolutionSize;", "Lo/getStreetViewPanoramaLocation;", "Lo/getResolutionSize;", "Lo/setUpdatedStatus;", "Lo/setUpdatedStatus;", "()Lo/setUpdatedStatus;", "AudioAttributesImplApi26Parcelizer", "Lo/getStreetViewPanorama;", "AudioAttributesImplApi21Parcelizer", "Ljava/util/List;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CollegeSelectionViewModel extends POJOPropertyBuilderWithMember {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final getResolutionSize<Boolean> write;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final setUpdatedStatus<getStreetViewPanorama> MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final setUpdatedStatus<Boolean> IconCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final getResolutionSize<getStreetViewPanoramaLocation> AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final peekChar RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final getResolutionSize<getStreetViewPanorama> AudioAttributesImplApi21Parcelizer;
    private final setUpdatedStatus<getStreetViewPanoramaLocation> read;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private List<fromPath> AudioAttributesImplApi26Parcelizer;

    @setSdkPayload
    public CollegeSelectionViewModel(peekChar peekchar) {
        toMagicModuleMetaRepoModel.write(peekchar, "");
        this.RemoteActionCompatParcelizer = peekchar;
        getResolutionSize<getStreetViewPanoramaLocation> getresolutionsizeRemoteActionCompatParcelizer = setStartTime.RemoteActionCompatParcelizer(new getStreetViewPanoramaLocation(null, null, null, null, null, 31, null));
        this.AudioAttributesCompatParcelizer = getresolutionsizeRemoteActionCompatParcelizer;
        this.read = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer);
        getResolutionSize<Boolean> getresolutionsizeRemoteActionCompatParcelizer2 = setStartTime.RemoteActionCompatParcelizer(Boolean.FALSE);
        this.write = getresolutionsizeRemoteActionCompatParcelizer2;
        this.IconCompatParcelizer = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer2);
        getResolutionSize<getStreetViewPanorama> getresolutionsizeRemoteActionCompatParcelizer3 = setStartTime.RemoteActionCompatParcelizer(getStreetViewPanorama.read.INSTANCE);
        this.AudioAttributesImplApi21Parcelizer = getresolutionsizeRemoteActionCompatParcelizer3;
        this.MediaBrowserCompatCustomActionResultReceiver = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer3);
        this.AudioAttributesImplApi26Parcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
    }

    public final setUpdatedStatus<getStreetViewPanoramaLocation> AudioAttributesCompatParcelizer() {
        return this.read;
    }

    public final setUpdatedStatus<Boolean> read() {
        return this.IconCompatParcelizer;
    }

    public final setUpdatedStatus<getStreetViewPanorama> IconCompatParcelizer() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final void IconCompatParcelizer(setPositionWithSource p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, setPositionWithSource.RemoteActionCompatParcelizer.INSTANCE)) {
            return;
        }
        if (p0 instanceof setPositionWithSource.IconCompatParcelizer) {
            fromPath frompath = this.AudioAttributesCompatParcelizer.IconCompatParcelizer().AudioAttributesCompatParcelizer().get(((setPositionWithSource.IconCompatParcelizer) p0).read());
            getResolutionSize<getStreetViewPanoramaLocation> getresolutionsize = this.AudioAttributesCompatParcelizer;
            getresolutionsize.write(getStreetViewPanoramaLocation.RemoteActionCompatParcelizer(getresolutionsize.IconCompatParcelizer(), null, null, null, frompath.AudioAttributesCompatParcelizer(), frompath.IconCompatParcelizer(), 7));
            this.AudioAttributesImplApi21Parcelizer.write(new getStreetViewPanorama.write(this.AudioAttributesCompatParcelizer.IconCompatParcelizer()));
            return;
        }
        if (p0 instanceof setPositionWithSource.write) {
            setPositionWithSource.write writeVar = (setPositionWithSource.write) p0;
            List<fromPath> listWrite = write(writeVar.AudioAttributesCompatParcelizer());
            getResolutionSize<getStreetViewPanoramaLocation> getresolutionsize2 = this.AudioAttributesCompatParcelizer;
            getresolutionsize2.write(getStreetViewPanoramaLocation.RemoteActionCompatParcelizer(getresolutionsize2.IconCompatParcelizer(), writeVar.AudioAttributesCompatParcelizer(), listWrite, null, null, null, 28));
            return;
        }
        if (!(p0 instanceof setPositionWithSource.AudioAttributesCompatParcelizer)) {
            throw new RenewEligibleCreator();
        }
        setPositionWithSource.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = (setPositionWithSource.AudioAttributesCompatParcelizer) p0;
        read(audioAttributesCompatParcelizer.RemoteActionCompatParcelizer(), audioAttributesCompatParcelizer.IconCompatParcelizer());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static List<fromPath> AudioAttributesCompatParcelizer(List<peekUnsignedByte> list) {
        List<peekUnsignedByte> list2 = list;
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list2, 10));
        for (peekUnsignedByte peekunsignedbyte : list2) {
            arrayList.add(new fromPath(peekunsignedbyte.getIconCompatParcelizer(), peekunsignedbyte.getWrite()));
        }
        return arrayList;
    }

    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private Object AudioAttributesCompatParcelizer;
        private /* synthetic */ String IconCompatParcelizer;
        private Object RemoteActionCompatParcelizer;
        private int read;
        private /* synthetic */ boolean write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            CollegeSelectionViewModel collegeSelectionViewModel;
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                CollegeSelectionViewModel.this.write.write(QBankStatsResponse.AudioAttributesCompatParcelizer(true));
                CollegeSelectionViewModel collegeSelectionViewModel2 = CollegeSelectionViewModel.this;
                this.AudioAttributesCompatParcelizer = collegeSelectionViewModel2;
                this.RemoteActionCompatParcelizer = collegeSelectionViewModel2;
                this.read = 1;
                Object objAudioAttributesCompatParcelizer = collegeSelectionViewModel2.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(this.IconCompatParcelizer, this.write, this);
                if (objAudioAttributesCompatParcelizer == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
                collegeSelectionViewModel = collegeSelectionViewModel2;
                obj = objAudioAttributesCompatParcelizer;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                collegeSelectionViewModel = (CollegeSelectionViewModel) this.AudioAttributesCompatParcelizer;
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            collegeSelectionViewModel.AudioAttributesImplApi26Parcelizer = CollegeSelectionViewModel.AudioAttributesCompatParcelizer((List<peekUnsignedByte>) obj);
            CollegeSelectionViewModel.this.write.write(QBankStatsResponse.AudioAttributesCompatParcelizer(false));
            if (CollegeSelectionViewModel.this.AudioAttributesImplApi26Parcelizer.isEmpty()) {
                CollegeSelectionViewModel.this.AudioAttributesImplApi21Parcelizer.write(getStreetViewPanorama.IconCompatParcelizer.INSTANCE);
            }
            CollegeSelectionViewModel.this.AudioAttributesCompatParcelizer.write(getStreetViewPanoramaLocation.RemoteActionCompatParcelizer((getStreetViewPanoramaLocation) CollegeSelectionViewModel.this.AudioAttributesCompatParcelizer.IconCompatParcelizer(), null, CollegeSelectionViewModel.this.AudioAttributesImplApi26Parcelizer, null, null, null, 29));
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        RemoteActionCompatParcelizer(String str, boolean z, SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(1, sampleVideos);
            this.IconCompatParcelizer = str;
            this.write = z;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return CollegeSelectionViewModel.this.new RemoteActionCompatParcelizer(this.IconCompatParcelizer, this.write, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void read(String p0, boolean p1) {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new RemoteActionCompatParcelizer(p0, p1, null), new MagicModuleSubmissionRequestBody() { // from class: o.IStreetViewPanoramaFragmentDelegate
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return CollegeSelectionViewModel.AudioAttributesCompatParcelizer(this.IconCompatParcelizer, ((Integer) obj).intValue(), (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(CollegeSelectionViewModel collegeSelectionViewModel, int i, String str) {
        getStreetViewPanorama.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.write(str, "");
        collegeSelectionViewModel.write.write(Boolean.FALSE);
        getResolutionSize<getStreetViewPanorama> getresolutionsize = collegeSelectionViewModel.AudioAttributesImplApi21Parcelizer;
        if (i == 502) {
            audioAttributesCompatParcelizer = getStreetViewPanorama.RemoteActionCompatParcelizer.INSTANCE;
        } else {
            audioAttributesCompatParcelizer = new getStreetViewPanorama.AudioAttributesCompatParcelizer(str);
        }
        getresolutionsize.write(audioAttributesCompatParcelizer);
        return getShowPopup.INSTANCE;
    }

    private final List<fromPath> write(String p0) {
        List<fromPath> list = this.AudioAttributesImplApi26Parcelizer;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            String lowerCase = ((fromPath) obj).IconCompatParcelizer().toLowerCase(Locale.ROOT);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lowerCase, "");
            String lowerCase2 = p0.toLowerCase(Locale.ROOT);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lowerCase2, "");
            if (TestGroupLSModel.write((CharSequence) lowerCase, (CharSequence) lowerCase2, false)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
