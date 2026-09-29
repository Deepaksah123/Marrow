package kotlin;

import java.util.List;
import kotlin.CurrentQuery;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00172\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0017B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\u000b\u001a\u00020\n*\u00020\b2\u0006\u0010\u0005\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\u0010\u0005\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0012R\u0018\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u00148WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lo/_checkDup;", "Lo/expectComma;", "Lo/_outputUptoMillion;", "Lo/CurrentQuery$write;", "Lo/_parseIntValue;", "p0", "<init>", "(Lo/_parseIntValue;)V", "", "", "", "IconCompatParcelizer", "(Ljava/lang/Throwable;Ljava/lang/Object;)Z", "", "", "Lo/JsonGeneratorImpl;", "AudioAttributesCompatParcelizer", "(Ljava/lang/Integer;)Ljava/util/List;", "Lo/_parseIntValue;", "RemoteActionCompatParcelizer", "Lo/CurrentQuery$IconCompatParcelizer;", "getKey", "()Lo/CurrentQuery$IconCompatParcelizer;", "read"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class _checkDup implements expectComma, _outputUptoMillion, CurrentQuery.write {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final _parseIntValue RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int RemoteActionCompatParcelizer = 8;

    public _checkDup(_parseIntValue _parseintvalue) {
        this.RemoteActionCompatParcelizer = _parseintvalue;
    }

    @Override // o.CurrentQuery.write, kotlin.CurrentQuery
    public final /* bridge */ <R> R fold(R r, MagicModuleSubmissionRequestBody<? super R, ? super CurrentQuery.write, ? extends R> magicModuleSubmissionRequestBody) {
        return (R) CurrentQuery.write.DefaultImpls.fold(this, r, magicModuleSubmissionRequestBody);
    }

    @Override // o.CurrentQuery.write, kotlin.CurrentQuery
    public final /* bridge */ <E extends CurrentQuery.write> E get(CurrentQuery.IconCompatParcelizer<E> iconCompatParcelizer) {
        return (E) CurrentQuery.write.DefaultImpls.get(this, iconCompatParcelizer);
    }

    @Override // o.CurrentQuery.write, kotlin.CurrentQuery
    public final /* bridge */ CurrentQuery minusKey(CurrentQuery.IconCompatParcelizer<?> iconCompatParcelizer) {
        return CurrentQuery.write.DefaultImpls.minusKey(this, iconCompatParcelizer);
    }

    @Override // kotlin.CurrentQuery
    public final CurrentQuery plus(CurrentQuery currentQuery) {
        return CurrentQuery.write.DefaultImpls.AudioAttributesCompatParcelizer(this, currentQuery);
    }

    @Override // kotlin.expectComma
    public final boolean IconCompatParcelizer(Throwable th, final Object obj) {
        return _reportCantWriteValueExpectName.write(th, (getCreatedOnDateMs<_verifyPrettyValueWrite>) new getCreatedOnDateMs() { // from class: o.ReaderBasedJsonParser
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return _checkDup.IconCompatParcelizer(this.write, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final _verifyPrettyValueWrite IconCompatParcelizer(_checkDup _checkdup, Object obj) {
        return _checkdup.RemoteActionCompatParcelizer.read(obj);
    }

    @Override // kotlin._outputUptoMillion
    public final List<JsonGeneratorImpl> AudioAttributesCompatParcelizer(Integer p0) {
        return this.RemoteActionCompatParcelizer.onSkipToQueueItem();
    }

    /* JADX INFO: renamed from: o._checkDup$read, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lo/_checkDup$read;", "Lo/CurrentQuery$IconCompatParcelizer;", "Lo/_checkDup;", "<init>", "()V", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion implements CurrentQuery.IconCompatParcelizer<_checkDup> {
        private Companion() {
        }

        public final String toString() {
            return "CompositionErrorContext";
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    @Override // o.CurrentQuery.write
    public final CurrentQuery.IconCompatParcelizer<?> getKey() {
        return INSTANCE;
    }
}
