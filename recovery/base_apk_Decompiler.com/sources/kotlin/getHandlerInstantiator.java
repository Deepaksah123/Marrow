package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001Jg\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H&¢\u0006\u0004\b\u000b\u0010\fJW\u0010\r\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H&¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\r\u001a\u00020\u0005H&¢\u0006\u0004\b\r\u0010\u000fR\u0014\u0010\u000b\u001a\u00020\u00108'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0003"}, d2 = {"Lo/getHandlerInstantiator;", "", "Lo/WritableTypeIdInclusion;", "p0", "Lkotlin/Function0;", "", "p1", "p2", "p3", "p4", "p5", "RemoteActionCompatParcelizer", "(Lo/WritableTypeIdInclusion;Lo/getCreatedOnDateMs;Lo/getCreatedOnDateMs;Lo/getCreatedOnDateMs;Lo/getCreatedOnDateMs;Lo/getCreatedOnDateMs;)V", "IconCompatParcelizer", "(Lo/WritableTypeIdInclusion;Lo/getCreatedOnDateMs;Lo/getCreatedOnDateMs;Lo/getCreatedOnDateMs;Lo/getCreatedOnDateMs;)V", "()V", "Lo/getTypeResolverBuilder;", "AudioAttributesCompatParcelizer", "()Lo/getTypeResolverBuilder;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface getHandlerInstantiator {
    getTypeResolverBuilder AudioAttributesCompatParcelizer();

    void IconCompatParcelizer();

    void IconCompatParcelizer(WritableTypeIdInclusion p0, getCreatedOnDateMs<getShowPopup> p1, getCreatedOnDateMs<getShowPopup> p2, getCreatedOnDateMs<getShowPopup> p3, getCreatedOnDateMs<getShowPopup> p4);

    default void RemoteActionCompatParcelizer(WritableTypeIdInclusion p0, getCreatedOnDateMs<getShowPopup> p1, getCreatedOnDateMs<getShowPopup> p2, getCreatedOnDateMs<getShowPopup> p3, getCreatedOnDateMs<getShowPopup> p4, getCreatedOnDateMs<getShowPopup> p5) {
        IconCompatParcelizer(p0, p1, p2, p3, p4);
    }
}
