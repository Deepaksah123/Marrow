package kotlin;

import java.util.List;
import kotlin.Metadata;
import kotlin.getCurrentTrackSelections;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J7\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004H&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\t\u0010\fJ\u000f\u0010\u000b\u001a\u00020\u0002H&¢\u0006\u0004\b\u000b\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0010R\u0014\u0010\u000e\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0010R\u0014\u0010\t\u001a\u00020\u00148'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0015R\u0014\u0010\r\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0010R\u0014\u0010\u000b\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0010R\u0014\u0010\u0016\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0010R\u0014\u0010\u0017\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0010R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00198'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u001aø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lo/setUpdateThrottle;", "", "", "p0", "Lkotlin/Function2;", "", "p1", "", "Lo/getCurrentTrackSelections$RemoteActionCompatParcelizer;", "RemoteActionCompatParcelizer", "(ILo/MagicModuleSubmissionRequestBody;)Ljava/util/List;", "IconCompatParcelizer", "(I)I", "AudioAttributesCompatParcelizer", "read", "(I)Ljava/lang/Object;", "()I", "MediaBrowserCompatCustomActionResultReceiver", "write", "MediaBrowserCompatItemReceiver", "", "()Z", "AudioAttributesImplApi26Parcelizer", "AudioAttributesImplBaseParcelizer", "AudioAttributesImplApi21Parcelizer", "Lo/bufferMapProperty;", "()Lo/bufferMapProperty;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface setUpdateThrottle {
    int AudioAttributesCompatParcelizer();

    int AudioAttributesCompatParcelizer(int p0);

    int AudioAttributesImplApi21Parcelizer();

    int AudioAttributesImplApi26Parcelizer();

    int AudioAttributesImplBaseParcelizer();

    int IconCompatParcelizer();

    int IconCompatParcelizer(int p0);

    int MediaBrowserCompatCustomActionResultReceiver();

    int MediaBrowserCompatItemReceiver();

    int RemoteActionCompatParcelizer();

    int RemoteActionCompatParcelizer(int p0);

    List<getCurrentTrackSelections.RemoteActionCompatParcelizer> RemoteActionCompatParcelizer(int p0, MagicModuleSubmissionRequestBody<? super Integer, ? super Integer, getShowPopup> p1);

    Object read(int p0);

    bufferMapProperty read();

    boolean write();
}
