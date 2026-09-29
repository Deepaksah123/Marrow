package kotlin;

import java.io.File;
import java.io.IOException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0016\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0013\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\u0006\n\u0004\b\u000b\u0010\r"}, d2 = {"Lo/MagicModuleRemote;", "Ljava/io/IOException;", "Ljava/io/File;", "p0", "p1", "", "p2", "<init>", "(Ljava/io/File;Ljava/io/File;Ljava/lang/String;)V", "IconCompatParcelizer", "Ljava/io/File;", "RemoteActionCompatParcelizer", "read", "Ljava/lang/String;", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class MagicModuleRemote extends IOException {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final File RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final String AudioAttributesCompatParcelizer;
    private final File read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MagicModuleRemote(File file, File file2, String str) {
        super(MagicModuleLSModelsKt.AudioAttributesCompatParcelizer(file, file2, str));
        toMagicModuleMetaRepoModel.write(file, "");
        this.RemoteActionCompatParcelizer = file;
        this.read = file2;
        this.AudioAttributesCompatParcelizer = str;
    }
}
