package com.clevertap.android.sdk.inapp.customtemplates;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.PlayerPlaybackSuppressionReason;
import kotlin.getMagicModuleMeta;
import kotlin.getPlaceholderState;
import kotlin.handleIncreaseDeviceVolume;
import kotlin.handleRelease;
import kotlin.lambdaupdateStateAndInformListeners41;
import kotlin.onSeekStarted;
import kotlin.toMagicModuleMetaRepoModel;
import kotlin.updateStateAndInformListeners;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0000\u0018\u0000 '2\u00020\u0001:\u0001'B\u0013\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0012\u0012\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\u0007J\u0011\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0003\u001a\u00020\nH\u0000¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\n2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000fH\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\b\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\b\u0010\u0007J\u000f\u0010\u0019\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u0003\u001a\u0004\u0018\u00010\u001bH\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001f\u0010\u0018J\u0017\u0010 \u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0006H\u0002¢\u0006\u0004\b \u0010\u0007R(\u0010\u0019\u001a\u0004\u0018\u00010\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\f8\u0007@BX\u0086\u000e¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b \u0010\"R\"\u0010\r\u001a\u00020\u001c8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010#\u001a\u0004\b\u0012\u0010$\"\u0004\b\r\u0010%R\u0018\u0010\b\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010 \u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\r\u0010!R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010&"}, d2 = {"Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;", "Landroid/os/Parcelable;", "Landroid/os/Parcel;", "p0", "<init>", "(Landroid/os/Parcel;)V", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "write", "()Lorg/json/JSONObject;", "Lo/handleRelease;", "", "", "IconCompatParcelizer", "(Lo/handleRelease;)Ljava/util/List;", "", "p1", "", "read", "(Lo/handleRelease;Ljava/util/List;)V", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "RemoteActionCompatParcelizer", "()Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "AudioAttributesCompatParcelizer", "Ljava/lang/String;", "()Ljava/lang/String;", "Z", "()Z", "()V", "Lorg/json/JSONObject;", "CREATOR"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CustomTemplateInAppData implements Parcelable {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private String write;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private String AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private boolean IconCompatParcelizer;
    private JSONObject read;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private String RemoteActionCompatParcelizer;

    public final /* synthetic */ class AudioAttributesCompatParcelizer {
        public static final /* synthetic */ int[] AudioAttributesCompatParcelizer;

        static {
            int[] iArr = new int[handleIncreaseDeviceVolume.values().length];
            try {
                iArr[handleIncreaseDeviceVolume.read.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[handleIncreaseDeviceVolume.write.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            AudioAttributesCompatParcelizer = iArr;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    private CustomTemplateInAppData(Parcel parcel) {
        this.RemoteActionCompatParcelizer = parcel != null ? parcel.readString() : null;
        boolean z = false;
        if (parcel != null && parcel.readByte() == 0) {
            z = true;
        }
        this.IconCompatParcelizer = true ^ z;
        this.write = parcel != null ? parcel.readString() : null;
        this.AudioAttributesCompatParcelizer = parcel != null ? parcel.readString() : null;
        this.read = parcel != null ? onSeekStarted.write(parcel) : null;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final String getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final void IconCompatParcelizer() {
        this.IconCompatParcelizer = true;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final boolean getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    private CustomTemplateInAppData(JSONObject jSONObject) {
        this((Parcel) null);
        AudioAttributesCompatParcelizer(jSONObject);
    }

    public final JSONObject write() {
        JSONObject jSONObject = this.read;
        if (jSONObject != null) {
            return PlayerPlaybackSuppressionReason.AudioAttributesCompatParcelizer(jSONObject);
        }
        return null;
    }

    public final List<String> IconCompatParcelizer(handleRelease p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        ArrayList arrayList = new ArrayList();
        read(p0, arrayList);
        return arrayList;
    }

    public final void read(handleRelease p0, List<String> p1) {
        updateStateAndInformListeners updatestateandinformlisteners;
        JSONObject jSONObject;
        JSONObject jSONObjectOptJSONObject;
        CustomTemplateInAppData customTemplateInAppDataIconCompatParcelizer;
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        String str = this.RemoteActionCompatParcelizer;
        if (str == null || (updatestateandinformlisteners = p0.read(str)) == null || (jSONObject = this.read) == null) {
            return;
        }
        for (getPlaceholderState getplaceholderstate : updatestateandinformlisteners.read()) {
            int i = AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer[getplaceholderstate.read().ordinal()];
            if (i == 1) {
                String strWrite = onSeekStarted.write(jSONObject, getplaceholderstate.AudioAttributesCompatParcelizer());
                if (strWrite != null) {
                    p1.add(strWrite);
                }
            } else if (i == 2 && (jSONObjectOptJSONObject = jSONObject.optJSONObject(getplaceholderstate.AudioAttributesCompatParcelizer())) != null && (customTemplateInAppDataIconCompatParcelizer = Companion.IconCompatParcelizer(jSONObjectOptJSONObject)) != null) {
                customTemplateInAppDataIconCompatParcelizer.read(p0, p1);
            }
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel p0, int p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        p0.writeString(this.RemoteActionCompatParcelizer);
        p0.writeByte(this.IconCompatParcelizer ? (byte) 1 : (byte) 0);
        p0.writeString(this.write);
        p0.writeString(this.AudioAttributesCompatParcelizer);
        onSeekStarted.IconCompatParcelizer(p0, this.read);
    }

    public final void write(JSONObject p0) throws JSONException {
        toMagicModuleMetaRepoModel.write(p0, "");
        p0.put("templateName", this.RemoteActionCompatParcelizer);
        p0.put("isAction", this.IconCompatParcelizer);
        p0.put("templateId", this.write);
        p0.put("templateDescription", this.AudioAttributesCompatParcelizer);
        p0.put("vars", this.read);
    }

    public final CustomTemplateInAppData RemoteActionCompatParcelizer() {
        CustomTemplateInAppData customTemplateInAppData = new CustomTemplateInAppData((Parcel) null);
        customTemplateInAppData.RemoteActionCompatParcelizer = this.RemoteActionCompatParcelizer;
        customTemplateInAppData.IconCompatParcelizer = this.IconCompatParcelizer;
        customTemplateInAppData.write = this.write;
        customTemplateInAppData.AudioAttributesCompatParcelizer = this.AudioAttributesCompatParcelizer;
        JSONObject jSONObject = this.read;
        if (jSONObject != null) {
            JSONObject jSONObject2 = new JSONObject();
            PlayerPlaybackSuppressionReason.IconCompatParcelizer(jSONObject2, jSONObject);
            customTemplateInAppData.read = jSONObject2;
        }
        return customTemplateInAppData;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getClass(), p0 != null ? p0.getClass() : null)) {
            return false;
        }
        toMagicModuleMetaRepoModel.read(p0, "");
        CustomTemplateInAppData customTemplateInAppData = (CustomTemplateInAppData) p0;
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) customTemplateInAppData.RemoteActionCompatParcelizer) || this.IconCompatParcelizer != customTemplateInAppData.IconCompatParcelizer || !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) customTemplateInAppData.write) || !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) customTemplateInAppData.AudioAttributesCompatParcelizer)) {
            return false;
        }
        JSONObject jSONObject = this.read;
        String string = jSONObject != null ? jSONObject.toString() : null;
        JSONObject jSONObject2 = customTemplateInAppData.read;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) string, (Object) (jSONObject2 != null ? jSONObject2.toString() : null));
    }

    public final int hashCode() {
        String string;
        String str = this.RemoteActionCompatParcelizer;
        int iHashCode = 0;
        int iHashCode2 = str != null ? str.hashCode() : 0;
        int iHashCode3 = Boolean.hashCode(this.IconCompatParcelizer);
        String str2 = this.write;
        int iHashCode4 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.AudioAttributesCompatParcelizer;
        int iHashCode5 = str3 != null ? str3.hashCode() : 0;
        JSONObject jSONObject = this.read;
        if (jSONObject != null && (string = jSONObject.toString()) != null) {
            iHashCode = string.hashCode();
        }
        return (((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode;
    }

    private final void AudioAttributesCompatParcelizer(JSONObject p0) {
        this.RemoteActionCompatParcelizer = onSeekStarted.write(p0, "templateName");
        this.IconCompatParcelizer = p0.optBoolean("isAction");
        this.write = onSeekStarted.write(p0, "templateId");
        this.AudioAttributesCompatParcelizer = onSeekStarted.write(p0, "templateDescription");
        this.read = p0.optJSONObject("vars");
    }

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.customtemplates.CustomTemplateInAppData$CREATOR, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\n2\u0006\u0010\u0006\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0004\b\u0007\u0010\u000e"}, d2 = {"Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;", "<init>", "()V", "Landroid/os/Parcel;", "p0", "IconCompatParcelizer", "(Landroid/os/Parcel;)Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;", "", "", "RemoteActionCompatParcelizer", "(I)[Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion implements Parcelable.Creator<CustomTemplateInAppData> {
        private Companion() {
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ CustomTemplateInAppData createFromParcel(Parcel parcel) {
            return IconCompatParcelizer(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ CustomTemplateInAppData[] newArray(int i) {
            return RemoteActionCompatParcelizer(i);
        }

        private static CustomTemplateInAppData IconCompatParcelizer(Parcel p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return new CustomTemplateInAppData(p0, (MagicModuleRepositoryImplExternalSyntheticLambda0) null);
        }

        private static CustomTemplateInAppData[] RemoteActionCompatParcelizer(int p0) {
            return new CustomTemplateInAppData[p0];
        }

        @getMagicModuleMeta
        public static CustomTemplateInAppData IconCompatParcelizer(JSONObject p0) {
            MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0 = null;
            if (p0 == null) {
                return null;
            }
            lambdaupdateStateAndInformListeners41.Companion companion = lambdaupdateStateAndInformListeners41.INSTANCE;
            if (lambdaupdateStateAndInformListeners41.AudioAttributesImplApi21Parcelizer == lambdaupdateStateAndInformListeners41.Companion.AudioAttributesCompatParcelizer(p0.optString("type"))) {
                return new CustomTemplateInAppData(p0, magicModuleRepositoryImplExternalSyntheticLambda0);
            }
            return null;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public /* synthetic */ CustomTemplateInAppData(Parcel parcel, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(parcel);
    }

    public /* synthetic */ CustomTemplateInAppData(JSONObject jSONObject, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(jSONObject);
    }
}
