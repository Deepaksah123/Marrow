package kotlin;

import kotlin.Metadata;
import kotlin.updateStateAndInformListeners;
import kotlin.verifyApplicationThreadAndInitState;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/handleRemoveMediaItems;", "", "<init>", "()V", "Lo/lambdaupdateStateAndInformListeners39;", "p0", "Lo/updateStateAndInformListeners;", "read", "(Lo/lambdaupdateStateAndInformListeners39;)Lo/updateStateAndInformListeners;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class handleRemoveMediaItems {
    public static final handleRemoveMediaItems INSTANCE = new handleRemoveMediaItems();

    private handleRemoveMediaItems() {
    }

    public static updateStateAndInformListeners read(final lambdaupdateStateAndInformListeners39 p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return handleAddMediaItems.RemoteActionCompatParcelizer(new getAnswerMap() { // from class: o.handleSetDeviceVolume
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return handleRemoveMediaItems.RemoteActionCompatParcelizer(p0, (updateStateAndInformListeners.RemoteActionCompatParcelizer) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(final lambdaupdateStateAndInformListeners39 lambdaupdatestateandinformlisteners39, updateStateAndInformListeners.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        toMagicModuleMetaRepoModel.write(lambdaupdatestateandinformlisteners39, "");
        toMagicModuleMetaRepoModel.write(remoteActionCompatParcelizer, "");
        remoteActionCompatParcelizer.read();
        remoteActionCompatParcelizer.AudioAttributesCompatParcelizer("ctsystem_openurl");
        remoteActionCompatParcelizer.AudioAttributesCompatParcelizer("Android", "");
        remoteActionCompatParcelizer.read(new handleDecreaseDeviceVolume() { // from class: o.handleMoveMediaItems
            @Override // kotlin.shouldHandleCommand
            public final void read(verifyApplicationThreadAndInitState verifyapplicationthreadandinitstate) {
                handleRemoveMediaItems.read(lambdaupdatestateandinformlisteners39, (verifyApplicationThreadAndInitState.write) verifyapplicationthreadandinitstate);
            }
        });
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void read(lambdaupdateStateAndInformListeners39 lambdaupdatestateandinformlisteners39, verifyApplicationThreadAndInitState.write writeVar) {
        toMagicModuleMetaRepoModel.write(lambdaupdatestateandinformlisteners39, "");
        toMagicModuleMetaRepoModel.write(writeVar, "");
        String str = writeVar.read("Android");
        if (PlayerPlaybackSuppressionReason.AudioAttributesCompatParcelizer(str) && lambdaupdatestateandinformlisteners39.write(str, null)) {
            writeVar.IconCompatParcelizer();
        }
        writeVar.write();
    }
}
