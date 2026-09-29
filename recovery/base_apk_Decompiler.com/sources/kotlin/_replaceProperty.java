package kotlin;

import kotlin.AbstractDeserializer;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a!\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0000*\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/AbstractDeserializer$AudioAttributesCompatParcelizer;", "Lo/AbstractDeserializer$RemoteActionCompatParcelizer;", "", "read", "(Lo/AbstractDeserializer$AudioAttributesCompatParcelizer;)Lo/AbstractDeserializer$AudioAttributesCompatParcelizer;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class _replaceProperty {
    public static final AbstractDeserializer.AudioAttributesCompatParcelizer<String> read(AbstractDeserializer.AudioAttributesCompatParcelizer<? extends AbstractDeserializer.RemoteActionCompatParcelizer> audioAttributesCompatParcelizer) {
        AbstractDeserializer.RemoteActionCompatParcelizer remoteActionCompatParcelizerIconCompatParcelizer = audioAttributesCompatParcelizer.IconCompatParcelizer();
        toMagicModuleMetaRepoModel.read(remoteActionCompatParcelizerIconCompatParcelizer, "");
        return new AbstractDeserializer.AudioAttributesCompatParcelizer<>(((_handleByNameInclusion) remoteActionCompatParcelizerIconCompatParcelizer).getRemoteActionCompatParcelizer(), audioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer(), audioAttributesCompatParcelizer.getAudioAttributesCompatParcelizer(), audioAttributesCompatParcelizer.getRemoteActionCompatParcelizer());
    }
}
