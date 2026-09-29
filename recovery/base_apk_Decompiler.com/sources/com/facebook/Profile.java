package com.facebook;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.AccessToken;
import java.util.Objects;
import kotlin.DefaultAnalyticsCollectorExternalSyntheticLambda8;
import kotlin.DefaultAnalyticsCollectorMediaPeriodQueueTracker;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.getMagicModuleMeta;
import kotlin.lambdaonMetadata50;
import kotlin.lambdaonPlayerErrorChanged42;
import kotlin.toMagicModuleMetaRepoModel;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u000b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018BE\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\f¢\u0006\u0004\b\n\u0010\rB\u0011\b\u0012\u0012\u0006\u0010\u0003\u001a\u00020\u000e¢\u0006\u0004\b\n\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0003\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0017\u0010\u0012J\u000f\u0010\u0018\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u0006\n\u0004\b \u0010\u001eR\u0013\u0010!\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u0006\n\u0004\b\u001f\u0010\u001eR\u0013\u0010 \u001a\u0004\u0018\u00010\b8\u0006¢\u0006\u0006\n\u0004\b\"\u0010#R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u0006\n\u0004\b$\u0010\u001eR\u0013\u0010\"\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u0006\n\u0004\b%\u0010\u001e"}, d2 = {"Lcom/facebook/Profile;", "Landroid/os/Parcelable;", "", "p0", "p1", "p2", "p3", "p4", "Landroid/net/Uri;", "p5", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;)V", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "", "describeContents", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "AudioAttributesCompatParcelizer", "()Lorg/json/JSONObject;", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "write", "Ljava/lang/String;", "RemoteActionCompatParcelizer", "IconCompatParcelizer", "read", "AudioAttributesImplApi21Parcelizer", "Landroid/net/Uri;", "MediaBrowserCompatCustomActionResultReceiver", "AudioAttributesImplBaseParcelizer"}, k = 1, mv = {1, 4, 0})
public final class Profile implements Parcelable {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<Profile> CREATOR;
    private static final String read;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final Uri IconCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final String AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final String AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final String write;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final String read;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final String RemoteActionCompatParcelizer;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public /* synthetic */ Profile(Parcel parcel, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(parcel);
    }

    public Profile(String str, String str2, String str3, String str4, String str5, Uri uri) {
        DefaultAnalyticsCollectorExternalSyntheticLambda8.write(str, "id");
        this.AudioAttributesCompatParcelizer = str;
        this.RemoteActionCompatParcelizer = str2;
        this.write = str3;
        this.read = str4;
        this.AudioAttributesImplApi21Parcelizer = str5;
        this.IconCompatParcelizer = uri;
    }

