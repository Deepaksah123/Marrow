package kotlin;

import java.util.TimeZone;

/* JADX INFO: loaded from: classes2.dex */
public final class inputFramesToDurationUs extends MagicModuleUseCase implements getAnswerMap {
    public static final inputFramesToDurationUs IconCompatParcelizer = new inputFramesToDurationUs();

    public inputFramesToDurationUs() {
        super(1);
    }

    @Override // kotlin.getAnswerMap
    public final Object invoke(Object obj) {
        TimeZone timeZone = TimeZone.getDefault();
        toMagicModuleMetaRepoModel.write(timeZone);
        String id = timeZone.getID();
        toMagicModuleMetaRepoModel.write((Object) id);
        return id;
    }
}
