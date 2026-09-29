package kotlin;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import java.util.Arrays;
import kotlin.removeFirstOccurrence;

/* JADX INFO: loaded from: classes2.dex */
public final class clear implements checkNotEmpty {
    private static final float[] IconCompatParcelizer = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    private boolean AudioAttributesCompatParcelizer;
    private long AudioAttributesImplApi21Parcelizer;
    private write AudioAttributesImplApi26Parcelizer;
    private long AudioAttributesImplBaseParcelizer;
    private final offer MediaBrowserCompatCustomActionResultReceiver;
    private final boolean[] MediaBrowserCompatItemReceiver;
    private final AsPropertyTypeDeserializer MediaDescriptionCompat;
    private final removeLast RatingCompat;
    private String RemoteActionCompatParcelizer;
    private nonNullString read;
    private final RemoteActionCompatParcelizer write;

    public clear() {
        this(null);
    }

    clear(removeLast removelast) {
        this.RatingCompat = removelast;
        this.MediaBrowserCompatItemReceiver = new boolean[4];
        this.write = new RemoteActionCompatParcelizer();
        this.AudioAttributesImplBaseParcelizer = C.TIME_UNSET;
        if (removelast != null) {
            this.MediaBrowserCompatCustomActionResultReceiver = new offer(178);
            this.MediaDescriptionCompat = new AsPropertyTypeDeserializer();
        } else {
            this.MediaBrowserCompatCustomActionResultReceiver = null;
            this.MediaDescriptionCompat = null;
        }
    }

    @Override // kotlin.checkNotEmpty
    public final void write() {
        noTypeInfoBuilder.read(this.MediaBrowserCompatItemReceiver);
        this.write.AudioAttributesCompatParcelizer();
        write writeVar = this.AudioAttributesImplApi26Parcelizer;
        if (writeVar != null) {
            writeVar.write();
        }
        offer offerVar = this.MediaBrowserCompatCustomActionResultReceiver;
        if (offerVar != null) {
            offerVar.write();
        }
        this.AudioAttributesImplApi21Parcelizer = 0L;
        this.AudioAttributesImplBaseParcelizer = C.TIME_UNSET;
    }

    @Override // kotlin.checkNotEmpty
    public final void write(findRawSuperTypes findrawsupertypes, removeFirstOccurrence.write writeVar) {
        writeVar.read();
        this.RemoteActionCompatParcelizer = writeVar.IconCompatParcelizer();
        nonNullString nonnullstringIconCompatParcelizer = findrawsupertypes.IconCompatParcelizer(writeVar.write(), 2);
        this.read = nonnullstringIconCompatParcelizer;
        this.AudioAttributesImplApi26Parcelizer = new write(nonnullstringIconCompatParcelizer);
        removeLast removelast = this.RatingCompat;
        if (removelast != null) {
            removelast.write(findrawsupertypes, writeVar);
        }
    }

    @Override // kotlin.checkNotEmpty
    public final void IconCompatParcelizer(long j, int i) {
        this.AudioAttributesImplBaseParcelizer = j;
    }

