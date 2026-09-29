package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;
import kotlin._fromString;

/* JADX INFO: loaded from: classes2.dex */
public final class _resolveCurrentLookup implements _fromString.RemoteActionCompatParcelizer {
    protected final useDefaultValueForUnknownEnum AudioAttributesCompatParcelizer;
    private final _fromString AudioAttributesImplApi21Parcelizer;
    private int AudioAttributesImplApi26Parcelizer = 0;
    private int MediaBrowserCompatMediaItem = 8;
    private constructSet read = null;
    private int[] write = new int[8];
    private int[] RemoteActionCompatParcelizer = new int[8];
    private float[] IconCompatParcelizer = new float[8];
    private int MediaBrowserCompatItemReceiver = -1;
    private int MediaBrowserCompatCustomActionResultReceiver = -1;
    private boolean AudioAttributesImplBaseParcelizer = false;

    _resolveCurrentLookup(_fromString _fromstring, useDefaultValueForUnknownEnum usedefaultvalueforunknownenum) {
        this.AudioAttributesImplApi21Parcelizer = _fromstring;
        this.AudioAttributesCompatParcelizer = usedefaultvalueforunknownenum;
    }

    @Override // o._fromString.RemoteActionCompatParcelizer
    public final void read(constructSet constructset, float f) {
        if (f == BitmapDescriptorFactory.HUE_RED) {
            AudioAttributesCompatParcelizer(constructset, true);
            return;
        }
        int i = this.MediaBrowserCompatItemReceiver;
        if (i == -1) {
            this.MediaBrowserCompatItemReceiver = 0;
            this.IconCompatParcelizer[0] = f;
            this.write[0] = constructset.AudioAttributesCompatParcelizer;
            this.RemoteActionCompatParcelizer[this.MediaBrowserCompatItemReceiver] = -1;
            constructset.MediaMetadataCompat++;
            constructset.read(this.AudioAttributesImplApi21Parcelizer);
            this.AudioAttributesImplApi26Parcelizer++;
            if (this.AudioAttributesImplBaseParcelizer) {
                return;
            }
            int i2 = this.MediaBrowserCompatCustomActionResultReceiver + 1;
            this.MediaBrowserCompatCustomActionResultReceiver = i2;
            int[] iArr = this.write;
            if (i2 >= iArr.length) {
                this.AudioAttributesImplBaseParcelizer = true;
                this.MediaBrowserCompatCustomActionResultReceiver = iArr.length - 1;
                return;
            }
            return;
        }
        int i3 = -1;
        for (int i4 = 0; i != -1 && i4 < this.AudioAttributesImplApi26Parcelizer; i4++) {
            if (this.write[i] == constructset.AudioAttributesCompatParcelizer) {
                this.IconCompatParcelizer[i] = f;
                return;
            }
            if (this.write[i] < constructset.AudioAttributesCompatParcelizer) {
                i3 = i;
            }
            i = this.RemoteActionCompatParcelizer[i];
        }
        int length = this.MediaBrowserCompatCustomActionResultReceiver;
        if (this.AudioAttributesImplBaseParcelizer) {
            int[] iArr2 = this.write;
            if (iArr2[length] != -1) {
                length = iArr2.length;
            }
        } else {
            length++;
        }
        int[] iArr3 = this.write;
        if (length >= iArr3.length && this.AudioAttributesImplApi26Parcelizer < iArr3.length) {
            int i5 = 0;
            while (true) {
                int[] iArr4 = this.write;
                if (i5 >= iArr4.length) {
                    break;
                }
                if (iArr4[i5] == -1) {
                    length = i5;
                    break;
                }
                i5++;
            }
        }
        int[] iArr5 = this.write;
        if (length >= iArr5.length) {
            length = iArr5.length;
            int i6 = this.MediaBrowserCompatMediaItem << 1;
            this.MediaBrowserCompatMediaItem = i6;
            this.AudioAttributesImplBaseParcelizer = false;
            this.MediaBrowserCompatCustomActionResultReceiver = length - 1;
            this.IconCompatParcelizer = Arrays.copyOf(this.IconCompatParcelizer, i6);
            this.write = Arrays.copyOf(this.write, this.MediaBrowserCompatMediaItem);
            this.RemoteActionCompatParcelizer = Arrays.copyOf(this.RemoteActionCompatParcelizer, this.MediaBrowserCompatMediaItem);
        }
        this.write[length] = constructset.AudioAttributesCompatParcelizer;
        this.IconCompatParcelizer[length] = f;
        if (i3 != -1) {
            int[] iArr6 = this.RemoteActionCompatParcelizer;
            iArr6[length] = iArr6[i3];
            iArr6[i3] = length;
        } else {
            this.RemoteActionCompatParcelizer[length] = this.MediaBrowserCompatItemReceiver;
            this.MediaBrowserCompatItemReceiver = length;
        }
        constructset.MediaMetadataCompat++;
        constructset.read(this.AudioAttributesImplApi21Parcelizer);
        int i7 = this.AudioAttributesImplApi26Parcelizer + 1;
        this.AudioAttributesImplApi26Parcelizer = i7;
        if (!this.AudioAttributesImplBaseParcelizer) {
            this.MediaBrowserCompatCustomActionResultReceiver++;
        }
        int[] iArr7 = this.write;
        if (i7 >= iArr7.length) {
            this.AudioAttributesImplBaseParcelizer = true;
        }
        if (this.MediaBrowserCompatCustomActionResultReceiver >= iArr7.length) {
            this.AudioAttributesImplBaseParcelizer = true;
            this.MediaBrowserCompatCustomActionResultReceiver = iArr7.length - 1;
        }
    }

