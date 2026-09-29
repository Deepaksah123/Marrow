package kotlin;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public final class getApplicationBanner extends getAllPermissionGroups {
    private final SparseIntArray AudioAttributesImplApi21Parcelizer;
    private int AudioAttributesImplApi26Parcelizer;
    private final int AudioAttributesImplBaseParcelizer;
    private int MediaBrowserCompatCustomActionResultReceiver;
    private final Parcel MediaBrowserCompatItemReceiver;
    private final String MediaMetadataCompat;
    private int RemoteActionCompatParcelizer;
    private final int write;

    public getApplicationBanner(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new setTitleOptional(), new setTitleOptional(), new setTitleOptional());
    }

    private getApplicationBanner(Parcel parcel, int i, int i2, String str, setTitleOptional<String, Method> settitleoptional, setTitleOptional<String, Method> settitleoptional2, setTitleOptional<String, Class> settitleoptional3) {
        super(settitleoptional, settitleoptional2, settitleoptional3);
        this.AudioAttributesImplApi21Parcelizer = new SparseIntArray();
        this.RemoteActionCompatParcelizer = -1;
        this.AudioAttributesImplApi26Parcelizer = -1;
        this.MediaBrowserCompatItemReceiver = parcel;
        this.AudioAttributesImplBaseParcelizer = i;
        this.write = i2;
        this.MediaBrowserCompatCustomActionResultReceiver = i;
        this.MediaMetadataCompat = str;
    }

    @Override // kotlin.getAllPermissionGroups
    public final boolean RemoteActionCompatParcelizer(int i) {
        while (this.MediaBrowserCompatCustomActionResultReceiver < this.write) {
            int i2 = this.AudioAttributesImplApi26Parcelizer;
            if (i2 == i) {
                return true;
            }
            if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            this.MediaBrowserCompatItemReceiver.setDataPosition(this.MediaBrowserCompatCustomActionResultReceiver);
            int i3 = this.MediaBrowserCompatItemReceiver.readInt();
            this.AudioAttributesImplApi26Parcelizer = this.MediaBrowserCompatItemReceiver.readInt();
            this.MediaBrowserCompatCustomActionResultReceiver += i3;
        }
        return this.AudioAttributesImplApi26Parcelizer == i;
    }

    @Override // kotlin.getAllPermissionGroups
    public final void AudioAttributesCompatParcelizer(int i) {
        read();
        this.RemoteActionCompatParcelizer = i;
        this.AudioAttributesImplApi21Parcelizer.put(i, this.MediaBrowserCompatItemReceiver.dataPosition());
        write(0);
        write(i);
    }

    @Override // kotlin.getAllPermissionGroups
    public final void read() {
        int i = this.RemoteActionCompatParcelizer;
        if (i >= 0) {
            int i2 = this.AudioAttributesImplApi21Parcelizer.get(i);
            int iDataPosition = this.MediaBrowserCompatItemReceiver.dataPosition();
            this.MediaBrowserCompatItemReceiver.setDataPosition(i2);
            this.MediaBrowserCompatItemReceiver.writeInt(iDataPosition - i2);
            this.MediaBrowserCompatItemReceiver.setDataPosition(iDataPosition);
        }
    }

    @Override // kotlin.getAllPermissionGroups
    protected final getAllPermissionGroups RemoteActionCompatParcelizer() {
        Parcel parcel = this.MediaBrowserCompatItemReceiver;
        int iDataPosition = parcel.dataPosition();
        int i = this.MediaBrowserCompatCustomActionResultReceiver;
        if (i == this.AudioAttributesImplBaseParcelizer) {
            i = this.write;
        }
        int i2 = i;
        StringBuilder sb = new StringBuilder();
        sb.append(this.MediaMetadataCompat);
        sb.append("  ");
        return new getApplicationBanner(parcel, iDataPosition, i2, sb.toString(), this.AudioAttributesCompatParcelizer, this.read, this.IconCompatParcelizer);
    }

    @Override // kotlin.getAllPermissionGroups
    public final void RemoteActionCompatParcelizer(byte[] bArr) {
        if (bArr != null) {
            this.MediaBrowserCompatItemReceiver.writeInt(bArr.length);
            this.MediaBrowserCompatItemReceiver.writeByteArray(bArr);
        } else {
            this.MediaBrowserCompatItemReceiver.writeInt(-1);
        }
    }

    @Override // kotlin.getAllPermissionGroups
    public final void write(int i) {
        this.MediaBrowserCompatItemReceiver.writeInt(i);
    }

    @Override // kotlin.getAllPermissionGroups
    public final void read(String str) {
        this.MediaBrowserCompatItemReceiver.writeString(str);
    }

    @Override // kotlin.getAllPermissionGroups
    public final void IconCompatParcelizer(Parcelable parcelable) {
        this.MediaBrowserCompatItemReceiver.writeParcelable(parcelable, 0);
    }

    @Override // kotlin.getAllPermissionGroups
    public final void write(boolean z) {
        this.MediaBrowserCompatItemReceiver.writeInt(z ? 1 : 0);
    }

    @Override // kotlin.getAllPermissionGroups
    protected final void AudioAttributesCompatParcelizer(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.MediaBrowserCompatItemReceiver, 0);
    }

    @Override // kotlin.getAllPermissionGroups
    protected final CharSequence MediaBrowserCompatItemReceiver() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.MediaBrowserCompatItemReceiver);
    }

    @Override // kotlin.getAllPermissionGroups
    public final int AudioAttributesImplBaseParcelizer() {
        return this.MediaBrowserCompatItemReceiver.readInt();
    }

    @Override // kotlin.getAllPermissionGroups
    public final String AudioAttributesImplApi26Parcelizer() {
        return this.MediaBrowserCompatItemReceiver.readString();
    }

    @Override // kotlin.getAllPermissionGroups
    public final byte[] IconCompatParcelizer() {
        int i = this.MediaBrowserCompatItemReceiver.readInt();
        if (i < 0) {
            return null;
        }
        byte[] bArr = new byte[i];
        this.MediaBrowserCompatItemReceiver.readByteArray(bArr);
        return bArr;
    }

    @Override // kotlin.getAllPermissionGroups
    public final <T extends Parcelable> T AudioAttributesImplApi21Parcelizer() {
        return (T) this.MediaBrowserCompatItemReceiver.readParcelable(getClass().getClassLoader());
    }

    @Override // kotlin.getAllPermissionGroups
    public final boolean AudioAttributesCompatParcelizer() {
        return this.MediaBrowserCompatItemReceiver.readInt() != 0;
    }
}
