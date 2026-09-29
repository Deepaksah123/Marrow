package kotlin;

import androidx.media3.common.Metadata;
import androidx.media3.container.MdtaMetadataEntry;
import androidx.media3.extractor.metadata.id3.ApicFrame;
import androidx.media3.extractor.metadata.id3.CommentFrame;
import androidx.media3.extractor.metadata.id3.Id3Frame;
import androidx.media3.extractor.metadata.id3.InternalFrame;
import androidx.media3.extractor.metadata.id3.TextInformationFrame;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.util.MimeTypes;
import kotlin.C0170format;

/* JADX INFO: loaded from: classes2.dex */
final class isRunningInNativeImage {
    public static void read(int i, androidx.media3.common.Metadata metadata, C0170format.RemoteActionCompatParcelizer remoteActionCompatParcelizer, androidx.media3.common.Metadata... metadataArr) {
        androidx.media3.common.Metadata metadata2 = new androidx.media3.common.Metadata(new Metadata.Entry[0]);
        if (metadata != null) {
            for (int i2 = 0; i2 < metadata.write(); i2++) {
                Metadata.Entry entryIconCompatParcelizer = metadata.IconCompatParcelizer(i2);
                if (entryIconCompatParcelizer instanceof MdtaMetadataEntry) {
                    MdtaMetadataEntry mdtaMetadataEntry = (MdtaMetadataEntry) entryIconCompatParcelizer;
                    if (!mdtaMetadataEntry.read.equals(com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry.KEY_ANDROID_CAPTURE_FPS) || i == 2) {
                        metadata2 = metadata2.read(mdtaMetadataEntry);
                    }
                }
            }
        }
        int length = metadataArr.length;
        for (int i3 = 0; i3 < 3; i3++) {
            metadata2 = metadata2.RemoteActionCompatParcelizer(metadataArr[i3]);
        }
        if (metadata2.write() > 0) {
            remoteActionCompatParcelizer.read(metadata2);
        }
    }

    public static void read(int i, hasClass hasclass, C0170format.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        if (i == 1 && hasclass.read()) {
            remoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver(hasclass.read).AudioAttributesImplApi21Parcelizer(hasclass.IconCompatParcelizer);
        }
    }

