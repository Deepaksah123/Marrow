package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u001a\u001b\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\u0005\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0004"}, d2 = {"Lo/constructSetterlessProperty;", "", "p0", "IconCompatParcelizer", "(Lo/constructSetterlessProperty;I)I", "RemoteActionCompatParcelizer"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class buildBeanDeserializer {
    public static final int IconCompatParcelizer(constructSetterlessProperty constructsetterlessproperty, int i) {
        int iWrite;
        if (constructsetterlessproperty.AudioAttributesImplApi26Parcelizer(constructsetterlessproperty.MediaBrowserCompatCustomActionResultReceiver(i))) {
            iWrite = constructsetterlessproperty.IconCompatParcelizer(i);
        } else {
            iWrite = constructsetterlessproperty.write(i);
        }
        return iWrite == -1 ? i : iWrite;
    }

    public static final int RemoteActionCompatParcelizer(constructSetterlessProperty constructsetterlessproperty, int i) {
        int iAudioAttributesCompatParcelizer;
        if (constructsetterlessproperty.RemoteActionCompatParcelizer(constructsetterlessproperty.MediaBrowserCompatItemReceiver(i))) {
            iAudioAttributesCompatParcelizer = constructsetterlessproperty.AudioAttributesCompatParcelizer(i);
        } else {
            iAudioAttributesCompatParcelizer = constructsetterlessproperty.read(i);
        }
        return iAudioAttributesCompatParcelizer == -1 ? i : iAudioAttributesCompatParcelizer;
    }
}
