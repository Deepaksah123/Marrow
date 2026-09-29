package kotlin;

import com.marrow.data.api.models.response.sync.CrossDeviceSyncResponseObject;
import com.marrow.data.models.lesson.LessonIndex;
import com.marrow.data.models.lesson.home.HomeLessonIndexV2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import kotlin.onDashManifestPublishTimeExpired;

/* JADX INFO: loaded from: classes3.dex */
public final class handleSourceInfoRefresh implements hasMediaSource {
    private final getStreamPositionUsForContent AudioAttributesCompatParcelizer;
    private final onDashManifestPublishTimeExpired write;

    public handleSourceInfoRefresh(onDashManifestPublishTimeExpired ondashmanifestpublishtimeexpired, getStreamPositionUsForContent getstreampositionusforcontent) {
        this.write = ondashmanifestpublishtimeexpired;
        this.AudioAttributesCompatParcelizer = getstreampositionusforcontent;
    }

    @Override // kotlin.hasMediaSource
    public final List<String> RemoteActionCompatParcelizer(String str) {
        if (parseDolbyChannelConfiguration.AudioAttributesCompatParcelizer((CharSequence) str)) {
            return Collections.emptyList();
        }
        String strMediaDescriptionCompat = this.write.MediaDescriptionCompat(str);
        if (parseDolbyChannelConfiguration.AudioAttributesCompatParcelizer((CharSequence) strMediaDescriptionCompat)) {
            return Collections.emptyList();
        }
        String str2 = String.format(Locale.getDefault(), "%s.%s ='%s'", CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON, "root_subject_id", strMediaDescriptionCompat);
        String str3 = String.format(Locale.getDefault(), "%s.%s =%s.%s", CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON, "subject_id", "_subject", "_id");
        String str4 = String.format(Locale.getDefault(), "%s.%s & %d = %d", CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON, "boolean_flags", 2, 2);
        Locale.getDefault();
        new Object[]{CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON, "boolean_flags", 2, 2};
        onDashManifestPublishTimeExpired.IconCompatParcelizer[] iconCompatParcelizerArrOnAddQueueItem = this.write.onAddQueueItem(String.format(Locale.getDefault(), "SELECT %s, %s FROM %s, %s WHERE  %s AND %s AND %s AND %s ORDER BY %S", "lesson._id", "lesson._status", CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON, "_subject", str2, str3, str4, String.format(Locale.getDefault(), "%s.%s = %d", CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON, "edition_value", Integer.valueOf(this.AudioAttributesCompatParcelizer.onPrepareFromUri())), String.format(Locale.getDefault(), "%s.%s, %s.%s, %s.%s", "_subject", "sort_order", "_subject", "_id", CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON, "lesson_number")));
        if (iconCompatParcelizerArrOnAddQueueItem == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < iconCompatParcelizerArrOnAddQueueItem.length; i2++) {
            if (parseDolbyChannelConfiguration.RemoteActionCompatParcelizer(iconCompatParcelizerArrOnAddQueueItem[i2].write, str)) {
                i = i2;
            } else if (i2 > i && iconCompatParcelizerArrOnAddQueueItem[i2].AudioAttributesCompatParcelizer != 2) {
                arrayList.add(iconCompatParcelizerArrOnAddQueueItem[i2].write);
                if (arrayList.size() >= 2) {
                    break;
                }
            }
        }
        return arrayList;
    }

