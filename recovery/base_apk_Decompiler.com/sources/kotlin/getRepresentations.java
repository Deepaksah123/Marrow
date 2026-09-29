package kotlin;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import com.marrow.data.api.models.response.user.LoggedUserResponse;
import com.marrow.data.models.user.College;
import com.marrow.data.models.user.PhoneNumber;
import com.marrow.data.models.user.User;
import in.juspay.hyper.constants.LogCategory;
import in.juspay.hyper.constants.LogSubCategory;
import java.util.Arrays;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001&B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\u0007\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\bj\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t`\nH\u0014J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\rH\u0014J\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016J#\u0010\u0011\u001a\u0004\u0018\u00010\u00022\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\u0013\"\u00020\tH\u0016¢\u0006\u0002\u0010\u0014J\u0010\u0010\u000b\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0002H\u0014J\u001d\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0019H\u0014¢\u0006\u0002\u0010\u001aJ\b\u0010\u001b\u001a\u00020\tH\u0016J\u0016\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\tJ\u001b\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\t0\u00132\u0006\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0002\u0010 J&\u0010!\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\t2\u0006\u0010#\u001a\u00020\t2\u0006\u0010$\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\tJ\b\u0010%\u001a\u00020\u0019H\u0016¨\u0006'"}, d2 = {"Lcom/marrow/data/db/tables/user/UserTable;", "Lcom/marrow/data/db/tables/BaseTable;", "Lcom/marrow/data/models/user/User;", LogCategory.CONTEXT, "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "getDefinedColumns", "Ljava/util/LinkedHashMap;", "", "Lkotlin/collections/LinkedHashMap;", "convert", "cursor", "Landroid/database/Cursor;", "insert", "", "model", "queryUniqueSync", "primaryKeys", "", "([Ljava/lang/String;)Lcom/marrow/data/models/user/User;", "Landroid/content/ContentValues;", LogSubCategory.Action.USER, "newArray", "size", "", "(I)[Lcom/marrow/data/models/user/User;", "getWhereClause", "updateUserKycStatus", "kycStatus", "userId", "getPrimaryKeys", "(Lcom/marrow/data/models/user/User;)[Ljava/lang/String;", "saveUser", "firstName", "lastName", "profilePic", "deleteAll", "Companion", "data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class getRepresentations extends getIntervalUntilNextManifestRefreshMs<User> {
    public static final IconCompatParcelizer RemoteActionCompatParcelizer = new IconCompatParcelizer(null);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getRepresentations(Context context) {
        super(context, LogSubCategory.Action.USER);
        toMagicModuleMetaRepoModel.write(context, "");
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ String[] IconCompatParcelizer(User user) {
        return RemoteActionCompatParcelizer(user);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ User RemoteActionCompatParcelizer(Cursor cursor) {
        return write(cursor);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ User[] RemoteActionCompatParcelizer(int i) {
        return read(i);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ ContentValues write(User user) {
        return IconCompatParcelizer2(user);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final LinkedHashMap<String, String> RemoteActionCompatParcelizer() {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        LinkedHashMap<String, String> linkedHashMap2 = linkedHashMap;
        linkedHashMap2.put("user_id", "TEXT PRIMARY KEY NOT NULL");
        linkedHashMap2.put("firstname", "TEXT");
        linkedHashMap2.put("lastname", "TEXT");
        linkedHashMap2.put(LoggedUserResponse.KEY_PROFESSION, "TEXT");
        linkedHashMap2.put(LoggedUserResponse.KEY_SPECIALTY, "TEXT");
        linkedHashMap2.put(LoggedUserResponse.KEY_EDUCATION, "TEXT");
        linkedHashMap2.put("phone_number", "TEXT");
        linkedHashMap2.put("profile_pic", "TEXT");
        linkedHashMap2.put(LoggedUserResponse.KEY_KYC_STATUS, "INTEGER");
        linkedHashMap2.put(LoggedUserResponse.KEY_KYC_FAILURE_COUNT, "INTEGER");
        linkedHashMap2.put(LoggedUserResponse.KEY_MBBS, "TEXT");
        linkedHashMap2.put(LoggedUserResponse.KEY_CREATED_ON, "INTEGER");
        return linkedHashMap;
    }

    private static User write(Cursor cursor) {
        toMagicModuleMetaRepoModel.write(cursor, "");
        User user = new User();
        user.fromCursor(cursor);
        return user;
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final void AudioAttributesCompatParcelizer(User user) {
        super.AudioAttributesCompatParcelizer(user);
        if (user == null) {
            return;
        }
        Context contextMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextMediaBrowserCompatCustomActionResultReceiver, "");
        SharedPreferences.Editor editorEdit = embeddedEmsgTrack.AudioAttributesCompatParcelizer(contextMediaBrowserCompatCustomActionResultReceiver).edit();
        String userId = user.getUserId();
        if (userId == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        editorEdit.putString("user_id", userId);
        String firstName = user.getFirstName();
        if (firstName == null) {
            firstName = "";
        }
        editorEdit.putString("firstname", firstName);
        String lastName = user.getLastName();
        if (lastName == null) {
            lastName = "";
        }
        editorEdit.putString("lastname", lastName);
        String profession = user.getProfession();
        if (profession == null) {
            profession = "";
        }
        editorEdit.putString(LoggedUserResponse.KEY_PROFESSION, profession);
        String specialty = user.getSpecialty();
        if (specialty == null) {
            specialty = "";
        }
        editorEdit.putString(LoggedUserResponse.KEY_SPECIALTY, specialty);
        if (!user.isPhoneNumberNull()) {
            editorEdit.putString("phone_number", PhoneNumber.JsonParser.toJSON(user.getPhoneNumber()).toString());
        }
        String profilePic = user.getProfilePic();
        editorEdit.putString("profile_pic", profilePic != null ? profilePic : "");
        editorEdit.putInt(LoggedUserResponse.KEY_KYC_STATUS, user.getKycStatus());
        editorEdit.putInt(LoggedUserResponse.KEY_KYC_FAILURE_COUNT, user.getKycFailureCount());
        JSONObject json = College.INSTANCE.toJSON(user.getCollege());
        String string = json != null ? json.toString() : null;
        String str = string;
        if (str != null && str.length() != 0) {
            editorEdit.putString(LoggedUserResponse.KEY_MBBS, string);
        }
        editorEdit.putLong("created_on_v2", user.getCreatedOn());
        editorEdit.apply();
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final User a_(String... strArr) {
        toMagicModuleMetaRepoModel.write(strArr, "");
        Context contextMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextMediaBrowserCompatCustomActionResultReceiver, "");
        SharedPreferences sharedPreferencesAudioAttributesCompatParcelizer = embeddedEmsgTrack.AudioAttributesCompatParcelizer(contextMediaBrowserCompatCustomActionResultReceiver);
        if (sharedPreferencesAudioAttributesCompatParcelizer.contains("user_id")) {
            User user = new User();
            user.setId(sharedPreferencesAudioAttributesCompatParcelizer.getString("user_id", ""));
            user.setFirstName(sharedPreferencesAudioAttributesCompatParcelizer.getString("firstname", ""));
            user.setLastName(sharedPreferencesAudioAttributesCompatParcelizer.getString("lastname", ""));
            user.setProfilePic(sharedPreferencesAudioAttributesCompatParcelizer.getString("profile_pic", ""));
            user.setProfession(sharedPreferencesAudioAttributesCompatParcelizer.getString(LoggedUserResponse.KEY_PROFESSION, ""));
            user.setSpecialty(sharedPreferencesAudioAttributesCompatParcelizer.getString(LoggedUserResponse.KEY_SPECIALTY, ""));
            if (sharedPreferencesAudioAttributesCompatParcelizer.contains(LoggedUserResponse.KEY_KYC_STATUS)) {
                user.setKycStatus(sharedPreferencesAudioAttributesCompatParcelizer.getInt(LoggedUserResponse.KEY_KYC_STATUS, 0));
            }
            if (sharedPreferencesAudioAttributesCompatParcelizer.contains(LoggedUserResponse.KEY_KYC_FAILURE_COUNT)) {
                user.setKycFailureCount(sharedPreferencesAudioAttributesCompatParcelizer.getInt(LoggedUserResponse.KEY_KYC_FAILURE_COUNT, 0));
            }
            user.setCreatedOn(sharedPreferencesAudioAttributesCompatParcelizer.contains("created_on_v2") ? sharedPreferencesAudioAttributesCompatParcelizer.getLong("created_on_v2", 0L) : 0L);
            String string = sharedPreferencesAudioAttributesCompatParcelizer.getString("phone_number", "");
            String string2 = sharedPreferencesAudioAttributesCompatParcelizer.getString(LoggedUserResponse.KEY_MBBS, "");
            String str = string2;
            user.setCollege(College.INSTANCE.fromJSON((str == null || str.length() == 0) ? new JSONObject() : new JSONObject(string2)));
            String str2 = string;
            user.setPhoneNumber(PhoneNumber.JsonParser.fromJSON((str2 == null || str2.length() == 0) ? new JSONObject() : new JSONObject(string)));
            return user;
        }
        embeddedEmsgTrack.IconCompatParcelizer("user_table");
        return (User) super.a_((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: avoid collision after fix types in other method */
    private static ContentValues IconCompatParcelizer2(User user) {
        toMagicModuleMetaRepoModel.write(user, "");
        ContentValues contentValues = new ContentValues();
        contentValues.put("user_id", user.getId());
        contentValues.put("firstname", user.getFirstName());
        contentValues.put("lastname", user.getLastName());
        contentValues.put("profile_pic", user.getProfilePic());
        contentValues.put(LoggedUserResponse.KEY_KYC_STATUS, Integer.valueOf(user.getKycStatus()));
        contentValues.put(LoggedUserResponse.KEY_KYC_FAILURE_COUNT, Integer.valueOf(user.getKycFailureCount()));
        contentValues.put(LoggedUserResponse.KEY_CREATED_ON, Long.valueOf(user.getCreatedOn()));
        JSONObject json = College.INSTANCE.toJSON(user.getCollege());
        if (json != null) {
            contentValues.put(LoggedUserResponse.KEY_MBBS, json.toString());
        }
        if (!user.isPhoneNumberNull()) {
            contentValues.put("phone_number", PhoneNumber.JsonParser.toJSON(user.getPhoneNumber()).toString());
        }
        contentValues.put(LoggedUserResponse.KEY_PROFESSION, user.getProfession());
        contentValues.put(LoggedUserResponse.KEY_SPECIALTY, user.getSpecialty());
        return contentValues;
    }

    private static User[] read(int i) {
        return new User[i];
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final String MediaBrowserCompatSearchResultReceiver() {
        return "user_id =? ";
    }

    public final void write(int i, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        Context contextMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextMediaBrowserCompatCustomActionResultReceiver, "");
        SharedPreferences.Editor editorEdit = embeddedEmsgTrack.AudioAttributesCompatParcelizer(contextMediaBrowserCompatCustomActionResultReceiver).edit();
        editorEdit.putInt(LoggedUserResponse.KEY_KYC_STATUS, i);
        editorEdit.putString("user_id", str);
        editorEdit.apply();
        ContentValues contentValues = new ContentValues();
        contentValues.put(LoggedUserResponse.KEY_KYC_STATUS, Integer.valueOf(i));
        RemoteActionCompatParcelizer(contentValues, "user_id", str);
    }

    private static String[] RemoteActionCompatParcelizer(User user) {
        toMagicModuleMetaRepoModel.write(user, "");
        String id = user.getId();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(id, "");
        return new String[]{id};
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final int ah_() {
        Context contextMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextMediaBrowserCompatCustomActionResultReceiver, "");
        SharedPreferences.Editor editorEdit = embeddedEmsgTrack.AudioAttributesCompatParcelizer(contextMediaBrowserCompatCustomActionResultReceiver).edit();
        editorEdit.clear();
        editorEdit.apply();
        return super.ah_();
    }

    /* JADX INFO: loaded from: classes3.dex */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/getRepresentations$IconCompatParcelizer;", "", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class IconCompatParcelizer {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
