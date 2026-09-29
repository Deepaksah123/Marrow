package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class getSettingsItems extends getTestTabItems {
    private static final getSettingsItems AudioAttributesCompatParcelizer;
    public static final IconCompatParcelizer RemoteActionCompatParcelizer;

    private /* synthetic */ getSettingsItems(byte b) {
        this(true);
    }

    private getSettingsItems(boolean z) {
        super(new getSchemaCompletion("DefaultBuiltIns"));
        read(false);
    }

    public static final class IconCompatParcelizer {
        private IconCompatParcelizer() {
        }

        public static getSettingsItems read() {
            return getSettingsItems.AudioAttributesCompatParcelizer;
        }

        public /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }
    }

    static {
        byte b = 0;
        RemoteActionCompatParcelizer = new IconCompatParcelizer(b);
        AudioAttributesCompatParcelizer = new getSettingsItems(b);
    }

    public getSettingsItems() {
        this((byte) 0);
    }
}
