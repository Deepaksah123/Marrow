package kotlin;

import java.util.Collection;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0006\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u0005J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H&¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\b\u001a\u0004\u0018\u00010\n8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\n8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\fR\u001e\u0010\u0013\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R \u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00140\u000f8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0012R\u001e\u0010\u0016\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00000\u000f8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0012R\u0016\u0010\r\u001a\u0004\u0018\u00018\u00008'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\"\u0010\u0017\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00000\u00198'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00078'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u000b\u001a\u00020\u00078'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001d"}, d2 = {"Lo/isHdPlaybackError;", "", "T", "Lo/isAuthError;", "Lo/McqFaq;", "Lo/isApiBlockError;", "p0", "", "AudioAttributesCompatParcelizer", "(Ljava/lang/Object;)Z", "", "AudioAttributesImplApi26Parcelizer", "()Ljava/lang/String;", "AudioAttributesImplBaseParcelizer", "write", "", "Lo/isKycAuditIncomplete;", "IconCompatParcelizer", "()Ljava/util/Collection;", "read", "Lkotlin/reflect/KFunction;", "aO_", "RemoteActionCompatParcelizer", "MediaBrowserCompatCustomActionResultReceiver", "()Ljava/lang/Object;", "", "AudioAttributesImplApi21Parcelizer", "()Ljava/util/List;", "MediaBrowserCompatMediaItem", "()Z", "MediaBrowserCompatItemReceiver", "RatingCompat"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface isHdPlaybackError<T> extends isAuthError, McqFaq, isApiBlockError {
    boolean AudioAttributesCompatParcelizer(Object p0);

    List<isHdPlaybackError<? extends T>> AudioAttributesImplApi21Parcelizer();

    String AudioAttributesImplApi26Parcelizer();

    String AudioAttributesImplBaseParcelizer();

    Collection<isKycAuditIncomplete<?>> IconCompatParcelizer();

    T MediaBrowserCompatCustomActionResultReceiver();

    boolean MediaBrowserCompatMediaItem();

    boolean RatingCompat();

    Collection<isHdPlaybackError<?>> aO_();

    Collection<getErrorMessageId<T>> write();
}
