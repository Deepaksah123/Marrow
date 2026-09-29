package kotlin;

import java.util.logging.Handler;
import java.util.logging.LogRecord;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lo/VideoTimelineSideSheetViewModel;", "Ljava/util/logging/Handler;", "<init>", "()V", "", "close", "flush", "Ljava/util/logging/LogRecord;", "p0", "publish", "(Ljava/util/logging/LogRecord;)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class VideoTimelineSideSheetViewModel extends Handler {
    public static final VideoTimelineSideSheetViewModel INSTANCE = new VideoTimelineSideSheetViewModel();

    @Override // java.util.logging.Handler
    public final void close() {
    }

    @Override // java.util.logging.Handler
    public final void flush() {
    }

    private VideoTimelineSideSheetViewModel() {
    }

    @Override // java.util.logging.Handler
    public final void publish(LogRecord p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        ToggleKey toggleKey = ToggleKey.INSTANCE;
        String loggerName = p0.getLoggerName();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(loggerName, "");
        int i = SettingsResultNavClicked.read(p0);
        String message = p0.getMessage();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(message, "");
        ToggleKey.AudioAttributesCompatParcelizer(loggerName, i, message, p0.getThrown());
    }
}
