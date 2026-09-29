package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0004R\u0014\u0010\u0003\u001a\u00020\b8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\tR\u0014\u0010\u000b\u001a\u00020\b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\tR\u0014\u0010\r\u001a\u00020\f8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\tR\u0014\u0010\u0010\u001a\u00020\b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\tR\u0014\u0010\n\u001a\u00020\b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0003"}, d2 = {"Lo/CoercionConfig;", "", "", "IconCompatParcelizer", "()J", "RemoteActionCompatParcelizer", "read", "AudioAttributesCompatParcelizer", "", "()F", "MediaBrowserCompatCustomActionResultReceiver", "write", "Lo/handleIdValue;", "AudioAttributesImplApi26Parcelizer", "AudioAttributesImplApi21Parcelizer", "MediaBrowserCompatItemReceiver", "AudioAttributesImplBaseParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface CoercionConfig {
    long AudioAttributesCompatParcelizer();

    default float AudioAttributesImplApi21Parcelizer() {
        return Float.MAX_VALUE;
    }

    default float AudioAttributesImplApi26Parcelizer() {
        return 16.0f;
    }

    long IconCompatParcelizer();

    default float MediaBrowserCompatCustomActionResultReceiver() {
        return 2.0f;
    }

    default float MediaBrowserCompatItemReceiver() {
        return BitmapDescriptorFactory.HUE_RED;
    }

    float RemoteActionCompatParcelizer();

    long read();

    default long write() {
        return getParameters.IconCompatParcelizer(assignParameter.IconCompatParcelizer(48.0f), assignParameter.IconCompatParcelizer(48.0f));
    }
}
