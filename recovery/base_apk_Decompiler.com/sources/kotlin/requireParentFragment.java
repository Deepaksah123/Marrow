package kotlin;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078'X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00078'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0014\u0010\r\u001a\u00020\u00078'X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\tR\u0014\u0010\u0011\u001a\u00020\u000e8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u000b\u001a\u00020\u00128WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0013R\u0014\u0010\u000f\u001a\u00020\u00078WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\tR\u0014\u0010\b\u001a\u00020\u00078WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\tR\u0014\u0010\u0014\u001a\u00020\u00078WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0003"}, d2 = {"Lo/requireParentFragment;", "", "", "Lo/performPrimaryNavigationFragmentChanged;", "AudioAttributesImplBaseParcelizer", "()Ljava/util/List;", "RemoteActionCompatParcelizer", "", "MediaBrowserCompatCustomActionResultReceiver", "()I", "AudioAttributesCompatParcelizer", "MediaBrowserCompatItemReceiver", "write", "IconCompatParcelizer", "Lo/getKey;", "AudioAttributesImplApi21Parcelizer", "()J", "read", "Lo/superDispatchKeyEvent;", "()Lo/superDispatchKeyEvent;", "AudioAttributesImplApi26Parcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface requireParentFragment {
    default int AudioAttributesCompatParcelizer() {
        return 0;
    }

    List<performPrimaryNavigationFragmentChanged> AudioAttributesImplBaseParcelizer();

    default int IconCompatParcelizer() {
        return 0;
    }

    int MediaBrowserCompatCustomActionResultReceiver();

    int MediaBrowserCompatItemReceiver();

    default int RemoteActionCompatParcelizer() {
        return 0;
    }

    int write();

    default long AudioAttributesImplApi21Parcelizer() {
        return getKey.INSTANCE.RemoteActionCompatParcelizer();
    }

    default superDispatchKeyEvent read() {
        return superDispatchKeyEvent.write;
    }
}
