package com.marrow.data.models.home;

import android.os.Parcel;
import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.marrow.data.models.pearl.PearlMini;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\tJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u0003\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\tJ\u0010\u0010\u0014\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000bJ\u001d\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\tR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u000b"}, d2 = {"Lcom/marrow/data/models/home/RecentUpdatesReferences;", "Landroid/os/Parcelable;", "", "p0", "", "p1", "<init>", "(ILjava/lang/String;)V", "component1", "()I", "component2", "()Ljava/lang/String;", "copy", "(ILjava/lang/String;)Lcom/marrow/data/models/home/RecentUpdatesReferences;", "describeContents", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Landroid/os/Parcel;", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "type", "I", "getType", "displayId", "Ljava/lang/String;", "getDisplayId"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RecentUpdatesReferences implements Parcelable {
    public static final Parcelable.Creator<RecentUpdatesReferences> CREATOR = new Creator();
    private final String displayId;
    private final int type;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RecentUpdatesReferences> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RecentUpdatesReferences createFromParcel(Parcel parcel) {
            toMagicModuleMetaRepoModel.write(parcel, "");
            return new RecentUpdatesReferences(parcel.readInt(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RecentUpdatesReferences[] newArray(int i) {
            return new RecentUpdatesReferences[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public RecentUpdatesReferences(@JsonProperty("type") int i, @JsonProperty(PearlMini.KEY_PEARL_DISPLAY_ID) String str) {
        this.type = i;
        this.displayId = str;
    }

    public final int getType() {
        return this.type;
    }

    public final String getDisplayId() {
        return this.displayId;
    }

    public static /* synthetic */ RecentUpdatesReferences copy$default(RecentUpdatesReferences recentUpdatesReferences, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = recentUpdatesReferences.type;
        }
        if ((i2 & 2) != 0) {
            str = recentUpdatesReferences.displayId;
        }
        return recentUpdatesReferences.copy(i, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDisplayId() {
        return this.displayId;
    }

    public final RecentUpdatesReferences copy(@JsonProperty("type") int p0, @JsonProperty(PearlMini.KEY_PEARL_DISPLAY_ID) String p1) {
        return new RecentUpdatesReferences(p0, p1);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof RecentUpdatesReferences)) {
            return false;
        }
        RecentUpdatesReferences recentUpdatesReferences = (RecentUpdatesReferences) p0;
        return this.type == recentUpdatesReferences.type && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.displayId, (Object) recentUpdatesReferences.displayId);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.type);
        String str = this.displayId;
        return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        int i = this.type;
        String str = this.displayId;
        StringBuilder sb = new StringBuilder("RecentUpdatesReferences(type=");
        sb.append(i);
        sb.append(", displayId=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel p0, int p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        p0.writeInt(this.type);
        p0.writeString(this.displayId);
    }
}
