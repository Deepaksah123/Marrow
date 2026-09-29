package com.marrow.ui.activities.learn.video.overlay;

import android.os.Parcel;
import android.os.Parcelable;
import com.medengage.video.custom.UiPixelRateModel;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0004\t\n\u000b\fB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\u0082\u0001\u0004\r\u000e\u000f\u0010"}, d2 = {"Lcom/marrow/ui/activities/learn/video/overlay/OptionItem;", "Landroid/os/Parcelable;", "", "p0", "<init>", "(Ljava/lang/String;)V", "IconCompatParcelizer", "Ljava/lang/String;", "()Ljava/lang/String;", "ResolutionOptionItem", "SeekOptionItem", "PlaybackSpeedOptionItem", "SubjectTextOptionItem", "Lcom/marrow/ui/activities/learn/video/overlay/OptionItem$PlaybackSpeedOptionItem;", "Lcom/marrow/ui/activities/learn/video/overlay/OptionItem$ResolutionOptionItem;", "Lcom/marrow/ui/activities/learn/video/overlay/OptionItem$SeekOptionItem;", "Lcom/marrow/ui/activities/learn/video/overlay/OptionItem$SubjectTextOptionItem;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class OptionItem implements Parcelable {
    private final String IconCompatParcelizer;

    private OptionItem(String str) {
        this.IconCompatParcelizer = str;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final String getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\f\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000e\u0010\nJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\b¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u001a\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001d\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0016\u0010\u001c"}, d2 = {"Lcom/marrow/ui/activities/learn/video/overlay/OptionItem$ResolutionOptionItem;", "Lcom/marrow/ui/activities/learn/video/overlay/OptionItem;", "Lcom/medengage/video/custom/UiPixelRateModel;", "p0", "", "p1", "<init>", "(Lcom/medengage/video/custom/UiPixelRateModel;Z)V", "", "describeContents", "()I", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "AudioAttributesCompatParcelizer", "Lcom/medengage/video/custom/UiPixelRateModel;", "RemoteActionCompatParcelizer", "()Lcom/medengage/video/custom/UiPixelRateModel;", "read", "Z", "()Z", "IconCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ResolutionOptionItem extends OptionItem {
        public static final Parcelable.Creator<ResolutionOptionItem> CREATOR = new AudioAttributesCompatParcelizer();

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
        private final UiPixelRateModel read;

        /* JADX INFO: renamed from: read, reason: from kotlin metadata */
        private final boolean IconCompatParcelizer;

        public static final class AudioAttributesCompatParcelizer implements Parcelable.Creator<ResolutionOptionItem> {
            private static ResolutionOptionItem RemoteActionCompatParcelizer(Parcel parcel) {
                toMagicModuleMetaRepoModel.write(parcel, "");
                return new ResolutionOptionItem(UiPixelRateModel.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ ResolutionOptionItem createFromParcel(Parcel parcel) {
                return RemoteActionCompatParcelizer(parcel);
            }

            private static ResolutionOptionItem[] AudioAttributesCompatParcelizer(int i) {
                return new ResolutionOptionItem[i];
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ ResolutionOptionItem[] newArray(int i) {
                return AudioAttributesCompatParcelizer(i);
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
        public final boolean getIconCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
        public final UiPixelRateModel getRead() {
            return this.read;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ResolutionOptionItem(UiPixelRateModel uiPixelRateModel, boolean z) {
            super(uiPixelRateModel.getIconCompatParcelizer().toString(), null);
            toMagicModuleMetaRepoModel.write(uiPixelRateModel, "");
            this.read = uiPixelRateModel;
            this.IconCompatParcelizer = z;
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof ResolutionOptionItem)) {
                return false;
            }
            ResolutionOptionItem resolutionOptionItem = (ResolutionOptionItem) p0;
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.read, resolutionOptionItem.read) && this.IconCompatParcelizer == resolutionOptionItem.IconCompatParcelizer;
        }

        public final int hashCode() {
            return (this.read.hashCode() * 31) + Boolean.hashCode(this.IconCompatParcelizer);
        }

        public final String toString() {
            UiPixelRateModel uiPixelRateModel = this.read;
            boolean z = this.IconCompatParcelizer;
            StringBuilder sb = new StringBuilder("ResolutionOptionItem(read=");
            sb.append(uiPixelRateModel);
            sb.append(", IconCompatParcelizer=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel p0, int p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            this.read.writeToParcel(p0, p1);
            p0.writeInt(this.IconCompatParcelizer ? 1 : 0);
        }
    }

    public /* synthetic */ OptionItem(String str, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(str);
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\tHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\bJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0018\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u000f"}, d2 = {"Lcom/marrow/ui/activities/learn/video/overlay/OptionItem$SeekOptionItem;", "Lcom/marrow/ui/activities/learn/video/overlay/OptionItem;", "", "p0", "<init>", "(Ljava/lang/String;)V", "", "describeContents", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "p1", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "IconCompatParcelizer", "Ljava/lang/String;", "RemoteActionCompatParcelizer", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SeekOptionItem extends OptionItem {
        public static final Parcelable.Creator<SeekOptionItem> CREATOR = new RemoteActionCompatParcelizer();

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
        private final String AudioAttributesCompatParcelizer;

        public static final class RemoteActionCompatParcelizer implements Parcelable.Creator<SeekOptionItem> {
            private static SeekOptionItem AudioAttributesCompatParcelizer(Parcel parcel) {
                toMagicModuleMetaRepoModel.write(parcel, "");
                return new SeekOptionItem(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ SeekOptionItem createFromParcel(Parcel parcel) {
                return AudioAttributesCompatParcelizer(parcel);
            }

            private static SeekOptionItem[] read(int i) {
                return new SeekOptionItem[i];
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ SeekOptionItem[] newArray(int i) {
                return read(i);
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SeekOptionItem(String str) {
            super(str, null);
            toMagicModuleMetaRepoModel.write(str, "");
            this.AudioAttributesCompatParcelizer = str;
        }

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
        public final String getAudioAttributesCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            return (p0 instanceof SeekOptionItem) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) ((SeekOptionItem) p0).AudioAttributesCompatParcelizer);
        }

        public final int hashCode() {
            return this.AudioAttributesCompatParcelizer.hashCode();
        }

        public final String toString() {
            String str = this.AudioAttributesCompatParcelizer;
            StringBuilder sb = new StringBuilder("SeekOptionItem(AudioAttributesCompatParcelizer=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel p0, int p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            p0.writeString(this.AudioAttributesCompatParcelizer);
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\tHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\bJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0018\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u000f"}, d2 = {"Lcom/marrow/ui/activities/learn/video/overlay/OptionItem$PlaybackSpeedOptionItem;", "Lcom/marrow/ui/activities/learn/video/overlay/OptionItem;", "", "p0", "<init>", "(Ljava/lang/String;)V", "", "describeContents", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "p1", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "write", "Ljava/lang/String;", "AudioAttributesCompatParcelizer", "IconCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PlaybackSpeedOptionItem extends OptionItem {
        public static final Parcelable.Creator<PlaybackSpeedOptionItem> CREATOR = new read();

        /* JADX INFO: renamed from: write, reason: from kotlin metadata */
        private final String IconCompatParcelizer;

        public static final class read implements Parcelable.Creator<PlaybackSpeedOptionItem> {
            private static PlaybackSpeedOptionItem AudioAttributesCompatParcelizer(Parcel parcel) {
                toMagicModuleMetaRepoModel.write(parcel, "");
                return new PlaybackSpeedOptionItem(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ PlaybackSpeedOptionItem createFromParcel(Parcel parcel) {
                return AudioAttributesCompatParcelizer(parcel);
            }

            private static PlaybackSpeedOptionItem[] read(int i) {
                return new PlaybackSpeedOptionItem[i];
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ PlaybackSpeedOptionItem[] newArray(int i) {
                return read(i);
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PlaybackSpeedOptionItem(String str) {
            super(str, null);
            toMagicModuleMetaRepoModel.write(str, "");
            this.IconCompatParcelizer = str;
        }

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
        public final String getIconCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            return (p0 instanceof PlaybackSpeedOptionItem) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) ((PlaybackSpeedOptionItem) p0).IconCompatParcelizer);
        }

        public final int hashCode() {
            return this.IconCompatParcelizer.hashCode();
        }

        public final String toString() {
            String str = this.IconCompatParcelizer;
            StringBuilder sb = new StringBuilder("PlaybackSpeedOptionItem(IconCompatParcelizer=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel p0, int p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            p0.writeString(this.IconCompatParcelizer);
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000f\u0010\nJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0018\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0011R\u001a\u0010\u0019\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\u0011R\u001a\u0010\u001c\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\n"}, d2 = {"Lcom/marrow/ui/activities/learn/video/overlay/OptionItem$SubjectTextOptionItem;", "Lcom/marrow/ui/activities/learn/video/overlay/OptionItem;", "", "p0", "p1", "", "p2", "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", "describeContents", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "write", "Ljava/lang/String;", "AudioAttributesCompatParcelizer", "IconCompatParcelizer", "RemoteActionCompatParcelizer", "I", "read"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SubjectTextOptionItem extends OptionItem {
        public static final Parcelable.Creator<SubjectTextOptionItem> CREATOR = new RemoteActionCompatParcelizer();
        private final String IconCompatParcelizer;

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
        private final int read;

        /* JADX INFO: renamed from: write, reason: from kotlin metadata */
        private final String AudioAttributesCompatParcelizer;

        public static final class RemoteActionCompatParcelizer implements Parcelable.Creator<SubjectTextOptionItem> {
            private static SubjectTextOptionItem AudioAttributesCompatParcelizer(Parcel parcel) {
                toMagicModuleMetaRepoModel.write(parcel, "");
                return new SubjectTextOptionItem(parcel.readString(), parcel.readString(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ SubjectTextOptionItem createFromParcel(Parcel parcel) {
                return AudioAttributesCompatParcelizer(parcel);
            }

            private static SubjectTextOptionItem[] IconCompatParcelizer(int i) {
                return new SubjectTextOptionItem[i];
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ SubjectTextOptionItem[] newArray(int i) {
                return IconCompatParcelizer(i);
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SubjectTextOptionItem(String str, String str2, int i) {
            super(str, null);
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            this.AudioAttributesCompatParcelizer = str;
            this.IconCompatParcelizer = str2;
            this.read = i;
        }

        /* JADX INFO: renamed from: write, reason: from getter */
        public final String getAudioAttributesCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
        public final String getIconCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        /* JADX INFO: renamed from: read, reason: from getter */
        public final int getRead() {
            return this.read;
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof SubjectTextOptionItem)) {
                return false;
            }
            SubjectTextOptionItem subjectTextOptionItem = (SubjectTextOptionItem) p0;
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) subjectTextOptionItem.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) subjectTextOptionItem.IconCompatParcelizer) && this.read == subjectTextOptionItem.read;
        }

        public final int hashCode() {
            return (((this.AudioAttributesCompatParcelizer.hashCode() * 31) + this.IconCompatParcelizer.hashCode()) * 31) + Integer.hashCode(this.read);
        }

        public final String toString() {
            String str = this.AudioAttributesCompatParcelizer;
            String str2 = this.IconCompatParcelizer;
            int i = this.read;
            StringBuilder sb = new StringBuilder("SubjectTextOptionItem(AudioAttributesCompatParcelizer=");
            sb.append(str);
            sb.append(", IconCompatParcelizer=");
            sb.append(str2);
            sb.append(", read=");
            sb.append(i);
            sb.append(")");
            return sb.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel p0, int p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            p0.writeString(this.AudioAttributesCompatParcelizer);
            p0.writeString(this.IconCompatParcelizer);
            p0.writeInt(this.read);
        }
    }
}
