package kotlin;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class createTempDirectory {
    public static final escapeFileName write(setSamplerTexIdUniform setsamplertexiduniform) {
        ArrayList arrayList;
        toMagicModuleMetaRepoModel.write(setsamplertexiduniform, "");
        List<getHeight> listAudioAttributesCompatParcelizer = setsamplertexiduniform.AudioAttributesCompatParcelizer();
        ArrayList arrayList2 = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) listAudioAttributesCompatParcelizer, 10));
        Iterator<T> it = listAudioAttributesCompatParcelizer.iterator();
        while (it.hasNext()) {
            arrayList2.add(createTempFile.RemoteActionCompatParcelizer((getHeight) it.next()));
        }
        ArrayList arrayList3 = arrayList2;
        List<getWidth> listRemoteActionCompatParcelizer = setsamplertexiduniform.RemoteActionCompatParcelizer();
        if (listRemoteActionCompatParcelizer != null) {
            List<getWidth> list = listRemoteActionCompatParcelizer;
            ArrayList arrayList4 = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list, 10));
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList4.add(write((getWidth) it2.next()));
            }
            arrayList = arrayList4;
        } else {
            arrayList = null;
        }
        return new escapeFileName(arrayList3, arrayList);
    }

    private static final getCurrentDisplayModeSize write(getWidth getwidth) {
        String iconCompatParcelizer = getwidth.getIconCompatParcelizer();
        int write = getwidth.getWrite();
        int remoteActionCompatParcelizer = getwidth.getRemoteActionCompatParcelizer();
        int audioAttributesCompatParcelizer = getwidth.getAudioAttributesCompatParcelizer();
        int read = getwidth.getRead();
        double audioAttributesImplApi21Parcelizer = getwidth.getAudioAttributesImplApi21Parcelizer();
        String mediaBrowserCompatCustomActionResultReceiver = getwidth.getMediaBrowserCompatCustomActionResultReceiver();
        int mediaBrowserCompatItemReceiver = getwidth.getMediaBrowserCompatItemReceiver();
        List<assertValidTextureSize> listMediaBrowserCompatItemReceiver = getwidth.MediaBrowserCompatItemReceiver();
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) listMediaBrowserCompatItemReceiver, 10));
        Iterator<T> it = listMediaBrowserCompatItemReceiver.iterator();
        while (it.hasNext()) {
            arrayList.add(GlProgramAttribute.read((assertValidTextureSize) it.next()));
        }
        return new getCurrentDisplayModeSize(iconCompatParcelizer, write, remoteActionCompatParcelizer, audioAttributesCompatParcelizer, read, audioAttributesImplApi21Parcelizer, mediaBrowserCompatCustomActionResultReceiver, mediaBrowserCompatItemReceiver, arrayList);
    }
}
