package kotlin;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.marrow.data.api.models.response.user.LoggedUserResponse;
import com.marrow.data.models.preference.Preference;
import com.marrow.data.models.user.LoggedUser;
import in.juspay.hyper.constants.LogCategory;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 /2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001/B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bJ\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bJ\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000fJ\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0011J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0011J\u001e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0011J\u001e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0011J\u001e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0011J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\fJ\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\bJ\u001e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0011J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u000fJ$\u0010\u0016\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0017j\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b`\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u001bH\u0014J\u0010\u0010\u0019\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0002H\u0014J\u001d\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u001f2\u0006\u0010 \u001a\u00020\fH\u0014¢\u0006\u0002\u0010!J\b\u0010\"\u001a\u00020\bH\u0016J\u001b\u0010#\u001a\b\u0012\u0004\u0012\u00020\b0\u001f2\u0006\u0010$\u001a\u00020\u0002H\u0016¢\u0006\u0002\u0010%J\u000e\u0010&\u001a\u00020\u00132\u0006\u0010'\u001a\u00020(J\u0006\u0010)\u001a\u00020\fJ\b\u0010*\u001a\u00020\fH\u0016J\u0010\u0010+\u001a\u00020\u00132\b\u0010,\u001a\u0004\u0018\u00010\bJ\u000e\u0010-\u001a\u00020\u00132\u0006\u0010.\u001a\u00020\u000f¨\u00060"}, d2 = {"Lcom/marrow/data/db/tables/preference/PreferenceTable;", "Lcom/marrow/data/db/tables/BaseTable;", "Lcom/marrow/data/models/preference/Preference;", LogCategory.CONTEXT, "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "getPreferenceString", "", "key", "def", "getPreferenceInt", "", "defaultValue", "getPreferenceLong", "", "getPreferenceBoolean", "", "updatePreference", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "isPermanent", "getDefinedColumns", "Ljava/util/LinkedHashMap;", "Lkotlin/collections/LinkedHashMap;", "convert", "cursor", "Landroid/database/Cursor;", "Landroid/content/ContentValues;", "preference", "newArray", "", "size", "(I)[Lcom/marrow/data/models/preference/Preference;", "getWhereClause", "getPrimaryKeys", "model", "(Lcom/marrow/data/models/preference/Preference;)[Ljava/lang/String;", "saveLoggedUser", "loggedUser", "Lcom/marrow/data/models/user/LoggedUser;", "deleteTempValues", "deleteAll", "setAddVideoToPlanBJson", "json", "setLastPlanUpgradeTimeMillis", "millis", "Companion", "data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class getAvailableSegmentCount extends getIntervalUntilNextManifestRefreshMs<Preference> {
    public static final IconCompatParcelizer IconCompatParcelizer = new IconCompatParcelizer(null);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getAvailableSegmentCount(Context context) {
        super(context, "_preference");
        toMagicModuleMetaRepoModel.write(context, "");
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* bridge */ /* synthetic */ String[] IconCompatParcelizer(Preference preference) {
        return IconCompatParcelizer2(preference);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ Preference RemoteActionCompatParcelizer(Cursor cursor) {
        return IconCompatParcelizer(cursor);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ Preference[] RemoteActionCompatParcelizer(int i) {
        return read(i);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ ContentValues write(Preference preference) {
        return RemoteActionCompatParcelizer(preference);
    }

    public final String AudioAttributesImplApi21Parcelizer(String str) {
        String value;
        toMagicModuleMetaRepoModel.write(str, "");
        Context contextMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextMediaBrowserCompatCustomActionResultReceiver, "");
        if (embeddedEmsgTrack.AudioAttributesCompatParcelizer(contextMediaBrowserCompatCustomActionResultReceiver).contains(str)) {
            Context contextMediaBrowserCompatCustomActionResultReceiver2 = MediaBrowserCompatCustomActionResultReceiver();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextMediaBrowserCompatCustomActionResultReceiver2, "");
            String string = embeddedEmsgTrack.AudioAttributesCompatParcelizer(contextMediaBrowserCompatCustomActionResultReceiver2).getString(str, "");
            return string == null ? "" : string;
        }
        Preference preferenceA_ = a_(str);
        if (preferenceA_ != null) {
            embeddedEmsgTrack.IconCompatParcelizer(str);
            value = preferenceA_.getValue();
        } else {
            value = null;
        }
        return value == null ? "" : value;
    }

    public final String AudioAttributesImplBaseParcelizer(String str, String str2) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        Context contextMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextMediaBrowserCompatCustomActionResultReceiver, "");
        if (embeddedEmsgTrack.AudioAttributesCompatParcelizer(contextMediaBrowserCompatCustomActionResultReceiver).contains(str)) {
            Context contextMediaBrowserCompatCustomActionResultReceiver2 = MediaBrowserCompatCustomActionResultReceiver();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextMediaBrowserCompatCustomActionResultReceiver2, "");
            String string = embeddedEmsgTrack.AudioAttributesCompatParcelizer(contextMediaBrowserCompatCustomActionResultReceiver2).getString(str, str2);
            String str3 = string;
            return (str3 == null || str3.length() == 0) ? str2 : string;
        }
        Preference preferenceA_ = a_(str);
        if (preferenceA_ != null) {
            embeddedEmsgTrack.IconCompatParcelizer(str);
            String value = preferenceA_.getValue();
            if (value != null) {
                return value;
            }
        }
        return str2;
    }

    public final int IconCompatParcelizer(String str, int i) {
        toMagicModuleMetaRepoModel.write(str, "");
        Context contextMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextMediaBrowserCompatCustomActionResultReceiver, "");
        if (embeddedEmsgTrack.AudioAttributesCompatParcelizer(contextMediaBrowserCompatCustomActionResultReceiver).contains(str)) {
            Context contextMediaBrowserCompatCustomActionResultReceiver2 = MediaBrowserCompatCustomActionResultReceiver();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextMediaBrowserCompatCustomActionResultReceiver2, "");
            String string = embeddedEmsgTrack.AudioAttributesCompatParcelizer(contextMediaBrowserCompatCustomActionResultReceiver2).getString(str, String.valueOf(i));
            if (string != null) {
                return Integer.parseInt(string);
            }
        } else {
            Preference preferenceA_ = a_(str);
            if (preferenceA_ != null) {
                embeddedEmsgTrack.IconCompatParcelizer(str);
                return preferenceA_.getValueInt();
            }
        }
        return i;
    }

    public final long AudioAttributesCompatParcelizer(String str, long j) {
        toMagicModuleMetaRepoModel.write(str, "");
        Context contextMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextMediaBrowserCompatCustomActionResultReceiver, "");
        if (embeddedEmsgTrack.AudioAttributesCompatParcelizer(contextMediaBrowserCompatCustomActionResultReceiver).contains(str)) {
            Context contextMediaBrowserCompatCustomActionResultReceiver2 = MediaBrowserCompatCustomActionResultReceiver();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextMediaBrowserCompatCustomActionResultReceiver2, "");
            String string = embeddedEmsgTrack.AudioAttributesCompatParcelizer(contextMediaBrowserCompatCustomActionResultReceiver2).getString(str, String.valueOf(j));
            if (string != null) {
                return Long.parseLong(string);
            }
        } else {
            Preference preferenceA_ = a_(str);
            if (preferenceA_ != null) {
                embeddedEmsgTrack.IconCompatParcelizer(str);
                return preferenceA_.getValueLong();
            }
        }
        return j;
    }

    public final boolean write(String str, boolean z) {
        toMagicModuleMetaRepoModel.write(str, "");
        Context contextMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextMediaBrowserCompatCustomActionResultReceiver, "");
        if (embeddedEmsgTrack.AudioAttributesCompatParcelizer(contextMediaBrowserCompatCustomActionResultReceiver).contains(str)) {
            Context contextMediaBrowserCompatCustomActionResultReceiver2 = MediaBrowserCompatCustomActionResultReceiver();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextMediaBrowserCompatCustomActionResultReceiver2, "");
            String string = embeddedEmsgTrack.AudioAttributesCompatParcelizer(contextMediaBrowserCompatCustomActionResultReceiver2).getString(str, String.valueOf(z));
            if (string == null || string.length() == 0) {
                return z;
            }
            Locale locale = Locale.getDefault();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(locale, "");
            String lowerCase = string.toLowerCase(locale);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lowerCase, "");
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) "true", (Object) lowerCase) || toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, (Object) string);
        }
        Preference preferenceA_ = a_(str);
        if (preferenceA_ != null) {
            embeddedEmsgTrack.IconCompatParcelizer(str);
            return preferenceA_.getValueBoolean();
        }
        return z;
    }

    public final void IconCompatParcelizer(String str, boolean z) {
        toMagicModuleMetaRepoModel.write(str, "");
        Context contextMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextMediaBrowserCompatCustomActionResultReceiver, "");
        SharedPreferences.Editor editorEdit = embeddedEmsgTrack.AudioAttributesCompatParcelizer(contextMediaBrowserCompatCustomActionResultReceiver).edit();
        editorEdit.putString(str, String.valueOf(z));
        editorEdit.apply();
        Preference preference = new Preference();
        preference.setKey(str);
        preference.setValue(z);
        AudioAttributesCompatParcelizer(preference);
    }

    public final void IconCompatParcelizer(String str, long j) {
        toMagicModuleMetaRepoModel.write(str, "");
        Context contextMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextMediaBrowserCompatCustomActionResultReceiver, "");
        SharedPreferences.Editor editorEdit = embeddedEmsgTrack.AudioAttributesCompatParcelizer(contextMediaBrowserCompatCustomActionResultReceiver).edit();
        editorEdit.putString(str, String.valueOf(j));
        editorEdit.apply();
        Preference preference = new Preference();
        preference.setKey(str);
        preference.setValue(j);
        preference.setPermanent(true);
        AudioAttributesCompatParcelizer(preference);
    }

    public final void RemoteActionCompatParcelizer(String str, int i) {
        toMagicModuleMetaRepoModel.write(str, "");
        Context contextMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextMediaBrowserCompatCustomActionResultReceiver, "");
        SharedPreferences.Editor editorEdit = embeddedEmsgTrack.AudioAttributesCompatParcelizer(contextMediaBrowserCompatCustomActionResultReceiver).edit();
        editorEdit.putString(str, String.valueOf(i));
        editorEdit.apply();
        Preference preference = new Preference();
        preference.setKey(str);
        preference.setValue(i);
        preference.setPermanent(true);
        AudioAttributesCompatParcelizer(preference);
    }

    public final void AudioAttributesCompatParcelizer(String str, int i) {
        toMagicModuleMetaRepoModel.write(str, "");
        Context contextMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextMediaBrowserCompatCustomActionResultReceiver, "");
        SharedPreferences.Editor editorEdit = embeddedEmsgTrack.AudioAttributesCompatParcelizer(contextMediaBrowserCompatCustomActionResultReceiver).edit();
        editorEdit.putString(str, String.valueOf(i));
        editorEdit.apply();
        Preference preference = new Preference();
        preference.setKey(str);
        preference.setValue(i);
        AudioAttributesCompatParcelizer(preference);
    }

    public final void AudioAttributesImplApi26Parcelizer(String str, String str2) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        Context contextMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextMediaBrowserCompatCustomActionResultReceiver, "");
        SharedPreferences.Editor editorEdit = embeddedEmsgTrack.AudioAttributesCompatParcelizer(contextMediaBrowserCompatCustomActionResultReceiver).edit();
        editorEdit.putString(str, str2);
        editorEdit.apply();
        Preference preference = new Preference();
        preference.setKey(str);
        preference.setValue(str2);
        AudioAttributesCompatParcelizer(preference);
    }

    public final void AudioAttributesImplApi21Parcelizer(String str, String str2) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        Context contextMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextMediaBrowserCompatCustomActionResultReceiver, "");
        SharedPreferences.Editor editorEdit = embeddedEmsgTrack.AudioAttributesCompatParcelizer(contextMediaBrowserCompatCustomActionResultReceiver).edit();
        editorEdit.putString(str, str2);
        editorEdit.apply();
        Preference preference = new Preference();
        preference.setKey(str);
        preference.setValue(str2);
        preference.setPermanent(true);
        AudioAttributesCompatParcelizer(preference);
    }

    public final void write(String str, long j) {
        toMagicModuleMetaRepoModel.write(str, "");
        Context contextMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextMediaBrowserCompatCustomActionResultReceiver, "");
        SharedPreferences.Editor editorEdit = embeddedEmsgTrack.AudioAttributesCompatParcelizer(contextMediaBrowserCompatCustomActionResultReceiver).edit();
        editorEdit.putString(str, String.valueOf(j));
        editorEdit.apply();
        Preference preference = new Preference();
        preference.setKey(str);
        preference.setValue(j);
        AudioAttributesCompatParcelizer(preference);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final LinkedHashMap<String, String> RemoteActionCompatParcelizer() {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        LinkedHashMap<String, String> linkedHashMap2 = linkedHashMap;
        linkedHashMap2.put("_key", "TEXT PRIMARY KEY NOT NULL");
        linkedHashMap2.put("_value", "TEXT");
        linkedHashMap2.put("is_perm", "INTEGER");
        return linkedHashMap;
    }

    private static Preference IconCompatParcelizer(Cursor cursor) {
        toMagicModuleMetaRepoModel.write(cursor, "");
        Preference preference = new Preference();
        preference.setKey(getPeriodDurationMs.AudioAttributesImplApi21Parcelizer(cursor, "_key"));
        preference.setValue(getPeriodDurationMs.AudioAttributesImplApi21Parcelizer(cursor, "_value"));
        preference.setPermanent(getPeriodDurationMs.read(cursor, "is_perm"));
        return preference;
    }

    private static ContentValues RemoteActionCompatParcelizer(Preference preference) {
        toMagicModuleMetaRepoModel.write(preference, "");
        ContentValues contentValues = new ContentValues();
        contentValues.put("_key", preference.getKey());
        contentValues.put("_value", preference.getValue());
        contentValues.put("is_perm", Integer.valueOf(preference.isPermanent() ? 1 : 0));
        return contentValues;
    }

    private static Preference[] read(int i) {
        return new Preference[i];
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final String MediaBrowserCompatSearchResultReceiver() {
        return "_key =? ";
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: avoid collision after fix types in other method */
    private static String[] IconCompatParcelizer2(Preference preference) {
        toMagicModuleMetaRepoModel.write(preference, "");
        String key = preference.getKey();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(key, "");
        return new String[]{key};
    }

    public final void AudioAttributesCompatParcelizer(LoggedUser loggedUser) {
        toMagicModuleMetaRepoModel.write(loggedUser, "");
        String email = loggedUser.getEmail();
        String refreshToken = loggedUser.getRefreshToken();
        String token = loggedUser.getToken();
        if (refreshToken != null && refreshToken.length() > 0) {
            AudioAttributesImplApi26Parcelizer(LoggedUserResponse.KEY_REFRESH_TOKEN, refreshToken);
        }
        if (token != null && token.length() > 0) {
            AudioAttributesImplApi26Parcelizer("_token", token);
        }
        if (email != null && email.length() > 0) {
            AudioAttributesImplApi26Parcelizer("_email", email);
        }
        IconCompatParcelizer("is_legal_term_agreed", loggedUser.getInfo().isShowLegalPopup());
        String id = loggedUser.getInfo().getId();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(id, "");
        AudioAttributesImplApi26Parcelizer("logged_user_id", id);
        IconCompatParcelizer("email_verified", loggedUser.isEmailVerified());
        IconCompatParcelizer(LoggedUserResponse.KEY_CONSENT_REQUIRED, loggedUser.getTncConsentRequired());
        write(LoggedUserResponse.KEY_CONSENT_DATE, loggedUser.getTncConsentDate());
        IconCompatParcelizer("college_year_update", loggedUser.isYearUpdateRequired());
        IconCompatParcelizer("college_year_update", loggedUser.isYearUpdateRequired());
        AudioAttributesCompatParcelizer("key_course_id", loggedUser.getCourseId());
        AudioAttributesCompatParcelizer("default_edition_key", loggedUser.getDefaultCourseEdition());
        if (IconCompatParcelizer("current_edition", -1) == -1) {
            AudioAttributesCompatParcelizer("current_edition", loggedUser.getDefaultCourseEdition());
        }
        if (loggedUser.getUserConfig() != null) {
            String strAudioAttributesCompatParcelizer = new setDownloadingStatesToQueued().AudioAttributesCompatParcelizer(loggedUser.getUserConfig());
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strAudioAttributesCompatParcelizer, "");
            AudioAttributesImplApi26Parcelizer("user_config", strAudioAttributesCompatParcelizer);
        }
    }

    private int MediaDescriptionCompat() {
        return read("is_perm", SessionDescription.SUPPORTED_SDP_VERSION);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final int ah_() {
        Context contextMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextMediaBrowserCompatCustomActionResultReceiver, "");
        SharedPreferences.Editor editorEdit = embeddedEmsgTrack.AudioAttributesCompatParcelizer(contextMediaBrowserCompatCustomActionResultReceiver).edit();
        editorEdit.clear();
        editorEdit.apply();
        return MediaDescriptionCompat();
    }

    public final void AudioAttributesCompatParcelizer() {
        AudioAttributesImplApi26Parcelizer("upgrade_plan_v2_json", "");
    }

    public final void write() {
        write("last_upgrade_plan_sync_v2", 0L);
    }

    /* JADX INFO: loaded from: classes3.dex */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/getAvailableSegmentCount$IconCompatParcelizer;", "", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class IconCompatParcelizer {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
