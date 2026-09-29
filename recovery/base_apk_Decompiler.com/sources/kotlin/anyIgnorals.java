package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001:\u0002\u000f\rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\t\u0010\bR$\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\n8G@GX\u0086\f¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\t\u001a\u00020\u00108gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0011"}, d2 = {"Lo/anyIgnorals;", "", "<init>", "()V", "Lo/findExplicitNames;", "p0", "", "IconCompatParcelizer", "(Lo/findExplicitNames;)V", "AudioAttributesCompatParcelizer", "Lo/addCtor;", "RemoteActionCompatParcelizer", "Lo/addCtor;", "write", "()Lo/addCtor;", "read", "Lo/anyIgnorals$write;", "()Lo/anyIgnorals$write;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class anyIgnorals {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private addCtor<Object> read = new addCtor<>();

    public abstract void AudioAttributesCompatParcelizer(findExplicitNames p0);

    public abstract void IconCompatParcelizer(findExplicitNames p0);

    public abstract write read();

    public final addCtor<Object> write() {
        return this.read;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f"}, d2 = {"Lo/anyIgnorals$read;", "", "<init>", "(Ljava/lang/String;I)V", "Lo/anyIgnorals$write;", "IconCompatParcelizer", "()Lo/anyIgnorals$write;", "RemoteActionCompatParcelizer", "Companion", "ON_CREATE", "ON_START", "ON_RESUME", "ON_PAUSE", "ON_STOP", "ON_DESTROY", "ON_ANY"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class read {
        private static final /* synthetic */ getMagicModuleSavedMcqCount $ENTRIES;
        private static final /* synthetic */ read[] $VALUES;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final read ON_CREATE = new read("ON_CREATE", 0);
        public static final read ON_START = new read("ON_START", 1);
        public static final read ON_RESUME = new read("ON_RESUME", 2);
        public static final read ON_PAUSE = new read("ON_PAUSE", 3);
        public static final read ON_STOP = new read("ON_STOP", 4);
        public static final read ON_DESTROY = new read("ON_DESTROY", 5);
        public static final read ON_ANY = new read("ON_ANY", 6);

        /* JADX INFO: loaded from: classes2.dex */
        public final /* synthetic */ class write {
            public static final /* synthetic */ int[] RemoteActionCompatParcelizer;

            static {
                int[] iArr = new int[read.values().length];
                try {
                    iArr[read.ON_CREATE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[read.ON_STOP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[read.ON_START.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[read.ON_PAUSE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[read.ON_RESUME.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[read.ON_DESTROY.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[read.ON_ANY.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                RemoteActionCompatParcelizer = iArr;
            }
        }

        private read(String str, int i) {
        }

        static {
            read[] readVarArrRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
            $VALUES = readVarArrRemoteActionCompatParcelizer;
            $ENTRIES = getMagicModuleTimeline.IconCompatParcelizer(readVarArrRemoteActionCompatParcelizer);
            INSTANCE = new Companion(null);
        }

        public final write IconCompatParcelizer() {
            switch (write.RemoteActionCompatParcelizer[ordinal()]) {
                case 1:
                case 2:
                    return write.read;
                case 3:
                case 4:
                    return write.RemoteActionCompatParcelizer;
                case 5:
                    return write.write;
                case 6:
                    return write.AudioAttributesCompatParcelizer;
                case 7:
                    StringBuilder sb = new StringBuilder();
                    sb.append(this);
                    sb.append(" has no target state");
                    throw new IllegalArgumentException(sb.toString());
                default:
                    throw new RenewEligibleCreator();
            }
        }

        /* JADX INFO: loaded from: classes2.dex */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\bJ\u0019\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\b"}, d2 = {"Lo/anyIgnorals$read$Companion;", "", "<init>", "()V", "Lo/anyIgnorals$write;", "p0", "Lo/anyIgnorals$read;", "IconCompatParcelizer", "(Lo/anyIgnorals$write;)Lo/anyIgnorals$read;", "AudioAttributesCompatParcelizer", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @getMagicModuleMeta
            public static read IconCompatParcelizer(write p0) {
                toMagicModuleMetaRepoModel.write(p0, "");
                int i = anyIgnorals$read$RemoteActionCompatParcelizer$write.read[p0.ordinal()];
                if (i == 1) {
                    return read.ON_DESTROY;
                }
                if (i == 2) {
                    return read.ON_STOP;
                }
                if (i != 3) {
                    return null;
                }
                return read.ON_PAUSE;
            }

            @getMagicModuleMeta
            public static read AudioAttributesCompatParcelizer(write p0) {
                toMagicModuleMetaRepoModel.write(p0, "");
                int i = anyIgnorals$read$RemoteActionCompatParcelizer$write.read[p0.ordinal()];
                if (i == 1) {
                    return read.ON_START;
                }
                if (i == 2) {
                    return read.ON_RESUME;
                }
                if (i != 5) {
                    return null;
                }
                return read.ON_CREATE;
            }

            @getMagicModuleMeta
            public static read RemoteActionCompatParcelizer(write p0) {
                toMagicModuleMetaRepoModel.write(p0, "");
                int i = anyIgnorals$read$RemoteActionCompatParcelizer$write.read[p0.ordinal()];
                if (i == 1) {
                    return read.ON_CREATE;
                }
                if (i == 2) {
                    return read.ON_START;
                }
                if (i != 3) {
                    return null;
                }
                return read.ON_RESUME;
            }

            public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
                this();
            }
        }

        public static read valueOf(String str) {
            return (read) Enum.valueOf(read.class, str);
        }

        public static read[] values() {
            return (read[]) $VALUES.clone();
        }

        private static final /* synthetic */ read[] RemoteActionCompatParcelizer() {
            return new read[]{ON_CREATE, ON_START, ON_RESUME, ON_PAUSE, ON_STOP, ON_DESTROY, ON_ANY};
        }

        @getMagicModuleMeta
        public static final read RemoteActionCompatParcelizer(write writeVar) {
            return Companion.IconCompatParcelizer(writeVar);
        }

        @getMagicModuleMeta
        public static final read AudioAttributesCompatParcelizer(write writeVar) {
            return Companion.RemoteActionCompatParcelizer(writeVar);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u0006j\u0002\b\u000b"}, d2 = {"Lo/anyIgnorals$write;", "", "<init>", "(Ljava/lang/String;I)V", "p0", "", "RemoteActionCompatParcelizer", "(Lo/anyIgnorals$write;)Z", "AudioAttributesCompatParcelizer", "IconCompatParcelizer", "read", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class write {
        private static final /* synthetic */ write[] MediaBrowserCompatItemReceiver;
        public static final write AudioAttributesCompatParcelizer = new write("DESTROYED", 0);
        public static final write IconCompatParcelizer = new write("INITIALIZED", 1);
        public static final write read = new write("CREATED", 2);
        public static final write RemoteActionCompatParcelizer = new write("STARTED", 3);
        public static final write write = new write("RESUMED", 4);

        private write(String str, int i) {
        }

        static {
            write[] writeVarArrWrite = write();
            MediaBrowserCompatItemReceiver = writeVarArrWrite;
            getMagicModuleTimeline.IconCompatParcelizer(writeVarArrWrite);
        }

        public final boolean RemoteActionCompatParcelizer(write p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return compareTo(p0) >= 0;
        }

        public static write valueOf(String str) {
            return (write) Enum.valueOf(write.class, str);
        }

        public static write[] values() {
            return (write[]) MediaBrowserCompatItemReceiver.clone();
        }

        private static final /* synthetic */ write[] write() {
            return new write[]{AudioAttributesCompatParcelizer, IconCompatParcelizer, read, RemoteActionCompatParcelizer, write};
        }
    }
}
