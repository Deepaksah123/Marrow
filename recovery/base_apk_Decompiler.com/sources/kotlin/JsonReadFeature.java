package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u001c\n\u0000\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\f8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\rR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0003"}, d2 = {"Lo/JsonReadFeature;", "Lo/JsonReadContext;", "", "RemoteActionCompatParcelizer", "()Ljava/lang/Object;", "write", "", "AudioAttributesImplBaseParcelizer", "()Ljava/lang/String;", "read", "IconCompatParcelizer", "AudioAttributesCompatParcelizer", "", "()Ljava/lang/Iterable;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface JsonReadFeature extends JsonReadContext {
    Iterable<Object> AudioAttributesCompatParcelizer();

    String AudioAttributesImplBaseParcelizer();

    Object IconCompatParcelizer();

    Object RemoteActionCompatParcelizer();

    default Object write() {
        return null;
    }
}
