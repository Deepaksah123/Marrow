package kotlin;

import android.content.Context;
import android.graphics.Typeface;
import kotlin.Metadata;
import kotlin.getReader;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a'\u0010\b\u001a\u0004\u0018\u00010\u0003*\u0004\u0018\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lo/readRootValue;", "RemoteActionCompatParcelizer", "()Lo/readRootValue;", "Landroid/graphics/Typeface;", "Lo/getReader$read;", "p0", "Landroid/content/Context;", "p1", "IconCompatParcelizer", "(Landroid/graphics/Typeface;Lo/getReader$read;Landroid/content/Context;)Landroid/graphics/Typeface;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class createReadableObjectId {
    public static final readRootValue RemoteActionCompatParcelizer() {
        return new DefaultDeserializationContextImpl();
    }

    public static final Typeface IconCompatParcelizer(Typeface typeface, getReader.read readVar, Context context) {
        return modifyTypeByAnnotation.INSTANCE.read(typeface, readVar, context);
    }
}
