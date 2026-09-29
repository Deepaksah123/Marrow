package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public abstract class getOption1AnsweredCount extends getMagicLine<getShowPopup> {
    public static final read IconCompatParcelizer = new read(0);

    public getOption1AnsweredCount() {
        super(getShowPopup.INSTANCE);
    }

    @Override // kotlin.getMagicLine
    public final /* synthetic */ getShowPopup AudioAttributesCompatParcelizer() {
        return RemoteActionCompatParcelizer();
    }

    private static getShowPopup RemoteActionCompatParcelizer() {
        throw new UnsupportedOperationException();
    }

    public static final class RemoteActionCompatParcelizer extends getOption1AnsweredCount {
        private final String write;

        public RemoteActionCompatParcelizer(String str) {
            toMagicModuleMetaRepoModel.write(str, "");
            this.write = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getMagicLine
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public PlanSubscriptionItemKt AudioAttributesCompatParcelizer(getTopSection gettopsection) {
            toMagicModuleMetaRepoModel.write(gettopsection, "");
            return SubscriptionType.read(setAccessLevel.ERROR_CONSTANT_VALUE, this.write);
        }

        @Override // kotlin.getMagicLine
        public final String toString() {
            return this.write;
        }
    }

    public static final class read {
        private read() {
        }

        public static getOption1AnsweredCount read(String str) {
            toMagicModuleMetaRepoModel.write(str, "");
            return new RemoteActionCompatParcelizer(str);
        }

        public /* synthetic */ read(byte b) {
            this();
        }
    }
}
