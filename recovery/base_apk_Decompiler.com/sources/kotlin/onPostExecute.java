package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t"}, d2 = {"Lo/onPostExecute;", "", "<init>", "()V", "IconCompatParcelizer", "write", "RemoteActionCompatParcelizer", "Lo/onPostExecute$RemoteActionCompatParcelizer;", "Lo/onPostExecute$IconCompatParcelizer;", "Lo/onPostExecute$write;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class onPostExecute {

    public static final class IconCompatParcelizer extends onPostExecute {
        private final installIfNeeded IconCompatParcelizer;
        private final getMediaMimeType read;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IconCompatParcelizer(installIfNeeded installifneeded, getMediaMimeType getmediamimetype) {
            super(null);
            toMagicModuleMetaRepoModel.write(installifneeded, "");
            toMagicModuleMetaRepoModel.write(getmediamimetype, "");
            this.IconCompatParcelizer = installifneeded;
            this.read = getmediamimetype;
        }

        public final installIfNeeded AudioAttributesCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        public final getMediaMimeType write() {
            return this.read;
        }
    }

    private onPostExecute() {
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/onPostExecute$write;", "Lo/onPostExecute;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class write extends onPostExecute {
        public static final write INSTANCE = new write();

        private write() {
            super(null);
        }
    }

    public /* synthetic */ onPostExecute(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/onPostExecute$RemoteActionCompatParcelizer;", "Lo/onPostExecute;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RemoteActionCompatParcelizer extends onPostExecute {
        public static final RemoteActionCompatParcelizer INSTANCE = new RemoteActionCompatParcelizer();

        private RemoteActionCompatParcelizer() {
            super(null);
        }
    }
}
