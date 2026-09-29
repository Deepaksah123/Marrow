package kotlin;

import com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection;
import com.google.android.gms.wallet.WalletConstants;
import com.marrow.data.models.ResponseError;
import in.juspay.hypersdk.core.Constants;
import java.security.cert.CertificateParsingException;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Objects;
import java.util.Set;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes3.dex */
public final class RtspMessageChannelInterleavedBinaryDataListener {
    private String AudioAttributesImplApi21Parcelizer;
    private Boolean AudioAttributesImplApi26Parcelizer;
    private Boolean AudioAttributesImplBaseParcelizer;
    private Integer IconCompatParcelizer;
    private processH265FmtpAttribute MediaBrowserCompatCustomActionResultReceiver;
    private Integer MediaBrowserCompatItemReceiver;
    private String MediaBrowserCompatMediaItem;
    private Integer MediaBrowserCompatSearchResultReceiver;
    private Boolean MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private Boolean MediaDescriptionCompat;
    private String MediaMetadataCompat;
    private Integer MediaSessionCompatQueueItem;
    private Integer PlaybackStateCompat;
    private Date RatingCompat;
    private String handleMediaPlayPauseIfPendingOnHandler;
    private Set<Integer> onAddQueueItem;
    private Integer onCommand;
    private Boolean onCustomAction;
    private Set<Integer> onFastForward;
    private Integer onMediaButtonEvent;
    private String onPause;
    private String onPlay;
    private String onPlayFromMediaId;
    private Boolean onPlayFromSearch;
    private Date onPlayFromUri;
    private Integer onPrepare;
    private Integer onPrepareFromMediaId;
    private Integer onPrepareFromSearch;
    private Boolean onPrepareFromUri;
    private Boolean onRemoveQueueItem;
    private String onRemoveQueueItemAt;
    private Set<Integer> onRewind;
    private Set<Integer> onSeekTo;
    private Long onSetCaptioningEnabled;
    private addMessageLine onSetPlaybackSpeed;
    private Integer onSetRating;
    private String onSetRepeatMode;
    private String onSetShuffleMode;
    private Boolean onSkipToNext;
    private Boolean onSkipToPrevious;
    private Date onSkipToQueueItem;
    private Boolean onStop;
    private Date read;
    private Integer setSessionImpl;
    private static final onMoovContainerAtomRead<Integer, String> write = onMoovContainerAtomRead.read().read(1, "NoPadding").read(2, "OAEPPadding").read(3, "PSS").read(4, "PKCS1Padding").read(5, "PKCS1").read(64, "PKCS7Padding").write();
    private static final onMoovContainerAtomRead<Integer, String> AudioAttributesCompatParcelizer = onMoovContainerAtomRead.read().read(0, "NONE").read(1, "MD5").read(2, "SHA-1").read(3, "SHA-224").read(4, "SHA-256").read(5, "SHA-384").read(6, "SHA-512").write();
    private static final onMoovContainerAtomRead<Integer, String> RemoteActionCompatParcelizer = onMoovContainerAtomRead.read().read(1, "DECRYPT").read(0, "ENCRYPT").read(2, "SIGN").read(3, "VERIFY").read(5, "WRAP").read(6, "AGREE KEY").read(7, "ATTEST KEY").write();