    @Override // o._fromString.RemoteActionCompatParcelizer
    public final void write(constructSet constructset, float f, boolean z) {
        if (f <= -0.001f || f >= 0.001f) {
            int i = this.MediaBrowserCompatItemReceiver;
            if (i == -1) {
                this.MediaBrowserCompatItemReceiver = 0;
                this.IconCompatParcelizer[0] = f;
                this.write[0] = constructset.AudioAttributesCompatParcelizer;
                this.RemoteActionCompatParcelizer[this.MediaBrowserCompatItemReceiver] = -1;
                constructset.MediaMetadataCompat++;
                constructset.read(this.AudioAttributesImplApi21Parcelizer);
                this.AudioAttributesImplApi26Parcelizer++;
                if (this.AudioAttributesImplBaseParcelizer) {
                    return;
                }
                int i2 = this.MediaBrowserCompatCustomActionResultReceiver + 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i2;
                int[] iArr = this.write;
                if (i2 >= iArr.length) {
                    this.AudioAttributesImplBaseParcelizer = true;
                    this.MediaBrowserCompatCustomActionResultReceiver = iArr.length - 1;
                    return;
                }
                return;
            }
            int i3 = -1;
            for (int i4 = 0; i != -1 && i4 < this.AudioAttributesImplApi26Parcelizer; i4++) {
                if (this.write[i] == constructset.AudioAttributesCompatParcelizer) {
                    float[] fArr = this.IconCompatParcelizer;
                    float f2 = fArr[i] + f;
                    if (f2 > -0.001f && f2 < 0.001f) {
                        f2 = 0.0f;
                    }
                    fArr[i] = f2;
                    if (f2 == BitmapDescriptorFactory.HUE_RED) {
                        if (i == this.MediaBrowserCompatItemReceiver) {
                            this.MediaBrowserCompatItemReceiver = this.RemoteActionCompatParcelizer[i];
                        } else {
                            int[] iArr2 = this.RemoteActionCompatParcelizer;
                            iArr2[i3] = iArr2[i];
                        }
                        if (z) {
                            constructset.AudioAttributesCompatParcelizer(this.AudioAttributesImplApi21Parcelizer);
                        }
                        if (this.AudioAttributesImplBaseParcelizer) {
                            this.MediaBrowserCompatCustomActionResultReceiver = i;
                        }
                        constructset.MediaMetadataCompat--;
                        this.AudioAttributesImplApi26Parcelizer--;
                        return;
                    }
                    return;
                }
                if (this.write[i] < constructset.AudioAttributesCompatParcelizer) {
                    i3 = i;
                }
                i = this.RemoteActionCompatParcelizer[i];
            }
            int length = this.MediaBrowserCompatCustomActionResultReceiver;
            if (this.AudioAttributesImplBaseParcelizer) {
                int[] iArr3 = this.write;
                if (iArr3[length] != -1) {
                    length = iArr3.length;
                }
            } else {
                length++;
            }
            int[] iArr4 = this.write;
            if (length >= iArr4.length && this.AudioAttributesImplApi26Parcelizer < iArr4.length) {
                int i5 = 0;
                while (true) {
                    int[] iArr5 = this.write;
                    if (i5 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i5] == -1) {
                        length = i5;
                        break;
                    }
                    i5++;
                }
            }
            int[] iArr6 = this.write;
            if (length >= iArr6.length) {
                length = iArr6.length;
                int i6 = this.MediaBrowserCompatMediaItem << 1;
                this.MediaBrowserCompatMediaItem = i6;
                this.AudioAttributesImplBaseParcelizer = false;
                this.MediaBrowserCompatCustomActionResultReceiver = length - 1;
                this.IconCompatParcelizer = Arrays.copyOf(this.IconCompatParcelizer, i6);
                this.write = Arrays.copyOf(this.write, this.MediaBrowserCompatMediaItem);
                this.RemoteActionCompatParcelizer = Arrays.copyOf(this.RemoteActionCompatParcelizer, this.MediaBrowserCompatMediaItem);
            }
            this.write[length] = constructset.AudioAttributesCompatParcelizer;
            this.IconCompatParcelizer[length] = f;
            if (i3 != -1) {
                int[] iArr7 = this.RemoteActionCompatParcelizer;
                iArr7[length] = iArr7[i3];
                iArr7[i3] = length;
            } else {
                this.RemoteActionCompatParcelizer[length] = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = length;
            }
            constructset.MediaMetadataCompat++;
            constructset.read(this.AudioAttributesImplApi21Parcelizer);
            this.AudioAttributesImplApi26Parcelizer++;
            if (!this.AudioAttributesImplBaseParcelizer) {
                this.MediaBrowserCompatCustomActionResultReceiver++;
            }
            int i7 = this.MediaBrowserCompatCustomActionResultReceiver;
            int[] iArr8 = this.write;
            if (i7 >= iArr8.length) {
                this.AudioAttributesImplBaseParcelizer = true;
                this.MediaBrowserCompatCustomActionResultReceiver = iArr8.length - 1;
            }
        }
    }

    @Override // o._fromString.RemoteActionCompatParcelizer
    public final float AudioAttributesCompatParcelizer(_fromString _fromstring, boolean z) {
        float fIconCompatParcelizer = IconCompatParcelizer(_fromstring.read);
        AudioAttributesCompatParcelizer(_fromstring.read, z);
        _fromString.RemoteActionCompatParcelizer remoteActionCompatParcelizer = _fromstring.AudioAttributesCompatParcelizer;
        int iRemoteActionCompatParcelizer = remoteActionCompatParcelizer.RemoteActionCompatParcelizer();
        for (int i = 0; i < iRemoteActionCompatParcelizer; i++) {
            constructSet constructsetWrite = remoteActionCompatParcelizer.write(i);
            write(constructsetWrite, remoteActionCompatParcelizer.IconCompatParcelizer(constructsetWrite) * fIconCompatParcelizer, z);
        }
        return fIconCompatParcelizer;
    }

    @Override // o._fromString.RemoteActionCompatParcelizer
    public final float AudioAttributesCompatParcelizer(constructSet constructset, boolean z) {
        if (this.read == constructset) {
            this.read = null;
        }
        int i = this.MediaBrowserCompatItemReceiver;
        if (i == -1) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.AudioAttributesImplApi26Parcelizer) {
            if (this.write[i] == constructset.AudioAttributesCompatParcelizer) {
                if (i == this.MediaBrowserCompatItemReceiver) {
                    this.MediaBrowserCompatItemReceiver = this.RemoteActionCompatParcelizer[i];
                } else {
                    int[] iArr = this.RemoteActionCompatParcelizer;
                    iArr[i3] = iArr[i];
                }
                if (z) {
                    constructset.AudioAttributesCompatParcelizer(this.AudioAttributesImplApi21Parcelizer);
                }
                constructset.MediaMetadataCompat--;
                this.AudioAttributesImplApi26Parcelizer--;
                this.write[i] = -1;
                if (this.AudioAttributesImplBaseParcelizer) {
                    this.MediaBrowserCompatCustomActionResultReceiver = i;
                }
                return this.IconCompatParcelizer[i];
            }
            i2++;
            i3 = i;
            i = this.RemoteActionCompatParcelizer[i];
        }
        return BitmapDescriptorFactory.HUE_RED;
    }

    @Override // o._fromString.RemoteActionCompatParcelizer
    public final void AudioAttributesCompatParcelizer() {
        int i = this.MediaBrowserCompatItemReceiver;
        for (int i2 = 0; i != -1 && i2 < this.AudioAttributesImplApi26Parcelizer; i2++) {
            constructSet constructset = this.AudioAttributesCompatParcelizer.read[this.write[i]];
            if (constructset != null) {
                constructset.AudioAttributesCompatParcelizer(this.AudioAttributesImplApi21Parcelizer);
            }
            i = this.RemoteActionCompatParcelizer[i];
        }
        this.MediaBrowserCompatItemReceiver = -1;
        this.MediaBrowserCompatCustomActionResultReceiver = -1;
        this.AudioAttributesImplBaseParcelizer = false;
        this.AudioAttributesImplApi26Parcelizer = 0;
    }

    @Override // o._fromString.RemoteActionCompatParcelizer
    public final boolean write(constructSet constructset) {
        int i = this.MediaBrowserCompatItemReceiver;
        if (i == -1) {
            return false;
        }
        for (int i2 = 0; i != -1 && i2 < this.AudioAttributesImplApi26Parcelizer; i2++) {
            if (this.write[i] == constructset.AudioAttributesCompatParcelizer) {
                return true;
            }
            i = this.RemoteActionCompatParcelizer[i];
        }
        return false;
    }

    @Override // o._fromString.RemoteActionCompatParcelizer
    public final void write() {
        int i = this.MediaBrowserCompatItemReceiver;
        for (int i2 = 0; i != -1 && i2 < this.AudioAttributesImplApi26Parcelizer; i2++) {
            float[] fArr = this.IconCompatParcelizer;
            fArr[i] = -fArr[i];
            i = this.RemoteActionCompatParcelizer[i];
        }
    }

    @Override // o._fromString.RemoteActionCompatParcelizer
    public final void RemoteActionCompatParcelizer(float f) {
        int i = this.MediaBrowserCompatItemReceiver;
        for (int i2 = 0; i != -1 && i2 < this.AudioAttributesImplApi26Parcelizer; i2++) {
            float[] fArr = this.IconCompatParcelizer;
            fArr[i] = fArr[i] / f;
            i = this.RemoteActionCompatParcelizer[i];
        }
    }

    @Override // o._fromString.RemoteActionCompatParcelizer
    public final int RemoteActionCompatParcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    @Override // o._fromString.RemoteActionCompatParcelizer
    public final constructSet write(int i) {
        int i2 = this.MediaBrowserCompatItemReceiver;
        for (int i3 = 0; i2 != -1 && i3 < this.AudioAttributesImplApi26Parcelizer; i3++) {
            if (i3 == i) {
                return this.AudioAttributesCompatParcelizer.read[this.write[i2]];
            }
            i2 = this.RemoteActionCompatParcelizer[i2];
        }
        return null;
    }

    @Override // o._fromString.RemoteActionCompatParcelizer
    public final float RemoteActionCompatParcelizer(int i) {
        int i2 = this.MediaBrowserCompatItemReceiver;
        for (int i3 = 0; i2 != -1 && i3 < this.AudioAttributesImplApi26Parcelizer; i3++) {
            if (i3 == i) {
                return this.IconCompatParcelizer[i2];
            }
            i2 = this.RemoteActionCompatParcelizer[i2];
        }
        return BitmapDescriptorFactory.HUE_RED;
    }

    @Override // o._fromString.RemoteActionCompatParcelizer
    public final float IconCompatParcelizer(constructSet constructset) {
        int i = this.MediaBrowserCompatItemReceiver;
        for (int i2 = 0; i != -1 && i2 < this.AudioAttributesImplApi26Parcelizer; i2++) {
            if (this.write[i] == constructset.AudioAttributesCompatParcelizer) {
                return this.IconCompatParcelizer[i];
            }
            i = this.RemoteActionCompatParcelizer[i];
        }
        return BitmapDescriptorFactory.HUE_RED;
    }

    public final String toString() {
        int i = this.MediaBrowserCompatItemReceiver;
        String string = "";
        for (int i2 = 0; i != -1 && i2 < this.AudioAttributesImplApi26Parcelizer; i2++) {
            StringBuilder sb = new StringBuilder();
            sb.append(string);
            sb.append(" -> ");
            String string2 = sb.toString();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(string2);
            sb2.append(this.IconCompatParcelizer[i]);
            sb2.append(" : ");
            String string3 = sb2.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(string3);
            sb3.append(this.AudioAttributesCompatParcelizer.read[this.write[i]]);
            string = sb3.toString();
            i = this.RemoteActionCompatParcelizer[i];
        }
        return string;
    }
}
