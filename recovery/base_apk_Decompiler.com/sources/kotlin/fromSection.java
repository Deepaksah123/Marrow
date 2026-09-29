package kotlin;

import in.juspay.hypersdk.ota.Constants;
import kotlin.C0212toJsonArray;

/* JADX INFO: loaded from: classes4.dex */
public final class fromSection {

    public static final class IconCompatParcelizer extends DataSet {
        public static final IconCompatParcelizer AudioAttributesCompatParcelizer = new IconCompatParcelizer();

        private IconCompatParcelizer() {
            super(Constants.PACKAGE_DIR_NAME, false);
        }

        @Override // kotlin.DataSet
        public final Integer AudioAttributesCompatParcelizer(DataSet dataSet) {
            toMagicModuleMetaRepoModel.write(dataSet, "");
            if (this == dataSet) {
                return 0;
            }
            C0212toJsonArray c0212toJsonArray = C0212toJsonArray.write;
            return C0212toJsonArray.AudioAttributesCompatParcelizer(dataSet) ? 1 : -1;
        }

        @Override // kotlin.DataSet
        public final DataSet read() {
            return C0212toJsonArray.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer;
        }

        @Override // kotlin.DataSet
        public final String write() {
            return "public/*package*/";
        }
    }

    private fromSection() {
    }

    static {
        new fromSection();
    }

    public static final class write extends DataSet {
        public static final write write = new write();

        private write() {
            super("protected_static", true);
        }

        @Override // kotlin.DataSet
        public final DataSet read() {
            return C0212toJsonArray.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer;
        }

        @Override // kotlin.DataSet
        public final String write() {
            return "protected/*protected static*/";
        }
    }

    public static final class RemoteActionCompatParcelizer extends DataSet {
        public static final RemoteActionCompatParcelizer IconCompatParcelizer = new RemoteActionCompatParcelizer();

        private RemoteActionCompatParcelizer() {
            super("protected_and_package", true);
        }

        @Override // kotlin.DataSet
        public final Integer AudioAttributesCompatParcelizer(DataSet dataSet) {
            toMagicModuleMetaRepoModel.write(dataSet, "");
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this, dataSet)) {
                return 0;
            }
            if (dataSet == C0212toJsonArray.write.IconCompatParcelizer) {
                return null;
            }
            C0212toJsonArray c0212toJsonArray = C0212toJsonArray.write;
            return C0212toJsonArray.AudioAttributesCompatParcelizer(dataSet) ? 1 : -1;
        }

        @Override // kotlin.DataSet
        public final DataSet read() {
            return C0212toJsonArray.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer;
        }

        @Override // kotlin.DataSet
        public final String write() {
            return "protected/*protected and package*/";
        }
    }
}
