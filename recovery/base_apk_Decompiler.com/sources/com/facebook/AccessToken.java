package com.facebook;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.marrow.data.api.models.response.user.LoggedUserResponse;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.DefaultAnalyticsCollectorExternalSyntheticLambda8;
import kotlin.DefaultAnalyticsCollectorMediaPeriodQueueTracker;
import kotlin.IntermediateLoginResponseBody;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.getMagicModuleMeta;
import kotlin.lambdaonIsLoadingChanged32;
import kotlin.lambdaonLoadError26;
import kotlin.lambdaonMediaMetadataChanged48;
import kotlin.lambdaonMetadata50;
import kotlin.lambdaonPlaybackParametersChanged44;
import kotlin.lambdaonPositionDiscontinuity43;
import kotlin.toMagicModuleMetaRepoModel;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 A2\u00020\u0001:\u0003?@AB\u0089\u0001\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0010\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0007\u0012\u0010\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0007\u0012\u0010\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0011B\u000f\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0013¢\u0006\u0002\u0010\u0014J\u0014\u0010-\u001a\u00020.2\n\u0010/\u001a\u000600j\u0002`1H\u0002J\b\u00102\u001a\u000203H\u0016J\u0013\u00104\u001a\u00020!2\b\u00105\u001a\u0004\u0018\u000106H\u0096\u0002J\b\u00107\u001a\u000203H\u0016J\b\u00108\u001a\u000209H\u0007J\b\u0010:\u001a\u00020\u0003H\u0016J\b\u0010;\u001a\u00020\u0003H\u0002J\u0018\u0010<\u001a\u00020.2\u0006\u0010=\u001a\u00020\u00132\u0006\u0010>\u001a\u000203H\u0016R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u000f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0019¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0019¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0011\u0010\u001d\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R\u0011\u0010 \u001a\u00020!8F¢\u0006\u0006\u001a\u0004\b \u0010\"R\u0011\u0010#\u001a\u00020!8F¢\u0006\u0006\u001a\u0004\b#\u0010\"R\u0011\u0010$\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0018R\u0019\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0019¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001bR\u0011\u0010'\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010*\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u0016R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u0016¨\u0006B"}, d2 = {"Lcom/facebook/AccessToken;", "Landroid/os/Parcelable;", "accessToken", "", "applicationId", "userId", "permissions", "", "declinedPermissions", "expiredPermissions", "accessTokenSource", "Lcom/facebook/AccessTokenSource;", "expirationTime", "Ljava/util/Date;", "lastRefreshTime", "dataAccessExpirationTime", "graphDomain", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Collection;Ljava/util/Collection;Ljava/util/Collection;Lcom/facebook/AccessTokenSource;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;)V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "getApplicationId", "()Ljava/lang/String;", "getDataAccessExpirationTime", "()Ljava/util/Date;", "", "getDeclinedPermissions", "()Ljava/util/Set;", "getExpiredPermissions", "expires", "getExpires", "getGraphDomain", "isDataAccessExpired", "", "()Z", "isExpired", "lastRefresh", "getLastRefresh", "getPermissions", "source", "getSource", "()Lcom/facebook/AccessTokenSource;", LoggedUserResponse.KEY_TOKEN, "getToken", "getUserId", "appendPermissions", "", "builder", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "describeContents", "", "equals", "other", "", "hashCode", "toJSONObject", "Lorg/json/JSONObject;", "toString", "tokenToString", "writeToParcel", "dest", "flags", "AccessTokenCreationCallback", "AccessTokenRefreshCallback", "Companion", "facebook-core_release"}, k = 1, mv = {1, 4, 0})
public final class AccessToken implements Parcelable {
    private final String AudioAttributesCompatParcelizer;
    private final Date AudioAttributesImplApi21Parcelizer;
    private final Set<String> AudioAttributesImplApi26Parcelizer;
    private final Date AudioAttributesImplBaseParcelizer;
    private final Set<String> MediaBrowserCompatCustomActionResultReceiver;
    private final String MediaBrowserCompatItemReceiver;
    private final String MediaBrowserCompatMediaItem;
    private final Set<String> MediaBrowserCompatSearchResultReceiver;
    private final lambdaonIsLoadingChanged32 MediaDescriptionCompat;
    private final Date MediaMetadataCompat;
    private final String RatingCompat;
    public static final AudioAttributesCompatParcelizer RemoteActionCompatParcelizer = new AudioAttributesCompatParcelizer(null);
    private static final Date read = new Date(Long.MAX_VALUE);
    private static final Date IconCompatParcelizer = new Date();
    private static final lambdaonIsLoadingChanged32 write = lambdaonIsLoadingChanged32.FACEBOOK_APPLICATION_WEB;
    public static final Parcelable.Creator<AccessToken> CREATOR = new read();

    /* JADX INFO: loaded from: classes2.dex */
    public interface RemoteActionCompatParcelizer {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from getter */
    public final Date getAudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public final Set<String> AudioAttributesImplApi21Parcelizer() {
        return this.MediaBrowserCompatSearchResultReceiver;
    }

    public final Set<String> read() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public final Set<String> MediaBrowserCompatItemReceiver() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from getter */
    public final String getRatingCompat() {
        return this.RatingCompat;
    }

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from getter */
    public final lambdaonIsLoadingChanged32 getMediaDescriptionCompat() {
        return this.MediaDescriptionCompat;
    }

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from getter */
    public final Date getMediaMetadataCompat() {
        return this.MediaMetadataCompat;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final String getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from getter */
    public final String getMediaBrowserCompatMediaItem() {
        return this.MediaBrowserCompatMediaItem;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final Date getAudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from getter */
    public final String getMediaBrowserCompatItemReceiver() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public /* synthetic */ AccessToken(String str, String str2, String str3, Collection collection, Collection collection2, Collection collection3, lambdaonIsLoadingChanged32 lambdaonisloadingchanged32, Date date, Date date2, Date date3, String str4, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(str, str2, str3, collection, collection2, collection3, lambdaonisloadingchanged32, date, date2, date3, (i & 1024) != 0 ? null : str4);
    }

    public AccessToken(String str, String str2, String str3, Collection<String> collection, Collection<String> collection2, Collection<String> collection3, lambdaonIsLoadingChanged32 lambdaonisloadingchanged32, Date date, Date date2, Date date3, String str4) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        DefaultAnalyticsCollectorExternalSyntheticLambda8.read(str, "accessToken");
        DefaultAnalyticsCollectorExternalSyntheticLambda8.read(str2, "applicationId");
        DefaultAnalyticsCollectorExternalSyntheticLambda8.read(str3, "userId");
        this.AudioAttributesImplBaseParcelizer = date == null ? read : date;
        Set<String> setUnmodifiableSet = Collections.unmodifiableSet(collection != null ? new HashSet(collection) : new HashSet());
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(setUnmodifiableSet, "");
        this.MediaBrowserCompatSearchResultReceiver = setUnmodifiableSet;
        Set<String> setUnmodifiableSet2 = Collections.unmodifiableSet(collection2 != null ? new HashSet(collection2) : new HashSet());
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(setUnmodifiableSet2, "");
        this.AudioAttributesImplApi26Parcelizer = setUnmodifiableSet2;
        Set<String> setUnmodifiableSet3 = Collections.unmodifiableSet(collection3 != null ? new HashSet(collection3) : new HashSet());
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(setUnmodifiableSet3, "");
        this.MediaBrowserCompatCustomActionResultReceiver = setUnmodifiableSet3;
        this.RatingCompat = str;
        this.MediaDescriptionCompat = lambdaonisloadingchanged32 == null ? write : lambdaonisloadingchanged32;
        this.MediaMetadataCompat = date2 == null ? IconCompatParcelizer : date2;
        this.AudioAttributesCompatParcelizer = str2;
        this.MediaBrowserCompatMediaItem = str3;
        this.AudioAttributesImplApi21Parcelizer = (date3 == null || date3.getTime() == 0) ? read : date3;
        this.MediaBrowserCompatItemReceiver = str4;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{AccessToken token:");
        sb.append(MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver());
        AudioAttributesCompatParcelizer(sb);
        sb.append("}");
        String string = sb.toString();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        return string;
    }

    public final boolean equals(Object other) {
        String str;
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccessToken)) {
            return false;
        }
        AccessToken accessToken = (AccessToken) other;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesImplBaseParcelizer, accessToken.AudioAttributesImplBaseParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.MediaBrowserCompatSearchResultReceiver, accessToken.MediaBrowserCompatSearchResultReceiver) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesImplApi26Parcelizer, accessToken.AudioAttributesImplApi26Parcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver, accessToken.MediaBrowserCompatCustomActionResultReceiver) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RatingCompat, (Object) accessToken.RatingCompat) && this.MediaDescriptionCompat == accessToken.MediaDescriptionCompat && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.MediaMetadataCompat, accessToken.MediaMetadataCompat) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) accessToken.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaBrowserCompatMediaItem, (Object) accessToken.MediaBrowserCompatMediaItem) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesImplApi21Parcelizer, accessToken.AudioAttributesImplApi21Parcelizer) && ((str = this.MediaBrowserCompatItemReceiver) != null ? toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) str, (Object) accessToken.MediaBrowserCompatItemReceiver) : accessToken.MediaBrowserCompatItemReceiver == null);
    }

    public final int hashCode() {
        int iHashCode = this.AudioAttributesImplBaseParcelizer.hashCode();
        int iHashCode2 = this.MediaBrowserCompatSearchResultReceiver.hashCode();
        int iHashCode3 = this.AudioAttributesImplApi26Parcelizer.hashCode();
        int iHashCode4 = this.MediaBrowserCompatCustomActionResultReceiver.hashCode();
        int iHashCode5 = this.RatingCompat.hashCode();
        int iHashCode6 = this.MediaDescriptionCompat.hashCode();
        int iHashCode7 = this.MediaMetadataCompat.hashCode();
        int iHashCode8 = this.AudioAttributesCompatParcelizer.hashCode();
        int iHashCode9 = this.MediaBrowserCompatMediaItem.hashCode();
        int iHashCode10 = this.AudioAttributesImplApi21Parcelizer.hashCode();
        String str = this.MediaBrowserCompatItemReceiver;
        return ((((((((((((((((((((iHashCode + 527) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + (str != null ? str.hashCode() : 0);
    }

    public final boolean RatingCompat() {
        return new Date().after(this.AudioAttributesImplBaseParcelizer);
    }

    public final JSONObject MediaBrowserCompatSearchResultReceiver() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("version", 1);
        jSONObject.put(LoggedUserResponse.KEY_TOKEN, this.RatingCompat);
        jSONObject.put("expires_at", this.AudioAttributesImplBaseParcelizer.getTime());
        jSONObject.put("permissions", new JSONArray((Collection) this.MediaBrowserCompatSearchResultReceiver));
        jSONObject.put("declined_permissions", new JSONArray((Collection) this.AudioAttributesImplApi26Parcelizer));
        jSONObject.put("expired_permissions", new JSONArray((Collection) this.MediaBrowserCompatCustomActionResultReceiver));
        jSONObject.put("last_refresh", this.MediaMetadataCompat.getTime());
        jSONObject.put("source", this.MediaDescriptionCompat.name());
        jSONObject.put("application_id", this.AudioAttributesCompatParcelizer);
        jSONObject.put("user_id", this.MediaBrowserCompatMediaItem);
        jSONObject.put("data_access_expiration_time", this.AudioAttributesImplApi21Parcelizer.getTime());
        String str = this.MediaBrowserCompatItemReceiver;
        if (str != null) {
            jSONObject.put("graph_domain", str);
        }
        return jSONObject;
    }

    private final String MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        if (lambdaonMediaMetadataChanged48.write(lambdaonPositionDiscontinuity43.INCLUDE_ACCESS_TOKENS)) {
            return this.RatingCompat;
        }
        return "ACCESS_TOKEN_REMOVED";
    }

    private final void AudioAttributesCompatParcelizer(StringBuilder sb) {
        sb.append(" permissions:");
        sb.append("[");
        sb.append(TextUtils.join(", ", this.MediaBrowserCompatSearchResultReceiver));
        sb.append("]");
    }

    public AccessToken(Parcel parcel) {
        lambdaonIsLoadingChanged32 lambdaonisloadingchanged32ValueOf;
        toMagicModuleMetaRepoModel.write(parcel, "");
        this.AudioAttributesImplBaseParcelizer = new Date(parcel.readLong());
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = arrayList;
        parcel.readStringList(arrayList2);
        ArrayList arrayList3 = arrayList;
        Set<String> setUnmodifiableSet = Collections.unmodifiableSet(new HashSet(arrayList3));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(setUnmodifiableSet, "");
        this.MediaBrowserCompatSearchResultReceiver = setUnmodifiableSet;
        arrayList.clear();
        parcel.readStringList(arrayList2);
        Set<String> setUnmodifiableSet2 = Collections.unmodifiableSet(new HashSet(arrayList3));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(setUnmodifiableSet2, "");
        this.AudioAttributesImplApi26Parcelizer = setUnmodifiableSet2;
        arrayList.clear();
        parcel.readStringList(arrayList2);
        Set<String> setUnmodifiableSet3 = Collections.unmodifiableSet(new HashSet(arrayList3));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(setUnmodifiableSet3, "");
        this.MediaBrowserCompatCustomActionResultReceiver = setUnmodifiableSet3;
        String string = parcel.readString();
        DefaultAnalyticsCollectorExternalSyntheticLambda8.write(string, LoggedUserResponse.KEY_TOKEN);
        if (string == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.RatingCompat = string;
        String string2 = parcel.readString();
        if (string2 != null) {
            lambdaonisloadingchanged32ValueOf = lambdaonIsLoadingChanged32.valueOf(string2);
        } else {
            lambdaonisloadingchanged32ValueOf = write;
        }
        this.MediaDescriptionCompat = lambdaonisloadingchanged32ValueOf;
        this.MediaMetadataCompat = new Date(parcel.readLong());
        String string3 = parcel.readString();
        DefaultAnalyticsCollectorExternalSyntheticLambda8.write(string3, "applicationId");
        if (string3 != null) {
            this.AudioAttributesCompatParcelizer = string3;
            String string4 = parcel.readString();
            DefaultAnalyticsCollectorExternalSyntheticLambda8.write(string4, "userId");
            if (string4 != null) {
                this.MediaBrowserCompatMediaItem = string4;
                this.AudioAttributesImplApi21Parcelizer = new Date(parcel.readLong());
                this.MediaBrowserCompatItemReceiver = parcel.readString();
                return;
            }
            throw new IllegalStateException("Required value was null.".toString());
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        toMagicModuleMetaRepoModel.write(dest, "");
        dest.writeLong(this.AudioAttributesImplBaseParcelizer.getTime());
        dest.writeStringList(new ArrayList(this.MediaBrowserCompatSearchResultReceiver));
        dest.writeStringList(new ArrayList(this.AudioAttributesImplApi26Parcelizer));
        dest.writeStringList(new ArrayList(this.MediaBrowserCompatCustomActionResultReceiver));
        dest.writeString(this.RatingCompat);
        dest.writeString(this.MediaDescriptionCompat.name());
        dest.writeLong(this.MediaMetadataCompat.getTime());
        dest.writeString(this.AudioAttributesCompatParcelizer);
        dest.writeString(this.MediaBrowserCompatMediaItem);
        dest.writeLong(this.AudioAttributesImplApi21Parcelizer.getTime());
        dest.writeString(this.MediaBrowserCompatItemReceiver);
    }

    /* JADX INFO: loaded from: classes2.dex */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\bH\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\f\u0010\u0003J\u0011\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u000fJ)\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00122\u0006\u0010\u0005\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0013\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0013\u0010\u0016J\u0019\u0010\u0017\u001a\u00020\u000e2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u00198\u0006¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0006\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001dR\u0014\u0010\u0013\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001fR\u0014\u0010\u0017\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001f"}, d2 = {"Lcom/facebook/AccessToken$AudioAttributesCompatParcelizer;", "", "<init>", "()V", "Lcom/facebook/AccessToken;", "p0", "read", "(Lcom/facebook/AccessToken;)Lcom/facebook/AccessToken;", "Lorg/json/JSONObject;", "write", "(Lorg/json/JSONObject;)Lcom/facebook/AccessToken;", "Landroid/os/Bundle;", "RemoteActionCompatParcelizer", "(Landroid/os/Bundle;)Lcom/facebook/AccessToken;", "", "()Lcom/facebook/AccessToken;", "", "p1", "", "AudioAttributesCompatParcelizer", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/util/List;", "", "()Z", "IconCompatParcelizer", "(Lcom/facebook/AccessToken;)V", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lo/lambdaonIsLoadingChanged32;", "Lo/lambdaonIsLoadingChanged32;", "Ljava/util/Date;", "Ljava/util/Date;"}, k = 1, mv = {1, 4, 0})
    public static final class AudioAttributesCompatParcelizer {
        private AudioAttributesCompatParcelizer() {
        }

        public /* synthetic */ AudioAttributesCompatParcelizer(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }

        @getMagicModuleMeta
        public static AccessToken read() {
            return lambdaonLoadError26.INSTANCE.read().getWrite();
        }

        @getMagicModuleMeta
        public static void IconCompatParcelizer(AccessToken p0) {
            lambdaonLoadError26.INSTANCE.read().read(p0);
        }

        @getMagicModuleMeta
        public static boolean AudioAttributesCompatParcelizer() {
            AccessToken accessTokenWrite = lambdaonLoadError26.INSTANCE.read().getWrite();
            return (accessTokenWrite == null || accessTokenWrite.RatingCompat()) ? false : true;
        }

        @getMagicModuleMeta
        public final void RemoteActionCompatParcelizer() {
            AccessToken accessTokenWrite = lambdaonLoadError26.INSTANCE.read().getWrite();
            if (accessTokenWrite != null) {
                IconCompatParcelizer(read(accessTokenWrite));
            }
        }

        private static AccessToken read(AccessToken p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return new AccessToken(p0.getRatingCompat(), p0.getAudioAttributesCompatParcelizer(), p0.getMediaBrowserCompatMediaItem(), p0.AudioAttributesImplApi21Parcelizer(), p0.read(), p0.MediaBrowserCompatItemReceiver(), p0.getMediaDescriptionCompat(), new Date(), new Date(), p0.getAudioAttributesImplApi21Parcelizer(), null, 1024, null);
        }

        @getMagicModuleMeta
        public final AccessToken RemoteActionCompatParcelizer(Bundle p0) throws JSONException {
            String string;
            toMagicModuleMetaRepoModel.write(p0, "");
            List<String> listAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(p0, "com.facebook.TokenCachingStrategy.Permissions");
            List<String> listAudioAttributesCompatParcelizer2 = AudioAttributesCompatParcelizer(p0, "com.facebook.TokenCachingStrategy.DeclinedPermissions");
            List<String> listAudioAttributesCompatParcelizer3 = AudioAttributesCompatParcelizer(p0, "com.facebook.TokenCachingStrategy.ExpiredPermissions");
            lambdaonPlaybackParametersChanged44.Companion remoteActionCompatParcelizer = lambdaonPlaybackParametersChanged44.INSTANCE;
            String strRemoteActionCompatParcelizer = lambdaonPlaybackParametersChanged44.Companion.RemoteActionCompatParcelizer(p0);
            if (DefaultAnalyticsCollectorMediaPeriodQueueTracker.IconCompatParcelizer(strRemoteActionCompatParcelizer)) {
                strRemoteActionCompatParcelizer = lambdaonMediaMetadataChanged48.write();
            }
            String str = strRemoteActionCompatParcelizer;
            lambdaonPlaybackParametersChanged44.Companion remoteActionCompatParcelizer2 = lambdaonPlaybackParametersChanged44.INSTANCE;
            String strAudioAttributesCompatParcelizer = lambdaonPlaybackParametersChanged44.Companion.AudioAttributesCompatParcelizer(p0);
            if (strAudioAttributesCompatParcelizer != null) {
                JSONObject jSONObjectAudioAttributesCompatParcelizer = DefaultAnalyticsCollectorMediaPeriodQueueTracker.AudioAttributesCompatParcelizer(strAudioAttributesCompatParcelizer);
                if (jSONObjectAudioAttributesCompatParcelizer != null) {
                    try {
                        string = jSONObjectAudioAttributesCompatParcelizer.getString("id");
                    } catch (JSONException unused) {
                        return null;
                    }
                } else {
                    string = null;
                }
                if (str != null && string != null) {
                    lambdaonPlaybackParametersChanged44.Companion remoteActionCompatParcelizer3 = lambdaonPlaybackParametersChanged44.INSTANCE;
                    return new AccessToken(strAudioAttributesCompatParcelizer, str, string, listAudioAttributesCompatParcelizer, listAudioAttributesCompatParcelizer2, listAudioAttributesCompatParcelizer3, lambdaonPlaybackParametersChanged44.Companion.IconCompatParcelizer(p0), lambdaonPlaybackParametersChanged44.INSTANCE.read(p0), lambdaonPlaybackParametersChanged44.INSTANCE.write(p0), null, null, 1024, null);
                }
            }
            return null;
        }

        @getMagicModuleMeta
        private static List<String> AudioAttributesCompatParcelizer(Bundle p0, String p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            ArrayList<String> stringArrayList = p0.getStringArrayList(p1);
            if (stringArrayList == null) {
                return IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
            }
            List<String> listUnmodifiableList = Collections.unmodifiableList(new ArrayList(stringArrayList));
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(listUnmodifiableList, "");
            return listUnmodifiableList;
        }

        @getMagicModuleMeta
        public static AccessToken write(JSONObject p0) throws JSONException {
            ArrayList arrayListWrite;
            toMagicModuleMetaRepoModel.write(p0, "");
            if (p0.getInt("version") > 1) {
                throw new lambdaonMetadata50("Unknown AccessToken serialization format.");
            }
            String string = p0.getString(LoggedUserResponse.KEY_TOKEN);
            Date date = new Date(p0.getLong("expires_at"));
            JSONArray jSONArray = p0.getJSONArray("permissions");
            JSONArray jSONArray2 = p0.getJSONArray("declined_permissions");
            JSONArray jSONArrayOptJSONArray = p0.optJSONArray("expired_permissions");
            Date date2 = new Date(p0.getLong("last_refresh"));
            String string2 = p0.getString("source");
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string2, "");
            lambdaonIsLoadingChanged32 lambdaonisloadingchanged32ValueOf = lambdaonIsLoadingChanged32.valueOf(string2);
            String string3 = p0.getString("application_id");
            String string4 = p0.getString("user_id");
            Date date3 = new Date(p0.optLong("data_access_expiration_time", 0L));
            String strOptString = p0.optString("graph_domain", null);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string3, "");
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string4, "");
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(jSONArray, "");
            List<String> listWrite = DefaultAnalyticsCollectorMediaPeriodQueueTracker.write(jSONArray);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(jSONArray2, "");
            List<String> listWrite2 = DefaultAnalyticsCollectorMediaPeriodQueueTracker.write(jSONArray2);
            if (jSONArrayOptJSONArray == null) {
                arrayListWrite = new ArrayList();
            } else {
                arrayListWrite = DefaultAnalyticsCollectorMediaPeriodQueueTracker.write(jSONArrayOptJSONArray);
            }
            return new AccessToken(string, string3, string4, listWrite, listWrite2, arrayListWrite, lambdaonisloadingchanged32ValueOf, date, date2, date3, strOptString);
        }
    }

    public static final class read implements Parcelable.Creator<AccessToken> {
        read() {
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ AccessToken createFromParcel(Parcel parcel) {
            return write(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ AccessToken[] newArray(int i) {
            return AudioAttributesCompatParcelizer(i);
        }

        private static AccessToken write(Parcel parcel) {
            toMagicModuleMetaRepoModel.write(parcel, "");
            return new AccessToken(parcel);
        }

        private static AccessToken[] AudioAttributesCompatParcelizer(int i) {
            return new AccessToken[i];
        }
    }

    @getMagicModuleMeta
    public static final AccessToken AudioAttributesCompatParcelizer() {
        return AudioAttributesCompatParcelizer.read();
    }

    @getMagicModuleMeta
    public static final boolean write() {
        return AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer();
    }
}
