package com.marrow.data.models.mcq.bookmark;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.parseDolbyChannelConfiguration;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\nH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0005¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0016\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0016\u0010\u0017\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0019\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018"}, d2 = {"Lcom/marrow/data/models/mcq/bookmark/FilterItemRecord;", "Landroid/os/Parcelable;", "", "p0", "p1", "", "p2", "p3", "<init>", "(Ljava/lang/String;Ljava/lang/String;II)V", "", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "()I", "Landroid/os/Parcel;", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "itemId", "Ljava/lang/String;", "itemTitle", "count", "I", "bookmarkCount", "Companion"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FilterItemRecord implements Parcelable {
    public static final String filter_all_id = "all";
    public static final String filter_all_title = "All";
    public int bookmarkCount;
    public int count;
    public String itemId;
    public String itemTitle;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<FilterItemRecord> CREATOR = new Creator();

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FilterItemRecord> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FilterItemRecord createFromParcel(Parcel parcel) {
            toMagicModuleMetaRepoModel.write(parcel, "");
            return new FilterItemRecord(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FilterItemRecord[] newArray(int i) {
            return new FilterItemRecord[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public FilterItemRecord(String str, String str2, int i, int i2) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        this.itemId = str;
        this.itemTitle = str2;
        this.count = i;
        this.bookmarkCount = i2;
    }

    public /* synthetic */ FilterItemRecord(String str, String str2, int i, int i2, int i3, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(str, str2, i, (i3 & 8) != 0 ? 0 : i2);
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u000b"}, d2 = {"Lcom/marrow/data/models/mcq/bookmark/FilterItemRecord$Companion;", "", "<init>", "()V", "", "p0", "Lcom/marrow/data/models/mcq/bookmark/FilterItemRecord;", "allFilterItem", "(I)Lcom/marrow/data/models/mcq/bookmark/FilterItemRecord;", "", "filter_all_id", "Ljava/lang/String;", "filter_all_title"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final FilterItemRecord allFilterItem(int p0) {
            return new FilterItemRecord("all", FilterItemRecord.filter_all_title, p0, 0, 8, null);
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public final boolean equals(Object p0) {
        if (!(p0 instanceof FilterItemRecord)) {
            return super.equals(p0);
        }
        FilterItemRecord filterItemRecord = (FilterItemRecord) p0;
        return parseDolbyChannelConfiguration.RemoteActionCompatParcelizer(this.itemId, filterItemRecord.itemId) && parseDolbyChannelConfiguration.RemoteActionCompatParcelizer(this.itemTitle, filterItemRecord.itemTitle) && this.count == filterItemRecord.count && this.bookmarkCount == filterItemRecord.bookmarkCount;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FilterItemRecord(String str, String str2, int i) {
        this(str, str2, i, 0, 8, null);
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel p0, int p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        p0.writeString(this.itemId);
        p0.writeString(this.itemTitle);
        p0.writeInt(this.count);
        p0.writeInt(this.bookmarkCount);
    }
}
