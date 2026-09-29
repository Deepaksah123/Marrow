package kotlin;

import kotlin.CurrentQuery;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \f2\u00020\u0001:\u0001\fJ4\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u001c\u0010\u0006\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003H¦@¢\u0006\u0004\b\u0007\u0010\bR\u0018\u0010\f\u001a\u0006\u0012\u0002\b\u00030\t8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0003"}, d2 = {"Lo/JsonAppendAttr;", "Lo/CurrentQuery$write;", "R", "Lkotlin/Function1;", "Lo/SampleVideos;", "", "p0", "AudioAttributesCompatParcelizer", "(Lo/getAnswerMap;Lo/SampleVideos;)Ljava/lang/Object;", "Lo/CurrentQuery$IconCompatParcelizer;", "getKey", "()Lo/CurrentQuery$IconCompatParcelizer;", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface JsonAppendAttr extends CurrentQuery.write {

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.read;

    <R> Object AudioAttributesCompatParcelizer(getAnswerMap<? super SampleVideos<? super R>, ? extends Object> getanswermap, SampleVideos<? super R> sampleVideos);

    @Override // o.CurrentQuery.write
    default CurrentQuery.IconCompatParcelizer<?> getKey() {
        return INSTANCE;
    }

    /* JADX INFO: renamed from: o.JsonAppendAttr$write, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/JsonAppendAttr$write;", "Lo/CurrentQuery$IconCompatParcelizer;", "Lo/JsonAppendAttr;", "<init>", "()V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion implements CurrentQuery.IconCompatParcelizer<JsonAppendAttr> {
        static final /* synthetic */ Companion read = new Companion();

        private Companion() {
        }
    }
}
