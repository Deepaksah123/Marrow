package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001f\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/findProperty;", "p0", "p1", "read", "(JJ)J"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class findMapDeserializer {
    public static final long read(long j, long j2) {
        int iRemoteActionCompatParcelizer;
        int iMediaBrowserCompatCustomActionResultReceiver = findProperty.MediaBrowserCompatCustomActionResultReceiver(j);
        int iAudioAttributesImplApi26Parcelizer = findProperty.AudioAttributesImplApi26Parcelizer(j);
        if (findProperty.AudioAttributesCompatParcelizer(j2, j)) {
            if (findProperty.read(j2, j)) {
                iMediaBrowserCompatCustomActionResultReceiver = findProperty.MediaBrowserCompatCustomActionResultReceiver(j2);
                iAudioAttributesImplApi26Parcelizer = iMediaBrowserCompatCustomActionResultReceiver;
            } else {
                if (findProperty.read(j, j2)) {
                    iRemoteActionCompatParcelizer = findProperty.RemoteActionCompatParcelizer(j2);
                } else if (findProperty.IconCompatParcelizer(j2, iMediaBrowserCompatCustomActionResultReceiver)) {
                    iMediaBrowserCompatCustomActionResultReceiver = findProperty.MediaBrowserCompatCustomActionResultReceiver(j2);
                    iRemoteActionCompatParcelizer = findProperty.RemoteActionCompatParcelizer(j2);
                } else {
                    iAudioAttributesImplApi26Parcelizer = findProperty.MediaBrowserCompatCustomActionResultReceiver(j2);
                }
                iAudioAttributesImplApi26Parcelizer -= iRemoteActionCompatParcelizer;
            }
        } else if (iAudioAttributesImplApi26Parcelizer > findProperty.MediaBrowserCompatCustomActionResultReceiver(j2)) {
            iMediaBrowserCompatCustomActionResultReceiver -= findProperty.RemoteActionCompatParcelizer(j2);
            iRemoteActionCompatParcelizer = findProperty.RemoteActionCompatParcelizer(j2);
            iAudioAttributesImplApi26Parcelizer -= iRemoteActionCompatParcelizer;
        }
        return getValueInstantiator.write(iMediaBrowserCompatCustomActionResultReceiver, iAudioAttributesImplApi26Parcelizer);
    }
}
