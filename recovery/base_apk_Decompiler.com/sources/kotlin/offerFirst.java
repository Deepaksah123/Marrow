package kotlin;

import com.google.android.exoplayer2.C;
import kotlin.removeFirstOccurrence;

/* JADX INFO: loaded from: classes2.dex */
public final class offerFirst implements removeFirstOccurrence {
    private int AudioAttributesCompatParcelizer;
    private boolean AudioAttributesImplApi21Parcelizer;
    private boolean AudioAttributesImplApi26Parcelizer;
    private int IconCompatParcelizer;
    private final checkNotEmpty MediaBrowserCompatItemReceiver;
    private long MediaBrowserCompatMediaItem;
    private MinimalClassNameIdResolver MediaDescriptionCompat;
    private int RemoteActionCompatParcelizer;
    private boolean read;
    private boolean write;
    private final AsExternalTypeSerializer AudioAttributesImplBaseParcelizer = new AsExternalTypeSerializer(new byte[10]);
    private int MediaBrowserCompatCustomActionResultReceiver = 0;

    public offerFirst(checkNotEmpty checknotempty) {
        this.MediaBrowserCompatItemReceiver = checknotempty;
    }

    @Override // kotlin.removeFirstOccurrence
    public final void RemoteActionCompatParcelizer(MinimalClassNameIdResolver minimalClassNameIdResolver, findRawSuperTypes findrawsupertypes, removeFirstOccurrence.write writeVar) {
        this.MediaDescriptionCompat = minimalClassNameIdResolver;
        this.MediaBrowserCompatItemReceiver.write(findrawsupertypes, writeVar);
    }

    @Override // kotlin.removeFirstOccurrence
    public final void IconCompatParcelizer() {
        this.MediaBrowserCompatCustomActionResultReceiver = 0;
        this.IconCompatParcelizer = 0;
        this.AudioAttributesImplApi26Parcelizer = false;
        this.MediaBrowserCompatItemReceiver.write();
    }

