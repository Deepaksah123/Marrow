package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0007\"\u001a\u0010\u0001\u001a\u00020\u00008\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0001\u0010\u0003\"\u001a\u0010\u0004\u001a\u00020\u00008\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0002\u001a\u0004\b\u0005\u0010\u0003\"\u0014\u0010\u0007\u001a\u00020\u00008\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0002\"\u001a\u0010\u0006\u001a\u00020\u00008\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0002\u001a\u0004\b\u0006\u0010\u0003"}, d2 = {"Lo/setOnQueryTextFocusChangeListener;", "AudioAttributesCompatParcelizer", "Lo/setOnQueryTextFocusChangeListener;", "()Lo/setOnQueryTextFocusChangeListener;", "write", "RemoteActionCompatParcelizer", "read", "IconCompatParcelizer"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class setShowText {
    private static final setOnQueryTextFocusChangeListener AudioAttributesCompatParcelizer = new setMaxWidth(0.4f, BitmapDescriptorFactory.HUE_RED, 0.2f, 1.0f);
    private static final setOnQueryTextFocusChangeListener write = new setMaxWidth(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0.2f, 1.0f);
    private static final setOnQueryTextFocusChangeListener read = new setMaxWidth(0.4f, BitmapDescriptorFactory.HUE_RED, 1.0f, 1.0f);
    private static final setOnQueryTextFocusChangeListener IconCompatParcelizer = new setOnQueryTextFocusChangeListener() { // from class: o.setThreshold
        @Override // kotlin.setOnQueryTextFocusChangeListener
        public final float AudioAttributesCompatParcelizer(float f) {
            return setShowText.IconCompatParcelizer(f);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final float IconCompatParcelizer(float f) {
        return f;
    }

    public static final setOnQueryTextFocusChangeListener AudioAttributesCompatParcelizer() {
        return AudioAttributesCompatParcelizer;
    }

    public static final setOnQueryTextFocusChangeListener RemoteActionCompatParcelizer() {
        return write;
    }

    public static final setOnQueryTextFocusChangeListener read() {
        return IconCompatParcelizer;
    }
}