    public final boolean equals(Object p0) {
        String str;
        String str2;
        String str3;
        String str4;
        Uri uri;
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof Profile)) {
            return false;
        }
        String str5 = this.AudioAttributesCompatParcelizer;
        return ((str5 == null && ((Profile) p0).AudioAttributesCompatParcelizer == null) || toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) str5, (Object) ((Profile) p0).AudioAttributesCompatParcelizer)) && (((str = this.RemoteActionCompatParcelizer) == null && ((Profile) p0).RemoteActionCompatParcelizer == null) || toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) str, (Object) ((Profile) p0).RemoteActionCompatParcelizer)) && ((((str2 = this.write) == null && ((Profile) p0).write == null) || toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) str2, (Object) ((Profile) p0).write)) && ((((str3 = this.read) == null && ((Profile) p0).read == null) || toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) str3, (Object) ((Profile) p0).read)) && ((((str4 = this.AudioAttributesImplApi21Parcelizer) == null && ((Profile) p0).AudioAttributesImplApi21Parcelizer == null) || toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) str4, (Object) ((Profile) p0).AudioAttributesImplApi21Parcelizer)) && (((uri = this.IconCompatParcelizer) == null && ((Profile) p0).IconCompatParcelizer == null) || toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(uri, ((Profile) p0).IconCompatParcelizer)))));
    }

    public final int hashCode() {
        String str = this.AudioAttributesCompatParcelizer;
        int iHashCode = (str != null ? str.hashCode() : 0) + 527;
        String str2 = this.RemoteActionCompatParcelizer;
        if (str2 != null) {
            iHashCode = (iHashCode * 31) + str2.hashCode();
        }
        String str3 = this.write;
        if (str3 != null) {
            iHashCode = (iHashCode * 31) + str3.hashCode();
        }
        String str4 = this.read;
        if (str4 != null) {
            iHashCode = (iHashCode * 31) + str4.hashCode();
        }
        String str5 = this.AudioAttributesImplApi21Parcelizer;
        if (str5 != null) {
            iHashCode = (iHashCode * 31) + str5.hashCode();
        }
        Uri uri = this.IconCompatParcelizer;
        return uri != null ? (iHashCode * 31) + uri.hashCode() : iHashCode;
    }

    public final JSONObject AudioAttributesCompatParcelizer() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.AudioAttributesCompatParcelizer);
            jSONObject.put("first_name", this.RemoteActionCompatParcelizer);
            jSONObject.put("middle_name", this.write);
            jSONObject.put("last_name", this.read);
            jSONObject.put("name", this.AudioAttributesImplApi21Parcelizer);
            Uri uri = this.IconCompatParcelizer;
            if (uri != null) {
                jSONObject.put("link_uri", uri.toString());
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    public Profile(JSONObject jSONObject) {
        toMagicModuleMetaRepoModel.write(jSONObject, "");
        this.AudioAttributesCompatParcelizer = jSONObject.optString("id", null);
        this.RemoteActionCompatParcelizer = jSONObject.optString("first_name", null);
        this.write = jSONObject.optString("middle_name", null);
        this.read = jSONObject.optString("last_name", null);
        this.AudioAttributesImplApi21Parcelizer = jSONObject.optString("name", null);
        String strOptString = jSONObject.optString("link_uri", null);
        this.IconCompatParcelizer = strOptString != null ? Uri.parse(strOptString) : null;
    }

    private Profile(Parcel parcel) {
        this.AudioAttributesCompatParcelizer = parcel.readString();
        this.RemoteActionCompatParcelizer = parcel.readString();
        this.write = parcel.readString();
        this.read = parcel.readString();
        this.AudioAttributesImplApi21Parcelizer = parcel.readString();
        String string = parcel.readString();
        this.IconCompatParcelizer = string == null ? null : Uri.parse(string);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel p0, int p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        p0.writeString(this.AudioAttributesCompatParcelizer);
        p0.writeString(this.RemoteActionCompatParcelizer);
        p0.writeString(this.write);
        p0.writeString(this.read);
        p0.writeString(this.AudioAttributesImplApi21Parcelizer);
        Uri uri = this.IconCompatParcelizer;
        p0.writeString(uri != null ? uri.toString() : null);
    }

    /* JADX INFO: renamed from: com.facebook.Profile$AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u0007\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\nR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b8\u0006¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0005\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/facebook/Profile$AudioAttributesCompatParcelizer;", "", "<init>", "()V", "", "AudioAttributesCompatParcelizer", "Lcom/facebook/Profile;", "IconCompatParcelizer", "()Lcom/facebook/Profile;", "p0", "(Lcom/facebook/Profile;)V", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "read", "Ljava/lang/String;"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }

        @getMagicModuleMeta
        public static Profile IconCompatParcelizer() {
            return lambdaonPlayerErrorChanged42.INSTANCE.read().getWrite();
        }

        @getMagicModuleMeta
        public static void IconCompatParcelizer(Profile p0) {
            lambdaonPlayerErrorChanged42.INSTANCE.read().IconCompatParcelizer(p0);
        }

        @getMagicModuleMeta
        public final void AudioAttributesCompatParcelizer() {
            AccessToken.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = AccessToken.RemoteActionCompatParcelizer;
            AccessToken accessToken = AccessToken.AudioAttributesCompatParcelizer.read();
            if (accessToken != null) {
                AccessToken.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer2 = AccessToken.RemoteActionCompatParcelizer;
                if (AccessToken.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer()) {
                    DefaultAnalyticsCollectorMediaPeriodQueueTracker.read(accessToken.getRatingCompat(), new IconCompatParcelizer());
                } else {
                    IconCompatParcelizer(null);
                }
            }
        }

        /* JADX INFO: renamed from: com.facebook.Profile$AudioAttributesCompatParcelizer$IconCompatParcelizer */
        public static final class IconCompatParcelizer implements DefaultAnalyticsCollectorMediaPeriodQueueTracker.write {
            IconCompatParcelizer() {
            }

            @Override // o.DefaultAnalyticsCollectorMediaPeriodQueueTracker.write
            public final void IconCompatParcelizer(JSONObject jSONObject) {
                String strOptString = jSONObject != null ? jSONObject.optString("id") : null;
                if (strOptString == null) {
                    String unused = Profile.read;
                    return;
                }
                String strOptString2 = jSONObject.optString("link");
                Profile profile = new Profile(strOptString, jSONObject.optString("first_name"), jSONObject.optString("middle_name"), jSONObject.optString("last_name"), jSONObject.optString("name"), strOptString2 != null ? Uri.parse(strOptString2) : null);
                Companion companion = Profile.INSTANCE;
                Companion.IconCompatParcelizer(profile);
            }

            @Override // o.DefaultAnalyticsCollectorMediaPeriodQueueTracker.write
            public final void RemoteActionCompatParcelizer(lambdaonMetadata50 lambdaonmetadata50) {
                String unused = Profile.read;
                Objects.toString(lambdaonmetadata50);
            }
        }
    }

    static {
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer("Profile", "");
        read = "Profile";
        CREATOR = new IconCompatParcelizer();
    }

    public static final class IconCompatParcelizer implements Parcelable.Creator<Profile> {
        IconCompatParcelizer() {
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Profile createFromParcel(Parcel parcel) {
            return RemoteActionCompatParcelizer(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Profile[] newArray(int i) {
            return AudioAttributesCompatParcelizer(i);
        }

        private static Profile RemoteActionCompatParcelizer(Parcel parcel) {
            toMagicModuleMetaRepoModel.write(parcel, "");
            return new Profile(parcel, null);
        }

        private static Profile[] AudioAttributesCompatParcelizer(int i) {
            return new Profile[i];
        }
    }

    @getMagicModuleMeta
    public static final void IconCompatParcelizer() {
        INSTANCE.AudioAttributesCompatParcelizer();
    }

    @getMagicModuleMeta
    public static final Profile write() {
        return Companion.IconCompatParcelizer();
    }
}
