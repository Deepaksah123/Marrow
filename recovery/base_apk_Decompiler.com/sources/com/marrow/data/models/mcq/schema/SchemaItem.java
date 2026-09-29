package com.marrow.data.models.mcq.schema;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0010J\u0010\u0010\u0013\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0010JL\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0005¢\u0006\u0004\b\u0016\u0010\u0010J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0003\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0010J\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\rJ\u001d\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0003\u001a\u00020\u001d2\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\rR\u001a\u0010$\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\"\u001a\u0004\b%\u0010\rR\u001a\u0010&\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\u0010R\u001a\u0010)\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010'\u001a\u0004\b*\u0010\u0010R\u001a\u0010+\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010'\u001a\u0004\b,\u0010\u0010R\u001a\u0010-\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010'\u001a\u0004\b.\u0010\u0010R\u001a\u0010/\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010'\u001a\u0004\b0\u0010\u0010"}, d2 = {"Lcom/marrow/data/models/mcq/schema/SchemaItem;", "Landroid/os/Parcelable;", "", "p0", "p1", "", "p2", "p3", "p4", "p5", "<init>", "(Ljava/lang/String;Ljava/lang/String;IIII)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()I", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;IIII)Lcom/marrow/data/models/mcq/schema/SchemaItem;", "describeContents", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Landroid/os/Parcel;", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "id", "Ljava/lang/String;", "getId", "title", "getTitle", "completenessScore", "I", "getCompletenessScore", "attempted", "getAttempted", "correctnessScore", "getCorrectnessScore", "mcqCount", "getMcqCount", "completedComparator", "getCompletedComparator"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SchemaItem implements Parcelable {
    public static final Parcelable.Creator<SchemaItem> CREATOR = new Creator();
    private final int attempted;
    private final int completedComparator;
    private final int completenessScore;
    private final int correctnessScore;
    private final String id;
    private final int mcqCount;
    private final String title;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SchemaItem> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SchemaItem createFromParcel(Parcel parcel) {
            toMagicModuleMetaRepoModel.write(parcel, "");
            return new SchemaItem(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SchemaItem[] newArray(int i) {
            return new SchemaItem[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public SchemaItem(String str, String str2, int i, int i2, int i3, int i4) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        this.id = str;
        this.title = str2;
        this.completenessScore = i;
        this.attempted = i2;
        this.correctnessScore = i3;
        this.mcqCount = i4;
        this.completedComparator = (i2 != i4 || i4 <= 0) ? 0 : 1;
    }

    public final String getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int getCompletenessScore() {
        return this.completenessScore;
    }

    public final int getAttempted() {
        return this.attempted;
    }

    public final int getCorrectnessScore() {
        return this.correctnessScore;
    }

    public final int getMcqCount() {
        return this.mcqCount;
    }

    public final int getCompletedComparator() {
        return this.completedComparator;
    }

    public static /* synthetic */ SchemaItem copy$default(SchemaItem schemaItem, String str, String str2, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = schemaItem.id;
        }
        if ((i5 & 2) != 0) {
            str2 = schemaItem.title;
        }
        String str3 = str2;
        if ((i5 & 4) != 0) {
            i = schemaItem.completenessScore;
        }
        int i6 = i;
        if ((i5 & 8) != 0) {
            i2 = schemaItem.attempted;
        }
        int i7 = i2;
        if ((i5 & 16) != 0) {
            i3 = schemaItem.correctnessScore;
        }
        int i8 = i3;
        if ((i5 & 32) != 0) {
            i4 = schemaItem.mcqCount;
        }
        return schemaItem.copy(str, str3, i6, i7, i8, i4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getCompletenessScore() {
        return this.completenessScore;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getAttempted() {
        return this.attempted;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getCorrectnessScore() {
        return this.correctnessScore;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getMcqCount() {
        return this.mcqCount;
    }

    public final SchemaItem copy(String p0, String p1, int p2, int p3, int p4, int p5) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        return new SchemaItem(p0, p1, p2, p3, p4, p5);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof SchemaItem)) {
            return false;
        }
        SchemaItem schemaItem = (SchemaItem) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.id, (Object) schemaItem.id) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.title, (Object) schemaItem.title) && this.completenessScore == schemaItem.completenessScore && this.attempted == schemaItem.attempted && this.correctnessScore == schemaItem.correctnessScore && this.mcqCount == schemaItem.mcqCount;
    }

    public final int hashCode() {
        return (((((((((this.id.hashCode() * 31) + this.title.hashCode()) * 31) + Integer.hashCode(this.completenessScore)) * 31) + Integer.hashCode(this.attempted)) * 31) + Integer.hashCode(this.correctnessScore)) * 31) + Integer.hashCode(this.mcqCount);
    }

    public final String toString() {
        String str = this.id;
        String str2 = this.title;
        int i = this.completenessScore;
        int i2 = this.attempted;
        int i3 = this.correctnessScore;
        int i4 = this.mcqCount;
        StringBuilder sb = new StringBuilder("SchemaItem(id=");
        sb.append(str);
        sb.append(", title=");
        sb.append(str2);
        sb.append(", completenessScore=");
        sb.append(i);
        sb.append(", attempted=");
        sb.append(i2);
        sb.append(", correctnessScore=");
        sb.append(i3);
        sb.append(", mcqCount=");
        sb.append(i4);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel p0, int p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        p0.writeString(this.id);
        p0.writeString(this.title);
        p0.writeInt(this.completenessScore);
        p0.writeInt(this.attempted);
        p0.writeInt(this.correctnessScore);
        p0.writeInt(this.mcqCount);
    }
}
