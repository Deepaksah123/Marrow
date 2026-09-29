package kotlin;

import android.content.Context;
import com.marrow.data.api.models.MarrowError;
import com.marrow.data.api.models.MarrowResponse;
import com.marrow.data.api.models.ResponseExtensionsKt;
import com.marrow.data.api.models.request.user.SaveProfileRequestBody;
import com.marrow.data.api.models.response.ApiResponse;
import com.marrow.data.api.models.response.user.LoggedUserResponse;
import com.marrow.data.models.common.ApplicationData;
import com.marrow.data.models.user.Country;
import com.marrow.data.models.user.LoggedUser;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class parseOptionalDoubleAttr implements parseOptionalIntAttr {
    private final getStreamPositionUsForContent AudioAttributesCompatParcelizer;
    private final computePeriodTimeOffsets IconCompatParcelizer;
    private final TrackGroupExternalSyntheticLambda0 MediaBrowserCompatCustomActionResultReceiver;
    private final Context RemoteActionCompatParcelizer;
    private final ApplicationData read;
    private final getNextChunkIndex write;

    public parseOptionalDoubleAttr(Context context, ApplicationData applicationData, computePeriodTimeOffsets computeperiodtimeoffsets, TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0, getStreamPositionUsForContent getstreampositionusforcontent, getNextChunkIndex getnextchunkindex) {
        this.IconCompatParcelizer = computeperiodtimeoffsets;
        this.MediaBrowserCompatCustomActionResultReceiver = trackGroupExternalSyntheticLambda0;
        this.RemoteActionCompatParcelizer = context;
        this.read = applicationData;
        this.AudioAttributesCompatParcelizer = getstreampositionusforcontent;
        this.write = getnextchunkindex;
    }

    @Override // kotlin.parseOptionalIntAttr
    public final accessgetEmptyStatecp<MarrowResponse<LoggedUser>> AudioAttributesCompatParcelizer(LoggedUser loggedUser) {
        return RemoteActionCompatParcelizer(loggedUser, null);
    }

    private accessgetEmptyStatecp<MarrowResponse<LoggedUser>> RemoteActionCompatParcelizer(final LoggedUser loggedUser, String str) {
        SaveProfileRequestBody saveProfileModel = SaveProfileRequestBody.getSaveProfileModel(loggedUser);
        saveProfileModel.setProfilePic(null);
        return this.MediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer(loggedUser.getInfo().getId(), saveProfileModel).RemoteActionCompatParcelizer(new getSubjectTitle() { // from class: o.parseRoleFlags
            @Override // kotlin.getSubjectTitle
            public final Object apply(Object obj) {
                return this.AudioAttributesCompatParcelizer.IconCompatParcelizer(loggedUser, (ApiResponse) obj);
            }
        }).read(new parseServerControl());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ MarrowResponse IconCompatParcelizer(LoggedUser loggedUser, ApiResponse apiResponse) throws Exception {
        LoggedUser loggedUser2 = LoggedUserResponse.getLoggedUser((LoggedUserResponse) apiResponse.data.data);
        if (loggedUser2 != null) {
            loggedUser2.setToken(loggedUser.getToken());
            write(loggedUser2);
            this.read.onProfileUpdated(false);
        }
        return ResponseExtensionsKt.asMarrowResponse(ApiResponse.create(loggedUser2));
    }

    @Override // kotlin.parseOptionalIntAttr
    public final accessgetEmptyStatecp<MarrowResponse<Country[]>> read() {
        return this.MediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer().RemoteActionCompatParcelizer(new getSubjectTitle() { // from class: o.parseMultivariantPlaylist
            @Override // kotlin.getSubjectTitle
            public final Object apply(Object obj) {
                return ResponseExtensionsKt.asMarrowResponse((ApiResponse) obj);
            }
        }).read(new parseServerControl());
    }

    private void write(LoggedUser loggedUser) {
        this.write.read(loggedUser);
    }

    public static /* synthetic */ MarrowError write(Throwable th) {
        return new MarrowError(th);
    }
}
