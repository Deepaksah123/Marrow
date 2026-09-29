package kotlin;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import com.marrow.data.api.models.response.pearl.PearlResponseBody;
import com.marrow.data.models.custommodule.FilterParams;
import com.marrow.data.models.pearl.Pearl;
import com.marrow.data.models.pearl.PearlMini;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class DashSegmentIndex extends primaryTrack<Pearl> implements DashMediaSourceIso8601Parser {
    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ String[] IconCompatParcelizer(Object obj) {
        return read((Pearl) obj);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ Object RemoteActionCompatParcelizer(Cursor cursor) {
        return AudioAttributesCompatParcelizer(cursor);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ Object[] RemoteActionCompatParcelizer(int i) {
        return IconCompatParcelizer(i);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ ContentValues write(Object obj) {
        return AudioAttributesCompatParcelizer((Pearl) obj);
    }

    public DashSegmentIndex(Context context, BundledChunkExtractor bundledChunkExtractor) {
        super(context, "_pearl", bundledChunkExtractor);
    }

    @Override // kotlin.primaryTrack, kotlin.getIntervalUntilNextManifestRefreshMs
    public final LinkedHashMap<String, String> RemoteActionCompatParcelizer() {
        LinkedHashMap<String, String> linkedHashMapRemoteActionCompatParcelizer = super.RemoteActionCompatParcelizer();
        linkedHashMapRemoteActionCompatParcelizer.put("_id", "TEXT PRIMARY KEY NOT NULL");
        linkedHashMapRemoteActionCompatParcelizer.put(PearlMini.KEY_PEARL_DISPLAY_ID, "TEXT");
        linkedHashMapRemoteActionCompatParcelizer.put("title", "TEXT");
        linkedHashMapRemoteActionCompatParcelizer.put(PearlMini.KEY_PEARL_TYPE, "TEXT");
        linkedHashMapRemoteActionCompatParcelizer.put("html", "TEXT");
        linkedHashMapRemoteActionCompatParcelizer.put(PearlMini.KEY_THUMBNAIL, "TEXT");
        linkedHashMapRemoteActionCompatParcelizer.put(PearlMini.KEY_THUMBNAIL_V2, "TEXT");
        linkedHashMapRemoteActionCompatParcelizer.put("published_status", "TEXT");
        linkedHashMapRemoteActionCompatParcelizer.put("subject_id", "TEXT");
        linkedHashMapRemoteActionCompatParcelizer.put("twidth", "INTEGER");
        linkedHashMapRemoteActionCompatParcelizer.put("theight", "INTEGER");
        linkedHashMapRemoteActionCompatParcelizer.put("last_updated", "INTEGER");
        linkedHashMapRemoteActionCompatParcelizer.put("do_not_consider", "INTEGER");
        linkedHashMapRemoteActionCompatParcelizer.put("image_cit_author", "TEXT");
        linkedHashMapRemoteActionCompatParcelizer.put("image_cit_license", "TEXT");
        linkedHashMapRemoteActionCompatParcelizer.put("image_cit_link", "TEXT");
        linkedHashMapRemoteActionCompatParcelizer.put("is_bookmarked", "INTEGER");
        linkedHashMapRemoteActionCompatParcelizer.put("b_last_updated", "INTEGER");
        linkedHashMapRemoteActionCompatParcelizer.put("active_mcq_count", "INTEGER");
        return linkedHashMapRemoteActionCompatParcelizer;
    }

    private static Pearl AudioAttributesCompatParcelizer(Cursor cursor) {
        Pearl pearl = new Pearl();
        String strAudioAttributesImplApi21Parcelizer = getPeriodDurationMs.AudioAttributesImplApi21Parcelizer(cursor, "_id");
        pearl.setId(strAudioAttributesImplApi21Parcelizer);
        pearl.setTitle(getPeriodDurationMs.AudioAttributesImplApi21Parcelizer(cursor, "title"));
        pearl.setSubjectId(getPeriodDurationMs.AudioAttributesImplApi21Parcelizer(cursor, "subject_id"));
        pearl.setPearlType(getPeriodDurationMs.AudioAttributesImplApi21Parcelizer(cursor, PearlMini.KEY_PEARL_TYPE));
        pearl.setPearlDisplayId(getPeriodDurationMs.AudioAttributesImplApi21Parcelizer(cursor, PearlMini.KEY_PEARL_DISPLAY_ID));
        pearl.setThumbnailUrl(getPeriodDurationMs.AudioAttributesImplApi21Parcelizer(cursor, PearlMini.KEY_THUMBNAIL));
        pearl.setThumbnailV2Url(getPeriodDurationMs.AudioAttributesImplApi21Parcelizer(cursor, PearlMini.KEY_THUMBNAIL_V2));
        pearl.setLastUpdated(getPeriodDurationMs.AudioAttributesImplBaseParcelizer(cursor, "last_updated"));
        pearl.setThumbnailWidth(getPeriodDurationMs.write(cursor, "twidth"));
        pearl.setThumbnailHeight(getPeriodDurationMs.write(cursor, "theight"));
        pearl.setPublishedStatus(getPeriodDurationMs.AudioAttributesImplApi21Parcelizer(cursor, "published_status"));
        pearl.setDoNotConsider(getPeriodDurationMs.read(cursor, "do_not_consider"));
        pearl.setCourseId(getPeriodDurationMs.write(cursor, FilterParams.KEY_COURSE_ID));
        pearl.setImageCitationLink(getPeriodDurationMs.AudioAttributesImplApi21Parcelizer(cursor, "image_cit_link"));
        pearl.setImageCitationAuthor(getPeriodDurationMs.AudioAttributesImplApi21Parcelizer(cursor, "image_cit_author"));
        pearl.setImageCitationLicense(getPeriodDurationMs.AudioAttributesImplApi21Parcelizer(cursor, "image_cit_license"));
        pearl.setBookmarked(getPeriodDurationMs.write(cursor, "is_bookmarked"));
        pearl.bookmarkLastUpdated = getPeriodDurationMs.AudioAttributesImplBaseParcelizer(cursor, "b_last_updated");
        pearl.setRelatedMcqCount(getPeriodDurationMs.write(cursor, "active_mcq_count"));
        pearl.initEncryptedContent(strAudioAttributesImplApi21Parcelizer, getPeriodDurationMs.AudioAttributesImplApi21Parcelizer(cursor, "html"));
        return pearl;
    }

    private static ContentValues AudioAttributesCompatParcelizer(Pearl pearl) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("_id", pearl.getId());
        contentValues.put("title", pearl.getTitle());
        contentValues.put("subject_id", pearl.getSubjectId());
        contentValues.put("html", pearl.getEncryptedContent());
        contentValues.put(PearlMini.KEY_THUMBNAIL, pearl.getImageUrl());
        contentValues.put(PearlMini.KEY_THUMBNAIL_V2, pearl.getImageV2Url());
        contentValues.put(PearlMini.KEY_PEARL_TYPE, pearl.getPearlType());
        contentValues.put(PearlMini.KEY_PEARL_DISPLAY_ID, pearl.getPearlDisplayId());
        contentValues.put("last_updated", Long.valueOf(pearl.getLastUpdated()));
        contentValues.put("twidth", Integer.valueOf(pearl.getThumbnailWidth()));
        contentValues.put("theight", Integer.valueOf(pearl.getThumbnailHeight()));
        contentValues.put("published_status", pearl.getPublishedStatus());
        contentValues.put("do_not_consider", Integer.valueOf(pearl.isDoNotConsider() ? 1 : 0));
        contentValues.put(FilterParams.KEY_COURSE_ID, Integer.valueOf(pearl.getCourseId()));
        contentValues.put("image_cit_license", pearl.getImageCitationLicense());
        contentValues.put("image_cit_author", pearl.getImageCitationAuthor());
        contentValues.put("image_cit_link", pearl.getImageCitationLink());
        contentValues.put("is_bookmarked", Integer.valueOf(pearl.isBookmarked()));
        contentValues.put("b_last_updated", Long.valueOf(pearl.bookmarkLastUpdated));
        contentValues.put("active_mcq_count", Integer.valueOf(pearl.getRelatedMcqCount()));
        return contentValues;
    }

    private static Pearl[] IconCompatParcelizer(int i) {
        return new Pearl[i];
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final String MediaBrowserCompatSearchResultReceiver() {
        return "_id =? ";
    }

    public static String[] read(Pearl pearl) {
        return new String[]{pearl.getId()};
    }

    public final Pearl MediaBrowserCompatCustomActionResultReceiver(String str) {
        return (Pearl) super.a_(str);
    }

    public final Pearl MediaBrowserCompatItemReceiver(String str) {
        return (Pearl) super.AudioAttributesCompatParcelizer("display_id =? ", new String[]{str}, (String) null);
    }

    public final int write() {
        return write("pearl_type =? ", new String[]{"html"});
    }

    public final void RemoteActionCompatParcelizer(PearlResponseBody pearlResponseBody) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("is_bookmarked", Integer.valueOf(pearlResponseBody.isBookmarked));
        contentValues.put("b_last_updated", Long.valueOf(pearlResponseBody.bookmarkLastUpdated));
        write(contentValues, MediaBrowserCompatSearchResultReceiver(), new String[]{pearlResponseBody.id});
    }

    public final void AudioAttributesCompatParcelizer(String str, int i) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("is_bookmarked", Integer.valueOf(i));
        write(contentValues, MediaBrowserCompatSearchResultReceiver(), new String[]{str});
    }

    public final void IconCompatParcelizer(List<Pearl> list) {
        List listAsList = Arrays.asList(read("_id", read("_id", parseString.AudioAttributesCompatParcelizer(list)), null, null));
        ArrayList arrayList = new ArrayList();
        for (Pearl pearl : list) {
            if (!listAsList.contains(pearl.getId())) {
                arrayList.add(pearl);
            }
        }
        IconCompatParcelizer((PlayerEmsgHandlerManifestExpiryEventInfo[]) arrayList.toArray(new Pearl[arrayList.size()]));
    }

    public static Pearl MediaDescriptionCompat() {
        Pearl pearl = new Pearl();
        pearl.setTitle("Title Organisms and  selective Culture Media");
        pearl.setPearlType("");
        pearl.setPearlDisplayId("PM1234");
        pearl.setId("58f09fb17f254513160c922a");
        pearl.setBodyEncrypt("58f09fb17f254513160c922a", "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");
        pearl.setPublishedStatus("published");
        pearl.setSubjectId("58ef23b17f25450340d98695");
        return pearl;
    }
}
