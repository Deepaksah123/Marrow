package kotlin;

import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
final class Mp4ExtractorFlags {
    private final String read;
    private volatile Logger write;

    Mp4ExtractorFlags(Class<?> cls) {
        this.read = cls.getName();
    }

    final Logger write() {
        Logger logger = this.write;
        if (logger != null) {
            return logger;
        }
        synchronized (this) {
            Logger logger2 = this.write;
            if (logger2 != null) {
                return logger2;
            }
            Logger logger3 = Logger.getLogger(this.read);
            this.write = logger3;
            return logger3;
        }
    }
}
