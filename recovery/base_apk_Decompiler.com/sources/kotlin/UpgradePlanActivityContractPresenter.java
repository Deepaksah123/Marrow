package kotlin;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.ShapeKt;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\u000e\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\rR\u0011\u0010\n\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lo/UpgradePlanActivityContractPresenter;", "", "Lo/LessonCompletedDialog;", "p0", "<init>", "(Lo/LessonCompletedDialog;)V", "Lo/ShapeKt;", "write", "()Lo/ShapeKt;", "", "RemoteActionCompatParcelizer", "()Ljava/lang/String;", "", "J", "IconCompatParcelizer", "read", "Lo/LessonCompletedDialog;"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class UpgradePlanActivityContractPresenter {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private long IconCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final LessonCompletedDialog RemoteActionCompatParcelizer;

    public UpgradePlanActivityContractPresenter(LessonCompletedDialog lessonCompletedDialog) {
        toMagicModuleMetaRepoModel.write(lessonCompletedDialog, "");
        this.RemoteActionCompatParcelizer = lessonCompletedDialog;
        this.IconCompatParcelizer = 262144L;
    }

    public final String RemoteActionCompatParcelizer() throws IOException {
        String strWrite = this.RemoteActionCompatParcelizer.write(this.IconCompatParcelizer);
        this.IconCompatParcelizer -= (long) strWrite.length();
        return strWrite;
    }

    public final ShapeKt write() throws IOException {
        ShapeKt.RemoteActionCompatParcelizer remoteActionCompatParcelizer = new ShapeKt.RemoteActionCompatParcelizer();
        while (true) {
            String strRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
            if (strRemoteActionCompatParcelizer.length() != 0) {
                remoteActionCompatParcelizer.read(strRemoteActionCompatParcelizer);
            } else {
                return remoteActionCompatParcelizer.AudioAttributesCompatParcelizer();
            }
        }
    }
}
