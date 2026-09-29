package kotlin;

import com.marrow.data.api.models.MarrowResponse;
import com.marrow.data.api.models.response.common.KycResponseBody;
import com.marrow.data.models.common.ImageUpload;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \r2\u00020\u0001:\u0001\rJ#\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0003\u001a\u00020\u0006H&¢\u0006\u0004\b\u000b\u0010\fÀ\u0006\u0003"}, d2 = {"Lo/withAvailableAdUri;", "", "", "p0", "Lo/accessgetEmptyStatecp;", "", "Lcom/marrow/data/models/common/ImageUpload;", "AudioAttributesCompatParcelizer", "()Lo/accessgetEmptyStatecp;", "Lcom/marrow/data/api/models/MarrowResponse;", "Lcom/marrow/data/api/models/response/common/KycResponseBody;", "RemoteActionCompatParcelizer", "(Lcom/marrow/data/models/common/ImageUpload;)Lcom/marrow/data/api/models/MarrowResponse;", "write"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface withAvailableAdUri {

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.write;

    accessgetEmptyStatecp<List<ImageUpload>> AudioAttributesCompatParcelizer();

    MarrowResponse<KycResponseBody> RemoteActionCompatParcelizer(ImageUpload p0);

    /* JADX INFO: renamed from: o.withAvailableAdUri$write, reason: from kotlin metadata */
    public static final class Companion {
        static final /* synthetic */ Companion write = new Companion();

        private Companion() {
        }
    }
}
