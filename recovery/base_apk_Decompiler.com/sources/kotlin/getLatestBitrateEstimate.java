package kotlin;

import android.os.Build;
import android.os.Bundle;
import com.google.android.exoplayer2.offline.DownloadService;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.marrow.TrainingApplication;
import com.marrow.data.models.custommodule.FilterParams;
import com.marrow.data.models.pearl.PearlMini;
import com.marrow.data.models.plan.Plan;
import com.marrow.data.models.user.College;
import com.marrow.data.models.user.LoggedUser;
import com.marrow.data.models.user.PhoneNumber;
import com.marrow.data.models.user.User;
import in.juspay.hyper.constants.LogSubCategory;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.function.BiConsumer;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class getLatestBitrateEstimate {
    private static getStreamPositionUsForContent write;

    public static void write(String str, long j, Bundle bundle) throws Throwable {
        TrainingApplication trainingApplication = TrainingApplication.read();
        if (trainingApplication != null) {
            String strIconCompatParcelizer = parseDuration.IconCompatParcelizer(trainingApplication);
            String str2 = Build.FINGERPRINT;
            String str3 = Build.MODEL;
            String str4 = Build.BRAND;
            String str5 = Build.MANUFACTURER;
            boolean zEquals = SessionDescription.SUPPORTED_SDP_VERSION.equals(updateShuffleButton.write("ro.boot.flash.locked"));
            bundle.putString("type", str);
            bundle.putString("id", String.valueOf(j));
            bundle.putString("device_id", strIconCompatParcelizer);
            bundle.putString("fingerprint", str2);
            bundle.putString("model", str3);
            bundle.putString("brand", str4);
            bundle.putString("manufacturer", str5);
            bundle.putString("boot_status", zEquals ? "true" : "false");
            bundle.putString("build_info", "12.0.0(496)");
            getTrackGroup.AudioAttributesCompatParcelizer("dexguard_analytics", bundle);
        }
    }

    public static void AudioAttributesCompatParcelizer(String str, long j) {
        write(str, j, new Bundle());
    }

    public static class MediaBrowserCompatSearchResultReceiver {
        public static void AudioAttributesCompatParcelizer(boolean z) {
            HashMap map = new HashMap();
            map.put("is_success", Boolean.valueOf(z));
            getLatestBitrateEstimate.write("suggestion_success", map);
        }
    }

    public static class AudioAttributesImplApi21Parcelizer {
        public static void IconCompatParcelizer(String str, String str2, boolean z) {
            HashMap map = new HashMap();
            map.put("Payment ID", str);
            map.put("GroupId", str2);
            map.put("Renew", Boolean.valueOf(z));
            getLatestBitrateEstimate.write("subscription_success", map);
        }

        public static void AudioAttributesCompatParcelizer(String str, String str2, boolean z) {
            HashMap map = new HashMap();
            map.put("Response", str);
            map.put("GroupId", str2);
            map.put("Renew", Boolean.valueOf(z));
            getLatestBitrateEstimate.write("subscription_cancel", map);
        }

        public static void RemoteActionCompatParcelizer(String str, String str2, boolean z) {
            HashMap map = new HashMap();
            map.put("Response", str);
            map.put("GroupId", str2);
            map.put("Renew", Boolean.valueOf(z));
            getLatestBitrateEstimate.write("subscription_failure", map);
        }

        public static void write(String str) {
            HashMap map = new HashMap();
            map.put("Payment ID", str);
            getLatestBitrateEstimate.write("subscription_upgrade_success", map);
        }

        public static void AudioAttributesCompatParcelizer(String str) {
            HashMap map = new HashMap();
            map.put("Response", str);
            getLatestBitrateEstimate.write("subscription_upgrade_cancel", map);
        }

        public static void RemoteActionCompatParcelizer(String str) {
            HashMap map = new HashMap();
            map.put("Response", str);
            getLatestBitrateEstimate.write("subscription_upgrade_failure", map);
        }
    }

    public static class RatingCompat {
        public static void AudioAttributesCompatParcelizer(String str) {
            HashMap map = new HashMap();
            map.put("origin", str);
            getLatestBitrateEstimate.write("subscription_list", map);
        }

        public static void write(String str) {
            HashMap map = new HashMap();
            map.put("Plan", str);
            getLatestBitrateEstimate.write("subscription_detail", map);
        }

        public static void IconCompatParcelizer(String str, String str2, String str3, boolean z) {
            HashMap map = new HashMap();
            map.put("Plan", str);
            map.put("Coupon", str2);
            map.put("Rf_Coupon", str3);
            map.put("notes_checked", Boolean.valueOf(z));
            getLatestBitrateEstimate.write("subscription_buy", map);
        }

        public static void write() {
            getLatestBitrateEstimate.write("subcription_view_more_duration");
        }
    }

    public static class AudioAttributesCompatParcelizer {
        public static void RemoteActionCompatParcelizer(String str) {
            HashMap map = new HashMap();
            map.put("when", "AppLaunch");
            map.put("user_id", str);
            getLatestBitrateEstimate.write("casting", map);
        }

        public static void read(String str) {
            MergingMediaSource.write(str);
            HashMap map = new HashMap();
            map.put("when", "VideoWatch");
            map.put("user_id", str);
            getLatestBitrateEstimate.write("casting", map);
        }
    }

    public static class MediaBrowserCompatMediaItem {
        public static void read() {
            HashMap map = new HashMap();
            map.put("how", "Menu");
            getLatestBitrateEstimate.write("Subscribe", map);
        }

        public static void IconCompatParcelizer() {
            HashMap map = new HashMap();
            map.put("how", "Profile");
            getLatestBitrateEstimate.write("Subscribe", map);
        }
    }

    public static class RemoteActionCompatParcelizer {
        public static void IconCompatParcelizer() {
            HashMap map = new HashMap();
            map.put("how", "Plan List");
            getLatestBitrateEstimate.write("Get a call back", map);
        }
    }

    public static class read {
        public static void RemoteActionCompatParcelizer(Plan plan) {
            HashMap map = new HashMap();
            map.put("how", plan.getTitle());
            getLatestBitrateEstimate.write("Buy Now", map);
        }

        public static void RemoteActionCompatParcelizer(String str, String str2, int i, String str3) {
            HashMap map = new HashMap();
            map.put("coupon", str);
            map.put("plan", str2);
            map.put("status", Integer.valueOf(i));
            map.put("error_msg", str3);
            getLatestBitrateEstimate.write("auto_apply_coupon", map);
        }
    }

    public static class MediaBrowserCompatItemReceiver {
        public static void AudioAttributesCompatParcelizer(int i) {
            HashMap map = new HashMap();
            map.put("expiry_day", Integer.valueOf(i));
            getLatestBitrateEstimate.write("renew_popup_closed", map);
        }

        public static void write(int i) {
            HashMap map = new HashMap();
            map.put("expiry_day", Integer.valueOf(i));
            getLatestBitrateEstimate.write("renew_popup_clicked", map);
        }

        public static void RemoteActionCompatParcelizer(int i) {
            HashMap map = new HashMap();
            map.put("expiry_day", Integer.valueOf(i));
            getLatestBitrateEstimate.write("renew_banner_clicked", map);
        }

        public static void write() {
            getLatestBitrateEstimate.write("renew_toast_displayed");
        }

        public static void IconCompatParcelizer(int i) {
            HashMap map = new HashMap();
            map.put("expiry_day", Integer.valueOf(i));
            getLatestBitrateEstimate.write("renew_banner_closed", map);
        }
    }

    public static class AudioAttributesImplApi26Parcelizer {
        public static void RemoteActionCompatParcelizer(String str, String str2, String str3) {
            HashMap map = new HashMap();
            map.put("content_type", str2);
            map.put(DownloadService.KEY_CONTENT_ID, str3);
            getLatestBitrateEstimate.write(str, map);
        }
    }

    public static class MediaDescriptionCompat {
        public static void read() {
            getLatestBitrateEstimate.write("go_to_full_video", new HashMap());
        }

        public static void IconCompatParcelizer(boolean z) {
            HashMap map = new HashMap();
            map.put("toggle", z ? "on" : "off");
            getLatestBitrateEstimate.IconCompatParcelizer("video_subtitle", map);
        }

        public static HashMap<String, Object> AudioAttributesCompatParcelizer(String str, String str2, boolean z) {
            HashMap<String, Object> map = new HashMap<>();
            map.put("lesson_id", str);
            map.put("subject_id", str2);
            map.put("toggle", z ? "on" : "off");
            return map;
        }

        public static HashMap<String, Object> AudioAttributesCompatParcelizer(String str, String str2) {
            HashMap<String, Object> map = new HashMap<>();
            map.put("lesson_id", str);
            map.put("subject_id", str2);
            return map;
        }

        public static HashMap<String, Object> RemoteActionCompatParcelizer(String str, String str2) {
            HashMap<String, Object> map = new HashMap<>();
            map.put("lesson_id", str);
            map.put("subject_id", str2);
            return map;
        }

        public static void AudioAttributesCompatParcelizer(Integer num) {
            HashMap map = new HashMap();
            map.put("rating", num);
            getLatestBitrateEstimate.write("video_rated", map);
        }

        public static void IconCompatParcelizer(String str, String str2, String str3, boolean z) {
            HashMap map = new HashMap();
            map.put("lesson_id", str);
            map.put("subject_id", str2);
            map.put("source", str3);
            if (z) {
                map.put("toggle", "mark_complete");
            } else {
                map.put("toggle", "mark_incomplete");
            }
            getLatestBitrateEstimate.IconCompatParcelizer("video_mark_completed", map);
        }

        public static void write() {
            getLatestBitrateEstimate.IconCompatParcelizer("video_watch_next", new HashMap());
        }

        public static void AudioAttributesCompatParcelizer(String str, String str2, String str3, int i) {
            HashMap map = new HashMap();
            map.put("lesson_id", str);
            map.put("subject_id", str2);
            map.put("source", str3);
            map.put("bookmark_type", Integer.valueOf(i));
            getLatestBitrateEstimate.IconCompatParcelizer("video_timeline_bookmarked", map);
        }

        public static void IconCompatParcelizer(String str) {
            HashMap map = new HashMap();
            map.put("source", str);
            getLatestBitrateEstimate.IconCompatParcelizer("video_timeline_selected", map);
        }

        public static void AudioAttributesCompatParcelizer(String str) {
            HashMap map = new HashMap();
            map.put("tab", str);
            getLatestBitrateEstimate.IconCompatParcelizer("video_player_tab_selected", map);
        }

        public static void RemoteActionCompatParcelizer(boolean z) {
            HashMap map = new HashMap();
            if (z) {
                map.put("toggle", "on");
            } else {
                map.put("toggle", "off");
            }
            getLatestBitrateEstimate.IconCompatParcelizer("video_notes_fullscreen", map);
        }

        public static void IconCompatParcelizer(String str, String str2, int i, String str3) {
            HashMap map = new HashMap();
            map.put("lesson_id", str);
            map.put("subject_id", str2);
            map.put("rating", Integer.valueOf(i));
            map.put("source", str3);
            getLatestBitrateEstimate.IconCompatParcelizer("video_rate", map);
        }

        public static void RemoteActionCompatParcelizer(int i, int i2) {
            HashMap map = new HashMap();
            map.put("old_seek", Integer.valueOf(i));
            map.put("new_seek", Integer.valueOf(i2));
            getLatestBitrateEstimate.IconCompatParcelizer("video_seek_changed", map);
        }

        public static void IconCompatParcelizer(PlayerNotificationManager1 playerNotificationManager1, PlayerNotificationManager1 playerNotificationManager12) {
            HashMap map = new HashMap();
            map.put("old_res", RemoteActionCompatParcelizer(playerNotificationManager1));
            map.put("new_res", RemoteActionCompatParcelizer(playerNotificationManager12));
            getLatestBitrateEstimate.IconCompatParcelizer("video_res_changed", map);
        }

        private static String RemoteActionCompatParcelizer(PlayerNotificationManager1 playerNotificationManager1) {
            if (playerNotificationManager1 == PlayerNotificationManager1.RemoteActionCompatParcelizer) {
                return TtmlNode.TEXT_EMPHASIS_AUTO;
            }
            return playerNotificationManager1.toString().toLowerCase();
        }

        public static void RemoteActionCompatParcelizer(Float f, Float f2) {
            HashMap map = new HashMap();
            map.put("old_speed", f);
            map.put("new_speed", f2);
            getLatestBitrateEstimate.IconCompatParcelizer("video_speed_changed", map);
        }

        public static void RemoteActionCompatParcelizer(String str) {
            HashMap map = new HashMap();
            map.put("direction", "forward");
            map.put("source", str);
            getLatestBitrateEstimate.IconCompatParcelizer("video_seek", map);
        }

        public static void write(String str) {
            HashMap map = new HashMap();
            map.put("direction", "backward");
            map.put("source", str);
            getLatestBitrateEstimate.IconCompatParcelizer("video_seek", map);
        }

        public static void AudioAttributesCompatParcelizer(String str, String str2, String str3, String str4, boolean z, String str5, String str6, String str7) {
            HashMap map = new HashMap();
            map.put("subject_id", str);
            map.put("lesson_id", str2);
            map.put("lesson_title", str3);
            map.put("subject_title", str4);
            map.put("subtitle_shown", Boolean.valueOf(z));
            map.put("child_subject_id", str5);
            map.put("child_subject_title", str6);
            map.put("video_theme", str7);
            getLatestBitrateEstimate.IconCompatParcelizer("video_start", map);
        }

        public static void read(boolean z, String str, String str2, String str3) {
            HashMap map = new HashMap();
            if (z) {
                map.put("source", "internal_pip");
            }
            map.put("video_theme", str);
            map.put("lesson_id", str2);
            map.put("subject_id", str3);
            StringBuilder sb = new StringBuilder("video_play ->");
            sb.append(map.toString());
            buildResolutionString.IconCompatParcelizer("darkmode-event", sb.toString());
            getLatestBitrateEstimate.IconCompatParcelizer("video_play", map);
        }

        public static void read(boolean z) {
            HashMap map = new HashMap();
            if (z) {
                map.put("source", "internal_pip");
            }
            getLatestBitrateEstimate.IconCompatParcelizer("video_pause", map);
        }

        public static void RemoteActionCompatParcelizer(Boolean bool) {
            HashMap map = new HashMap();
            if (bool.booleanValue()) {
                map.put("source", TtmlNode.TEXT_EMPHASIS_AUTO);
            } else {
                map.put("source", "manual");
            }
            map.put("toggle", "on");
            getLatestBitrateEstimate.IconCompatParcelizer("video_fullscreen", map);
        }

        public static void write(Boolean bool) {
            HashMap map = new HashMap();
            if (bool.booleanValue()) {
                map.put("source", TtmlNode.TEXT_EMPHASIS_AUTO);
            } else {
                map.put("source", "manual");
            }
            map.put("toggle", "off");
            getLatestBitrateEstimate.IconCompatParcelizer("video_fullscreen", map);
        }

        public static void IconCompatParcelizer(String str, String str2) {
            HashMap map = new HashMap();
            map.put("lesson_id", str);
            map.put("subject_id", str2);
            getLatestBitrateEstimate.IconCompatParcelizer("video_feedback", map);
        }

        public static HashMap<String, Object> IconCompatParcelizer(String str, int i, String str2) {
            HashMap<String, Object> map = new HashMap<>();
            map.put("category", str2);
            map.put("popup_type", str);
            map.put("error_code", Integer.valueOf(i));
            return map;
        }

        public static Map<String, Object> AudioAttributesCompatParcelizer(int i) {
            HashMap map = new HashMap();
            map.put("error_code", Integer.valueOf(i));
            return map;
        }

        public static void read(String str, String str2, String str3) {
            HashMap map = new HashMap();
            map.put("video_theme", str3);
            map.put("lesson_id", str);
            map.put("subject_id", str2);
            StringBuilder sb = new StringBuilder("video_theme_changed -> ");
            sb.append(map.toString());
            buildResolutionString.IconCompatParcelizer("darkmode-event", sb.toString());
            getLatestBitrateEstimate.IconCompatParcelizer("video_theme_changed", map);
        }
    }

    public static class MediaMetadataCompat {
        public static void RemoteActionCompatParcelizer(String str, String str2) {
            HashMap map = new HashMap();
            map.put("latest_state_id", str);
            map.put("origin_state_id", str2);
            getLatestBitrateEstimate.write("test_rank_diff_state", map);
        }
    }

    public static class IconCompatParcelizer {
        public static void write() {
            getLatestBitrateEstimate.write("bookmark_review_popup");
        }
    }

    public static class MediaBrowserCompatCustomActionResultReceiver {
        public static void RemoteActionCompatParcelizer(String str, String str2, String str3) {
            HashMap map = new HashMap();
            map.put("pearl_id", str);
            map.put(PearlMini.KEY_PEARL_DISPLAY_ID, str3);
            getLatestBitrateEstimate.write(parseDolbyChannelConfiguration.RemoteActionCompatParcelizer(str2, "html") ? "pearl_view" : "image_view", map);
        }
    }

    public static class AudioAttributesImplBaseParcelizer {
        public static void read(String str) {
            HashMap map = new HashMap();
            map.put("curr_theme", str);
            getLatestBitrateEstimate.write("theme_capture", map);
        }
    }

    public static Map<String, Object> RemoteActionCompatParcelizer(LoggedUser loggedUser, int i, int i2, int i3, int i4) throws Throwable {
        String collegeName;
        String stateId;
        String country;
        String yearOfAdmission;
        String collegeId;
        User info = loggedUser.getInfo();
        College college = info.getCollege();
        PhoneNumber phoneNumber = info.getPhoneNumber();
        ChunkHolder chunkHolderAudioAttributesCompatParcelizer = DefaultTrackNameProvider.AudioAttributesCompatParcelizer(TrainingApplication.read());
        getStreamPositionUsForContent getstreampositionusforcontentIconCompatParcelizer = DefaultTrackNameProvider.IconCompatParcelizer(TrainingApplication.read());
        chunkHolderAudioAttributesCompatParcelizer.IconCompatParcelizer();
        String strAsSingleEntity = phoneNumber.asSingleEntity();
        String[][] strArrMediaBrowserCompatCustomActionResultReceiver = chunkHolderAudioAttributesCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver();
        loggedUser.isEmailVerified();
        boolean zIconCompatParcelizer = updateShuffleButton.IconCompatParcelizer(strAsSingleEntity);
        HashMap map = new HashMap();
        map.put("Identity", info.getId());
        map.put("first_name", info.getFirstName());
        map.put("last_name", info.getLastName());
        map.put("Email", loggedUser.getEmail());
        if (!zIconCompatParcelizer) {
            strAsSingleEntity = "";
        }
        map.put("Phone", strAsSingleEntity);
        String collegeName2 = "NA";
        map.put("college_id", college != null ? college.getCollegeId() : "NA");
        if (college == null) {
            collegeName = "NA";
        } else {
            collegeName = college.getCollegeName();
        }
        map.put("college_name", collegeName);
        if (college == null) {
            stateId = "NA";
        } else {
            stateId = college.getStateId();
        }
        map.put("state_id", stateId);
        if (college == null) {
            country = "NA";
        } else {
            country = college.getCountry();
        }
        map.put("country", country);
        map.put("current_course_id", Integer.toString(getstreampositionusforcontentIconCompatParcelizer.onRemoveQueueItem()));
        map.put("current_edition_id", Integer.toString(getstreampositionusforcontentIconCompatParcelizer.onPrepareFromUri()));
        map.put("sign_up_date", new Date(info.getCreatedOn()));
        if (college == null) {
            yearOfAdmission = "NA";
        } else {
            yearOfAdmission = college.getYearOfAdmission();
        }
        map.put(College.KEY_ADMISSION_YEAR, yearOfAdmission);
        map.put("$CleverTap_user_id", info.getId());
        long jR8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8 = getstreampositionusforcontentIconCompatParcelizer.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8();
        if (jR8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8 > 0) {
            map.put("notes_purchased_date", new Date(jR8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8));
        }
        for (String[] strArr : strArrMediaBrowserCompatCustomActionResultReceiver) {
            String str = strArr[1];
            Date date = new Date(Long.parseLong(strArr[2]));
            StringBuilder sb = new StringBuilder();
            sb.append(loggedUser.getCourseId());
            sb.append("_");
            sb.append(str);
            sb.append("_expiry");
            map.put(sb.toString(), date);
        }
        if (college == null) {
            collegeId = "NA";
        } else {
            collegeId = college.getCollegeId();
        }
        map.put("college_id", collegeId);
        if (college != null) {
            collegeName2 = college.getCollegeName();
        }
        map.put("college_name", collegeName2);
        map.put("qbank_completion", String.valueOf(i));
        map.put("test_completion", String.valueOf(i3));
        map.put("video_completion", String.valueOf(i2));
        map.put("bookmark_count", String.valueOf(i4));
        map.put("IsQBankActive", String.valueOf(chunkHolderAudioAttributesCompatParcelizer.IconCompatParcelizer("mcq")));
        map.put("IsTestActive", String.valueOf(chunkHolderAudioAttributesCompatParcelizer.IconCompatParcelizer("test")));
        map.put("IsVideoActive", String.valueOf(chunkHolderAudioAttributesCompatParcelizer.IconCompatParcelizer("video")));
        return map;
    }

    public static Map<String, Object> AudioAttributesCompatParcelizer(getLocaleLanguageTagV21 getlocalelanguagetagv21, int i, int i2, int i3, int i4) {
        ChunkHolder chunkHolderAudioAttributesCompatParcelizer = DefaultTrackNameProvider.AudioAttributesCompatParcelizer(TrainingApplication.read());
        getStreamPositionUsForContent getstreampositionusforcontentIconCompatParcelizer = DefaultTrackNameProvider.IconCompatParcelizer(TrainingApplication.read());
        chunkHolderAudioAttributesCompatParcelizer.IconCompatParcelizer();
        String[][] strArrMediaBrowserCompatCustomActionResultReceiver = chunkHolderAudioAttributesCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver();
        HashMap map = new HashMap();
        map.put("Identity", getlocalelanguagetagv21.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver());
        map.put("first_name", getlocalelanguagetagv21.AudioAttributesImplApi21Parcelizer());
        map.put("last_name", getlocalelanguagetagv21.MediaDescriptionCompat());
        map.put("Email", getlocalelanguagetagv21.MediaBrowserCompatItemReceiver());
        map.put("Phone", getlocalelanguagetagv21.onAddQueueItem().getCountryCode());
        map.put("college_id", getlocalelanguagetagv21.read());
        map.put("college_name", getlocalelanguagetagv21.IconCompatParcelizer());
        map.put("state_id", getlocalelanguagetagv21.onCustomAction());
        map.put("country", getlocalelanguagetagv21.write());
        map.put("current_course_id", Integer.toString(getstreampositionusforcontentIconCompatParcelizer.onRemoveQueueItem()));
        map.put("current_edition_id", Integer.toString(getstreampositionusforcontentIconCompatParcelizer.onPrepareFromUri()));
        map.put("sign_up_date", new Date(getlocalelanguagetagv21.AudioAttributesCompatParcelizer()));
        map.put(College.KEY_ADMISSION_YEAR, getlocalelanguagetagv21.onPlay());
        map.put("$CleverTap_user_id", getlocalelanguagetagv21.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver());
        long jR8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8 = getstreampositionusforcontentIconCompatParcelizer.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8();
        if (jR8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8 > 0) {
            map.put("notes_purchased_date", new Date(jR8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8));
        }
        for (String[] strArr : strArrMediaBrowserCompatCustomActionResultReceiver) {
            String str = strArr[1];
            Date date = new Date(Long.parseLong(strArr[2]));
            StringBuilder sb = new StringBuilder();
            sb.append(getlocalelanguagetagv21.RemoteActionCompatParcelizer());
            sb.append("_");
            sb.append(str);
            sb.append("_expiry");
            map.put(sb.toString(), date);
        }
        map.put("college_id", getlocalelanguagetagv21.read());
        map.put("college_name", getlocalelanguagetagv21.IconCompatParcelizer());
        map.put("qbank_completion", String.valueOf(i));
        map.put("test_completion", String.valueOf(i3));
        map.put("video_completion", String.valueOf(i2));
        map.put("bookmark_count", String.valueOf(i4));
        map.put("IsQBankActive", String.valueOf(chunkHolderAudioAttributesCompatParcelizer.IconCompatParcelizer("mcq")));
        map.put("IsTestActive", String.valueOf(chunkHolderAudioAttributesCompatParcelizer.IconCompatParcelizer("test")));
        map.put("IsVideoActive", String.valueOf(chunkHolderAudioAttributesCompatParcelizer.IconCompatParcelizer("video")));
        return map;
    }

    public static void write() {
        Bundle bundle = new Bundle();
        for (String[] strArr : DefaultTrackNameProvider.AudioAttributesCompatParcelizer(TrainingApplication.read()).RemoteActionCompatParcelizer()) {
            String str = strArr[1];
            Date date = new Date(Long.parseLong(strArr[2]));
            String str2 = strArr[3];
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("_");
            sb.append(str2);
            sb.append("_expiryDate");
            String string = sb.toString();
            if (RemoteActionCompatParcelizer(date)) {
                bundle.putString(string, date.toString());
            }
        }
        if (bundle.size() > 0) {
            bundle.putString("platform", "and");
            bundle.putString(LogSubCategory.Context.DEVICE, updateShuffleButton.AudioAttributesCompatParcelizer(TrainingApplication.read()));
            write.read(bundle);
        }
    }

    public static void read() {
        String[][] strArrRemoteActionCompatParcelizer = DefaultTrackNameProvider.AudioAttributesCompatParcelizer(TrainingApplication.read()).RemoteActionCompatParcelizer();
        Bundle bundle = new Bundle();
        for (String[] strArr : strArrRemoteActionCompatParcelizer) {
            String str = strArr[1];
            Date date = new Date(Long.parseLong(strArr[2]));
            String str2 = strArr[3];
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("_");
            sb.append(str2);
            sb.append("_expiryDate");
            bundle.putString(sb.toString(), date.toString());
        }
        write.AudioAttributesCompatParcelizer(bundle);
    }

    private static boolean RemoteActionCompatParcelizer(Date date) {
        long days = TimeUnit.MILLISECONDS.toDays(Calendar.getInstance().getTime().getTime() - date.getTime());
        return days >= -30 && days <= 14;
    }

    public static void write(String str) {
        write(str, null);
    }

    public static void write(String str, HashMap<String, Object> map) {
        if (map == null) {
            map = new HashMap<>();
        }
        if (write == null) {
            write = TrainingApplication.read().MediaDescriptionCompat();
        }
        map.put("platform", "and");
        map.put(LogSubCategory.Context.DEVICE, updateShuffleButton.AudioAttributesCompatParcelizer(TrainingApplication.read()));
        try {
            map.put(FilterParams.KEY_COURSE_ID, Integer.valueOf(write.onRemoveQueueItem()));
        } catch (Exception e) {
            buildResolutionString.IconCompatParcelizer("fb_event_error", e.getMessage());
        }
        getSelectedFormat.RemoteActionCompatParcelizer().read(str, map);
    }

    @Deprecated
    public static void IconCompatParcelizer(String str, Map<String, Object> map) {
        RemoteActionCompatParcelizer(map);
        final JSONObject jSONObject = new JSONObject();
        map.forEach(new BiConsumer() { // from class: o.onDiscontinuity
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) throws JSONException {
                jSONObject.putOpt((String) obj, obj2);
            }
        });
        getSelectedFormat.read().read(str, jSONObject);
    }

    private static void RemoteActionCompatParcelizer(Map<String, Object> map) {
        if (write == null) {
            write = TrainingApplication.read().MediaDescriptionCompat();
        }
        map.put("build_version", 496);
        map.put(FilterParams.KEY_COURSE_ID, Integer.valueOf(write.onRemoveQueueItem()));
        map.put("edition", Integer.valueOf(write.onPrepareFromUri()));
        map.put("platform", LogSubCategory.LifeCycle.ANDROID);
        map.put("app_device_id", updateShuffleButton.AudioAttributesCompatParcelizer(TrainingApplication.read()));
    }

    public static void write(boolean z) {
        HashMap map = new HashMap();
        map.put("plan", z ? "free" : "pro");
        write("EOI", map);
    }

    public static void IconCompatParcelizer(String str, String str2) {
        HashMap map = new HashMap();
        map.put("content_type", str);
        map.put(DownloadService.KEY_CONTENT_ID, str2);
        write("deep_link", map);
    }

    public static void write(long j) {
        HashMap map = new HashMap();
        map.put("consent_date", parseEac3SupplementalProperties.write(j, "dd-MM-yyyy HH:mm"));
        write("consent_captured", map);
    }

    public static class write {
        private static void read(String str) {
            read(str, null);
        }

        private static void read(String str, Bundle bundle) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            if (getLatestBitrateEstimate.write == null) {
                getLatestBitrateEstimate.write = TrainingApplication.read().MediaDescriptionCompat();
            }
            try {
                bundle.putInt(FilterParams.KEY_COURSE_ID, getLatestBitrateEstimate.write.onRemoveQueueItem());
            } catch (Exception e) {
                buildResolutionString.IconCompatParcelizer("fb_event_error", e.getMessage());
            }
            getSelectedFormat.IconCompatParcelizer().IconCompatParcelizer(str, bundle);
            resumeLoad resumeload = resumeLoad.read;
            RtspMediaPeriodSampleStreamImpl.write(str);
        }

        public static void write() {
            read("EOI");
        }

        public static void read(Bundle bundle) {
            read("renew", bundle);
        }

        public static void IconCompatParcelizer(String str, long j, String str2) {
            Bundle bundle = new Bundle();
            bundle.putString("origin", str);
            bundle.putLong("timeline", j);
            read("subscription_list", bundle);
            if (str2.equals(User.SPECIALTY_SECOND_YEAR) || str2.equals(User.SPECIALTY_THIRD_YEAR)) {
                Bundle bundle2 = (Bundle) bundle.clone();
                bundle2.putString("academic_year", str2);
                read("Pro24", bundle2);
            }
        }

        public static void read(String str, String str2, double d) {
            Bundle bundle = new Bundle();
            bundle.putString("plan_id", str);
            bundle.putString("plan_group_id", str2);
            bundle.putDouble("discounted_amount", d);
            read("subscription_success", bundle);
        }

        public static void RemoteActionCompatParcelizer(String str, String str2, double d) {
            Bundle bundle = new Bundle();
            bundle.putString("plan_id", str);
            bundle.putString("plan_group_id", str2);
            bundle.putDouble("discounted_amount", d);
            read("subscription_cancel", bundle);
        }

        public static void AudioAttributesCompatParcelizer(Bundle bundle) {
            read("b2c_upgrade", bundle);
        }
    }
}
