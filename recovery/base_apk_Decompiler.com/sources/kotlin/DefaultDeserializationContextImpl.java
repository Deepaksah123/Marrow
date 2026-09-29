package kotlin;

import android.graphics.Typeface;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0010\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lo/DefaultDeserializationContextImpl;", "Lo/readRootValue;", "<init>", "()V", "Lo/getDataStream;", "p0", "Lo/withValueDeserializer;", "p1", "Landroid/graphics/Typeface;", "write", "(Lo/getDataStream;I)Landroid/graphics/Typeface;", "Lo/DefaultDeserializationContext;", "p2", "AudioAttributesCompatParcelizer", "(Lo/DefaultDeserializationContext;Lo/getDataStream;I)Landroid/graphics/Typeface;", "", "IconCompatParcelizer", "(Ljava/lang/String;Lo/getDataStream;I)Landroid/graphics/Typeface;"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class DefaultDeserializationContextImpl implements readRootValue {
    @Override // kotlin.readRootValue
    public final Typeface write(getDataStream p0, int p1) {
        return IconCompatParcelizer(null, p0, p1);
    }

    @Override // kotlin.readRootValue
    public final Typeface AudioAttributesCompatParcelizer(DefaultDeserializationContext p0, getDataStream p1, int p2) {
        return IconCompatParcelizer(p0.getRemoteActionCompatParcelizer(), p1, p2);
    }

    private final Typeface IconCompatParcelizer(String p0, getDataStream p1, int p2) {
        Typeface typefaceCreate;
        String str;
        if (withValueDeserializer.write(p2, withValueDeserializer.INSTANCE.IconCompatParcelizer()) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p1, getDataStream.INSTANCE.RemoteActionCompatParcelizer()) && ((str = p0) == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        if (p0 == null) {
            typefaceCreate = Typeface.DEFAULT;
        } else {
            typefaceCreate = Typeface.create(p0, 0);
        }
        return Typeface.create(typefaceCreate, p1.getAudioAttributesCompatParcelizer(), withValueDeserializer.write(p2, withValueDeserializer.INSTANCE.AudioAttributesCompatParcelizer()));
    }
}
