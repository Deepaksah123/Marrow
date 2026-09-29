package kotlin;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.dispatchOnFrameAvailable;
import kotlin.getPlayoutDurationForMediaDuration;

/* JADX INFO: loaded from: classes3.dex */
public final class handlePlayPauseButtonAction {
    public static final getPlayoutDurationForMediaDuration read(dispatchOnFrameAvailable dispatchonframeavailable) {
        toMagicModuleMetaRepoModel.write(dispatchonframeavailable, "");
        String str = dispatchonframeavailable.read();
        Long lWrite = dispatchonframeavailable.write();
        String strRemoteActionCompatParcelizer = dispatchonframeavailable.RemoteActionCompatParcelizer();
        String iconCompatParcelizer = dispatchonframeavailable.AudioAttributesCompatParcelizer().getIconCompatParcelizer();
        int remoteActionCompatParcelizer = dispatchonframeavailable.AudioAttributesCompatParcelizer().getRemoteActionCompatParcelizer();
        String write = dispatchonframeavailable.AudioAttributesCompatParcelizer().getWrite();
        List<dispatchOnFrameAvailable.read> list = dispatchonframeavailable.AudioAttributesCompatParcelizer().read();
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(getSystemProperty.write((dispatchOnFrameAvailable.read) it.next()));
        }
        return new getPlayoutDurationForMediaDuration(str, lWrite, strRemoteActionCompatParcelizer, new getPlayoutDurationForMediaDuration.AudioAttributesCompatParcelizer(iconCompatParcelizer, remoteActionCompatParcelizer, write, arrayList), dispatchonframeavailable.AudioAttributesImplApi21Parcelizer(), dispatchonframeavailable.MediaBrowserCompatItemReceiver(), dispatchonframeavailable.IconCompatParcelizer());
    }

    public static final getUtf8Bytes AudioAttributesCompatParcelizer(updateAndPost updateandpost) {
        toMagicModuleMetaRepoModel.write(updateandpost, "");
        return new getUtf8Bytes(updateandpost.AudioAttributesCompatParcelizer(), updateandpost.IconCompatParcelizer(), updateandpost.write(), updateandpost.RemoteActionCompatParcelizer());
    }
}
