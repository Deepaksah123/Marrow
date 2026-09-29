package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0019\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/setLayoutInflater;", "", "Lo/getTypePropertyName;", "AudioAttributesCompatParcelizer", "(Lo/setLayoutInflater;)Lo/getTypePropertyName;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class hasTypePropertyName {
    public static final getTypePropertyName AudioAttributesCompatParcelizer(setLayoutInflater<Boolean> setlayoutinflater) {
        String write = setlayoutinflater.getWrite();
        if (write == null) {
            write = "AnimatedVisibility";
        }
        return new getTypePropertyName(setlayoutinflater, write);
    }
}
