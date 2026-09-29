package kotlin;

import android.content.Context;
import android.graphics.Typeface;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001:\u0001\u0007R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005"}, d2 = {"Lo/modifyMapDeserializer;", "Lo/deserializeAndSet;", "Lo/modifyMapDeserializer$IconCompatParcelizer;", "write", "Lo/modifyMapDeserializer$IconCompatParcelizer;", "()Lo/modifyMapDeserializer$IconCompatParcelizer;", "read", "IconCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class modifyMapDeserializer implements deserializeAndSet {

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final IconCompatParcelizer read;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\"\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H¦@¢\u0006\u0004\b\u0007\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lo/modifyMapDeserializer$IconCompatParcelizer;", "", "Landroid/content/Context;", "p0", "Lo/modifyMapDeserializer;", "p1", "Landroid/graphics/Typeface;", "IconCompatParcelizer", "(Landroid/content/Context;Lo/modifyMapDeserializer;)Landroid/graphics/Typeface;", "(Landroid/content/Context;Lo/modifyMapDeserializer;Lo/SampleVideos;)Ljava/lang/Object;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface IconCompatParcelizer {
        Typeface IconCompatParcelizer(Context p0, modifyMapDeserializer p1);

        Object IconCompatParcelizer(Context context, modifyMapDeserializer modifymapdeserializer, SampleVideos<? super Typeface> sampleVideos);
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final IconCompatParcelizer getRead() {
        return this.read;
    }
}
