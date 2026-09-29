package kotlin;

import kotlin.CurrentQuery;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bR\u001a\u0010\u0006\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\u00078WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t"}, d2 = {"Lo/setFitBars;", "Lo/CurrentQuery$write;", "Lo/getPlaybackInterval;", "write", "Lo/getPlaybackInterval;", "()Lo/getPlaybackInterval;", "IconCompatParcelizer", "Lo/CurrentQuery$IconCompatParcelizer;", "getKey", "()Lo/CurrentQuery$IconCompatParcelizer;", "RemoteActionCompatParcelizer", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class setFitBars implements CurrentQuery.write {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final getPlaybackInterval IconCompatParcelizer;

    @Override // o.CurrentQuery.write, kotlin.CurrentQuery
    public final <R> R fold(R r, MagicModuleSubmissionRequestBody<? super R, ? super CurrentQuery.write, ? extends R> magicModuleSubmissionRequestBody) {
        return (R) CurrentQuery.write.DefaultImpls.fold(this, r, magicModuleSubmissionRequestBody);
    }

    @Override // o.CurrentQuery.write, kotlin.CurrentQuery
    public final <E extends CurrentQuery.write> E get(CurrentQuery.IconCompatParcelizer<E> iconCompatParcelizer) {
        return (E) CurrentQuery.write.DefaultImpls.get(this, iconCompatParcelizer);
    }

    @Override // o.CurrentQuery.write, kotlin.CurrentQuery
    public final CurrentQuery minusKey(CurrentQuery.IconCompatParcelizer<?> iconCompatParcelizer) {
        return CurrentQuery.write.DefaultImpls.minusKey(this, iconCompatParcelizer);
    }

    @Override // kotlin.CurrentQuery
    public final CurrentQuery plus(CurrentQuery currentQuery) {
        return CurrentQuery.write.DefaultImpls.AudioAttributesCompatParcelizer(this, currentQuery);
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final getPlaybackInterval getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: o.setFitBars$AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/setFitBars$AudioAttributesCompatParcelizer;", "Lo/CurrentQuery$IconCompatParcelizer;", "Lo/setFitBars;", "<init>", "()V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion implements CurrentQuery.IconCompatParcelizer<setFitBars> {
        private Companion() {
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    @Override // o.CurrentQuery.write
    public final CurrentQuery.IconCompatParcelizer<setFitBars> getKey() {
        return INSTANCE;
    }
}
