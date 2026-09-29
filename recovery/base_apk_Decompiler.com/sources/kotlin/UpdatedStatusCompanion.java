package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class UpdatedStatusCompanion {
    private static final getModuleData<Object, Object, Object, getShowPopup> AudioAttributesCompatParcelizer;
    private static final getAnswerMap<Object, Boolean> RemoteActionCompatParcelizer;

    static final class AudioAttributesImplBaseParcelizer extends MagicModuleUseCase implements getAnswerMap<Object, Object> {
        public static final AudioAttributesImplBaseParcelizer AudioAttributesCompatParcelizer = new AudioAttributesImplBaseParcelizer();

        @Override // kotlin.getAnswerMap
        public final Object invoke(Object obj) {
            return obj;
        }

        AudioAttributesImplBaseParcelizer() {
            super(1);
        }
    }

    static {
        AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizer = AudioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer;
        RemoteActionCompatParcelizer = AudioAttributesCompatParcelizer.write;
        IconCompatParcelizer iconCompatParcelizer = IconCompatParcelizer.write;
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer;
        write writeVar = write.write;
        AudioAttributesCompatParcelizer = read.IconCompatParcelizer;
    }

    static final class AudioAttributesCompatParcelizer extends MagicModuleUseCase implements getAnswerMap<Object, Boolean> {
        public static final AudioAttributesCompatParcelizer write = new AudioAttributesCompatParcelizer();

        private static Boolean RemoteActionCompatParcelizer() {
            return Boolean.TRUE;
        }

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ Boolean invoke(Object obj) {
            return RemoteActionCompatParcelizer();
        }

        AudioAttributesCompatParcelizer() {
            super(1);
        }
    }

    public static final <T> getAnswerMap<T, Boolean> RemoteActionCompatParcelizer() {
        return (getAnswerMap<T, Boolean>) RemoteActionCompatParcelizer;
    }

    static final class IconCompatParcelizer extends MagicModuleUseCase implements getAnswerMap {
        public static final IconCompatParcelizer write = new IconCompatParcelizer();

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ Object invoke(Object obj) {
            return null;
        }

        IconCompatParcelizer() {
            super(1);
        }
    }

    static final class RemoteActionCompatParcelizer extends MagicModuleUseCase implements getAnswerMap<Object, getShowPopup> {
        public static final RemoteActionCompatParcelizer AudioAttributesCompatParcelizer = new RemoteActionCompatParcelizer();

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(Object obj) {
            return getShowPopup.INSTANCE;
        }

        RemoteActionCompatParcelizer() {
            super(1);
        }
    }

    static final class write extends MagicModuleUseCase implements MagicModuleSubmissionRequestBody<Object, Object, getShowPopup> {
        public static final write write = new write();

        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final /* synthetic */ getShowPopup invoke(Object obj, Object obj2) {
            return getShowPopup.INSTANCE;
        }

        write() {
            super(2);
        }
    }

    static final class read extends MagicModuleUseCase implements getModuleData<Object, Object, Object, getShowPopup> {
        public static final read IconCompatParcelizer = new read();

        @Override // kotlin.getModuleData
        public final /* synthetic */ getShowPopup AudioAttributesCompatParcelizer(Object obj, Object obj2, Object obj3) {
            return getShowPopup.INSTANCE;
        }

        read() {
            super(3);
        }
    }

    public static final getModuleData<Object, Object, Object, getShowPopup> IconCompatParcelizer() {
        return AudioAttributesCompatParcelizer;
    }
}
