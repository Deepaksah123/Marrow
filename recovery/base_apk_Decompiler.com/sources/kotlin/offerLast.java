package kotlin;

import kotlin.removeFirstOccurrence;

/* JADX INFO: loaded from: classes2.dex */
public final class offerLast implements removeFirstOccurrence {
    private boolean AudioAttributesCompatParcelizer;
    private boolean AudioAttributesImplBaseParcelizer;
    private int IconCompatParcelizer;
    private final poll RemoteActionCompatParcelizer;
    private final AsPropertyTypeDeserializer read = new AsPropertyTypeDeserializer(32);
    private int write;

    public offerLast(poll pollVar) {
        this.RemoteActionCompatParcelizer = pollVar;
    }

    @Override // kotlin.removeFirstOccurrence
    public final void RemoteActionCompatParcelizer(MinimalClassNameIdResolver minimalClassNameIdResolver, findRawSuperTypes findrawsupertypes, removeFirstOccurrence.write writeVar) {
        this.RemoteActionCompatParcelizer.read(minimalClassNameIdResolver, findrawsupertypes, writeVar);
        this.AudioAttributesImplBaseParcelizer = true;
    }

    @Override // kotlin.removeFirstOccurrence
    public final void IconCompatParcelizer() {
        this.AudioAttributesImplBaseParcelizer = true;
    }

    @Override // kotlin.removeFirstOccurrence
    public final void IconCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer, int i) {
        boolean z = (i & 1) != 0;
        int iWrite = z ? asPropertyTypeDeserializer.write() + asPropertyTypeDeserializer.onPlayFromMediaId() : 0;
        if (this.AudioAttributesImplBaseParcelizer) {
            if (!z) {
                return;
            }
            this.AudioAttributesImplBaseParcelizer = false;
            asPropertyTypeDeserializer.MediaBrowserCompatCustomActionResultReceiver(iWrite);
            this.write = 0;
        }
        while (asPropertyTypeDeserializer.IconCompatParcelizer() > 0) {
            int i2 = this.write;
            if (i2 < 3) {
                if (i2 == 0) {
                    int iOnPlayFromMediaId = asPropertyTypeDeserializer.onPlayFromMediaId();
                    asPropertyTypeDeserializer.MediaBrowserCompatCustomActionResultReceiver(asPropertyTypeDeserializer.write() - 1);
                    if (iOnPlayFromMediaId == 255) {
                        this.AudioAttributesImplBaseParcelizer = true;
                        return;
                    }
                }
                int iMin = Math.min(asPropertyTypeDeserializer.IconCompatParcelizer(), 3 - this.write);
                asPropertyTypeDeserializer.write(this.read.RemoteActionCompatParcelizer(), this.write, iMin);
                int i3 = this.write + iMin;
                this.write = i3;
                if (i3 == 3) {
                    this.read.MediaBrowserCompatCustomActionResultReceiver(0);
                    this.read.AudioAttributesCompatParcelizer(3);
                    this.read.AudioAttributesImplBaseParcelizer(1);
                    int iOnPlayFromMediaId2 = this.read.onPlayFromMediaId();
                    int iOnPlayFromMediaId3 = this.read.onPlayFromMediaId();
                    this.AudioAttributesCompatParcelizer = (iOnPlayFromMediaId2 & 128) != 0;
                    this.IconCompatParcelizer = (((iOnPlayFromMediaId2 & 15) << 8) | iOnPlayFromMediaId3) + 3;
                    int iAudioAttributesCompatParcelizer = this.read.AudioAttributesCompatParcelizer();
                    int i4 = this.IconCompatParcelizer;
                    if (iAudioAttributesCompatParcelizer < i4) {
                        this.read.IconCompatParcelizer(Math.min(4098, Math.max(i4, this.read.AudioAttributesCompatParcelizer() << 1)));
                    }
                }
            } else {
                int iMin2 = Math.min(asPropertyTypeDeserializer.IconCompatParcelizer(), this.IconCompatParcelizer - this.write);
                asPropertyTypeDeserializer.write(this.read.RemoteActionCompatParcelizer(), this.write, iMin2);
                int i5 = this.write + iMin2;
                this.write = i5;
                int i6 = this.IconCompatParcelizer;
                if (i5 != i6) {
                    continue;
                } else {
                    if (this.AudioAttributesCompatParcelizer) {
                        if (LaissezFaireSubTypeValidator.read(this.read.RemoteActionCompatParcelizer(), 0, this.IconCompatParcelizer, -1) != 0) {
                            this.AudioAttributesImplBaseParcelizer = true;
                            return;
                        }
                        this.read.AudioAttributesCompatParcelizer(this.IconCompatParcelizer - 4);
                    } else {
                        this.read.AudioAttributesCompatParcelizer(i6);
                    }
                    this.read.MediaBrowserCompatCustomActionResultReceiver(0);
                    this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(this.read);
                    this.write = 0;
                }
            }
        }
    }
}
