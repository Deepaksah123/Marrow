package kotlin;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import com.google.android.exoplayer2.offline.DownloadService;
import com.marrow.data.models.common.CourseConfigKeyConstantsKt;
import com.marrow.data.models.common.FeaturedCard;
import com.marrow.data.models.custommodule.FilterParams;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class isIndexExplicit extends primaryTrack<FeaturedCard> {
    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ String[] IconCompatParcelizer(Object obj) {
        return write((FeaturedCard) obj);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ Object RemoteActionCompatParcelizer(Cursor cursor) {
        return IconCompatParcelizer(cursor);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ Object[] RemoteActionCompatParcelizer(int i) {
        return AudioAttributesCompatParcelizer(i);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ ContentValues write(Object obj) {
        return read((FeaturedCard) obj);
    }

    public isIndexExplicit(Context context, getStreamPositionUsForContent getstreampositionusforcontent) {
        super(context, CourseConfigKeyConstantsKt.KEY_FEATURED_CARD, getstreampositionusforcontent);
    }

    @Override // kotlin.primaryTrack, kotlin.getIntervalUntilNextManifestRefreshMs
    public final LinkedHashMap<String, String> RemoteActionCompatParcelizer() {
        LinkedHashMap<String, String> linkedHashMapRemoteActionCompatParcelizer = super.RemoteActionCompatParcelizer();
        linkedHashMapRemoteActionCompatParcelizer.put(FilterParams.KEY_COURSE_ID, "TEXT");
        linkedHashMapRemoteActionCompatParcelizer.put("_id", "TEXT PRIMARY KEY NOT NULL");
        linkedHashMapRemoteActionCompatParcelizer.put(DownloadService.KEY_CONTENT_ID, "TEXT");
        linkedHashMapRemoteActionCompatParcelizer.put("content_type", "TEXT");
        linkedHashMapRemoteActionCompatParcelizer.put("sub_content_id", "TEXT");
        linkedHashMapRemoteActionCompatParcelizer.put("sub_content_type", "TEXT");
        linkedHashMapRemoteActionCompatParcelizer.put("title", "TEXT");
        linkedHashMapRemoteActionCompatParcelizer.put("sub_title", "TEXT");
        linkedHashMapRemoteActionCompatParcelizer.put("_thumbnail", "TEXT");
        linkedHashMapRemoteActionCompatParcelizer.put("thumbnail_width", "TEXT");
        linkedHashMapRemoteActionCompatParcelizer.put("thumbnail_height", "TEXT");
        linkedHashMapRemoteActionCompatParcelizer.put("published_status", "TEXT");
        linkedHashMapRemoteActionCompatParcelizer.put("is_label_available", "INTEGER");
        linkedHashMapRemoteActionCompatParcelizer.put("label_text", "TEXT");
        linkedHashMapRemoteActionCompatParcelizer.put("label_text_color", "TEXT");
        linkedHashMapRemoteActionCompatParcelizer.put("label_bg_color", "TEXT");
        linkedHashMapRemoteActionCompatParcelizer.put("sort_order", "INTEGER");
        linkedHashMapRemoteActionCompatParcelizer.put("content_step_id", "TEXT");
        linkedHashMapRemoteActionCompatParcelizer.put("sort_order", "INTEGER");
        return linkedHashMapRemoteActionCompatParcelizer;
    }

    private static FeaturedCard IconCompatParcelizer(Cursor cursor) {
        FeaturedCard featuredCard = new FeaturedCard();
        featuredCard.courseId = getPeriodDurationMs.AudioAttributesImplApi21Parcelizer(cursor, FilterParams.KEY_COURSE_ID);
        featuredCard._id = getPeriodDurationMs.AudioAttributesImplApi21Parcelizer(cursor, "_id");
        featuredCard.contentId = getPeriodDurationMs.AudioAttributesImplApi21Parcelizer(cursor, DownloadService.KEY_CONTENT_ID);
        featuredCard.contentType = getPeriodDurationMs.AudioAttributesImplApi21Parcelizer(cursor, "content_type");
        featuredCard.subContentId = getPeriodDurationMs.AudioAttributesImplApi21Parcelizer(cursor, "sub_content_id");
        featuredCard.subContentType = getPeriodDurationMs.AudioAttributesImplApi21Parcelizer(cursor, "sub_content_type");
        featuredCard.contentTitle = getPeriodDurationMs.AudioAttributesImplApi21Parcelizer(cursor, "title");
        featuredCard.subTitle = getPeriodDurationMs.AudioAttributesImplApi21Parcelizer(cursor, "sub_title");
        featuredCard.thumbnail = getPeriodDurationMs.AudioAttributesImplApi21Parcelizer(cursor, "_thumbnail");
        featuredCard.publishedStatus = getPeriodDurationMs.AudioAttributesImplApi21Parcelizer(cursor, "published_status");
        featuredCard.contentStepIds = new String[]{getPeriodDurationMs.AudioAttributesImplApi21Parcelizer(cursor, "content_step_id")};
        featuredCard.sortOrder = getPeriodDurationMs.write(cursor, "sort_order");
        if (getPeriodDurationMs.write(cursor, "is_label_available") == 1) {
            featuredCard.label = new FeaturedCard.Label();
            featuredCard.label.text = getPeriodDurationMs.AudioAttributesImplApi21Parcelizer(cursor, "label_text");
            featuredCard.label.color = getPeriodDurationMs.AudioAttributesImplApi21Parcelizer(cursor, "label_text_color");
            featuredCard.label.bgColor = getPeriodDurationMs.AudioAttributesImplApi21Parcelizer(cursor, "label_bg_color");
        }
        return featuredCard;
    }

    private static ContentValues read(FeaturedCard featuredCard) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("_id", featuredCard._id);
        contentValues.put(FilterParams.KEY_COURSE_ID, featuredCard.courseId);
        contentValues.put(DownloadService.KEY_CONTENT_ID, featuredCard.contentId);
        contentValues.put("content_type", featuredCard.contentType);
        contentValues.put("sub_content_id", featuredCard.subContentId);
        contentValues.put("sub_content_type", featuredCard.subContentType);
        contentValues.put("title", featuredCard.contentTitle);
        contentValues.put("sub_title", featuredCard.subTitle);
        contentValues.put("_thumbnail", featuredCard.thumbnail);
        contentValues.put("published_status", featuredCard.publishedStatus);
        contentValues.put("is_label_available", Integer.valueOf(featuredCard.label != null ? 1 : 2));
        contentValues.put("content_step_id", (String) parseCea608AccessibilityChannel.AudioAttributesCompatParcelizer(featuredCard.contentStepIds));
        contentValues.put("sort_order", Integer.valueOf(featuredCard.sortOrder));
        if (featuredCard.label != null) {
            contentValues.put("label_text", featuredCard.label.text);
            contentValues.put("label_text_color", featuredCard.label.color);
            contentValues.put("label_bg_color", featuredCard.label.bgColor);
        }
        return contentValues;
    }

    private static FeaturedCard[] AudioAttributesCompatParcelizer(int i) {
        return new FeaturedCard[i];
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final String MediaBrowserCompatSearchResultReceiver() {
        return "_id =? ";
    }

    private static String[] write(FeaturedCard featuredCard) {
        return new String[]{featuredCard.contentId};
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public FeaturedCard a_(String... strArr) {
        return (FeaturedCard) super.a_(strArr);
    }
}
