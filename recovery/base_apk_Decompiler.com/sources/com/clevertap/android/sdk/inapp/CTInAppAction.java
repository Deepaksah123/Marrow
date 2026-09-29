package com.clevertap.android.sdk.inapp;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.inapp.customtemplates.CustomTemplateInAppData;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import in.juspay.hyper.constants.LogSubCategory;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.TestGroupLSModel;
import kotlin.getMagicModuleMeta;
import kotlin.lambdaupdateStateAndInformListeners38;
import kotlin.onSeekStarted;
import kotlin.toMagicModuleMetaRepoModel;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u0000 *2\u00020\u0001:\u0001*B\u0013\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0012\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\u0004\u0010\bJ\u0018\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020#H\u0016J\b\u0010$\u001a\u00020#H\u0016J\u0010\u0010%\u001a\u00020 2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0013\u0010&\u001a\u00020\u001c2\b\u0010'\u001a\u0004\u0018\u00010(H\u0096\u0002J\b\u0010)\u001a\u00020#H\u0016R\"\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\n@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\"\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\t\u001a\u0004\u0018\u00010\u000e@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R`\u0010\u0014\u001a\"\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0013j\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0018\u0001`\u00122&\u0010\t\u001a\"\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0013j\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0018\u0001`\u0012@BX\u0086\u000e¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\"\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\t\u001a\u0004\u0018\u00010\u0018@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\t\u001a\u00020\u001c8G@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006+"}, d2 = {"Lcom/clevertap/android/sdk/inapp/CTInAppAction;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "<init>", "(Landroid/os/Parcel;)V", "json", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Lcom/clevertap/android/sdk/inapp/InAppActionType;", "type", "getType", "()Lcom/clevertap/android/sdk/inapp/InAppActionType;", "", "actionUrl", "getActionUrl", "()Ljava/lang/String;", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "keyValues", "getKeyValues", "()Ljava/util/HashMap;", "Ljava/util/HashMap;", "Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;", "customTemplateInAppData", "getCustomTemplateInAppData", "()Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;", "", "shouldFallbackToSettings", "()Z", "writeToParcel", "", "dest", "flags", "", "describeContents", "setFieldsFromJson", "equals", "other", "", "hashCode", "CREATOR", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CTInAppAction implements Parcelable {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private CustomTemplateInAppData AudioAttributesCompatParcelizer;
    private String IconCompatParcelizer;
    private lambdaupdateStateAndInformListeners38 RemoteActionCompatParcelizer;
    private HashMap<String, String> read;
    private boolean write;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    private CTInAppAction(Parcel parcel) {
        lambdaupdateStateAndInformListeners38 lambdaupdatestateandinformlisteners38Write;
        String string;
        if (parcel == null || (string = parcel.readString()) == null) {
            lambdaupdatestateandinformlisteners38Write = null;
        } else {
            lambdaupdateStateAndInformListeners38.Companion readVar = lambdaupdateStateAndInformListeners38.INSTANCE;
            lambdaupdatestateandinformlisteners38Write = lambdaupdateStateAndInformListeners38.Companion.write(string);
        }
        this.RemoteActionCompatParcelizer = lambdaupdatestateandinformlisteners38Write;
        this.IconCompatParcelizer = parcel != null ? parcel.readString() : null;
        HashMap<String, String> hashMap = parcel != null ? parcel.readHashMap(null) : null;
        this.read = hashMap instanceof HashMap ? hashMap : null;
        this.AudioAttributesCompatParcelizer = parcel != null ? (CustomTemplateInAppData) parcel.readParcelable(CustomTemplateInAppData.class.getClassLoader()) : null;
        boolean z = false;
        if (parcel != null && parcel.readByte() == 0) {
            z = true;
        }
        this.write = !z;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final lambdaupdateStateAndInformListeners38 getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final String getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final HashMap<String, String> IconCompatParcelizer() {
        return this.read;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final CustomTemplateInAppData getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final boolean getWrite() {
        return this.write;
    }

    private CTInAppAction(JSONObject jSONObject) {
        this((Parcel) null);
        write(jSONObject);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        toMagicModuleMetaRepoModel.write(dest, "");
        lambdaupdateStateAndInformListeners38 lambdaupdatestateandinformlisteners38 = this.RemoteActionCompatParcelizer;
        dest.writeString(lambdaupdatestateandinformlisteners38 != null ? lambdaupdatestateandinformlisteners38.toString() : null);
        dest.writeString(this.IconCompatParcelizer);
        dest.writeMap(this.read);
        dest.writeParcelable(this.AudioAttributesCompatParcelizer, flags);
        dest.writeByte(this.write ? (byte) 1 : (byte) 0);
    }

    private final void write(JSONObject jSONObject) {
        lambdaupdateStateAndInformListeners38 lambdaupdatestateandinformlisteners38Write;
        String strWrite = onSeekStarted.write(jSONObject, "type");
        if (strWrite != null) {
            lambdaupdateStateAndInformListeners38.Companion readVar = lambdaupdateStateAndInformListeners38.INSTANCE;
            lambdaupdatestateandinformlisteners38Write = lambdaupdateStateAndInformListeners38.Companion.write(strWrite);
        } else {
            lambdaupdatestateandinformlisteners38Write = null;
        }
        this.RemoteActionCompatParcelizer = lambdaupdatestateandinformlisteners38Write;
        this.IconCompatParcelizer = onSeekStarted.write(jSONObject, LogSubCategory.LifeCycle.ANDROID);
        CustomTemplateInAppData.Companion creator = CustomTemplateInAppData.INSTANCE;
        this.AudioAttributesCompatParcelizer = CustomTemplateInAppData.Companion.IconCompatParcelizer(jSONObject);
        this.write = jSONObject.optBoolean("fbSettings");
        if (TestGroupLSModel.read("kv", jSONObject.optString("type"), true) && jSONObject.has("kv")) {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("kv");
            HashMap<String, String> map = this.read;
            if (map == null) {
                map = new HashMap<>();
            }
            if (jSONObjectOptJSONObject != null) {
                Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(itKeys, "");
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    String strOptString = jSONObjectOptJSONObject.optString(next);
                    toMagicModuleMetaRepoModel.write((Object) strOptString);
                    if (strOptString.length() > 0) {
                        map.put(next, strOptString);
                    }
                }
                this.read = map;
            }
        }
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getClass(), other != null ? other.getClass() : null)) {
            return false;
        }
        toMagicModuleMetaRepoModel.read(other, "");
        CTInAppAction cTInAppAction = (CTInAppAction) other;
        return this.write == cTInAppAction.write && this.RemoteActionCompatParcelizer == cTInAppAction.RemoteActionCompatParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) cTInAppAction.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.read, cTInAppAction.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, cTInAppAction.AudioAttributesCompatParcelizer);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.write);
        lambdaupdateStateAndInformListeners38 lambdaupdatestateandinformlisteners38 = this.RemoteActionCompatParcelizer;
        int iHashCode2 = lambdaupdatestateandinformlisteners38 != null ? lambdaupdatestateandinformlisteners38.hashCode() : 0;
        String str = this.IconCompatParcelizer;
        int iHashCode3 = str != null ? str.hashCode() : 0;
        HashMap<String, String> map = this.read;
        int iHashCode4 = map != null ? map.hashCode() : 0;
        CustomTemplateInAppData customTemplateInAppData = this.AudioAttributesCompatParcelizer;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (customTemplateInAppData != null ? customTemplateInAppData.hashCode() : 0);
    }

    public /* synthetic */ CTInAppAction(Parcel parcel, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(parcel);
    }

    public /* synthetic */ CTInAppAction(JSONObject jSONObject, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(jSONObject);
    }

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.CTInAppAction$IconCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\n2\u0006\u0010\u0006\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000b\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0004\b\u000b\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/clevertap/android/sdk/inapp/CTInAppAction$IconCompatParcelizer;", "Landroid/os/Parcelable$Creator;", "Lcom/clevertap/android/sdk/inapp/CTInAppAction;", "<init>", "()V", "Landroid/os/Parcel;", "p0", "AudioAttributesCompatParcelizer", "(Landroid/os/Parcel;)Lcom/clevertap/android/sdk/inapp/CTInAppAction;", "", "", "IconCompatParcelizer", "(I)[Lcom/clevertap/android/sdk/inapp/CTInAppAction;", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)Lcom/clevertap/android/sdk/inapp/CTInAppAction;", "", "read", "(Ljava/lang/String;)Lcom/clevertap/android/sdk/inapp/CTInAppAction;", "RemoteActionCompatParcelizer", "()Lcom/clevertap/android/sdk/inapp/CTInAppAction;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion implements Parcelable.Creator<CTInAppAction> {
        private Companion() {
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ CTInAppAction createFromParcel(Parcel parcel) {
            return AudioAttributesCompatParcelizer(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ CTInAppAction[] newArray(int i) {
            return IconCompatParcelizer(i);
        }

        private static CTInAppAction AudioAttributesCompatParcelizer(Parcel p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return new CTInAppAction(p0, (MagicModuleRepositoryImplExternalSyntheticLambda0) null);
        }

        private static CTInAppAction[] IconCompatParcelizer(int p0) {
            return new CTInAppAction[p0];
        }

        @getMagicModuleMeta
        public static CTInAppAction IconCompatParcelizer(JSONObject p0) {
            MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0 = null;
            if (p0 == null) {
                return null;
            }
            return new CTInAppAction(p0, magicModuleRepositoryImplExternalSyntheticLambda0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @getMagicModuleMeta
        public static CTInAppAction read(String p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            CTInAppAction cTInAppAction = new CTInAppAction((Parcel) null, (MagicModuleRepositoryImplExternalSyntheticLambda0) (0 == true ? 1 : 0));
            cTInAppAction.RemoteActionCompatParcelizer = lambdaupdateStateAndInformListeners38.AudioAttributesCompatParcelizer;
            cTInAppAction.IconCompatParcelizer = p0;
            return cTInAppAction;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @getMagicModuleMeta
        public static CTInAppAction RemoteActionCompatParcelizer() {
            CTInAppAction cTInAppAction = new CTInAppAction((Parcel) null, (MagicModuleRepositoryImplExternalSyntheticLambda0) (0 == true ? 1 : 0));
            cTInAppAction.RemoteActionCompatParcelizer = lambdaupdateStateAndInformListeners38.IconCompatParcelizer;
            return cTInAppAction;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    @getMagicModuleMeta
    public static final CTInAppAction AudioAttributesCompatParcelizer(JSONObject jSONObject) {
        return Companion.IconCompatParcelizer(jSONObject);
    }
}