    public RtspMessageChannelInterleavedBinaryDataListener(LottieRatingBar lottieRatingBar) throws CertificateParsingException {
        if (!(lottieRatingBar instanceof setMsFixedDuration)) {
            StringBuilder sb = new StringBuilder("Expected sequence for authorization list, found ");
            sb.append(lottieRatingBar.getClass().getName());
            throw new CertificateParsingException(sb.toString());
        }
        for (LottieRatingBar lottieRatingBar2 : (setMsFixedDuration) lottieRatingBar) {
            if (!(lottieRatingBar2 instanceof ZoomableLinearLayoutManager)) {
                StringBuilder sb2 = new StringBuilder("Expected tagged object, found ");
                sb2.append(lottieRatingBar2.getClass().getName());
                throw new CertificateParsingException(sb2.toString());
            }
            ZoomableLinearLayoutManager zoomableLinearLayoutManager = (ZoomableLinearLayoutManager) lottieRatingBar2;
            int iAudioAttributesImplBaseParcelizer = zoomableLinearLayoutManager.AudioAttributesImplBaseParcelizer();
            setMsDelay setmsdelayAudioAttributesImplApi26Parcelizer = zoomableLinearLayoutManager.read().AudioAttributesImplApi26Parcelizer();
            Objects.toString(setmsdelayAudioAttributesImplApi26Parcelizer);
            if (iAudioAttributesImplBaseParcelizer == 1) {
                this.onRewind = getInitializationDataFromParameterSet.AudioAttributesCompatParcelizer(setmsdelayAudioAttributesImplApi26Parcelizer);
            } else if (iAudioAttributesImplBaseParcelizer == 2) {
                this.IconCompatParcelizer = Integer.valueOf(getInitializationDataFromParameterSet.write(setmsdelayAudioAttributesImplApi26Parcelizer));
            } else if (iAudioAttributesImplBaseParcelizer == 3) {
                this.onMediaButtonEvent = Integer.valueOf(getInitializationDataFromParameterSet.write(setmsdelayAudioAttributesImplApi26Parcelizer));
            } else if (iAudioAttributesImplBaseParcelizer == 5) {
                this.onAddQueueItem = getInitializationDataFromParameterSet.AudioAttributesCompatParcelizer(setmsdelayAudioAttributesImplApi26Parcelizer);
            } else if (iAudioAttributesImplBaseParcelizer == 6) {
                this.onSeekTo = getInitializationDataFromParameterSet.AudioAttributesCompatParcelizer(setmsdelayAudioAttributesImplApi26Parcelizer);
            } else if (iAudioAttributesImplBaseParcelizer == 10) {
                this.onCommand = Integer.valueOf(getInitializationDataFromParameterSet.write(setmsdelayAudioAttributesImplApi26Parcelizer));
            } else if (iAudioAttributesImplBaseParcelizer == 200) {
                this.onSetCaptioningEnabled = getInitializationDataFromParameterSet.read((LottieRatingBar) setmsdelayAudioAttributesImplApi26Parcelizer);
            } else if (iAudioAttributesImplBaseParcelizer == 203) {
                this.onFastForward = getInitializationDataFromParameterSet.AudioAttributesCompatParcelizer(setmsdelayAudioAttributesImplApi26Parcelizer);
            } else if (iAudioAttributesImplBaseParcelizer == 303) {
                this.onPrepareFromUri = Boolean.TRUE;
            } else if (iAudioAttributesImplBaseParcelizer == 305) {
                this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = Boolean.TRUE;
            } else if (iAudioAttributesImplBaseParcelizer == 405) {
                this.setSessionImpl = Integer.valueOf(getInitializationDataFromParameterSet.write(setmsdelayAudioAttributesImplApi26Parcelizer));
            } else if (iAudioAttributesImplBaseParcelizer == 723) {
                this.onSetShuffleMode = getInitializationDataFromParameterSet.AudioAttributesImplApi26Parcelizer(setmsdelayAudioAttributesImplApi26Parcelizer);
            } else if (iAudioAttributesImplBaseParcelizer == 600) {
                this.AudioAttributesImplBaseParcelizer = Boolean.TRUE;
            } else if (iAudioAttributesImplBaseParcelizer != 601) {
                switch (iAudioAttributesImplBaseParcelizer) {
                    case ResponseError.NO_INTERNET_ERROR /* 400 */:
                        this.read = getInitializationDataFromParameterSet.read(setmsdelayAudioAttributesImplApi26Parcelizer);
                        break;
                    case 401:
                        this.onPlayFromUri = getInitializationDataFromParameterSet.read(setmsdelayAudioAttributesImplApi26Parcelizer);
                        break;
                    case WalletConstants.ERROR_CODE_SERVICE_UNAVAILABLE /* 402 */:
                        this.onSkipToQueueItem = getInitializationDataFromParameterSet.read(setmsdelayAudioAttributesImplApi26Parcelizer);
                        break;
                    default:
                        switch (iAudioAttributesImplBaseParcelizer) {
                            case 503:
                                this.onPlayFromSearch = Boolean.TRUE;
                                break;
                            case TarConstants.SPARSELEN_GNU_SPARSE /* 504 */:
                                this.MediaSessionCompatQueueItem = Integer.valueOf(getInitializationDataFromParameterSet.write(setmsdelayAudioAttributesImplApi26Parcelizer));
                                break;
                            case 505:
                                this.MediaBrowserCompatItemReceiver = Integer.valueOf(getInitializationDataFromParameterSet.write(setmsdelayAudioAttributesImplApi26Parcelizer));
                                break;
                            case 506:
                                this.AudioAttributesImplApi26Parcelizer = Boolean.TRUE;
                                break;
                            case 507:
                                this.onSkipToPrevious = Boolean.TRUE;
                                break;
                            case TarConstants.XSTAR_MAGIC_OFFSET /* 508 */:
                                this.onStop = Boolean.TRUE;
                                break;
                            case 509:
                                this.onSkipToNext = Boolean.TRUE;
                                break;
                            default:
                                switch (iAudioAttributesImplBaseParcelizer) {
                                    case 701:
                                        this.RatingCompat = getInitializationDataFromParameterSet.read(setmsdelayAudioAttributesImplApi26Parcelizer);
                                        break;
                                    case 702:
                                        this.onPrepareFromSearch = Integer.valueOf(getInitializationDataFromParameterSet.write(setmsdelayAudioAttributesImplApi26Parcelizer));
                                        break;
                                    case 703:
                                        this.onRemoveQueueItem = Boolean.TRUE;
                                        break;
                                    case 704:
                                        this.onSetPlaybackSpeed = new addMessageLine(setmsdelayAudioAttributesImplApi26Parcelizer);
                                        break;
                                    case 705:
                                        this.onPrepareFromMediaId = Integer.valueOf(getInitializationDataFromParameterSet.write(setmsdelayAudioAttributesImplApi26Parcelizer));
                                        break;
                                    case 706:
                                        this.onPrepare = Integer.valueOf(getInitializationDataFromParameterSet.write(setmsdelayAudioAttributesImplApi26Parcelizer));
                                        break;
                                    default:
                                        switch (iAudioAttributesImplBaseParcelizer) {
                                            case 709:
                                                this.MediaBrowserCompatCustomActionResultReceiver = new processH265FmtpAttribute(getInitializationDataFromParameterSet.IconCompatParcelizer(getInitializationDataFromParameterSet.IconCompatParcelizer(setmsdelayAudioAttributesImplApi26Parcelizer)));
                                                break;
                                            case 710:
                                                this.MediaBrowserCompatMediaItem = getInitializationDataFromParameterSet.AudioAttributesImplApi26Parcelizer(setmsdelayAudioAttributesImplApi26Parcelizer);
                                                break;
                                            case 711:
                                                this.MediaMetadataCompat = getInitializationDataFromParameterSet.AudioAttributesImplApi26Parcelizer(setmsdelayAudioAttributesImplApi26Parcelizer);
                                                break;
                                            case 712:
                                                this.onRemoveQueueItemAt = getInitializationDataFromParameterSet.AudioAttributesImplApi26Parcelizer(setmsdelayAudioAttributesImplApi26Parcelizer);
                                                break;
                                            case 713:
                                                this.onSetRepeatMode = getInitializationDataFromParameterSet.AudioAttributesImplApi26Parcelizer(setmsdelayAudioAttributesImplApi26Parcelizer);
                                                break;
                                            case 714:
                                                this.handleMediaPlayPauseIfPendingOnHandler = getInitializationDataFromParameterSet.AudioAttributesImplApi26Parcelizer(setmsdelayAudioAttributesImplApi26Parcelizer);
                                                break;
                                            case 715:
                                                this.onPause = getInitializationDataFromParameterSet.AudioAttributesImplApi26Parcelizer(setmsdelayAudioAttributesImplApi26Parcelizer);
                                                break;
                                            case 716:
                                                this.onPlay = getInitializationDataFromParameterSet.AudioAttributesImplApi26Parcelizer(setmsdelayAudioAttributesImplApi26Parcelizer);
                                                break;
                                            case 717:
                                                this.onPlayFromMediaId = getInitializationDataFromParameterSet.AudioAttributesImplApi26Parcelizer(setmsdelayAudioAttributesImplApi26Parcelizer);
                                                break;
                                            case 718:
                                                this.PlaybackStateCompat = Integer.valueOf(getInitializationDataFromParameterSet.write(setmsdelayAudioAttributesImplApi26Parcelizer));
                                                break;
                                            case AdaptiveTrackSelection.DEFAULT_MAX_HEIGHT_TO_DISCARD /* 719 */:
                                                this.MediaBrowserCompatSearchResultReceiver = Integer.valueOf(getInitializationDataFromParameterSet.write(setmsdelayAudioAttributesImplApi26Parcelizer));
                                                break;
                                            case 720:
                                                this.MediaDescriptionCompat = Boolean.TRUE;
                                                break;
                                            case 721:
                                                this.onCustomAction = Boolean.TRUE;
                                                break;
                                            default:
                                                StringBuilder sb3 = new StringBuilder("Unknown tag ");
                                                sb3.append(iAudioAttributesImplBaseParcelizer);
                                                sb3.append(" found");
                                                throw new CertificateParsingException(sb3.toString());
                                        }
                                        break;
                                }
                                break;
                        }
                        break;
                }
            } else {
                this.AudioAttributesImplApi21Parcelizer = getInitializationDataFromParameterSet.AudioAttributesImplApi26Parcelizer(setmsdelayAudioAttributesImplApi26Parcelizer);
            }
        }
    }

