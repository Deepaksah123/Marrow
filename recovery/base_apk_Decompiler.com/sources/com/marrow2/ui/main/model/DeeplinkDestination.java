package com.marrow2.ui.main.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t"}, d2 = {"Lcom/marrow2/ui/main/model/DeeplinkDestination;", "Landroid/os/Parcelable;", "<init>", "()V", "PracticalCorner", "OpenPhoneNumberScreen", "VideoScreen", "Lcom/marrow2/ui/main/model/DeeplinkDestination$OpenPhoneNumberScreen;", "Lcom/marrow2/ui/main/model/DeeplinkDestination$PracticalCorner;", "Lcom/marrow2/ui/main/model/DeeplinkDestination$VideoScreen;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class DeeplinkDestination implements Parcelable {
    private DeeplinkDestination() {
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\u0006J\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/marrow2/ui/main/model/DeeplinkDestination$PracticalCorner;", "Lcom/marrow2/ui/main/model/DeeplinkDestination;", "<init>", "()V", "", "describeContents", "()I", "", "p0", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "p1", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PracticalCorner extends DeeplinkDestination {
        public static final PracticalCorner INSTANCE = new PracticalCorner();
        public static final Parcelable.Creator<PracticalCorner> CREATOR = new RemoteActionCompatParcelizer();

        /* JADX INFO: loaded from: classes3.dex */
        public static final class RemoteActionCompatParcelizer implements Parcelable.Creator<PracticalCorner> {
            private static PracticalCorner read(Parcel parcel) {
                toMagicModuleMetaRepoModel.write(parcel, "");
                parcel.readInt();
                return PracticalCorner.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ PracticalCorner createFromParcel(Parcel parcel) {
                return read(parcel);
            }

            private static PracticalCorner[] write(int i) {
                return new PracticalCorner[i];
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ PracticalCorner[] newArray(int i) {
                return write(i);
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final int hashCode() {
            return 400024095;
        }

        private PracticalCorner() {
            super(null);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof PracticalCorner)) {
                return false;
            }
            return true;
        }

        public final String toString() {
            return "PracticalCorner";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel p0, int p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            p0.writeInt(1);
        }
    }

    public /* synthetic */ DeeplinkDestination(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this();
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\u0006J\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/marrow2/ui/main/model/DeeplinkDestination$OpenPhoneNumberScreen;", "Lcom/marrow2/ui/main/model/DeeplinkDestination;", "<init>", "()V", "", "describeContents", "()I", "", "p0", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "p1", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OpenPhoneNumberScreen extends DeeplinkDestination {
        public static final OpenPhoneNumberScreen INSTANCE = new OpenPhoneNumberScreen();
        public static final Parcelable.Creator<OpenPhoneNumberScreen> CREATOR = new RemoteActionCompatParcelizer();

        public static final class RemoteActionCompatParcelizer implements Parcelable.Creator<OpenPhoneNumberScreen> {
            private static OpenPhoneNumberScreen read(Parcel parcel) {
                toMagicModuleMetaRepoModel.write(parcel, "");
                parcel.readInt();
                return OpenPhoneNumberScreen.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ OpenPhoneNumberScreen createFromParcel(Parcel parcel) {
                return read(parcel);
            }

            private static OpenPhoneNumberScreen[] IconCompatParcelizer(int i) {
                return new OpenPhoneNumberScreen[i];
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ OpenPhoneNumberScreen[] newArray(int i) {
                return IconCompatParcelizer(i);
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final int hashCode() {
            return -1409307122;
        }

        private OpenPhoneNumberScreen() {
            super(null);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof OpenPhoneNumberScreen)) {
                return false;
            }
            return true;
        }

        public final String toString() {
            return "OpenPhoneNumberScreen";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel p0, int p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            p0.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\tHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\bJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0018\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u000f"}, d2 = {"Lcom/marrow2/ui/main/model/DeeplinkDestination$VideoScreen;", "Lcom/marrow2/ui/main/model/DeeplinkDestination;", "", "p0", "<init>", "(Ljava/lang/String;)V", "", "describeContents", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "p1", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "write", "Ljava/lang/String;", "AudioAttributesCompatParcelizer", "IconCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class VideoScreen extends DeeplinkDestination {
        public static final Parcelable.Creator<VideoScreen> CREATOR = new IconCompatParcelizer();

        /* JADX INFO: renamed from: write, reason: from kotlin metadata */
        private final String IconCompatParcelizer;

        /* JADX INFO: loaded from: classes3.dex */
        public static final class IconCompatParcelizer implements Parcelable.Creator<VideoScreen> {
            private static VideoScreen IconCompatParcelizer(Parcel parcel) {
                toMagicModuleMetaRepoModel.write(parcel, "");
                return new VideoScreen(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ VideoScreen createFromParcel(Parcel parcel) {
                return IconCompatParcelizer(parcel);
            }

            private static VideoScreen[] IconCompatParcelizer(int i) {
                return new VideoScreen[i];
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ VideoScreen[] newArray(int i) {
                return IconCompatParcelizer(i);
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public VideoScreen(String str) {
            super(null);
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
            return (p0 instanceof VideoScreen) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) ((VideoScreen) p0).IconCompatParcelizer);
        }

        public final int hashCode() {
            return this.IconCompatParcelizer.hashCode();
        }

        public final String toString() {
            String str = this.IconCompatParcelizer;
            StringBuilder sb = new StringBuilder("VideoScreen(IconCompatParcelizer=");
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
}
