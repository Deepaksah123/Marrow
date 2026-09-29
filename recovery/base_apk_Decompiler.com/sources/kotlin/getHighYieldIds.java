package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public abstract class getHighYieldIds {
    public static final read AudioAttributesCompatParcelizer = new read(0);
    private static final RemoteActionCompatParcelizer RemoteActionCompatParcelizer = new RemoteActionCompatParcelizer(setOption2AnsweredCount.BOOLEAN);
    private static final RemoteActionCompatParcelizer read = new RemoteActionCompatParcelizer(setOption2AnsweredCount.CHAR);
    private static final RemoteActionCompatParcelizer write = new RemoteActionCompatParcelizer(setOption2AnsweredCount.BYTE);
    private static final RemoteActionCompatParcelizer MediaBrowserCompatCustomActionResultReceiver = new RemoteActionCompatParcelizer(setOption2AnsweredCount.SHORT);
    private static final RemoteActionCompatParcelizer MediaBrowserCompatItemReceiver = new RemoteActionCompatParcelizer(setOption2AnsweredCount.INT);
    private static final RemoteActionCompatParcelizer AudioAttributesImplApi21Parcelizer = new RemoteActionCompatParcelizer(setOption2AnsweredCount.FLOAT);
    private static final RemoteActionCompatParcelizer AudioAttributesImplApi26Parcelizer = new RemoteActionCompatParcelizer(setOption2AnsweredCount.LONG);
    private static final RemoteActionCompatParcelizer IconCompatParcelizer = new RemoteActionCompatParcelizer(setOption2AnsweredCount.DOUBLE);

    private getHighYieldIds() {
    }

    public static final class RemoteActionCompatParcelizer extends getHighYieldIds {
        private final setOption2AnsweredCount RemoteActionCompatParcelizer;

        public RemoteActionCompatParcelizer(setOption2AnsweredCount setoption2answeredcount) {
            super((byte) 0);
            this.RemoteActionCompatParcelizer = setoption2answeredcount;
        }

        public final setOption2AnsweredCount AudioAttributesImplApi21Parcelizer() {
            return this.RemoteActionCompatParcelizer;
        }
    }

    public static final class write extends getHighYieldIds {
        private final String RemoteActionCompatParcelizer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public write(String str) {
            super((byte) 0);
            toMagicModuleMetaRepoModel.write(str, "");
            this.RemoteActionCompatParcelizer = str;
        }

        public final String AudioAttributesImplApi21Parcelizer() {
            return this.RemoteActionCompatParcelizer;
        }
    }

    public static final class IconCompatParcelizer extends getHighYieldIds {
        private final getHighYieldIds write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IconCompatParcelizer(getHighYieldIds gethighyieldids) {
            super((byte) 0);
            toMagicModuleMetaRepoModel.write(gethighyieldids, "");
            this.write = gethighyieldids;
        }

        public final getHighYieldIds AudioAttributesImplApi21Parcelizer() {
            return this.write;
        }
    }

    public String toString() {
        return getLessonNumber.write.AudioAttributesCompatParcelizer(this);
    }

    public static final class read {
        private read() {
        }

        public static RemoteActionCompatParcelizer AudioAttributesCompatParcelizer() {
            return getHighYieldIds.RemoteActionCompatParcelizer;
        }

        public static RemoteActionCompatParcelizer write() {
            return getHighYieldIds.read;
        }

        public static RemoteActionCompatParcelizer read() {
            return getHighYieldIds.write;
        }

        public static RemoteActionCompatParcelizer AudioAttributesImplApi26Parcelizer() {
            return getHighYieldIds.MediaBrowserCompatCustomActionResultReceiver;
        }

        public static RemoteActionCompatParcelizer AudioAttributesImplApi21Parcelizer() {
            return getHighYieldIds.MediaBrowserCompatItemReceiver;
        }

        public static RemoteActionCompatParcelizer IconCompatParcelizer() {
            return getHighYieldIds.AudioAttributesImplApi21Parcelizer;
        }

        public static RemoteActionCompatParcelizer AudioAttributesImplBaseParcelizer() {
            return getHighYieldIds.AudioAttributesImplApi26Parcelizer;
        }

        public static RemoteActionCompatParcelizer RemoteActionCompatParcelizer() {
            return getHighYieldIds.IconCompatParcelizer;
        }

        public /* synthetic */ read(byte b) {
            this();
        }
    }

    public /* synthetic */ getHighYieldIds(byte b) {
        this();
    }
}
