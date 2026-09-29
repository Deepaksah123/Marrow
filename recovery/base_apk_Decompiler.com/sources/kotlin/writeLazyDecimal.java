package kotlin;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import kotlin.getDefaultImpl;
import kotlin.writeLazyDecimal;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes2.dex */
public final class writeLazyDecimal extends _appendValue {
    private final write[] AudioAttributesCompatParcelizer;
    private int AudioAttributesImplApi26Parcelizer;
    private List<getDefaultImpl> AudioAttributesImplBaseParcelizer;
    private write IconCompatParcelizer;
    private read MediaBrowserCompatCustomActionResultReceiver;
    private final boolean MediaBrowserCompatItemReceiver;
    private final int MediaBrowserCompatSearchResultReceiver;
    private List<getDefaultImpl> read;
    private final AsPropertyTypeDeserializer write = new AsPropertyTypeDeserializer();
    private final AsExternalTypeSerializer RemoteActionCompatParcelizer = new AsExternalTypeSerializer();
    private int AudioAttributesImplApi21Parcelizer = -1;

    @Override // kotlin._appendValue
    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer */
    public final /* bridge */ /* synthetic */ setLenient IconCompatParcelizer() throws parseAsRFC1123 {
        return super.IconCompatParcelizer();
    }

    @Override // kotlin._appendValue
    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver */
    public final /* bridge */ /* synthetic */ withLocale read() throws parseAsRFC1123 {
        return super.read();
    }

    @Override // kotlin._appendValue
    public final /* bridge */ /* synthetic */ void RemoteActionCompatParcelizer(withLocale withlocale) throws parseAsRFC1123 {
        super.RemoteActionCompatParcelizer(withlocale);
    }

    @Override // kotlin._appendValue, kotlin._generateTypeId
    public final /* bridge */ /* synthetic */ void write() {
        super.write();
    }

    @Override // kotlin._appendValue, kotlin.parseAsISO8601
    public final /* bridge */ /* synthetic */ void write(long j) {
        super.write(j);
    }

    public writeLazyDecimal(int i, List<byte[]> list) {
        this.MediaBrowserCompatSearchResultReceiver = i == -1 ? 1 : i;
        this.MediaBrowserCompatItemReceiver = list != null && inclusion.write(list);
        this.AudioAttributesCompatParcelizer = new write[8];
        for (int i2 = 0; i2 < 8; i2++) {
            this.AudioAttributesCompatParcelizer[i2] = new write();
        }
        this.IconCompatParcelizer = this.AudioAttributesCompatParcelizer[0];
    }

    @Override // kotlin._appendValue, kotlin._generateTypeId
    public final void AudioAttributesCompatParcelizer() {
        super.AudioAttributesCompatParcelizer();
        this.read = null;
        this.AudioAttributesImplBaseParcelizer = null;
        this.AudioAttributesImplApi26Parcelizer = 0;
        this.IconCompatParcelizer = this.AudioAttributesCompatParcelizer[0];
        onCommand();
        this.MediaBrowserCompatCustomActionResultReceiver = null;
    }

    @Override // kotlin._appendValue
    protected final boolean AudioAttributesImplApi26Parcelizer() {
        return this.read != this.AudioAttributesImplBaseParcelizer;
    }

    @Override // kotlin._appendValue
    protected final isLenient MediaBrowserCompatItemReceiver() {
        List<getDefaultImpl> list = this.read;
        this.AudioAttributesImplBaseParcelizer = list;
        return new _appendStartMarker((List) buildTypeSerializer.IconCompatParcelizer(list));
    }

