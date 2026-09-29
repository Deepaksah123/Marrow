package com.marrow.ui.fragments.learn.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0011J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001c\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0017\u0010!\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0011R\u001a\u0010#\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b!\u0010\u0011R\u001a\u0010 \u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010%\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010'\u001a\u0004\b\u001c\u0010(R\u001a\u0010\"\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010)\u001a\u0004\b#\u0010*R\u001a\u0010+\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010)\u001a\u0004\b+\u0010*"}, d2 = {"Lcom/marrow/ui/fragments/learn/model/ActiveRecallQbankLessonUiModel;", "Landroid/os/Parcelable;", "", "p0", "", "p1", "p2", "", "p3", "", "p4", "", "p5", "p6", "<init>", "(Ljava/lang/String;IIFJZZ)V", "describeContents", "()I", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "IconCompatParcelizer", "Ljava/lang/String;", "AudioAttributesImplBaseParcelizer", "I", "AudioAttributesCompatParcelizer", "read", "AudioAttributesImplApi21Parcelizer", "RemoteActionCompatParcelizer", "F", "write", "()F", "J", "()J", "Z", "()Z", "AudioAttributesImplApi26Parcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ActiveRecallQbankLessonUiModel implements Parcelable {
    public static final Parcelable.Creator<ActiveRecallQbankLessonUiModel> CREATOR = new write();

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final boolean AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final int RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final int read;
    private final String IconCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final long write;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final float AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final boolean AudioAttributesImplApi21Parcelizer;

    public static final class write implements Parcelable.Creator<ActiveRecallQbankLessonUiModel> {
        private static ActiveRecallQbankLessonUiModel read(Parcel parcel) {
            toMagicModuleMetaRepoModel.write(parcel, "");
            return new ActiveRecallQbankLessonUiModel(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readFloat(), parcel.readLong(), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ActiveRecallQbankLessonUiModel createFromParcel(Parcel parcel) {
            return read(parcel);
        }

        private static ActiveRecallQbankLessonUiModel[] read(int i) {
            return new ActiveRecallQbankLessonUiModel[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ActiveRecallQbankLessonUiModel[] newArray(int i) {
            return read(i);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public ActiveRecallQbankLessonUiModel(String str, int i, int i2, float f, long j, boolean z, boolean z2) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.IconCompatParcelizer = str;
        this.read = i;
        this.RemoteActionCompatParcelizer = i2;
        this.AudioAttributesCompatParcelizer = f;
        this.write = j;
        this.AudioAttributesImplApi21Parcelizer = z;
        this.AudioAttributesImplApi26Parcelizer = z2;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final int getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final int getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final float getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final long getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final boolean getAudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from getter */
    public final boolean getAudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof ActiveRecallQbankLessonUiModel)) {
            return false;
        }
        ActiveRecallQbankLessonUiModel activeRecallQbankLessonUiModel = (ActiveRecallQbankLessonUiModel) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) activeRecallQbankLessonUiModel.IconCompatParcelizer) && this.read == activeRecallQbankLessonUiModel.read && this.RemoteActionCompatParcelizer == activeRecallQbankLessonUiModel.RemoteActionCompatParcelizer && Float.compare(this.AudioAttributesCompatParcelizer, activeRecallQbankLessonUiModel.AudioAttributesCompatParcelizer) == 0 && this.write == activeRecallQbankLessonUiModel.write && this.AudioAttributesImplApi21Parcelizer == activeRecallQbankLessonUiModel.AudioAttributesImplApi21Parcelizer && this.AudioAttributesImplApi26Parcelizer == activeRecallQbankLessonUiModel.AudioAttributesImplApi26Parcelizer;
    }

    public final int hashCode() {
        return (((((((((((this.IconCompatParcelizer.hashCode() * 31) + Integer.hashCode(this.read)) * 31) + Integer.hashCode(this.RemoteActionCompatParcelizer)) * 31) + Float.hashCode(this.AudioAttributesCompatParcelizer)) * 31) + Long.hashCode(this.write)) * 31) + Boolean.hashCode(this.AudioAttributesImplApi21Parcelizer)) * 31) + Boolean.hashCode(this.AudioAttributesImplApi26Parcelizer);
    }

    public final String toString() {
        String str = this.IconCompatParcelizer;
        int i = this.read;
        int i2 = this.RemoteActionCompatParcelizer;
        float f = this.AudioAttributesCompatParcelizer;
        long j = this.write;
        boolean z = this.AudioAttributesImplApi21Parcelizer;
        boolean z2 = this.AudioAttributesImplApi26Parcelizer;
        StringBuilder sb = new StringBuilder("ActiveRecallQbankLessonUiModel(IconCompatParcelizer=");
        sb.append(str);
        sb.append(", read=");
        sb.append(i);
        sb.append(", RemoteActionCompatParcelizer=");
        sb.append(i2);
        sb.append(", AudioAttributesCompatParcelizer=");
        sb.append(f);
        sb.append(", write=");
        sb.append(j);
        sb.append(", AudioAttributesImplApi21Parcelizer=");
        sb.append(z);
        sb.append(", AudioAttributesImplApi26Parcelizer=");
        sb.append(z2);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel p0, int p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        p0.writeString(this.IconCompatParcelizer);
        p0.writeInt(this.read);
        p0.writeInt(this.RemoteActionCompatParcelizer);
        p0.writeFloat(this.AudioAttributesCompatParcelizer);
        p0.writeLong(this.write);
        p0.writeInt(this.AudioAttributesImplApi21Parcelizer ? 1 : 0);
        p0.writeInt(this.AudioAttributesImplApi26Parcelizer ? 1 : 0);
    }
}
