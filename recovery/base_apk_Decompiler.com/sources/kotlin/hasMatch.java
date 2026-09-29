package kotlin;

import android.graphics.Typeface;
import kotlin.Metadata;
import kotlin._findCachedDeserializer;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JI\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f0\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lo/hasMatch;", "Lo/withName;", "<init>", "()V", "Lo/_createDeserializer;", "p0", "Lo/_unwrapAndDeserialize;", "p1", "Lkotlin/Function1;", "Lo/_findCachedDeserializer$RemoteActionCompatParcelizer;", "", "p2", "", "p3", "Lo/_findCachedDeserializer;", "read", "(Lo/_createDeserializer;Lo/_unwrapAndDeserialize;Lo/getAnswerMap;Lo/getAnswerMap;)Lo/_findCachedDeserializer;", "Lo/readRootValue;", "AudioAttributesCompatParcelizer", "Lo/readRootValue;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class hasMatch implements withName {
    private final readRootValue AudioAttributesCompatParcelizer = createReadableObjectId.RemoteActionCompatParcelizer();

    public final _findCachedDeserializer read(_createDeserializer p0, _unwrapAndDeserialize p1, getAnswerMap<? super _findCachedDeserializer.RemoteActionCompatParcelizer, getShowPopup> p2, getAnswerMap<? super _createDeserializer, ? extends Object> p3) {
        Typeface typefaceWrite;
        _reportMissingSetter read = p0.getRead();
        if (read == null || (read instanceof CreatorProperty)) {
            typefaceWrite = this.AudioAttributesCompatParcelizer.write(p0.getAudioAttributesCompatParcelizer(), p0.getIconCompatParcelizer());
        } else if (read instanceof DefaultDeserializationContext) {
            typefaceWrite = this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer((DefaultDeserializationContext) p0.getRead(), p0.getAudioAttributesCompatParcelizer(), p0.getIconCompatParcelizer());
        } else {
            if (!(read instanceof checkUnresolvedObjectId)) {
                return null;
            }
            _createAndCache2 iconCompatParcelizer = ((checkUnresolvedObjectId) p0.getRead()).getIconCompatParcelizer();
            toMagicModuleMetaRepoModel.read(iconCompatParcelizer, "");
            typefaceWrite = ((createFromLong) iconCompatParcelizer).IconCompatParcelizer(p0.getAudioAttributesCompatParcelizer(), p0.getIconCompatParcelizer(), p0.getRemoteActionCompatParcelizer());
        }
        return new _findCachedDeserializer.RemoteActionCompatParcelizer(typefaceWrite, false, 2, null);
    }
}
