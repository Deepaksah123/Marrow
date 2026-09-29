package kotlin;

import com.marrow.R;
import com.marrow.data.api.models.Failed;
import com.marrow.data.api.models.MarrowError;
import com.marrow.data.api.models.MarrowResponse;
import com.marrow.data.api.models.Success;
import com.marrow.data.api.models.response.ApiResponse;
import com.marrow.data.models.common.ApplicationData;
import com.marrow.data.models.user.LoggedUser;
import kotlin.Metadata;
import kotlin.SsManifest;
import kotlin.getSampleFormats;
import kotlin.getSelectedIndexInTrackGroup;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u0000 \u001a2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u001aBQ\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0004\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001c\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010!R\u0014\u0010\u001a\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#"}, d2 = {"Lo/setLivePresentationDelayMs;", "Lo/isRtspStartLine;", "Lo/SsManifest$AudioAttributesCompatParcelizer;", "Lo/SsManifest$IconCompatParcelizer;", "p0", "Lo/parseLongAttr;", "p1", "Lo/endsWithLivePostrollPlaceHolder;", "p2", "Lo/getIds;", "p3", "p4", "Lo/getStreamPositionUsForContent;", "p5", "Lo/parseOptionalIntAttr;", "p6", "Lcom/marrow/data/models/common/ApplicationData;", "p7", "Lo/getSampleFormats;", "p8", "<init>", "(Lo/SsManifest$AudioAttributesCompatParcelizer;Lo/parseLongAttr;Lo/endsWithLivePostrollPlaceHolder;Lo/getIds;Lo/getIds;Lo/getStreamPositionUsForContent;Lo/parseOptionalIntAttr;Lcom/marrow/data/models/common/ApplicationData;Lo/getSampleFormats;)V", "", "AudioAttributesImplApi21Parcelizer", "()V", "", "AudioAttributesCompatParcelizer", "(Ljava/lang/String;)V", "write", "Lo/getStreamPositionUsForContent;", "read", "AudioAttributesImplApi26Parcelizer", "Lo/parseOptionalIntAttr;", "Lcom/marrow/data/models/common/ApplicationData;", "IconCompatParcelizer", "Lo/getSampleFormats;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class setLivePresentationDelayMs extends isRtspStartLine<SsManifest.AudioAttributesCompatParcelizer> implements SsManifest.IconCompatParcelizer {

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final parseOptionalIntAttr write;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final getSampleFormats AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final ApplicationData IconCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final getStreamPositionUsForContent read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @setSdkPayload
    public setLivePresentationDelayMs(SsManifest.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, parseLongAttr parselongattr, endsWithLivePostrollPlaceHolder endswithlivepostrollplaceholder, getIds getids, getIds getids2, getStreamPositionUsForContent getstreampositionusforcontent, parseOptionalIntAttr parseoptionalintattr, ApplicationData applicationData, getSampleFormats getsampleformats) {
        super(parselongattr, endswithlivepostrollplaceholder, getids, getids2, audioAttributesCompatParcelizer);
        toMagicModuleMetaRepoModel.write(audioAttributesCompatParcelizer, "");
        toMagicModuleMetaRepoModel.write(parselongattr, "");
        toMagicModuleMetaRepoModel.write(endswithlivepostrollplaceholder, "");
        toMagicModuleMetaRepoModel.write(getids, "");
        toMagicModuleMetaRepoModel.write(getids2, "");
        toMagicModuleMetaRepoModel.write(getstreampositionusforcontent, "");
        toMagicModuleMetaRepoModel.write(parseoptionalintattr, "");
        toMagicModuleMetaRepoModel.write(applicationData, "");
        toMagicModuleMetaRepoModel.write(getsampleformats, "");
        this.read = getstreampositionusforcontent;
        this.write = parseoptionalintattr;
        this.IconCompatParcelizer = applicationData;
        this.AudioAttributesCompatParcelizer = getsampleformats;
    }

    @Override // kotlin.isRtspStartLine, kotlin.getExtendedEsFrChar
    public final void AudioAttributesImplApi21Parcelizer() {
        super.AudioAttributesImplApi21Parcelizer();
        getSampleFormats getsampleformats = this.AudioAttributesCompatParcelizer;
        getSampleFormats.Companion companion = getSampleFormats.INSTANCE;
        if (getsampleformats.RemoteActionCompatParcelizer(getSampleFormats.Companion.onAddQueueItem()).length() == 0) {
            ((SsManifest.AudioAttributesCompatParcelizer) this.RemoteActionCompatParcelizer).write("2023");
            return;
        }
        SsManifest.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = (SsManifest.AudioAttributesCompatParcelizer) this.RemoteActionCompatParcelizer;
        getSampleFormats getsampleformats2 = this.AudioAttributesCompatParcelizer;
        getSampleFormats.Companion companion2 = getSampleFormats.INSTANCE;
        audioAttributesCompatParcelizer.write(getsampleformats2.RemoteActionCompatParcelizer(getSampleFormats.Companion.onAddQueueItem()));
    }

    @Override // o.SsManifest.IconCompatParcelizer
    public final void AudioAttributesCompatParcelizer(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (p0.length() == 0) {
            ((SsManifest.AudioAttributesCompatParcelizer) this.RemoteActionCompatParcelizer).AudioAttributesCompatParcelizer(read(R.string.toast_year_empty));
            return;
        }
        LoggedUser loggedUser = this.IconCompatParcelizer.getLoggedUser();
        if (loggedUser == null) {
            return;
        }
        loggedUser.getInfo().getCollege().setYearOfAdmission(p0);
        loggedUser.getInfo().getCollege().setMbbsVerificationYear(this.AudioAttributesCompatParcelizer.read("mbbs_verification_prod"));
        accessgetEmptyStatecp<MarrowResponse<LoggedUser>> accessgetemptystatecpAudioAttributesCompatParcelizer = this.write.AudioAttributesCompatParcelizer(loggedUser);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(accessgetemptystatecpAudioAttributesCompatParcelizer, "");
        read(accessgetemptystatecpAudioAttributesCompatParcelizer, new getAnswerMap() { // from class: o.SsMediaSourceFactory
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return setLivePresentationDelayMs.IconCompatParcelizer(this.write, (MarrowResponse) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(setLivePresentationDelayMs setlivepresentationdelayms, MarrowResponse marrowResponse) {
        if (marrowResponse instanceof Success) {
            setlivepresentationdelayms.read.menuHostHelperlambda0();
            ((SsManifest.AudioAttributesCompatParcelizer) setlivepresentationdelayms.RemoteActionCompatParcelizer).AudioAttributesCompatParcelizer(setlivepresentationdelayms.read(R.string.college_year_update_success));
            getSelectedIndexInTrackGroup.Companion audioAttributesCompatParcelizer = getSelectedIndexInTrackGroup.INSTANCE;
            getSelectedIndexInTrackGroup.Companion.IconCompatParcelizer("success");
            ((SsManifest.AudioAttributesCompatParcelizer) setlivepresentationdelayms.RemoteActionCompatParcelizer).onCustomAction();
        } else if (marrowResponse instanceof Failed) {
            ((SsManifest.AudioAttributesCompatParcelizer) setlivepresentationdelayms.RemoteActionCompatParcelizer).write(((Failed) marrowResponse).getError());
            getSelectedIndexInTrackGroup.Companion audioAttributesCompatParcelizer2 = getSelectedIndexInTrackGroup.INSTANCE;
            getSelectedIndexInTrackGroup.Companion.IconCompatParcelizer(ApiResponse.STATUS_FAILURE);
        } else {
            if (!(marrowResponse instanceof MarrowError)) {
                throw new RenewEligibleCreator();
            }
            setlivepresentationdelayms.RemoteActionCompatParcelizer(((MarrowError) marrowResponse).getThrowable(), "update_college_year");
            getSelectedIndexInTrackGroup.Companion audioAttributesCompatParcelizer3 = getSelectedIndexInTrackGroup.INSTANCE;
            getSelectedIndexInTrackGroup.Companion.IconCompatParcelizer("error");
        }
        return getShowPopup.INSTANCE;
    }
}
