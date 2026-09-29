package kotlin;

import kotlin._init_lambda4;

/* JADX INFO: loaded from: classes.dex */
public final class accessgetReportFullyDrawnExecutorp {
    private _init_lambda4.IconCompatParcelizer.MediaBrowserCompatItemReceiver write = _init_lambda4.IconCompatParcelizer.RemoteActionCompatParcelizer.INSTANCE;

    public final _init_lambda4.IconCompatParcelizer.MediaBrowserCompatItemReceiver AudioAttributesCompatParcelizer() {
        return this.write;
    }

    public final void IconCompatParcelizer(_init_lambda4.IconCompatParcelizer.MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver) {
        toMagicModuleMetaRepoModel.write(mediaBrowserCompatItemReceiver, "");
        this.write = mediaBrowserCompatItemReceiver;
    }

    public static final class IconCompatParcelizer {
        private _init_lambda4.IconCompatParcelizer.MediaBrowserCompatItemReceiver write = _init_lambda4.IconCompatParcelizer.RemoteActionCompatParcelizer.INSTANCE;

        public final IconCompatParcelizer AudioAttributesCompatParcelizer(_init_lambda4.IconCompatParcelizer.MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver) {
            toMagicModuleMetaRepoModel.write(mediaBrowserCompatItemReceiver, "");
            this.write = mediaBrowserCompatItemReceiver;
            return this;
        }

        public final accessgetReportFullyDrawnExecutorp RemoteActionCompatParcelizer() {
            accessgetReportFullyDrawnExecutorp accessgetreportfullydrawnexecutorp = new accessgetReportFullyDrawnExecutorp();
            accessgetreportfullydrawnexecutorp.IconCompatParcelizer(this.write);
            return accessgetreportfullydrawnexecutorp;
        }
    }
}