    @Override // kotlin._appendValue
    protected final void write(withLocale withlocale) {
        ByteBuffer byteBuffer = (ByteBuffer) buildTypeSerializer.IconCompatParcelizer(withlocale.read);
        this.write.IconCompatParcelizer(byteBuffer.array(), byteBuffer.limit());
        while (this.write.IconCompatParcelizer() >= 3) {
            int iOnPlayFromMediaId = this.write.onPlayFromMediaId();
            int i = iOnPlayFromMediaId & 3;
            boolean z = (iOnPlayFromMediaId & 4) == 4;
            byte bOnPlayFromMediaId = (byte) this.write.onPlayFromMediaId();
            byte bOnPlayFromMediaId2 = (byte) this.write.onPlayFromMediaId();
            if (i == 2 || i == 3) {
                if (z) {
                    if (i == 3) {
                        RemoteActionCompatParcelizer();
                        int i2 = (bOnPlayFromMediaId & 192) >> 6;
                        int i3 = this.AudioAttributesImplApi21Parcelizer;
                        if (i3 != -1 && i2 != (i3 + 1) % 4) {
                            onCommand();
                            StringBuilder sb = new StringBuilder("Sequence number discontinuity. previous=");
                            sb.append(this.AudioAttributesImplApi21Parcelizer);
                            sb.append(" current=");
                            sb.append(i2);
                            prune.RemoteActionCompatParcelizer("Cea708Decoder", sb.toString());
                        }
                        this.AudioAttributesImplApi21Parcelizer = i2;
                        int i4 = bOnPlayFromMediaId & 63;
                        if (i4 == 0) {
                            i4 = 64;
                        }
                        read readVar = new read(i2, i4);
                        this.MediaBrowserCompatCustomActionResultReceiver = readVar;
                        byte[] bArr = readVar.AudioAttributesCompatParcelizer;
                        read readVar2 = this.MediaBrowserCompatCustomActionResultReceiver;
                        int i5 = readVar2.RemoteActionCompatParcelizer;
                        readVar2.RemoteActionCompatParcelizer = i5 + 1;
                        bArr[i5] = bOnPlayFromMediaId2;
                    } else {
                        buildTypeSerializer.IconCompatParcelizer(i == 2);
                        read readVar3 = this.MediaBrowserCompatCustomActionResultReceiver;
                        if (readVar3 == null) {
                            prune.AudioAttributesCompatParcelizer("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = readVar3.AudioAttributesCompatParcelizer;
                            read readVar4 = this.MediaBrowserCompatCustomActionResultReceiver;
                            int i6 = readVar4.RemoteActionCompatParcelizer;
                            readVar4.RemoteActionCompatParcelizer = i6 + 1;
                            bArr2[i6] = bOnPlayFromMediaId;
                            byte[] bArr3 = this.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer;
                            read readVar5 = this.MediaBrowserCompatCustomActionResultReceiver;
                            int i7 = readVar5.RemoteActionCompatParcelizer;
                            readVar5.RemoteActionCompatParcelizer = i7 + 1;
                            bArr3[i7] = bOnPlayFromMediaId2;
                        }
                    }
                    if (this.MediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer == (this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer << 1) - 1) {
                        RemoteActionCompatParcelizer();
                    }
                }
            }
        }
    }

    private void RemoteActionCompatParcelizer() {
        if (this.MediaBrowserCompatCustomActionResultReceiver == null) {
            return;
        }
        onAddQueueItem();
        this.MediaBrowserCompatCustomActionResultReceiver = null;
    }

    private void onAddQueueItem() {
        if (this.MediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer != (this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer << 1) - 1) {
            StringBuilder sb = new StringBuilder("DtvCcPacket ended prematurely; size is ");
            sb.append((this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer << 1) - 1);
            sb.append(", but current index is ");
            sb.append(this.MediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer);
            sb.append(" (sequence number ");
            sb.append(this.MediaBrowserCompatCustomActionResultReceiver.read);
            sb.append(");");
            prune.IconCompatParcelizer("Cea708Decoder", sb.toString());
        }
        this.RemoteActionCompatParcelizer.read(this.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer, this.MediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer);
        boolean z = false;
        while (true) {
            if (this.RemoteActionCompatParcelizer.IconCompatParcelizer() <= 0) {
                break;
            }
            int iIconCompatParcelizer = this.RemoteActionCompatParcelizer.IconCompatParcelizer(3);
            int iIconCompatParcelizer2 = this.RemoteActionCompatParcelizer.IconCompatParcelizer(5);
            if (iIconCompatParcelizer == 7) {
                this.RemoteActionCompatParcelizer.write(2);
                iIconCompatParcelizer = this.RemoteActionCompatParcelizer.IconCompatParcelizer(6);
                if (iIconCompatParcelizer < 7) {
                    prune.RemoteActionCompatParcelizer("Cea708Decoder", "Invalid extended service number: ".concat(String.valueOf(iIconCompatParcelizer)));
                }
            }
            if (iIconCompatParcelizer2 == 0) {
                if (iIconCompatParcelizer != 0) {
                    StringBuilder sb2 = new StringBuilder("serviceNumber is non-zero (");
                    sb2.append(iIconCompatParcelizer);
                    sb2.append(") when blockSize is 0");
                    prune.RemoteActionCompatParcelizer("Cea708Decoder", sb2.toString());
                }
            } else if (iIconCompatParcelizer != this.MediaBrowserCompatSearchResultReceiver) {
                this.RemoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver(iIconCompatParcelizer2);
            } else {
                int iAudioAttributesCompatParcelizer = this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer();
                while (this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer() < (iIconCompatParcelizer2 << 3) + iAudioAttributesCompatParcelizer) {
                    int iIconCompatParcelizer3 = this.RemoteActionCompatParcelizer.IconCompatParcelizer(8);
                    if (iIconCompatParcelizer3 == 16) {
                        int iIconCompatParcelizer4 = this.RemoteActionCompatParcelizer.IconCompatParcelizer(8);
                        if (iIconCompatParcelizer4 <= 31) {
                            AudioAttributesCompatParcelizer(iIconCompatParcelizer4);
                        } else {
                            if (iIconCompatParcelizer4 <= 127) {
                                AudioAttributesImplApi26Parcelizer(iIconCompatParcelizer4);
                            } else if (iIconCompatParcelizer4 <= 159) {
                                RemoteActionCompatParcelizer(iIconCompatParcelizer4);
                            } else if (iIconCompatParcelizer4 <= 255) {
                                MediaBrowserCompatCustomActionResultReceiver(iIconCompatParcelizer4);
                            } else {
                                prune.RemoteActionCompatParcelizer("Cea708Decoder", "Invalid extended command: ".concat(String.valueOf(iIconCompatParcelizer4)));
                            }
                            z = true;
                        }
                    } else if (iIconCompatParcelizer3 <= 31) {
                        read(iIconCompatParcelizer3);
                    } else {
                        if (iIconCompatParcelizer3 <= 127) {
                            AudioAttributesImplApi21Parcelizer(iIconCompatParcelizer3);
                        } else if (iIconCompatParcelizer3 <= 159) {
                            write(iIconCompatParcelizer3);
                        } else if (iIconCompatParcelizer3 <= 255) {
                            MediaBrowserCompatItemReceiver(iIconCompatParcelizer3);
                        } else {
                            prune.RemoteActionCompatParcelizer("Cea708Decoder", "Invalid base command: ".concat(String.valueOf(iIconCompatParcelizer3)));
                        }
                        z = true;
                    }
                }
            }
        }
        if (z) {
            this.read = MediaBrowserCompatSearchResultReceiver();
        }
    }

    private void read(int i) {
        if (i != 0) {
            if (i == 3) {
                this.read = MediaBrowserCompatSearchResultReceiver();
                return;
            }
            if (i == 8) {
                this.IconCompatParcelizer.AudioAttributesCompatParcelizer();
                return;
            }
            switch (i) {
                case 12:
                    onCommand();
                    break;
                case 13:
                    this.IconCompatParcelizer.IconCompatParcelizer('\n');
                    break;
                case 14:
                    break;
                default:
                    if (i >= 17 && i <= 23) {
                        prune.RemoteActionCompatParcelizer("Cea708Decoder", "Currently unsupported COMMAND_EXT1 Command: ".concat(String.valueOf(i)));
                        this.RemoteActionCompatParcelizer.write(8);
                    } else if (i < 24 || i > 31) {
                        prune.RemoteActionCompatParcelizer("Cea708Decoder", "Invalid C0 command: ".concat(String.valueOf(i)));
                    } else {
                        prune.RemoteActionCompatParcelizer("Cea708Decoder", "Currently unsupported COMMAND_P16 Command: ".concat(String.valueOf(i)));
                        this.RemoteActionCompatParcelizer.write(16);
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private void write(int i) {
        int i2 = 1;
        switch (i) {
            case 128:
            case TsExtractor.TS_STREAM_TYPE_AC3 /* 129 */:
            case TsExtractor.TS_STREAM_TYPE_HDMV_DTS /* 130 */:
            case TarConstants.PREFIXLEN_XSTAR /* 131 */:
            case 132:
            case 133:
            case TsExtractor.TS_STREAM_TYPE_SPLICE_INFO /* 134 */:
            case TsExtractor.TS_STREAM_TYPE_E_AC3 /* 135 */:
                int i3 = i - 128;
                if (this.AudioAttributesImplApi26Parcelizer != i3) {
                    this.AudioAttributesImplApi26Parcelizer = i3;
                    this.IconCompatParcelizer = this.AudioAttributesCompatParcelizer[i3];
                }
                break;
            case 136:
                while (i2 <= 8) {
                    if (this.RemoteActionCompatParcelizer.read()) {
                        this.AudioAttributesCompatParcelizer[8 - i2].IconCompatParcelizer();
                    }
                    i2++;
                }
                break;
            case 137:
                for (int i4 = 1; i4 <= 8; i4++) {
                    if (this.RemoteActionCompatParcelizer.read()) {
                        this.AudioAttributesCompatParcelizer[8 - i4].write(true);
                    }
                }
                break;
            case TsExtractor.TS_STREAM_TYPE_DTS /* 138 */:
                while (i2 <= 8) {
                    if (this.RemoteActionCompatParcelizer.read()) {
                        this.AudioAttributesCompatParcelizer[8 - i2].write(false);
                    }
                    i2++;
                }
                break;
            case 139:
                for (int i5 = 1; i5 <= 8; i5++) {
                    if (this.RemoteActionCompatParcelizer.read()) {
                        this.AudioAttributesCompatParcelizer[8 - i5].write(!r0.MediaBrowserCompatCustomActionResultReceiver());
                    }
                }
                break;
            case 140:
                while (i2 <= 8) {
                    if (this.RemoteActionCompatParcelizer.read()) {
                        this.AudioAttributesCompatParcelizer[8 - i2].AudioAttributesImplApi26Parcelizer();
                    }
                    i2++;
                }
                break;
            case 141:
                this.RemoteActionCompatParcelizer.write(8);
                break;
            case 142:
                break;
            case 143:
                onCommand();
                break;
            case 144:
                if (!this.IconCompatParcelizer.RemoteActionCompatParcelizer()) {
                    this.RemoteActionCompatParcelizer.write(16);
                } else {
                    MediaMetadataCompat();
                }
                break;
            case 145:
                if (!this.IconCompatParcelizer.RemoteActionCompatParcelizer()) {
                    this.RemoteActionCompatParcelizer.write(24);
                } else {
                    MediaDescriptionCompat();
                }
                break;
            case 146:
                if (!this.IconCompatParcelizer.RemoteActionCompatParcelizer()) {
                    this.RemoteActionCompatParcelizer.write(16);
                } else {
                    MediaBrowserCompatMediaItem();
                }
                break;
            case 147:
            case TarConstants.CHKSUM_OFFSET /* 148 */:
            case 149:
            case 150:
            default:
                prune.RemoteActionCompatParcelizer("Cea708Decoder", "Invalid C1 command: ".concat(String.valueOf(i)));
                break;
            case 151:
                if (!this.IconCompatParcelizer.RemoteActionCompatParcelizer()) {
                    this.RemoteActionCompatParcelizer.write(32);
                } else {
                    MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
                }
                break;
            case 152:
            case 153:
            case 154:
            case TarConstants.PREFIXLEN /* 155 */:
            case 156:
            case 157:
            case 158:
            case 159:
                int i6 = i - 152;
                IconCompatParcelizer(i6);
                if (this.AudioAttributesImplApi26Parcelizer != i6) {
                    this.AudioAttributesImplApi26Parcelizer = i6;
                    this.IconCompatParcelizer = this.AudioAttributesCompatParcelizer[i6];
                }
                break;
        }
    }

    private void AudioAttributesCompatParcelizer(int i) {
        if (i > 7) {
            if (i <= 15) {
                this.RemoteActionCompatParcelizer.write(8);
            } else if (i <= 23) {
                this.RemoteActionCompatParcelizer.write(16);
            } else if (i <= 31) {
                this.RemoteActionCompatParcelizer.write(24);
            }
        }
    }

    private void RemoteActionCompatParcelizer(int i) {
        if (i <= 135) {
            this.RemoteActionCompatParcelizer.write(32);
            return;
        }
        if (i <= 143) {
            this.RemoteActionCompatParcelizer.write(40);
        } else if (i <= 159) {
            this.RemoteActionCompatParcelizer.write(2);
            this.RemoteActionCompatParcelizer.write(this.RemoteActionCompatParcelizer.IconCompatParcelizer(6) << 3);
        }
    }

    private void AudioAttributesImplApi21Parcelizer(int i) {
        if (i == 127) {
            this.IconCompatParcelizer.IconCompatParcelizer((char) 9835);
        } else {
            this.IconCompatParcelizer.IconCompatParcelizer((char) (i & 255));
        }
    }

    private void MediaBrowserCompatItemReceiver(int i) {
        this.IconCompatParcelizer.IconCompatParcelizer((char) (i & 255));
    }

    private void AudioAttributesImplApi26Parcelizer(int i) {
        if (i == 32) {
            this.IconCompatParcelizer.IconCompatParcelizer(' ');
            return;
        }
        if (i == 33) {
            this.IconCompatParcelizer.IconCompatParcelizer((char) 160);
            return;
        }
        if (i == 37) {
            this.IconCompatParcelizer.IconCompatParcelizer((char) 8230);
            return;
        }
        if (i == 42) {
            this.IconCompatParcelizer.IconCompatParcelizer((char) 352);
            return;
        }
        if (i == 44) {
            this.IconCompatParcelizer.IconCompatParcelizer((char) 338);
            return;
        }
        if (i == 63) {
            this.IconCompatParcelizer.IconCompatParcelizer((char) 376);
            return;
        }
        if (i == 57) {
            this.IconCompatParcelizer.IconCompatParcelizer((char) 8482);
            return;
        }
        if (i == 58) {
            this.IconCompatParcelizer.IconCompatParcelizer((char) 353);
            return;
        }
        if (i == 60) {
            this.IconCompatParcelizer.IconCompatParcelizer((char) 339);
            return;
        }
        if (i != 61) {
            switch (i) {
                case 48:
                    this.IconCompatParcelizer.IconCompatParcelizer((char) 9608);
                    break;
                case 49:
                    this.IconCompatParcelizer.IconCompatParcelizer((char) 8216);
                    break;
                case 50:
                    this.IconCompatParcelizer.IconCompatParcelizer((char) 8217);
                    break;
                case 51:
                    this.IconCompatParcelizer.IconCompatParcelizer((char) 8220);
                    break;
                case 52:
                    this.IconCompatParcelizer.IconCompatParcelizer((char) 8221);
                    break;
                case 53:
                    this.IconCompatParcelizer.IconCompatParcelizer((char) 8226);
                    break;
                default:
                    switch (i) {
                        case 118:
                            this.IconCompatParcelizer.IconCompatParcelizer((char) 8539);
                            break;
                        case 119:
                            this.IconCompatParcelizer.IconCompatParcelizer((char) 8540);
                            break;
                        case 120:
                            this.IconCompatParcelizer.IconCompatParcelizer((char) 8541);
                            break;
                        case 121:
                            this.IconCompatParcelizer.IconCompatParcelizer((char) 8542);
                            break;
                        case 122:
                            this.IconCompatParcelizer.IconCompatParcelizer((char) 9474);
                            break;
                        case 123:
                            this.IconCompatParcelizer.IconCompatParcelizer((char) 9488);
                            break;
                        case 124:
                            this.IconCompatParcelizer.IconCompatParcelizer((char) 9492);
                            break;
                        case 125:
                            this.IconCompatParcelizer.IconCompatParcelizer((char) 9472);
                            break;
                        case 126:
                            this.IconCompatParcelizer.IconCompatParcelizer((char) 9496);
                            break;
                        case 127:
                            this.IconCompatParcelizer.IconCompatParcelizer((char) 9484);
                            break;
                        default:
                            prune.RemoteActionCompatParcelizer("Cea708Decoder", "Invalid G2 character: ".concat(String.valueOf(i)));
                            break;
                    }
                    break;
            }
            return;
        }
        this.IconCompatParcelizer.IconCompatParcelizer((char) 8480);
    }

    private void MediaBrowserCompatCustomActionResultReceiver(int i) {
        if (i == 160) {
            this.IconCompatParcelizer.IconCompatParcelizer((char) 13252);
        } else {
            prune.RemoteActionCompatParcelizer("Cea708Decoder", "Invalid G3 character: ".concat(String.valueOf(i)));
            this.IconCompatParcelizer.IconCompatParcelizer('_');
        }
    }

    private void MediaMetadataCompat() {
        this.RemoteActionCompatParcelizer.IconCompatParcelizer(4);
        this.RemoteActionCompatParcelizer.IconCompatParcelizer(2);
        this.RemoteActionCompatParcelizer.IconCompatParcelizer(2);
        boolean z = this.RemoteActionCompatParcelizer.read();
        boolean z2 = this.RemoteActionCompatParcelizer.read();
        this.RemoteActionCompatParcelizer.IconCompatParcelizer(3);
        this.RemoteActionCompatParcelizer.IconCompatParcelizer(3);
        this.IconCompatParcelizer.AudioAttributesCompatParcelizer(z, z2);
    }

    private void MediaDescriptionCompat() {
        int iAudioAttributesCompatParcelizer = write.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer.IconCompatParcelizer(2), this.RemoteActionCompatParcelizer.IconCompatParcelizer(2), this.RemoteActionCompatParcelizer.IconCompatParcelizer(2), this.RemoteActionCompatParcelizer.IconCompatParcelizer(2));
        int iAudioAttributesCompatParcelizer2 = write.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer.IconCompatParcelizer(2), this.RemoteActionCompatParcelizer.IconCompatParcelizer(2), this.RemoteActionCompatParcelizer.IconCompatParcelizer(2), this.RemoteActionCompatParcelizer.IconCompatParcelizer(2));
        this.RemoteActionCompatParcelizer.write(2);
        write.write(this.RemoteActionCompatParcelizer.IconCompatParcelizer(2), this.RemoteActionCompatParcelizer.IconCompatParcelizer(2), this.RemoteActionCompatParcelizer.IconCompatParcelizer(2));
        this.IconCompatParcelizer.AudioAttributesCompatParcelizer(iAudioAttributesCompatParcelizer, iAudioAttributesCompatParcelizer2);
    }

    private void MediaBrowserCompatMediaItem() {
        this.RemoteActionCompatParcelizer.write(4);
        int iIconCompatParcelizer = this.RemoteActionCompatParcelizer.IconCompatParcelizer(4);
        this.RemoteActionCompatParcelizer.write(2);
        this.RemoteActionCompatParcelizer.IconCompatParcelizer(6);
        this.IconCompatParcelizer.AudioAttributesCompatParcelizer(iIconCompatParcelizer);
    }

    private void MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        int iAudioAttributesCompatParcelizer = write.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer.IconCompatParcelizer(2), this.RemoteActionCompatParcelizer.IconCompatParcelizer(2), this.RemoteActionCompatParcelizer.IconCompatParcelizer(2), this.RemoteActionCompatParcelizer.IconCompatParcelizer(2));
        this.RemoteActionCompatParcelizer.IconCompatParcelizer(2);
        write.write(this.RemoteActionCompatParcelizer.IconCompatParcelizer(2), this.RemoteActionCompatParcelizer.IconCompatParcelizer(2), this.RemoteActionCompatParcelizer.IconCompatParcelizer(2));
        this.RemoteActionCompatParcelizer.read();
        this.RemoteActionCompatParcelizer.read();
        this.RemoteActionCompatParcelizer.IconCompatParcelizer(2);
        this.RemoteActionCompatParcelizer.IconCompatParcelizer(2);
        int iIconCompatParcelizer = this.RemoteActionCompatParcelizer.IconCompatParcelizer(2);
        this.RemoteActionCompatParcelizer.write(8);
        this.IconCompatParcelizer.write(iAudioAttributesCompatParcelizer, iIconCompatParcelizer);
    }

    private void IconCompatParcelizer(int i) {
        write writeVar = this.AudioAttributesCompatParcelizer[i];
        this.RemoteActionCompatParcelizer.write(2);
        boolean z = this.RemoteActionCompatParcelizer.read();
        this.RemoteActionCompatParcelizer.write(2);
        int iIconCompatParcelizer = this.RemoteActionCompatParcelizer.IconCompatParcelizer(3);
        boolean z2 = this.RemoteActionCompatParcelizer.read();
        int iIconCompatParcelizer2 = this.RemoteActionCompatParcelizer.IconCompatParcelizer(7);
        int iIconCompatParcelizer3 = this.RemoteActionCompatParcelizer.IconCompatParcelizer(8);
        int iIconCompatParcelizer4 = this.RemoteActionCompatParcelizer.IconCompatParcelizer(4);
        int iIconCompatParcelizer5 = this.RemoteActionCompatParcelizer.IconCompatParcelizer(4);
        this.RemoteActionCompatParcelizer.write(2);
        this.RemoteActionCompatParcelizer.write(6);
        this.RemoteActionCompatParcelizer.write(2);
        writeVar.read(z, iIconCompatParcelizer, z2, iIconCompatParcelizer2, iIconCompatParcelizer3, iIconCompatParcelizer5, iIconCompatParcelizer4, this.RemoteActionCompatParcelizer.IconCompatParcelizer(3), this.RemoteActionCompatParcelizer.IconCompatParcelizer(3));
    }

    private List<getDefaultImpl> MediaBrowserCompatSearchResultReceiver() {
        RemoteActionCompatParcelizer remoteActionCompatParcelizerWrite;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 8; i++) {
            if (!this.AudioAttributesCompatParcelizer[i].read() && this.AudioAttributesCompatParcelizer[i].MediaBrowserCompatCustomActionResultReceiver() && (remoteActionCompatParcelizerWrite = this.AudioAttributesCompatParcelizer[i].write()) != null) {
                arrayList.add(remoteActionCompatParcelizerWrite);
            }
        }
        Collections.sort(arrayList, RemoteActionCompatParcelizer.read);
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            arrayList2.add(((RemoteActionCompatParcelizer) arrayList.get(i2)).write);
        }
        return Collections.unmodifiableList(arrayList2);
    }

    private void onCommand() {
        for (int i = 0; i < 8; i++) {
            this.AudioAttributesCompatParcelizer[i].AudioAttributesImplApi26Parcelizer();
        }
    }

    static final class read {
        public final byte[] AudioAttributesCompatParcelizer;
        public final int IconCompatParcelizer;
        int RemoteActionCompatParcelizer = 0;
        public final int read;

        public read(int i, int i2) {
            this.read = i;
            this.IconCompatParcelizer = i2;
            this.AudioAttributesCompatParcelizer = new byte[(i2 << 1) - 1];
        }
    }

    static final class write {
        private static final int[] AudioAttributesCompatParcelizer;
        private static final boolean[] AudioAttributesImplApi21Parcelizer;
        private static final int[] AudioAttributesImplApi26Parcelizer;
        private static final int[] AudioAttributesImplBaseParcelizer;
        private static int IconCompatParcelizer;
        private static final int[] MediaBrowserCompatCustomActionResultReceiver;
        private static final int[] MediaBrowserCompatItemReceiver;
        private static final int[] RemoteActionCompatParcelizer;
        private static int read = AudioAttributesCompatParcelizer(2, 2, 2, 0);
        private static final int[] write;
        private int MediaBrowserCompatMediaItem;
        private int MediaBrowserCompatSearchResultReceiver;
        private int MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        private int MediaDescriptionCompat;
        private boolean MediaMetadataCompat;
        private int handleMediaPlayPauseIfPendingOnHandler;
        private int onAddQueueItem;
        private int onCommand;
        private int onCustomAction;
        private boolean onFastForward;
        private int onPause;
        private int onPlay;
        private int onPlayFromMediaId;
        private int onPlayFromSearch;
        private boolean onPlayFromUri;
        private int onPrepare;
        private int onPrepareFromMediaId;
        private int onPrepareFromSearch;
        private int onRemoveQueueItem;
        private final List<SpannableString> onMediaButtonEvent = new ArrayList();
        private final SpannableStringBuilder RatingCompat = new SpannableStringBuilder();

        static {
            int iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(0, 0, 0, 0);
            IconCompatParcelizer = iAudioAttributesCompatParcelizer;
            int iAudioAttributesCompatParcelizer2 = AudioAttributesCompatParcelizer(0, 0, 0, 3);
            MediaBrowserCompatCustomActionResultReceiver = new int[]{0, 0, 0, 0, 0, 2, 0};
            MediaBrowserCompatItemReceiver = new int[]{0, 0, 0, 0, 0, 0, 2};
            AudioAttributesImplApi26Parcelizer = new int[]{3, 3, 3, 3, 3, 3, 1};
            AudioAttributesImplApi21Parcelizer = new boolean[]{false, false, false, true, true, true, false};
            AudioAttributesImplBaseParcelizer = new int[]{iAudioAttributesCompatParcelizer, iAudioAttributesCompatParcelizer2, iAudioAttributesCompatParcelizer, iAudioAttributesCompatParcelizer, iAudioAttributesCompatParcelizer2, iAudioAttributesCompatParcelizer, iAudioAttributesCompatParcelizer};
            AudioAttributesCompatParcelizer = new int[]{0, 1, 2, 3, 4, 3, 4};
            write = new int[]{0, 0, 0, 0, 0, 3, 3};
            RemoteActionCompatParcelizer = new int[]{iAudioAttributesCompatParcelizer, iAudioAttributesCompatParcelizer, iAudioAttributesCompatParcelizer, iAudioAttributesCompatParcelizer, iAudioAttributesCompatParcelizer, iAudioAttributesCompatParcelizer2, iAudioAttributesCompatParcelizer2};
        }

        public write() {
            AudioAttributesImplApi26Parcelizer();
        }

        public final boolean read() {
            if (RemoteActionCompatParcelizer()) {
                return this.onMediaButtonEvent.isEmpty() && this.RatingCompat.length() == 0;
            }
            return true;
        }

        public final void AudioAttributesImplApi26Parcelizer() {
            IconCompatParcelizer();
            this.MediaMetadataCompat = false;
            this.onPlayFromUri = false;
            this.onPlayFromMediaId = 4;
            this.onFastForward = false;
            this.onPlayFromSearch = 0;
            this.onAddQueueItem = 0;
            this.MediaBrowserCompatMediaItem = 0;
            this.onPrepareFromMediaId = 15;
            this.handleMediaPlayPauseIfPendingOnHandler = 0;
            this.onRemoveQueueItem = 0;
            this.onPause = 0;
            int i = IconCompatParcelizer;
            this.onPrepareFromSearch = i;
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = read;
            this.MediaBrowserCompatSearchResultReceiver = i;
        }

        public final void IconCompatParcelizer() {
            this.onMediaButtonEvent.clear();
            this.RatingCompat.clear();
            this.onCustomAction = -1;
            this.onPrepare = -1;
            this.onCommand = -1;
            this.MediaDescriptionCompat = -1;
            this.onPlay = 0;
        }

        public final boolean RemoteActionCompatParcelizer() {
            return this.MediaMetadataCompat;
        }

        public final void write(boolean z) {
            this.onPlayFromUri = z;
        }

        public final boolean MediaBrowserCompatCustomActionResultReceiver() {
            return this.onPlayFromUri;
        }

        public final void read(boolean z, int i, boolean z2, int i2, int i3, int i4, int i5, int i6, int i7) {
            this.MediaMetadataCompat = true;
            this.onPlayFromUri = z;
            this.onPlayFromMediaId = i;
            this.onFastForward = z2;
            this.onPlayFromSearch = i2;
            this.onAddQueueItem = i3;
            this.MediaBrowserCompatMediaItem = i5;
            int i8 = i4 + 1;
            if (this.onPrepareFromMediaId != i8) {
                this.onPrepareFromMediaId = i8;
                while (true) {
                    if (this.onMediaButtonEvent.size() < this.onPrepareFromMediaId && this.onMediaButtonEvent.size() < 15) {
                        break;
                    } else {
                        this.onMediaButtonEvent.remove(0);
                    }
                }
            }
            if (i6 != 0 && this.onRemoveQueueItem != i6) {
                this.onRemoveQueueItem = i6;
                int i9 = i6 - 1;
                int i10 = AudioAttributesImplBaseParcelizer[i9];
                boolean z3 = AudioAttributesImplApi21Parcelizer[i9];
                int i11 = MediaBrowserCompatItemReceiver[i9];
                int i12 = AudioAttributesImplApi26Parcelizer[i9];
                write(i10, MediaBrowserCompatCustomActionResultReceiver[i9]);
            }
            if (i7 == 0 || this.onPause == i7) {
                return;
            }
            this.onPause = i7;
            int i13 = i7 - 1;
            int i14 = write[i13];
            int i15 = AudioAttributesCompatParcelizer[i13];
            AudioAttributesCompatParcelizer(false, false);
            AudioAttributesCompatParcelizer(read, RemoteActionCompatParcelizer[i13]);
        }

        public final void write(int i, int i2) {
            this.onPrepareFromSearch = i;
            this.handleMediaPlayPauseIfPendingOnHandler = i2;
        }

        public final void AudioAttributesCompatParcelizer(boolean z, boolean z2) {
            if (this.onCustomAction != -1) {
                if (!z) {
                    this.RatingCompat.setSpan(new StyleSpan(2), this.onCustomAction, this.RatingCompat.length(), 33);
                    this.onCustomAction = -1;
                }
            } else if (z) {
                this.onCustomAction = this.RatingCompat.length();
            }
            if (this.onPrepare == -1) {
                if (z2) {
                    this.onPrepare = this.RatingCompat.length();
                }
            } else {
                if (z2) {
                    return;
                }
                this.RatingCompat.setSpan(new UnderlineSpan(), this.onPrepare, this.RatingCompat.length(), 33);
                this.onPrepare = -1;
            }
        }

        public final void AudioAttributesCompatParcelizer(int i, int i2) {
            if (this.onCommand != -1 && this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver != i) {
                this.RatingCompat.setSpan(new ForegroundColorSpan(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver), this.onCommand, this.RatingCompat.length(), 33);
            }
            if (i != read) {
                this.onCommand = this.RatingCompat.length();
                this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i;
            }
            if (this.MediaDescriptionCompat != -1 && this.MediaBrowserCompatSearchResultReceiver != i2) {
                this.RatingCompat.setSpan(new BackgroundColorSpan(this.MediaBrowserCompatSearchResultReceiver), this.MediaDescriptionCompat, this.RatingCompat.length(), 33);
            }
            if (i2 != IconCompatParcelizer) {
                this.MediaDescriptionCompat = this.RatingCompat.length();
                this.MediaBrowserCompatSearchResultReceiver = i2;
            }
        }

        public final void AudioAttributesCompatParcelizer(int i) {
            if (this.onPlay != i) {
                IconCompatParcelizer('\n');
            }
            this.onPlay = i;
        }

        public final void AudioAttributesCompatParcelizer() {
            int length = this.RatingCompat.length();
            if (length > 0) {
                this.RatingCompat.delete(length - 1, length);
            }
        }

        public final void IconCompatParcelizer(char c) {
            if (c == '\n') {
                this.onMediaButtonEvent.add(AudioAttributesImplBaseParcelizer());
                this.RatingCompat.clear();
                if (this.onCustomAction != -1) {
                    this.onCustomAction = 0;
                }
                if (this.onPrepare != -1) {
                    this.onPrepare = 0;
                }
                if (this.onCommand != -1) {
                    this.onCommand = 0;
                }
                if (this.MediaDescriptionCompat != -1) {
                    this.MediaDescriptionCompat = 0;
                }
                while (true) {
                    if (this.onMediaButtonEvent.size() >= this.onPrepareFromMediaId || this.onMediaButtonEvent.size() >= 15) {
                        this.onMediaButtonEvent.remove(0);
                    } else {
                        this.onPlay = this.onMediaButtonEvent.size();
                        return;
                    }
                }
            } else {
                this.RatingCompat.append(c);
            }
        }

        private SpannableString AudioAttributesImplBaseParcelizer() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.RatingCompat);
            int length = spannableStringBuilder.length();
            if (length > 0) {
                if (this.onCustomAction != -1) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.onCustomAction, length, 33);
                }
                if (this.onPrepare != -1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), this.onPrepare, length, 33);
                }
                if (this.onCommand != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver), this.onCommand, length, 33);
                }
                if (this.MediaDescriptionCompat != -1) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(this.MediaBrowserCompatSearchResultReceiver), this.MediaDescriptionCompat, length, 33);
                }
            }
            return new SpannableString(spannableStringBuilder);
        }

        public final RemoteActionCompatParcelizer write() {
            Layout.Alignment alignment;
            float f;
            float f2;
            if (read()) {
                return null;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i = 0; i < this.onMediaButtonEvent.size(); i++) {
                spannableStringBuilder.append((CharSequence) this.onMediaButtonEvent.get(i));
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append((CharSequence) AudioAttributesImplBaseParcelizer());
            int i2 = this.handleMediaPlayPauseIfPendingOnHandler;
            if (i2 == 0) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else if (i2 == 1) {
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            } else if (i2 != 2) {
                if (i2 != 3) {
                    StringBuilder sb = new StringBuilder("Unexpected justification value: ");
                    sb.append(this.handleMediaPlayPauseIfPendingOnHandler);
                    throw new IllegalArgumentException(sb.toString());
                }
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else {
                alignment = Layout.Alignment.ALIGN_CENTER;
            }
            if (this.onFastForward) {
                f = this.onAddQueueItem / 99.0f;
                f2 = this.onPlayFromSearch / 99.0f;
            } else {
                f = this.onAddQueueItem / 209.0f;
                f2 = this.onPlayFromSearch / 74.0f;
            }
            int i3 = this.MediaBrowserCompatMediaItem;
            int i4 = i3 / 3;
            int i5 = i3 % 3;
            return new RemoteActionCompatParcelizer(spannableStringBuilder, alignment, (f2 * 0.9f) + 0.05f, i4 == 0 ? 0 : i4 != 1 ? 2 : 1, (f * 0.9f) + 0.05f, i5 == 0 ? 0 : i5 == 1 ? 1 : 2, this.onPrepareFromSearch != IconCompatParcelizer, this.onPrepareFromSearch, this.onPlayFromMediaId);
        }

        public static int write(int i, int i2, int i3) {
            return AudioAttributesCompatParcelizer(i, i2, i3, 0);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static int AudioAttributesCompatParcelizer(int r4, int r5, int r6, int r7) {
            /*
                r0 = 4
                kotlin.buildTypeSerializer.RemoteActionCompatParcelizer(r4, r0)
                kotlin.buildTypeSerializer.RemoteActionCompatParcelizer(r5, r0)
                kotlin.buildTypeSerializer.RemoteActionCompatParcelizer(r6, r0)
                kotlin.buildTypeSerializer.RemoteActionCompatParcelizer(r7, r0)
                r0 = 1
                r1 = 255(0xff, float:3.57E-43)
                r2 = 0
                if (r7 == 0) goto L20
                if (r7 == r0) goto L20
                r3 = 2
                if (r7 == r3) goto L1d
                r3 = 3
                if (r7 != r3) goto L20
                r7 = r2
                goto L21
            L1d:
                r7 = 127(0x7f, float:1.78E-43)
                goto L21
            L20:
                r7 = r1
            L21:
                if (r4 <= r0) goto L25
                r4 = r1
                goto L26
            L25:
                r4 = r2
            L26:
                if (r5 <= r0) goto L2a
                r5 = r1
                goto L2b
            L2a:
                r5 = r2
            L2b:
                if (r6 <= r0) goto L2e
                goto L2f
            L2e:
                r1 = r2
            L2f:
                int r4 = android.graphics.Color.argb(r7, r4, r5, r1)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: o.writeLazyDecimal.write.AudioAttributesCompatParcelizer(int, int, int, int):int");
        }
    }

    static final class RemoteActionCompatParcelizer {
        private static final Comparator<RemoteActionCompatParcelizer> read = new Comparator() { // from class: o._appendEndMarker
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Integer.compare(((writeLazyDecimal.RemoteActionCompatParcelizer) obj2).IconCompatParcelizer, ((writeLazyDecimal.RemoteActionCompatParcelizer) obj).IconCompatParcelizer);
            }
        };
        public final int IconCompatParcelizer;
        public final getDefaultImpl write;

        public RemoteActionCompatParcelizer(CharSequence charSequence, Layout.Alignment alignment, float f, int i, float f2, int i2, boolean z, int i3, int i4) {
            getDefaultImpl.write writeVar = new getDefaultImpl.write().RemoteActionCompatParcelizer(charSequence).AudioAttributesCompatParcelizer(alignment).write(f, 0).read(i).RemoteActionCompatParcelizer(f2).IconCompatParcelizer(i2).read(-3.4028235E38f);
            if (z) {
                writeVar.AudioAttributesCompatParcelizer(i3);
            }
            this.write = writeVar.write();
            this.IconCompatParcelizer = i4;
        }
    }
}
