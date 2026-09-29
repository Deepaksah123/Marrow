package kotlin;

import android.os.Bundle;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\u0006\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\b2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\tH&¢\u0006\u0004\b\u0006\u0010\fJ=\u0010\u000e\u001a\u00020\u000b2\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\t2\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\r0\tH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0006\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH&¢\u0006\u0004\b\u0006\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\bH&¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0011\u001a\u00020\u000b2\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\tH&¢\u0006\u0004\b\u0011\u0010\u0013J\u000f\u0010\u0011\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0014J\u001f\u0010\u0006\u001a\u00020\u0015*\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\t¢\u0006\u0004\b\u0006\u0010\u0016R\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018"}, d2 = {"Lo/RtspMediaPeriodListener;", "", "Lo/updateLoadingFinished;", "p0", "<init>", "(Lo/updateLoadingFinished;)V", "AudioAttributesCompatParcelizer", "()Lo/updateLoadingFinished;", "", "", "p1", "", "(Ljava/lang/String;Ljava/util/Map;)V", "", "write", "(Ljava/util/Map;Ljava/util/Map;)V", "(Ljava/lang/String;Ljava/lang/String;)V", "IconCompatParcelizer", "(Ljava/lang/String;)V", "(Ljava/util/Map;)V", "()V", "Landroid/os/Bundle;", "(Ljava/util/Map;)Landroid/os/Bundle;", "RemoteActionCompatParcelizer", "Lo/updateLoadingFinished;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class RtspMediaPeriodListener {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final updateLoadingFinished IconCompatParcelizer;

    public abstract void AudioAttributesCompatParcelizer(String p0, String p1);

    public abstract void AudioAttributesCompatParcelizer(String p0, Map<String, ? extends Object> p1);

    public void IconCompatParcelizer() {
    }

    public abstract void IconCompatParcelizer(String p0);

    public abstract void IconCompatParcelizer(Map<String, ? extends Object> p0);

    public abstract void write(Map<String, ? extends Object> p0, Map<updateLoadingFinished, ? extends List<String>> p1);

    public RtspMediaPeriodListener(updateLoadingFinished updateloadingfinished) {
        toMagicModuleMetaRepoModel.write(updateloadingfinished, "");
        this.IconCompatParcelizer = updateloadingfinished;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final updateLoadingFinished getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public static Bundle AudioAttributesCompatParcelizer(Map<String, ? extends Object> map) {
        toMagicModuleMetaRepoModel.write(map, "");
        Pair[] pairArr = (Pair[]) VideoTimelineResponseBody.MediaBrowserCompatCustomActionResultReceiver(map).toArray(new Pair[0]);
        return _getIndexResolver.write((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
    }
}
