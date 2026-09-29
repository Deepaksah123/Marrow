package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
public final class saveMagicModuleStats extends setMagicModuleDownloadTime {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo/saveMagicModuleStats$IconCompatParcelizer;", "", "<init>", "()V", "", "RemoteActionCompatParcelizer", "Ljava/lang/Integer;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    static final class IconCompatParcelizer {
        public static final IconCompatParcelizer INSTANCE = new IconCompatParcelizer();
        public static final Integer RemoteActionCompatParcelizer;

        private IconCompatParcelizer() {
        }

        static {
            Object obj;
            Integer num = null;
            try {
                obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
            } catch (Throwable unused) {
            }
            Integer num2 = obj instanceof Integer ? (Integer) obj : null;
            if (num2 != null && num2.intValue() > 0) {
                num = num2;
            }
            RemoteActionCompatParcelizer = num;
        }
    }

    private static boolean IconCompatParcelizer() {
        return IconCompatParcelizer.RemoteActionCompatParcelizer == null || IconCompatParcelizer.RemoteActionCompatParcelizer.intValue() >= 34;
    }

    @Override // kotlin.MagicModuleLocalImpl
    public final getFinalData RemoteActionCompatParcelizer() {
        return IconCompatParcelizer() ? new getHd() : super.RemoteActionCompatParcelizer();
    }
}
