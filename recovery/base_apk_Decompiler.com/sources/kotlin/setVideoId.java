package kotlin;

import java.util.List;
import kotlin.setActiveRecallQbankId;

/* JADX INFO: loaded from: classes4.dex */
public final class setVideoId {
    public static final IconCompatParcelizer AudioAttributesCompatParcelizer = new IconCompatParcelizer(0);
    private static final setVideoId read = new setVideoId(IntermediateLoginResponseBody.RemoteActionCompatParcelizer());
    private final List<setActiveRecallQbankId.onPause> RemoteActionCompatParcelizer;

    private setVideoId(List<setActiveRecallQbankId.onPause> list) {
        this.RemoteActionCompatParcelizer = list;
    }

    public static final class IconCompatParcelizer {
        private IconCompatParcelizer() {
        }

        public static setVideoId RemoteActionCompatParcelizer() {
            return setVideoId.read;
        }

        public static setVideoId RemoteActionCompatParcelizer(setActiveRecallQbankId.onPlay onplay) {
            toMagicModuleMetaRepoModel.write(onplay, "");
            if (onplay.RemoteActionCompatParcelizer() == 0) {
                return RemoteActionCompatParcelizer();
            }
            List<setActiveRecallQbankId.onPause> listWrite = onplay.write();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(listWrite, "");
            return new setVideoId(listWrite, (byte) 0);
        }

        public /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }
    }

    public /* synthetic */ setVideoId(List list, byte b) {
        this(list);
    }
}