    public static Metadata.Entry IconCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer) {
        int iWrite = asPropertyTypeDeserializer.write() + asPropertyTypeDeserializer.MediaBrowserCompatItemReceiver();
        int iMediaBrowserCompatItemReceiver = asPropertyTypeDeserializer.MediaBrowserCompatItemReceiver();
        int i = iMediaBrowserCompatItemReceiver >>> 24;
        try {
            if (i == 169 || i == 253) {
                int i2 = 16777215 & iMediaBrowserCompatItemReceiver;
                if (i2 == 6516084) {
                    return RemoteActionCompatParcelizer(iMediaBrowserCompatItemReceiver, asPropertyTypeDeserializer);
                }
                if (i2 == 7233901 || i2 == 7631467) {
                    return read(iMediaBrowserCompatItemReceiver, "TIT2", asPropertyTypeDeserializer);
                }
                if (i2 == 6516589 || i2 == 7828084) {
                    return read(iMediaBrowserCompatItemReceiver, "TCOM", asPropertyTypeDeserializer);
                }
                if (i2 == 6578553) {
                    return read(iMediaBrowserCompatItemReceiver, "TDRC", asPropertyTypeDeserializer);
                }
                if (i2 == 4280916) {
                    return read(iMediaBrowserCompatItemReceiver, "TPE1", asPropertyTypeDeserializer);
                }
                if (i2 == 7630703) {
                    return read(iMediaBrowserCompatItemReceiver, "TSSE", asPropertyTypeDeserializer);
                }
                if (i2 == 6384738) {
                    return read(iMediaBrowserCompatItemReceiver, "TALB", asPropertyTypeDeserializer);
                }
                if (i2 == 7108978) {
                    return read(iMediaBrowserCompatItemReceiver, "USLT", asPropertyTypeDeserializer);
                }
                if (i2 == 6776174) {
                    return read(iMediaBrowserCompatItemReceiver, "TCON", asPropertyTypeDeserializer);
                }
                if (i2 == 6779504) {
                    return read(iMediaBrowserCompatItemReceiver, "TIT1", asPropertyTypeDeserializer);
                }
            } else {
                if (iMediaBrowserCompatItemReceiver == 1735291493) {
                    return AudioAttributesCompatParcelizer(asPropertyTypeDeserializer);
                }
                if (iMediaBrowserCompatItemReceiver == 1684632427) {
                    return IconCompatParcelizer(iMediaBrowserCompatItemReceiver, "TPOS", asPropertyTypeDeserializer);
                }
                if (iMediaBrowserCompatItemReceiver == 1953655662) {
                    return IconCompatParcelizer(iMediaBrowserCompatItemReceiver, "TRCK", asPropertyTypeDeserializer);
                }
                if (iMediaBrowserCompatItemReceiver == 1953329263) {
                    return write(iMediaBrowserCompatItemReceiver, "TBPM", asPropertyTypeDeserializer, true, false);
                }
                if (iMediaBrowserCompatItemReceiver == 1668311404) {
                    return write(iMediaBrowserCompatItemReceiver, "TCMP", asPropertyTypeDeserializer, true, true);
                }
                if (iMediaBrowserCompatItemReceiver == 1668249202) {
                    return read(asPropertyTypeDeserializer);
                }
                if (iMediaBrowserCompatItemReceiver == 1631670868) {
                    return read(iMediaBrowserCompatItemReceiver, "TPE2", asPropertyTypeDeserializer);
                }
                if (iMediaBrowserCompatItemReceiver == 1936682605) {
                    return read(iMediaBrowserCompatItemReceiver, "TSOT", asPropertyTypeDeserializer);
                }
                if (iMediaBrowserCompatItemReceiver == 1936679276) {
                    return read(iMediaBrowserCompatItemReceiver, "TSOA", asPropertyTypeDeserializer);
                }
                if (iMediaBrowserCompatItemReceiver == 1936679282) {
                    return read(iMediaBrowserCompatItemReceiver, "TSOP", asPropertyTypeDeserializer);
                }
                if (iMediaBrowserCompatItemReceiver == 1936679265) {
                    return read(iMediaBrowserCompatItemReceiver, "TSO2", asPropertyTypeDeserializer);
                }
                if (iMediaBrowserCompatItemReceiver == 1936679791) {
                    return read(iMediaBrowserCompatItemReceiver, "TSOC", asPropertyTypeDeserializer);
                }
                if (iMediaBrowserCompatItemReceiver == 1920233063) {
                    return write(iMediaBrowserCompatItemReceiver, "ITUNESADVISORY", asPropertyTypeDeserializer, false, false);
                }
                if (iMediaBrowserCompatItemReceiver == 1885823344) {
                    return write(iMediaBrowserCompatItemReceiver, "ITUNESGAPLESS", asPropertyTypeDeserializer, false, true);
                }
                if (iMediaBrowserCompatItemReceiver == 1936683886) {
                    return read(iMediaBrowserCompatItemReceiver, "TVSHOWSORT", asPropertyTypeDeserializer);
                }
                if (iMediaBrowserCompatItemReceiver == 1953919848) {
                    return read(iMediaBrowserCompatItemReceiver, "TVSHOW", asPropertyTypeDeserializer);
                }
                if (iMediaBrowserCompatItemReceiver == 757935405) {
                    return read(asPropertyTypeDeserializer, iWrite);
                }
            }
            StringBuilder sb = new StringBuilder("Skipped unknown metadata entry: ");
            sb.append(chainedTransformer.RemoteActionCompatParcelizer(iMediaBrowserCompatItemReceiver));
            prune.IconCompatParcelizer("MetadataUtil", sb.toString());
            asPropertyTypeDeserializer.MediaBrowserCompatCustomActionResultReceiver(iWrite);
            return null;
        } finally {
            asPropertyTypeDeserializer.MediaBrowserCompatCustomActionResultReceiver(iWrite);
        }
    }

    public static MdtaMetadataEntry AudioAttributesCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer, int i, String str) {
        while (true) {
            int iWrite = asPropertyTypeDeserializer.write();
            if (iWrite >= i) {
                return null;
            }
            int iMediaBrowserCompatItemReceiver = asPropertyTypeDeserializer.MediaBrowserCompatItemReceiver();
            if (asPropertyTypeDeserializer.MediaBrowserCompatItemReceiver() == 1684108385) {
                int iMediaBrowserCompatItemReceiver2 = asPropertyTypeDeserializer.MediaBrowserCompatItemReceiver();
                int iMediaBrowserCompatItemReceiver3 = asPropertyTypeDeserializer.MediaBrowserCompatItemReceiver();
                int i2 = iMediaBrowserCompatItemReceiver - 16;
                byte[] bArr = new byte[i2];
                asPropertyTypeDeserializer.write(bArr, 0, i2);
                return new MdtaMetadataEntry(str, bArr, iMediaBrowserCompatItemReceiver3, iMediaBrowserCompatItemReceiver2);
            }
            asPropertyTypeDeserializer.MediaBrowserCompatCustomActionResultReceiver(iWrite + iMediaBrowserCompatItemReceiver);
        }
    }

    private static TextInformationFrame read(int i, String str, AsPropertyTypeDeserializer asPropertyTypeDeserializer) {
        int iMediaBrowserCompatItemReceiver = asPropertyTypeDeserializer.MediaBrowserCompatItemReceiver();
        if (asPropertyTypeDeserializer.MediaBrowserCompatItemReceiver() == 1684108385) {
            asPropertyTypeDeserializer.AudioAttributesImplBaseParcelizer(8);
            return new TextInformationFrame(str, null, initExtraTracks.read(asPropertyTypeDeserializer.RemoteActionCompatParcelizer(iMediaBrowserCompatItemReceiver - 16)));
        }
        StringBuilder sb = new StringBuilder("Failed to parse text attribute: ");
        sb.append(chainedTransformer.RemoteActionCompatParcelizer(i));
        prune.RemoteActionCompatParcelizer("MetadataUtil", sb.toString());
        return null;
    }

    private static CommentFrame RemoteActionCompatParcelizer(int i, AsPropertyTypeDeserializer asPropertyTypeDeserializer) {
        int iMediaBrowserCompatItemReceiver = asPropertyTypeDeserializer.MediaBrowserCompatItemReceiver();
        if (asPropertyTypeDeserializer.MediaBrowserCompatItemReceiver() == 1684108385) {
            asPropertyTypeDeserializer.AudioAttributesImplBaseParcelizer(8);
            String strRemoteActionCompatParcelizer = asPropertyTypeDeserializer.RemoteActionCompatParcelizer(iMediaBrowserCompatItemReceiver - 16);
            return new CommentFrame(C.LANGUAGE_UNDETERMINED, strRemoteActionCompatParcelizer, strRemoteActionCompatParcelizer);
        }
        StringBuilder sb = new StringBuilder("Failed to parse comment attribute: ");
        sb.append(chainedTransformer.RemoteActionCompatParcelizer(i));
        prune.RemoteActionCompatParcelizer("MetadataUtil", sb.toString());
        return null;
    }

    private static Id3Frame write(int i, String str, AsPropertyTypeDeserializer asPropertyTypeDeserializer, boolean z, boolean z2) {
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(asPropertyTypeDeserializer);
        if (z2) {
            iRemoteActionCompatParcelizer = Math.min(1, iRemoteActionCompatParcelizer);
        }
        if (iRemoteActionCompatParcelizer >= 0) {
            if (z) {
                return new TextInformationFrame(str, null, initExtraTracks.read(Integer.toString(iRemoteActionCompatParcelizer)));
            }
            return new CommentFrame(C.LANGUAGE_UNDETERMINED, str, Integer.toString(iRemoteActionCompatParcelizer));
        }
        StringBuilder sb = new StringBuilder("Failed to parse uint8 attribute: ");
        sb.append(chainedTransformer.RemoteActionCompatParcelizer(i));
        prune.RemoteActionCompatParcelizer("MetadataUtil", sb.toString());
        return null;
    }

    private static int RemoteActionCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer) {
        int iMediaBrowserCompatItemReceiver = asPropertyTypeDeserializer.MediaBrowserCompatItemReceiver();
        if (asPropertyTypeDeserializer.MediaBrowserCompatItemReceiver() == 1684108385) {
            asPropertyTypeDeserializer.AudioAttributesImplBaseParcelizer(8);
            int i = iMediaBrowserCompatItemReceiver - 16;
            if (i == 1) {
                return asPropertyTypeDeserializer.onPlayFromMediaId();
            }
            if (i == 2) {
                return asPropertyTypeDeserializer.onPrepare();
            }
            if (i == 3) {
                return asPropertyTypeDeserializer.onPause();
            }
            if (i == 4 && (asPropertyTypeDeserializer.AudioAttributesImplBaseParcelizer() & 128) == 0) {
                return asPropertyTypeDeserializer.onPrepareFromSearch();
            }
        }
        prune.RemoteActionCompatParcelizer("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    private static TextInformationFrame IconCompatParcelizer(int i, String str, AsPropertyTypeDeserializer asPropertyTypeDeserializer) {
        int iMediaBrowserCompatItemReceiver = asPropertyTypeDeserializer.MediaBrowserCompatItemReceiver();
        if (asPropertyTypeDeserializer.MediaBrowserCompatItemReceiver() == 1684108385 && iMediaBrowserCompatItemReceiver >= 22) {
            asPropertyTypeDeserializer.AudioAttributesImplBaseParcelizer(10);
            int iOnPrepare = asPropertyTypeDeserializer.onPrepare();
            if (iOnPrepare > 0) {
                String strConcat = "".concat(String.valueOf(iOnPrepare));
                int iOnPrepare2 = asPropertyTypeDeserializer.onPrepare();
                if (iOnPrepare2 > 0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(strConcat);
                    sb.append("/");
                    sb.append(iOnPrepare2);
                    strConcat = sb.toString();
                }
                return new TextInformationFrame(str, null, initExtraTracks.read(strConcat));
            }
        }
        StringBuilder sb2 = new StringBuilder("Failed to parse index/count attribute: ");
        sb2.append(chainedTransformer.RemoteActionCompatParcelizer(i));
        prune.RemoteActionCompatParcelizer("MetadataUtil", sb2.toString());
        return null;
    }

    private static TextInformationFrame AudioAttributesCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer) {
        String strWrite = getEnumIds.write(RemoteActionCompatParcelizer(asPropertyTypeDeserializer) - 1);
        if (strWrite != null) {
            return new TextInformationFrame("TCON", null, initExtraTracks.read(strWrite));
        }
        prune.RemoteActionCompatParcelizer("MetadataUtil", "Failed to parse standard genre code");
        return null;
    }

    private static ApicFrame read(AsPropertyTypeDeserializer asPropertyTypeDeserializer) {
        String str;
        int iMediaBrowserCompatItemReceiver = asPropertyTypeDeserializer.MediaBrowserCompatItemReceiver();
        if (asPropertyTypeDeserializer.MediaBrowserCompatItemReceiver() != 1684108385) {
            prune.RemoteActionCompatParcelizer("MetadataUtil", "Failed to parse cover art attribute");
            return null;
        }
        int iWrite = chainedTransformer.write(asPropertyTypeDeserializer.MediaBrowserCompatItemReceiver());
        if (iWrite == 13) {
            str = MimeTypes.IMAGE_JPEG;
        } else {
            str = iWrite == 14 ? MimeTypes.IMAGE_PNG : null;
        }
        if (str == null) {
            prune.RemoteActionCompatParcelizer("MetadataUtil", "Unrecognized cover art flags: ".concat(String.valueOf(iWrite)));
            return null;
        }
        asPropertyTypeDeserializer.AudioAttributesImplBaseParcelizer(4);
        int i = iMediaBrowserCompatItemReceiver - 16;
        byte[] bArr = new byte[i];
        asPropertyTypeDeserializer.write(bArr, 0, i);
        return new ApicFrame(str, null, 3, bArr);
    }

    private static Id3Frame read(AsPropertyTypeDeserializer asPropertyTypeDeserializer, int i) {
        String strRemoteActionCompatParcelizer = null;
        String strRemoteActionCompatParcelizer2 = null;
        int i2 = -1;
        int i3 = -1;
        while (asPropertyTypeDeserializer.write() < i) {
            int iWrite = asPropertyTypeDeserializer.write();
            int iMediaBrowserCompatItemReceiver = asPropertyTypeDeserializer.MediaBrowserCompatItemReceiver();
            int iMediaBrowserCompatItemReceiver2 = asPropertyTypeDeserializer.MediaBrowserCompatItemReceiver();
            asPropertyTypeDeserializer.AudioAttributesImplBaseParcelizer(4);
            if (iMediaBrowserCompatItemReceiver2 == 1835360622) {
                strRemoteActionCompatParcelizer = asPropertyTypeDeserializer.RemoteActionCompatParcelizer(iMediaBrowserCompatItemReceiver - 12);
            } else if (iMediaBrowserCompatItemReceiver2 == 1851878757) {
                strRemoteActionCompatParcelizer2 = asPropertyTypeDeserializer.RemoteActionCompatParcelizer(iMediaBrowserCompatItemReceiver - 12);
            } else {
                if (iMediaBrowserCompatItemReceiver2 == 1684108385) {
                    i2 = iWrite;
                    i3 = iMediaBrowserCompatItemReceiver;
                }
                asPropertyTypeDeserializer.AudioAttributesImplBaseParcelizer(iMediaBrowserCompatItemReceiver - 12);
            }
        }
        if (strRemoteActionCompatParcelizer == null || strRemoteActionCompatParcelizer2 == null || i2 == -1) {
            return null;
        }
        asPropertyTypeDeserializer.MediaBrowserCompatCustomActionResultReceiver(i2);
        asPropertyTypeDeserializer.AudioAttributesImplBaseParcelizer(16);
        return new InternalFrame(strRemoteActionCompatParcelizer, strRemoteActionCompatParcelizer2, asPropertyTypeDeserializer.RemoteActionCompatParcelizer(i3 - 16));
    }
}
