package com.marrow2.data.user.remote.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.isFirst;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0010\u0010\fJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\n¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u0007"}, d2 = {"Lcom/marrow2/data/user/remote/model/UserConfigV2;", "Landroid/os/Parcelable;", "", "p0", "<init>", "(Z)V", "component1", "()Z", "copy", "(Z)Lcom/marrow2/data/user/remote/model/UserConfigV2;", "", "describeContents", "()I", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "p1", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "isMagicModuleEnabled", "Z"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class UserConfigV2 implements Parcelable {

    @isFirst(RemoteActionCompatParcelizer = "smart_recall")
    @JsonProperty("smart_recall")
    private final boolean isMagicModuleEnabled;
    public static final Parcelable.Creator<UserConfigV2> CREATOR = new Creator();
    public static final int $stable = 8;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<UserConfigV2> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UserConfigV2 createFromParcel(Parcel parcel) {
            toMagicModuleMetaRepoModel.write(parcel, "");
            return new UserConfigV2(parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UserConfigV2[] newArray(int i) {
            return new UserConfigV2[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public UserConfigV2(boolean z) {
        this.isMagicModuleEnabled = z;
    }

    public /* synthetic */ UserConfigV2(boolean z, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? false : z);
    }

    public final boolean isMagicModuleEnabled() {
        return this.isMagicModuleEnabled;
    }

    public UserConfigV2() {
        this(false, 1, null);
    }

    public static /* synthetic */ UserConfigV2 copy$default(UserConfigV2 userConfigV2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = userConfigV2.isMagicModuleEnabled;
        }
        return userConfigV2.copy(z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsMagicModuleEnabled() {
        return this.isMagicModuleEnabled;
    }

    public final UserConfigV2 copy(boolean p0) {
        return new UserConfigV2(p0);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        return (p0 instanceof UserConfigV2) && this.isMagicModuleEnabled == ((UserConfigV2) p0).isMagicModuleEnabled;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isMagicModuleEnabled);
    }

    public final String toString() {
        boolean z = this.isMagicModuleEnabled;
        StringBuilder sb = new StringBuilder("UserConfigV2(isMagicModuleEnabled=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel p0, int p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        p0.writeInt(this.isMagicModuleEnabled ? 1 : 0);
    }
}
