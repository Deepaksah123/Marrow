package kotlin;

import kotlin.Metadata;
import kotlin.VisibilityChecker;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\n\u001a\u00028\u0000\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lo/getRecordFields;", "Lo/VisibilityChecker$RemoteActionCompatParcelizer;", "<init>", "()V", "Lo/POJOPropertyBuilderWithMember;", "T", "Lo/isHdPlaybackError;", "p0", "Lo/withFieldVisibility;", "p1", "AudioAttributesCompatParcelizer", "(Lo/isHdPlaybackError;Lo/withFieldVisibility;)Lo/POJOPropertyBuilderWithMember;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getRecordFields implements VisibilityChecker.RemoteActionCompatParcelizer {
    public static final getRecordFields INSTANCE = new getRecordFields();

    private getRecordFields() {
    }

    @Override // o.VisibilityChecker.RemoteActionCompatParcelizer
    public final <T extends POJOPropertyBuilderWithMember> T AudioAttributesCompatParcelizer(isHdPlaybackError<T> p0, withFieldVisibility p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        JsonMapperBuilder jsonMapperBuilder = JsonMapperBuilder.INSTANCE;
        return (T) JsonMapperBuilder.read(MagicModuleFeedbackRequestBody.IconCompatParcelizer(p0));
    }
}
