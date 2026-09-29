package kotlin;

import java.util.Collection;
import java.util.List;
import kotlin.getTestHeaderTitle;
import kotlin.getVideoPageNotesTitle;

/* JADX INFO: loaded from: classes.dex */
public interface CourseConfigV2NavDrawerItemRateUs extends getTestHeaderTitle {

    /* JADX INFO: loaded from: classes4.dex */
    public interface write<D extends CourseConfigV2NavDrawerItemRateUs> {
        write<D> AudioAttributesCompatParcelizer();

        write<D> AudioAttributesCompatParcelizer(List<getMeta> list);

        write<D> AudioAttributesCompatParcelizer(getLink getlink);

        write<D> IconCompatParcelizer(List<getBadgeText> list);

        write<D> IconCompatParcelizer(getQuote getquote);

        D IconCompatParcelizer();

        write<D> MediaBrowserCompatCustomActionResultReceiver();

        write<D> RemoteActionCompatParcelizer();

        write<D> RemoteActionCompatParcelizer(CourseConfigV2NavDrawerItemFreeExtension courseConfigV2NavDrawerItemFreeExtension);

        write<D> RemoteActionCompatParcelizer(getVariant getvariant);

        write<D> RemoteActionCompatParcelizer(isVideoPlanCtype isvideoplanctype);

        write<D> read();

        write<D> read(CourseConfigV2TestTabItem courseConfigV2TestTabItem);

        write<D> read(getRelatedLessonId getrelatedlessonid);

        write<D> read(getTestHeaderTitle.RemoteActionCompatParcelizer remoteActionCompatParcelizer);

        write<D> read(boolean z);

        write<D> write();

        write<D> write(CourseConfigV2NavDrawerItems courseConfigV2NavDrawerItems);

        write<D> write(CourseConfigV2TestTabItem courseConfigV2TestTabItem);

        write<D> write(getTestHeaderTitle gettestheadertitle);

        <V> write<D> write(getVideoPageNotesTitle.RemoteActionCompatParcelizer<V> remoteActionCompatParcelizer, V v);
    }

    boolean AudioAttributesCompatParcelizer();

    @Override // kotlin.CourseConfigV2NavDrawerItemAboutUs, kotlin.getVariant
    getVariant AudioAttributesImplApi21Parcelizer();

    @Override // kotlin.getTestHeaderTitle, kotlin.getVideoPageNotesTitle
    Collection<? extends CourseConfigV2NavDrawerItemRateUs> AudioAttributesImplApi26Parcelizer();

    boolean IconCompatParcelizer();

    CourseConfigV2NavDrawerItemRateUs onPlayFromSearch();

    boolean onPlayFromUri();

    boolean onPrepare();

    CourseConfigV2NavDrawerItemRateUs onPrepareFromMediaId();

    boolean onPrepareFromSearch();

    boolean onPrepareFromUri();

    write<? extends CourseConfigV2NavDrawerItemRateUs> onRemoveQueueItemAt();

    boolean onSeekTo();

    CourseConfigV2NavDrawerItemRateUs read(setDesriptionList setdesriptionlist);
}
