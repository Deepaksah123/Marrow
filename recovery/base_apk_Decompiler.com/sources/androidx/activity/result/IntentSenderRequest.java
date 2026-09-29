package androidx.activity.result;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\f\u0018\u0000 \u00192\u00020\u0001:\u0002\u0016\u0019B\u0011\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B1\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\fJ\u000f\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00078\u0007¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u001a\u0010\u0018\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u000eR\u001a\u0010\u0019\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0018\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b"}, d2 = {"Landroidx/activity/result/IntentSenderRequest;", "Landroid/os/Parcelable;", "Landroid/os/Parcel;", "p0", "<init>", "(Landroid/os/Parcel;)V", "Landroid/content/IntentSender;", "Landroid/content/Intent;", "p1", "", "p2", "p3", "(Landroid/content/IntentSender;Landroid/content/Intent;II)V", "describeContents", "()I", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "read", "Landroid/content/Intent;", "()Landroid/content/Intent;", "write", "RemoteActionCompatParcelizer", "I", "AudioAttributesCompatParcelizer", "IconCompatParcelizer", "Landroid/content/IntentSender;", "()Landroid/content/IntentSender;"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class IntentSenderRequest implements Parcelable {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final IntentSender read;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final int AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final Intent write;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final int IconCompatParcelizer;
    public static final Parcelable.Creator<IntentSenderRequest> CREATOR = new AudioAttributesCompatParcelizer();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public IntentSenderRequest(IntentSender intentSender, Intent intent, int i, int i2) {
        toMagicModuleMetaRepoModel.write(intentSender, "");
        this.read = intentSender;
        this.write = intent;
        this.AudioAttributesCompatParcelizer = i;
        this.IconCompatParcelizer = i2;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final IntentSender getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final Intent getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final int getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final int getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public IntentSenderRequest(Parcel parcel) {
        toMagicModuleMetaRepoModel.write(parcel, "");
        Parcelable parcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
        toMagicModuleMetaRepoModel.write(parcelable);
        this((IntentSender) parcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel p0, int p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        p0.writeParcelable(this.read, p1);
        p0.writeParcelable(this.write, p1);
        p0.writeInt(this.AudioAttributesCompatParcelizer);
        p0.writeInt(this.IconCompatParcelizer);
    }

    public static final class RemoteActionCompatParcelizer {
        private int AudioAttributesCompatParcelizer;
        private int RemoteActionCompatParcelizer;
        private final IntentSender read;
        private Intent write;

        public RemoteActionCompatParcelizer(IntentSender intentSender) {
            toMagicModuleMetaRepoModel.write(intentSender, "");
            this.read = intentSender;
        }

        public final RemoteActionCompatParcelizer IconCompatParcelizer(Intent intent) {
            this.write = intent;
            return this;
        }

        public final RemoteActionCompatParcelizer IconCompatParcelizer(int i, int i2) {
            this.RemoteActionCompatParcelizer = i;
            this.AudioAttributesCompatParcelizer = i2;
            return this;
        }

        public final IntentSenderRequest RemoteActionCompatParcelizer() {
            return new IntentSenderRequest(this.read, this.write, this.AudioAttributesCompatParcelizer, this.RemoteActionCompatParcelizer);
        }
    }

    public static final class AudioAttributesCompatParcelizer implements Parcelable.Creator<IntentSenderRequest> {
        AudioAttributesCompatParcelizer() {
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ IntentSenderRequest createFromParcel(Parcel parcel) {
            return write(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ IntentSenderRequest[] newArray(int i) {
            return write(i);
        }

        private static IntentSenderRequest write(Parcel parcel) {
            toMagicModuleMetaRepoModel.write(parcel, "");
            return new IntentSenderRequest(parcel);
        }

        private static IntentSenderRequest[] write(int i) {
            return new IntentSenderRequest[i];
        }
    }
}
