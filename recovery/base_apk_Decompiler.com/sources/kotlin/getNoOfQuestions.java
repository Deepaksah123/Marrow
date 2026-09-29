package kotlin;

import java.io.IOException;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u0002\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001c\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\r2\b\b\u0002\u0010\u000e\u001a\u00020\u0005R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\u000f"}, d2 = {"Lorg/dailyrounds/crypto/exception/FontException;", "Ljava/io/IOException;", "childException", "", "url", "", "errorMsg", "<init>", "(Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "getErrorMsg", "toAnalyticMap", "", "tag", "crypto_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class getNoOfQuestions extends IOException {
    private final String IconCompatParcelizer;
    private final String read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private getNoOfQuestions(Throwable th, String str, String str2) {
        super(th);
        toMagicModuleMetaRepoModel.write(th, "");
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        this.read = str;
        this.IconCompatParcelizer = str2;
    }

    public /* synthetic */ getNoOfQuestions(Throwable th, String str, String str2, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(th, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "FONT_FAILURE" : str2);
    }

    public final Map<String, String> IconCompatParcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        Map mapRemoteActionCompatParcelizer = VideoTimelineResponseBody.RemoteActionCompatParcelizer();
        mapRemoteActionCompatParcelizer.put("url", TestGroupLSModel.RemoteActionCompatParcelizer(this.read, 40));
        mapRemoteActionCompatParcelizer.put("tag", str);
        mapRemoteActionCompatParcelizer.putAll(VideoTimelineResponseBody.AudioAttributesCompatParcelizer(mapRemoteActionCompatParcelizer));
        return VideoTimelineResponseBody.read(mapRemoteActionCompatParcelizer);
    }
}
