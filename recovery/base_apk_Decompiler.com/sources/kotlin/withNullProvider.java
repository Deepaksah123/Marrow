package kotlin;

import android.graphics.Typeface;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a3\u0010\t\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lo/_findFormat;", "", "p0", "Lo/deserializeAndSet;", "p1", "Lo/getDataStream;", "p2", "Lo/withValueDeserializer;", "p3", "read", "(ILjava/lang/Object;Lo/deserializeAndSet;Lo/getDataStream;I)Ljava/lang/Object;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class withNullProvider {
    public static final Object read(int i, Object obj, deserializeAndSet deserializeandset, getDataStream getdatastream, int i2) {
        int audioAttributesCompatParcelizer;
        boolean zWrite;
        if (obj instanceof Typeface) {
            boolean z = _findFormat.read(i) && !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(deserializeandset.read(), getdatastream) && getdatastream.compareTo(BuilderBasedDeserializer.write(getDataStream.INSTANCE)) >= 0 && deserializeandset.read().compareTo(BuilderBasedDeserializer.write(getDataStream.INSTANCE)) < 0;
            boolean z2 = _findFormat.RemoteActionCompatParcelizer(i) && !withValueDeserializer.write(i2, deserializeandset.IconCompatParcelizer());
            if (z2 || z) {
                if (z) {
                    audioAttributesCompatParcelizer = getdatastream.getAudioAttributesCompatParcelizer();
                } else {
                    audioAttributesCompatParcelizer = deserializeandset.read().getAudioAttributesCompatParcelizer();
                }
                if (z2) {
                    zWrite = withValueDeserializer.write(i2, withValueDeserializer.INSTANCE.AudioAttributesCompatParcelizer());
                } else {
                    zWrite = withValueDeserializer.write(deserializeandset.IconCompatParcelizer(), withValueDeserializer.INSTANCE.AudioAttributesCompatParcelizer());
                }
                return _hasCustomHandlers.INSTANCE.IconCompatParcelizer((Typeface) obj, audioAttributesCompatParcelizer, zWrite);
            }
        }
        return obj;
    }
}
