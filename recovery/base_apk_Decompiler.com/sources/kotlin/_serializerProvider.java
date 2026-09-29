package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0002\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo/_assertNotNull;", "Lo/_configureGenerator;", "AudioAttributesCompatParcelizer", "(Lo/_assertNotNull;)Lo/_configureGenerator;", "Lo/bufferMapProperty;", "read", "Lo/bufferMapProperty;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class _serializerProvider {
    private static final bufferMapProperty read = bufferAnyProperty.IconCompatParcelizer$default(1.0f, BitmapDescriptorFactory.HUE_RED, 2, null);

    public static final _configureGenerator AudioAttributesCompatParcelizer(_assertNotNull _assertnotnull) {
        _configureGenerator onMediaButtonEvent = _assertnotnull.getOnMediaButtonEvent();
        if (onMediaButtonEvent != null) {
            return onMediaButtonEvent;
        }
        reportWrongTokenException.write("LayoutNode should be attached to an owner");
        throw new PlanDetailsCreator();
    }
}
