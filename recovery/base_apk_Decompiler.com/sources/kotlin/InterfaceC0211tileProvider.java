package kotlin;

import kotlin.Metadata;

/* JADX INFO: renamed from: o.tileProvider, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC0211tileProvider {

    /* JADX INFO: renamed from: o.tileProvider$IconCompatParcelizer */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/tileProvider$IconCompatParcelizer;", "Lo/tileProvider;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class IconCompatParcelizer implements InterfaceC0211tileProvider {
        public static final IconCompatParcelizer INSTANCE = new IconCompatParcelizer();

        private IconCompatParcelizer() {
        }
    }

    /* JADX INFO: renamed from: o.tileProvider$RemoteActionCompatParcelizer */
    public static final class RemoteActionCompatParcelizer implements InterfaceC0211tileProvider {
        private final String RemoteActionCompatParcelizer;
        private final String write;

        public RemoteActionCompatParcelizer(String str, String str2) {
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            this.RemoteActionCompatParcelizer = str;
            this.write = str2;
        }

        public final String IconCompatParcelizer() {
            return this.write;
        }

        public final String write() {
            return this.RemoteActionCompatParcelizer;
        }
    }
}
