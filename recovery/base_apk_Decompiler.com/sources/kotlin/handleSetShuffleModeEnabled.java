package kotlin;

import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lo/handleSetShuffleModeEnabled;", "", "<init>", "()V", "Lo/lambdaupdateStateAndInformListeners39;", "p0", "", "Lo/updateStateAndInformListeners;", "read", "(Lo/lambdaupdateStateAndInformListeners39;)Ljava/util/Set;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class handleSetShuffleModeEnabled {
    public static final handleSetShuffleModeEnabled INSTANCE = new handleSetShuffleModeEnabled();

    private handleSetShuffleModeEnabled() {
    }

    public static Set<updateStateAndInformListeners> read(lambdaupdateStateAndInformListeners39 p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        handleRemoveMediaItems handleremovemediaitems = handleRemoveMediaItems.INSTANCE;
        updateStateAndInformListeners updatestateandinformlisteners = handleRemoveMediaItems.read(p0);
        handleSetPlayWhenReady handlesetplaywhenready = handleSetPlayWhenReady.INSTANCE;
        updateStateAndInformListeners updatestateandinformlisteners2 = handleSetPlayWhenReady.read(p0);
        handleSetPlaybackParameters handlesetplaybackparameters = handleSetPlaybackParameters.INSTANCE;
        return getKycMessage.AudioAttributesCompatParcelizer(updatestateandinformlisteners, updatestateandinformlisteners2, handleSetPlaybackParameters.IconCompatParcelizer(p0));
    }
}
