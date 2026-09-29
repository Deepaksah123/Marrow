package kotlin;

import java.util.Iterator;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
public final class setLogger {
    private final write AudioAttributesCompatParcelizer;
    private final String read;

    public setLogger(write writeVar, String str) {
        toMagicModuleMetaRepoModel.write(writeVar, "");
        toMagicModuleMetaRepoModel.write(str, "");
        this.AudioAttributesCompatParcelizer = writeVar;
        this.read = str;
    }

    public final write RemoteActionCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final String read() {
        return this.read;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setLogger)) {
            return false;
        }
        setLogger setlogger = (setLogger) obj;
        return this.AudioAttributesCompatParcelizer == setlogger.AudioAttributesCompatParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) setlogger.read);
    }

    public final int hashCode() {
        return (this.AudioAttributesCompatParcelizer.hashCode() * 31) + this.read.hashCode();
    }

    public final String toString() {
        write writeVar = this.AudioAttributesCompatParcelizer;
        String str = this.read;
        StringBuilder sb = new StringBuilder("EditionUpdatePopupUCModel(variant=");
        sb.append(writeVar);
        sb.append(", ackKey=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: classes.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\n\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\fj\u0002\b\bj\u0002\b\rj\u0002\b\n"}, d2 = {"Lo/setLogger$write;", "", "", "p0", "<init>", "(Ljava/lang/String;IZ)V", "AudioAttributesImplApi26Parcelizer", "Z", "RemoteActionCompatParcelizer", "()Z", "IconCompatParcelizer", "write", "read", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class write {
        private static final /* synthetic */ write[] AudioAttributesImplApi21Parcelizer;
        private static final /* synthetic */ getMagicModuleSavedMcqCount AudioAttributesImplBaseParcelizer;

        /* JADX INFO: renamed from: write, reason: from kotlin metadata */
        public static final Companion INSTANCE;

        /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
        private final boolean IconCompatParcelizer;
        public static final write read = new write("NEETPG_E8_TO_E8_5", 0, false);
        public static final write RemoteActionCompatParcelizer = new write("NEETPG_E6_5_TO_E8_5", 1, true);
        public static final write AudioAttributesCompatParcelizer = new write("FMGE_E8_TO_E8_5", 2, false);
        public static final write IconCompatParcelizer = new write("FMGE_E6_5_TO_E8_5", 3, true);

        private write(String str, int i, boolean z) {
            this.IconCompatParcelizer = z;
        }

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
        public final boolean getIconCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        static {
            write[] writeVarArrWrite = write();
            AudioAttributesImplApi21Parcelizer = writeVarArrWrite;
            AudioAttributesImplBaseParcelizer = getMagicModuleTimeline.IconCompatParcelizer(writeVarArrWrite);
            INSTANCE = new Companion(null);
        }

        /* JADX INFO: renamed from: o.setLogger$write$write, reason: collision with other inner class name and from kotlin metadata */
        /* JADX INFO: loaded from: classes3.dex */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/setLogger$write$write;", "", "<init>", "()V", "", "p0", "Lo/setLogger$write;", "read", "(Ljava/lang/String;)Lo/setLogger$write;"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public static write read(String p0) {
                write next;
                toMagicModuleMetaRepoModel.write(p0, "");
                Iterator<write> it = write.IconCompatParcelizer().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (TestGroupLSModel.read(next.name(), p0, true)) {
                        break;
                    }
                }
                return next;
            }

            public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
                this();
            }
        }

        private static final /* synthetic */ write[] write() {
            return new write[]{read, RemoteActionCompatParcelizer, AudioAttributesCompatParcelizer, IconCompatParcelizer};
        }

        public static getMagicModuleSavedMcqCount<write> IconCompatParcelizer() {
            return AudioAttributesImplBaseParcelizer;
        }

        public static write valueOf(String str) {
            return (write) Enum.valueOf(write.class, str);
        }

        public static write[] values() {
            return (write[]) AudioAttributesImplApi21Parcelizer.clone();
        }
    }
}
