package kotlin;

import com.marrow.data.api.models.MarrowResponse;
import com.marrow.data.api.models.response.ApiResponse;
import com.marrow.data.api.models.response.user.LoggedUserResponse;
import com.marrow.data.api.models.response.user.ProResponse;
import com.marrow.data.models.home.RecentUpdatesLastSyncedModel;
import com.marrow.data.models.user.LoggedUser;
import com.marrow.data.models.user.PhoneNumber;
import com.marrow.data.models.user.UserConfigResponse;

/* JADX INFO: loaded from: classes.dex */
public interface getNextChunkIndex {
    boolean AudioAttributesCompatParcelizer();

    LoggedUser IconCompatParcelizer();

    void IconCompatParcelizer(String str);

    accessgetEmptyStatecp<MarrowResponse<RecentUpdatesLastSyncedModel>> RemoteActionCompatParcelizer();

    LessonDynamicResponseBody<MarrowResponse<UserConfigResponse>> read();

    accessgetEmptyStatecp<MarrowResponse<ProResponse>> read(String str, PhoneNumber phoneNumber, String str2);

    void read(LoggedUser loggedUser);

    accessgetEmptyStatecp<ApiResponse<LoggedUserResponse>> write();
}
