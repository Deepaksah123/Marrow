package kotlin;

import com.marrow.data.api.models.MarrowResponse;
import com.marrow.data.api.models.ResponseExtensionsKt;
import com.marrow.data.api.models.request.user.FetchTokenRequest;
import com.marrow.data.api.models.request.user.ProRequestBody;
import com.marrow.data.api.models.response.ApiResponse;
import com.marrow.data.api.models.response.user.LoggedUserResponse;
import com.marrow.data.api.models.response.user.ProResponse;
import com.marrow.data.models.common.ApplicationData;
import com.marrow.data.models.home.RecentUpdatesLastSyncedModel;
import com.marrow.data.models.user.LoggedUser;
import com.marrow.data.models.user.PhoneNumber;
import com.marrow.data.models.user.User;
import com.marrow.data.models.user.UserConfigResponse;

/* JADX INFO: loaded from: classes.dex */
public class getTrackOutputProvider implements getNextChunkIndex {
    private final getRepresentations AudioAttributesCompatParcelizer;
    private final setTreatLoadErrorsAsEndOfStream IconCompatParcelizer;
    private final ApplicationData RemoteActionCompatParcelizer;
    private final getStreamPositionUsForContent read;
    private final TrackGroupExternalSyntheticLambda0 write;

    @setSdkPayload
    public getTrackOutputProvider(setTreatLoadErrorsAsEndOfStream settreatloaderrorsasendofstream, TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0, ApplicationData applicationData, getStreamPositionUsForContent getstreampositionusforcontent, getRepresentations getrepresentations) {
        this.IconCompatParcelizer = settreatloaderrorsasendofstream;
        this.read = getstreampositionusforcontent;
        this.AudioAttributesCompatParcelizer = getrepresentations;
        this.write = trackGroupExternalSyntheticLambda0;
        this.RemoteActionCompatParcelizer = applicationData;
    }

    @Override // kotlin.getNextChunkIndex
    public final accessgetEmptyStatecp<MarrowResponse<ProResponse>> read(String str, PhoneNumber phoneNumber, String str2) {
        ProRequestBody proRequestBody = new ProRequestBody(this.read.onRemoveQueueItem(), str2);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" callback number: ");
        sb.append(phoneNumber.asSingleEntity());
        proRequestBody.message = sb.toString();
        proRequestBody.phonenNumber = phoneNumber.asSingleEntity();
        return ResponseExtensionsKt.toMarrowResponse(this.write.write(proRequestBody));
    }

    @Override // kotlin.getNextChunkIndex
    public final boolean AudioAttributesCompatParcelizer() {
        return !parseDolbyChannelConfiguration.AudioAttributesCompatParcelizer((CharSequence) this.read.AudioAttributesImplBaseParcelizer());
    }

    @Override // kotlin.getNextChunkIndex
    public final LoggedUser IconCompatParcelizer() {
        String strAudioAttributesImplBaseParcelizer = this.read.AudioAttributesImplBaseParcelizer();
        if (parseDolbyChannelConfiguration.AudioAttributesCompatParcelizer((CharSequence) strAudioAttributesImplBaseParcelizer)) {
            return null;
        }
        String strAudioAttributesImplApi21Parcelizer = this.read.AudioAttributesImplApi21Parcelizer();
        String strAudioAttributesCompatParcelizer = this.read.AudioAttributesCompatParcelizer(LoggedUserResponse.KEY_REFRESH_TOKEN);
        String strMediaBrowserCompatItemReceiver = this.read.MediaBrowserCompatItemReceiver();
        boolean zOnPlayFromSearch = this.read.onPlayFromSearch();
        boolean zMediaBrowserCompatCustomActionResultReceiver = this.read.MediaBrowserCompatCustomActionResultReceiver("email_verified");
        boolean zWrite = this.read.write(LoggedUserResponse.KEY_CONSENT_REQUIRED, false);
        long jMediaBrowserCompatItemReceiver = this.read.MediaBrowserCompatItemReceiver(LoggedUserResponse.KEY_CONSENT_DATE);
        int iAudioAttributesImplApi21Parcelizer = this.read.AudioAttributesImplApi21Parcelizer("key_course_id");
        int iAudioAttributesImplApi21Parcelizer2 = this.read.AudioAttributesImplApi21Parcelizer("default_edition_key");
        User userA_ = this.AudioAttributesCompatParcelizer.a_(strAudioAttributesImplBaseParcelizer);
        if (userA_ == null) {
            return null;
        }
        LoggedUser loggedUser = new LoggedUser(userA_);
        loggedUser.setRefreshToken(strAudioAttributesCompatParcelizer);
        loggedUser.setEmail(strMediaBrowserCompatItemReceiver);
        loggedUser.setToken(strAudioAttributesImplApi21Parcelizer);
        loggedUser.setEmailVerified(zMediaBrowserCompatCustomActionResultReceiver);
        loggedUser.setYearUpdateRequired(zOnPlayFromSearch);
        loggedUser.setTncConsentRequired(zWrite);
        loggedUser.setTncConsentDate(jMediaBrowserCompatItemReceiver);
        loggedUser.setDefaultCourseEdition(iAudioAttributesImplApi21Parcelizer2);
        loggedUser.setCourseId(iAudioAttributesImplApi21Parcelizer);
        return loggedUser;
    }

    @Override // kotlin.getNextChunkIndex
    public final void read(LoggedUser loggedUser) {
        this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(loggedUser.getInfo());
        this.read.write(loggedUser);
    }

    @Override // kotlin.getNextChunkIndex
    public final accessgetEmptyStatecp<ApiResponse<LoggedUserResponse>> write() {
        FetchTokenRequest fetchTokenRequest = new FetchTokenRequest();
        fetchTokenRequest.courseId = this.read.onRemoveQueueItem();
        fetchTokenRequest.userId = this.read.AudioAttributesImplBaseParcelizer();
        fetchTokenRequest.refreshToken = this.read.AudioAttributesCompatParcelizer(LoggedUserResponse.KEY_REFRESH_TOKEN);
        return this.write.RemoteActionCompatParcelizer(fetchTokenRequest).RemoteActionCompatParcelizer(new getSubjectTitle() { // from class: o.DataChunk
            @Override // kotlin.getSubjectTitle
            public final Object apply(Object obj) {
                return this.read.AudioAttributesCompatParcelizer((ApiResponse) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ApiResponse AudioAttributesCompatParcelizer(ApiResponse apiResponse) throws Exception {
        if (apiResponse.hasData()) {
            this.RemoteActionCompatParcelizer.updateUserTable(LoggedUserResponse.getLoggedUser((LoggedUserResponse) apiResponse.data.data));
        }
        return apiResponse;
    }

    @Override // kotlin.getNextChunkIndex
    public final accessgetEmptyStatecp<MarrowResponse<RecentUpdatesLastSyncedModel>> RemoteActionCompatParcelizer() {
        return this.write.AudioAttributesCompatParcelizer().RemoteActionCompatParcelizer(new withSkippedAd()).read(new withResetAdGroup());
    }

    @Override // kotlin.getNextChunkIndex
    public final void IconCompatParcelizer(String str) {
        this.AudioAttributesCompatParcelizer.write(3, str);
    }

    @Override // kotlin.getNextChunkIndex
    public final LessonDynamicResponseBody<MarrowResponse<UserConfigResponse>> read() {
        return this.write.IconCompatParcelizer().read(new withSkippedAd()).write(new withResetAdGroup());
    }
}