    public RtspMessageChannelInterleavedBinaryDataListener(lambdanew5 lambdanew5Var) throws CertificateParsingException {
        for (lambdanew10 lambdanew10Var : lambdanew5Var.write()) {
            int iIntValue = ((lambdanew6) lambdanew10Var).RemoteActionCompatParcelizer().intValue();
            switch (iIntValue) {
                case -80720:
                    this.MediaDescriptionCompat = Boolean.TRUE;
                    break;
                case -80719:
                    this.MediaBrowserCompatSearchResultReceiver = Integer.valueOf(RtspMessageChannelLoaderCallbackImpl.read(lambdanew5Var, lambdanew10Var));
                    break;
                case -80718:
                    this.PlaybackStateCompat = Integer.valueOf(RtspMessageChannelLoaderCallbackImpl.read(lambdanew5Var, lambdanew10Var));
                    break;
                case -80717:
                    this.onPlayFromMediaId = RtspMessageChannelLoaderCallbackImpl.AudioAttributesImplApi21Parcelizer(lambdanew5Var, lambdanew10Var);
                    break;
                case -80716:
                    this.onPlay = RtspMessageChannelLoaderCallbackImpl.AudioAttributesImplApi21Parcelizer(lambdanew5Var, lambdanew10Var);
                    break;
                case -80715:
                    this.onPause = RtspMessageChannelLoaderCallbackImpl.AudioAttributesImplApi21Parcelizer(lambdanew5Var, lambdanew10Var);
                    break;
                default:
                    switch (iIntValue) {
                        case -80713:
                            this.onSetRepeatMode = RtspMessageChannelLoaderCallbackImpl.AudioAttributesImplApi21Parcelizer(lambdanew5Var, lambdanew10Var);
                            break;
                        case -80712:
                            this.onRemoveQueueItemAt = RtspMessageChannelLoaderCallbackImpl.AudioAttributesImplApi21Parcelizer(lambdanew5Var, lambdanew10Var);
                            break;
                        case -80711:
                            this.MediaMetadataCompat = RtspMessageChannelLoaderCallbackImpl.AudioAttributesImplApi21Parcelizer(lambdanew5Var, lambdanew10Var);
                            break;
                        case -80710:
                            this.MediaBrowserCompatMediaItem = RtspMessageChannelLoaderCallbackImpl.AudioAttributesImplApi21Parcelizer(lambdanew5Var, lambdanew10Var);
                            break;
                        case -80709:
                            this.MediaBrowserCompatCustomActionResultReceiver = new processH265FmtpAttribute(getInitializationDataFromParameterSet.IconCompatParcelizer(RtspMessageChannelLoaderCallbackImpl.AudioAttributesCompatParcelizer(lambdanew5Var, lambdanew10Var)));
                            break;
                        default:
                            switch (iIntValue) {
                                case -80706:
                                    this.onPrepare = Integer.valueOf(RtspMessageChannelLoaderCallbackImpl.read(lambdanew5Var, lambdanew10Var));
                                    break;
                                case -80705:
                                    this.onPrepareFromMediaId = Integer.valueOf(RtspMessageChannelLoaderCallbackImpl.read(lambdanew5Var, lambdanew10Var));
                                    break;
                                default:
                                    switch (iIntValue) {
                                        case -80703:
                                            this.onRemoveQueueItem = Boolean.TRUE;
                                            break;
                                        case -80702:
                                            this.onPrepareFromSearch = Integer.valueOf(RtspMessageChannelLoaderCallbackImpl.read(lambdanew5Var, lambdanew10Var));
                                            break;
                                        default:
                                            switch (iIntValue) {
                                                case -80601:
                                                    this.AudioAttributesImplApi21Parcelizer = RtspMessageChannelLoaderCallbackImpl.AudioAttributesImplApi21Parcelizer(lambdanew5Var, lambdanew10Var);
                                                    break;
                                                case -80305:
                                                    break;
                                                case -80303:
                                                    this.onPrepareFromUri = Boolean.TRUE;
                                                    continue;
                                                case -80203:
                                                    this.onFastForward = RtspMessageChannelLoaderCallbackImpl.AudioAttributesImplBaseParcelizer(lambdanew5Var, lambdanew10Var);
                                                    continue;
                                                case -80200:
                                                    this.onSetCaptioningEnabled = Long.valueOf(RtspMessageChannelLoaderCallbackImpl.AudioAttributesImplApi26Parcelizer(lambdanew5Var, lambdanew10Var));
                                                    continue;
                                                case -80010:
                                                    this.onCommand = Integer.valueOf(RtspMessageChannelLoaderCallbackImpl.read(lambdanew5Var, lambdanew10Var));
                                                    continue;
                                                case -76002:
                                                    this.onSetRating = Integer.valueOf(RtspMessageChannelMessageParser.write(RtspMessageChannelLoaderCallbackImpl.read(lambdanew5Var, lambdanew10Var)));
                                                    continue;
                                                case -75009:
                                                    this.handleMediaPlayPauseIfPendingOnHandler = RtspMessageChannelLoaderCallbackImpl.AudioAttributesImplApi21Parcelizer(lambdanew5Var, lambdanew10Var);
                                                    continue;
                                                case 6:
                                                    this.RatingCompat = RtspMessageChannelLoaderCallbackImpl.RemoteActionCompatParcelizer(lambdanew5Var, lambdanew10Var);
                                                    continue;
                                                default:
                                                    switch (iIntValue) {
                                                        case -80509:
                                                            this.onSkipToNext = Boolean.TRUE;
                                                            break;
                                                        case -80508:
                                                            this.onStop = Boolean.TRUE;
                                                            break;
                                                        case -80507:
                                                            this.onSkipToPrevious = RtspMessageChannelLoaderCallbackImpl.write(lambdanew5Var, lambdanew10Var);
                                                            break;
                                                        case -80506:
                                                            this.AudioAttributesImplApi26Parcelizer = Boolean.TRUE;
                                                            break;
                                                        case -80505:
                                                            this.MediaBrowserCompatItemReceiver = Integer.valueOf(RtspMessageChannelLoaderCallbackImpl.read(lambdanew5Var, lambdanew10Var));
                                                            break;
                                                        case -80504:
                                                            this.MediaSessionCompatQueueItem = Integer.valueOf(RtspMessageChannelLoaderCallbackImpl.read(lambdanew5Var, lambdanew10Var));
                                                            break;
                                                        case -80503:
                                                            this.onPlayFromSearch = Boolean.TRUE;
                                                            continue;
                                                        default:
                                                            switch (iIntValue) {
                                                                case -80402:
                                                                    this.onSkipToQueueItem = RtspMessageChannelLoaderCallbackImpl.RemoteActionCompatParcelizer(lambdanew5Var, lambdanew10Var);
                                                                    break;
                                                                case -80401:
                                                                    this.onPlayFromUri = RtspMessageChannelLoaderCallbackImpl.RemoteActionCompatParcelizer(lambdanew5Var, lambdanew10Var);
                                                                    break;
                                                                case -80400:
                                                                    this.read = RtspMessageChannelLoaderCallbackImpl.RemoteActionCompatParcelizer(lambdanew5Var, lambdanew10Var);
                                                                    break;
                                                                default:
                                                                    switch (iIntValue) {
                                                                        case -80006:
                                                                            this.onSeekTo = RtspMessageChannelLoaderCallbackImpl.AudioAttributesImplBaseParcelizer(lambdanew5Var, lambdanew10Var);
                                                                            break;
                                                                        case -80005:
                                                                            this.onAddQueueItem = RtspMessageChannelLoaderCallbackImpl.AudioAttributesImplBaseParcelizer(lambdanew5Var, lambdanew10Var);
                                                                            break;
                                                                        default:
                                                                            switch (iIntValue) {
                                                                                case -80003:
                                                                                    this.onMediaButtonEvent = Integer.valueOf(RtspMessageChannelLoaderCallbackImpl.read(lambdanew5Var, lambdanew10Var));
                                                                                    break;
                                                                                case -80002:
                                                                                    this.IconCompatParcelizer = Integer.valueOf(RtspMessageChannelLoaderCallbackImpl.read(lambdanew5Var, lambdanew10Var));
                                                                                    break;
                                                                                case -80001:
                                                                                    this.onRewind = RtspMessageChannelLoaderCallbackImpl.AudioAttributesImplBaseParcelizer(lambdanew5Var, lambdanew10Var);
                                                                                    break;
                                                                                default:
                                                                                    throw new CertificateParsingException("Unknown EAT tag: ".concat(String.valueOf(lambdanew10Var)));
                                                                            }
                                                                            break;
                                                                    }
                                                                    break;
                                                            }
                                                            break;
                                                    }
                                                    break;
                                            }
                                            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = Boolean.TRUE;
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        }
    }

    private static String RemoteActionCompatParcelizer(Collection<String> collection) {
        if (collection == null) {
            return ThemeAlphaConstantsKt.PATH_SEGMENT_ENCODE_SET_URI;
        }
        StringBuilder sb = new StringBuilder("[");
        sb.append(parseSchiFromParent.write(", ").RemoteActionCompatParcelizer(collection));
        sb.append("]");
        return sb.toString();
    }

    public static String IconCompatParcelizer(Date date) {
        return date == null ? "" : DateFormat.getDateTimeInstance().format(date);
    }

    public static String AudioAttributesCompatParcelizer(Set<Integer> set) {
        return set == null ? ThemeAlphaConstantsKt.PATH_SEGMENT_ENCODE_SET_URI : RemoteActionCompatParcelizer((Collection<String>) DefaultSampleValues.write(set, parseProjFromParent.AudioAttributesCompatParcelizer(write, "Unknown")));
    }

    public static String write(Set<Integer> set) {
        return set == null ? ThemeAlphaConstantsKt.PATH_SEGMENT_ENCODE_SET_URI : RemoteActionCompatParcelizer((Collection<String>) DefaultSampleValues.write(set, parseProjFromParent.AudioAttributesCompatParcelizer(AudioAttributesCompatParcelizer, "Unknown")));
    }

    public static String IconCompatParcelizer(Set<Integer> set) {
        return set == null ? ThemeAlphaConstantsKt.PATH_SEGMENT_ENCODE_SET_URI : RemoteActionCompatParcelizer((Collection<String>) DefaultSampleValues.write(set, parseProjFromParent.AudioAttributesCompatParcelizer(RemoteActionCompatParcelizer, "Unknown")));
    }

    public static String RemoteActionCompatParcelizer(int i) {
        if (i == 1) {
            return Constants.ALG_RSA;
        }
        if (i == 3) {
            return "ECDSA";
        }
        if (i == 128) {
            return "HMAC";
        }
        if (i == 32) {
            return "AES";
        }
        if (i == 33) {
            return "3DES";
        }
        StringBuilder sb = new StringBuilder("Unknown (");
        sb.append(i);
        sb.append(")");
        return sb.toString();
    }

    public static String AudioAttributesCompatParcelizer(int i) {
        ArrayList arrayListAudioAttributesCompatParcelizer = parseMehd.AudioAttributesCompatParcelizer();
        if ((i & 2) != 0) {
            arrayListAudioAttributesCompatParcelizer.add("Biometric");
        }
        if ((i & 1) != 0) {
            arrayListAudioAttributesCompatParcelizer.add("Password");
        }
        return RemoteActionCompatParcelizer(arrayListAudioAttributesCompatParcelizer);
    }

    public static String IconCompatParcelizer(int i) {
        if (i == 0) {
            return "Generated";
        }
        if (i == 1) {
            return "Derived";
        }
        if (i == 2) {
            return "Imported";
        }
        if (i == 3) {
            return "Unknown (KM0)";
        }
        if (i == 4) {
            return "Securely Imported";
        }
        StringBuilder sb = new StringBuilder("Unknown (");
        sb.append(i);
        sb.append(")");
        return sb.toString();
    }

    public static String write(Integer num) {
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            return "secp224r1";
        }
        if (iIntValue == 1) {
            return "secp256r1";
        }
        if (iIntValue == 2) {
            return "secp384r1";
        }
        if (iIntValue == 3) {
            return "secp521r1";
        }
        if (iIntValue == 4) {
            return "CURVE_25519";
        }
        StringBuilder sb = new StringBuilder("unknown (");
        sb.append(num);
        sb.append(")");
        return sb.toString();
    }

    public final Integer onSetCaptioningEnabled() {
        return this.onSetRating;
    }

    public final Set<Integer> onPlayFromUri() {
        return this.onRewind;
    }

    public final Integer read() {
        return this.IconCompatParcelizer;
    }

    public final Integer onAddQueueItem() {
        return this.onMediaButtonEvent;
    }

    public final Set<Integer> MediaMetadataCompat() {
        return this.onAddQueueItem;
    }

    public final Set<Integer> onPrepareFromMediaId() {
        return this.onSeekTo;
    }

    public final Integer MediaBrowserCompatSearchResultReceiver() {
        return this.onCommand;
    }

    public final Long onSeekTo() {
        return this.onSetCaptioningEnabled;
    }

    public final Set<Integer> onPause() {
        return this.onFastForward;
    }

    public final Boolean onRemoveQueueItem() {
        return this.onPrepareFromUri;
    }

    public final Boolean RatingCompat() {
        return this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    }

    public final Date AudioAttributesCompatParcelizer() {
        return this.read;
    }

    public final Date onPlayFromMediaId() {
        return this.onPlayFromUri;
    }

    public final Date onStop() {
        return this.onSkipToQueueItem;
    }

    public final Integer onSkipToNext() {
        return this.setSessionImpl;
    }

    public final Boolean onPlay() {
        return this.onPlayFromSearch;
    }

    public final Integer onSkipToQueueItem() {
        return this.MediaSessionCompatQueueItem;
    }

    public final Integer AudioAttributesImplApi26Parcelizer() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public final Boolean RemoteActionCompatParcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public final Boolean onSetPlaybackSpeed() {
        return this.onSkipToPrevious;
    }

    public final Boolean onSetShuffleMode() {
        return this.onStop;
    }

    public final Boolean onSetRepeatMode() {
        return this.onSkipToNext;
    }

    public final Boolean IconCompatParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public final String write() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public final Date AudioAttributesImplApi21Parcelizer() {
        return this.RatingCompat;
    }

    public final Integer onMediaButtonEvent() {
        return this.onPrepareFromSearch;
    }

    public final Boolean onRewind() {
        return this.onRemoveQueueItem;
    }

    public final addMessageLine onRemoveQueueItemAt() {
        return this.onSetPlaybackSpeed;
    }

    public final Integer onPrepareFromSearch() {
        return this.onPrepareFromMediaId;
    }

    public final Integer onPrepare() {
        return this.onPrepare;
    }

    public final processH265FmtpAttribute AudioAttributesImplBaseParcelizer() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final String MediaBrowserCompatItemReceiver() {
        return this.MediaBrowserCompatMediaItem;
    }

    public final String MediaDescriptionCompat() {
        return this.MediaMetadataCompat;
    }

    public final String onPlayFromSearch() {
        return this.onRemoveQueueItemAt;
    }

    public final String onSetRating() {
        return this.onSetRepeatMode;
    }

    public final String onCommand() {
        return this.handleMediaPlayPauseIfPendingOnHandler;
    }

    public final String handleMediaPlayPauseIfPendingOnHandler() {
        return this.onPause;
    }

    public final String MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        return this.onPlay;
    }

    public final String onFastForward() {
        return this.onPlayFromMediaId;
    }

    public final Integer onSkipToPrevious() {
        return this.PlaybackStateCompat;
    }

    public final Integer MediaBrowserCompatCustomActionResultReceiver() {
        return this.MediaBrowserCompatSearchResultReceiver;
    }

    public final Boolean MediaBrowserCompatMediaItem() {
        return this.MediaDescriptionCompat;
    }

    public final Boolean onCustomAction() {
        return this.onCustomAction;
    }

    public final String onPrepareFromUri() {
        return this.onSetShuffleMode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.IconCompatParcelizer != null) {
            sb.append("\nAlgorithm: ");
            sb.append(RemoteActionCompatParcelizer(this.IconCompatParcelizer.intValue()));
        }
        if (this.onMediaButtonEvent != null) {
            sb.append("\nKeySize: ");
            sb.append(this.onMediaButtonEvent);
        }
        Set<Integer> set = this.onRewind;
        if (set != null && !set.isEmpty()) {
            sb.append("\nPurposes: ");
            sb.append(IconCompatParcelizer(this.onRewind));
        }
        Set<Integer> set2 = this.onAddQueueItem;
        if (set2 != null && !set2.isEmpty()) {
            sb.append("\nDigests: ");
            sb.append(write(this.onAddQueueItem));
        }
        Set<Integer> set3 = this.onSeekTo;
        if (set3 != null && !set3.isEmpty()) {
            sb.append("\nPadding modes: ");
            sb.append(AudioAttributesCompatParcelizer(this.onSeekTo));
        }
        if (this.onCommand != null) {
            sb.append("\nEC Curve: ");
            sb.append(write(this.onCommand));
        }
        if (this.onSetCaptioningEnabled != null) {
            sb.append("\nRSA exponent: ");
            sb.append(this.onSetCaptioningEnabled);
        }
        Set<Integer> set4 = this.onFastForward;
        if (set4 != null && !set4.isEmpty()) {
            sb.append("\nRsa Oaep Mgf Digest: ");
            sb.append(write(this.onFastForward));
        }
        if (this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver != null) {
            sb.append("\nEarly boot only");
        }
        if (this.read != null) {
            sb.append("\nActive: ");
            sb.append(IconCompatParcelizer(this.read));
        }
        if (this.onPlayFromUri != null) {
            sb.append("\nOrigination expire: ");
            sb.append(IconCompatParcelizer(this.onPlayFromUri));
        }
        if (this.onSkipToQueueItem != null) {
            sb.append("\nUsage expire: ");
            sb.append(IconCompatParcelizer(this.onSkipToQueueItem));
        }
        if (this.setSessionImpl != null) {
            sb.append("\nUsage count limit: ");
            sb.append(this.setSessionImpl);
        }
        if (this.onPlayFromSearch != null) {
            sb.append("\nNo Auth Required");
        }
        if (this.MediaSessionCompatQueueItem != null) {
            sb.append("\nAuth types: ");
            sb.append(AudioAttributesCompatParcelizer(this.MediaSessionCompatQueueItem.intValue()));
        }
        if (this.MediaBrowserCompatItemReceiver != null) {
            sb.append("\nAuth timeout: ");
            sb.append(this.MediaBrowserCompatItemReceiver);
        }
        if (this.AudioAttributesImplApi26Parcelizer != null) {
            sb.append("\nAllow While On Body");
        }
        if (this.AudioAttributesImplBaseParcelizer != null) {
            sb.append("\nAll Applications");
        }
        if (this.AudioAttributesImplApi21Parcelizer != null) {
            sb.append("\nApplication ID: ");
            sb.append(this.AudioAttributesImplApi21Parcelizer);
        }
        if (this.RatingCompat != null) {
            sb.append("\nCreated: ");
            sb.append(IconCompatParcelizer(this.RatingCompat));
        }
        if (this.onPrepareFromSearch != null) {
            sb.append("\nOrigin: ");
            sb.append(IconCompatParcelizer(this.onPrepareFromSearch.intValue()));
        }
        if (this.onRemoveQueueItem != null) {
            sb.append("\nRollback resistant");
        }
        if (this.onPrepareFromUri != null) {
            sb.append("\nRollback resistance");
        }
        if (this.onSetPlaybackSpeed != null) {
            sb.append("\nRoot of Trust:\n");
            sb.append(this.onSetPlaybackSpeed);
        }
        if (this.onPrepareFromMediaId != null) {
            sb.append("\nOS Version: ");
            sb.append(this.onPrepareFromMediaId);
        }
        if (this.onPrepare != null) {
            sb.append("\nOS Patchlevel: ");
            sb.append(this.onPrepare);
        }
        if (this.PlaybackStateCompat != null) {
            sb.append("\nVendor Patchlevel: ");
            sb.append(this.PlaybackStateCompat);
        }
        if (this.MediaBrowserCompatSearchResultReceiver != null) {
            sb.append("\nBoot Patchlevel: ");
            sb.append(this.MediaBrowserCompatSearchResultReceiver);
        }
        if (this.MediaBrowserCompatCustomActionResultReceiver != null) {
            sb.append("\nAttestation Application Id:\n");
            sb.append(this.MediaBrowserCompatCustomActionResultReceiver);
        }
        if (this.onSkipToPrevious != null) {
            sb.append("\nUser presence required");
        }
        if (this.onStop != null) {
            sb.append("\nConfirmation required");
        }
        if (this.onSkipToNext != null) {
            sb.append("\nUnlocked Device Required");
        }
        if (this.MediaDescriptionCompat != null) {
            sb.append("\nDevice unique attestation");
        }
        if (this.onCustomAction != null) {
            sb.append("\nIdentity Credential Key");
        }
        if (this.MediaBrowserCompatMediaItem != null) {
            sb.append("\nBrand: ");
            sb.append(this.MediaBrowserCompatMediaItem);
        }
        if (this.MediaMetadataCompat != null) {
            sb.append("\nDevice type: ");
            sb.append(this.MediaMetadataCompat);
        }
        if (this.onRemoveQueueItemAt != null) {
            sb.append("\nProduct: ");
            sb.append(this.onRemoveQueueItemAt);
        }
        if (this.onSetRepeatMode != null) {
            sb.append("\nSerial: ");
            sb.append(this.onSetRepeatMode);
        }
        if (this.handleMediaPlayPauseIfPendingOnHandler != null) {
            sb.append("\nIMEI: ");
            sb.append(this.handleMediaPlayPauseIfPendingOnHandler);
        }
        if (this.onSetShuffleMode != null) {
            sb.append("\nSecond IMEI:");
            sb.append(this.onSetShuffleMode);
        }
        if (this.onPause != null) {
            sb.append("\nMEID: ");
            sb.append(this.onPause);
        }
        if (this.onPlay != null) {
            sb.append("\nManufacturer: ");
            sb.append(this.onPlay);
        }
        if (this.onPlayFromMediaId != null) {
            sb.append("\nModel: ");
            sb.append(this.onPlayFromMediaId);
        }
        return sb.toString();
    }
}
