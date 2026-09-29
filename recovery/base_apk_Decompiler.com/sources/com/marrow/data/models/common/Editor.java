package com.marrow.data.models.common;

import android.text.TextUtils;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.marrow.data.models.test.TopUser;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.DownloadHelper2;
import kotlin.DownloadHelperExternalSyntheticLambda2;
import kotlin.DownloadHelperExternalSyntheticLambda4;
import kotlin.notifyManifestPublishTimeExpired;
import kotlin.parseDolbyChannelConfiguration;
import kotlin.sendRemoveDownload;
import kotlin.sendSetStopReason;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class Editor implements notifyManifestPublishTimeExpired {
    private static final String KEY_DESIGNATION = "designation";
    private static final String KEY_FIRST_NAME = "fname";
    private static final String KEY_LAST_NAME = "lname";
    private static final String KEY_PROFILE_PIC = "profile_pic";
    private static final String KEY_QUALIFICATION = "qualification";
    private static final String KEY_QUOTE = "quote";
    private static final String KEY_VIDEO_INTRO = "intro";

    @JsonProperty(KEY_DESIGNATION)
    private String mDesignation;

    @JsonProperty("fname")
    private String mFirstName;

    @JsonProperty(KEY_VIDEO_INTRO)
    private String mIntroduction;

    @JsonProperty("lname")
    private String mLastName;

    @JsonProperty("profile_pic")
    private String mProfilePicture;

    @JsonProperty(KEY_QUALIFICATION)
    private String mQualification;

    @JsonProperty(KEY_QUOTE)
    private String mQuote;

    public String getDisplayname() {
        String string;
        if (TextUtils.isEmpty(this.mFirstName)) {
            string = "";
        } else {
            string = this.mFirstName;
        }
        if (!TextUtils.isEmpty(this.mLastName)) {
            StringBuilder sb = new StringBuilder();
            sb.append(string);
            sb.append(" ");
            sb.append(this.mLastName);
            string = sb.toString();
        }
        return parseDolbyChannelConfiguration.IconCompatParcelizer(string.trim());
    }

    public String getQualification() {
        return this.mQualification;
    }

    public String getDesignation() {
        return this.mDesignation;
    }

    public String getProfilePicture() {
        return this.mProfilePicture;
    }

    public String getQuote() {
        return this.mQuote;
    }

    public String getVideoIntro() {
        return this.mIntroduction;
    }

    public JSONObject toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("fname", this.mFirstName);
            jSONObject.put("lname", this.mLastName);
            jSONObject.put(KEY_QUALIFICATION, this.mQualification);
            jSONObject.put(KEY_DESIGNATION, this.mDesignation);
            jSONObject.put("profile_pic", this.mProfilePicture);
            jSONObject.put(KEY_QUOTE, this.mQuote);
            jSONObject.put(KEY_VIDEO_INTRO, this.mIntroduction);
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return jSONObject;
        }
    }

    public String toEditorInfoJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("fname", this.mFirstName);
            jSONObject.put("lname", this.mLastName);
            jSONObject.put(KEY_DESIGNATION, this.mDesignation);
            jSONObject.put(KEY_VIDEO_INTRO, this.mIntroduction);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }

    @Override // kotlin.notifyManifestPublishTimeExpired
    public void fromJSON(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        this.mFirstName = jSONObject.optString("fname");
        this.mLastName = jSONObject.optString("lname");
        this.mQualification = jSONObject.optString(KEY_QUALIFICATION);
        this.mDesignation = jSONObject.optString(KEY_DESIGNATION);
        this.mProfilePicture = jSONObject.optString("profile_pic");
        this.mQuote = jSONObject.optString(KEY_QUOTE);
        this.mIntroduction = jSONObject.optString(KEY_VIDEO_INTRO);
    }

    public static List<Editor> fromJSONArray(String str) {
        JSONArray jSONArray;
        try {
            jSONArray = new JSONArray(str);
        } catch (JSONException e) {
            e.printStackTrace();
            jSONArray = null;
        }
        if (jSONArray == null) {
            return new ArrayList();
        }
        int length = jSONArray.length();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < length; i++) {
            Editor editor = new Editor();
            editor.fromJSON(jSONArray.optJSONObject(i));
            arrayList.add(editor);
        }
        return arrayList;
    }

    public static String toJSON(List<? extends Editor> list) {
        JSONArray jSONArray = new JSONArray();
        if (list != null) {
            Iterator<? extends Editor> it = list.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next().toJSON());
            }
        }
        return jSONArray.toString();
    }

    public boolean isRanker() {
        if (TextUtils.isEmpty(this.mQualification)) {
            return false;
        }
        return this.mQualification.toLowerCase().contains(TopUser.KEY_RANK);
    }

    public static boolean hasInfo(Editor editor) {
        String str;
        return (editor == null || (str = editor.mFirstName) == null || str.length() <= 0) ? false : true;
    }

    public static Editor dummyEditor() {
        Editor editor = new Editor();
        editor.mQualification = "MD, Internal Medicine";
        editor.mFirstName = "Dr. Deepu";
        editor.mLastName = "Sebin";
        editor.mDesignation = "Course Director, Clinical Subjects";
        editor.mQuote = "Instead of just blaming Flake, though, let\"s remember every single \"senator who voted.";
        editor.mProfilePicture = "_no_profile_pic_url";
        return editor;
    }

    public final /* synthetic */ void write(DownloadHelper2 downloadHelper2, sendSetStopReason sendsetstopreason) throws IOException {
        downloadHelper2.RemoteActionCompatParcelizer();
        RemoteActionCompatParcelizer(downloadHelper2, sendsetstopreason);
        downloadHelper2.IconCompatParcelizer();
    }

    private /* synthetic */ void RemoteActionCompatParcelizer(DownloadHelper2 downloadHelper2, sendSetStopReason sendsetstopreason) throws IOException {
        if (this != this.mDesignation) {
            sendsetstopreason.IconCompatParcelizer(downloadHelper2, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO);
            downloadHelper2.AudioAttributesCompatParcelizer(this.mDesignation);
        }
        if (this != this.mFirstName) {
            sendsetstopreason.IconCompatParcelizer(downloadHelper2, 74);
            downloadHelper2.AudioAttributesCompatParcelizer(this.mFirstName);
        }
        if (this != this.mIntroduction) {
            sendsetstopreason.IconCompatParcelizer(downloadHelper2, 151);
            downloadHelper2.AudioAttributesCompatParcelizer(this.mIntroduction);
        }
        if (this != this.mLastName) {
            sendsetstopreason.IconCompatParcelizer(downloadHelper2, 185);
            downloadHelper2.AudioAttributesCompatParcelizer(this.mLastName);
        }
        if (this != this.mProfilePicture) {
            sendsetstopreason.IconCompatParcelizer(downloadHelper2, 87);
            downloadHelper2.AudioAttributesCompatParcelizer(this.mProfilePicture);
        }
        if (this != this.mQualification) {
            sendsetstopreason.IconCompatParcelizer(downloadHelper2, 153);
            downloadHelper2.AudioAttributesCompatParcelizer(this.mQualification);
        }
        if (this != this.mQuote) {
            sendsetstopreason.IconCompatParcelizer(downloadHelper2, 126);
            downloadHelper2.AudioAttributesCompatParcelizer(this.mQuote);
        }
    }

    public final /* synthetic */ void write(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4, sendRemoveDownload sendremovedownload) throws IOException {
        downloadHelperExternalSyntheticLambda4.AudioAttributesCompatParcelizer();
        while (downloadHelperExternalSyntheticLambda4.AudioAttributesImplApi21Parcelizer()) {
            write(downloadHelperExternalSyntheticLambda4, sendremovedownload.AudioAttributesCompatParcelizer(downloadHelperExternalSyntheticLambda4));
        }
        downloadHelperExternalSyntheticLambda4.RemoteActionCompatParcelizer();
    }

    private /* synthetic */ void write(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4, int i) throws IOException {
        boolean z = downloadHelperExternalSyntheticLambda4.onCustomAction() != DownloadHelperExternalSyntheticLambda2.NULL;
        if (i == 8) {
            if (!z) {
                this.mProfilePicture = null;
                downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                return;
            } else if (downloadHelperExternalSyntheticLambda4.onCustomAction() != DownloadHelperExternalSyntheticLambda2.BOOLEAN) {
                this.mProfilePicture = downloadHelperExternalSyntheticLambda4.MediaBrowserCompatSearchResultReceiver();
                return;
            } else {
                this.mProfilePicture = Boolean.toString(downloadHelperExternalSyntheticLambda4.AudioAttributesImplApi26Parcelizer());
                return;
            }
        }
        if (i == 19) {
            if (!z) {
                this.mLastName = null;
                downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                return;
            } else if (downloadHelperExternalSyntheticLambda4.onCustomAction() != DownloadHelperExternalSyntheticLambda2.BOOLEAN) {
                this.mLastName = downloadHelperExternalSyntheticLambda4.MediaBrowserCompatSearchResultReceiver();
                return;
            } else {
                this.mLastName = Boolean.toString(downloadHelperExternalSyntheticLambda4.AudioAttributesImplApi26Parcelizer());
                return;
            }
        }
        if (i == 25) {
            if (!z) {
                this.mIntroduction = null;
                downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                return;
            } else if (downloadHelperExternalSyntheticLambda4.onCustomAction() != DownloadHelperExternalSyntheticLambda2.BOOLEAN) {
                this.mIntroduction = downloadHelperExternalSyntheticLambda4.MediaBrowserCompatSearchResultReceiver();
                return;
            } else {
                this.mIntroduction = Boolean.toString(downloadHelperExternalSyntheticLambda4.AudioAttributesImplApi26Parcelizer());
                return;
            }
        }
        if (i == 39) {
            if (!z) {
                this.mQualification = null;
                downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                return;
            } else if (downloadHelperExternalSyntheticLambda4.onCustomAction() != DownloadHelperExternalSyntheticLambda2.BOOLEAN) {
                this.mQualification = downloadHelperExternalSyntheticLambda4.MediaBrowserCompatSearchResultReceiver();
                return;
            } else {
                this.mQualification = Boolean.toString(downloadHelperExternalSyntheticLambda4.AudioAttributesImplApi26Parcelizer());
                return;
            }
        }
        if (i == 56) {
            if (!z) {
                this.mFirstName = null;
                downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                return;
            } else if (downloadHelperExternalSyntheticLambda4.onCustomAction() != DownloadHelperExternalSyntheticLambda2.BOOLEAN) {
                this.mFirstName = downloadHelperExternalSyntheticLambda4.MediaBrowserCompatSearchResultReceiver();
                return;
            } else {
                this.mFirstName = Boolean.toString(downloadHelperExternalSyntheticLambda4.AudioAttributesImplApi26Parcelizer());
                return;
            }
        }
        if (i == 68) {
            if (!z) {
                this.mQuote = null;
                downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                return;
            } else if (downloadHelperExternalSyntheticLambda4.onCustomAction() != DownloadHelperExternalSyntheticLambda2.BOOLEAN) {
                this.mQuote = downloadHelperExternalSyntheticLambda4.MediaBrowserCompatSearchResultReceiver();
                return;
            } else {
                this.mQuote = Boolean.toString(downloadHelperExternalSyntheticLambda4.AudioAttributesImplApi26Parcelizer());
                return;
            }
        }
        if (i != 161) {
            downloadHelperExternalSyntheticLambda4.handleMediaPlayPauseIfPendingOnHandler();
            return;
        }
        if (!z) {
            this.mDesignation = null;
            downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
        } else if (downloadHelperExternalSyntheticLambda4.onCustomAction() != DownloadHelperExternalSyntheticLambda2.BOOLEAN) {
            this.mDesignation = downloadHelperExternalSyntheticLambda4.MediaBrowserCompatSearchResultReceiver();
        } else {
            this.mDesignation = Boolean.toString(downloadHelperExternalSyntheticLambda4.AudioAttributesImplApi26Parcelizer());
        }
    }
}
