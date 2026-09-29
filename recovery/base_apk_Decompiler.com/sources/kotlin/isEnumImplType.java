package kotlin;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\t\u001a\u00020\u00068'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00068'X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\bR\u0014\u0010\r\u001a\u00020\f8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\n\u001a\u00020\u000f8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0013\u001a\u00020\u000f8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0011R\u0014\u0010\u0017\u001a\u00020\u00068'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\bR\u0014\u0010\u0007\u001a\u00020\u000f8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0011ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lo/isEnumImplType;", "", "", "Lo/getAbsentValue;", "AudioAttributesImplApi21Parcelizer", "()Ljava/util/List;", "", "MediaBrowserCompatCustomActionResultReceiver", "()I", "AudioAttributesCompatParcelizer", "IconCompatParcelizer", "write", "Lo/isAbstract;", "RemoteActionCompatParcelizer", "()Lo/isAbstract;", "", "MediaDescriptionCompat", "()Z", "Lo/tryToResolveUnresolved;", "AudioAttributesImplBaseParcelizer", "()Lo/tryToResolveUnresolved;", "read", "AudioAttributesImplApi26Parcelizer", "MediaBrowserCompatItemReceiver", "MediaBrowserCompatMediaItem"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface isEnumImplType {
    List<getAbsentValue> AudioAttributesImplApi21Parcelizer();

    boolean AudioAttributesImplApi26Parcelizer();

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer */
    tryToResolveUnresolved getOnStop();

    int IconCompatParcelizer();

    int MediaBrowserCompatCustomActionResultReceiver();

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver */
    int getIconCompatParcelizer();

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem */
    default boolean getAddOnUserLeaveHintListener() {
        return false;
    }

    boolean MediaDescriptionCompat();

    isAbstract RemoteActionCompatParcelizer();
}
