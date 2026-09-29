package kotlin;

import com.marrow.data.models.custommodule.FilterParams;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\"\u0010\u0006\u001a\u00020\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u0005"}, d2 = {"Lo/CmcdHeadersFactoryStreamType;", "", "", "p0", "<init>", "(Ljava/lang/String;)V", FilterParams.KEY_COURSE_ID, "Ljava/lang/String;", "getCourse_id", "()Ljava/lang/String;", "setCourse_id"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class CmcdHeadersFactoryStreamType {
    public static final int $stable = 8;
    private String course_id;

    public CmcdHeadersFactoryStreamType(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.course_id = str;
    }

    public final String getCourse_id() {
        return this.course_id;
    }

    public final void setCourse_id(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.course_id = str;
    }
}
