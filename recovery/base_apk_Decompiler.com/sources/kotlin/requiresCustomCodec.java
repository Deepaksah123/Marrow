package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001d\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001d\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0004\u001a\u001d\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0006\u0010\u0004\u001a\u001b\u0010\n\u001a\u00020\t*\u00020\u00072\u0006\u0010\u0002\u001a\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u000b\"\u0018\u0010\u0005\u001a\u00020\t*\u00020\b8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\f\" \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\r8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u0005\u0010\u000f"}, d2 = {"Lo/setPlayedColor;", "Lo/setUnplayedColor;", "p0", "write", "(Lo/setPlayedColor;Lo/setUnplayedColor;)Lo/setPlayedColor;", "IconCompatParcelizer", "read", "Lo/nextToken;", "Lo/TreeCodec;", "Lo/findAndAddVirtualProperties;", "RemoteActionCompatParcelizer", "(Lo/nextToken;Lo/TreeCodec;)Lo/findAndAddVirtualProperties;", "(Lo/TreeCodec;Lo/_handleUnrecognizedCharacterEscape;I)Lo/findAndAddVirtualProperties;", "Lo/CharacterEscapes;", "Lo/CharacterEscapes;", "()Lo/CharacterEscapes;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class requiresCustomCodec {
    private static final CharacterEscapes<nextToken> IconCompatParcelizer = resetAsNaN.read(new getCreatedOnDateMs() { // from class: o.readValueAsTree
        @Override // kotlin.getCreatedOnDateMs
        public final Object invoke() {
            return requiresCustomCodec.AudioAttributesCompatParcelizer();
        }
    });

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] read;

        static {
            int[] iArr = new int[TreeCodec.values().length];
            try {
                iArr[TreeCodec.write.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TreeCodec.AudioAttributesCompatParcelizer.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TreeCodec.read.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TreeCodec.RemoteActionCompatParcelizer.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TreeCodec.IconCompatParcelizer.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[TreeCodec.AudioAttributesImplApi26Parcelizer.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[TreeCodec.AudioAttributesImplApi21Parcelizer.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[TreeCodec.AudioAttributesImplBaseParcelizer.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[TreeCodec.MediaBrowserCompatItemReceiver.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[TreeCodec.MediaBrowserCompatCustomActionResultReceiver.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[TreeCodec.MediaBrowserCompatSearchResultReceiver.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[TreeCodec.MediaMetadataCompat.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[TreeCodec.RatingCompat.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[TreeCodec.MediaBrowserCompatMediaItem.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[TreeCodec.MediaDescriptionCompat.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            read = iArr;
        }
    }

    public static /* synthetic */ setPlayedColor write$default(setPlayedColor setplayedcolor, setUnplayedColor setunplayedcolor, int i, Object obj) {
        if ((i & 1) != 0) {
            setunplayedcolor = nextTextValue.INSTANCE.IconCompatParcelizer();
        }
        return write(setplayedcolor, setunplayedcolor);
    }

    public static final setPlayedColor write(setPlayedColor setplayedcolor, setUnplayedColor setunplayedcolor) {
        return setPlayedColor.read$default(setplayedcolor, null, null, setunplayedcolor, setunplayedcolor, 3, null);
    }

    public static /* synthetic */ setPlayedColor IconCompatParcelizer$default(setPlayedColor setplayedcolor, setUnplayedColor setunplayedcolor, int i, Object obj) {
        if ((i & 1) != 0) {
            setunplayedcolor = nextTextValue.INSTANCE.IconCompatParcelizer();
        }
        return IconCompatParcelizer(setplayedcolor, setunplayedcolor);
    }

    public static final setPlayedColor IconCompatParcelizer(setPlayedColor setplayedcolor, setUnplayedColor setunplayedcolor) {
        return setPlayedColor.read$default(setplayedcolor, null, setunplayedcolor, setunplayedcolor, null, 9, null);
    }

    public static /* synthetic */ setPlayedColor read$default(setPlayedColor setplayedcolor, setUnplayedColor setunplayedcolor, int i, Object obj) {
        if ((i & 1) != 0) {
            setunplayedcolor = nextTextValue.INSTANCE.IconCompatParcelizer();
        }
        return read(setplayedcolor, setunplayedcolor);
    }

    public static final setPlayedColor read(setPlayedColor setplayedcolor, setUnplayedColor setunplayedcolor) {
        return setPlayedColor.read$default(setplayedcolor, setunplayedcolor, null, null, setunplayedcolor, 6, null);
    }

    public static final findAndAddVirtualProperties RemoteActionCompatParcelizer(nextToken nexttoken, TreeCodec treeCodec) {
        switch (WhenMappings.read[treeCodec.ordinal()]) {
            case 1:
                return nexttoken.getWrite();
            case 2:
                return nexttoken.getMediaBrowserCompatItemReceiver();
            case 3:
                return nexttoken.getAudioAttributesImplApi26Parcelizer();
            case 4:
                return write$default(nexttoken.getWrite(), null, 1, null);
            case 5:
                return nexttoken.getRead();
            case 6:
                return write$default(nexttoken.getRead(), null, 1, null);
            case 7:
                return setPlayer.IconCompatParcelizer();
            case 8:
                return nexttoken.getAudioAttributesCompatParcelizer();
            case 9:
                return nexttoken.getMediaBrowserCompatCustomActionResultReceiver();
            case 10:
                return read$default(nexttoken.getAudioAttributesCompatParcelizer(), null, 1, null);
            case 11:
                return write$default(nexttoken.getAudioAttributesCompatParcelizer(), null, 1, null);
            case 12:
                return nexttoken.getRemoteActionCompatParcelizer();
            case 13:
                return parseVersion.read();
            case 14:
                return nexttoken.getIconCompatParcelizer();
            case 15:
                return IconCompatParcelizer$default(nexttoken.getAudioAttributesCompatParcelizer(), null, 1, null);
            default:
                throw new RenewEligibleCreator();
        }
    }

    public static final findAndAddVirtualProperties IconCompatParcelizer(TreeCodec treeCodec, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(1629172543, i, -1, "androidx.compose.material3.<get-value> (Shapes.kt:358)");
        }
        findAndAddVirtualProperties findandaddvirtualpropertiesRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(getCurrentName.INSTANCE.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, 6), treeCodec);
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        return findandaddvirtualpropertiesRemoteActionCompatParcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final nextToken AudioAttributesCompatParcelizer() {
        return new nextToken(null, null, null, null, null, 31, null);
    }

    public static final CharacterEscapes<nextToken> IconCompatParcelizer() {
        return IconCompatParcelizer;
    }
}
