package kotlin;

import java.util.ArrayList;
import java.util.List;
import kotlin.setActiveRecallQbankId;

/* JADX INFO: loaded from: classes4.dex */
public final class setTagActive {
    private final List<setActiveRecallQbankId.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver> read;

    public setTagActive(setActiveRecallQbankId.onAddQueueItem onaddqueueitem) {
        toMagicModuleMetaRepoModel.write(onaddqueueitem, "");
        ArrayList arrayListWrite = onaddqueueitem.write();
        if (onaddqueueitem.RemoteActionCompatParcelizer()) {
            int iIconCompatParcelizer = onaddqueueitem.IconCompatParcelizer();
            List<setActiveRecallQbankId.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver> listWrite = onaddqueueitem.write();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(listWrite, "");
            List<setActiveRecallQbankId.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver> list = listWrite;
            ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list, 10));
            int i = 0;
            for (Object obj : list) {
                if (i < 0) {
                    IntermediateLoginResponseBody.read();
                }
                setActiveRecallQbankId.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiverWrite = (setActiveRecallQbankId.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) obj;
                if (i >= iIconCompatParcelizer) {
                    mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiverWrite = mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiverWrite.RatingCompat().AudioAttributesCompatParcelizer(true).write();
                }
                arrayList.add(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiverWrite);
                i++;
            }
            arrayListWrite = arrayList;
        }
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(arrayListWrite, "");
        this.read = arrayListWrite;
    }

    public final setActiveRecallQbankId.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver AudioAttributesCompatParcelizer(int i) {
        return this.read.get(i);
    }
}
