package kotlin;

import java.util.List;
import java.util.Set;
import kotlin.toHomeLessonIndex;

/* JADX INFO: loaded from: classes4.dex */
public final class incrementCorrect extends getTotalCount {
    private final toHomeLessonIndex.RemoteActionCompatParcelizer read;

    /* JADX WARN: Illegal instructions before constructor call */
    public incrementCorrect(toHomeLessonIndex.RemoteActionCompatParcelizer remoteActionCompatParcelizer, String[] strArr) {
        Set setOnPlayFromUri;
        toMagicModuleMetaRepoModel.write(remoteActionCompatParcelizer, "");
        toMagicModuleMetaRepoModel.write(strArr, "");
        List<Integer> listAudioAttributesCompatParcelizer = remoteActionCompatParcelizer.AudioAttributesCompatParcelizer();
        if (listAudioAttributesCompatParcelizer.isEmpty()) {
            setOnPlayFromUri = getKycMessage.read();
        } else {
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(listAudioAttributesCompatParcelizer, "");
            setOnPlayFromUri = IntermediateLoginResponseBody.onPlayFromUri(listAudioAttributesCompatParcelizer);
        }
        List<toHomeLessonIndex.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer> listWrite = remoteActionCompatParcelizer.write();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(listWrite, "");
        super(strArr, setOnPlayFromUri, getTotalARQBankCount.read(listWrite));
        this.read = remoteActionCompatParcelizer;
    }
}
