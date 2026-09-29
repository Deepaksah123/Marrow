package kotlin;

import java.util.LinkedList;
import java.util.List;
import kotlin.setActiveRecallQbankId;

/* JADX INFO: loaded from: classes4.dex */
public final class setTagType implements setRatingCount {
    private final setActiveRecallQbankId.MediaBrowserCompatSearchResultReceiver AudioAttributesCompatParcelizer;
    private final setActiveRecallQbankId.MediaDescriptionCompat read;

    public final /* synthetic */ class IconCompatParcelizer {
        public static final /* synthetic */ int[] IconCompatParcelizer;

        static {
            int[] iArr = new int[setActiveRecallQbankId.MediaDescriptionCompat.write.AudioAttributesCompatParcelizer.values().length];
            try {
                iArr[setActiveRecallQbankId.MediaDescriptionCompat.write.AudioAttributesCompatParcelizer.CLASS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[setActiveRecallQbankId.MediaDescriptionCompat.write.AudioAttributesCompatParcelizer.PACKAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[setActiveRecallQbankId.MediaDescriptionCompat.write.AudioAttributesCompatParcelizer.LOCAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            IconCompatParcelizer = iArr;
        }
    }

    public setTagType(setActiveRecallQbankId.MediaBrowserCompatSearchResultReceiver mediaBrowserCompatSearchResultReceiver, setActiveRecallQbankId.MediaDescriptionCompat mediaDescriptionCompat) {
        toMagicModuleMetaRepoModel.write(mediaBrowserCompatSearchResultReceiver, "");
        toMagicModuleMetaRepoModel.write(mediaDescriptionCompat, "");
        this.AudioAttributesCompatParcelizer = mediaBrowserCompatSearchResultReceiver;
        this.read = mediaDescriptionCompat;
    }

    @Override // kotlin.setRatingCount
    public final String AudioAttributesCompatParcelizer(int i) {
        String strRemoteActionCompatParcelizer = this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(i);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strRemoteActionCompatParcelizer, "");
        return strRemoteActionCompatParcelizer;
    }

    @Override // kotlin.setRatingCount
    public final String write(int i) {
        Triple<List<String>, List<String>, Boolean> tripleRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(i);
        List<String> listAudioAttributesCompatParcelizer = tripleRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer();
        String strRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer(tripleRemoteActionCompatParcelizer.read(), ".", null, null, 0, null, null, 62);
        if (listAudioAttributesCompatParcelizer.isEmpty()) {
            return strRemoteActionCompatParcelizer;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(listAudioAttributesCompatParcelizer, "/", null, null, 0, null, null, 62));
        sb.append('/');
        sb.append(strRemoteActionCompatParcelizer);
        return sb.toString();
    }

    @Override // kotlin.setRatingCount
    public final boolean IconCompatParcelizer(int i) {
        return RemoteActionCompatParcelizer(i).AudioAttributesImplBaseParcelizer().booleanValue();
    }

    private final Triple<List<String>, List<String>, Boolean> RemoteActionCompatParcelizer(int i) {
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        boolean z = false;
        while (i != -1) {
            setActiveRecallQbankId.MediaDescriptionCompat.write writeVar = this.read.read(i);
            String strRemoteActionCompatParcelizer = this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(writeVar.write());
            setActiveRecallQbankId.MediaDescriptionCompat.write.AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer = writeVar.AudioAttributesCompatParcelizer();
            toMagicModuleMetaRepoModel.write(AudioAttributesCompatParcelizer);
            int i2 = IconCompatParcelizer.IconCompatParcelizer[AudioAttributesCompatParcelizer.ordinal()];
            if (i2 == 1) {
                linkedList2.addFirst(strRemoteActionCompatParcelizer);
            } else if (i2 == 2) {
                linkedList.addFirst(strRemoteActionCompatParcelizer);
            } else if (i2 == 3) {
                linkedList2.addFirst(strRemoteActionCompatParcelizer);
                z = true;
            }
            i = writeVar.IconCompatParcelizer();
        }
        return new Triple<>(linkedList, linkedList2, Boolean.valueOf(z));
    }
}
