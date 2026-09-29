package com.marrow2.data.tag.local.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u000bJ\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0017\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0012R\u001a\u0010\u001a\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u001a\u0010\u001d\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u0012R\u001a\u0010\u001f\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0018\u001a\u0004\b \u0010\u0012"}, d2 = {"Lcom/marrow2/data/tag/local/model/TagLSModel;", "Landroid/os/Parcelable;", "", "p0", "", "p1", "p2", "p3", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "describeContents", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "id", "Ljava/lang/String;", "AudioAttributesCompatParcelizer", "sortOrder", "I", "IconCompatParcelizer", "title", "write", "group", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TagLSModel implements Parcelable {
    private final String group;
    private final String id;
    private final int sortOrder;
    private final String title;
    public static final Parcelable.Creator<TagLSModel> CREATOR = new IconCompatParcelizer();
    public static final int $stable = 8;

    public static final class IconCompatParcelizer implements Parcelable.Creator<TagLSModel> {
        private static TagLSModel RemoteActionCompatParcelizer(Parcel parcel) {
            toMagicModuleMetaRepoModel.write(parcel, "");
            return new TagLSModel(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ TagLSModel createFromParcel(Parcel parcel) {
            return RemoteActionCompatParcelizer(parcel);
        }

        private static TagLSModel[] IconCompatParcelizer(int i) {
            return new TagLSModel[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ TagLSModel[] newArray(int i) {
            return IconCompatParcelizer(i);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public TagLSModel(@JsonProperty("_id") String str, @JsonProperty("sort_order") int i, @JsonProperty("title") String str2, @JsonProperty("group") String str3) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        this.id = str;
        this.sortOrder = i;
        this.title = str2;
        this.group = str3;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final int getSortOrder() {
        return this.sortOrder;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final String getGroup() {
        return this.group;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof TagLSModel)) {
            return false;
        }
        TagLSModel tagLSModel = (TagLSModel) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.id, (Object) tagLSModel.id) && this.sortOrder == tagLSModel.sortOrder && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.title, (Object) tagLSModel.title) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.group, (Object) tagLSModel.group);
    }

    public final int hashCode() {
        return (((((this.id.hashCode() * 31) + Integer.hashCode(this.sortOrder)) * 31) + this.title.hashCode()) * 31) + this.group.hashCode();
    }

    public final String toString() {
        String str = this.id;
        int i = this.sortOrder;
        String str2 = this.title;
        String str3 = this.group;
        StringBuilder sb = new StringBuilder("TagLSModel(id=");
        sb.append(str);
        sb.append(", sortOrder=");
        sb.append(i);
        sb.append(", title=");
        sb.append(str2);
        sb.append(", group=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel p0, int p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        p0.writeString(this.id);
        p0.writeInt(this.sortOrder);
        p0.writeString(this.title);
        p0.writeString(this.group);
    }
}
