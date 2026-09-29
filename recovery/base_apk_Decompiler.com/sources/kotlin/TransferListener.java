package kotlin;

import com.marrow.data.api.models.response.lesson.InteractiveVideoElementLSModel;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface TransferListener {
    Object RemoteActionCompatParcelizer(List<InteractiveVideoElementLSModel> list);

    Object write(String str);
}
