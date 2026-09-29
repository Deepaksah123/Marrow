package com.marrow2.domain.custom_module.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.IntermediateLoginResponseBody;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\bHÆ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003JA\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\b\b\u0002\u0010\t\u001a\u00020\u0006HÆ\u0001J\u0006\u0010\u001d\u001a\u00020\u001eJ\u0013\u0010\u001f\u001a\u00020\u00062\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\u001eHÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001J\u0016\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u001eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u000f\"\u0004\b\u0010\u0010\u0011R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\t\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u000f\"\u0004\b\u0016\u0010\u0011¨\u0006)"}, d2 = {"Lcom/marrow2/domain/custom_module/model/CustomModuleSubjectListModel;", "Landroid/os/Parcelable;", "subjectId", "", "subjectTitle", "isSelected", "", "selectedTopicIds", "", "isSubscribed", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Z)V", "getSubjectId", "()Ljava/lang/String;", "getSubjectTitle", "()Z", "setSelected", "(Z)V", "getSelectedTopicIds", "()Ljava/util/List;", "setSelectedTopicIds", "(Ljava/util/List;)V", "setSubscribed", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CustomModuleSubjectListModel implements Parcelable {
    public static final Parcelable.Creator<CustomModuleSubjectListModel> CREATOR = new RemoteActionCompatParcelizer();
    private boolean AudioAttributesCompatParcelizer;
    private final String IconCompatParcelizer;
    private List<String> RemoteActionCompatParcelizer;
    private final String read;
    private boolean write;

    public static final class RemoteActionCompatParcelizer implements Parcelable.Creator<CustomModuleSubjectListModel> {
        private static CustomModuleSubjectListModel IconCompatParcelizer(Parcel parcel) {
            toMagicModuleMetaRepoModel.write(parcel, "");
            return new CustomModuleSubjectListModel(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.createStringArrayList(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ CustomModuleSubjectListModel createFromParcel(Parcel parcel) {
            return IconCompatParcelizer(parcel);
        }

        private static CustomModuleSubjectListModel[] RemoteActionCompatParcelizer(int i) {
            return new CustomModuleSubjectListModel[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ CustomModuleSubjectListModel[] newArray(int i) {
            return RemoteActionCompatParcelizer(i);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public CustomModuleSubjectListModel(String str, String str2, boolean z, List<String> list, boolean z2) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(list, "");
        this.read = str;
        this.IconCompatParcelizer = str2;
        this.write = z;
        this.RemoteActionCompatParcelizer = list;
        this.AudioAttributesCompatParcelizer = z2;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final String getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final String getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final void RemoteActionCompatParcelizer(boolean z) {
        this.write = z;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final boolean getWrite() {
        return this.write;
    }

    public /* synthetic */ CustomModuleSubjectListModel(String str, String str2, boolean z, List list, boolean z2, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(str, str2, (i & 4) != 0 ? true : z, (i & 8) != 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list, (i & 16) != 0 ? true : z2);
    }

    public final void read(List<String> list) {
        toMagicModuleMetaRepoModel.write(list, "");
        this.RemoteActionCompatParcelizer = list;
    }

    public final List<String> write() {
        return this.RemoteActionCompatParcelizer;
    }

    public final void read(boolean z) {
        this.AudioAttributesCompatParcelizer = z;
    }

    public static /* synthetic */ CustomModuleSubjectListModel write(CustomModuleSubjectListModel customModuleSubjectListModel, String str, String str2, boolean z, List list, boolean z2, int i) {
        if ((i & 1) != 0) {
            str = customModuleSubjectListModel.read;
        }
        if ((i & 2) != 0) {
            str2 = customModuleSubjectListModel.IconCompatParcelizer;
        }
        if ((i & 4) != 0) {
            z = customModuleSubjectListModel.write;
        }
        if ((i & 8) != 0) {
            list = customModuleSubjectListModel.RemoteActionCompatParcelizer;
        }
        if ((i & 16) != 0) {
            z2 = customModuleSubjectListModel.AudioAttributesCompatParcelizer;
        }
        return write(str, str2, z, list, z2);
    }

    private static CustomModuleSubjectListModel write(String str, String str2, boolean z, List<String> list, boolean z2) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(list, "");
        return new CustomModuleSubjectListModel(str, str2, z, list, z2);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CustomModuleSubjectListModel)) {
            return false;
        }
        CustomModuleSubjectListModel customModuleSubjectListModel = (CustomModuleSubjectListModel) other;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) customModuleSubjectListModel.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) customModuleSubjectListModel.IconCompatParcelizer) && this.write == customModuleSubjectListModel.write && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, customModuleSubjectListModel.RemoteActionCompatParcelizer) && this.AudioAttributesCompatParcelizer == customModuleSubjectListModel.AudioAttributesCompatParcelizer;
    }

    public final int hashCode() {
        return (((((((this.read.hashCode() * 31) + this.IconCompatParcelizer.hashCode()) * 31) + Boolean.hashCode(this.write)) * 31) + this.RemoteActionCompatParcelizer.hashCode()) * 31) + Boolean.hashCode(this.AudioAttributesCompatParcelizer);
    }

    public final String toString() {
        String str = this.read;
        String str2 = this.IconCompatParcelizer;
        boolean z = this.write;
        List<String> list = this.RemoteActionCompatParcelizer;
        boolean z2 = this.AudioAttributesCompatParcelizer;
        StringBuilder sb = new StringBuilder("CustomModuleSubjectListModel(subjectId=");
        sb.append(str);
        sb.append(", subjectTitle=");
        sb.append(str2);
        sb.append(", isSelected=");
        sb.append(z);
        sb.append(", selectedTopicIds=");
        sb.append(list);
        sb.append(", isSubscribed=");
        sb.append(z2);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        toMagicModuleMetaRepoModel.write(dest, "");
        dest.writeString(this.read);
        dest.writeString(this.IconCompatParcelizer);
        dest.writeInt(this.write ? 1 : 0);
        dest.writeStringList(this.RemoteActionCompatParcelizer);
        dest.writeInt(this.AudioAttributesCompatParcelizer ? 1 : 0);
    }
}
