package kotlin;

import com.marrow.data.models.user.UserConfigResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006À\u0006\u0003"}, d2 = {"Lo/getDataHolder;", "", "Lcom/marrow/data/models/user/UserConfigResponse;", "p0", "", "read", "(Lcom/marrow/data/models/user/UserConfigResponse;)V"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface getDataHolder {

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.read;

    void read(UserConfigResponse p0);

    /* JADX INFO: renamed from: o.getDataHolder$read, reason: from kotlin metadata */
    public static final class Companion {
        static final /* synthetic */ Companion read = new Companion();

        private Companion() {
        }
    }
}
