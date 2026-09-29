package kotlin;

import com.bumptech.glide.load.ImageHeaderParser;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class hasServerSideInsertedAds {
    private final List<ImageHeaderParser> IconCompatParcelizer = new ArrayList();

    public final List<ImageHeaderParser> AudioAttributesCompatParcelizer() {
        List<ImageHeaderParser> list;
        synchronized (this) {
            list = this.IconCompatParcelizer;
        }
        return list;
    }

    public final void read(ImageHeaderParser imageHeaderParser) {
        synchronized (this) {
            this.IconCompatParcelizer.add(imageHeaderParser);
        }
    }
}