    @Override // kotlin.checkNotEmpty
    public final void read(AsPropertyTypeDeserializer asPropertyTypeDeserializer) {
        buildTypeSerializer.AudioAttributesCompatParcelizer(this.AudioAttributesImplApi26Parcelizer);
        buildTypeSerializer.AudioAttributesCompatParcelizer(this.read);
        int iWrite = asPropertyTypeDeserializer.write();
        int i = asPropertyTypeDeserializer.read();
        byte[] bArrRemoteActionCompatParcelizer = asPropertyTypeDeserializer.RemoteActionCompatParcelizer();
        this.AudioAttributesImplApi21Parcelizer += (long) asPropertyTypeDeserializer.IconCompatParcelizer();
        this.read.RemoteActionCompatParcelizer(asPropertyTypeDeserializer, asPropertyTypeDeserializer.IconCompatParcelizer());
        while (true) {
            int i2 = noTypeInfoBuilder.read(bArrRemoteActionCompatParcelizer, iWrite, i, this.MediaBrowserCompatItemReceiver);
            if (i2 == i) {
                break;
            }
            int i3 = i2 + 3;
            int i4 = asPropertyTypeDeserializer.RemoteActionCompatParcelizer()[i3] & 255;
            int i5 = i2 - iWrite;
            int i6 = 0;
            if (!this.AudioAttributesCompatParcelizer) {
                if (i5 > 0) {
                    this.write.write(bArrRemoteActionCompatParcelizer, iWrite, i2);
                }
                if (this.write.IconCompatParcelizer(i4, i5 < 0 ? -i5 : 0)) {
                    nonNullString nonnullstring = this.read;
                    RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.write;
                    nonnullstring.write(write(remoteActionCompatParcelizer, remoteActionCompatParcelizer.AudioAttributesCompatParcelizer, (String) buildTypeSerializer.IconCompatParcelizer(this.RemoteActionCompatParcelizer)));
                    this.AudioAttributesCompatParcelizer = true;
                }
            }
            this.AudioAttributesImplApi26Parcelizer.write(bArrRemoteActionCompatParcelizer, iWrite, i2);
            offer offerVar = this.MediaBrowserCompatCustomActionResultReceiver;
            if (offerVar != null) {
                if (i5 > 0) {
                    offerVar.AudioAttributesCompatParcelizer(bArrRemoteActionCompatParcelizer, iWrite, i2);
                } else {
                    i6 = -i5;
                }
                if (this.MediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer(i6)) {
                    ((AsPropertyTypeDeserializer) LaissezFaireSubTypeValidator.IconCompatParcelizer(this.MediaDescriptionCompat)).IconCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver.read, noTypeInfoBuilder.IconCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver.read, this.MediaBrowserCompatCustomActionResultReceiver.write));
                    ((removeLast) LaissezFaireSubTypeValidator.IconCompatParcelizer(this.RatingCompat)).read(this.AudioAttributesImplBaseParcelizer, this.MediaDescriptionCompat);
                }
                if (i4 == 178 && asPropertyTypeDeserializer.RemoteActionCompatParcelizer()[i2 + 2] == 1) {
                    this.MediaBrowserCompatCustomActionResultReceiver.write(i4);
                }
            }
            int i7 = i - i2;
            this.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer(this.AudioAttributesImplApi21Parcelizer - ((long) i7), i7, this.AudioAttributesCompatParcelizer);
            this.AudioAttributesImplApi26Parcelizer.read(i4, this.AudioAttributesImplBaseParcelizer);
            iWrite = i3;
        }
        if (!this.AudioAttributesCompatParcelizer) {
            this.write.write(bArrRemoteActionCompatParcelizer, iWrite, i);
        }
        this.AudioAttributesImplApi26Parcelizer.write(bArrRemoteActionCompatParcelizer, iWrite, i);
        offer offerVar2 = this.MediaBrowserCompatCustomActionResultReceiver;
        if (offerVar2 != null) {
            offerVar2.AudioAttributesCompatParcelizer(bArrRemoteActionCompatParcelizer, iWrite, i);
        }
    }

    @Override // kotlin.checkNotEmpty
    public final void write(boolean z) {
        buildTypeSerializer.AudioAttributesCompatParcelizer(this.AudioAttributesImplApi26Parcelizer);
        if (z) {
            this.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer(this.AudioAttributesImplApi21Parcelizer, 0, this.AudioAttributesCompatParcelizer);
            this.AudioAttributesImplApi26Parcelizer.write();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static kotlin.C0170format write(o.clear.RemoteActionCompatParcelizer r6, int r7, java.lang.String r8) {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.clear.write(o.clear$RemoteActionCompatParcelizer, int, java.lang.String):o.format");
    }

    static final class RemoteActionCompatParcelizer {
        private static final byte[] RemoteActionCompatParcelizer = {0, 0, 1};
        public int AudioAttributesCompatParcelizer;
        private int AudioAttributesImplBaseParcelizer;
        private boolean IconCompatParcelizer;
        public int read;
        public byte[] write = new byte[128];

        public final void AudioAttributesCompatParcelizer() {
            this.IconCompatParcelizer = false;
            this.read = 0;
            this.AudioAttributesImplBaseParcelizer = 0;
        }

        public final boolean IconCompatParcelizer(int i, int i2) {
            int i3 = this.AudioAttributesImplBaseParcelizer;
            if (i3 != 0) {
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 != 3) {
                            if (i3 != 4) {
                                throw new IllegalStateException();
                            }
                            if (i == 179 || i == 181) {
                                this.read -= i2;
                                this.IconCompatParcelizer = false;
                                return true;
                            }
                        } else if ((i & PsExtractor.VIDEO_STREAM_MASK) != 32) {
                            prune.RemoteActionCompatParcelizer("H263Reader", "Unexpected start code value");
                            AudioAttributesCompatParcelizer();
                        } else {
                            this.AudioAttributesCompatParcelizer = this.read;
                            this.AudioAttributesImplBaseParcelizer = 4;
                        }
                    } else if (i > 31) {
                        prune.RemoteActionCompatParcelizer("H263Reader", "Unexpected start code value");
                        AudioAttributesCompatParcelizer();
                    } else {
                        this.AudioAttributesImplBaseParcelizer = 3;
                    }
                } else if (i != 181) {
                    prune.RemoteActionCompatParcelizer("H263Reader", "Unexpected start code value");
                    AudioAttributesCompatParcelizer();
                } else {
                    this.AudioAttributesImplBaseParcelizer = 2;
                }
            } else if (i == 176) {
                this.AudioAttributesImplBaseParcelizer = 1;
                this.IconCompatParcelizer = true;
            }
            byte[] bArr = RemoteActionCompatParcelizer;
            write(bArr, 0, bArr.length);
            return false;
        }

        public final void write(byte[] bArr, int i, int i2) {
            if (this.IconCompatParcelizer) {
                int i3 = i2 - i;
                byte[] bArr2 = this.write;
                int length = bArr2.length;
                int i4 = this.read + i3;
                if (length < i4) {
                    this.write = Arrays.copyOf(bArr2, i4 << 1);
                }
                System.arraycopy(bArr, i, this.write, this.read, i3);
                this.read += i3;
            }
        }
    }

    static final class write {
        private long AudioAttributesCompatParcelizer;
        private long AudioAttributesImplApi26Parcelizer;
        private boolean IconCompatParcelizer;
        private int MediaBrowserCompatCustomActionResultReceiver;
        private int MediaBrowserCompatItemReceiver;
        private final nonNullString RemoteActionCompatParcelizer;
        private boolean read;
        private boolean write;

        public write(nonNullString nonnullstring) {
            this.RemoteActionCompatParcelizer = nonnullstring;
        }

        public final void write() {
            this.IconCompatParcelizer = false;
            this.write = false;
            this.read = false;
            this.MediaBrowserCompatItemReceiver = -1;
        }

        public final void read(int i, long j) {
            this.MediaBrowserCompatItemReceiver = i;
            this.read = false;
            this.IconCompatParcelizer = i == 182 || i == 179;
            this.write = i == 182;
            this.MediaBrowserCompatCustomActionResultReceiver = 0;
            this.AudioAttributesImplApi26Parcelizer = j;
        }

        public final void write(byte[] bArr, int i, int i2) {
            if (this.write) {
                int i3 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i4 = (i + 1) - i3;
                if (i4 < i2) {
                    this.read = ((bArr[i4] & 192) >> 6) == 0;
                    this.write = false;
                } else {
                    this.MediaBrowserCompatCustomActionResultReceiver = i3 + (i2 - i);
                }
            }
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public final void IconCompatParcelizer(long j, int i, boolean z) {
            buildTypeSerializer.write(this.AudioAttributesImplApi26Parcelizer != C.TIME_UNSET);
            if (this.MediaBrowserCompatItemReceiver == 182 && z && this.IconCompatParcelizer) {
                this.RemoteActionCompatParcelizer.IconCompatParcelizer(this.AudioAttributesImplApi26Parcelizer, this.read ? 1 : 0, (int) (j - this.AudioAttributesCompatParcelizer), i, null);
            }
            if (this.MediaBrowserCompatItemReceiver != 179) {
                this.AudioAttributesCompatParcelizer = j;
            }
        }
    }
}