    @Override // kotlin.removeFirstOccurrence
    public final void IconCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer, int i) throws SchemaAware {
        buildTypeSerializer.AudioAttributesCompatParcelizer(this.MediaDescriptionCompat);
        if ((i & 1) != 0) {
            int i2 = this.MediaBrowserCompatCustomActionResultReceiver;
            if (i2 != 0 && i2 != 1) {
                if (i2 == 2) {
                    prune.RemoteActionCompatParcelizer("PesReader", "Unexpected start indicator reading extended header");
                } else if (i2 == 3) {
                    if (this.RemoteActionCompatParcelizer != -1) {
                        StringBuilder sb = new StringBuilder("Unexpected start indicator: expected ");
                        sb.append(this.RemoteActionCompatParcelizer);
                        sb.append(" more bytes");
                        prune.RemoteActionCompatParcelizer("PesReader", sb.toString());
                    }
                    this.MediaBrowserCompatItemReceiver.write(asPropertyTypeDeserializer.read() == 0);
                } else {
                    throw new IllegalStateException();
                }
            }
            RemoteActionCompatParcelizer(1);
        }
        while (asPropertyTypeDeserializer.IconCompatParcelizer() > 0) {
            int i3 = this.MediaBrowserCompatCustomActionResultReceiver;
            if (i3 == 0) {
                asPropertyTypeDeserializer.AudioAttributesImplBaseParcelizer(asPropertyTypeDeserializer.IconCompatParcelizer());
            } else if (i3 != 1) {
                if (i3 == 2) {
                    if (RemoteActionCompatParcelizer(asPropertyTypeDeserializer, this.AudioAttributesImplBaseParcelizer.write, Math.min(10, this.AudioAttributesCompatParcelizer)) && RemoteActionCompatParcelizer(asPropertyTypeDeserializer, (byte[]) null, this.AudioAttributesCompatParcelizer)) {
                        write();
                        i |= this.write ? 4 : 0;
                        this.MediaBrowserCompatItemReceiver.IconCompatParcelizer(this.MediaBrowserCompatMediaItem, i);
                        RemoteActionCompatParcelizer(3);
                    }
                } else if (i3 == 3) {
                    int iIconCompatParcelizer = asPropertyTypeDeserializer.IconCompatParcelizer();
                    int i4 = this.RemoteActionCompatParcelizer;
                    int i5 = i4 == -1 ? 0 : iIconCompatParcelizer - i4;
                    if (i5 > 0) {
                        iIconCompatParcelizer -= i5;
                        asPropertyTypeDeserializer.AudioAttributesCompatParcelizer(asPropertyTypeDeserializer.write() + iIconCompatParcelizer);
                    }
                    this.MediaBrowserCompatItemReceiver.read(asPropertyTypeDeserializer);
                    int i6 = this.RemoteActionCompatParcelizer;
                    if (i6 != -1) {
                        int i7 = i6 - iIconCompatParcelizer;
                        this.RemoteActionCompatParcelizer = i7;
                        if (i7 == 0) {
                            this.MediaBrowserCompatItemReceiver.write(false);
                            RemoteActionCompatParcelizer(1);
                        }
                    }
                } else {
                    throw new IllegalStateException();
                }
            } else if (RemoteActionCompatParcelizer(asPropertyTypeDeserializer, this.AudioAttributesImplBaseParcelizer.write, 9)) {
                RemoteActionCompatParcelizer(read() ? 2 : 0);
            }
        }
    }

    public final boolean IconCompatParcelizer(boolean z) {
        if (this.MediaBrowserCompatCustomActionResultReceiver == 3 && this.RemoteActionCompatParcelizer == -1) {
            return (z && (this.MediaBrowserCompatItemReceiver instanceof addLast)) ? false : true;
        }
        return false;
    }

    private void RemoteActionCompatParcelizer(int i) {
        this.MediaBrowserCompatCustomActionResultReceiver = i;
        this.IconCompatParcelizer = 0;
    }

    private boolean RemoteActionCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer, byte[] bArr, int i) {
        int iMin = Math.min(asPropertyTypeDeserializer.IconCompatParcelizer(), i - this.IconCompatParcelizer);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            asPropertyTypeDeserializer.AudioAttributesImplBaseParcelizer(iMin);
        } else {
            asPropertyTypeDeserializer.write(bArr, this.IconCompatParcelizer, iMin);
        }
        int i2 = this.IconCompatParcelizer + iMin;
        this.IconCompatParcelizer = i2;
        return i2 == i;
    }

    private boolean read() {
        this.AudioAttributesImplBaseParcelizer.read(0);
        int iIconCompatParcelizer = this.AudioAttributesImplBaseParcelizer.IconCompatParcelizer(24);
        if (iIconCompatParcelizer != 1) {
            prune.RemoteActionCompatParcelizer("PesReader", "Unexpected start code prefix: ".concat(String.valueOf(iIconCompatParcelizer)));
            this.RemoteActionCompatParcelizer = -1;
            return false;
        }
        this.AudioAttributesImplBaseParcelizer.write(8);
        int iIconCompatParcelizer2 = this.AudioAttributesImplBaseParcelizer.IconCompatParcelizer(16);
        this.AudioAttributesImplBaseParcelizer.write(5);
        this.write = this.AudioAttributesImplBaseParcelizer.read();
        this.AudioAttributesImplBaseParcelizer.write(2);
        this.AudioAttributesImplApi21Parcelizer = this.AudioAttributesImplBaseParcelizer.read();
        this.read = this.AudioAttributesImplBaseParcelizer.read();
        this.AudioAttributesImplBaseParcelizer.write(6);
        int iIconCompatParcelizer3 = this.AudioAttributesImplBaseParcelizer.IconCompatParcelizer(8);
        this.AudioAttributesCompatParcelizer = iIconCompatParcelizer3;
        if (iIconCompatParcelizer2 == 0) {
            this.RemoteActionCompatParcelizer = -1;
        } else {
            int i = (iIconCompatParcelizer2 - 3) - iIconCompatParcelizer3;
            this.RemoteActionCompatParcelizer = i;
            if (i < 0) {
                StringBuilder sb = new StringBuilder("Found negative packet payload size: ");
                sb.append(this.RemoteActionCompatParcelizer);
                prune.RemoteActionCompatParcelizer("PesReader", sb.toString());
                this.RemoteActionCompatParcelizer = -1;
            }
        }
        return true;
    }

    private void write() {
        char c;
        this.AudioAttributesImplBaseParcelizer.read(0);
        this.MediaBrowserCompatMediaItem = C.TIME_UNSET;
        if (this.AudioAttributesImplApi21Parcelizer) {
            this.AudioAttributesImplBaseParcelizer.write(4);
            long jIconCompatParcelizer = this.AudioAttributesImplBaseParcelizer.IconCompatParcelizer(3);
            this.AudioAttributesImplBaseParcelizer.write(1);
            long jIconCompatParcelizer2 = this.AudioAttributesImplBaseParcelizer.IconCompatParcelizer(15) << 15;
            this.AudioAttributesImplBaseParcelizer.write(1);
            long jIconCompatParcelizer3 = this.AudioAttributesImplBaseParcelizer.IconCompatParcelizer(15);
            this.AudioAttributesImplBaseParcelizer.write(1);
            if (this.AudioAttributesImplApi26Parcelizer || !this.read) {
                c = 30;
            } else {
                this.AudioAttributesImplBaseParcelizer.write(4);
                long jIconCompatParcelizer4 = this.AudioAttributesImplBaseParcelizer.IconCompatParcelizer(3);
                this.AudioAttributesImplBaseParcelizer.write(1);
                long jIconCompatParcelizer5 = this.AudioAttributesImplBaseParcelizer.IconCompatParcelizer(15) << 15;
                this.AudioAttributesImplBaseParcelizer.write(1);
                long jIconCompatParcelizer6 = this.AudioAttributesImplBaseParcelizer.IconCompatParcelizer(15);
                this.AudioAttributesImplBaseParcelizer.write(1);
                c = 30;
                this.MediaDescriptionCompat.write((jIconCompatParcelizer4 << 30) | jIconCompatParcelizer5 | jIconCompatParcelizer6);
                this.AudioAttributesImplApi26Parcelizer = true;
            }
            this.MediaBrowserCompatMediaItem = this.MediaDescriptionCompat.write((jIconCompatParcelizer << c) | jIconCompatParcelizer2 | jIconCompatParcelizer3);
        }
    }
}
