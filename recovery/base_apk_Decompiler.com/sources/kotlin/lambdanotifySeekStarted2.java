package kotlin;

import java.util.UUID;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lo/lambdanotifySeekStarted2;", "", "<init>", "()V", "Lkotlin/Function1;", "", "IconCompatParcelizer", "()Lo/getAnswerMap;", "write", "()Ljava/lang/String;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class lambdanotifySeekStarted2 {
    public static final lambdanotifySeekStarted2 INSTANCE = new lambdanotifySeekStarted2();

    private lambdanotifySeekStarted2() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String AudioAttributesCompatParcelizer(String str) {
        UUID uuidNameUUIDFromBytes;
        String string;
        toMagicModuleMetaRepoModel.write(str, "");
        try {
            byte[] bytes = str.getBytes(getSubmissionTimestamp.IconCompatParcelizer);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(bytes, "");
            uuidNameUUIDFromBytes = UUID.nameUUIDFromBytes(bytes);
        } catch (InternalError unused) {
            str.hashCode();
            uuidNameUUIDFromBytes = null;
        }
        return (uuidNameUUIDFromBytes == null || (string = uuidNameUUIDFromBytes.toString()) == null) ? String.valueOf(str.hashCode()) : string;
    }

    public static String write() {
        getAnswerMap<String, String> getanswermapIconCompatParcelizer = IconCompatParcelizer();
        String strValueOf = String.valueOf(System.currentTimeMillis());
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strValueOf, "");
        return getanswermapIconCompatParcelizer.invoke(strValueOf);
    }

    public static getAnswerMap<String, String> IconCompatParcelizer() {
        return new getAnswerMap() { // from class: o.generateReadingMediaPeriodEventTime
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return lambdanotifySeekStarted2.AudioAttributesCompatParcelizer((String) obj);
            }
        };
    }
}
