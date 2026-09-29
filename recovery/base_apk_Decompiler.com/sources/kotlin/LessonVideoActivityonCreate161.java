package kotlin;

import java.io.IOException;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013J/\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\nJ-\u0010\r\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0006\u001a\u00020\u0007H&¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH&¢\u0006\u0004\b\t\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u000fH&¢\u0006\u0004\b\u0011\u0010\u0012"}, d2 = {"Lo/LessonVideoActivityonCreate161;", "", "", "p0", "Lo/LessonCompletedDialog;", "p1", "p2", "", "p3", "RemoteActionCompatParcelizer", "(Lo/LessonCompletedDialog;I)Z", "", "Lo/SyncingActivity;", "read", "(Ljava/util/List;)Z", "Lo/getConnectionMonitor;", "", "AudioAttributesCompatParcelizer", "(Lo/getConnectionMonitor;)V", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface LessonVideoActivityonCreate161 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final LessonVideoActivityonCreate161 CANCEL = new AudioAttributesCompatParcelizer();

    void AudioAttributesCompatParcelizer(getConnectionMonitor getconnectionmonitor);

    boolean RemoteActionCompatParcelizer(List<SyncingActivity> list);

    boolean RemoteActionCompatParcelizer(LessonCompletedDialog lessonCompletedDialog, int i) throws IOException;

    boolean read(List<SyncingActivity> list);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0001"}, d2 = {"Lo/LessonVideoActivityonCreate161$Companion;", "", "<init>", "()V", "Lo/LessonVideoActivityonCreate161;", "CANCEL", "Lo/LessonVideoActivityonCreate161;", "AudioAttributesCompatParcelizer"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    static final class AudioAttributesCompatParcelizer implements LessonVideoActivityonCreate161 {
        @Override // kotlin.LessonVideoActivityonCreate161
        public final boolean RemoteActionCompatParcelizer(LessonCompletedDialog lessonCompletedDialog, int i) throws IOException {
            toMagicModuleMetaRepoModel.write(lessonCompletedDialog, "");
            lessonCompletedDialog.AudioAttributesImplBaseParcelizer(i);
            return true;
        }

        @Override // kotlin.LessonVideoActivityonCreate161
        public final boolean read(List<SyncingActivity> list) {
            toMagicModuleMetaRepoModel.write(list, "");
            return true;
        }

        @Override // kotlin.LessonVideoActivityonCreate161
        public final boolean RemoteActionCompatParcelizer(List<SyncingActivity> list) {
            toMagicModuleMetaRepoModel.write(list, "");
            return true;
        }

        @Override // kotlin.LessonVideoActivityonCreate161
        public final void AudioAttributesCompatParcelizer(getConnectionMonitor getconnectionmonitor) {
            toMagicModuleMetaRepoModel.write(getconnectionmonitor, "");
        }
    }
}
