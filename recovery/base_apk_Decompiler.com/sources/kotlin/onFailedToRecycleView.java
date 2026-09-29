package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0015\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003*\u0018\b\u0000\u0010\u0006\"\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0012\u0004\u0012\u00020\u00050\u0004"}, d2 = {"Lo/deserializeFromEmbedded;", "", "write", "(Lo/deserializeFromEmbedded;)Z", "Lo/AbstractDeserializer$AudioAttributesCompatParcelizer;", "Lo/_deserializeFromObjectId;", "IconCompatParcelizer"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class onFailedToRecycleView {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean write(deserializeFromEmbedded deserializefromembedded) {
        if (deserializefromembedded != null) {
            return deserializefromembedded.getIconCompatParcelizer() == null && deserializefromembedded.getAudioAttributesCompatParcelizer() == null && deserializefromembedded.getRead() == null && deserializefromembedded.getWrite() == null;
        }
        return true;
    }
}
