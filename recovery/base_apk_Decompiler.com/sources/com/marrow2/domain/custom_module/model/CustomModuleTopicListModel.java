package com.marrow2.domain.custom_module.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J1\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0006\u0010\u001a\u001a\u00020\u0006J\u0013\u0010\u001b\u001a\u00020\b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\u0016\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006%"}, d2 = {"Lcom/marrow2/domain/custom_module/model/CustomModuleTopicListModel;", "Landroid/os/Parcelable;", "topicId", "", "topicTitle", "moduleCount", "", "isSelected", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;IZ)V", "getTopicId", "()Ljava/lang/String;", "getTopicTitle", "getModuleCount", "()I", "setModuleCount", "(I)V", "()Z", "setSelected", "(Z)V", "component1", "component2", "component3", "component4", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CustomModuleTopicListModel implements Parcelable {
    public static final Parcelable.Creator<CustomModuleTopicListModel> CREATOR = new read();
    private int AudioAttributesCompatParcelizer;
    private final String RemoteActionCompatParcelizer;
    private boolean read;
    private final String write;

    public static final class read implements Parcelable.Creator<CustomModuleTopicListModel> {
        private static CustomModuleTopicListModel IconCompatParcelizer(Parcel parcel) {
            toMagicModuleMetaRepoModel.write(parcel, "");
            return new CustomModuleTopicListModel(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ CustomModuleTopicListModel createFromParcel(Parcel parcel) {
            return IconCompatParcelizer(parcel);
        }

        private static CustomModuleTopicListModel[] read(int i) {
            return new CustomModuleTopicListModel[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ CustomModuleTopicListModel[] newArray(int i) {
            return read(i);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public CustomModuleTopicListModel(String str, String str2, int i, boolean z) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        this.RemoteActionCompatParcelizer = str;
        this.write = str2;
        this.AudioAttributesCompatParcelizer = i;
        this.read = z;
    }

    public /* synthetic */ CustomModuleTopicListModel(String str, String str2, int i, boolean z, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(str, str2, i, (i2 & 8) != 0 ? true : z);
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final String getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final void AudioAttributesCompatParcelizer(int i) {
        this.AudioAttributesCompatParcelizer = i;
    }

    public final void AudioAttributesCompatParcelizer(boolean z) {
        this.read = z;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final int getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final String getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final boolean getRead() {
        return this.read;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static CustomModuleTopicListModel IconCompatParcelizer(String str, String str2, int i, boolean z) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        return new CustomModuleTopicListModel(str, str2, i, z);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CustomModuleTopicListModel)) {
            return false;
        }
        CustomModuleTopicListModel customModuleTopicListModel = (CustomModuleTopicListModel) other;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) customModuleTopicListModel.RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) customModuleTopicListModel.write) && this.AudioAttributesCompatParcelizer == customModuleTopicListModel.AudioAttributesCompatParcelizer && this.read == customModuleTopicListModel.read;
    }

    public final int hashCode() {
        return (((((this.RemoteActionCompatParcelizer.hashCode() * 31) + this.write.hashCode()) * 31) + Integer.hashCode(this.AudioAttributesCompatParcelizer)) * 31) + Boolean.hashCode(this.read);
    }

    public final String toString() {
        String str = this.RemoteActionCompatParcelizer;
        String str2 = this.write;
        int i = this.AudioAttributesCompatParcelizer;
        boolean z = this.read;
        StringBuilder sb = new StringBuilder("CustomModuleTopicListModel(topicId=");
        sb.append(str);
        sb.append(", topicTitle=");
        sb.append(str2);
        sb.append(", moduleCount=");
        sb.append(i);
        sb.append(", isSelected=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        toMagicModuleMetaRepoModel.write(dest, "");
        dest.writeString(this.RemoteActionCompatParcelizer);
        dest.writeString(this.write);
        dest.writeInt(this.AudioAttributesCompatParcelizer);
        dest.writeInt(this.read ? 1 : 0);
    }
}
