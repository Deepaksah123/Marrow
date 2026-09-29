package kotlin;

import com.marrow.data.models.common.ImageUpload;
import com.marrow.data.models.user.LoggedUser;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public interface withAdLoadError {
    accessgetEmptyStatecp<List<ImageUpload>> IconCompatParcelizer(int i);

    void RemoteActionCompatParcelizer(long j);

    void RemoteActionCompatParcelizer(LoggedUser loggedUser);

    String read(String str);

    LoggedUser write();
}
