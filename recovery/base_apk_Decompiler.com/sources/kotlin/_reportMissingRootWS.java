package kotlin;

import java.util.List;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001J\u001d\u0010\u0005\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\t\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\f\u001a\u00020\u000b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000e\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\bH&¢\u0006\u0004\b\u000e\u0010\u0010J\u0017\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\bH&¢\u0006\u0004\b\t\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000bH&¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0016\u001a\u00020\u00032\u001a\u0010\u0004\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00140\u0013H&¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0018H&¢\u0006\u0004\b\u0016\u0010\u0019J\u000f\u0010\f\u001a\u00020\u0003H&¢\u0006\u0004\b\f\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0003H&¢\u0006\u0004\b\u001b\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u0003H&¢\u0006\u0004\b\u001c\u0010\u001aJ\u000f\u0010\t\u001a\u00020\u0003H&¢\u0006\u0004\b\t\u0010\u001aJ\u000f\u0010\u001d\u001a\u00020\u0003H&¢\u0006\u0004\b\u001d\u0010\u001aJ5\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001e2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00002\u0006\u0010 \u001a\u00020\u001f2\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H&¢\u0006\u0004\b\u000e\u0010\"J\u001b\u0010\u000e\u001a\u0004\u0018\u00010#2\b\u0010\u0004\u001a\u0004\u0018\u00010#H&¢\u0006\u0004\b\u000e\u0010$R\u0014\u0010\u000e\u001a\u00020\u000b8'X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u0012\u0082\u0001\u0001&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lo/_reportMissingRootWS;", "Lo/createChildArrayContext;", "Lkotlin/Function0;", "", "p0", "AudioAttributesCompatParcelizer", "(Lo/MagicModuleSubmissionRequestBody;)V", "", "", "write", "(Ljava/util/Set;)V", "", "read", "(Ljava/util/Set;)Z", "IconCompatParcelizer", "(Lo/getCreatedOnDateMs;)V", "(Ljava/lang/Object;)V", "MediaBrowserCompatMediaItem", "()Z", "", "Lo/getSubscriptionExpiresOn;", "Lo/getFilter;", "RemoteActionCompatParcelizer", "(Ljava/util/List;)V", "Lo/checkValue;", "(Lo/checkValue;)V", "()V", "AudioAttributesImplApi26Parcelizer", "AudioAttributesImplBaseParcelizer", "RatingCompat", "R", "", "p1", "p2", "(Lo/_reportMissingRootWS;ILo/getCreatedOnDateMs;)Ljava/lang/Object;", "Lo/isResourceManaged;", "(Lo/isResourceManaged;)Lo/isResourceManaged;", "MediaMetadataCompat", "Lo/getTokenLineNr;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface _reportMissingRootWS extends createChildArrayContext {
    void AudioAttributesCompatParcelizer(MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> p0);

    void AudioAttributesImplApi26Parcelizer();

    void AudioAttributesImplBaseParcelizer();

    <R> R IconCompatParcelizer(_reportMissingRootWS p0, int p1, getCreatedOnDateMs<? extends R> p2);

    isResourceManaged IconCompatParcelizer(isResourceManaged p0);

    void IconCompatParcelizer(Object p0);

    void IconCompatParcelizer(getCreatedOnDateMs<getShowPopup> p0);

    boolean MediaBrowserCompatMediaItem();

    boolean MediaMetadataCompat();

    void RatingCompat();

    void RemoteActionCompatParcelizer(List<Pair<getFilter, getFilter>> p0);

    void RemoteActionCompatParcelizer(checkValue p0);

    void read();

    boolean read(Set<? extends Object> p0);

    void write();

    void write(Object p0);

    void write(Set<? extends Object> p0);
}