    private String write(String str, String str2, String str3, String str4) {
        String[] strArrAudioAttributesCompatParcelizer = this.write.AudioAttributesCompatParcelizer("lesson_id", String.format("select %s.%s as %s from %s where %s order by %s", CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON, "_id", "lesson_id", "lesson inner join _subject rs, _subject ts on lesson.root_subject_id=rs._id and lesson.subject_id=ts._id", String.format("%s AND %s AND %s AND %s AND %s OR %s", str3, str2, String.format(Locale.getDefault(), "%s.%s != %d", CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON, "lesson_activity", 2), str4, "lesson.is_opt != 1", String.format("%s.%s = '%s'", CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON, "_id", str)), "rs.sort_order, rs._id, ts.sort_order, ts._id, lesson.lesson_number"));
        if (parseCea608AccessibilityChannel.read(strArrAudioAttributesCompatParcelizer)) {
            return null;
        }
        int length = strArrAudioAttributesCompatParcelizer.length;
        int length2 = strArrAudioAttributesCompatParcelizer.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            if (str.equals(strArrAudioAttributesCompatParcelizer[i])) {
                break;
            }
            i++;
        }
        if (i == -1 || i == length - 1) {
            return null;
        }
        return strArrAudioAttributesCompatParcelizer[i + 1];
    }

    private LessonIndex[] AudioAttributesCompatParcelizer(String str, String str2, String str3, String str4) {
        return this.write.RemoteActionCompatParcelizer(String.format(Locale.getDefault(), "%s >= %d AND %s AND %s AND %s AND %s != %d", "last_attempted_time_ms", Long.valueOf(System.currentTimeMillis() - 1209600000), str, str3, str2, "lesson_activity", 0), (String[]) null, "last_attempted_time_ms DESC");
    }

    private String[] write(String str) {
        String str2 = String.format("%s, %s, %s", CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON, "video_ci", "_subject");
        String str3 = String.format(Locale.getDefault(), "%s != %d AND %s != %d", "lesson_activity", 2, "_status", 2);
        String str4 = String.format("%s.%s = %s.%s", CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON, "_id", "video_ci", "reference_id");
        String str5 = String.format("%s.%s = %s.%s", "_subject", "_id", CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON, "root_subject_id");
        return this.write.AudioAttributesCompatParcelizer("lesson_id", String.format("select %s.%s as lesson_id from %s where %s order by %s", CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON, "_id", str2, String.format("%s AND %s AND %s AND %s", str4, str5, str, str3), String.format("%s.%s, %s.%s limit 1", "_subject", "sort_order", CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON, "lesson_number")));
    }

    private HomeLessonIndexV2 read(LessonIndex[] lessonIndexArr, String str, String str2, String str3, String str4) {
        for (int i = 1; i < Math.min(lessonIndexArr.length, 50); i++) {
            LessonIndex lessonIndex = lessonIndexArr[i];
            if (lessonIndex.getLessonActivityStatus() == 1 && lessonIndex.getStatus() == 1) {
                return lessonIndex.toHomeLessonIndex(1);
            }
            if (lessonIndex.getLessonActivityStatus() == 2 || lessonIndex.getStatus() == 2) {
                String strWrite = write(lessonIndex.getId(), str, str2, str3);
                if (!parseDolbyChannelConfiguration.AudioAttributesCompatParcelizer((CharSequence) strWrite)) {
                    return this.write.AudioAttributesImplApi21Parcelizer(strWrite).toHomeLessonIndex(2);
                }
            }
        }
        return null;
    }

    @Override // kotlin.hasMediaSource
    public final HomeLessonIndexV2 write(int i) {
        return AudioAttributesCompatParcelizer(i);
    }

    private HomeLessonIndexV2 AudioAttributesCompatParcelizer(int i) {
        String str;
        boolean z = i == 2;
        if (z) {
            str = "boolean_flags & 2 = 2";
        } else {
            str = "boolean_flags & 2 != 2";
        }
        String str2 = str;
        String strConcat = "edition_value = ".concat(String.valueOf(z ? this.AudioAttributesCompatParcelizer.onPrepareFromUri() : 0));
        LessonIndex[] lessonIndexArrAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(str2, strConcat, "boolean_flags & 1 != 1", null);
        if (!parseCea608AccessibilityChannel.read(lessonIndexArrAudioAttributesCompatParcelizer)) {
            LessonIndex lessonIndex = lessonIndexArrAudioAttributesCompatParcelizer[0];
            if (lessonIndex.getLessonActivityStatus() == 1 && lessonIndex.getStatus() == 1) {
                return lessonIndex.toHomeLessonIndex(1);
            }
            if (lessonIndex.getLessonActivityStatus() == 2 || lessonIndex.getStatus() == 2) {
                String strWrite = write(lessonIndex.getId(), strConcat, str2, "boolean_flags & 1 != 1");
                if (!parseDolbyChannelConfiguration.AudioAttributesCompatParcelizer((CharSequence) strWrite)) {
                    return this.write.AudioAttributesImplApi21Parcelizer(strWrite).toHomeLessonIndex(2);
                }
                HomeLessonIndexV2 homeLessonIndexV2 = read(lessonIndexArrAudioAttributesCompatParcelizer, strConcat, str2, "boolean_flags & 1 != 1", null);
                if (homeLessonIndexV2 != null) {
                    return homeLessonIndexV2;
                }
            } else {
                HomeLessonIndexV2 homeLessonIndexV22 = read(lessonIndexArrAudioAttributesCompatParcelizer, strConcat, str2, "boolean_flags & 1 != 1", null);
                if (homeLessonIndexV22 != null) {
                    return homeLessonIndexV22;
                }
            }
        }
        if (z) {
            String[] strArrWrite = write(strConcat);
            if (!parseCea608AccessibilityChannel.read(strArrWrite)) {
                return this.write.a_(strArrWrite[0]).toHomeLessonIndex(3);
            }
        }
        String[] strArr = this.write.read("_id", String.format("%s AND %s AND %s AND %s", str2, "boolean_flags & 1 != 1", strConcat, String.format(Locale.getDefault(), "(%s.%s != %d AND %s.%s != %d)", CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON, "_status", 2, CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON, "lesson_activity", 2)), null, String.format("%s limit 1", "master_order"));
        if (parseCea608AccessibilityChannel.read(strArr)) {
            return null;
        }
        return this.write.AudioAttributesImplApi21Parcelizer(strArr[0]).toHomeLessonIndex(0);
    }
}
