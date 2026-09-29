package kotlin;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.marrow.data.models.common.CourseConfigV2;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\b\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lo/copyWithFileAndLastTouchTimestamp;", "", "<init>", "()V", "", "p0", "Lcom/marrow/data/models/common/CourseConfigV2;", "Lcom/marrow2/data/pref/repo/model/CourseConfigV2RepoModel;", "IconCompatParcelizer", "(Ljava/lang/String;)Lcom/marrow/data/models/common/CourseConfigV2;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class copyWithFileAndLastTouchTimestamp {
    public static final copyWithFileAndLastTouchTimestamp INSTANCE = new copyWithFileAndLastTouchTimestamp();

    private copyWithFileAndLastTouchTimestamp() {
    }

    public static CourseConfigV2 IconCompatParcelizer(String p0) throws JsonProcessingException {
        toMagicModuleMetaRepoModel.write(p0, "");
        Object value = new ObjectMapper().readValue(p0, (Class<Object>) CourseConfigV2.class);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(value, "");
        return (CourseConfigV2) value;
    }
}
